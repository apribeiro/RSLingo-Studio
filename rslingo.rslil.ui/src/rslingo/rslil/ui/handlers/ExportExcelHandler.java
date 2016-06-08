package rslingo.rslil.ui.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;

import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.ui.windows.MenuCommand;
import rslingo.rslil.ui.windows.MenuCommandWindow;

public class ExportExcelHandler extends AbstractHandler {

	private static final String PLUGIN_ID = "rslingo.rslil";
	private static final String GEN_FOLDER = "src-gen";
	private static final String DOCS_FOLDER = "docs";
	private static final String FILE_EXT = ".rslil";
	private static final String DEF_WORD_PATH = "RSL-IL-ExcelTemplate.xlsx";

	private final String RSLINGO_PATH = Platform.getInstallLocation()
			.getURL().getPath().substring(1)
			+ "RSLingo/";
	
	@Inject
    IResourceSetProvider resourceSetProvider;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		Shell shell = workbenchWindow.getShell();
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		
		// Check if the command was triggered using the ContextMenu
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				IFile file = (IFile) structuredSelection.getFirstElement();
				generateExcel(file, shell);
			} else {
				IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
				IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
				generateExcel(file, shell);
			}
		} else {
			MenuCommand cmd = new MenuCommand() {
				@Override
				public void execute(IProject project, IFile file) {
					generateExcel(file, shell);
				}
			};
			MenuCommandWindow window = new MenuCommandWindow(shell, cmd, false, FILE_EXT);
			window.open();
		}
		
		return null;
	}

	private void generateExcel(IFile file, Shell shell) {
		IProject project = file.getProject();
		IFolder srcGenFolder = project.getFolder(GEN_FOLDER);

		try {
			if (!srcGenFolder.exists()) {
				srcGenFolder.create(true, true, new NullProgressMonitor());
			}

			IFolder docsFolder = srcGenFolder.getFolder(DOCS_FOLDER);

			if (!docsFolder.exists()) {
				docsFolder.create(true, true, new NullProgressMonitor());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Start a new Thread to avoid blocking the UI
		Job job = new Job("Exporting to Excel...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				//URI.createURI("platform:/resource/rslingo.rslil/src/example.rslil"), true);
		        ResourceSet resourceSet = resourceSetProvider.get(project);
		        Resource resource = resourceSet.getResource(uri, true);
		        if (resource.getContents().get(0) instanceof PackageProject) {
		        	PackageProject packageProj = (PackageProject) resource.getContents().get(0);
				
					// Deal with the Main file mode
					if (packageProj.getImports().size() > 0
						&& packageProj.getPackageSystems().size() == 0) {
						packageProj = DocumentHelper.getFullPackageProject(project, resourceSet, packageProj);
					}
				} else {
					shell.getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "You should run this command using the Main file associated to this file!";
							MessageDialog errorDialog = new MessageDialog(shell, "RSLingo Studio",
						    		null, message, MessageDialog.ERROR, new String[] { "OK" }, 0);
						    errorDialog.open();
						}
					});
				    return Status.OK_STATUS;
				}

				try {
					InputStream from = new FileInputStream(RSLINGO_PATH + DEF_WORD_PATH);
					XSSFWorkbook workbook = new XSSFWorkbook(from);

					// TODO: Write Sheets
//					writeMetadata(policy.getMetadata(), workbook);
//					writePrivateData(policy, workbook);

					// Write the Document in file system
					String fileName = file.getName().split(FILE_EXT)[0];
					File to = new File(project.getLocation().toOSString()
							+ "/" + GEN_FOLDER + "/" + DOCS_FOLDER 
							+ "/" + fileName + ".xlsx");
					FileOutputStream out = new FileOutputStream(to);
					workbook.write(out);
					out.close();
					workbook.close();

					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

					System.out.println(fileName + ".xlsx generated!");
				} catch (Exception e) {
					return new Status(Status.ERROR, PLUGIN_ID, e.getMessage(), e);
				}
				return Status.OK_STATUS;
			}
	    };
	    job.setUser(true);
	    job.schedule();
	}
	
	/*private void writeMetadata(Metadata metadata, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Home");
		XSSFRow rowName = (XSSFRow) DocumentHelper.getCell(sheet, "HPolicyName").getRow();
		DocumentHelper.replaceText(rowName, "HPolicyName", metadata.getName());
		XSSFRow rowDescription = (XSSFRow) DocumentHelper.getCell(sheet, "HDescription").getRow();
		DocumentHelper.replaceText(rowDescription, "HDescription", metadata.getDescription());
		XSSFRow rowAuthors = (XSSFRow) DocumentHelper.getCell(sheet, "HAuthors").getRow();
		DocumentHelper.replaceText(rowAuthors, "HAuthors", metadata.getAuthors());
		XSSFRow rowOrgs = (XSSFRow) DocumentHelper.getCell(sheet, "HOrganizations").getRow();
		DocumentHelper.replaceText(rowOrgs, "HOrganizations", metadata.getOrganizations());

		// Set Date cell and apply style
		Cell cellDate = DocumentHelper.getCell(sheet, "HDate");
		Date date = metadata.getDate();
		String dateVal = date.getDay() + "-"
				+ DocumentHelper.getNumberOfRSLILMonth(date.getMonth().getName())
				+ "-" + date.getYear();
		XSSFCreationHelper createHelper = workbook.getCreationHelper();
		XSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yyyy"));
		cellDate.setCellValue(DocumentHelper.parseDate(dateVal));
		cellDate.setCellStyle(cellStyle);
		
		XSSFRow rowVersion = (XSSFRow) DocumentHelper.getCell(sheet, "HVersion").getRow();
		DocumentHelper.replaceText(rowVersion, "HVersion", metadata.getVersion());
	}

	private void writePrivateData(Policy policy, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("PrivateData");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "PDId").getRow();
		
		for (PrivateData privateData : policy.getPrivateData()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "PDId", privateData.getName());

			String type = privateData.getType();
			
			if (type.equals("PersonalInformation")) {
				type = "Personal Information";
			} else {
				type = "Usage Information";
			}
			
			DocumentHelper.replaceText(nRow, "PDType", type);
			DocumentHelper.replaceText(nRow, "PDDescription", privateData.getDescription());
			
			if (privateData.getAttribute().size() > 0) {
				StringBuilder attributes = new StringBuilder();
				
				for (Attribute attr : privateData.getAttribute()) {
					attributes.append(attr.getName());
					attributes.append(", ");
				}
				attributes.delete(attributes.length() - 2, attributes.length());
				
				DocumentHelper.replaceText(nRow, "PDAttributes", attributes.toString());
			} else {
				DocumentHelper.replaceText(nRow, "PDAttributes", "");
			}
		}
		
		// Delete the Template Row
		sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
	}*/
}
