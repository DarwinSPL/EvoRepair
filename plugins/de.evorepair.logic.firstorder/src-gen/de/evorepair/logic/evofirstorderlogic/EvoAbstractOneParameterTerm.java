/**
 */
package de.evorepair.logic.evofirstorderlogic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Abstract One Parameter Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAbstractOneParameterTerm()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EvoAbstractOneParameterTerm extends EvoAbstractTerm
{
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(EvoAbstractTerm)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAbstractOneParameterTerm_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EvoAbstractTerm getElement();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractOneParameterTerm#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EvoAbstractTerm value);

} // EvoAbstractOneParameterTerm
