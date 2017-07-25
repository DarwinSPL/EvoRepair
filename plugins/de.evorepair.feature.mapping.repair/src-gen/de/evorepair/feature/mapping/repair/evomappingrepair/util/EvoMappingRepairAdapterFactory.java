/**
 */
package de.evorepair.feature.mapping.repair.evomappingrepair.util;

import de.evorepair.feature.mapping.repair.evomappingrepair.*;

import eu.hyvar.feature.expression.HyBinaryExpression;
import eu.hyvar.feature.expression.HyExpression;
import eu.hyvar.feature.expression.HyUnaryExpression;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairPackage
 * @generated
 */
public class EvoMappingRepairAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvoMappingRepairPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoMappingRepairAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = EvoMappingRepairPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvoMappingRepairSwitch<Adapter> modelSwitch =
		new EvoMappingRepairSwitch<Adapter>()
		{
			@Override
			public Adapter caseEvoMappingRepairExpression(EvoMappingRepairExpression object)
			{
				return createEvoMappingRepairExpressionAdapter();
			}
			@Override
			public Adapter caseEvoMappingKeep(EvoMappingKeep object)
			{
				return createEvoMappingKeepAdapter();
			}
			@Override
			public Adapter caseEvoMappingReplace(EvoMappingReplace object)
			{
				return createEvoMappingReplaceAdapter();
			}
			@Override
			public Adapter caseHyExpression(HyExpression object)
			{
				return createHyExpressionAdapter();
			}
			@Override
			public Adapter caseHyUnaryExpression(HyUnaryExpression object)
			{
				return createHyUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseHyBinaryExpression(HyBinaryExpression object)
			{
				return createHyBinaryExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingRepairExpression
	 * @generated
	 */
	public Adapter createEvoMappingRepairExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingKeep <em>Evo Mapping Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingKeep
	 * @generated
	 */
	public Adapter createEvoMappingKeepAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingReplace <em>Evo Mapping Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.evorepair.feature.mapping.repair.evomappingrepair.EvoMappingReplace
	 * @generated
	 */
	public Adapter createEvoMappingReplaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.hyvar.feature.expression.HyExpression <em>Hy Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.hyvar.feature.expression.HyExpression
	 * @generated
	 */
	public Adapter createHyExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.hyvar.feature.expression.HyUnaryExpression <em>Hy Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.hyvar.feature.expression.HyUnaryExpression
	 * @generated
	 */
	public Adapter createHyUnaryExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.hyvar.feature.expression.HyBinaryExpression <em>Hy Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.hyvar.feature.expression.HyBinaryExpression
	 * @generated
	 */
	public Adapter createHyBinaryExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //EvoMappingRepairAdapterFactory
