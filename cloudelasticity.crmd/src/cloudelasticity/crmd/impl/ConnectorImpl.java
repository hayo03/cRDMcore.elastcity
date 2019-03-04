/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Connector;
import cloudelasticity.crmd.OrechestrationTool;
import cloudelasticity.crmd.cRDM;
import cloudelasticity.crmd.crmdPackage;
import cloudelasticity.crmd.targetresourcetypes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ConnectorImpl#getTargetorchestrationtool <em>Targetorchestrationtool</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ConnectorImpl#getSourcecRDM <em>Sourcec RDM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final targetresourcetypes TYPE_EDEFAULT = targetresourcetypes.XAA_S;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected targetresourcetypes type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetorchestrationtool() <em>Targetorchestrationtool</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetorchestrationtool()
	 * @generated
	 * @ordered
	 */
	protected EList<OrechestrationTool> targetorchestrationtool;

	/**
	 * The cached value of the '{@link #getSourcecRDM() <em>Sourcec RDM</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcecRDM()
	 * @generated
	 * @ordered
	 */
	protected EList<cRDM> sourcecRDM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public targetresourcetypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(targetresourcetypes newType) {
		targetresourcetypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrechestrationTool> getTargetorchestrationtool() {
		if (targetorchestrationtool == null) {
			targetorchestrationtool = new EObjectResolvingEList<OrechestrationTool>(OrechestrationTool.class, this, crmdPackage.CONNECTOR__TARGETORCHESTRATIONTOOL);
		}
		return targetorchestrationtool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<cRDM> getSourcecRDM() {
		if (sourcecRDM == null) {
			sourcecRDM = new EObjectResolvingEList<cRDM>(cRDM.class, this, crmdPackage.CONNECTOR__SOURCEC_RDM);
		}
		return sourcecRDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crmdPackage.CONNECTOR__NAME:
				return getName();
			case crmdPackage.CONNECTOR__TYPE:
				return getType();
			case crmdPackage.CONNECTOR__TARGETORCHESTRATIONTOOL:
				return getTargetorchestrationtool();
			case crmdPackage.CONNECTOR__SOURCEC_RDM:
				return getSourcecRDM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case crmdPackage.CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case crmdPackage.CONNECTOR__TYPE:
				setType((targetresourcetypes)newValue);
				return;
			case crmdPackage.CONNECTOR__TARGETORCHESTRATIONTOOL:
				getTargetorchestrationtool().clear();
				getTargetorchestrationtool().addAll((Collection<? extends OrechestrationTool>)newValue);
				return;
			case crmdPackage.CONNECTOR__SOURCEC_RDM:
				getSourcecRDM().clear();
				getSourcecRDM().addAll((Collection<? extends cRDM>)newValue);
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
			case crmdPackage.CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crmdPackage.CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case crmdPackage.CONNECTOR__TARGETORCHESTRATIONTOOL:
				getTargetorchestrationtool().clear();
				return;
			case crmdPackage.CONNECTOR__SOURCEC_RDM:
				getSourcecRDM().clear();
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
			case crmdPackage.CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crmdPackage.CONNECTOR__TYPE:
				return type != TYPE_EDEFAULT;
			case crmdPackage.CONNECTOR__TARGETORCHESTRATIONTOOL:
				return targetorchestrationtool != null && !targetorchestrationtool.isEmpty();
			case crmdPackage.CONNECTOR__SOURCEC_RDM:
				return sourcecRDM != null && !sourcecRDM.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
