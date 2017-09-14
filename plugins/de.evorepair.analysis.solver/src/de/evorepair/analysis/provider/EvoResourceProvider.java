package de.evorepair.analysis.provider;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.evorepair.analysis.viewer.viewer.EvoRepairSuggestionViewer;

public class EvoResourceProvider {
	private Map<URI, EObject> resources = new HashMap<URI, EObject>();

	private void loadAllResourcesRecursive(IResource[] resources, String fileExtension) throws CoreException {
		for(IResource resource : resources) {
			if(resource instanceof IContainer) {
				if(!((IContainer)resource).getName().equals(EvoRepairSuggestionViewer.SUGGESTIONS_FOLDER))
					loadAllResourcesRecursive(((IContainer)resource).members(), fileExtension);
			}else if(resource instanceof IFile) {
				IFile file = (IFile)resource;

				if(file.getFileExtension().equals(fileExtension)) {
					EObject object = EcoreIOUtil.loadModel(file);

					this.resources.put(object.eResource().getURI(), object);
				}
			}
		}
	}
	
	

	public Map<URI, EObject> getResources() {
		return resources;
	}
	
	public void setResources(Map<URI, EObject> resources) {
		this.resources = resources;
	}



	public void loadAllResources(IProject project, String fileExtension) {
		try {
			loadAllResourcesRecursive(project.members(), fileExtension);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public EObject getResource(URI mappingFile) {
		return resources.get(mappingFile);
	}
}
