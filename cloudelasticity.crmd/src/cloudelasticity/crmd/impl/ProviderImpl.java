/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Provider;
import cloudelasticity.crmd.crmdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.ProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ProviderImpl#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.ProviderImpl#getSecretkey <em>Secretkey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderImpl extends MinimalEObjectImpl.Container implements Provider {
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
	 * The default value of the '{@link #getAccesskey() <em>Accesskey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesskey()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccesskey() <em>Accesskey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesskey()
	 * @generated
	 * @ordered
	 */
	protected String accesskey = ACCESSKEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretkey() <em>Secretkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretkey()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRETKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretkey() <em>Secretkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretkey()
	 * @generated
	 * @ordered
	 */
	protected String secretkey = SECRETKEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.PROVIDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.PROVIDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccesskey() {
		return accesskey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesskey(String newAccesskey) {
		String oldAccesskey = accesskey;
		accesskey = newAccesskey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.PROVIDER__ACCESSKEY, oldAccesskey, accesskey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecretkey() {
		return secretkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretkey(String newSecretkey) {
		String oldSecretkey = secretkey;
		secretkey = newSecretkey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.PROVIDER__SECRETKEY, oldSecretkey, secretkey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crmdPackage.PROVIDER__NAME:
				return getName();
			case crmdPackage.PROVIDER__ACCESSKEY:
				return getAccesskey();
			case crmdPackage.PROVIDER__SECRETKEY:
				return getSecretkey();
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
			case crmdPackage.PROVIDER__NAME:
				setName((String)newValue);
				return;
			case crmdPackage.PROVIDER__ACCESSKEY:
				setAccesskey((String)newValue);
				return;
			case crmdPackage.PROVIDER__SECRETKEY:
				setSecretkey((String)newValue);
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
			case crmdPackage.PROVIDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crmdPackage.PROVIDER__ACCESSKEY:
				setAccesskey(ACCESSKEY_EDEFAULT);
				return;
			case crmdPackage.PROVIDER__SECRETKEY:
				setSecretkey(SECRETKEY_EDEFAULT);
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
			case crmdPackage.PROVIDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crmdPackage.PROVIDER__ACCESSKEY:
				return ACCESSKEY_EDEFAULT == null ? accesskey != null : !ACCESSKEY_EDEFAULT.equals(accesskey);
			case crmdPackage.PROVIDER__SECRETKEY:
				return SECRETKEY_EDEFAULT == null ? secretkey != null : !SECRETKEY_EDEFAULT.equals(secretkey);
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
		result.append(", accesskey: ");
		result.append(accesskey);
		result.append(", secretkey: ");
		result.append(secretkey);
		result.append(')');
		return result.toString();
	}

} //ProviderImpl
