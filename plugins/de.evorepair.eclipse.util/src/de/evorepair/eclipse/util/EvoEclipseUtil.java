package de.evorepair.eclipse.util;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class EvoEclipseUtil {
	public static IWorkbenchPage getActivePage() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	}
	
	public static IEditorPart getActiveEditor(){
		return getActivePage().getActiveEditor();
	}
	
	public static URI platformURIForRelativeFile(EObject object, String relativePathToAnotherFile) {
		List<String> uriFragments = object.eResource().getURI().segmentsList();
		uriFragments = uriFragments.subList(0, uriFragments.size()-1);
		
		String uri = "platform:/"+String.join("/", uriFragments);
		uri += '/'+relativePathToAnotherFile;
		
		return URI.createURI(uri);
	}
	
	public static void removeSolutionFoldersRecursiveFromFile(IFile file) {
		try {
			file.delete(true, null);
			IContainer container = file.getParent();
			container.delete(true, null);

			while(!(container.getParent() instanceof IProject) && container.getParent().members().length == 0) {
				container.getParent().delete(true, null);

				container = container.getParent();
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
