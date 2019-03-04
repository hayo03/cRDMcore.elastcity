/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Adjustmenttype;
import cloudelasticity.crmd.Attributename;
import cloudelasticity.crmd.Basicactionname;
import cloudelasticity.crmd.Executiontype;
import cloudelasticity.crmd.Migrationtype;
import cloudelasticity.crmd.Reconfigurationaction;
import cloudelasticity.crmd.Reconfigurationactiontype;
import cloudelasticity.crmd.Scalingnames;
import cloudelasticity.crmd.crmdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfigurationaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getCooldown <em>Cooldown</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getType <em>Type</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getMigratename <em>Migratename</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getHost <em>Host</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getResource_target <em>Resource target</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getAdjust <em>Adjust</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getAttribute_target <em>Attribute target</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getScalingname <em>Scalingname</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getAdjustment_type <em>Adjustment type</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getBaname <em>Baname</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getAname <em>Aname</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getAttributevalue <em>Attributevalue</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ReconfigurationactionImpl#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationactionImpl extends MinimalEObjectImpl.Container implements Reconfigurationaction {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooldown() <em>Cooldown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldown()
	 * @generated
	 * @ordered
	 */
	protected static final int COOLDOWN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCooldown() <em>Cooldown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldown()
	 * @generated
	 * @ordered
	 */
	protected int cooldown = COOLDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Migrationtype TYPE_EDEFAULT = Migrationtype.COLD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Migrationtype type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMigratename() <em>Migratename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigratename()
	 * @generated
	 * @ordered
	 */
	protected static final String MIGRATENAME_EDEFAULT = "migrate";

	/**
	 * The cached value of the '{@link #getMigratename() <em>Migratename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigratename()
	 * @generated
	 * @ordered
	 */
	protected String migratename = MIGRATENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource_target() <em>Resource target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_target()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource_target() <em>Resource target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_target()
	 * @generated
	 * @ordered
	 */
	protected String resource_target = RESOURCE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdjust() <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final int ADJUST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAdjust() <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjust()
	 * @generated
	 * @ordered
	 */
	protected int adjust = ADJUST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttribute_target() <em>Attribute target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_target()
	 * @generated
	 * @ordered
	 */
	protected static final Attributename ATTRIBUTE_TARGET_EDEFAULT = Attributename.DEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute_target() <em>Attribute target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_target()
	 * @generated
	 * @ordered
	 */
	protected Attributename attribute_target = ATTRIBUTE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalingname() <em>Scalingname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingname()
	 * @generated
	 * @ordered
	 */
	protected static final Scalingnames SCALINGNAME_EDEFAULT = Scalingnames.SCALEIN;

	/**
	 * The cached value of the '{@link #getScalingname() <em>Scalingname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingname()
	 * @generated
	 * @ordered
	 */
	protected Scalingnames scalingname = SCALINGNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdjustment_type() <em>Adjustment type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment_type()
	 * @generated
	 * @ordered
	 */
	protected static final Adjustmenttype ADJUSTMENT_TYPE_EDEFAULT = Adjustmenttype.DEFAULT;

	/**
	 * The cached value of the '{@link #getAdjustment_type() <em>Adjustment type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment_type()
	 * @generated
	 * @ordered
	 */
	protected Adjustmenttype adjustment_type = ADJUSTMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaname() <em>Baname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaname()
	 * @generated
	 * @ordered
	 */
	protected static final Basicactionname BANAME_EDEFAULT = Basicactionname.START;

	/**
	 * The cached value of the '{@link #getBaname() <em>Baname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaname()
	 * @generated
	 * @ordered
	 */
	protected Basicactionname baname = BANAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Reconfigurationactiontype ACTION_EDEFAULT = Reconfigurationactiontype.DEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Reconfigurationactiontype action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAname() <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAname()
	 * @generated
	 * @ordered
	 */
	protected static final String ANAME_EDEFAULT = "update";

	/**
	 * The cached value of the '{@link #getAname() <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAname()
	 * @generated
	 * @ordered
	 */
	protected String aname = ANAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributevalue() <em>Attributevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributevalue()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTEVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributevalue() <em>Attributevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributevalue()
	 * @generated
	 * @ordered
	 */
	protected String attributevalue = ATTRIBUTEVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected static final Executiontype EXECUTION_EDEFAULT = Executiontype.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected Executiontype execution = EXECUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.RECONFIGURATIONACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCooldown() {
		return cooldown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooldown(int newCooldown) {
		int oldCooldown = cooldown;
		cooldown = newCooldown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__COOLDOWN, oldCooldown, cooldown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Migrationtype getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Migrationtype newType) {
		Migrationtype oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMigratename() {
		return migratename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMigratename(String newMigratename) {
		String oldMigratename = migratename;
		migratename = newMigratename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__MIGRATENAME, oldMigratename, migratename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource_target() {
		return resource_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource_target(String newResource_target) {
		String oldResource_target = resource_target;
		resource_target = newResource_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__RESOURCE_TARGET, oldResource_target, resource_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAdjust() {
		return adjust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjust(int newAdjust) {
		int oldAdjust = adjust;
		adjust = newAdjust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__ADJUST, oldAdjust, adjust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributename getAttribute_target() {
		return attribute_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute_target(Attributename newAttribute_target) {
		Attributename oldAttribute_target = attribute_target;
		attribute_target = newAttribute_target == null ? ATTRIBUTE_TARGET_EDEFAULT : newAttribute_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__ATTRIBUTE_TARGET, oldAttribute_target, attribute_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scalingnames getScalingname() {
		return scalingname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalingname(Scalingnames newScalingname) {
		Scalingnames oldScalingname = scalingname;
		scalingname = newScalingname == null ? SCALINGNAME_EDEFAULT : newScalingname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__SCALINGNAME, oldScalingname, scalingname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adjustmenttype getAdjustment_type() {
		return adjustment_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjustment_type(Adjustmenttype newAdjustment_type) {
		Adjustmenttype oldAdjustment_type = adjustment_type;
		adjustment_type = newAdjustment_type == null ? ADJUSTMENT_TYPE_EDEFAULT : newAdjustment_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__ADJUSTMENT_TYPE, oldAdjustment_type, adjustment_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basicactionname getBaname() {
		return baname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaname(Basicactionname newBaname) {
		Basicactionname oldBaname = baname;
		baname = newBaname == null ? BANAME_EDEFAULT : newBaname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__BANAME, oldBaname, baname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reconfigurationactiontype getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Reconfigurationactiontype newAction) {
		Reconfigurationactiontype oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAname() {
		return aname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAname(String newAname) {
		String oldAname = aname;
		aname = newAname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__ANAME, oldAname, aname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributevalue() {
		return attributevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributevalue(String newAttributevalue) {
		String oldAttributevalue = attributevalue;
		attributevalue = newAttributevalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__ATTRIBUTEVALUE, oldAttributevalue, attributevalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executiontype getExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution(Executiontype newExecution) {
		Executiontype oldExecution = execution;
		execution = newExecution == null ? EXECUTION_EDEFAULT : newExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.RECONFIGURATIONACTION__EXECUTION, oldExecution, execution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crmdPackage.RECONFIGURATIONACTION__ID:
				return getId();
			case crmdPackage.RECONFIGURATIONACTION__NAME:
				return getName();
			case crmdPackage.RECONFIGURATIONACTION__COOLDOWN:
				return getCooldown();
			case crmdPackage.RECONFIGURATIONACTION__PROVIDER:
				return getProvider();
			case crmdPackage.RECONFIGURATIONACTION__TYPE:
				return getType();
			case crmdPackage.RECONFIGURATIONACTION__MIGRATENAME:
				return getMigratename();
			case crmdPackage.RECONFIGURATIONACTION__HOST:
				return getHost();
			case crmdPackage.RECONFIGURATIONACTION__RESOURCE_TARGET:
				return getResource_target();
			case crmdPackage.RECONFIGURATIONACTION__ADJUST:
				return getAdjust();
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTE_TARGET:
				return getAttribute_target();
			case crmdPackage.RECONFIGURATIONACTION__SCALINGNAME:
				return getScalingname();
			case crmdPackage.RECONFIGURATIONACTION__ADJUSTMENT_TYPE:
				return getAdjustment_type();
			case crmdPackage.RECONFIGURATIONACTION__BANAME:
				return getBaname();
			case crmdPackage.RECONFIGURATIONACTION__LABEL:
				return getLabel();
			case crmdPackage.RECONFIGURATIONACTION__ACTION:
				return getAction();
			case crmdPackage.RECONFIGURATIONACTION__ANAME:
				return getAname();
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTEVALUE:
				return getAttributevalue();
			case crmdPackage.RECONFIGURATIONACTION__EXECUTION:
				return getExecution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case crmdPackage.RECONFIGURATIONACTION__ID:
				setId((String)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__NAME:
				setName((String)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__COOLDOWN:
				setCooldown((Integer)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__PROVIDER:
				setProvider((String)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__TYPE:
				setType((Migrationtype)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__MIGRATENAME:
				setMigratename((String)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__HOST:
				setHost((String)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__RESOURCE_TARGET:
				setResource_target((String)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ADJUST:
				setAdjust((Integer)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTE_TARGET:
				setAttribute_target((Attributename)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__SCALINGNAME:
				setScalingname((Scalingnames)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ADJUSTMENT_TYPE:
				setAdjustment_type((Adjustmenttype)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__BANAME:
				setBaname((Basicactionname)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__LABEL:
				setLabel((String)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ACTION:
				setAction((Reconfigurationactiontype)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ANAME:
				setAname((String)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTEVALUE:
				setAttributevalue((String)newValue);
				return;
			case crmdPackage.RECONFIGURATIONACTION__EXECUTION:
				setExecution((Executiontype)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case crmdPackage.RECONFIGURATIONACTION__ID:
				setId(ID_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__COOLDOWN:
				setCooldown(COOLDOWN_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__MIGRATENAME:
				setMigratename(MIGRATENAME_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__RESOURCE_TARGET:
				setResource_target(RESOURCE_TARGET_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ADJUST:
				setAdjust(ADJUST_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTE_TARGET:
				setAttribute_target(ATTRIBUTE_TARGET_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__SCALINGNAME:
				setScalingname(SCALINGNAME_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ADJUSTMENT_TYPE:
				setAdjustment_type(ADJUSTMENT_TYPE_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__BANAME:
				setBaname(BANAME_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ANAME:
				setAname(ANAME_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTEVALUE:
				setAttributevalue(ATTRIBUTEVALUE_EDEFAULT);
				return;
			case crmdPackage.RECONFIGURATIONACTION__EXECUTION:
				setExecution(EXECUTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case crmdPackage.RECONFIGURATIONACTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case crmdPackage.RECONFIGURATIONACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crmdPackage.RECONFIGURATIONACTION__COOLDOWN:
				return cooldown != COOLDOWN_EDEFAULT;
			case crmdPackage.RECONFIGURATIONACTION__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case crmdPackage.RECONFIGURATIONACTION__TYPE:
				return type != TYPE_EDEFAULT;
			case crmdPackage.RECONFIGURATIONACTION__MIGRATENAME:
				return MIGRATENAME_EDEFAULT == null ? migratename != null : !MIGRATENAME_EDEFAULT.equals(migratename);
			case crmdPackage.RECONFIGURATIONACTION__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case crmdPackage.RECONFIGURATIONACTION__RESOURCE_TARGET:
				return RESOURCE_TARGET_EDEFAULT == null ? resource_target != null : !RESOURCE_TARGET_EDEFAULT.equals(resource_target);
			case crmdPackage.RECONFIGURATIONACTION__ADJUST:
				return adjust != ADJUST_EDEFAULT;
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTE_TARGET:
				return attribute_target != ATTRIBUTE_TARGET_EDEFAULT;
			case crmdPackage.RECONFIGURATIONACTION__SCALINGNAME:
				return scalingname != SCALINGNAME_EDEFAULT;
			case crmdPackage.RECONFIGURATIONACTION__ADJUSTMENT_TYPE:
				return adjustment_type != ADJUSTMENT_TYPE_EDEFAULT;
			case crmdPackage.RECONFIGURATIONACTION__BANAME:
				return baname != BANAME_EDEFAULT;
			case crmdPackage.RECONFIGURATIONACTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case crmdPackage.RECONFIGURATIONACTION__ACTION:
				return action != ACTION_EDEFAULT;
			case crmdPackage.RECONFIGURATIONACTION__ANAME:
				return ANAME_EDEFAULT == null ? aname != null : !ANAME_EDEFAULT.equals(aname);
			case crmdPackage.RECONFIGURATIONACTION__ATTRIBUTEVALUE:
				return ATTRIBUTEVALUE_EDEFAULT == null ? attributevalue != null : !ATTRIBUTEVALUE_EDEFAULT.equals(attributevalue);
			case crmdPackage.RECONFIGURATIONACTION__EXECUTION:
				return execution != EXECUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", Cooldown: ");
		result.append(cooldown);
		result.append(", Provider: ");
		result.append(provider);
		result.append(", type: ");
		result.append(type);
		result.append(", migratename: ");
		result.append(migratename);
		result.append(", host: ");
		result.append(host);
		result.append(", resource_target: ");
		result.append(resource_target);
		result.append(", Adjust: ");
		result.append(adjust);
		result.append(", Attribute_target: ");
		result.append(attribute_target);
		result.append(", scalingname: ");
		result.append(scalingname);
		result.append(", adjustment_type: ");
		result.append(adjustment_type);
		result.append(", baname: ");
		result.append(baname);
		result.append(", label: ");
		result.append(label);
		result.append(", action: ");
		result.append(action);
		result.append(", aname: ");
		result.append(aname);
		result.append(", attributevalue: ");
		result.append(attributevalue);
		result.append(", execution: ");
		result.append(execution);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationactionImpl
