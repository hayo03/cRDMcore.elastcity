/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.C_Link#getSource <em>Source</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_Link#getTarget <em>Target</em>}</li>
 *   <li>{@link cloudelasticity.crmd.C_Link#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getC_Link()
 * @model
 * @generated
 */
public interface C_Link extends cRDMEntity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Cloudresource)
	 * @see cloudelasticity.crmd.crmdPackage#getC_Link_Source()
	 * @model required="true"
	 * @generated
	 */
	Cloudresource getSource();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.C_Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Cloudresource value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Cloudresource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getC_Link_Target()
	 * @model
	 * @generated
	 */
	EList<Cloudresource> getTarget();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Linktype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.Linktype
	 * @see #setType(Linktype)
	 * @see cloudelasticity.crmd.crmdPackage#getC_Link_Type()
	 * @model
	 * @generated
	 */
	Linktype getType();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.C_Link#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.Linktype
	 * @see #getType()
	 * @generated
	 */
	void setType(Linktype value);

} // C_Link
