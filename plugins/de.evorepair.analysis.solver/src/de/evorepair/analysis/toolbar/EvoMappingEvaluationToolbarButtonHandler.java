package de.evorepair.analysis.toolbar;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

import de.evorepair.analysis.provider.EvoResourceFactory;
import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.analysis.solver.eclipse.EvoEclipseUtil;

public class EvoMappingEvaluationToolbarButtonHandler extends EvoConfiguratuionEvaluationToolbarButtonHandler {
	protected EvoResourceFactory getResourceFactory() {
		return EvoResourceFactory.MAPPING;
	}
	
	@Override
	protected EvoResourceProvider getResourceProvider() {
		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();
		IEditorInput input = activeEditorPart.getEditorInput();
		IProject project = ((IFileEditorInput)input).getFile().getProject();
		
		EvoResourceProvider resourceProvider = getResourceFactory().getInstance();
		resourceProvider.clear();
		resourceProvider.loadAllResources(project.getFolder("code"));
		
		return resourceProvider;
	}
}
