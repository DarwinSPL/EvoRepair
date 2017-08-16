package de.evorepair.analysis.solver.eclipse;

import java.util.List;

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
}
