/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Provider#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Provider#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Provider#getSecretkey <em>Secretkey</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloudelasticity.crmd.crmdPackage#getProvider_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Provider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesskey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesskey</em>' attribute.
	 * @see #setAccesskey(String)
	 * @see cloudelasticity.crmd.crmdPackage#getProvider_Accesskey()
	 * @model
	 * @generated
	 */
	String getAccesskey();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Provider#getAccesskey <em>Accesskey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accesskey</em>' attribute.
	 * @see #getAccesskey()
	 * @generated
	 */
	void setAccesskey(String value);

	/**
	 * Returns the value of the '<em><b>Secretkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secretkey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secretkey</em>' attribute.
	 * @see #setSecretkey(String)
	 * @see cloudelasticity.crmd.crmdPackage#getProvider_Secretkey()
	 * @model
	 * @generated
	 */
	String getSecretkey();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Provider#getSecretkey <em>Secretkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secretkey</em>' attribute.
	 * @see #getSecretkey()
	 * @generated
	 */
	void setSecretkey(String value);

} // Provider
