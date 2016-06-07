package rslingo.rslil.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;

public class NewRSLILWizard extends Wizard implements INewWizard {
	private NewRSLILWizardPage page;
	private ISelection selection;

	public NewRSLILWizard() {
		super();
		setWindowTitle("New RSL-IL File");
		setNeedsProgressMonitor(true);
	}
	
	public void addPages() {
		page = new NewRSLILWizardPage(selection);
		addPage(page);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
	
	@Override
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
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
	
	private void doFinish(String containerName, String fileName, IProgressMonitor monitor)
			throws CoreException {
		// Create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		
		try {
			InputStream stream = openContentStream();
			
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}
	
	private InputStream openContentStream() {
		StringBuilder sb = new StringBuilder();
		sb.append("Package-Project New_Package_Project {");
		sb.append("\n\n");
		sb.append("\tProject New_project {");
		sb.append("\n");
		sb.append("\t\tName \"New Project\"");
		sb.append("\n");
		sb.append("\t\tType Research");
		sb.append("\n");
		sb.append("\t\tApplicationDomain Education");
		sb.append("\n");
		sb.append("\t\tPlannedSchedule {");
		sb.append("\n");
		sb.append("\t\t\tStart 1-Jun-2016");
		sb.append("\n");
		sb.append("\t\t\tEnd 1-Jun-2017");
		sb.append("\n");
		sb.append("\t\t}");
		sb.append("\n");
		sb.append("\t\tActualSchedule {");
		sb.append("\n");
		sb.append("\t\t\tStart 6-Jun-2016");
		sb.append("\n");
		sb.append("\t\t}");
		sb.append("\n");
		sb.append("\t\tOrganizations {");
		sb.append("\n");
		sb.append("\t\t\tCustomer \"Customer1\"");
		sb.append("\n");
		sb.append("\t\t\tSupplier \"Supplier1\"");
		sb.append("\n");
		sb.append("\t\t\tPartners \"Partner1\"");
		sb.append("\n");
		sb.append("\t\t}");
		sb.append("\n");
		sb.append("\t\tProjectProgress Plan");
		sb.append("\n");
		sb.append("\t\tSummary \"New Project's summary\"");
		sb.append("\n");
		sb.append("\t\tDescription \"New Project's description\"");
		sb.append("\n\t}");
		sb.append("\n}");
		return new ByteArrayInputStream(sb.toString().getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status = 
				new Status(IStatus.ERROR, "rslingo.rslil", IStatus.OK, message, null);
		throw new CoreException(status);
	}
}