/**
 */
package de.evorepair.logic.evofirstorderlogic.provider;


import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicFactory;
import de.evorepair.logic.evofirstorderlogic.EvoFirstOrderLogicPackage;
import de.evorepair.logic.evofirstorderlogic.EvoSetInclusion;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.evorepair.logic.evofirstorderlogic.EvoSetInclusion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvoSetInclusionItemProvider extends EvoAbstractSetTermItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoSetInclusionItemProvider(AdapterFactory adapterFactory)
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT);
			childrenFeatures.add(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT);
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
	 * This returns EvoSetInclusion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EvoSetInclusion"));
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
		return getString("_UI_EvoSetInclusion_type");
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

		switch (notification.getFeatureID(EvoSetInclusion.class))
		{
			case EvoFirstOrderLogicPackage.EVO_SET_INCLUSION__LEFT_ELEMENT:
			case EvoFirstOrderLogicPackage.EVO_SET_INCLUSION__RIGHT_ELEMENT:
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
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoAnd()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoOr()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoXOr()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoNot()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoUnequal()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoImplication()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoBiconditional()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetInclusion()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetUnion()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetDifference()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetSymmetricDifference()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetCartesianProduct()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetElementOf()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetNotElementOf()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoForAll()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoExist()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoUniqueExists()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoVariableTerm()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoFeatureType()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSatisfiable()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoAnd()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoOr()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoXOr()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoNot()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoUnequal()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoImplication()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoBiconditional()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetInclusion()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetUnion()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetDifference()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetSymmetricDifference()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetCartesianProduct()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetElementOf()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSetNotElementOf()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoForAll()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoExist()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoUniqueExists()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoVariableTerm()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoFeatureType()));

		newChildDescriptors.add
			(createChildParameter
				(EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT,
				 EvoFirstOrderLogicFactory.eINSTANCE.createEvoSatisfiable()));
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
			childFeature == EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__LEFT_ELEMENT ||
			childFeature == EvoFirstOrderLogicPackage.Literals.EVO_ABSTRACT_TWO_PARAMETER_TERM__RIGHT_ELEMENT;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
