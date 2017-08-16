package de.evorepair.analysis.provider;

import java.util.HashMap;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import de.christophseidl.util.ecore.EcoreIOUtil;

public class EvoResourceProvider {
	private HashMap<URI, EObject> resources = new HashMap<URI, EObject>();

	private void loadAllResourcesRecursive(IResource[] resources, String fileExtension) throws CoreException {
		for(IResource resource : resources) {
			if(resource instanceof IContainer)
				loadAllResourcesRecursive(((IContainer)resource).members(), fileExtension);
			else if(resource instanceof IFile) {
				IFile file = (IFile)resource;

				if(file.getFileExtension().equals(fileExtension)) {
					EObject object = EcoreIOUtil.loadModel(file);

					this.resources.put(object.eResource().getURI(), object);
				}
			}
		}
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
