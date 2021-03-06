/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.expression.ide

import com.google.inject.Guice
import de.evorepair.feature.expression.EvoExpressionDslRuntimeModule
import de.evorepair.feature.expression.EvoExpressionDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EvoExpressionDslIdeSetup extends EvoExpressionDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EvoExpressionDslRuntimeModule, new EvoExpressionDslIdeModule))
	}
	
}
