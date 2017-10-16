package de.evorepair.analysis.provider;

import java.util.HashMap;
import java.util.Map;


import eu.hyvar.feature.configuration.util.HyConfigurationUtil;
import eu.hyvar.feature.mapping.util.HyMappingModelUtil;

/**
 * Resource factory for different resources. To register a resource add an enum to the class with the desired tag.
 * 
 * @author Gil Engel
 *
 */
public enum EvoResourceFactory {

	CONFIGURATION {
		public String getLabel() {
			return "Configuration";
		}
		
		public String getExtension() {
			return HyConfigurationUtil.getConfigurationModelFileExtensionForXmi();
		}
		
		public boolean isVisibleWithinDialog() {
			return true;
		}

		@Override
		public synchronized EvoResourceProvider getInstance(boolean reload) {						
			return getResourceProvider(CONFIGURATION, getExtension(), reload);
		}	
	},		

	MAPPING {
		public String getLabel() {
			return "Mapping";
		}
		
		public String getExtension() {
			return HyMappingModelUtil.getMappingModelFileExtensionForConcreteSyntax();
		}
		
		public boolean isVisibleWithinDialog() {
			return true;
		}		


		@Override
		public synchronized EvoResourceProvider getInstance(boolean reload) {
			return getResourceProvider(MAPPING, getExtension(), reload);
		}
	},

	GUIDANCE {
		public String getLabel() {
			return "Guidance";
		}
		
		public String getExtension() {
			return "evoguidance";
		}
		
		public boolean isVisibleWithinDialog() {
			return false;
		}

		@Override
		public synchronized EvoResourceProvider getInstance(boolean reload) {
			return getResourceProvider(GUIDANCE,  getExtension(), reload);
		}
	},

	OPERATION {
		public String getLabel() {
			return "Operation";
		}
		
		public String getExtension() {
			return "evooperation";
		}
		
		public boolean isVisibleWithinDialog() {
			return false;
		}

		@Override
		public synchronized EvoResourceProvider getInstance(boolean reload) {
			return getResourceProvider(OPERATION, getExtension(), reload);
		}
	};	



	private static final Map<EvoResourceFactory, EvoResourceProvider> instances = new HashMap<EvoResourceFactory, EvoResourceProvider>();

	/**
	 * Gets an instance of the resource provider. You can specify with the reload parameter if the provider should reload all resources.
	 * This can be handy in case new resources where added or removed.
	 * @param reload specifiy if you want to reload all resources
	 * @return a provider that contains all found resources {@see de.evorepair.analysis.provider.EvoResourceProvider}
	 */
	public abstract EvoResourceProvider getInstance(boolean reload);
	
	/**
	 * Specifies the label for the resource that will be displayed within resource dialogs
	 * @return the label as string
	 */
	public abstract String getLabel();
	
	/**
	 * Specifies the extension of a resource
	 * @return the file extension for the resource
	 */
	public abstract String getExtension();
	
	/**
	 * Defines if the resource is visible in all resource dialogs or not
	 * @return true if the resource should be visible, false otherwise
	 */
	public abstract boolean isVisibleWithinDialog();

	private static EvoResourceProvider getResourceProvider(EvoResourceFactory resource, String fileExtension, boolean reload) {
		EvoResourceProvider resourceProvider;

		resourceProvider = instances.get(resource);

		if(resourceProvider == null) {
			resourceProvider = new EvoResourceProvider(fileExtension);
			resourceProvider.loadResources();

			instances.put(resource, resourceProvider);
		}else if(reload) {
			resourceProvider.loadResources();
		}

		
		return resourceProvider;
	}

}
