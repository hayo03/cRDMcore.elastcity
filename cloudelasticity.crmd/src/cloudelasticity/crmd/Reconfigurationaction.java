/**
 */
package cloudelasticity.crmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfigurationaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getCooldown <em>Cooldown</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getProvider <em>Provider</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getType <em>Type</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getMigratename <em>Migratename</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getHost <em>Host</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getResource_target <em>Resource target</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getAdjust <em>Adjust</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getAttribute_target <em>Attribute target</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getScalingname <em>Scalingname</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getAdjustment_type <em>Adjustment type</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getBaname <em>Baname</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getLabel <em>Label</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getAction <em>Action</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getAname <em>Aname</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getAttributevalue <em>Attributevalue</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Reconfigurationaction#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction()
 * @model
 * @generated
 */
public interface Reconfigurationaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cooldown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooldown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooldown</em>' attribute.
	 * @see #setCooldown(int)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Cooldown()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getCooldown();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getCooldown <em>Cooldown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooldown</em>' attribute.
	 * @see #getCooldown()
	 * @generated
	 */
	void setCooldown(int value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Provider()
	 * @model
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Migrationtype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.Migrationtype
	 * @see #setType(Migrationtype)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Type()
	 * @model
	 * @generated
	 */
	Migrationtype getType();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cloudelasticity.crmd.Migrationtype
	 * @see #getType()
	 * @generated
	 */
	void setType(Migrationtype value);

	/**
	 * Returns the value of the '<em><b>Migratename</b></em>' attribute.
	 * The default value is <code>"migrate"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migratename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migratename</em>' attribute.
	 * @see #setMigratename(String)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Migratename()
	 * @model default="migrate"
	 * @generated
	 */
	String getMigratename();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getMigratename <em>Migratename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migratename</em>' attribute.
	 * @see #getMigratename()
	 * @generated
	 */
	void setMigratename(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Resource target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource target</em>' attribute.
	 * @see #setResource_target(String)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Resource_target()
	 * @model
	 * @generated
	 */
	String getResource_target();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getResource_target <em>Resource target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource target</em>' attribute.
	 * @see #getResource_target()
	 * @generated
	 */
	void setResource_target(String value);

	/**
	 * Returns the value of the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjust</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjust</em>' attribute.
	 * @see #setAdjust(int)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Adjust()
	 * @model
	 * @generated
	 */
	int getAdjust();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getAdjust <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjust</em>' attribute.
	 * @see #getAdjust()
	 * @generated
	 */
	void setAdjust(int value);

	/**
	 * Returns the value of the '<em><b>Attribute target</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Attributename}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute target</em>' attribute.
	 * @see cloudelasticity.crmd.Attributename
	 * @see #setAttribute_target(Attributename)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Attribute_target()
	 * @model
	 * @generated
	 */
	Attributename getAttribute_target();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getAttribute_target <em>Attribute target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute target</em>' attribute.
	 * @see cloudelasticity.crmd.Attributename
	 * @see #getAttribute_target()
	 * @generated
	 */
	void setAttribute_target(Attributename value);

	/**
	 * Returns the value of the '<em><b>Scalingname</b></em>' attribute.
	 * The default value is <code>"scalein"</code>.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Scalingnames}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalingname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalingname</em>' attribute.
	 * @see cloudelasticity.crmd.Scalingnames
	 * @see #setScalingname(Scalingnames)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Scalingname()
	 * @model default="scalein"
	 * @generated
	 */
	Scalingnames getScalingname();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getScalingname <em>Scalingname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalingname</em>' attribute.
	 * @see cloudelasticity.crmd.Scalingnames
	 * @see #getScalingname()
	 * @generated
	 */
	void setScalingname(Scalingnames value);

	/**
	 * Returns the value of the '<em><b>Adjustment type</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Adjustmenttype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjustment type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjustment type</em>' attribute.
	 * @see cloudelasticity.crmd.Adjustmenttype
	 * @see #setAdjustment_type(Adjustmenttype)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Adjustment_type()
	 * @model
	 * @generated
	 */
	Adjustmenttype getAdjustment_type();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getAdjustment_type <em>Adjustment type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment type</em>' attribute.
	 * @see cloudelasticity.crmd.Adjustmenttype
	 * @see #getAdjustment_type()
	 * @generated
	 */
	void setAdjustment_type(Adjustmenttype value);

	/**
	 * Returns the value of the '<em><b>Baname</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Basicactionname}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baname</em>' attribute.
	 * @see cloudelasticity.crmd.Basicactionname
	 * @see #setBaname(Basicactionname)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Baname()
	 * @model
	 * @generated
	 */
	Basicactionname getBaname();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getBaname <em>Baname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baname</em>' attribute.
	 * @see cloudelasticity.crmd.Basicactionname
	 * @see #getBaname()
	 * @generated
	 */
	void setBaname(Basicactionname value);

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
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Reconfigurationactiontype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see cloudelasticity.crmd.Reconfigurationactiontype
	 * @see #setAction(Reconfigurationactiontype)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Action()
	 * @model
	 * @generated
	 */
	Reconfigurationactiontype getAction();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see cloudelasticity.crmd.Reconfigurationactiontype
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Reconfigurationactiontype value);

	/**
	 * Returns the value of the '<em><b>Aname</b></em>' attribute.
	 * The default value is <code>"update"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aname</em>' attribute.
	 * @see #setAname(String)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Aname()
	 * @model default="update"
	 * @generated
	 */
	String getAname();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getAname <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aname</em>' attribute.
	 * @see #getAname()
	 * @generated
	 */
	void setAname(String value);

	/**
	 * Returns the value of the '<em><b>Attributevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributevalue</em>' attribute.
	 * @see #setAttributevalue(String)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Attributevalue()
	 * @model
	 * @generated
	 */
	String getAttributevalue();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getAttributevalue <em>Attributevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributevalue</em>' attribute.
	 * @see #getAttributevalue()
	 * @generated
	 */
	void setAttributevalue(String value);

	/**
	 * Returns the value of the '<em><b>Execution</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Executiontype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' attribute.
	 * @see cloudelasticity.crmd.Executiontype
	 * @see #setExecution(Executiontype)
	 * @see cloudelasticity.crmd.crmdPackage#getReconfigurationaction_Execution()
	 * @model
	 * @generated
	 */
	Executiontype getExecution();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Reconfigurationaction#getExecution <em>Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' attribute.
	 * @see cloudelasticity.crmd.Executiontype
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(Executiontype value);

} // Reconfigurationaction
