/**
 */
package de.evorepair.logic.evofirstorderlogic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Mapping Associated Assets Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoMappingAssociatedAssetsVariable#getAssociatedMapping <em>Associated Mapping</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoMappingAssociatedAssetsVariable()
 * @model
 * @generated
 */
public interface EvoMappingAssociatedAssetsVariable extends EvoEvolutionTerm
{
	/**
	 * Returns the value of the '<em><b>Associated Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Mapping</em>' reference.
	 * @see #setAssociatedMapping(EvoMappingVariable)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoMappingAssociatedAssetsVariable_AssociatedMapping()
	 * @model
	 * @generated
	 */
	EvoMappingVariable getAssociatedMapping();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoMappingAssociatedAssetsVariable#getAssociatedMapping <em>Associated Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Mapping</em>' reference.
	 * @see #getAssociatedMapping()
	 * @generated
	 */
	void setAssociatedMapping(EvoMappingVariable value);

} // EvoMappingAssociatedAssetsVariable
