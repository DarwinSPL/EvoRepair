/**
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.expression;

import de.evorepair.feature.expression.EvoExpressionDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class EvoExpressionDslStandaloneSetup extends EvoExpressionDslStandaloneSetupGenerated {
  public static void doSetup() {
    new EvoExpressionDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}