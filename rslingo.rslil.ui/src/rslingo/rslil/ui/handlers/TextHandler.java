package rslingo.rslil.ui.handlers;

import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
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
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import rslingo.rslil.generator.RSLILGenerator;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.ui.windows.MenuCommand;
import rslingo.rslil.ui.windows.MenuCommandWindow;

public class TextHandler extends AbstractHandler {

	private static final String GEN_FOLDER = "src-gen";
	private static final String FILE_EXT = ".rslil";
	
	@Inject
    private RSLILGenerator generator;
 
    @Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
     
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
				IProject project = file.getProject();
				generateTextFile(project, file, shell);
			} else {
				IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
				IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
				IProject project = file.getProject();
				generateTextFile(project, file, shell);
			}
		} else {
			MenuCommand cmd = new MenuCommand() {
				@Override
				public void execute(IProject project, IFile file) {
					generateTextFile(project, file, shell);
				}
			};
			MenuCommandWindow window = new MenuCommandWindow(shell, cmd, false, FILE_EXT);
			window.open();
		}
		
		return null;
	}

	private void generateTextFile(IProject project, IFile file, Shell shell) {
		IFolder srcGenFolder = project.getFolder(GEN_FOLDER);
        
        if (!srcGenFolder.exists()) {
            try {
				srcGenFolder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
        }
 
        final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
        fsa.setOutputPath(srcGenFolder.getName());
        fsa.setMonitor(new NullProgressMonitor());
        fsa.setProject(project);
         
        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        ResourceSet rs = resourceSetProvider.get(project);
        Resource resource = rs.getResource(uri, true);
        
        if (resource.getContents().get(0) instanceof PackageProject) {
        	PackageProject packageProj = (PackageProject) resource.getContents().get(0);
        	
			if (packageProj.getImports().size() == 0) {
				// Single File
				generator.setGenMode(RSLILGenerator.TEXT_MODE);
		        generator.doGenerate(resource, fsa);
			} else {
				// Master File
				packageProj = DocumentHelper.getFullPackageProject(project, rs, packageProj);
				
				try {
					// Create Merged File
					String mergedPath = file.getFullPath().toString()
							.replace(file.getName(), "Merged" + file.getName());
					resource = rs.createResource(URI.createPlatformResourceURI(mergedPath, true));
					resource.getContents().add(packageProj);
					resource.save(Collections.EMPTY_MAP);
					// Generate Text File
					generator.setGenMode(RSLILGenerator.TEXT_MODE);
			        generator.doGenerate(resource, fsa);
			        project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (Exception e) {
					e.printStackTrace();
				}
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
		}
	}
}
