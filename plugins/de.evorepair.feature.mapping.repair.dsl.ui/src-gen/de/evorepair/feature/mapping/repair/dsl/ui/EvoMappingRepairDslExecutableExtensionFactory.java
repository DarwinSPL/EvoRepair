/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.mapping.repair.dsl.ui;

import com.google.inject.Injector;
import de.evorepair.feature.mapping.repair.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EvoMappingRepairDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DslActivator.getInstance().getInjector(DslActivator.DE_EVOREPAIR_FEATURE_MAPPING_REPAIR_DSL_EVOMAPPINGREPAIRDSL);
	}
	
}