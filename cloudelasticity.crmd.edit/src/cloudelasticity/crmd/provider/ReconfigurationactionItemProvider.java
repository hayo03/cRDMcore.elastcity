/**
 */
package cloudelasticity.crmd.provider;


import cloudelasticity.crmd.Reconfigurationaction;
import cloudelasticity.crmd.crmdPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link cloudelasticity.crmd.Reconfigurationaction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfigurationactionItemProvider 
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
	public ReconfigurationactionItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addCooldownPropertyDescriptor(object);
			addProviderPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addMigratenamePropertyDescriptor(object);
			addHostPropertyDescriptor(object);
			addResource_targetPropertyDescriptor(object);
			addAdjustPropertyDescriptor(object);
			addAttribute_targetPropertyDescriptor(object);
			addScalingnamePropertyDescriptor(object);
			addAdjustment_typePropertyDescriptor(object);
			addBanamePropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addAnamePropertyDescriptor(object);
			addAttributevaluePropertyDescriptor(object);
			addExecutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Reconfigurationaction_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_id_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__ID,
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
				 getString("_UI_Reconfigurationaction_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_name_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cooldown feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCooldownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_Cooldown_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_Cooldown_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__COOLDOWN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProviderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_Provider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_Provider_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__PROVIDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_type_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Migratename feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMigratenamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_migratename_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_migratename_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__MIGRATENAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_host_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResource_targetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_resource_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_resource_target_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__RESOURCE_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adjust feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdjustPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_Adjust_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_Adjust_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__ADJUST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttribute_targetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_Attribute_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_Attribute_target_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__ATTRIBUTE_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scalingname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalingnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_scalingname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_scalingname_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__SCALINGNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adjustment type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdjustment_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_adjustment_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_adjustment_type_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__ADJUSTMENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Baname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBanamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_baname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_baname_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__BANAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_label_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_action_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_aname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_aname_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__ANAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attributevalue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributevaluePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_attributevalue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_attributevalue_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__ATTRIBUTEVALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reconfigurationaction_execution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reconfigurationaction_execution_feature", "_UI_Reconfigurationaction_type"),
				 crmdPackage.Literals.RECONFIGURATIONACTION__EXECUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Reconfigurationaction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Reconfigurationaction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Reconfigurationaction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Reconfigurationaction_type") :
			getString("_UI_Reconfigurationaction_type") + " " + label;
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

		switch (notification.getFeatureID(Reconfigurationaction.class)) {
			case crmdPackage.RECONFIGURATIONACTION__ID:
			case crmdPackage.RECONFIGURATIONACTION__NAME:
			case crmdPackage.RECONFIGURATIONACTION__COOLDOWN:
			case crmdPackage.RECONFIGURATIONACTION__PROVIDER:
			case crmdPackage.RECONFIGURATIONACTION__TYPE:
			case crmdPackage.RECONFIGURATIONACTION__MIGRATENAME:
			case crmdPackage.RECONFIGURATIONACTION__HOST:
			case crmdPackage.RECONFIGURATIONACTION__RESOURCE_TARGET:
			case crmdPackage.RECONFIGURATIONACTION__ADJUST:
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTE_TARGET:
			case crmdPackage.RECONFIGURATIONACTION__SCALINGNAME:
			case crmdPackage.RECONFIGURATIONACTION__ADJUSTMENT_TYPE:
			case crmdPackage.RECONFIGURATIONACTION__BANAME:
			case crmdPackage.RECONFIGURATIONACTION__LABEL:
			case crmdPackage.RECONFIGURATIONACTION__ACTION:
			case crmdPackage.RECONFIGURATIONACTION__ANAME:
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTEVALUE:
			case crmdPackage.RECONFIGURATIONACTION__EXECUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
