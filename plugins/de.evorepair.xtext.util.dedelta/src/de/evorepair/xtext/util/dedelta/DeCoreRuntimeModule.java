package de.evorepair.xtext.util.dedelta;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class DeCoreRuntimeModule extends AbstractGenericResourceRuntimeModule {
	 
    @Override
    protected String getLanguageName() {
        return "org.deltaecore.core.decore.presentation.DEcoreEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
        return "decore";
    }
 
    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return DeCoreResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return DeCoreQualifiedNameProvider.class;
    }
}
