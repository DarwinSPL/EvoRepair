package de.evorepair.analysis.provider;

import java.util.HashMap;
import java.util.Map;


import eu.hyvar.feature.configuration.util.HyConfigurationUtil;
import eu.hyvar.feature.mapping.util.HyMappingModelUtil;

public enum EvoResourceFactory {

	CONFIGURATION {
		public String getLabel() {
			return "Configuration";
		}
		
		public String getExtension() {
			return HyConfigurationUtil.getConfigurationModelFileExtensionForXmi();
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

		@Override
		public synchronized EvoResourceProvider getInstance(boolean reload) {
			return getResourceProvider(OPERATION, getExtension(), reload);
		}
	};	



	private static final Map<EvoResourceFactory, EvoResourceProvider> instances = new HashMap<EvoResourceFactory, EvoResourceProvider>();

	public abstract EvoResourceProvider getInstance(boolean reload);
	public abstract String getLabel();
	public abstract String getExtension();

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
