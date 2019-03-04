/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Compositereconfiguration;
import cloudelasticity.crmd.Reconfigurationaction;
import cloudelasticity.crmd.crmdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compositereconfiguration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.CompositereconfigurationImpl#getCrname <em>Crname</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.CompositereconfigurationImpl#getReconfigurationaction <em>Reconfigurationaction</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.CompositereconfigurationImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositereconfigurationImpl extends ReconfigurationactionImpl implements Compositereconfiguration {
	/**
	 * The default value of the '{@link #getCrname() <em>Crname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrname()
	 * @generated
	 * @ordered
	 */
	protected static final String CRNAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCrname() <em>Crname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrname()
	 * @generated
	 * @ordered
	 */
	protected String crname = CRNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReconfigurationaction() <em>Reconfigurationaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Reconfigurationaction> reconfigurationaction;

	/**
	 * The default value of the '{@link #getActions() <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected String actions = ACTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositereconfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.COMPOSITERECONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrname() {
		return crname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrname(String newCrname) {
		String oldCrname = crname;
		crname = newCrname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.COMPOSITERECONFIGURATION__CRNAME, oldCrname, crname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reconfigurationaction> getReconfigurationaction() {
		if (reconfigurationaction == null) {
			reconfigurationaction = new EObjectContainmentEList<Reconfigurationaction>(Reconfigurationaction.class, this, crmdPackage.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION);
		}
		return reconfigurationaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(String newActions) {
		String oldActions = actions;
		actions = newActions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.COMPOSITERECONFIGURATION__ACTIONS, oldActions, actions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crmdPackage.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION:
				return ((InternalEList<?>)getReconfigurationaction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crmdPackage.COMPOSITERECONFIGURATION__CRNAME:
				return getCrname();
			case crmdPackage.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION:
				return getReconfigurationaction();
			case crmdPackage.COMPOSITERECONFIGURATION__ACTIONS:
				return getActions();
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
			case crmdPackage.COMPOSITERECONFIGURATION__CRNAME:
				setCrname((String)newValue);
				return;
			case crmdPackage.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION:
				getReconfigurationaction().clear();
				getReconfigurationaction().addAll((Collection<? extends Reconfigurationaction>)newValue);
				return;
			case crmdPackage.COMPOSITERECONFIGURATION__ACTIONS:
				setActions((String)newValue);
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
			case crmdPackage.COMPOSITERECONFIGURATION__CRNAME:
				setCrname(CRNAME_EDEFAULT);
				return;
			case crmdPackage.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION:
				getReconfigurationaction().clear();
				return;
			case crmdPackage.COMPOSITERECONFIGURATION__ACTIONS:
				setActions(ACTIONS_EDEFAULT);
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
			case crmdPackage.COMPOSITERECONFIGURATION__CRNAME:
				return CRNAME_EDEFAULT == null ? crname != null : !CRNAME_EDEFAULT.equals(crname);
			case crmdPackage.COMPOSITERECONFIGURATION__RECONFIGURATIONACTION:
				return reconfigurationaction != null && !reconfigurationaction.isEmpty();
			case crmdPackage.COMPOSITERECONFIGURATION__ACTIONS:
				return ACTIONS_EDEFAULT == null ? actions != null : !ACTIONS_EDEFAULT.equals(actions);
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
		result.append(" (crname: ");
		result.append(crname);
		result.append(", actions: ");
		result.append(actions);
		result.append(')');
		return result.toString();
	}

} //CompositereconfigurationImpl
