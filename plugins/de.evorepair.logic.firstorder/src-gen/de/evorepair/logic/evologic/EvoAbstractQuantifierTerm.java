/**
 */
package de.evorepair.logic.evologic;

import eu.hyvar.feature.expression.HyExpression;
import eu.hyvar.feature.expression.HyUnaryExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Abstract Quantifier Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.EvoAbstractQuantifierTerm#getBoundedVariables <em>Bounded Variables</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoAbstractQuantifierTerm()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EvoAbstractQuantifierTerm extends HyExpression, HyUnaryExpression
{
	/**
	 * Returns the value of the '<em><b>Bounded Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.evorepair.logic.evologic.EvoVariableTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Variables</em>' containment reference list.
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoAbstractQuantifierTerm_BoundedVariables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EvoVariableTerm> getBoundedVariables();

} // EvoAbstractQuantifierTerm
