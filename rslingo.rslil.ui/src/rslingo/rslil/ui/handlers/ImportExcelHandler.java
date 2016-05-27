package rslingo.rslil.ui.handlers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import rslingo.rslil.ui.windows.ImportWindow;
import rslingo.rslil.ui.windows.MenuCommand;
import rslingo.rslil.ui.windows.MenuCommandWindow;

public class ImportExcelHandler extends AbstractHandler {

	private static final String GEN_FOLDER = "src-gen";
	private static final String DOCS_FOLDER = "docs";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		FileDialog dialog = new FileDialog(workbenchWindow.getShell(), SWT.OPEN);
		dialog.setFilterExtensions(new String[] { "*.xlsx" });
		dialog.setText("Select the Excel file to upload");
		final String filePath = dialog.open();
		final String fileName = dialog.getFileName();
		
		if (filePath != null) {
			ImportWindow importWindow = new ImportWindow();
			String importMode = importWindow.open();
			
			if (importMode != null) {
				MenuCommand cmd = new MenuCommand() {
					@Override
					public void execute(IProject project, IFile file) throws Exception {
						importExcelAndGenerateFiles(project, filePath, fileName, importMode);
					}
				};
				MenuCommandWindow window = new MenuCommandWindow(workbenchWindow.getShell(),
						cmd, true, null);
				window.open();
			}
		}
		return null;
	}
	
	private void importExcelAndGenerateFiles(IProject project, String filePath,
			String fileName, String importMode) throws Exception {
		IFolder srcGenFolder = project.getFolder(GEN_FOLDER);
        
        if (!srcGenFolder.exists()) {
            srcGenFolder.create(true, true, new NullProgressMonitor());
        }
		
        IFolder docsFolder = srcGenFolder.getFolder(DOCS_FOLDER);
		
		if (!docsFolder.exists()) {
			docsFolder.create(true, true, new NullProgressMonitor());
        }

		importExcelFile(docsFolder, filePath, fileName);
		
		// Remove file extension
		if (fileName.endsWith(".xlsx")) {
			fileName = fileName.split(".xlsx")[0];
		}
		
		if (importMode.equals(ImportWindow.SINGLE)) {
			generateSingleFile(srcGenFolder, filePath, fileName);
		} else {
//			generateMainFile(srcGenFolder, filePath, fileName);
//			generateStatementsFile(srcGenFolder, filePath, fileName);
//			generatePrivateDataFile(srcGenFolder, filePath, fileName);
//			generateServicesFile(srcGenFolder, filePath, fileName);
//			generateEnforcementsFile(srcGenFolder, filePath, fileName);
//			generateRecipientsFile(srcGenFolder, filePath, fileName);
		}
	}
	
	private void importExcelFile(IFolder docsFolder, String filePath, String fileName)
			throws Exception {
		IFile file = docsFolder.getFile(fileName);
		InputStream source = new FileInputStream(new File(filePath));
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, new NullProgressMonitor());
		} else {
			file.setContents(source, IResource.FORCE, new NullProgressMonitor());
		}
	}
	
	private void generateSingleFile(IFolder srcGenFolder, String filePath, String fileName) 
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package-Project " + fileName + " {");
		sb.append("\n");
		sb.append("\n");
		
		generateProjectRegion(wb, sb);
		generateGlossaryRegion(wb, sb);
		generateStakeholdersRegion(wb, sb);
		generateGoalsRegion(wb, sb);
//		generateServicesRegion(wb, sb);
//		generateEnforcementsRegion(wb, sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
		sb.append("}");
		
		IFile file = srcGenFolder.getFile(fileName + ".rslil");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, new NullProgressMonitor());
		} else {
			file.setContents(source, IResource.FORCE, new NullProgressMonitor());
		}
	}
	
	private void generateMainFile(IFolder srcGenFolder, String filePath, String fileName)
		throws Exception {
			StringBuilder sb = new StringBuilder();
			InputStream inp = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(inp);
			sb.append("Package " + fileName + ".Main {");
			sb.append("\n");
			sb.append("\n");
			sb.append("import " + fileName + ".Statements.*");
			sb.append("\n");
			sb.append("import " + fileName + ".Privatedata.*");
			sb.append("\n");
			sb.append("import " + fileName + ".Recipients.*");
			sb.append("\n");
			sb.append("import " + fileName + ".Enforcements.*");
			sb.append("\n");
			sb.append("import " + fileName + ".Services.*");
			sb.append("\n");
			sb.append("\n");
			
//			generateMetadataRegion(wb, sb);
	    	
	    	sb.deleteCharAt(sb.length() - 1);
	    	sb.append("}");
			
			IFile file = srcGenFolder.getFile(fileName + ".Main.rslil");
			InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
			
			if (!file.exists()) {
				file.create(source, IResource.FORCE, null);
			} else {
				file.setContents(source, IResource.FORCE, null);
			}
	}
	
	private void generateStatementsFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Statements {");
		sb.append("\n");
		sb.append("\n");
		sb.append("import " + fileName + ".Privatedata.*");
		sb.append("\n");
		sb.append("import " + fileName + ".Services.*");
		sb.append("\n");
		sb.append("import " + fileName + ".Enforcements.*");
		sb.append("\n");
		sb.append("import " + fileName + ".Recipients.*");
		sb.append("\n");
		sb.append("\n");
		
//		generateStatementsRegion(wb, sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = srcGenFolder.getFile(fileName + ".Statements.rslil");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generatePrivateDataFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Privatedata {");
		sb.append("\n");
		sb.append("\n");
		
//		generatePrivateDataRegion(wb, sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = srcGenFolder.getFile(fileName + ".Privatedata.rslil");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generateServicesFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Services {");
		sb.append("\n");
		sb.append("\n");
		sb.append("import " + fileName + ".Privatedata.*");
		sb.append("\n");
		sb.append("\n");
		
//		generateServicesRegion(wb, sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = srcGenFolder.getFile(fileName + ".Services.rslil");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generateEnforcementsFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Enforcements {");
		sb.append("\n");
		sb.append("\n");
		
//		generateEnforcementsRegion(wb, sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = srcGenFolder.getFile(fileName + ".Enforcements.rslil");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}	
	
	private void generateRecipientsFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package " + fileName + ".Recipients {");
		sb.append("\n");
		sb.append("\n");
		
//		generateRecipientsRegion(wb, sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = srcGenFolder.getFile(fileName + ".Recipients.rslil");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generateProjectRegion(Workbook wb, StringBuilder sb) {
		// Get the Home Sheet
	    Sheet sheet = wb.getSheet("home");
		Iterator<Row> rowIt = sheet.rowIterator();
		// Ignore the Header rows
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
		
    	Row row = rowIt.next();
    	Cell cellId = row.getCell(0);
		String id = formatId(cellId.getStringCellValue());
    	Cell cellName = row.getCell(1);
		String name = cellName.getStringCellValue();
		Cell cellDescription = row.getCell(2);
		String description = cellDescription.getStringCellValue();
		
		sb.append("\tProject " + id + " {");
		sb.append("\n");
		sb.append("\t\tName \"" + name + "\"");
		sb.append("\n");
		sb.append("\t\tDescription \"" + description + "\"");
		sb.append("\n\t}");
		sb.append("\n\n");
	}
	
	private void generateGlossaryRegion(Workbook wb, StringBuilder sb) {
		// Get the Glossary Sheet
	    Sheet sheet = wb.getSheet("glossary");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header rows
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			String id = formatId(cellId.getStringCellValue());
    			
    			if (!id.isEmpty()) {
	    			Cell cellName = row.getCell(1);
		    		String name= cellName.getStringCellValue();
	    			Cell cellDescription = row.getCell(2);
		    		String description = cellDescription.getStringCellValue();
		    		Cell cellType = row.getCell(3);
		    		String type = cellType.getStringCellValue();
		    		
		    		if (type.contains(";")) {
		    			String aux = "";
		    			
						for (String	s : type.split("; ")) {
							aux += toUpperFirst(s);
							aux += ", ";
						}
						type = aux.substring(0, aux.length() - 2);
					} else {
						type = toUpperFirst(type); 
					}
		    		
		    		Cell cellAcronym = row.getCell(4);
		    		String acronym = cellAcronym.getStringCellValue();
		    		Cell cellPOS = row.getCell(5);
		    		String pos = cellPOS.getStringCellValue();
		    		pos = toUpperFirst(pos);
		    		Cell cellSynset = row.getCell(6);
		    		String synset = cellSynset.getStringCellValue();
		    		// Term Relation Type
		    		// Term Relation
		    		
		    		sb.append("\tGlossaryTerm " + id + " {");
		    		sb.append("\n");
		    		
		    		if (!name.isEmpty()) {
		    			sb.append("\t\tName \"" + name + "\"");
			    		sb.append("\n");
					}
		    		
		    		if (!description.isEmpty()) {
		    			sb.append("\t\tDescription \"" + description + "\"");
			    		sb.append("\n");
		    		}
		    		
		    		sb.append("\t\tType " + type);
		    		sb.append("\n");
		    		
		    		if (!acronym.isEmpty()) {
		    			sb.append("\t\tAcronym \"" + acronym + "\"");
			    		sb.append("\n");
		    		}
		    		
		    		if (!pos.isEmpty()) {
		    			sb.append("\t\tPOS " + pos);
			    		sb.append("\n");
		    		}
		    		
		    		if (!synset.isEmpty()) {
			    		sb.append("\t\tSynset \"" + synset + "\"");
	//		    		sb.append("\n");
		    		}
	
		    		// TODO: Add Term Relations
		    		sb.append("\n\t}");
		    		sb.append("\n\n");
    			}
			}
    		else
    			break;
		}
	}
	
	private void generateStakeholdersRegion(Workbook wb, StringBuilder sb) {
		// Get the Stakeholders Sheet
	    Sheet sheet = wb.getSheet("stakeholders");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header rows
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			String id = formatId(cellId.getStringCellValue());
    			Cell cellName = row.getCell(1);
    			String name = cellName.getStringCellValue();
    			Cell cellDescription = row.getCell(2);
    			String description = cellDescription.getStringCellValue();
    			Cell cellType = row.getCell(3);
	    		String type = cellType.getStringCellValue();
	    		String[] aux = type.split("\\.");
	    		type = toUpperFirst(aux[0]) + "." + toUpperFirst(aux[1]); 
    			Cell cellCategory = row.getCell(4);
	    		String category = cellCategory.getStringCellValue();
	    		
	    		if (category.contains(".")) {
	    			aux = category.split("\\.");
	    			
	    			if (aux.length > 2) {
	    				category = toUpperFirst(aux[0]) + "." + toUpperFirst(aux[1])
	    							+ "." + toUpperFirst(aux[2]);
					} else {
						category = toUpperFirst(aux[0]) + "." + toUpperFirst(aux[1]);
					}
				} else {
					category = toUpperFirst(category);
				}
	    		
	    		Cell cellPartOf = row.getCell(5);
	    		String partOf = cellPartOf.getStringCellValue();
	    		
	    		sb.append("\tStakeholder " + id + " {");
	    		sb.append("\n");
	    		
	    		if (!name.isEmpty()) {
	    			sb.append("\t\tName \"" + name + "\"");
		    		sb.append("\n");
				}
	    		
	    		if (!description.isEmpty()) {
	    			sb.append("\t\tDescription \"" + description + "\"");
		    		sb.append("\n");
	    		}
	    		
	    		sb.append("\t\tType " + type);
	    		sb.append("\n");
	    		sb.append("\t\tCategory " + category);
	    		sb.append("\n");
	    		
	    		if (!partOf.isEmpty()) {
	    			sb.append("\t\tPartOf " + partOf);
		    		sb.append("\n");
	    		}
	    		
	    		sb.append("\t}");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
	}
	
	
	private void generateGoalsRegion(Workbook wb, StringBuilder sb) {
		// Get the Goals Sheet
	    Sheet sheet = wb.getSheet("goals");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			String id = formatId(cellId.getStringCellValue());
    			Cell cellName = row.getCell(1);
    			String name = cellName.getStringCellValue();
    			Cell cellDescription = row.getCell(2);
    			String description = cellDescription.getStringCellValue();
    			Cell cellStakeholder = row.getCell(3);
    			String stakeholder = cellStakeholder.getStringCellValue();
    			Cell cellPriority = row.getCell(4);
    			String priority = cellPriority.getStringCellValue();
    			// ComposedBy
    			// DependsOn
	    		
    			sb.append("\tGoal " + id + " {");
	    		sb.append("\n");
	    		
	    		if (!name.isEmpty()) {
	    			sb.append("\t\tName \"" + name + "\"");
		    		sb.append("\n");
				}
	    		
	    		if (!description.isEmpty()) {
	    			sb.append("\t\tDescription \"" + description + "\"");
		    		sb.append("\n");
	    		}
	    		
	    		if (!stakeholder.isEmpty()) {
	    			sb.append("\t\tStakeholder " + stakeholder);
		    		sb.append("\n");
	    		}
	    		
	    		sb.append("\t\tPriority " + priority);
	    		sb.append("\n");
	    		
	    		sb.append("\t}");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
	}

	private String formatId(String id) {
		return id.replaceAll(" ", "_").replaceAll("-", "_");
	}
	
	private String toUpperFirst(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
}
