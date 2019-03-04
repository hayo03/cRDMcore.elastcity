/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.TSA;
import cloudelasticity.crmd.Tstate;
import cloudelasticity.crmd.Ttransition;
import cloudelasticity.crmd.crmdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.TSAImpl#getTstate <em>Tstate</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TSAImpl#getTtransition <em>Ttransition</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TSAImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSAImpl extends MinimalEObjectImpl.Container implements TSA {
	/**
	 * The cached value of the '{@link #getTstate() <em>Tstate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTstate()
	 * @generated
	 * @ordered
	 */
	protected EList<Tstate> tstate;

	/**
	 * The cached value of the '{@link #getTtransition() <em>Ttransition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Ttransition> ttransition;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.TSA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tstate> getTstate() {
		if (tstate == null) {
			tstate = new EObjectContainmentEList<Tstate>(Tstate.class, this, crmdPackage.TSA__TSTATE);
		}
		return tstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ttransition> getTtransition() {
		if (ttransition == null) {
			ttransition = new EObjectContainmentEList<Ttransition>(Ttransition.class, this, crmdPackage.TSA__TTRANSITION);
		}
		return ttransition;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.TSA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crmdPackage.TSA__TSTATE:
				return ((InternalEList<?>)getTstate()).basicRemove(otherEnd, msgs);
			case crmdPackage.TSA__TTRANSITION:
				return ((InternalEList<?>)getTtransition()).basicRemove(otherEnd, msgs);
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
			case crmdPackage.TSA__TSTATE:
				return getTstate();
			case crmdPackage.TSA__TTRANSITION:
				return getTtransition();
			case crmdPackage.TSA__NAME:
				return getName();
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
			case crmdPackage.TSA__TSTATE:
				getTstate().clear();
				getTstate().addAll((Collection<? extends Tstate>)newValue);
				return;
			case crmdPackage.TSA__TTRANSITION:
				getTtransition().clear();
				getTtransition().addAll((Collection<? extends Ttransition>)newValue);
				return;
			case crmdPackage.TSA__NAME:
				setName((String)newValue);
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
			case crmdPackage.TSA__TSTATE:
				getTstate().clear();
				return;
			case crmdPackage.TSA__TTRANSITION:
				getTtransition().clear();
				return;
			case crmdPackage.TSA__NAME:
				setName(NAME_EDEFAULT);
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
			case crmdPackage.TSA__TSTATE:
				return tstate != null && !tstate.isEmpty();
			case crmdPackage.TSA__TTRANSITION:
				return ttransition != null && !ttransition.isEmpty();
			case crmdPackage.TSA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //TSAImpl
