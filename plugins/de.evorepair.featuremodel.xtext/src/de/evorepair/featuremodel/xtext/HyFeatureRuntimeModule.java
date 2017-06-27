package de.evorepair.featuremodel.xtext;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
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
    
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return EvoHyFeatureModelQualifiedNameProvider.class;
    }
}
