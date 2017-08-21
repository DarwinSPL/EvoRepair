/**
 */
package de.evorepair.logic.evologic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Siblings Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.EvoSiblingsOf#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoSiblingsOf()
 * @model
 * @generated
 */
public interface EvoSiblingsOf extends EvoSetTerm {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(EvoVariableTerm)
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoSiblingsOf_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EvoVariableTerm getVariable();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evologic.EvoSiblingsOf#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(EvoVariableTerm value);

} // EvoSiblingsOf
