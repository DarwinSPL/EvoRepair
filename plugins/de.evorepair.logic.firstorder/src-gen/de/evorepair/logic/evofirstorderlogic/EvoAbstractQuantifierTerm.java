/**
 */
package de.evorepair.logic.evofirstorderlogic;

import de.evorepair.evolution.evovariable.EvoVariable;

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
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractQuantifierTerm#getBoundedVariables <em>Bounded Variables</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAbstractQuantifierTerm()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EvoAbstractQuantifierTerm extends EvoAbstractTerm, EvoAbstractOneParameterTerm
{
	/**
	 * Returns the value of the '<em><b>Bounded Variables</b></em>' reference list.
	 * The list contents are of type {@link de.evorepair.evolution.evovariable.EvoVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Variables</em>' reference list.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAbstractQuantifierTerm_BoundedVariables()
	 * @model required="true"
	 * @generated
	 */
	EList<EvoVariable> getBoundedVariables();

} // EvoAbstractQuantifierTerm
