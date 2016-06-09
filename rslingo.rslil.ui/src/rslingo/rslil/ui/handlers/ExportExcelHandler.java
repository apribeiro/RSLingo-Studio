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

import rslingo.rslil.rSLIL.Date;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.SystemRelation;
import rslingo.rslil.rSLIL.TermType;
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
					

					try {
						InputStream from = new FileInputStream(RSLINGO_PATH + DEF_WORD_PATH);
						XSSFWorkbook workbook = new XSSFWorkbook(from);

						// TODO: Write Sheets
						writeProject(packageProj.getProject(), workbook);
						writeSystems(packageProj, workbook);
						writeSystemRelations(packageProj, workbook);
						writeGlossary(packageProj, workbook);
						writeStakeholders(packageProj, workbook);

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
			}
	    };
	    job.setUser(true);
	    job.schedule();
	}
	
	private void writeProject(Project project, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("project");
		XSSFRow rowId = (XSSFRow) DocumentHelper.getCell(sheet, "PID").getRow();
		DocumentHelper.replaceText(rowId, "PID", project.getName());
		
		XSSFRow rowName = (XSSFRow) DocumentHelper.getCell(sheet, "PNAME").getRow();
		
		if (project.getNameAlias() != null) {
			DocumentHelper.replaceText(rowName, "PNAME", project.getNameAlias());
		} else {
			DocumentHelper.replaceText(rowName, "PNAME", "");
		}
		
		XSSFRow rowType = (XSSFRow) DocumentHelper.getCell(sheet, "PTYPE").getRow();
		DocumentHelper.replaceText(rowType, "PTYPE", project.getType());
		XSSFRow rowDomain = (XSSFRow) DocumentHelper.getCell(sheet, "PDOMAIN").getRow();
		DocumentHelper.replaceText(rowDomain, "PDOMAIN", project.getDomain());

		Cell cellPStart = DocumentHelper.getCell(sheet, "PPSTART");
		Cell cellPEnd = DocumentHelper.getCell(sheet, "PPEND");
		
		if (project.getPlanned() != null) {
			setDateCell(project.getPlanned().getStart(), workbook, cellPStart);
			setDateCell(project.getPlanned().getEnd(), workbook, cellPEnd);
		} else {
			cellPStart.setCellValue("");
			cellPEnd.setCellValue("");
		}
		
		Cell cellAStart = DocumentHelper.getCell(sheet, "PASTART");
		Cell cellAEnd = DocumentHelper.getCell(sheet, "PAEND");
		
		if (project.getActual() != null) {
			setDateCell(project.getActual().getStart(), workbook, cellAStart);
			
			if (project.getActual().getEnd() != null) {
				setDateCell(project.getActual().getEnd(), workbook, cellAEnd);
			} else {
				cellAEnd.setCellValue("");
			}
		} else {
			cellAStart.setCellValue("");
			cellAEnd.setCellValue("");
		}
		
		XSSFRow rowCustomer = (XSSFRow) DocumentHelper.getCell(sheet, "PCUSTOMER").getRow();
		XSSFRow rowSupplier = (XSSFRow) DocumentHelper.getCell(sheet, "PSUPPLIER").getRow();
		XSSFRow rowPartners = (XSSFRow) DocumentHelper.getCell(sheet, "PPARTNERS").getRow();
		
		if (project.getOrganizations() != null) {
			DocumentHelper.replaceText(rowCustomer, "PCUSTOMER",
				project.getOrganizations().getCustomer());			
			DocumentHelper.replaceText(rowSupplier, "PSUPPLIER",
				project.getOrganizations().getSupplier());
			DocumentHelper.replaceText(rowPartners, "PPARTNERS",
				project.getOrganizations().getPartners());
		} else {
			DocumentHelper.replaceText(rowCustomer, "PCUSTOMER", "");
			DocumentHelper.replaceText(rowSupplier, "PSUPPLIER", "");
			DocumentHelper.replaceText(rowPartners, "PPARTNERS", "");
		}
		
		XSSFRow rowProgress = (XSSFRow) DocumentHelper.getCell(sheet, "PPROGRESS").getRow();
		
		if (project.getProgress() != null) {
			DocumentHelper.replaceText(rowProgress, "PPROGRESS", project.getProgress().getValue());
		} else {
			DocumentHelper.replaceText(rowProgress, "PPROGRESS", "");
		}
		
		XSSFRow rowSummary = (XSSFRow) DocumentHelper.getCell(sheet, "PSUMMARY").getRow();
		DocumentHelper.replaceText(rowSummary, "PSUMMARY", project.getSummary());
		
		XSSFRow rowDescription = (XSSFRow) DocumentHelper.getCell(sheet, "PDESCRIPTION").getRow();
		DocumentHelper.replaceText(rowDescription, "PDESCRIPTION", project.getDescription());
	}

	private void writeSystems(PackageProject project, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("systems");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "SID").getRow();
		
		for (PackageSystem packageSystem : project.getPackageSystems()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			rslingo.rslil.rSLIL.System system = packageSystem.getSystem();
			DocumentHelper.replaceText(nRow, "SID", system.getName());
			
			if (system.getNameAlias() != null) {
				DocumentHelper.replaceText(nRow, "SNAME", system.getNameAlias());
			} else {
				DocumentHelper.replaceText(nRow, "SNAME", "");
			}
			
			if (system.getDescription() != null) {
				DocumentHelper.replaceText(nRow, "SDESCRIPTION", system.getDescription());
			} else {
				DocumentHelper.replaceText(nRow, "SDESCRIPTION", "");
			}
			
			DocumentHelper.replaceText(nRow, "STYPE", system.getType());
			DocumentHelper.replaceText(nRow, "SSCOPE", system.getScope());
			
			if (system.getPartOf() != null) {
				DocumentHelper.replaceText(nRow, "SPARTOF", system.getPartOf().getName());
			} else {
				DocumentHelper.replaceText(nRow, "SPARTOF", "");
			}
		}
		
		// Delete the Template Row
		if (project.getPackageSystems().size() > 0) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void writeSystemRelations(PackageProject project, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("systems.relations");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "SRSOURCE").getRow();
		
		for (SystemRelation relation : project.getSystemRelations()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "SRSOURCE", relation.getSource().getName());
			DocumentHelper.replaceText(nRow, "SRTARGET", relation.getTarget().getName());
			DocumentHelper.replaceText(nRow, "SRCATEGORY", relation.getCategory());
			DocumentHelper.replaceText(nRow, "SRTYPE", relation.getType());
			
			if (relation.getDescription() != null) {
				DocumentHelper.replaceText(nRow, "SRDESCRIPTION", relation.getDescription());
			} else {
				DocumentHelper.replaceText(nRow, "SRDESCRIPTION", "");
			}
		}
		
		// Delete the Template Row
		if (project.getSystemRelations().size() > 0) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void writeGlossary(PackageProject project, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("glossary");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "GTID").getRow();
		
		for (GlossaryTerm term : project.getGlossaryTerms()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "GTID", term.getName());
			
			if (term.getNameAlias() != null) {
				DocumentHelper.replaceText(nRow, "GTNAME", term.getNameAlias());
			} else {
				DocumentHelper.replaceText(nRow, "GTNAME", "");
			}
			
			if (term.getDescription() != null) {
				DocumentHelper.replaceText(nRow, "GTDESCRIPTION", term.getDescription());
			} else {
				DocumentHelper.replaceText(nRow, "GTDESCRIPTION", "");
			}
			
			String type = term.getType().getRefType().getType();
			
			for (TermType termType : term.getType().getRefs()) {
				type += "; " + termType.getType();
			}
			DocumentHelper.replaceText(nRow, "GTTYPE", type);
			
			if (term.getAcronym() != null) {
				DocumentHelper.replaceText(nRow, "GTACRONYM", term.getAcronym());
			} else {
				DocumentHelper.replaceText(nRow, "GTACRONYM", "");
			}
			
			if (term.getPos() != null) {
				DocumentHelper.replaceText(nRow, "GTPOS", term.getPos());
			} else {
				DocumentHelper.replaceText(nRow, "GTPOS", "");
			}
			
			if (term.getSynonym() != null) {
				DocumentHelper.replaceText(nRow, "GTSYNONYM", term.getSynonym());
			} else {
				DocumentHelper.replaceText(nRow, "GTSYNONYM", "");
			}
			
			if (term.getHypernym() != null) {
				DocumentHelper.replaceText(nRow, "GTHYPERNYM", term.getHypernym());
			} else {
				DocumentHelper.replaceText(nRow, "GTHYPERNYM", "");
			}
		}
		
		// Delete the Template Row
		if (project.getGlossaryTerms().size() > 0) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void writeStakeholders(PackageProject project, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("stakeholders");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "STKID").getRow();
		
		for (Stakeholder stakeholder : project.getStakeholders()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "STKID", stakeholder.getName());
			
			if (stakeholder.getNameAlias() != null) {
				DocumentHelper.replaceText(nRow, "STKNAME", stakeholder.getNameAlias());
			} else {
				DocumentHelper.replaceText(nRow, "STKNAME", "");
			}
			
			if (stakeholder.getDescription() != null) {
				DocumentHelper.replaceText(nRow, "STKDESCRIPTION", stakeholder.getDescription());
			} else {
				DocumentHelper.replaceText(nRow, "STKDESCRIPTION", "");
			}
			
			DocumentHelper.replaceText(nRow, "STKTYPE", stakeholder.getType());
			DocumentHelper.replaceText(nRow, "STKCATEGORY", stakeholder.getCategory());
			
			if (stakeholder.getIsA() != null) {
				DocumentHelper.replaceText(nRow, "STKISA", stakeholder.getIsA().getName());
			} else {
				DocumentHelper.replaceText(nRow, "STKISA", "");
			}
			
			if (stakeholder.getPartOf() != null) {
				DocumentHelper.replaceText(nRow, "STKPARTOF", stakeholder.getPartOf().getName());
			} else {
				DocumentHelper.replaceText(nRow, "STKPARTOF", "");
			}
		}
		
		// Delete the Template Row
		if (project.getStakeholders().size() > 0) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void setDateCell(Date date, XSSFWorkbook workbook, Cell cellDate) {
		String dateVal = date.getDay() + "-"
				+ DocumentHelper.getNumberOfRSLILMonth(date.getMonth().getName())
				+ "-" + date.getYear();
		XSSFCreationHelper createHelper = workbook.getCreationHelper();
		XSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-mmm-yyyy"));
		cellDate.setCellValue(DocumentHelper.parseDate(dateVal));
		cellDate.setCellStyle(cellStyle);
	}
}
