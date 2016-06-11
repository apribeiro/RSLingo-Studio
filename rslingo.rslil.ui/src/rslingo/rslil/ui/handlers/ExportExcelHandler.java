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

import rslingo.rslil.rSLIL.Constraint;
import rslingo.rslil.rSLIL.Date;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RequirementRelation;
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
						writeGoals(packageProj, workbook);
						writeGoalRelations(packageProj, workbook);
						writeFRs(packageProj, workbook);
						writeQRs(packageProj, workbook);
						writeConstraints(packageProj, workbook);
						writeRequirementRelations(packageProj, workbook);
						// Entities
						writeActors(packageProj, workbook);
						// Use Cases
						
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
	
	private void writeGoals(PackageProject project, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("goals");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "GID").getRow();
		
		for (Goal goal : project.getGoals()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "GID", goal.getName());
			
			if (goal.getNameAlias() != null) {
				DocumentHelper.replaceText(nRow, "GNAME", goal.getNameAlias());
			} else {
				DocumentHelper.replaceText(nRow, "GNAME", "");
			}
			
			if (goal.getDescription() != null) {
				DocumentHelper.replaceText(nRow, "GDESCRIPTION", goal.getDescription());
			} else {
				DocumentHelper.replaceText(nRow, "GDESCRIPTION", "");
			}
			
			DocumentHelper.replaceText(nRow, "GSTAKEHOLDER", goal.getStakeholder().getName());
			DocumentHelper.replaceText(nRow, "GPRIORITY", goal.getPriority().getValue());
			
			if (goal.getPartOfAnd() != null) {
				DocumentHelper.replaceText(nRow, "GPARTOFAND", goal.getPartOfAnd().getName());
			} else {
				DocumentHelper.replaceText(nRow, "GPARTOFAND", "");
			}
			
			
			if (goal.getPartOfOr() != null) {
				DocumentHelper.replaceText(nRow, "GPARTOFOR", goal.getPartOfOr().getName());
			} else {
				DocumentHelper.replaceText(nRow, "GPARTOFOR", "");
			}
			
			if (goal.getProgress() != null) {
				DocumentHelper.replaceText(nRow, "GPROGRESS", goal.getProgress().getValue());
			} else {
				DocumentHelper.replaceText(nRow, "GPROGRESS", "");
			}
		}
		
		// Delete the Template Row
		if (project.getGoals().size() > 0) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void writeGoalRelations(PackageProject project, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("goals.relations");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "GRSRCID").getRow();
		
		for (SystemRelation relation : project.getSystemRelations()) {
			XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
			DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
			
			DocumentHelper.replaceText(nRow, "GRSRCID", relation.getSource().getName());
			
			if (relation.getSource().getNameAlias() != null) {
				DocumentHelper.replaceText(nRow, "GRSRCNAME", relation.getSource().getNameAlias());
			} else {
				DocumentHelper.replaceText(nRow, "GRSRCNAME", "");
			}
			
			DocumentHelper.replaceText(nRow, "GRTGTID", relation.getTarget().getName());
			
			if (relation.getTarget().getNameAlias() != null) {
				DocumentHelper.replaceText(nRow, "GRTGTNAME", relation.getTarget().getNameAlias());
			} else {
				DocumentHelper.replaceText(nRow, "GRTGTNAME", "");
			}
			
			DocumentHelper.replaceText(nRow, "GRTYPE", relation.getType());
			
			if (relation.getDescription() != null) {
				DocumentHelper.replaceText(nRow, "GRDESCRIPTION", relation.getDescription());
			} else {
				DocumentHelper.replaceText(nRow, "GRDESCRIPTION", "");
			}
		}
		
		// Delete the Template Row
		if (project.getGoalRelations().size() > 0) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void writeFRs(PackageProject project, XSSFWorkbook workbook) {
		boolean hasFRs = false;
		XSSFSheet sheet = workbook.getSheet("reqs.functional");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "FRID").getRow();
		
		for (PackageSystem pSystem : project.getPackageSystems()) {
			for (FR fr : pSystem.getFrs()) {
				hasFRs = true;
				XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
				DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
				
				DocumentHelper.replaceText(nRow, "FRID", fr.getName());
				
				if (fr.getNameAlias() != null) {
					DocumentHelper.replaceText(nRow, "FRNAME", fr.getNameAlias());
				} else {
					DocumentHelper.replaceText(nRow, "FRNAME", "");
				}
				
				if (fr.getDescription() != null) {
					DocumentHelper.replaceText(nRow, "FRDESCRIPTION", fr.getDescription());
				} else {
					DocumentHelper.replaceText(nRow, "FRDESCRIPTION", "");
				}
				
				DocumentHelper.replaceText(nRow, "FRTYPE", fr.getType());
				
				if (fr.getStakeholder() != null) {
					DocumentHelper.replaceText(nRow, "FRSTAKEHOLDER", fr.getStakeholder().getName());
				} else {
					DocumentHelper.replaceText(nRow, "FRSTAKEHOLDER", "");
				}
				
				DocumentHelper.replaceText(nRow, "FRPRIORITY", fr.getPriority().getValue());
				
				if (fr.getPartOf() != null) {
					DocumentHelper.replaceText(nRow, "FRPARTOF", fr.getPartOf().getName());
				} else {
					DocumentHelper.replaceText(nRow, "FRPARTOF", "");
				}
				
				if (fr.getProgress() != null) {
					DocumentHelper.replaceText(nRow, "FRPROGRESS", fr.getProgress().getValue());
				} else {
					DocumentHelper.replaceText(nRow, "FRPROGRESS", "");
				}
			}
		}
		
		// Delete the Template Row
		if (hasFRs) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void writeQRs(PackageProject project, XSSFWorkbook workbook) {
		boolean hasQRs = false;
		XSSFSheet sheet = workbook.getSheet("reqs.quality");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "QRID").getRow();
		
		for (PackageSystem pSystem : project.getPackageSystems()) {
			for (QR qr : pSystem.getQrs()) {
				hasQRs = true;
				XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
				DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
				
				DocumentHelper.replaceText(nRow, "QRID", qr.getName());
				
				if (qr.getNameAlias() != null) {
					DocumentHelper.replaceText(nRow, "QRNAME", qr.getNameAlias());
				} else {
					DocumentHelper.replaceText(nRow, "QRNAME", "");
				}
				
				if (qr.getDescription() != null) {
					DocumentHelper.replaceText(nRow, "QRDESCRIPTION", qr.getDescription());
				} else {
					DocumentHelper.replaceText(nRow, "QRDESCRIPTION", "");
				}
				
				DocumentHelper.replaceText(nRow, "QRTYPE", qr.getType());
				
				if (qr.getSubType() != null) {
					DocumentHelper.replaceText(nRow, "QRSUBTYPE", qr.getSubType());
				} else {
					DocumentHelper.replaceText(nRow, "QRSUBTYPE", "");
				}
				
				DocumentHelper.replaceText(nRow, "QRMETRIC", qr.getMetric());
				DocumentHelper.replaceText(nRow, "QRVALUE", Integer.toString(qr.getValue()));
				
				if (qr.getStakeholder() != null) {
					DocumentHelper.replaceText(nRow, "QRSTAKEHOLDER", qr.getStakeholder().getName());
				} else {
					DocumentHelper.replaceText(nRow, "QRSTAKEHOLDER", "");
				}
				
				DocumentHelper.replaceText(nRow, "QRPRIORITY", qr.getPriority().getValue());
				
				if (qr.getPartOf() != null) {
					DocumentHelper.replaceText(nRow, "QRPARTOF", qr.getPartOf().getName());
				} else {
					DocumentHelper.replaceText(nRow, "QRPARTOF", "");
				}
				
				if (qr.getProgress() != null) {
					DocumentHelper.replaceText(nRow, "QRPROGRESS", qr.getProgress().getValue());
				} else {
					DocumentHelper.replaceText(nRow, "QRPROGRESS", "");
				}
			}
		}
		
		// Delete the Template Row
		if (hasQRs) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void writeConstraints(PackageProject project, XSSFWorkbook workbook) {
		boolean hasConstraints = false;
		XSSFSheet sheet = workbook.getSheet("reqs.constraint");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "CID").getRow();
		
		for (PackageSystem pSystem : project.getPackageSystems()) {
			for (Constraint constraint : pSystem.getConstraints()) {
				hasConstraints = true;
				XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
				DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
				
				DocumentHelper.replaceText(nRow, "CID", constraint.getName());
				
				if (constraint.getNameAlias() != null) {
					DocumentHelper.replaceText(nRow, "CNAME", constraint.getNameAlias());
				} else {
					DocumentHelper.replaceText(nRow, "CNAME", "");
				}
				
				if (constraint.getDescription() != null) {
					DocumentHelper.replaceText(nRow, "CDESCRIPTION", constraint.getDescription());
				} else {
					DocumentHelper.replaceText(nRow, "CDESCRIPTION", "");
				}
				
				DocumentHelper.replaceText(nRow, "CTYPE", constraint.getType());
				
				if (constraint.getStakeholder() != null) {
					DocumentHelper.replaceText(nRow, "CSTAKEHOLDER", constraint.getStakeholder().getName());
				} else {
					DocumentHelper.replaceText(nRow, "CSTAKEHOLDER", "");
				}
				
				DocumentHelper.replaceText(nRow, "CPRIORITY", constraint.getPriority().getValue());
				
				if (constraint.getPartOf() != null) {
					DocumentHelper.replaceText(nRow, "CPARTOF", constraint.getPartOf().getName());
				} else {
					DocumentHelper.replaceText(nRow, "CPARTOF", "");
				}
				
				if (constraint.getProgress() != null) {
					DocumentHelper.replaceText(nRow, "CPROGRESS", constraint.getProgress().getValue());
				} else {
					DocumentHelper.replaceText(nRow, "CPROGRESS", "");
				}
			}
		}
		
		// Delete the Template Row
		if (hasConstraints) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void writeRequirementRelations(PackageProject project, XSSFWorkbook workbook) {
		boolean hasRelations = false;
		XSSFSheet sheet = workbook.getSheet("reqs.relations");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "RRID").getRow();
		
		for (PackageSystem pSystem : project.getPackageSystems()) {
			for (RequirementRelation relation : pSystem.getRequirementRelations()) {
				hasRelations = true;
				XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
				DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
				
				DocumentHelper.replaceText(nRow, "RRSRCID", relation.getSource().getName());
				
				if (relation.getSource().getNameAlias() != null) {
					DocumentHelper.replaceText(nRow, "RRSRCNAME", relation.getSource().getNameAlias());
				} else {
					DocumentHelper.replaceText(nRow, "RRSRCNAME", "");
				}
				
				DocumentHelper.replaceText(nRow, "RRTGTID", relation.getTarget().getName());
				
				if (relation.getTarget().getNameAlias() != null) {
					DocumentHelper.replaceText(nRow, "RRTGTNAME", relation.getTarget().getNameAlias());
				} else {
					DocumentHelper.replaceText(nRow, "RRTGTNAME", "");
				}
				
				DocumentHelper.replaceText(nRow, "RRTYPE", relation.getType());
				
				if (relation.getDescription() != null) {
					DocumentHelper.replaceText(nRow, "RRDESCRIPTION", relation.getDescription());
				} else {
					DocumentHelper.replaceText(nRow, "RRDESCRIPTION", "");
				}
			}
		}
		
		// Delete the Template Row
		if (hasRelations) {
			sheet.shiftRows(tRow.getRowNum() + 1, sheet.getLastRowNum(), -1);
		}
	}
	
	private void writeActors(PackageProject project, XSSFWorkbook workbook) {
		boolean hasConstraints = false;
		XSSFSheet sheet = workbook.getSheet("actors");
		XSSFRow tRow = (XSSFRow) DocumentHelper.getCell(sheet, "CID").getRow();
		
		for (PackageSystem pSystem : project.getPackageSystems()) {
			for (Constraint constraint : pSystem.getConstraints()) {
				hasConstraints = true;
				XSSFRow nRow = sheet.createRow(sheet.getLastRowNum() + 1);
				DocumentHelper.cloneRow(workbook, sheet, nRow, tRow);
				
				DocumentHelper.replaceText(nRow, "CID", constraint.getName());
				
				if (constraint.getNameAlias() != null) {
					DocumentHelper.replaceText(nRow, "CNAME", constraint.getNameAlias());
				} else {
					DocumentHelper.replaceText(nRow, "CNAME", "");
				}
				
				if (constraint.getDescription() != null) {
					DocumentHelper.replaceText(nRow, "CDESCRIPTION", constraint.getDescription());
				} else {
					DocumentHelper.replaceText(nRow, "CDESCRIPTION", "");
				}
				
				DocumentHelper.replaceText(nRow, "CTYPE", constraint.getType());
				
				if (constraint.getStakeholder() != null) {
					DocumentHelper.replaceText(nRow, "CSTAKEHOLDER", constraint.getStakeholder().getName());
				} else {
					DocumentHelper.replaceText(nRow, "CSTAKEHOLDER", "");
				}
				
				DocumentHelper.replaceText(nRow, "CPRIORITY", constraint.getPriority().getValue());
				
				if (constraint.getPartOf() != null) {
					DocumentHelper.replaceText(nRow, "CPARTOF", constraint.getPartOf().getName());
				} else {
					DocumentHelper.replaceText(nRow, "CPARTOF", "");
				}
				
				if (constraint.getProgress() != null) {
					DocumentHelper.replaceText(nRow, "CPROGRESS", constraint.getProgress().getValue());
				} else {
					DocumentHelper.replaceText(nRow, "CPROGRESS", "");
				}
			}
		}
		
		// Delete the Template Row
		if (hasConstraints) {
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
