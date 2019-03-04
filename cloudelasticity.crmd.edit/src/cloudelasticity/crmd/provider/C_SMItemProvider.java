/**
 */
package cloudelasticity.crmd.provider;


import cloudelasticity.crmd.C_SM;
import cloudelasticity.crmd.crmdFactory;
import cloudelasticity.crmd.crmdPackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cloudelasticity.crmd.C_SM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class C_SMItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C_SMItemProvider(AdapterFactory adapterFactory) {
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

			addStartdatePropertyDescriptor(object);
			addEnddatePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Startdate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_C_SM_startdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_C_SM_startdate_feature", "_UI_C_SM_type"),
				 crmdPackage.Literals.CSM__STARTDATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enddate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnddatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_C_SM_enddate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_C_SM_enddate_feature", "_UI_C_SM_type"),
				 crmdPackage.Literals.CSM__ENDDATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_C_SM_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_C_SM_id_feature", "_UI_C_SM_type"),
				 crmdPackage.Literals.CSM__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_C_SM_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_C_SM_name_feature", "_UI_C_SM_type"),
				 crmdPackage.Literals.CSM__NAME,
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
			childrenFeatures.add(crmdPackage.Literals.CSM__TRANSITION);
			childrenFeatures.add(crmdPackage.Literals.CSM__STATE);
			childrenFeatures.add(crmdPackage.Literals.CSM__CSMREQUIRMENT);
			childrenFeatures.add(crmdPackage.Literals.CSM__CEVENT);
			childrenFeatures.add(crmdPackage.Literals.CSM__CRECONFIGURATIONACTION);
			childrenFeatures.add(crmdPackage.Literals.CSM__CSM_TSA);
			childrenFeatures.add(crmdPackage.Literals.CSM__TTCRANSITION);
			childrenFeatures.add(crmdPackage.Literals.CSM__TCSTATE);
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
	 * This returns C_SM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/C_SM"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((C_SM)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_C_SM_type") :
			getString("_UI_C_SM_type") + " " + label;
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

		switch (notification.getFeatureID(C_SM.class)) {
			case crmdPackage.CSM__STARTDATE:
			case crmdPackage.CSM__ENDDATE:
			case crmdPackage.CSM__ID:
			case crmdPackage.CSM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case crmdPackage.CSM__TRANSITION:
			case crmdPackage.CSM__STATE:
			case crmdPackage.CSM__CSMREQUIRMENT:
			case crmdPackage.CSM__CEVENT:
			case crmdPackage.CSM__CRECONFIGURATIONACTION:
			case crmdPackage.CSM__CSM_TSA:
			case crmdPackage.CSM__TTCRANSITION:
			case crmdPackage.CSM__TCSTATE:
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
				(crmdPackage.Literals.CSM__TRANSITION,
				 crmdFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__STATE,
				 crmdFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__STATE,
				 crmdFactory.eINSTANCE.createNormalState()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__STATE,
				 crmdFactory.eINSTANCE.createInitialState()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__STATE,
				 crmdFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CSMREQUIRMENT,
				 crmdFactory.eINSTANCE.createResourcerequirment()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CSMREQUIRMENT,
				 crmdFactory.eINSTANCE.createCloudResourcerequirment()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CSMREQUIRMENT,
				 crmdFactory.eINSTANCE.createStateResourcerequirment()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CEVENT,
				 crmdFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CRECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createReconfigurationaction()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CRECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createBasicAction()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CRECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createMigration()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CRECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createHorizontalscaling()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CRECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createVerticalscaling()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CRECONFIGURATIONACTION,
				 crmdFactory.eINSTANCE.createCompositereconfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__CSM_TSA,
				 crmdFactory.eINSTANCE.createTSA()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__TTCRANSITION,
				 crmdFactory.eINSTANCE.createTtransition()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__TTCRANSITION,
				 crmdFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__TTCRANSITION,
				 crmdFactory.eINSTANCE.createNormaltransilien()));

		newChildDescriptors.add
			(createChildParameter
				(crmdPackage.Literals.CSM__TCSTATE,
				 crmdFactory.eINSTANCE.createTstate()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CrmdEditPlugin.INSTANCE;
	}

}
