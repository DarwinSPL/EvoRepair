/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.evolution.variable.ui.tests;

import com.google.inject.Injector;
import de.evorepair.evolution.variable.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class EvoVariableDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("de.evorepair.evolution.variable.EvoVariableDsl");
	}

}
