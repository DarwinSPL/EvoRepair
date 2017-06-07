/**
 */
package de.evorepair.logic.evofirstorderlogic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Mapping Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoMappingVariable#getMapping <em>Mapping</em>}</li>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoMappingVariable#getContainingFeature <em>Containing Feature</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoMappingVariable()
 * @model
 * @generated
 */
public interface EvoMappingVariable extends EvoPredefinedVariable
{
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' attribute.
	 * @see #setMapping(String)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoMappingVariable_Mapping()
	 * @model required="true"
	 * @generated
	 */
	String getMapping();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoMappingVariable#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(String value);

	/**
	 * Returns the value of the '<em><b>Containing Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Feature</em>' reference.
	 * @see #setContainingFeature(EvoFormulaVariable)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoMappingVariable_ContainingFeature()
	 * @model
	 * @generated
	 */
	EvoFormulaVariable getContainingFeature();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoMappingVariable#getContainingFeature <em>Containing Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Feature</em>' reference.
	 * @see #getContainingFeature()
	 * @generated
	 */
	void setContainingFeature(EvoFormulaVariable value);

} // EvoMappingVariable
