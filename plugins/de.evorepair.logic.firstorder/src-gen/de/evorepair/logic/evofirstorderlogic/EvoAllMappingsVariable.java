/**
 */
package de.evorepair.logic.evofirstorderlogic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo All Mappings Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoAllMappingsVariable#getAssociatedMappings <em>Associated Mappings</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAllMappingsVariable()
 * @model
 * @generated
 */
public interface EvoAllMappingsVariable extends EObject
{
	/**
	 * Returns the value of the '<em><b>Associated Mappings</b></em>' reference list.
	 * The list contents are of type {@link de.evorepair.logic.evofirstorderlogic.EvoMappingVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Mappings</em>' reference list.
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAllMappingsVariable_AssociatedMappings()
	 * @model
	 * @generated
	 */
	EList<EvoMappingVariable> getAssociatedMappings();

} // EvoAllMappingsVariable
