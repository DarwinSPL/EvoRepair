package de.evorepair.analysis.solver.eclipse;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class EclipseUtil {
	public static IWorkbenchPage getActivePage() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	}
	
	public static IEditorPart getActiveEditor(){
		return getActivePage().getActiveEditor();
	}
}
