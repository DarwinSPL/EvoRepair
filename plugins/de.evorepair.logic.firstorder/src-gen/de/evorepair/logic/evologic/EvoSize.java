/**
 */
package de.evorepair.logic.evologic;

import eu.hyvar.feature.expression.HyExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evo Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.evorepair.logic.evologic.EvoSize#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoSize()
 * @model
 * @generated
 */
public interface EvoSize extends HyExpression
{
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see de.evorepair.logic.evologic.EvoLogicPackage#getEvoSize_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link de.evorepair.logic.evologic.EvoSize#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // EvoSize
