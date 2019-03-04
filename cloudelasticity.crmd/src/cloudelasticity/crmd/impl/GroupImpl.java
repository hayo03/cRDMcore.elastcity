/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.C_SM;
import cloudelasticity.crmd.Cloudresource;
import cloudelasticity.crmd.Group;
import cloudelasticity.crmd.Resourceconstraint;
import cloudelasticity.crmd.Resourcerequirment;
import cloudelasticity.crmd.crmdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.GroupImpl#getCloudresource <em>Cloudresource</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.GroupImpl#getResourcerequirment <em>Resourcerequirment</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.GroupImpl#getResourceconstraint <em>Resourceconstraint</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.GroupImpl#getCsm <em>Csm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends cRDMEntityImpl implements Group {
	/**
	 * The cached value of the '{@link #getCloudresource() <em>Cloudresource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudresource()
	 * @generated
	 * @ordered
	 */
	protected EList<Cloudresource> cloudresource;

	/**
	 * The cached value of the '{@link #getResourcerequirment() <em>Resourcerequirment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcerequirment()
	 * @generated
	 * @ordered
	 */
	protected Resourcerequirment resourcerequirment;

	/**
	 * The cached value of the '{@link #getResourceconstraint() <em>Resourceconstraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceconstraint()
	 * @generated
	 * @ordered
	 */
	protected Resourceconstraint resourceconstraint;

	/**
	 * The cached value of the '{@link #getCsm() <em>Csm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsm()
	 * @generated
	 * @ordered
	 */
	protected EList<C_SM> csm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cloudresource> getCloudresource() {
		if (cloudresource == null) {
			cloudresource = new EObjectContainmentEList<Cloudresource>(Cloudresource.class, this, crmdPackage.GROUP__CLOUDRESOURCE);
		}
		return cloudresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourcerequirment getResourcerequirment() {
		if (resourcerequirment != null && resourcerequirment.eIsProxy()) {
			InternalEObject oldResourcerequirment = (InternalEObject)resourcerequirment;
			resourcerequirment = (Resourcerequirment)eResolveProxy(oldResourcerequirment);
			if (resourcerequirment != oldResourcerequirment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crmdPackage.GROUP__RESOURCEREQUIRMENT, oldResourcerequirment, resourcerequirment));
			}
		}
		return resourcerequirment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourcerequirment basicGetResourcerequirment() {
		return resourcerequirment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcerequirment(Resourcerequirment newResourcerequirment) {
		Resourcerequirment oldResourcerequirment = resourcerequirment;
		resourcerequirment = newResourcerequirment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.GROUP__RESOURCEREQUIRMENT, oldResourcerequirment, resourcerequirment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourceconstraint getResourceconstraint() {
		if (resourceconstraint != null && resourceconstraint.eIsProxy()) {
			InternalEObject oldResourceconstraint = (InternalEObject)resourceconstraint;
			resourceconstraint = (Resourceconstraint)eResolveProxy(oldResourceconstraint);
			if (resourceconstraint != oldResourceconstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crmdPackage.GROUP__RESOURCECONSTRAINT, oldResourceconstraint, resourceconstraint));
			}
		}
		return resourceconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourceconstraint basicGetResourceconstraint() {
		return resourceconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceconstraint(Resourceconstraint newResourceconstraint) {
		Resourceconstraint oldResourceconstraint = resourceconstraint;
		resourceconstraint = newResourceconstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.GROUP__RESOURCECONSTRAINT, oldResourceconstraint, resourceconstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C_SM> getCsm() {
		if (csm == null) {
			csm = new EObjectResolvingEList<C_SM>(C_SM.class, this, crmdPackage.GROUP__CSM);
		}
		return csm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crmdPackage.GROUP__CLOUDRESOURCE:
				return ((InternalEList<?>)getCloudresource()).basicRemove(otherEnd, msgs);
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
			case crmdPackage.GROUP__CLOUDRESOURCE:
				return getCloudresource();
			case crmdPackage.GROUP__RESOURCEREQUIRMENT:
				if (resolve) return getResourcerequirment();
				return basicGetResourcerequirment();
			case crmdPackage.GROUP__RESOURCECONSTRAINT:
				if (resolve) return getResourceconstraint();
				return basicGetResourceconstraint();
			case crmdPackage.GROUP__CSM:
				return getCsm();
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
			case crmdPackage.GROUP__CLOUDRESOURCE:
				getCloudresource().clear();
				getCloudresource().addAll((Collection<? extends Cloudresource>)newValue);
				return;
			case crmdPackage.GROUP__RESOURCEREQUIRMENT:
				setResourcerequirment((Resourcerequirment)newValue);
				return;
			case crmdPackage.GROUP__RESOURCECONSTRAINT:
				setResourceconstraint((Resourceconstraint)newValue);
				return;
			case crmdPackage.GROUP__CSM:
				getCsm().clear();
				getCsm().addAll((Collection<? extends C_SM>)newValue);
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
			case crmdPackage.GROUP__CLOUDRESOURCE:
				getCloudresource().clear();
				return;
			case crmdPackage.GROUP__RESOURCEREQUIRMENT:
				setResourcerequirment((Resourcerequirment)null);
				return;
			case crmdPackage.GROUP__RESOURCECONSTRAINT:
				setResourceconstraint((Resourceconstraint)null);
				return;
			case crmdPackage.GROUP__CSM:
				getCsm().clear();
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
			case crmdPackage.GROUP__CLOUDRESOURCE:
				return cloudresource != null && !cloudresource.isEmpty();
			case crmdPackage.GROUP__RESOURCEREQUIRMENT:
				return resourcerequirment != null;
			case crmdPackage.GROUP__RESOURCECONSTRAINT:
				return resourceconstraint != null;
			case crmdPackage.GROUP__CSM:
				return csm != null && !csm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
