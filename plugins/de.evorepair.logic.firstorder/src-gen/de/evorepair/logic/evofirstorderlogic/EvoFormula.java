/**
 */
package de.evorepair.logic.evofirstorderlogic;

import de.evorepair.evolution.evooperation.EvoOperation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoFormula#getTerm <em>Term</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoFormula#getTestTrigger <em>Test Trigger</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoFormula()
 * @model
 * @generated
 */
public interface EvoFormula extends EObject
{
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(EvoAbstractTerm)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoFormula_Term()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EvoAbstractTerm getTerm();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoFormula#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(EvoAbstractTerm value);

	/**
	 * Returns the value of the '<em><b>Test Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Trigger</em>' reference.
	 * @see #setTestTrigger(EvoOperation)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoFormula_TestTrigger()
	 * @model
	 * @generated
	 */
	EvoOperation getTestTrigger();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoFormula#getTestTrigger <em>Test Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Trigger</em>' reference.
	 * @see #getTestTrigger()
	 * @generated
	 */
	void setTestTrigger(EvoOperation value);

} // EvoFormula
