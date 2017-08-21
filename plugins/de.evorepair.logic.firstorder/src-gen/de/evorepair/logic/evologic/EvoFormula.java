/**
 */
package de.evorepair.logic.evologic;

import eu.hyvar.feature.expression.HyExpression;

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
 *   <li>{@link de.evorepair.logic.evologic.EvoFormula#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoFormula()
 * @model
 * @generated
 */
public interface EvoFormula extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(HyExpression)
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoFormula_Term()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HyExpression getTerm();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evologic.EvoFormula#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(HyExpression value);

} // EvoFormula
