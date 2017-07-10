/**
 */
package de.evorepair.logic.evofirstorderlogic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Abstract Two Parameter Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm#getLeftElement <em>Left Element</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm#getRightElement <em>Right Element</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAbstractTwoParameterTerm()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EvoAbstractTwoParameterTerm extends EvoAbstractTerm
{
	/**
	 * Returns the value of the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Element</em>' containment reference.
	 * @see #setLeftElement(EvoAbstractTerm)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAbstractTwoParameterTerm_LeftElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EvoAbstractTerm getLeftElement();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm#getLeftElement <em>Left Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Element</em>' containment reference.
	 * @see #getLeftElement()
	 * @generated
	 */
	void setLeftElement(EvoAbstractTerm value);

	/**
	 * Returns the value of the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Element</em>' containment reference.
	 * @see #setRightElement(EvoAbstractTerm)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAbstractTwoParameterTerm_RightElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EvoAbstractTerm getRightElement();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm#getRightElement <em>Right Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Element</em>' containment reference.
	 * @see #getRightElement()
	 * @generated
	 */
	void setRightElement(EvoAbstractTerm value);

} // EvoAbstractTwoParameterTerm
