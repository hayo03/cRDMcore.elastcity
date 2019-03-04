/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Connector;
import cloudelasticity.crmd.Mainmap;
import cloudelasticity.crmd.OrechestrationTool;
import cloudelasticity.crmd.Provider;
import cloudelasticity.crmd.cRDM;
import cloudelasticity.crmd.crmdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mainmap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.MainmapImpl#getCrdm <em>Crdm</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.MainmapImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.MainmapImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.MainmapImpl#getOrechestrationtool <em>Orechestrationtool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainmapImpl extends MinimalEObjectImpl.Container implements Mainmap {
	/**
	 * The cached value of the '{@link #getCrdm() <em>Crdm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrdm()
	 * @generated
	 * @ordered
	 */
	protected EList<cRDM> crdm;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> provider;

	/**
	 * The cached value of the '{@link #getOrechestrationtool() <em>Orechestrationtool</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrechestrationtool()
	 * @generated
	 * @ordered
	 */
	protected EList<OrechestrationTool> orechestrationtool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainmapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.MAINMAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<cRDM> getCrdm() {
		if (crdm == null) {
			crdm = new EObjectContainmentEList<cRDM>(cRDM.class, this, crmdPackage.MAINMAP__CRDM);
		}
		return crdm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<Connector>(Connector.class, this, crmdPackage.MAINMAP__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provider> getProvider() {
		if (provider == null) {
			provider = new EObjectContainmentEList<Provider>(Provider.class, this, crmdPackage.MAINMAP__PROVIDER);
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrechestrationTool> getOrechestrationtool() {
		if (orechestrationtool == null) {
			orechestrationtool = new EObjectContainmentEList<OrechestrationTool>(OrechestrationTool.class, this, crmdPackage.MAINMAP__ORECHESTRATIONTOOL);
		}
		return orechestrationtool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crmdPackage.MAINMAP__CRDM:
				return ((InternalEList<?>)getCrdm()).basicRemove(otherEnd, msgs);
			case crmdPackage.MAINMAP__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case crmdPackage.MAINMAP__PROVIDER:
				return ((InternalEList<?>)getProvider()).basicRemove(otherEnd, msgs);
			case crmdPackage.MAINMAP__ORECHESTRATIONTOOL:
				return ((InternalEList<?>)getOrechestrationtool()).basicRemove(otherEnd, msgs);
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
			case crmdPackage.MAINMAP__CRDM:
				return getCrdm();
			case crmdPackage.MAINMAP__CONNECTOR:
				return getConnector();
			case crmdPackage.MAINMAP__PROVIDER:
				return getProvider();
			case crmdPackage.MAINMAP__ORECHESTRATIONTOOL:
				return getOrechestrationtool();
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
			case crmdPackage.MAINMAP__CRDM:
				getCrdm().clear();
				getCrdm().addAll((Collection<? extends cRDM>)newValue);
				return;
			case crmdPackage.MAINMAP__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case crmdPackage.MAINMAP__PROVIDER:
				getProvider().clear();
				getProvider().addAll((Collection<? extends Provider>)newValue);
				return;
			case crmdPackage.MAINMAP__ORECHESTRATIONTOOL:
				getOrechestrationtool().clear();
				getOrechestrationtool().addAll((Collection<? extends OrechestrationTool>)newValue);
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
			case crmdPackage.MAINMAP__CRDM:
				getCrdm().clear();
				return;
			case crmdPackage.MAINMAP__CONNECTOR:
				getConnector().clear();
				return;
			case crmdPackage.MAINMAP__PROVIDER:
				getProvider().clear();
				return;
			case crmdPackage.MAINMAP__ORECHESTRATIONTOOL:
				getOrechestrationtool().clear();
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
			case crmdPackage.MAINMAP__CRDM:
				return crdm != null && !crdm.isEmpty();
			case crmdPackage.MAINMAP__CONNECTOR:
				return connector != null && !connector.isEmpty();
			case crmdPackage.MAINMAP__PROVIDER:
				return provider != null && !provider.isEmpty();
			case crmdPackage.MAINMAP__ORECHESTRATIONTOOL:
				return orechestrationtool != null && !orechestrationtool.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MainmapImpl
