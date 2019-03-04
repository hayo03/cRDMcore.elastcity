/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orechestration Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.OrechestrationTool#getTool <em>Tool</em>}</li>
 *   <li>{@link cloudelasticity.crmd.OrechestrationTool#getTargetresource <em>Targetresource</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getOrechestrationTool()
 * @model
 * @generated
 */
public interface OrechestrationTool extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.orchestrationtools}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' attribute.
	 * @see cloudelasticity.crmd.orchestrationtools
	 * @see #setTool(orchestrationtools)
	 * @see cloudelasticity.crmd.crmdPackage#getOrechestrationTool_Tool()
	 * @model
	 * @generated
	 */
	orchestrationtools getTool();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.OrechestrationTool#getTool <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' attribute.
	 * @see cloudelasticity.crmd.orchestrationtools
	 * @see #getTool()
	 * @generated
	 */
	void setTool(orchestrationtools value);

	/**
	 * Returns the value of the '<em><b>Targetresource</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.targetresourcetypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetresource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetresource</em>' attribute.
	 * @see cloudelasticity.crmd.targetresourcetypes
	 * @see #setTargetresource(targetresourcetypes)
	 * @see cloudelasticity.crmd.crmdPackage#getOrechestrationTool_Targetresource()
	 * @model
	 * @generated
	 */
	targetresourcetypes getTargetresource();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.OrechestrationTool#getTargetresource <em>Targetresource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetresource</em>' attribute.
	 * @see cloudelasticity.crmd.targetresourcetypes
	 * @see #getTargetresource()
	 * @generated
	 */
	void setTargetresource(targetresourcetypes value);

} // OrechestrationTool
