/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.C_SM;
import cloudelasticity.crmd.Event;
import cloudelasticity.crmd.Reconfigurationaction;
import cloudelasticity.crmd.Resourcerequirment;
import cloudelasticity.crmd.State;
import cloudelasticity.crmd.TSA;
import cloudelasticity.crmd.Transition;
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
 * An implementation of the model object '<em><b>CSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getStartdate <em>Startdate</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getEnddate <em>Enddate</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getState <em>State</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getCsmrequirment <em>Csmrequirment</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getCevent <em>Cevent</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getCreconfigurationaction <em>Creconfigurationaction</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getCSM_tsa <em>CSM tsa</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getTtcransition <em>Ttcransition</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.C_SMImpl#getTcstate <em>Tcstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class C_SMImpl extends MinimalEObjectImpl.Container implements C_SM {
	/**
	 * The default value of the '{@link #getStartdate() <em>Startdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartdate()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartdate() <em>Startdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartdate()
	 * @generated
	 * @ordered
	 */
	protected String startdate = STARTDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnddate() <em>Enddate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnddate()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnddate() <em>Enddate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnddate()
	 * @generated
	 * @ordered
	 */
	protected String enddate = ENDDATE_EDEFAULT;

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
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getCsmrequirment() <em>Csmrequirment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsmrequirment()
	 * @generated
	 * @ordered
	 */
	protected EList<Resourcerequirment> csmrequirment;

	/**
	 * The cached value of the '{@link #getCevent() <em>Cevent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCevent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> cevent;

	/**
	 * The cached value of the '{@link #getCreconfigurationaction() <em>Creconfigurationaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreconfigurationaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Reconfigurationaction> creconfigurationaction;

	/**
	 * The cached value of the '{@link #getCSM_tsa() <em>CSM tsa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSM_tsa()
	 * @generated
	 * @ordered
	 */
	protected EList<TSA> csM_tsa;

	/**
	 * The cached value of the '{@link #getTtcransition() <em>Ttcransition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtcransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Ttransition> ttcransition;

	/**
	 * The cached value of the '{@link #getTcstate() <em>Tcstate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcstate()
	 * @generated
	 * @ordered
	 */
	protected EList<Tstate> tcstate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected C_SMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.CSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartdate() {
		return startdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartdate(String newStartdate) {
		String oldStartdate = startdate;
		startdate = newStartdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CSM__STARTDATE, oldStartdate, startdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnddate() {
		return enddate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnddate(String newEnddate) {
		String oldEnddate = enddate;
		enddate = newEnddate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CSM__ENDDATE, oldEnddate, enddate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CSM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CSM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, crmdPackage.CSM__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, crmdPackage.CSM__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resourcerequirment> getCsmrequirment() {
		if (csmrequirment == null) {
			csmrequirment = new EObjectContainmentEList<Resourcerequirment>(Resourcerequirment.class, this, crmdPackage.CSM__CSMREQUIRMENT);
		}
		return csmrequirment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getCevent() {
		if (cevent == null) {
			cevent = new EObjectContainmentEList<Event>(Event.class, this, crmdPackage.CSM__CEVENT);
		}
		return cevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reconfigurationaction> getCreconfigurationaction() {
		if (creconfigurationaction == null) {
			creconfigurationaction = new EObjectContainmentEList<Reconfigurationaction>(Reconfigurationaction.class, this, crmdPackage.CSM__CRECONFIGURATIONACTION);
		}
		return creconfigurationaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSA> getCSM_tsa() {
		if (csM_tsa == null) {
			csM_tsa = new EObjectContainmentEList<TSA>(TSA.class, this, crmdPackage.CSM__CSM_TSA);
		}
		return csM_tsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ttransition> getTtcransition() {
		if (ttcransition == null) {
			ttcransition = new EObjectContainmentEList<Ttransition>(Ttransition.class, this, crmdPackage.CSM__TTCRANSITION);
		}
		return ttcransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tstate> getTcstate() {
		if (tcstate == null) {
			tcstate = new EObjectContainmentEList<Tstate>(Tstate.class, this, crmdPackage.CSM__TCSTATE);
		}
		return tcstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crmdPackage.CSM__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case crmdPackage.CSM__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case crmdPackage.CSM__CSMREQUIRMENT:
				return ((InternalEList<?>)getCsmrequirment()).basicRemove(otherEnd, msgs);
			case crmdPackage.CSM__CEVENT:
				return ((InternalEList<?>)getCevent()).basicRemove(otherEnd, msgs);
			case crmdPackage.CSM__CRECONFIGURATIONACTION:
				return ((InternalEList<?>)getCreconfigurationaction()).basicRemove(otherEnd, msgs);
			case crmdPackage.CSM__CSM_TSA:
				return ((InternalEList<?>)getCSM_tsa()).basicRemove(otherEnd, msgs);
			case crmdPackage.CSM__TTCRANSITION:
				return ((InternalEList<?>)getTtcransition()).basicRemove(otherEnd, msgs);
			case crmdPackage.CSM__TCSTATE:
				return ((InternalEList<?>)getTcstate()).basicRemove(otherEnd, msgs);
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
			case crmdPackage.CSM__STARTDATE:
				return getStartdate();
			case crmdPackage.CSM__ENDDATE:
				return getEnddate();
			case crmdPackage.CSM__ID:
				return getId();
			case crmdPackage.CSM__NAME:
				return getName();
			case crmdPackage.CSM__TRANSITION:
				return getTransition();
			case crmdPackage.CSM__STATE:
				return getState();
			case crmdPackage.CSM__CSMREQUIRMENT:
				return getCsmrequirment();
			case crmdPackage.CSM__CEVENT:
				return getCevent();
			case crmdPackage.CSM__CRECONFIGURATIONACTION:
				return getCreconfigurationaction();
			case crmdPackage.CSM__CSM_TSA:
				return getCSM_tsa();
			case crmdPackage.CSM__TTCRANSITION:
				return getTtcransition();
			case crmdPackage.CSM__TCSTATE:
				return getTcstate();
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
			case crmdPackage.CSM__STARTDATE:
				setStartdate((String)newValue);
				return;
			case crmdPackage.CSM__ENDDATE:
				setEnddate((String)newValue);
				return;
			case crmdPackage.CSM__ID:
				setId((String)newValue);
				return;
			case crmdPackage.CSM__NAME:
				setName((String)newValue);
				return;
			case crmdPackage.CSM__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case crmdPackage.CSM__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case crmdPackage.CSM__CSMREQUIRMENT:
				getCsmrequirment().clear();
				getCsmrequirment().addAll((Collection<? extends Resourcerequirment>)newValue);
				return;
			case crmdPackage.CSM__CEVENT:
				getCevent().clear();
				getCevent().addAll((Collection<? extends Event>)newValue);
				return;
			case crmdPackage.CSM__CRECONFIGURATIONACTION:
				getCreconfigurationaction().clear();
				getCreconfigurationaction().addAll((Collection<? extends Reconfigurationaction>)newValue);
				return;
			case crmdPackage.CSM__CSM_TSA:
				getCSM_tsa().clear();
				getCSM_tsa().addAll((Collection<? extends TSA>)newValue);
				return;
			case crmdPackage.CSM__TTCRANSITION:
				getTtcransition().clear();
				getTtcransition().addAll((Collection<? extends Ttransition>)newValue);
				return;
			case crmdPackage.CSM__TCSTATE:
				getTcstate().clear();
				getTcstate().addAll((Collection<? extends Tstate>)newValue);
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
			case crmdPackage.CSM__STARTDATE:
				setStartdate(STARTDATE_EDEFAULT);
				return;
			case crmdPackage.CSM__ENDDATE:
				setEnddate(ENDDATE_EDEFAULT);
				return;
			case crmdPackage.CSM__ID:
				setId(ID_EDEFAULT);
				return;
			case crmdPackage.CSM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crmdPackage.CSM__TRANSITION:
				getTransition().clear();
				return;
			case crmdPackage.CSM__STATE:
				getState().clear();
				return;
			case crmdPackage.CSM__CSMREQUIRMENT:
				getCsmrequirment().clear();
				return;
			case crmdPackage.CSM__CEVENT:
				getCevent().clear();
				return;
			case crmdPackage.CSM__CRECONFIGURATIONACTION:
				getCreconfigurationaction().clear();
				return;
			case crmdPackage.CSM__CSM_TSA:
				getCSM_tsa().clear();
				return;
			case crmdPackage.CSM__TTCRANSITION:
				getTtcransition().clear();
				return;
			case crmdPackage.CSM__TCSTATE:
				getTcstate().clear();
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
			case crmdPackage.CSM__STARTDATE:
				return STARTDATE_EDEFAULT == null ? startdate != null : !STARTDATE_EDEFAULT.equals(startdate);
			case crmdPackage.CSM__ENDDATE:
				return ENDDATE_EDEFAULT == null ? enddate != null : !ENDDATE_EDEFAULT.equals(enddate);
			case crmdPackage.CSM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case crmdPackage.CSM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crmdPackage.CSM__TRANSITION:
				return transition != null && !transition.isEmpty();
			case crmdPackage.CSM__STATE:
				return state != null && !state.isEmpty();
			case crmdPackage.CSM__CSMREQUIRMENT:
				return csmrequirment != null && !csmrequirment.isEmpty();
			case crmdPackage.CSM__CEVENT:
				return cevent != null && !cevent.isEmpty();
			case crmdPackage.CSM__CRECONFIGURATIONACTION:
				return creconfigurationaction != null && !creconfigurationaction.isEmpty();
			case crmdPackage.CSM__CSM_TSA:
				return csM_tsa != null && !csM_tsa.isEmpty();
			case crmdPackage.CSM__TTCRANSITION:
				return ttcransition != null && !ttcransition.isEmpty();
			case crmdPackage.CSM__TCSTATE:
				return tcstate != null && !tcstate.isEmpty();
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
		result.append(" (startdate: ");
		result.append(startdate);
		result.append(", enddate: ");
		result.append(enddate);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //C_SMImpl
