package de.evorepair.xtext.variable;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;

public class EvoVariableRuntimeModule extends AbstractGenericResourceRuntimeModule{

	@Override
	protected String getLanguageName() {
		return "de.evorepair.evolution.evovariable.presentation.EvoVariableEditor";
	}

	@Override
	protected String getFileExtensions() {
		return "evovariable";
	}

    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return DefaultResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return DefaultDeclarativeQualifiedNameProvider.class;
    }
}
