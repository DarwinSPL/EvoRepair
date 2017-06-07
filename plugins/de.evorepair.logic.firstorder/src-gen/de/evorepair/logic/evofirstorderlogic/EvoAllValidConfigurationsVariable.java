/**
 */
package de.evorepair.logic.evofirstorderlogic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo All Valid Configurations Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evofirstorderlogic.EvoAllValidConfigurationsVariable#getFeatureVariable <em>Feature Variable</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAllValidConfigurationsVariable()
 * @model
 * @generated
 */
public interface EvoAllValidConfigurationsVariable extends EObject
{
	/**
	 * Returns the value of the '<em><b>Feature Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Variable</em>' reference.
	 * @see #setFeatureVariable(EvoFormulaVariable)
	 * @see de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage#getEvoAllValidConfigurationsVariable_FeatureVariable()
	 * @model
	 * @generated
	 */
	EvoFormulaVariable getFeatureVariable();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evofirstorderlogic.EvoAllValidConfigurationsVariable#getFeatureVariable <em>Feature Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Variable</em>' reference.
	 * @see #getFeatureVariable()
	 * @generated
	 */
	void setFeatureVariable(EvoFormulaVariable value);

} // EvoAllValidConfigurationsVariable
