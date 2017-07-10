/**
 */
package de.evorepair.logic.evofirstorderlogic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Satisfiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoSatisfiable#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoSatisfiable()
 * @model
 * @generated
 */
public interface EvoSatisfiable extends EvoAbstractTerm
{
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoSatisfiable_Variables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EvoAbstractTerm> getVariables();

} // EvoSatisfiable
