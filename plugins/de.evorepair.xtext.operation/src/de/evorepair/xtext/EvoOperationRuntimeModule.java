package de.evorepair.xtext;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;

public class EvoOperationRuntimeModule extends AbstractGenericResourceRuntimeModule{

	@Override
	protected String getLanguageName() {
		return "de.evorepair.evolution.evooperation.presentation.EvoOperationEditor";
	}

	@Override
	protected String getFileExtensions() {
		return "evooperation";
	}

    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return DefaultResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return EvoOperationQualifiedNameProvider.class;
    }
}
