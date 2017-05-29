/**
 */
package de.evorepair.logic.evofirstorderlogic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Application Constraint Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoApplicationConstraintVariable#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoApplicationConstraintVariable()
 * @model
 * @generated
 */
public interface EvoApplicationConstraintVariable extends EvoEvolutionTerm {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(EvoMappingVariable)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoApplicationConstraintVariable_Mapping()
	 * @model
	 * @generated
	 */
	EvoMappingVariable getMapping();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoApplicationConstraintVariable#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(EvoMappingVariable value);

} // EvoApplicationConstraintVariable
