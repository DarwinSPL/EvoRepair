package de.evorepair.analysis.provider;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.evorepair.analysis.solver.eclipse.EvoEclipseUtil;

public class EvoResourceProvider {
	String fileExtension;
	
	EvoResourceProvider(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	
	private Map<URI, EObject> resources = new HashMap<URI, EObject>();

	private void loadAllResourcesRecursive(IResource[] resources, String fileExtension) throws CoreException {
		for(IResource resource : resources) {
			if(resource instanceof IContainer) {
				//if(!((IContainer)resource).getName().equals(EvoConfigurationRepairSuggestionViewer.SUGGESTIONS_FOLDER))
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
		/*
		Map<URI, EObject> result = new HashMap<URI, EObject> (resources);
		for(URI r : resources.keySet())
			result.put(r, resources.get(r));
		return result;
		*/
	}
	
	public void setResources(Map<URI, EObject> resources) {
		this.resources = resources;
	}
	
	public void addResource(EObject resource) {
		resources.put(resource.eResource().getURI(), resource);
	}
	
	public void clear() {
		resources.clear();
	}


	public void loadResources() {
		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();
		IEditorInput input = activeEditorPart.getEditorInput();
		loadAllResources(((IFileEditorInput)input).getFile().getProject());
	}
	
	public void loadAllResources(IContainer folder) {
		try {
			loadAllResourcesRecursive(folder.members(), fileExtension);
			Comparator<Entry<URI, EObject>> valueComparator = new Comparator<Map.Entry<URI,EObject>>() {
				
				@Override
				public int compare(Entry<URI, EObject> o1, Entry<URI, EObject> o2) {
					return o1.getKey().toString().compareTo(o2.getKey().toString());
				}
			};
				    
			Map<URI, EObject> sortedMap =  resources.entrySet().stream().sorted(valueComparator).
				    	    collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));				
			
			resources = sortedMap;
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public EObject getResource(URI mappingFile) {
		return resources.get(mappingFile);
	}
	
	public EvoResourceProvider clone() {
		EvoResourceProvider clone = new EvoResourceProvider(fileExtension);
		Map<URI, EObject> result = new HashMap<URI, EObject> (resources);
		for(URI r : resources.keySet())
			result.put(r, resources.get(r));
		clone.getResources().putAll(result);	
		return clone;		
	}
}
