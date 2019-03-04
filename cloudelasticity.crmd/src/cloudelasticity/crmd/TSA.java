/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.TSA#getTstate <em>Tstate</em>}</li>
 *   <li>{@link cloudelasticity.crmd.TSA#getTtransition <em>Ttransition</em>}</li>
 *   <li>{@link cloudelasticity.crmd.TSA#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getTSA()
 * @model
 * @generated
 */
public interface TSA extends EObject {
	/**
	 * Returns the value of the '<em><b>Tstate</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Tstate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tstate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tstate</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getTSA_Tstate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tstate> getTstate();

	/**
	 * Returns the value of the '<em><b>Ttransition</b></em>' containment reference list.
	 * The list contents are of type {@link cloudelasticity.crmd.Ttransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ttransition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttransition</em>' containment reference list.
	 * @see cloudelasticity.crmd.crmdPackage#getTSA_Ttransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ttransition> getTtransition();

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
	 * @see cloudelasticity.crmd.crmdPackage#getTSA_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.TSA#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TSA
