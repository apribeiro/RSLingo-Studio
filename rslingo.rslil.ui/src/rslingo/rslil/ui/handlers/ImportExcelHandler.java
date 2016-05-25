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
//		generatePrivateDataRegion(wb, sb);
//		generateRecipientsRegion(wb, sb);
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
		
		generatePrivateDataRegion(wb, sb);
    	
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
		
		generateServicesRegion(wb, sb);
    	
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
		
		generateEnforcementsRegion(wb, sb);
    	
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
		
		generateRecipientsRegion(wb, sb);
    	
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
    			Cell cellName = row.getCell(1);
	    		String name= cellName.getStringCellValue();
    			Cell cellDescription = row.getCell(2);
	    		String description = cellDescription.getStringCellValue();
	    		Cell cellType = row.getCell(3);
	    		String type = cellType.getStringCellValue();
	    		Cell cellAcronym = row.getCell(4);
	    		String acronym = cellAcronym.getStringCellValue();
	    		Cell cellPOS = row.getCell(5);
	    		String pos = cellPOS.getStringCellValue();
	    		Cell cellSynset = row.getCell(6);
	    		String synset = cellSynset.getStringCellValue();
	    		// Term Relation Type
	    		// Term Relation
	    		
	    		sb.append("\tGlossaryTerm " + id + " {");
	    		sb.append("\n");
	    		sb.append("\t\tName \"" + name + "\"");
	    		sb.append("\n");
	    		sb.append("\t\tDescription \"" + description + "\"");
	    		sb.append("\n");
	    		sb.append("\t\tType \"" + type + "\"");
	    		sb.append("\n");
	    		sb.append("\t\tAcronym \"" + acronym + "\"");
	    		sb.append("\n");
	    		sb.append("\t\tPOS \"" + pos + "\"");
	    		sb.append("\n");
	    		sb.append("\t\tSynset \"" + synset + "\"");
//	    		sb.append("\n");
	    		// TODO: Add Term Relations
	    		sb.append("\n\t}");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
	}
	
	private void generatePrivateDataRegion(Workbook wb, StringBuilder sb) {
		// Get the Private Data Sheet
	    Sheet sheet = wb.getSheet("PrivateData");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			int id = (int) cellId.getNumericCellValue();
    			Cell cellType = row.getCell(1);
	    		String type = cellType.getStringCellValue().replaceAll(" ", "");
    			Cell cellDescription = row.getCell(2);
	    		String description = cellDescription.getStringCellValue();
	    		Cell cellAttributes = row.getCell(3);
	    		String attributes = cellAttributes.getStringCellValue();
	    		sb.append("PrivateData PD" + id + " {");
	    		sb.append("\n");
	    		sb.append("\tDescription \"" + description + "\"");
	    		sb.append("\n");
	    		sb.append("\tType " + type);
	    		sb.append("\n");
	    		
	    		for (String a : attributes.split(",\n")) {
	    			a = a.substring(0, 1).toUpperCase() + a.substring(1);
	    			sb.append("\tAttribute \"" + a + "\" {");
	    			sb.append("\n");
	    			sb.append("\t\tDescription \"" + a + "\"");
	    			sb.append("\n\t}");
	    			sb.append("\n");
				}
	    		// Delete last '\n'
//	    		sb.deleteCharAt(sb.length() - 2);
	    		sb.deleteCharAt(sb.length() - 1);
	    		sb.append("\n}");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
	}
	
	private void generateServicesRegion(Workbook wb, StringBuilder sb) {
		// Get the Services Sheet
	    Sheet sheet = wb.getSheet("Services");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			int id = (int) cellId.getNumericCellValue();
    			Cell cellName = row.getCell(1);
	    		String name = cellName.getStringCellValue();
	    		Cell cellDescription = row.getCell(2);
	    		String description = cellDescription.getStringCellValue();
	    		Cell cellPrivateData = row.getCell(3);
	    		Cell cellPartOf = row.getCell(4);
	    		sb.append("Service S" + id + " {");
	    		sb.append("\n");
	    		sb.append("\tName \"" + name + "\"");
	    		sb.append("\n");
	    		sb.append("\tDescription \"" + description + "\"");
	    		sb.append("\n");
	    		
	    		if (cellPrivateData.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	    			int privateData = (int) cellPrivateData.getNumericCellValue();
	    			sb.append("\tRefersTo PrivateData PD" + privateData);
	    			sb.append("\n");
				} else if (cellPrivateData.getCellType() == Cell.CELL_TYPE_STRING) {
					String privateData = cellPrivateData.getStringCellValue();
					
					if (privateData.equals("All")) {
						sb.append("\tRefersTo PrivateData All");
					} else {
						sb.append("\tRefersTo PrivateData ");
			    		
		    			for (String s : privateData.split(", ")) {
		    				sb.append("PD" + s + ",");
						}
		    			// Delete last ','
		    			sb.deleteCharAt(sb.length() - 1);
					}
					sb.append("\n");
				}
	    		
	    		if (cellPartOf.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	    			int partOf = (int) cellPartOf.getNumericCellValue();
	    			sb.append("\tService_Part S" + partOf);
	    			sb.append("\n");
				}
	    		
	    		sb.append("}");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
	}
	
	private void generateEnforcementsRegion(Workbook wb, StringBuilder sb) {
		// Get the Enforcements Sheet
	    Sheet sheet = wb.getSheet("Enforcements");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			int id = (int) cellId.getNumericCellValue();
    			Cell cellName = row.getCell(1);
	    		String name = cellName.getStringCellValue();
    			Cell cellDescription = row.getCell(2);
	    		String description = cellDescription.getStringCellValue();
	    		Cell cellType = row.getCell(3);
	    		String type = cellType.getStringCellValue();
	    		sb.append("Enforcement En" + id + " {");
	    		sb.append("\n");
	    		sb.append("\tName \"" + name + "\"");
	    		sb.append("\n");
	    		sb.append("\tDescription \"" + description + "\"");
	    		sb.append("\n");
	    		sb.append("\tType " + type);
	    		sb.append("\n}");
	    		sb.append("\n\n");
			}
    		else
    			break;
		}
	}
	
	private void generateRecipientsRegion(Workbook wb, StringBuilder sb) {
		// Get the Recipients Sheet
	    Sheet sheet = wb.getSheet("Recipients");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			if (cellId.getCellType() == Cell.CELL_TYPE_NUMERIC) {
    				int id = (int) cellId.getNumericCellValue();
        			Cell cellDescription = row.getCell(1);
    	    		String description = cellDescription.getStringCellValue();
    	    		Cell cellScope = row.getCell(2);
    	    		String scope = cellScope.getStringCellValue();
    	    		
    	    		if (scope.contains("/")) {
						scope = "Internal/External";
					} else {
						scope = scope.substring(0, 1).toUpperCase() + scope.substring(1);
					}

    	    		Cell cellType = row.getCell(3);
    	    		String type = cellType.getStringCellValue();
    	    		
    	    		if (type.contains("/")) {
						type = "Individual/Organization";
					} else {
						type = type.substring(0, 1).toUpperCase() + type.substring(1);
					}
    	    		
    	    		Cell cellPartOf = row.getCell(4);
    	    		sb.append("Recipient R" + id + " {");
    	    		sb.append("\n");
    	    		sb.append("\tName \"" + description + "\"");
    	    		sb.append("\n");
    	    		sb.append("\tDescription \"" + description + "\"");
    	    		sb.append("\n");
    	    		
    	    		if (cellPartOf.getCellType() == Cell.CELL_TYPE_NUMERIC) {
    	    			int partOf = (int) cellPartOf.getNumericCellValue();
    	    			sb.append("\tRecipient_Part R" + partOf);
    	    			sb.append("\n");
					}
    	    		
    	    		sb.append("\tScope " + scope);
    	    		sb.append("\n");
    	    		sb.append("\tType " + type);
    	    		sb.append("\n}");
    	    		sb.append("\n\n");
				}
			}
    		else
    			break;
		}
	}
	
	private String formatId(String id) {
		return id.replaceAll(" ", "_").replaceAll("-", "_");
	}
}
