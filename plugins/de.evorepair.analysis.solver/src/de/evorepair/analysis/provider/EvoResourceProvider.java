package de.evorepair.analysis.provider;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
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
import de.evorepair.eclipse.util.EvoEclipseUtil;

/**
 * Provider to load resources of a specific type within a folder. It will determine all resources recursively.
 * @author Gil Engel
 *
 */
public class EvoResourceProvider {
	String fileExtension;

	/**
	 * Create a new resource provider for resources with the given file extension
	 * @param fileExtension defines the extension for all resources to be found by the provider
	 */
	public EvoResourceProvider(String fileExtension) {
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
					try {
						EObject object = EcoreIOUtil.loadModel(file);

						this.resources.put(object.eResource().getURI(), object);
					}catch(Exception e) {
					}
				}
			}
		}
	}

	/**
	 * Returns all resources that where found by the provider
	 * @return a map of found resources
	 */
	public Map<URI, EObject> getResources() {
		return resources;
	}

	/**
	 * Sets all resources and overwrites all previous found resources
	 * @param resources a map of resources to replace all resources within this provider.
	 */
	public void setResources(Map<URI, EObject> resources) {
		this.resources = resources;
	}

	/**
	 * Adds a resource to the resource map of the provider
	 * @param resource the resource to be added to the map
	 */
	public void addResource(EObject resource) {
		resources.put(resource.eResource().getURI(), resource);
	}

	/**
	 * Clears the resource map of the provider
	 */
	public void clear() {
		resources.clear();
	}

	/**
	 * loads all resources of the given type within the folder of the active editor within Eclipse.
	 */
	public void loadResources() {
		resources.clear();

		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();
		IEditorInput input = activeEditorPart.getEditorInput();
		loadAllResources(((IFileEditorInput)input).getFile().getProject());
	}

	/**
	 * Loads all resources recursively but from a specific root folder.
	 * @param folder the root folder where that the provider will use as a root folder to search for resources.
	 */
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

	/**
	 * Gets a specific resource of the map
	 * @param resourceFile key of the resource file
	 * @return the resource saved with the given key
	 */
	public EObject getResource(URI resourceFile) {
		return resources.get(resourceFile);
	}

	/**
	 * Creates a clone of the resource provider
	 */
	public EvoResourceProvider clone() {
		EvoResourceProvider clone = new EvoResourceProvider(fileExtension);
		Map<URI, EObject> result = new HashMap<URI, EObject> (resources);
		for(URI r : resources.keySet())
			result.put(r, resources.get(r));
		clone.getResources().putAll(result);	
		return clone;		
	}
}
