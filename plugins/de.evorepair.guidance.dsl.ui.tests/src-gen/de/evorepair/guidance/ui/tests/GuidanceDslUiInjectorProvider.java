/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.guidance.ui.tests;

import com.google.inject.Injector;
import de.evorepair.guidance.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class GuidanceDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("de.evorepair.guidance.GuidanceDsl");
	}

}
