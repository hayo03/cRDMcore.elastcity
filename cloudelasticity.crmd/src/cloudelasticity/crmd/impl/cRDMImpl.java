/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.C_SM;
import cloudelasticity.crmd.Provider;
import cloudelasticity.crmd.Resourceconstraint;
import cloudelasticity.crmd.Resourcerequirment;
import cloudelasticity.crmd.cRDM;
import cloudelasticity.crmd.cRDMEntity;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>cRDM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.cRDMImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.cRDMImpl#getCrdmentity <em>Crdmentity</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.cRDMImpl#getGc_sm <em>Gc sm</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.cRDMImpl#getResourceconstraint <em>Resourceconstraint</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.cRDMImpl#getResourcerequirment <em>Resourcerequirment</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.cRDMImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.cRDMImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.cRDMImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cRDMImpl extends MinimalEObjectImpl.Container implements cRDM {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCrdmentity() <em>Crdmentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrdmentity()
	 * @generated
	 * @ordered
	 */
	protected EList<cRDMEntity> crdmentity;

	/**
	 * The cached value of the '{@link #getGc_sm() <em>Gc sm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGc_sm()
	 * @generated
	 * @ordered
	 */
	protected EList<C_SM> gc_sm;

	/**
	 * The cached value of the '{@link #getResourceconstraint() <em>Resourceconstraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceconstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Resourceconstraint> resourceconstraint;

	/**
	 * The cached value of the '{@link #getResourcerequirment() <em>Resourcerequirment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcerequirment()
	 * @generated
	 * @ordered
	 */
	protected EList<Resourcerequirment> resourcerequirment;

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
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> provider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected cRDMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.CRDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CRDM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<cRDMEntity> getCrdmentity() {
		if (crdmentity == null) {
			crdmentity = new EObjectContainmentEList<cRDMEntity>(cRDMEntity.class, this, crmdPackage.CRDM__CRDMENTITY);
		}
		return crdmentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C_SM> getGc_sm() {
		if (gc_sm == null) {
			gc_sm = new EObjectContainmentEList<C_SM>(C_SM.class, this, crmdPackage.CRDM__GC_SM);
		}
		return gc_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resourceconstraint> getResourceconstraint() {
		if (resourceconstraint == null) {
			resourceconstraint = new EObjectContainmentEList<Resourceconstraint>(Resourceconstraint.class, this, crmdPackage.CRDM__RESOURCECONSTRAINT);
		}
		return resourceconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resourcerequirment> getResourcerequirment() {
		if (resourcerequirment == null) {
			resourcerequirment = new EObjectContainmentEList<Resourcerequirment>(Resourcerequirment.class, this, crmdPackage.CRDM__RESOURCEREQUIRMENT);
		}
		return resourcerequirment;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CRDM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.CRDM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provider> getProvider() {
		if (provider == null) {
			provider = new EObjectResolvingEList<Provider>(Provider.class, this, crmdPackage.CRDM__PROVIDER);
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crmdPackage.CRDM__CRDMENTITY:
				return ((InternalEList<?>)getCrdmentity()).basicRemove(otherEnd, msgs);
			case crmdPackage.CRDM__GC_SM:
				return ((InternalEList<?>)getGc_sm()).basicRemove(otherEnd, msgs);
			case crmdPackage.CRDM__RESOURCECONSTRAINT:
				return ((InternalEList<?>)getResourceconstraint()).basicRemove(otherEnd, msgs);
			case crmdPackage.CRDM__RESOURCEREQUIRMENT:
				return ((InternalEList<?>)getResourcerequirment()).basicRemove(otherEnd, msgs);
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
			case crmdPackage.CRDM__VERSION:
				return getVersion();
			case crmdPackage.CRDM__CRDMENTITY:
				return getCrdmentity();
			case crmdPackage.CRDM__GC_SM:
				return getGc_sm();
			case crmdPackage.CRDM__RESOURCECONSTRAINT:
				return getResourceconstraint();
			case crmdPackage.CRDM__RESOURCEREQUIRMENT:
				return getResourcerequirment();
			case crmdPackage.CRDM__ID:
				return getId();
			case crmdPackage.CRDM__NAME:
				return getName();
			case crmdPackage.CRDM__PROVIDER:
				return getProvider();
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
			case crmdPackage.CRDM__VERSION:
				setVersion((String)newValue);
				return;
			case crmdPackage.CRDM__CRDMENTITY:
				getCrdmentity().clear();
				getCrdmentity().addAll((Collection<? extends cRDMEntity>)newValue);
				return;
			case crmdPackage.CRDM__GC_SM:
				getGc_sm().clear();
				getGc_sm().addAll((Collection<? extends C_SM>)newValue);
				return;
			case crmdPackage.CRDM__RESOURCECONSTRAINT:
				getResourceconstraint().clear();
				getResourceconstraint().addAll((Collection<? extends Resourceconstraint>)newValue);
				return;
			case crmdPackage.CRDM__RESOURCEREQUIRMENT:
				getResourcerequirment().clear();
				getResourcerequirment().addAll((Collection<? extends Resourcerequirment>)newValue);
				return;
			case crmdPackage.CRDM__ID:
				setId((String)newValue);
				return;
			case crmdPackage.CRDM__NAME:
				setName((String)newValue);
				return;
			case crmdPackage.CRDM__PROVIDER:
				getProvider().clear();
				getProvider().addAll((Collection<? extends Provider>)newValue);
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
			case crmdPackage.CRDM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case crmdPackage.CRDM__CRDMENTITY:
				getCrdmentity().clear();
				return;
			case crmdPackage.CRDM__GC_SM:
				getGc_sm().clear();
				return;
			case crmdPackage.CRDM__RESOURCECONSTRAINT:
				getResourceconstraint().clear();
				return;
			case crmdPackage.CRDM__RESOURCEREQUIRMENT:
				getResourcerequirment().clear();
				return;
			case crmdPackage.CRDM__ID:
				setId(ID_EDEFAULT);
				return;
			case crmdPackage.CRDM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crmdPackage.CRDM__PROVIDER:
				getProvider().clear();
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
			case crmdPackage.CRDM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case crmdPackage.CRDM__CRDMENTITY:
				return crdmentity != null && !crdmentity.isEmpty();
			case crmdPackage.CRDM__GC_SM:
				return gc_sm != null && !gc_sm.isEmpty();
			case crmdPackage.CRDM__RESOURCECONSTRAINT:
				return resourceconstraint != null && !resourceconstraint.isEmpty();
			case crmdPackage.CRDM__RESOURCEREQUIRMENT:
				return resourcerequirment != null && !resourcerequirment.isEmpty();
			case crmdPackage.CRDM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case crmdPackage.CRDM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crmdPackage.CRDM__PROVIDER:
				return provider != null && !provider.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //cRDMImpl
