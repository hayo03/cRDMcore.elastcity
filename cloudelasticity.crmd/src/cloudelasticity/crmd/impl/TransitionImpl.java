/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Event;
import cloudelasticity.crmd.Reconfigurationaction;
import cloudelasticity.crmd.State;
import cloudelasticity.crmd.Transition;
import cloudelasticity.crmd.crmdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TransitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TransitionImpl#getReconfigurationaction <em>Reconfigurationaction</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.TransitionImpl#getTransitionevent <em>Transitionevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	 * The cached value of the '{@link #getReconfigurationaction() <em>Reconfigurationaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Reconfigurationaction> reconfigurationaction;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The cached value of the '{@link #getTransitionevent() <em>Transitionevent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionevent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> transitionevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.TRANSITION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.TRANSITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reconfigurationaction> getReconfigurationaction() {
		if (reconfigurationaction == null) {
			reconfigurationaction = new EObjectResolvingEList<Reconfigurationaction>(Reconfigurationaction.class, this, crmdPackage.TRANSITION__RECONFIGURATIONACTION);
		}
		return reconfigurationaction;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crmdPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource) {
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crmdPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getTransitionevent() {
		if (transitionevent == null) {
			transitionevent = new EObjectResolvingEList<Event>(Event.class, this, crmdPackage.TRANSITION__TRANSITIONEVENT);
		}
		return transitionevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crmdPackage.TRANSITION__NAME:
				return getName();
			case crmdPackage.TRANSITION__ID:
				return getId();
			case crmdPackage.TRANSITION__RECONFIGURATIONACTION:
				return getReconfigurationaction();
			case crmdPackage.TRANSITION__LABEL:
				return getLabel();
			case crmdPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case crmdPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case crmdPackage.TRANSITION__TRANSITIONEVENT:
				return getTransitionevent();
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
			case crmdPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case crmdPackage.TRANSITION__ID:
				setId((String)newValue);
				return;
			case crmdPackage.TRANSITION__RECONFIGURATIONACTION:
				getReconfigurationaction().clear();
				getReconfigurationaction().addAll((Collection<? extends Reconfigurationaction>)newValue);
				return;
			case crmdPackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case crmdPackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case crmdPackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case crmdPackage.TRANSITION__TRANSITIONEVENT:
				getTransitionevent().clear();
				getTransitionevent().addAll((Collection<? extends Event>)newValue);
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
			case crmdPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crmdPackage.TRANSITION__ID:
				setId(ID_EDEFAULT);
				return;
			case crmdPackage.TRANSITION__RECONFIGURATIONACTION:
				getReconfigurationaction().clear();
				return;
			case crmdPackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case crmdPackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case crmdPackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case crmdPackage.TRANSITION__TRANSITIONEVENT:
				getTransitionevent().clear();
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
			case crmdPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crmdPackage.TRANSITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case crmdPackage.TRANSITION__RECONFIGURATIONACTION:
				return reconfigurationaction != null && !reconfigurationaction.isEmpty();
			case crmdPackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case crmdPackage.TRANSITION__SOURCE:
				return source != null;
			case crmdPackage.TRANSITION__TARGET:
				return target != null;
			case crmdPackage.TRANSITION__TRANSITIONEVENT:
				return transitionevent != null && !transitionevent.isEmpty();
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
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
