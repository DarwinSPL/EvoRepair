/**
 */
package de.evorepair.logic.evologic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Parent Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.EvoParentOf#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoParentOf()
 * @model
 * @generated
 */
public interface EvoParentOf extends EvoSetTerm {
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
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoParentOf_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EvoVariableTerm getVariable();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evologic.EvoParentOf#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(EvoVariableTerm value);

} // EvoParentOf
