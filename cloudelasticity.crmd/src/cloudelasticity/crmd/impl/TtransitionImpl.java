/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Tstate;
import cloudelasticity.crmd.Ttransition;
import cloudelasticity.crmd.crmdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ttransition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.TtransitionImpl#getTsource <em>Tsource</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TtransitionImpl#getTtarget <em>Ttarget</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TtransitionImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TtransitionImpl extends MinimalEObjectImpl.Container implements Ttransition {
	/**
	 * The cached value of the '{@link #getTsource() <em>Tsource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTsource()
	 * @generated
	 * @ordered
	 */
	protected Tstate tsource;

	/**
	 * The cached value of the '{@link #getTtarget() <em>Ttarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtarget()
	 * @generated
	 * @ordered
	 */
	protected Tstate ttarget;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TtransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.TTRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tstate getTsource() {
		if (tsource != null && tsource.eIsProxy()) {
			InternalEObject oldTsource = (InternalEObject)tsource;
			tsource = (Tstate)eResolveProxy(oldTsource);
			if (tsource != oldTsource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crmdPackage.TTRANSITION__TSOURCE, oldTsource, tsource));
			}
		}
		return tsource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tstate basicGetTsource() {
		return tsource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTsource(Tstate newTsource) {
		Tstate oldTsource = tsource;
		tsource = newTsource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.TTRANSITION__TSOURCE, oldTsource, tsource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tstate getTtarget() {
		if (ttarget != null && ttarget.eIsProxy()) {
			InternalEObject oldTtarget = (InternalEObject)ttarget;
			ttarget = (Tstate)eResolveProxy(oldTtarget);
			if (ttarget != oldTtarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crmdPackage.TTRANSITION__TTARGET, oldTtarget, ttarget));
			}
		}
		return ttarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tstate basicGetTtarget() {
		return ttarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTtarget(Tstate newTtarget) {
		Tstate oldTtarget = ttarget;
		ttarget = newTtarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.TTRANSITION__TTARGET, oldTtarget, ttarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.TTRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crmdPackage.TTRANSITION__TSOURCE:
				if (resolve) return getTsource();
				return basicGetTsource();
			case crmdPackage.TTRANSITION__TTARGET:
				if (resolve) return getTtarget();
				return basicGetTtarget();
			case crmdPackage.TTRANSITION__LABEL:
				return getLabel();
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
			case crmdPackage.TTRANSITION__TSOURCE:
				setTsource((Tstate)newValue);
				return;
			case crmdPackage.TTRANSITION__TTARGET:
				setTtarget((Tstate)newValue);
				return;
			case crmdPackage.TTRANSITION__LABEL:
				setLabel((String)newValue);
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
			case crmdPackage.TTRANSITION__TSOURCE:
				setTsource((Tstate)null);
				return;
			case crmdPackage.TTRANSITION__TTARGET:
				setTtarget((Tstate)null);
				return;
			case crmdPackage.TTRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case crmdPackage.TTRANSITION__TSOURCE:
				return tsource != null;
			case crmdPackage.TTRANSITION__TTARGET:
				return ttarget != null;
			case crmdPackage.TTRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //TtransitionImpl
