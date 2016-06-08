package rslingo.rslil.ui.handlers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
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
	private static final String SYSTEM_ORANGE = "FFFFC000";
	private static final String ENTITY_BLUE = "FF4F81BD";
	
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
			generatePackageProjectFile(srcGenFolder, filePath, fileName);
			generatePackageSystemFiles(srcGenFolder, filePath, fileName);
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
		sb.append("Package-Project " + DocumentHelper.formatId(fileName) + " {");
		sb.append("\n");
		generateSytemImportsRegion(wb, sb, DocumentHelper.formatId(fileName));
		sb.append("\n");
		
		generateProjectRegion(wb, sb);
		generateGlossaryRegion(wb, sb);
		generateStakeholdersRegion(wb, sb);
		generateGoalsRegion(wb, sb);
		generateGoalRelationsRegion(wb, sb);
		generateSystemsRegion(wb, sb, DocumentHelper.formatId(fileName));
		generateSystemRelationsRegion(wb, sb);
    	
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
	
	private void generatePackageProjectFile(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		sb.append("Package-Project " + DocumentHelper.formatId(fileName) + " {");
		sb.append("\n");
		sb.append("\n");
		generateSytemImportsRegion(wb, sb, DocumentHelper.formatId(fileName));
		sb.append("\n");
		sb.append("\n");
		
		generateProjectRegion(wb, sb);
		generateGlossaryRegion(wb, sb);
		generateStakeholdersRegion(wb, sb);
		generateGoalsRegion(wb, sb);
		generateGoalRelationsRegion(wb, sb);
		generateSystemRelationsRegion(wb, sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = srcGenFolder.getFile(fileName + ".Project.rslil");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		if (!file.exists()) {
			file.create(source, IResource.FORCE, null);
		} else {
			file.setContents(source, IResource.FORCE, null);
		}
	}
	
	private void generatePackageSystemFiles(IFolder srcGenFolder, String filePath, String fileName)
			throws Exception {
		String formattedFileName = DocumentHelper.formatId(fileName);
		InputStream inp = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(inp);
		// Get the Systems Sheet
	    Sheet sheet = wb.getSheet("systems");
		Iterator<Row> rowIt = sheet.rowIterator();
		// Ignore the Header rows
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
		
    	Map<String, StringBuilder> systems = new TreeMap<String, StringBuilder>();
		
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		
    		if (!row.getCell(3).getStringCellValue().isEmpty()) {
	    		Cell cellId = row.getCell(0);
				String id = DocumentHelper.formatId(cellId.getStringCellValue());
		    	Cell cellName = row.getCell(1);
				String name = cellName.getStringCellValue();
				Cell cellDescription = row.getCell(2);
				String description = cellDescription.getStringCellValue().replace("\"", "'");
				Cell cellType = row.getCell(3);
				String type = cellType.getStringCellValue();
				Cell cellScope = row.getCell(4);
				String scope = cellScope.getStringCellValue();
				Cell cellPartOf = row.getCell(5);
				String partOf = DocumentHelper.formatId(cellPartOf.getStringCellValue());
				
				StringBuilder builder = new StringBuilder();
				builder.append("Package-System " + formattedFileName + "_" + id + " {");
	    		builder.append("\n");
    			builder.append("\n");
    			builder.append("\timport " + formattedFileName + ".*");
    			builder.append("\n");
    			builder.append("\n");
    			
	    		if (!partOf.isEmpty()) {
	    			builder.append("\timport " + formattedFileName + "_" + partOf + ".*");
	        		builder.append("\n");
	        		builder.append("\n");
	    		}
	    		
	    		builder.append("\tSystem " + id + " {");
	    		builder.append("\n");
	    		
	    		if (!name.isEmpty()) {
	    			builder.append("\t\tName \"" + name + "\"");
		    		builder.append("\n");
				}
	    		
	    		if (!description.isEmpty()) {
	    			builder.append("\t\tDescription \"" + description + "\"");
		    		builder.append("\n");
	    		}
	    		
	    		builder.append("\t\tType " + type);
	    		builder.append("\n");
	    		
	    		builder.append("\t\tScope " + scope);
	    		builder.append("\n");
	    		
	    		if (!partOf.isEmpty()) {
	    			builder.append("\t\tPartOf " + partOf);
		    		builder.append("\n");
	    		}
	    		
	    		builder.append("\t}");
	    		builder.append("\n");
	    		
				systems.put(id, builder);
	    	}
    	}
    	
//    	generateEntitiesRegion(wb, systems);
		generateActorsRegion(wb, systems);
//		generateUseCasesRegion(wb, systems);
		generateFRsRegion(wb, systems);
		generateQRsRegion(wb, systems);
		generateConstraintsRegion(wb, systems);
		generateRequirementRelationsRegion(wb, systems);
		
    	for (String system : systems.keySet()) {
    		StringBuilder sb = systems.get(system); 
			sb.append("}");
			
			IFile file = srcGenFolder.getFile(fileName + ".Systems." + system + ".rslil");
			InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
			
			if (!file.exists()) {
				file.create(source, IResource.FORCE, null);
			} else {
				file.setContents(source, IResource.FORCE, null);
			}
		}
	}
	
	private void generateProjectRegion(Workbook wb, StringBuilder sb) {
		// Get the Project Sheet
	    Sheet sheet = wb.getSheet("project");
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
		String id = DocumentHelper.formatId(cellId.getStringCellValue());
    	Cell cellName = row.getCell(1);
		String name = cellName.getStringCellValue();
		Cell cellType = row.getCell(2);
		String type = cellType.getStringCellValue();
		Cell cellDomain = row.getCell(3);
		String domain = cellDomain.getStringCellValue();
		Cell cellPlannedStart = row.getCell(4);
		Date plannedStart = cellPlannedStart.getDateCellValue();
		Cell cellPlannedEnd = row.getCell(5);
		Date plannedEnd = cellPlannedEnd.getDateCellValue();
		Cell cellActualStart = row.getCell(6);
		Date actualStart = cellActualStart.getDateCellValue();
		Cell cellActualEnd = row.getCell(7);
		Date actualEnd = cellActualEnd.getDateCellValue();
		Cell cellCustomer = row.getCell(8);
		String customer = cellCustomer.getStringCellValue();
		Cell cellSupplier = row.getCell(9);
		String supplier = cellSupplier.getStringCellValue();
		Cell cellPartners = row.getCell(10);
		String partners = cellPartners.getStringCellValue();
		Cell cellProgress = row.getCell(11);
		String progress = cellProgress.getStringCellValue();
		
		// Go to the Summary row
		rowIt.next();
		rowIt.next();
		row = rowIt.next();
		Cell cellSummary = row.getCell(0);
		String summary = cellSummary.getStringCellValue().replaceAll("\"", "'");
		
		// Go to the Description row
		rowIt.next();
		rowIt.next();
		row = rowIt.next();
		Cell cellDescription = row.getCell(0);
		String description = cellDescription.getStringCellValue().replaceAll("\"", "'");
		
		sb.append("\tProject " + id + " {");
		sb.append("\n");
		
		if (!name.isEmpty()) {
			sb.append("\t\tName \"" + name + "\"");
			sb.append("\n");
		}
		
		sb.append("\t\tType " + type);
		sb.append("\n");
		sb.append("\t\tApplicationDomain " + domain);
		sb.append("\n");
		
		if (plannedStart != null && plannedEnd != null) {
			sb.append("\t\tPlannedSchedule {");
			sb.append("\n");
			
			sb.append("\t\t\tStart " + DocumentHelper.getRSLILDate(plannedStart));
			sb.append("\n");
			
			sb.append("\t\t\tEnd " + DocumentHelper.getRSLILDate(plannedEnd));
			sb.append("\n");
			
			sb.append("\t\t}");
			sb.append("\n");
		}
		
		if (actualStart != null) {
			sb.append("\t\tActualSchedule {");
			sb.append("\n");
			
			sb.append("\t\t\tStart " + DocumentHelper.getRSLILDate(actualStart));
			sb.append("\n");
			
			if (actualEnd != null) {
				sb.append("\t\t\tEnd " + DocumentHelper.getRSLILDate(actualEnd));
				sb.append("\n");
			}
			
			sb.append("\t\t}");
			sb.append("\n");
		}
		
		if (!customer.isEmpty() || !supplier.isEmpty() || !partners.isEmpty()) {
			sb.append("\t\tOrganizations {");
			sb.append("\n");
			sb.append("\t\t\tCustomer \"" + customer + "\"");
			sb.append("\n");
			sb.append("\t\t\tSupplier \"" + supplier + "\"");
			sb.append("\n");
			sb.append("\t\t\tPartners \"" + partners + "\"");
			sb.append("\n");
			sb.append("\t\t}");
			sb.append("\n");
		}
		
		if (!progress.isEmpty()) {
			sb.append("\t\tProjectProgress " + progress);
			sb.append("\n");
		}
		
		sb.append("\t\tSummary \"" + summary + "\"");
		sb.append("\n");
		
		sb.append("\t\tDescription \"" + description + "\"");
		sb.append("\n\t}");
		sb.append("\n\n");
	}
	
	private void generateSytemImportsRegion(Workbook wb, StringBuilder sb, String fileName) {
		Set<String> systemIds = new HashSet<String>();
		// Get the Systems Relations Sheet
	    Sheet sheet = wb.getSheet("systems.relations");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellSource = row.getCell(0);
			String source = DocumentHelper.formatId(cellSource.getStringCellValue());
			Cell cellTarget = row.getCell(1);
			String target = DocumentHelper.formatId(cellTarget.getStringCellValue());
			
			systemIds.add(source);
			systemIds.add(target);
		}
    	
    	for (String system : systemIds) {
			sb.append("\timport " + fileName + "_" + system + ".*");
			sb.append("\n");
		}
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
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		
    		if (!row.getCell(3).getStringCellValue().isEmpty()) {
    			Cell cellId = row.getCell(0);
    			String id = DocumentHelper.formatId(cellId.getStringCellValue());
    			Cell cellName = row.getCell(1);
	    		String name= cellName.getStringCellValue();
    			Cell cellDescription = row.getCell(2);
	    		String description = cellDescription.getStringCellValue().replaceAll("\"", "'");
	    		Cell cellType = row.getCell(3);
	    		String type = cellType.getStringCellValue().replaceAll(";", ",");
	    		Cell cellAcronym = row.getCell(4);
	    		String acronym = cellAcronym.getStringCellValue();
	    		Cell cellPOS = row.getCell(5);
	    		String pos = cellPOS.getStringCellValue();
	    		Cell cellSynonym = row.getCell(6);
	    		String synonym = cellSynonym.getStringCellValue();
	    		Cell cellHypernym = row.getCell(7);
	    		String hypernym = cellHypernym.getStringCellValue();
	    		
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
	    		
	    		if (!synonym.isEmpty()) {
		    		sb.append("\t\tSynonym \"" + synonym + "\"");
		    		sb.append("\n");
	    		}
    			
	    		if (!hypernym.isEmpty()) {
		    		sb.append("\t\tHypernym \"" + hypernym + "\"");
		    		sb.append("\n");
	    		}
	    		
	    		sb.append("\t}");
	    		sb.append("\n\n");
			}
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
    		
    		if (!row.getCell(3).getStringCellValue().isEmpty()) {
    			Cell cellId = row.getCell(0);
    			String id = DocumentHelper.formatId(cellId.getStringCellValue());
    			Cell cellName = row.getCell(1);
	    		String name = cellName.getStringCellValue();
    			Cell cellDescription = row.getCell(2);
	    		String description = cellDescription.getStringCellValue().replaceAll("\"", "'");
	    		Cell cellType = row.getCell(3);
	    		String type = cellType.getStringCellValue(); 
    			Cell cellCategory = row.getCell(4);
	    		String category = cellCategory.getStringCellValue();
	    		Cell cellIsA = row.getCell(5);
	    		String isA = DocumentHelper.formatId(cellIsA.getStringCellValue());
	    		Cell cellPartOf = row.getCell(6);
	    		String partOf = DocumentHelper.formatId(cellPartOf.getStringCellValue());
	    		
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
	    		
	    		if (!isA.isEmpty()) {
	    			sb.append("\t\tIsA " + isA);
		    		sb.append("\n");
	    		}
	    		
	    		if (!partOf.isEmpty()) {
	    			sb.append("\t\tPartOf " + partOf);
		    		sb.append("\n");
	    		}
	    		
	    		sb.append("\t}");
	    		sb.append("\n\n");
			}
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
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell controlCell = row.getCell(3); 
    		
    		if (controlCell != null && !controlCell.getStringCellValue().isEmpty()
    			&& !controlCell.getStringCellValue().equals("Source (Stakeholder) (*)")) {
    			Cell cellId = row.getCell(0);
    			String id = DocumentHelper.formatId(cellId.getStringCellValue());
    			Cell cellName = row.getCell(1);
    			String name = cellName.getStringCellValue();
    			Cell cellDescription = row.getCell(2);
    			String description = cellDescription.getStringCellValue().replace("\"", "'");
    			Cell cellStakeholder = row.getCell(3);
    			String stakeholder = DocumentHelper.formatId(cellStakeholder.getStringCellValue());
    			Cell cellPriority = row.getCell(4);
    			String priority = cellPriority.getStringCellValue();
    			Cell cellPartOfAnd = row.getCell(5);
    			String partOfAnd = DocumentHelper.formatId(cellPartOfAnd.getStringCellValue());
    			Cell cellPartOfOr = row.getCell(6);
    			String partOfOr = DocumentHelper.formatId(cellPartOfOr.getStringCellValue());
    			Cell cellProgress = row.getCell(7);
    			String progress = cellProgress.getStringCellValue();
	    		
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
	    		
    			sb.append("\t\tStakeholder " + stakeholder);
	    		sb.append("\n");
	    		
	    		sb.append("\t\tPriority " + priority);
	    		sb.append("\n");
	    		
	    		if (!partOfAnd.isEmpty()) {
	    			sb.append("\t\tPartOf-And " + partOfAnd);
		    		sb.append("\n");
	    		}
	    		
	    		if (!partOfOr.isEmpty()) {
	    			sb.append("\t\tPartOf-Or " + partOfOr);
		    		sb.append("\n");
	    		}
	    		
	    		if (!progress.isEmpty()) {
	    			sb.append("\t\tProjectProgress " + progress);
		    		sb.append("\n");
	    		}
	    		
	    		sb.append("\t}");
	    		sb.append("\n\n");
			}
		}
	}
	
	private void generateGoalRelationsRegion(Workbook wb, StringBuilder sb) {
		// Get the Goals Relations Sheet
	    Sheet sheet = wb.getSheet("goals.relations");
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
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
			Cell cellSource = row.getCell(0);
			String source = DocumentHelper.formatId(cellSource.getStringCellValue());
			Cell cellTarget = row.getCell(2);
			String target = DocumentHelper.formatId(cellTarget.getStringCellValue());
			Cell cellType = row.getCell(4);
			String type = cellType.getStringCellValue();
			Cell cellDescription = row.getCell(5);
			String description = cellDescription.getStringCellValue().replace("\"", "'");
			String id = source + "_" + target + "_" + type;
    		
			sb.append("\tGoalRelation " + id + " {");
    		sb.append("\n");
    		
    		sb.append("\t\tSource " + source);
    		sb.append("\n");
    		
    		sb.append("\t\tTarget " + target);
    		sb.append("\n");
    		
    		sb.append("\t\tType " + type);
    		sb.append("\n");
    		
    		if (!description.isEmpty()) {
    			sb.append("\t\tDescription \"" + description + "\"");
	    		sb.append("\n");
    		}
    		
    		sb.append("\t}");
    		sb.append("\n\n");
		}
	}
	
	private void generateSystemsRegion(Workbook wb, StringBuilder sb, String fileName) {
		// Get the Systems Sheet
	    Sheet sheet = wb.getSheet("systems");
		Iterator<Row> rowIt = sheet.rowIterator();
		// Ignore the Header rows
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
		
    	Map<String, StringBuilder> systems = new TreeMap<String, StringBuilder>();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		
    		if (!row.getCell(3).getStringCellValue().isEmpty()) {
	    		Cell cellId = row.getCell(0);
				String id = DocumentHelper.formatId(cellId.getStringCellValue());
		    	Cell cellName = row.getCell(1);
				String name = cellName.getStringCellValue();
				Cell cellDescription = row.getCell(2);
				String description = cellDescription.getStringCellValue().replace("\"", "'");
				Cell cellType = row.getCell(3);
				String type = cellType.getStringCellValue();
				Cell cellScope = row.getCell(4);
				String scope = cellScope.getStringCellValue();
				Cell cellPartOf = row.getCell(5);
				String partOf = DocumentHelper.formatId(cellPartOf.getStringCellValue());
				
				StringBuilder builder = new StringBuilder();
				builder.append("\tPackage-System " + fileName + "_" + id + " {");
	    		builder.append("\n");
	    		
	    		if (!partOf.isEmpty()) {
	    			builder.append("\t\timport " + fileName + "_" + partOf + ".*");
	        		builder.append("\n");
	        		builder.append("\n");
	    		}
	    		
	    		builder.append("\t\tSystem " + id + " {");
	    		builder.append("\n");
	    		
	    		if (!name.isEmpty()) {
	    			builder.append("\t\t\tName \"" + name + "\"");
		    		builder.append("\n");
				}
	    		
	    		if (!description.isEmpty()) {
	    			builder.append("\t\t\tDescription \"" + description + "\"");
		    		builder.append("\n");
	    		}
	    		
	    		builder.append("\t\t\tType " + type);
	    		builder.append("\n");
	    		
	    		builder.append("\t\t\tScope " + scope);
	    		builder.append("\n");
	    		
	    		if (!partOf.isEmpty()) {
	    			builder.append("\t\t\tPartOf " + partOf);
		    		builder.append("\n");
	    		}
	    		
	    		builder.append("\t\t}");
	    		builder.append("\n\n");
	    		
				systems.put(id, builder);
	    	}
    	}
    	
//    	generateEntitiesRegion(wb, systems);
		generateActorsRegion(wb, systems);
//		generateUseCasesRegion(wb, systems);
		generateFRsRegion(wb, systems);
		generateQRsRegion(wb, systems);
		generateConstraintsRegion(wb, systems);
		generateRequirementRelationsRegion(wb, systems);
		
    	for (String key : systems.keySet()) {
			sb.append(systems.get(key));
			sb.append("\t}");
			sb.append("\n\n");
		}
	}
	
	private void generateEntitiesRegion(Workbook wb, Map<String, StringBuilder> systems) {
		// Get the Entities Sheet
	    Sheet sheet = wb.getSheet("entities");
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
    	
    	String systemId = null;
    	String pk = null;
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellId = row.getCell(0);
    		
    		if (cellId != null) {
    			XSSFCellStyle cs = (XSSFCellStyle) cellId.getCellStyle();
    			
    			if (cs.getFillForegroundColorColor() != null) {
    				String color = cs.getFillForegroundColorColor().getARGBHex();
    			
	        		if (color.equals(SYSTEM_ORANGE)) {
						systemId = cellId.getStringCellValue();
	        		} else if (color.equals(ENTITY_BLUE)) {
	        			String id = cellId.getStringCellValue();
		    			Cell cellName = row.getCell(1);
		    			String name = cellName.getStringCellValue();
		    			Cell cellDescription = row.getCell(2);
		    			String description = cellDescription.getStringCellValue();
		    			Cell cellType = row.getCell(3);
		    			String type = cellType.getStringCellValue();
		    			Cell cellPK = row.getCell(4);
		    			pk = cellPK.getStringCellValue();
			    		
		    	    	StringBuilder sb = systems.get(systemId);
		    			sb.append("\t\tEntity " + id + " {");
		    			sb.append("\n");
		    			
		    			if (!name.isEmpty()) {
		    				sb.append("\t\t\tName \"" + name + "\"");
		    	    		sb.append("\n");
		    			}
		    			
		    			if (!description.isEmpty()) {
		    				sb.append("\t\t\tDescription \"" + description + "\"");
		    	    		sb.append("\n");
		    			}
		    			
		    			if (!type.isEmpty()) {
		    				sb.append("\t\t\tType " + type);
		    	    		sb.append("\n");
		    			}
	        		}
				} else if (pk != null) {
					StringBuilder sb = systems.get(systemId);
					Cell cell = row.getCell(2);
	    			String name = cell.getStringCellValue();
	    			
					if (name.equals("Attributes")) {
						generateEntityAttributes(sheet, rowIt, row, sb);
						
						if (!pk.isEmpty()) {
		    				sb.append("\t\t\tPrimaryKey " + pk);
		    	    		sb.append("\n");
		    			}
					} else if (name.equals("ForeignKeys")) {
						generateEntityForeignKeys(sheet, rowIt, row, sb);
					} else if (name.equals("Checks")) {
						generateEntityChecks(sheet, rowIt, row, sb);
					} else {
						sb.append("\t\t}");
						sb.append("\n\n");
					}
				}
			}
		}
	}
	
	private void generateEntityAttributes(Sheet sheet, Iterator<Row> rowIt,
			Row row, StringBuilder sb) {
		Row lastRow = DocumentHelper.getLastRowOfMergedRegion(sheet, row);
		int count = lastRow.getRowNum() - row.getRowNum();
		
		while (row != null && (row.getRowNum() < lastRow.getRowNum() + 1)) {
			Cell cellId = row.getCell(3);
			String id = cellId.getStringCellValue();
			Cell cellName = row.getCell(4);
			String name = cellName.getStringCellValue();
			Cell cellDescription = row.getCell(5);
			String description = cellDescription.getStringCellValue();
			Cell cellType = row.getCell(6);
			String type = cellType.getStringCellValue();
			Cell cellSize = row.getCell(7);
			double size = cellSize.getNumericCellValue();
			Cell cellMultiplicity = row.getCell(8);
			Cell cellDefault = row.getCell(9);
			String defaultValue = cellDefault.getStringCellValue();
			Cell cellNotNull = row.getCell(10);
			String notNull = cellNotNull.getStringCellValue();
			Cell cellUnique = row.getCell(11);
			String unique = cellUnique.getStringCellValue();
			
			sb.append("\t\t\tAttribute " + id + " {");
			sb.append("\n");
			
			if (!name.isEmpty()) {
				sb.append("\t\t\t\tName \"" + name + "\"");
	    		sb.append("\n");
			}
			
			if (!description.isEmpty()) {
				sb.append("\t\t\t\tDescription \"" + description + "\"");
	    		sb.append("\n");
			}
			
			sb.append("\t\t\t\tType " + type);
			sb.append("\n");
			
			if (size > 0) {
				sb.append("\t\t\t\tSize " + size);
	    		sb.append("\n");
			}
			
			if (cellMultiplicity.getCellType() == Cell.CELL_TYPE_STRING) {
				String multiplicity = cellMultiplicity.getStringCellValue();
				
				if (!multiplicity.isEmpty()) {
					sb.append("\t\t\t\tMultiplicity \"" + multiplicity + "\"");
		    		sb.append("\n");
				}
			} else if (cellMultiplicity.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				int multiplicity = (int) cellMultiplicity.getNumericCellValue();
				sb.append("\t\t\t\tMultiplicity \"" + multiplicity + "\"");
	    		sb.append("\n");
			}
			
			if (!defaultValue.isEmpty()) {
				sb.append("\t\t\t\tDefaultValue " + defaultValue);
	    		sb.append("\n");
			}
			
			if (!notNull.isEmpty()) {
				sb.append("\t\t\t\tNotNull");
	    		sb.append("\n");
			}
			
			if (!unique.isEmpty()) {
				sb.append("\t\t\t\tUnique");
	    		sb.append("\n");
			}
			
			sb.append("\t\t\t}");
			sb.append("\n");
			
			row = sheet.getRow(row.getRowNum() + 1);
		}
		
		while (count > 0) {
			rowIt.next();
			count--;
		}
	}
	
	private void generateEntityForeignKeys(Sheet sheet, Iterator<Row> rowIt,
			Row row, StringBuilder sb) {
		Row lastRow = DocumentHelper.getLastRowOfMergedRegion(sheet, row);
		int count = lastRow.getRowNum() - row.getRowNum();
		
		while (row != null && (row.getRowNum() < lastRow.getRowNum() + 1)) {
			Cell cellEntity = row.getCell(3);
			String entity = cellEntity.getStringCellValue();
			Cell cellAttributes = row.getCell(4);
			String attributes = cellAttributes.getStringCellValue();
			Cell cellMultiplicity = row.getCell(5);
			
			sb.append("\t\t\tForeignKey " + entity  + "(" + attributes + ")");
			
			if (cellMultiplicity.getCellType() == Cell.CELL_TYPE_STRING) {
				String multiplicity = cellMultiplicity.getStringCellValue();
				sb.append(" Multiplicity \"" + multiplicity + "\"");
	    		
			} else if (cellMultiplicity.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				int multiplicity = (int) cellMultiplicity.getNumericCellValue();
				sb.append(" Multiplicity \"" + multiplicity + "\"");
			}
			
			sb.append("\n");
			
			row = sheet.getRow(row.getRowNum() + 1);
		}
		
		while (count > 0) {
			rowIt.next();
			count--;
		}
	}
	
	private void generateEntityChecks(Sheet sheet, Iterator<Row> rowIt,
			Row row, StringBuilder sb) {
		Row lastRow = DocumentHelper.getLastRowOfMergedRegion(sheet, row);
		int count = lastRow.getRowNum() - row.getRowNum();
		
		while (row != null && (row.getRowNum() < lastRow.getRowNum() + 1)) {
			Cell cellId = row.getCell(3);
			String id = cellId.getStringCellValue();
			Cell cellExpression = row.getCell(4);
			String expression = cellExpression.getStringCellValue();
			
			sb.append("\t\t\tCheck " + id + " \"" + expression + "\"");
			sb.append("\n");
			
			row = sheet.getRow(row.getRowNum() + 1);
		}
		
		while (count > 0) {
			rowIt.next();
			count--;
		}
	}
	
	private void generateActorsRegion(Workbook wb, Map<String, StringBuilder> systems) {
		String systemId = null;
		// Get the Goals Sheet
	    Sheet sheet = wb.getSheet("actors");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell controlCell = row.getCell(3); 
    		
    		if (controlCell != null) {
    			if (!controlCell.getStringCellValue().isEmpty()
    				&& !controlCell.getStringCellValue().equals("Type (*)")) {
	    			Cell cellId = row.getCell(0);
	    			String id = DocumentHelper.formatId(cellId.getStringCellValue());
	    			Cell cellName = row.getCell(1);
	    			String name = cellName.getStringCellValue();
	    			Cell cellDescription = row.getCell(2);
	    			String description = cellDescription.getStringCellValue().replace("\"", "'");
	    			Cell cellType = row.getCell(3);
	    			String type = cellType.getStringCellValue();
	    			Cell cellStakeholder = row.getCell(4);
	    			String stakeholder = DocumentHelper.formatId(cellStakeholder.getStringCellValue());
	    			Cell cellIsA = row.getCell(5);
	    			String isA = DocumentHelper.formatId(cellIsA.getStringCellValue());
		    		
	    			StringBuilder sb = systems.get(systemId);
	    			sb.append("\t\tActor " + id + " {");
		    		sb.append("\n");
		    		
		    		if (!name.isEmpty()) {
		    			sb.append("\t\t\tName \"" + name + "\"");
			    		sb.append("\n");
					}
		    		
		    		if (!description.isEmpty()) {
		    			sb.append("\t\t\tDescription \"" + description + "\"");
			    		sb.append("\n");
		    		}
		    		
		    		sb.append("\t\t\tType " + type);
		    		sb.append("\n");
		    		
		    		if (!stakeholder.isEmpty()) {
		    			sb.append("\t\t\tStakeholder " + stakeholder);
			    		sb.append("\n");
					}
		    		
		    		if (!isA.isEmpty()) {
		    			sb.append("\t\t\tIsA " + isA);
			    		sb.append("\n");
		    		}
		    		
		    		sb.append("\t\t}");
		    		sb.append("\n\n");
    			} else {
    				Cell cellId = row.getCell(0);
    				XSSFCellStyle cs = (XSSFCellStyle) cellId.getCellStyle();
    				
    				if (cs.getFillForegroundColorColor() != null) {
        				String color = cs.getFillForegroundColorColor().getARGBHex();
        			
    	        		if (color.equals(SYSTEM_ORANGE)) {
    						systemId = DocumentHelper.formatId(cellId.getStringCellValue());
    	        		}
    				}
    			}
			}
		}
	}
	
	private void generateUseCasesRegion(Workbook wb, Map<String, StringBuilder> systems) {
		
	}
	
	private void generateFRsRegion(Workbook wb, Map<String, StringBuilder> systems) {
		String systemId = null;
		// Get the Functional Requirements Sheet
	    Sheet sheet = wb.getSheet("reqs.functional");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell controlCell = row.getCell(3); 
    		
    		if (controlCell != null) {
    			if (!controlCell.getStringCellValue().isEmpty()
    				&& !controlCell.getStringCellValue().equals("Type (*)")) {
	    			Cell cellId = row.getCell(0);
	    			String id = DocumentHelper.formatId(cellId.getStringCellValue());
	    			Cell cellName = row.getCell(1);
	    			String name = cellName.getStringCellValue();
	    			Cell cellDescription = row.getCell(2);
	    			String description = cellDescription.getStringCellValue().replace("\"", "'");
	    			Cell cellType = row.getCell(3);
	    			String type = cellType.getStringCellValue();
	    			Cell cellStakeholder = row.getCell(4);
	    			String stakeholder = DocumentHelper.formatId(cellStakeholder.getStringCellValue());
	    			Cell cellPriority = row.getCell(5);
	    			String priority = cellPriority.getStringCellValue();
	    			Cell cellPartOf = row.getCell(6);
	    			String partOf = DocumentHelper.formatId(cellPartOf.getStringCellValue());
	    			Cell cellProgress = row.getCell(7);
	    			String progress = cellProgress.getStringCellValue();
	    			
	    			StringBuilder sb = systems.get(systemId);
	    			sb.append("\t\tFunctionalRequirement " + id + " {");
		    		sb.append("\n");
		    		
		    		if (!name.isEmpty()) {
		    			sb.append("\t\t\tName \"" + name + "\"");
			    		sb.append("\n");
					}
		    		
		    		if (!description.isEmpty()) {
		    			sb.append("\t\t\tDescription \"" + description + "\"");
			    		sb.append("\n");
		    		}
		    		
		    		sb.append("\t\t\tType " + type);
		    		sb.append("\n");
		    		
		    		if (!stakeholder.isEmpty()) {
		    			sb.append("\t\t\tStakeholder " + stakeholder);
			    		sb.append("\n");
					}
		    		
		    		sb.append("\t\t\tPriority " + priority);
		    		sb.append("\n");
		    		
		    		if (!partOf.isEmpty()) {
		    			sb.append("\t\t\tPartOf " + partOf);
			    		sb.append("\n");
		    		}
		    		
		    		if (!progress.isEmpty()) {
		    			sb.append("\t\t\tProjectProgress " + progress);
			    		sb.append("\n");
					}
		    		
		    		sb.append("\t\t}");
		    		sb.append("\n\n");
    			} else {
    				Cell cellId = row.getCell(0);
    				XSSFCellStyle cs = (XSSFCellStyle) cellId.getCellStyle();
    				
    				if (cs.getFillForegroundColorColor() != null) {
        				String color = cs.getFillForegroundColorColor().getARGBHex();
        			
    	        		if (color.equals(SYSTEM_ORANGE)) {
    						systemId = DocumentHelper.formatId(cellId.getStringCellValue());
    	        		}
    				}
    			}
			}
		}
	}
	
	private void generateQRsRegion(Workbook wb, Map<String, StringBuilder> systems) {
		String systemId = null;
		// Get the Functional Requirements Sheet
	    Sheet sheet = wb.getSheet("reqs.quality");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell controlCell = row.getCell(3); 
    		
    		if (controlCell != null) {
    			if (!controlCell.getStringCellValue().isEmpty()
    				&& !controlCell.getStringCellValue().equals("Type (*)")) {
	    			Cell cellId = row.getCell(0);
	    			String id = DocumentHelper.formatId(cellId.getStringCellValue());
	    			Cell cellName = row.getCell(1);
	    			String name = cellName.getStringCellValue();
	    			Cell cellDescription = row.getCell(2);
	    			String description = cellDescription.getStringCellValue().replace("\"", "'");
	    			Cell cellType = row.getCell(3);
	    			String type = cellType.getStringCellValue();
	    			Cell cellSubType = row.getCell(4);
	    			String subType = cellSubType.getStringCellValue();
	    			Cell cellMetric = row.getCell(5);
	    			String metric = cellMetric.getStringCellValue();
	    			Cell cellValue = row.getCell(6);
	    			int value = (int) cellValue.getNumericCellValue();
	    			Cell cellStakeholder = row.getCell(7);
	    			String stakeholder = DocumentHelper.formatId(cellStakeholder.getStringCellValue());
	    			Cell cellPriority = row.getCell(8);
	    			String priority = cellPriority.getStringCellValue();
	    			Cell cellPartOf = row.getCell(9);
	    			String partOf = DocumentHelper.formatId(cellPartOf.getStringCellValue());
	    			Cell cellProgress = row.getCell(10);
	    			String progress = cellProgress.getStringCellValue();
	    			
	    			StringBuilder sb = systems.get(systemId);
	    			sb.append("\t\tQualityRequirement " + id + " {");
		    		sb.append("\n");
		    		
		    		if (!name.isEmpty()) {
		    			sb.append("\t\t\tName \"" + name + "\"");
			    		sb.append("\n");
					}
		    		
		    		if (!description.isEmpty()) {
		    			sb.append("\t\t\tDescription \"" + description + "\"");
			    		sb.append("\n");
		    		}
		    		
		    		sb.append("\t\t\tType " + type);
		    		sb.append("\n");
		    		
		    		if (!subType.isEmpty()) {
		    			sb.append("\t\t\tSub-Type " + subType);
			    		sb.append("\n");
					}
		    		
	    			sb.append("\t\t\tMetric " + metric);
		    		sb.append("\n");
			    	
	    			sb.append("\t\t\tValue " + value);
		    		sb.append("\n");
		    		
		    		if (!stakeholder.isEmpty()) {
		    			sb.append("\t\t\tStakeholder " + stakeholder);
			    		sb.append("\n");
					}
		    		
		    		sb.append("\t\t\tPriority " + priority);
		    		sb.append("\n");
		    		
		    		if (!partOf.isEmpty()) {
		    			sb.append("\t\t\tPartOf " + partOf);
			    		sb.append("\n");
		    		}
		    		
		    		if (!progress.isEmpty()) {
		    			sb.append("\t\t\tProjectProgress " + progress);
			    		sb.append("\n");
					}
		    		
		    		sb.append("\t\t}");
		    		sb.append("\n\n");
    			} else {
    				Cell cellId = row.getCell(0);
    				XSSFCellStyle cs = (XSSFCellStyle) cellId.getCellStyle();
    				
    				if (cs.getFillForegroundColorColor() != null) {
        				String color = cs.getFillForegroundColorColor().getARGBHex();
        			
    	        		if (color.equals(SYSTEM_ORANGE)) {
    						systemId = DocumentHelper.formatId(cellId.getStringCellValue());
    	        		}
    				}
    			}
			}
		}
	}
	
	private void generateConstraintsRegion(Workbook wb, Map<String, StringBuilder> systems) {
		String systemId = null;
		// Get the Functional Requirements Sheet
	    Sheet sheet = wb.getSheet("reqs.constraint");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell controlCell = row.getCell(3); 
    		
    		if (controlCell != null) {
    			if (!controlCell.getStringCellValue().isEmpty()
    				&& !controlCell.getStringCellValue().equals("Type (*)")) {
	    			Cell cellId = row.getCell(0);
	    			String id = DocumentHelper.formatId(cellId.getStringCellValue());
	    			Cell cellName = row.getCell(1);
	    			String name = cellName.getStringCellValue();
	    			Cell cellDescription = row.getCell(2);
	    			String description = cellDescription.getStringCellValue().replace("\"", "'");
	    			Cell cellType = row.getCell(3);
	    			String type = cellType.getStringCellValue();
	    			Cell cellStakeholder = row.getCell(4);
	    			String stakeholder = DocumentHelper.formatId(cellStakeholder.getStringCellValue());
	    			Cell cellPriority = row.getCell(5);
	    			String priority = cellPriority.getStringCellValue();
	    			Cell cellPartOf = row.getCell(6);
	    			String partOf = DocumentHelper.formatId(cellPartOf.getStringCellValue());
	    			Cell cellProgress = row.getCell(7);
	    			String progress = cellProgress.getStringCellValue();
	    			
	    			StringBuilder sb = systems.get(systemId);
	    			sb.append("\t\tConstraint " + id + " {");
		    		sb.append("\n");
		    		
		    		if (!name.isEmpty()) {
		    			sb.append("\t\t\tName \"" + name + "\"");
			    		sb.append("\n");
					}
		    		
		    		if (!description.isEmpty()) {
		    			sb.append("\t\t\tDescription \"" + description + "\"");
			    		sb.append("\n");
		    		}
		    		
		    		sb.append("\t\t\tType " + type);
		    		sb.append("\n");
		    		
		    		if (!stakeholder.isEmpty()) {
		    			sb.append("\t\t\tStakeholder " + stakeholder);
			    		sb.append("\n");
					}
		    		
		    		sb.append("\t\t\tPriority " + priority);
		    		sb.append("\n");
		    		
		    		if (!partOf.isEmpty()) {
		    			sb.append("\t\t\tPartOf " + partOf);
			    		sb.append("\n");
		    		}
		    		
		    		if (!progress.isEmpty()) {
		    			sb.append("\t\t\tProjectProgress " + progress);
			    		sb.append("\n");
					}
		    		
		    		sb.append("\t\t}");
		    		sb.append("\n\n");
    			} else {
    				Cell cellId = row.getCell(0);
    				XSSFCellStyle cs = (XSSFCellStyle) cellId.getCellStyle();
    				
    				if (cs.getFillForegroundColorColor() != null) {
        				String color = cs.getFillForegroundColorColor().getARGBHex();
        			
    	        		if (color.equals(SYSTEM_ORANGE)) {
    						systemId = DocumentHelper.formatId(cellId.getStringCellValue());
    	        		}
    				}
    			}
			}
		}
	}
	
	private void generateRequirementRelationsRegion(Workbook wb, Map<String, StringBuilder> systems) {
		String systemId = null;
		// Get the Requirements Relations Sheet
	    Sheet sheet = wb.getSheet("reqs.relations");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell controlCell = row.getCell(2);
    		
    		if (controlCell != null) {
    			if (!controlCell.getStringCellValue().isEmpty()
					&& !controlCell.getStringCellValue().equals("Description")
    				&& !controlCell.getStringCellValue().equals("Target (*)")
    				&& !controlCell.getStringCellValue().equals("Id")) {
    				Cell cellSource = row.getCell(0);
    				String source = DocumentHelper.formatId(cellSource.getStringCellValue());
    				Cell cellTarget = row.getCell(2);
    				String target = DocumentHelper.formatId(cellTarget.getStringCellValue());
    				Cell cellType = row.getCell(4);
    				String type = cellType.getStringCellValue();
    				Cell cellDescription = row.getCell(5);
    				String description = cellDescription.getStringCellValue().replace("\"", "'");
    				String id = source + "_" + target + "_" + type.replace("-", "_");
    	    		
    				StringBuilder sb = systems.get(systemId);
    				sb.append("\t\tRequirementRelation " + id + " {");
    	    		sb.append("\n");
    	    		
    	    		sb.append("\t\t\tSource " + source);
    	    		sb.append("\n");
    	    		
    	    		sb.append("\t\t\tTarget " + target);
    	    		sb.append("\n");
    	    		
    	    		sb.append("\t\t\tType " + type);
    	    		sb.append("\n");
    	    		
    	    		if (!description.isEmpty()) {
    	    			sb.append("\t\t\tDescription \"" + description + "\"");
    		    		sb.append("\n");
    	    		}
    	    		
    	    		sb.append("\t\t}");
    	    		sb.append("\n\n");
    			} else {
    				Cell cellId = row.getCell(0);
    				XSSFCellStyle cs = (XSSFCellStyle) cellId.getCellStyle();
    				
    				if (cs.getFillForegroundColorColor() != null) {
        				String color = cs.getFillForegroundColorColor().getARGBHex();
        			
    	        		if (color.equals(SYSTEM_ORANGE)) {
    						systemId = DocumentHelper.formatId(cellId.getStringCellValue());
    	        		}
    				}
    			}
    		}
    	}
	}
	
	private void generateSystemRelationsRegion(Workbook wb, StringBuilder sb) {
		// Get the Systems Relations Sheet
	    Sheet sheet = wb.getSheet("systems.relations");
    	Iterator<Row> rowIt = sheet.rowIterator();
    	// Ignore the Header row
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	rowIt.next();
    	
    	while (rowIt.hasNext()) {
    		Row row = rowIt.next();
    		Cell cellSource = row.getCell(0);
			String source = DocumentHelper.formatId(cellSource.getStringCellValue());
			Cell cellTarget = row.getCell(1);
			String target = DocumentHelper.formatId(cellTarget.getStringCellValue());
			Cell cellCategory = row.getCell(2);
			String category = cellCategory.getStringCellValue();
			Cell cellType = row.getCell(3);
			String type = cellType.getStringCellValue();
			Cell cellDescription = row.getCell(4);
			String description = cellDescription.getStringCellValue().replace("\"", "'");
			String id = source + "_" + target + "_" + type.replace("-", "_");
    		
			sb.append("\tSystemRelation " + id + " {");
    		sb.append("\n");
    		
    		sb.append("\t\tSource " + source);
    		sb.append("\n");
    		
    		sb.append("\t\tTarget " + target);
    		sb.append("\n");
    		
    		sb.append("\t\tCategory " + category);
    		sb.append("\n");
    		
    		sb.append("\t\tType " + type);
    		sb.append("\n");
    		
    		if (!description.isEmpty()) {
    			sb.append("\t\tDescription \"" + description + "\"");
	    		sb.append("\n");
    		}
    		
    		sb.append("\t}");
    		sb.append("\n\n");
		}
	}
}
