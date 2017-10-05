package de.evorepair.analysis.provider;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

import de.evorepair.analysis.solver.eclipse.EvoEclipseUtil;
import eu.hyvar.feature.configuration.util.HyConfigurationUtil;
import eu.hyvar.feature.mapping.util.HyMappingModelUtil;

public enum EvoResourceFactory {

	CONFIGURATION {
		public String getLabel() {
			return "Configuration";
		}

		@Override
		public synchronized EvoResourceProvider getInstance() {						
			return getResourceProvider(CONFIGURATION, HyConfigurationUtil.getConfigurationModelFileExtensionForXmi());
		}	
	},		

	MAPPING {
		public String getLabel() {
			return "Mapping";
		}

		@Override
		public synchronized EvoResourceProvider getInstance() {
			return getResourceProvider(MAPPING, HyMappingModelUtil.getMappingModelFileExtensionForConcreteSyntax());
		}
	},

	GUIDANCE {
		public String getLabel() {
			return "Guidance";
		}

		@Override
		public synchronized EvoResourceProvider getInstance() {
			return getResourceProvider(GUIDANCE, "evoguidance");
		}
	},

	OPERATION {
		public String getLabel() {
			return "Operation";
		}

		@Override
		public synchronized EvoResourceProvider getInstance() {
			return getResourceProvider(OPERATION, "evooperation");
		}
	};	



	private static final Map<EvoResourceFactory, EvoResourceProvider> instances = new HashMap<EvoResourceFactory, EvoResourceProvider>();

	public abstract EvoResourceProvider getInstance();
	public abstract String getLabel();

	private static EvoResourceProvider getResourceProvider(EvoResourceFactory resource, String fileExtension) {
		EvoResourceProvider resourceProvider;

		resourceProvider = instances.get(resource);

		if(resourceProvider == null) {
			resourceProvider = new EvoResourceProvider(fileExtension);
			resourceProvider.loadResources();

			instances.put(resource, resourceProvider);
		}	


		return resourceProvider;
	}

	public EvoResourceProvider concatenate(EvoResourceFactory other) {
		EvoResourceProvider result = new EvoResourceProvider(null);
		result.getResources().putAll(getInstance().getResources());
		result.getResources().putAll(other.getInstance().getResources());

		return result;
	}	
}
