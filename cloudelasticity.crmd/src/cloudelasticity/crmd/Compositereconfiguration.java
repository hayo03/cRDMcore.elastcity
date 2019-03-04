/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compositereconfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Compositereconfiguration#getCrname <em>Crname</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Compositereconfiguration#getReconfigurationaction <em>Reconfigurationaction</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Compositereconfiguration#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getCompositereconfiguration()
 * @model
 * @generated
 */
public interface Compositereconfiguration extends Reconfigurationaction {
	/**
	 * Returns the value of the '<em><b>Crname</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crname</em>' attribute.
	 * @see #setCrname(String)
	 * @see cloudelasticity.crmd.crmdPackage#getCompositereconfiguration_Crname()
	 * @model default=""
	 * @generated
	 */
	String getCrname();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Compositereconfiguration#getCrname <em>Crname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crname</em>' attribute.
	 * @see #getCrname()
	 * @generated
	 */
	void setCrname(String value);

	/**
	 * Returns the value of the '<em><b>Reconfigurationaction</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Reconfigurationaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfigurationaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfigurationaction</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getCompositereconfiguration_Reconfigurationaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reconfigurationaction> getReconfigurationaction();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute.
	 * @see #setActions(String)
	 * @see cloudelasticity.crmd.crmdPackage#getCompositereconfiguration_Actions()
	 * @model
	 * @generated
	 */
	String getActions();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Compositereconfiguration#getActions <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' attribute.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(String value);

} // Compositereconfiguration
