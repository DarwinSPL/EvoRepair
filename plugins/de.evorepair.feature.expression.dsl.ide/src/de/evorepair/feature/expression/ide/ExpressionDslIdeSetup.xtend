/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.expression.ide

import com.google.inject.Guice
import de.evorepair.feature.expression.ExpressionDslRuntimeModule
import de.evorepair.feature.expression.ExpressionDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ExpressionDslIdeSetup extends ExpressionDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ExpressionDslRuntimeModule, new ExpressionDslIdeModule))
	}
	
}