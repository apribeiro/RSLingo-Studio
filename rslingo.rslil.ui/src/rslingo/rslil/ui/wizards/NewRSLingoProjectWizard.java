package rslingo.rslil.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import rslingo.rslil.rSLIL.impl.ActualScheduleImpl;
import rslingo.rslil.rSLIL.impl.DateImpl;
import rslingo.rslil.rSLIL.impl.MonthImpl;
import rslingo.rslil.rSLIL.impl.OrganizationsImpl;
import rslingo.rslil.rSLIL.impl.PlannedScheduleImpl;
import rslingo.rslil.rSLIL.impl.ProjectImpl;
import rslingo.rslil.rSLIL.impl.ProjectProgressImpl;

public class NewRSLingoProjectWizard extends Wizard implements INewWizard {
	private NewRSLingoProjectWizardPage page;
	private PackageProjectWizardPage packageProjectPage;
	
	public NewRSLingoProjectWizard() {
		super();
		setWindowTitle("New RSLingo Project");
		setNeedsProgressMonitor(true);
	}

	public void addPages() {
		page = new NewRSLingoProjectWizardPage();
		packageProjectPage = new PackageProjectWizardPage();
		addPage(page);
		addPage(packageProjectPage);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// Nothing to do
	}
	
	@Override
	public boolean performFinish() {
		final String projectName = page.getProjectName();
		final String fileMode = page.getFileMode();
		final ProjectImpl project = new ProjectImpl() {};
		project.setNameAlias(packageProjectPage.getPolicyName());
		
		project.setType("type");
		project.setDomain("domain");
		
		PlannedScheduleImpl plannedSchedule = new PlannedScheduleImpl() {};
		DateImpl plannedStart = new DateImpl() {}; 
		plannedStart.setDay(1);
		MonthImpl month = new MonthImpl() {};
		month.setName("name");
		plannedStart.setMonth(month);
		plannedStart.setYear(2016);
		DateImpl plannedEnd = new DateImpl() {}; 
		plannedEnd.setDay(1);
		month = new MonthImpl() {};
		month.setName("name");
		plannedEnd.setMonth(month);
		plannedEnd.setYear(2016);
		plannedSchedule.setStart(plannedStart);
		plannedSchedule.setEnd(plannedEnd);
		project.setPlanned(plannedSchedule);
		
		ActualScheduleImpl actualSchedule = new ActualScheduleImpl() {};
		DateImpl actualStart = new DateImpl() {}; 
		actualStart.setDay(1);
		month = new MonthImpl() {};
		month.setName("name");
		plannedStart.setMonth(month);
		plannedStart.setYear(2016);
		DateImpl actualEnd = new DateImpl() {}; 
		actualEnd.setDay(1);
		month = new MonthImpl() {};
		month.setName("name");
		actualEnd.setMonth(month);
		actualEnd.setYear(2016);
		actualSchedule.setStart(actualStart);
		actualSchedule.setEnd(actualEnd);
		project.setActual(actualSchedule);
		
		OrganizationsImpl orgs = new OrganizationsImpl() {};
		orgs.setCustomer("");
		orgs.setSupplier("");
		orgs.setPartners("");
		project.setOrganizations(orgs);
		
		ProjectProgressImpl progress = new ProjectProgressImpl() {};
		progress.setValue("");
		project.setProgress(progress);
		
		project.setSummary("");
		project.setDescription("");
		final String namespace = packageProjectPage.getNamespace();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectName, fileMode, namespace, project, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	private void doFinish(String projectName, String fileMode, String namespace,
		ProjectImpl packageProject, IProgressMonitor monitor) throws CoreException {
		// Create the Project structure
		monitor.beginTask("Creating the project " + fileMode, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		project.create(monitor);
		project.open(monitor);
		IProjectDescription projDescription = project.getDescription();
		projDescription.setNatureIds(new String[] { "org.eclipse.xtext.ui.shared.xtextNature" });
		project.setDescription(projDescription, monitor);
		monitor.worked(1);
		
		IFolder folder = project.getFolder("src");
		folder.create(true, true, monitor);
		
		monitor.setTaskName("Creating policy files...");
		
		if (fileMode.equals(NewRSLingoProjectWizardPage.SINGLE)) {
			generateSingleFile(folder, namespace, packageProject, monitor);
		} else {
			generatePackageProjectFile(folder, namespace, packageProject, monitor);
			generatePackageSystemFile(folder, namespace, monitor);
		}
		monitor.worked(1);
	}
	
	private void generateSingleFile(IFolder folder, String namespace, ProjectImpl project,
		IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + " {");
		sb.append("\n");
		sb.append("\n");
		
		generateProjectRegion(project, sb);
		generateSystemRegion(sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
		sb.append("}");
		
		IFile file = folder.getFile("new_project.rslil");
		InputStream stream = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(stream, IResource.FORCE, monitor);
			} else {
				file.setContents(stream, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}
	
	private void generatePackageProjectFile(IFolder folder, String namespace,
		ProjectImpl project, IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + ".Main {");
		sb.append("\n");
		sb.append("\n");
		sb.append("import " + namespace + ".Statements.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Privatedata.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Recipients.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Enforcements.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Services.*");
		sb.append("\n");
		sb.append("\n");
		
		generateProjectRegion(project, sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = folder.getFile("new_policy.Main.rslil");
		InputStream source = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(source, IResource.FORCE, monitor);
			} else {
				file.setContents(source, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}
		
	private void generatePackageSystemFile(IFolder folder, String namespace,
		IProgressMonitor monitor) {
		StringBuilder sb = new StringBuilder();
		sb.append("Package " + namespace + ".Statements {");
		sb.append("\n");
		sb.append("\n");
		sb.append("import " + namespace + ".Privatedata.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Services.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Enforcements.*");
		sb.append("\n");
		sb.append("import " + namespace + ".Recipients.*");
		sb.append("\n");
		sb.append("\n");
		
		generateSystemRegion(sb);
    	
    	sb.deleteCharAt(sb.length() - 1);
    	sb.append("}");
		
		IFile file = folder.getFile("new_project.System.rslil");
		InputStream stream = new ByteArrayInputStream(sb.toString().getBytes());
		
		try {
			if (!file.exists()) {
				file.create(stream, IResource.FORCE, monitor);
			} else {
				file.setContents(stream, IResource.FORCE, monitor);
			}
		} catch (CoreException e) {
		}
	}
	
	private void generateProjectRegion(ProjectImpl project, StringBuilder sb) {
		// TODO: Project Region
	}
	
	private void generateSystemRegion(StringBuilder sb) {
		// TODO: Systems Region
	}
}
