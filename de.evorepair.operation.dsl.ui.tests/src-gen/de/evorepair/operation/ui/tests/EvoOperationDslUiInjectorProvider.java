/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.operation.ui.tests;

import com.google.inject.Injector;
import de.evorepair.operation.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class EvoOperationDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("de.evorepair.operation.EvoOperationDsl");
	}

}
