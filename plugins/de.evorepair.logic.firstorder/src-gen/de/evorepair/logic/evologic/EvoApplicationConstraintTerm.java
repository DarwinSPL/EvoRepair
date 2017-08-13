/**
 */
package de.evorepair.logic.evologic;

import de.evorepair.evolution.evovariable.EvoMappingVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Application Constraint Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.EvoApplicationConstraintTerm#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoApplicationConstraintTerm()
 * @model
 * @generated
 */
public interface EvoApplicationConstraintTerm extends EObject
{
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(EvoMappingVariable)
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoApplicationConstraintTerm_Variable()
	 * @model
	 * @generated
	 */
	EvoMappingVariable getVariable();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evologic.EvoApplicationConstraintTerm#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(EvoMappingVariable value);

} // EvoApplicationConstraintTerm
