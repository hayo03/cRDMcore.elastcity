/**
 */
package cloudelasticity.crmd.provider;


import cloudelasticity.crmd.Compositereconfiguration;
import cloudelasticity.crmd.crmdFactory;
import cloudelasticity.crmd.crmdPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cloudelasticity.crmd.Compositereconfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositereconfigurationItemProvider extends ReconfigurationactionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositereconfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCrnamePropertyDescriptor(object);
			addActionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Crname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compositereconfiguration_crname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compositereconfiguration_crname_feature", "_UI_Compositereconfiguration_type"),
				 crmdPackage.Literals.COMPOSITERECONFIGURATION__CRNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compositereconfiguration_actions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compositereconfiguration_actions_feature", "_UI_Compositereconfiguration_type"),
				 crmdPackage.Literals.COMPOSITERECONFIGURATION__ACTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(crmdPackage.Literals.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Compositereconfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Compositereconfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Compositereconfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Compositereconfiguration_type") :
			getString("_UI_Compositereconfiguration_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Compositereconfiguration.class)) {
			case crmdPackage.COMPOSITERECONFIGURATION__CRNAME:
			case crmdPackage.COMPOSITERECONFIGURATION__ACTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case crmdPackage.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createReconfigurationaction()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createBasicAction()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createMigration()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createHorizontalscaling()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createVerticalscaling()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createCompositereconfiguration()));
	}

}
