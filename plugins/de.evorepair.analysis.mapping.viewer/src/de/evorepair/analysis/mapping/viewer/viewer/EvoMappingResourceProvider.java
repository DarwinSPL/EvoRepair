package de.evorepair.analysis.mapping.viewer.viewer;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class EvoMappingResourceProvider implements IEditedResourceProvider{
	
	@Inject
	private IResourceSetProvider resourceSetProvider;
	
	@Inject
	private FileExtensionProvider extensionProvider;
	
	XtextResource realResource;
	
	
	
	public XtextResource getRealResource() {
		return realResource;
	}



	public void setRealResource(XtextResource realResource) {
		this.realResource = realResource;
	}



	@Override
	public XtextResource createResource() {
		return realResource;
/*
		IWorkbench workbench = PlatformUI.getWorkbench();
		if(workbench == null) return null;
		
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		if (workbenchWindow == null) return null;
		
		//workbenchWindow.getSelectionService()
		
		IWorkbenchPage workbenchPage = workbenchWindow.getActivePage();
		if (workbenchPage == null) return null;
		
		IEditorPart ieditorpart = workbenchPage.getActiveEditor();
		
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IWorkspace workspace = root.getWorkspace();
        
       //root.getProjects()
		
		ResourceSet resourceSet = resourceSetProvider.get(null);
		
		URI uri = URI.createURI("synthetic:/mail."+extensionProvider.getPrimaryFileExtension());
		XtextResource result = (XtextResource)resourceSet.createResource(uri);
		resourceSet.getResources().add(result);
		
		return result;
		*/
	}

}
