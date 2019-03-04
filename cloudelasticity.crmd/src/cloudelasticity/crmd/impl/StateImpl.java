/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Resourcerequirment;
import cloudelasticity.crmd.State;
import cloudelasticity.crmd.TSA;
import cloudelasticity.crmd.crmdPackage;
import cloudelasticity.crmd.statetype;

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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.StateImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.StateImpl#isIsfinal <em>Isfinal</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.StateImpl#isIsnormal <em>Isnormal</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.StateImpl#getCharacterize <em>Characterize</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.StateImpl#getTsa <em>Tsa</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.StateImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The default value of the '{@link #isIsfinal() <em>Isfinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsfinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISFINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsfinal() <em>Isfinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsfinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isfinal = ISFINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsnormal() <em>Isnormal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsnormal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISNORMAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsnormal() <em>Isnormal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsnormal()
	 * @generated
	 * @ordered
	 */
	protected boolean isnormal = ISNORMAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCharacterize() <em>Characterize</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterize()
	 * @generated
	 * @ordered
	 */
	protected EList<Resourcerequirment> characterize;

	/**
	 * The cached value of the '{@link #getTsa() <em>Tsa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTsa()
	 * @generated
	 * @ordered
	 */
	protected EList<TSA> tsa;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final statetype TYPE_EDEFAULT = statetype.INITIAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected statetype type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.STATE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.STATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsfinal() {
		return isfinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsfinal(boolean newIsfinal) {
		boolean oldIsfinal = isfinal;
		isfinal = newIsfinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.STATE__ISFINAL, oldIsfinal, isfinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsnormal() {
		return isnormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsnormal(boolean newIsnormal) {
		boolean oldIsnormal = isnormal;
		isnormal = newIsnormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.STATE__ISNORMAL, oldIsnormal, isnormal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resourcerequirment> getCharacterize() {
		if (characterize == null) {
			characterize = new EObjectContainmentEList<Resourcerequirment>(Resourcerequirment.class, this, crmdPackage.STATE__CHARACTERIZE);
		}
		return characterize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSA> getTsa() {
		if (tsa == null) {
			tsa = new EObjectContainmentEList<TSA>(TSA.class, this, crmdPackage.STATE__TSA);
		}
		return tsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public statetype getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(statetype newType) {
		statetype oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.STATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crmdPackage.STATE__CHARACTERIZE:
				return ((InternalEList<?>)getCharacterize()).basicRemove(otherEnd, msgs);
			case crmdPackage.STATE__TSA:
				return ((InternalEList<?>)getTsa()).basicRemove(otherEnd, msgs);
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
			case crmdPackage.STATE__NAME:
				return getName();
			case crmdPackage.STATE__ID:
				return getId();
			case crmdPackage.STATE__ISFINAL:
				return isIsfinal();
			case crmdPackage.STATE__ISNORMAL:
				return isIsnormal();
			case crmdPackage.STATE__CHARACTERIZE:
				return getCharacterize();
			case crmdPackage.STATE__TSA:
				return getTsa();
			case crmdPackage.STATE__TYPE:
				return getType();
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
			case crmdPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case crmdPackage.STATE__ID:
				setId((String)newValue);
				return;
			case crmdPackage.STATE__ISFINAL:
				setIsfinal((Boolean)newValue);
				return;
			case crmdPackage.STATE__ISNORMAL:
				setIsnormal((Boolean)newValue);
				return;
			case crmdPackage.STATE__CHARACTERIZE:
				getCharacterize().clear();
				getCharacterize().addAll((Collection<? extends Resourcerequirment>)newValue);
				return;
			case crmdPackage.STATE__TSA:
				getTsa().clear();
				getTsa().addAll((Collection<? extends TSA>)newValue);
				return;
			case crmdPackage.STATE__TYPE:
				setType((statetype)newValue);
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
			case crmdPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crmdPackage.STATE__ID:
				setId(ID_EDEFAULT);
				return;
			case crmdPackage.STATE__ISFINAL:
				setIsfinal(ISFINAL_EDEFAULT);
				return;
			case crmdPackage.STATE__ISNORMAL:
				setIsnormal(ISNORMAL_EDEFAULT);
				return;
			case crmdPackage.STATE__CHARACTERIZE:
				getCharacterize().clear();
				return;
			case crmdPackage.STATE__TSA:
				getTsa().clear();
				return;
			case crmdPackage.STATE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case crmdPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crmdPackage.STATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case crmdPackage.STATE__ISFINAL:
				return isfinal != ISFINAL_EDEFAULT;
			case crmdPackage.STATE__ISNORMAL:
				return isnormal != ISNORMAL_EDEFAULT;
			case crmdPackage.STATE__CHARACTERIZE:
				return characterize != null && !characterize.isEmpty();
			case crmdPackage.STATE__TSA:
				return tsa != null && !tsa.isEmpty();
			case crmdPackage.STATE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(", isfinal: ");
		result.append(isfinal);
		result.append(", isnormal: ");
		result.append(isnormal);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StateImpl
