/**
 */
package de.evorepair.logic.evologic.impl;

import de.evorepair.logic.evologic.EvoLogicPackage;
import de.evorepair.logic.evologic.EvoNot;

import eu.hyvar.feature.expression.impl.HyUnaryExpressionImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evo Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EvoNotImpl extends HyUnaryExpressionImpl implements EvoNot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoNotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvoLogicPackage.Literals.EVO_NOT;
	}

} //EvoNotImpl
