package de.evorepair.xtext.util.hyfeature;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class HyFeatureRuntimeModule extends AbstractGenericResourceRuntimeModule {
	 
    @Override
    protected String getLanguageName() {
        return "eu.hyvar.feature.presentation.HyFeatureEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
        return "hyfeature";
    }
 
    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return HyFeatureResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return HyFeatureQualifiedNameProvider.class;
    }
}
