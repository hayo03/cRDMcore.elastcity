/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ttransition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Ttransition#getTsource <em>Tsource</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Ttransition#getTtarget <em>Ttarget</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Ttransition#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getTtransition()
 * @model
 * @generated
 */
public interface Ttransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Tsource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tsource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tsource</em>' reference.
	 * @see #setTsource(Tstate)
	 * @see cloudelasticity.crmd.crmdPackage#getTtransition_Tsource()
	 * @model required="true"
	 * @generated
	 */
	Tstate getTsource();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Ttransition#getTsource <em>Tsource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tsource</em>' reference.
	 * @see #getTsource()
	 * @generated
	 */
	void setTsource(Tstate value);

	/**
	 * Returns the value of the '<em><b>Ttarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ttarget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttarget</em>' reference.
	 * @see #setTtarget(Tstate)
	 * @see cloudelasticity.crmd.crmdPackage#getTtransition_Ttarget()
	 * @model required="true"
	 * @generated
	 */
	Tstate getTtarget();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Ttransition#getTtarget <em>Ttarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttarget</em>' reference.
	 * @see #getTtarget()
	 * @generated
	 */
	void setTtarget(Tstate value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see cloudelasticity.crmd.crmdPackage#getTtransition_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Ttransition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Ttransition
