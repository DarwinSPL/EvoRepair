/**
 */
package de.evorepair.logic.evologic;

import eu.hyvar.feature.expression.HyExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Set Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.EvoSetTerm#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoSetTerm()
 * @model
 * @generated
 */
public interface EvoSetTerm extends HyExpression
{
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link eu.hyvar.feature.expression.HyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoSetTerm_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<HyExpression> getVariables();

} // EvoSetTerm
