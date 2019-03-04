/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.OrechestrationTool;
import cloudelasticity.crmd.crmdPackage;
import cloudelasticity.crmd.orchestrationtools;
import cloudelasticity.crmd.targetresourcetypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orechestration Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.OrechestrationToolImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.OrechestrationToolImpl#getTargetresource <em>Targetresource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrechestrationToolImpl extends MinimalEObjectImpl.Container implements OrechestrationTool {
	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final orchestrationtools TOOL_EDEFAULT = orchestrationtools.DOCKER;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected orchestrationtools tool = TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetresource() <em>Targetresource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetresource()
	 * @generated
	 * @ordered
	 */
	protected static final targetresourcetypes TARGETRESOURCE_EDEFAULT = targetresourcetypes.XAA_S;

	/**
	 * The cached value of the '{@link #getTargetresource() <em>Targetresource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetresource()
	 * @generated
	 * @ordered
	 */
	protected targetresourcetypes targetresource = TARGETRESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrechestrationToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.ORECHESTRATION_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orchestrationtools getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(orchestrationtools newTool) {
		orchestrationtools oldTool = tool;
		tool = newTool == null ? TOOL_EDEFAULT : newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.ORECHESTRATION_TOOL__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public targetresourcetypes getTargetresource() {
		return targetresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetresource(targetresourcetypes newTargetresource) {
		targetresourcetypes oldTargetresource = targetresource;
		targetresource = newTargetresource == null ? TARGETRESOURCE_EDEFAULT : newTargetresource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.ORECHESTRATION_TOOL__TARGETRESOURCE, oldTargetresource, targetresource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crmdPackage.ORECHESTRATION_TOOL__TOOL:
				return getTool();
			case crmdPackage.ORECHESTRATION_TOOL__TARGETRESOURCE:
				return getTargetresource();
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
			case crmdPackage.ORECHESTRATION_TOOL__TOOL:
				setTool((orchestrationtools)newValue);
				return;
			case crmdPackage.ORECHESTRATION_TOOL__TARGETRESOURCE:
				setTargetresource((targetresourcetypes)newValue);
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
			case crmdPackage.ORECHESTRATION_TOOL__TOOL:
				setTool(TOOL_EDEFAULT);
				return;
			case crmdPackage.ORECHESTRATION_TOOL__TARGETRESOURCE:
				setTargetresource(TARGETRESOURCE_EDEFAULT);
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
			case crmdPackage.ORECHESTRATION_TOOL__TOOL:
				return tool != TOOL_EDEFAULT;
			case crmdPackage.ORECHESTRATION_TOOL__TARGETRESOURCE:
				return targetresource != TARGETRESOURCE_EDEFAULT;
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
		result.append(" (tool: ");
		result.append(tool);
		result.append(", targetresource: ");
		result.append(targetresource);
		result.append(')');
		return result.toString();
	}

} //OrechestrationToolImpl
