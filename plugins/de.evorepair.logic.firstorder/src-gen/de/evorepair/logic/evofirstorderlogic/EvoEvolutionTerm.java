/**
 */
package de.evorepair.logic.evofirstorderlogic;

import de.evorepair.evolution.evovariable.EvoVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Evolution Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoEvolutionTerm#isAfterEvolution <em>After Evolution</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoEvolutionTerm()
 * @model
 * @generated
 */
public interface EvoEvolutionTerm extends EvoVariable
{
	/**
	 * Returns the value of the '<em><b>After Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Evolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Evolution</em>' attribute.
	 * @see #setAfterEvolution(boolean)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoEvolutionTerm_AfterEvolution()
	 * @model
	 * @generated
	 */
	boolean isAfterEvolution();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoEvolutionTerm#isAfterEvolution <em>After Evolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Evolution</em>' attribute.
	 * @see #isAfterEvolution()
	 * @generated
	 */
	void setAfterEvolution(boolean value);

} // EvoEvolutionTerm
