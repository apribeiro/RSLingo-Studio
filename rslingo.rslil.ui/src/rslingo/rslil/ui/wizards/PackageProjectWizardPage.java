package rslingo.rslil.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import rslingo.rslil.rSLIL.impl.DateImpl;
import rslingo.rslil.rSLIL.impl.MonthImpl;
import rslingo.rslil.ui.handlers.DocumentHelper;

public class PackageProjectWizardPage extends WizardPage {

	Text namespaceText;
	Text projectNameText;
	Combo typeCombo;
	Combo domainCombo;
	DateTime plannedStart;
	DateTime plannedEnd;
	DateTime actualStart;
	DateTime actualEnd;
	Text customerText;
	Text supplierText;
	Text partnersText;
	Combo progressCombo;
	Text summaryText;
	Text descriptionText;
	
	public PackageProjectWizardPage() {
		super("PackageProjectWizardPage");
		setTitle("RSL-IL Package Project Information");
		setDescription("Define the RSL-IL Package Project information.");
	}

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Namespace:");

		namespaceText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		namespaceText.setLayoutData(gd);
		namespaceText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("&Project name:");

		projectNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		projectNameText.setLayoutData(gd);
		projectNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		label = new Label(container, SWT.NULL);
		label.setText("&Type:");
		
		typeCombo = new Combo(container, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		typeCombo.setLayoutData(gd);
		String[] items = new String[] { "SystemDevelopment", "SystemDesign", "SystemDeployment",
			"SystemMaintenance", "Training", "Research", "Other"
		};
		typeCombo.setItems(items);
		typeCombo.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("&Application Domain:");
		
		domainCombo = new Combo(container, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		domainCombo.setLayoutData(gd);
		items = new String[] { "PublicSector", "Education", "Health", "Telecoms",
			"Energy&Utilities", "Finance&Banks", "Other"
		};
		domainCombo.setItems(items);
		domainCombo.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		// Schedules
		label = new Label(container, SWT.NULL);
		label.setText("Planned Start:");

		plannedStart = new DateTime(container, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		
		label = new Label(container, SWT.NULL);
		label.setText("Planned End:");

		plannedEnd = new DateTime(container, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		
		label = new Label(container, SWT.NULL);
		label.setText("Actual Start:");

		actualStart = new DateTime(container, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		
		label = new Label(container, SWT.NULL);
		label.setText("Actual End:");

		actualEnd = new DateTime(container, SWT.NULL);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		
		// Organizations
		label = new Label(container, SWT.NULL);
		label.setText("Customer:");

		customerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		customerText.setLayoutData(gd);
		
		label = new Label(container, SWT.NULL);
		label.setText("Supplier:");

		supplierText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		supplierText.setLayoutData(gd);
		
		label = new Label(container, SWT.NULL);
		label.setText("Partner(s):");

		partnersText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		partnersText.setLayoutData(gd);
		
		label = new Label(container, SWT.NULL);
		label.setText("Project Progress:");
		
		progressCombo = new Combo(container, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		progressCombo.setLayoutData(gd);
		items = new String[] { "Not-Plan", "Plan", "On-Design", "On-Develop",
			"On-Test", "On-Deploy", "Concluded"
		};
		progressCombo.setItems(items);
		
		label = new Label(container, SWT.NULL);
		label.setText("&Summary:");
				
		summaryText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		summaryText.setLayoutData(gd);
		summaryText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
				
		label = new Label(container, SWT.NULL);
		label.setText("&Description:");
				
		descriptionText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		descriptionText.setLayoutData(gd);
		descriptionText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		dialogChanged();
		setControl(container);
	}

	private void dialogChanged() {
		String regex = "^[a-zA-Z_\\$][\\w\\$]*(?:\\.[a-zA-Z_\\$][\\w\\$]*)*$";
		String namespace = getNamespace();
		
		if (namespace.isEmpty()) {
			updateStatus("Namespace must be specified");
			return;
		}
		
		if (!namespace.matches(regex)) {
			updateStatus("Invalid namespace");
			return;
		}
		
		if (getProjectName().isEmpty()) {
			updateStatus("Project name must be specified");
			return;
		}
		
		if (getType().isEmpty()) {
			updateStatus("Type must be specified");
			return;
		}
		
		if (getDomain().isEmpty()) {
			updateStatus("Application Domain must be specified");
			return;
		}
		
		if (getSummary().isEmpty()) {
			updateStatus("Summary must be specified");
			return;
		}
		
		if (getDescription().isEmpty()) {
			updateStatus("Description must be specified");
			return;
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getNamespace() {
		return namespaceText.getText();
	}
	
	public String getProjectName() {
		return projectNameText.getText();
	}
	
	public String getType() {
		int index = typeCombo.getSelectionIndex();
		return index > -1 ? typeCombo.getItem(index) : "";
	}
	
	public String getDomain() {
		int index = domainCombo.getSelectionIndex();
		return index > -1 ? domainCombo.getItem(index) : "";
	}
	
	public DateImpl getPlannedStart() {
		DateImpl date = new DateImpl() {}; 
		date.setDay(plannedStart.getDay());
		MonthImpl month = new MonthImpl() {};
		month.setName(DocumentHelper.getRSLILMonth(plannedStart.getMonth()));
		date.setMonth(month);
		date.setYear(plannedStart.getYear());
		return date;
	}
	
	public DateImpl getPlannedEnd() {
		DateImpl date = new DateImpl() {}; 
		date.setDay(plannedEnd.getDay());
		MonthImpl month = new MonthImpl() {};
		month.setName(DocumentHelper.getRSLILMonth(plannedEnd.getMonth()));
		date.setMonth(month);
		date.setYear(plannedEnd.getYear());
		return date;
	}
	
	public DateImpl getActualStart() {
		DateImpl date = new DateImpl() {}; 
		date.setDay(actualStart.getDay());
		MonthImpl month = new MonthImpl() {};
		month.setName(DocumentHelper.getRSLILMonth(actualStart.getMonth()));
		date.setMonth(month);
		date.setYear(actualStart.getYear());
		return date;
	}
	
	public DateImpl getActualEnd() {
		DateImpl date = new DateImpl() {}; 
		date.setDay(actualEnd.getDay());
		MonthImpl month = new MonthImpl() {};
		month.setName(DocumentHelper.getRSLILMonth(actualEnd.getMonth()));
		date.setMonth(month);
		date.setYear(actualEnd.getYear());
		return date;
	}
	
	public String getCustomer() {
		return customerText.getText();
	}
	
	public String getSupplier() {
		return supplierText.getText();
	}
	
	public String getPartners() {
		return partnersText.getText();
	}
	
	public String getProgress() {
		int index = progressCombo.getSelectionIndex();
		return index > -1 ? progressCombo.getItem(index) : "";
	}
	
	public String getSummary() {
		return summaryText.getText();
	}
	
	public String getDescription() {
		return descriptionText.getText();
	}
}
