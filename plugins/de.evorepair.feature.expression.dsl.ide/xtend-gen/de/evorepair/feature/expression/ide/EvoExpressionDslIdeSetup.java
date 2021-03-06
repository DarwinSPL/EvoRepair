/**
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.expression.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.evorepair.feature.expression.EvoExpressionDslRuntimeModule;
import de.evorepair.feature.expression.EvoExpressionDslStandaloneSetup;
import de.evorepair.feature.expression.ide.EvoExpressionDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EvoExpressionDslIdeSetup extends EvoExpressionDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    EvoExpressionDslRuntimeModule _evoExpressionDslRuntimeModule = new EvoExpressionDslRuntimeModule();
    EvoExpressionDslIdeModule _evoExpressionDslIdeModule = new EvoExpressionDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_evoExpressionDslRuntimeModule, _evoExpressionDslIdeModule));
  }
}
