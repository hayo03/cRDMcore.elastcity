/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.C_Link;
import cloudelasticity.crmd.Cloudresource;
import cloudelasticity.crmd.Compositeresource;
import cloudelasticity.crmd.crmdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compositeresource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.CompositeresourceImpl#getC_link <em>Clink</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.CompositeresourceImpl#getCloudresource <em>Cloudresource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeresourceImpl extends CloudresourceImpl implements Compositeresource {
	/**
	 * The cached value of the '{@link #getC_link() <em>Clink</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_link()
	 * @generated
	 * @ordered
	 */
	protected EList<C_Link> c_link;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeresourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.COMPOSITERESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C_Link> getC_link() {
		if (c_link == null) {
			c_link = new EObjectContainmentEList<C_Link>(C_Link.class, this, crmdPackage.COMPOSITERESOURCE__CLINK);
		}
		return c_link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cloudresource> getCloudresource() {
		if (cloudresource == null) {
			cloudresource = new EObjectContainmentEList<Cloudresource>(Cloudresource.class, this, crmdPackage.COMPOSITERESOURCE__CLOUDRESOURCE);
		}
		return cloudresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crmdPackage.COMPOSITERESOURCE__CLINK:
				return ((InternalEList<?>)getC_link()).basicRemove(otherEnd, msgs);
			case crmdPackage.COMPOSITERESOURCE__CLOUDRESOURCE:
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
			case crmdPackage.COMPOSITERESOURCE__CLINK:
				return getC_link();
			case crmdPackage.COMPOSITERESOURCE__CLOUDRESOURCE:
				return getCloudresource();
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
			case crmdPackage.COMPOSITERESOURCE__CLINK:
				getC_link().clear();
				getC_link().addAll((Collection<? extends C_Link>)newValue);
				return;
			case crmdPackage.COMPOSITERESOURCE__CLOUDRESOURCE:
				getCloudresource().clear();
				getCloudresource().addAll((Collection<? extends Cloudresource>)newValue);
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
			case crmdPackage.COMPOSITERESOURCE__CLINK:
				getC_link().clear();
				return;
			case crmdPackage.COMPOSITERESOURCE__CLOUDRESOURCE:
				getCloudresource().clear();
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
			case crmdPackage.COMPOSITERESOURCE__CLINK:
				return c_link != null && !c_link.isEmpty();
			case crmdPackage.COMPOSITERESOURCE__CLOUDRESOURCE:
				return cloudresource != null && !cloudresource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeresourceImpl
