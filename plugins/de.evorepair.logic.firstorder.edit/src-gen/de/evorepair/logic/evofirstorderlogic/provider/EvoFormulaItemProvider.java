/**
 */
package de.evorepair.logic.evofirstorderlogic.provider;


import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicFactory;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoFormula;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.evorepair.logic.evofirstorderlogic.EvoFormula} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvoFormulaItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoFormulaItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addTestTriggerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Test Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestTriggerPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvoFormula_testTrigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvoFormula_testTrigger_feature", "_UI_EvoFormula_type"),
				 EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TEST_TRIGGER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM);
			childrenFeatures.add(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EvoFormula.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EvoFormula"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_EvoFormula_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(EvoFormula.class))
		{
			case EvoFirstOrderLogicPackage.EVO_FORMULA__TERM:
			case EvoFirstOrderLogicPackage.EVO_FORMULA__VARIABLES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoAnd()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoOr()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoXOr()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoNot()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoUnequal()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoImplication()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoBiconditional()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetInclusion()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetUnion()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetDifference()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetSymmetricDifference()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetCartesianProduct()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetElementOf()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetNotElementOf()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoForAll()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoExist()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoUniqueExists()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoVariableTerm()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoFeatureType()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSatisfiable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoEvolutionTerm()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoApplicationConstraintVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoFeatureModelConstraintVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoPredefinedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoAllFeaturesVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoMappingAssociatedAssetsVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoMappingVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoInvolvedFeatureVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoRequirementVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoFeatureType()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSiblings()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__TERM ||
			childFeature == EvoFirstOrderLogicPackage.Literals.EVO_FORMULA__VARIABLES;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return EvoFirstOrderEditPlugin.INSTANCE;
	}

}
