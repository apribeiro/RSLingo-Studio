package rslingo.rslil.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;

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
		
		label = new Label(container, SWT.NULL);
		label.setText("&Application Domain:");
		
		domainCombo = new Combo(container, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		domainCombo.setLayoutData(gd);
		items = new String[] { "PublicSector", "Education", "Health", "Telecoms",
			"Energy&Utilities", "Finance&Banks", "Other"
		};
		domainCombo.setItems(items);
		
		// TODO: Schedules
		// TODO: Organizations
		
		label = new Label(container, SWT.NULL);
		label.setText("&Project Progress:");
		
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
		
		if (namespace.length() == 0) {
			updateStatus("Package namespace must be specified");
			return;
		}
		
		if (!namespace.matches(regex)) {
			updateStatus("Invalid package namespace");
			return;
		}
		
		if (getPolicyName().length() == 0) {
			updateStatus("Policy name must be specified");
			return;
		}
		
		if (getDescription().length() == 0) {
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
	
	public String getPolicyName() {
		return projectNameText.getText();
	}

	public String getDescription() {
		return descriptionText.getText();
	}
}
