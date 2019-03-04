/**
 */
package cloudelasticity.crmd;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.Event#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getExpression <em>Expression</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getReference_value <em>Reference value</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getDate <em>Date</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getWeakday <em>Weakday</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getFunction <em>Function</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getMetric <em>Metric</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getOperator <em>Operator</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getUnit <em>Unit</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getTimewindow <em>Timewindow</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getTargetresource <em>Targetresource</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getTypeevent <em>Typeevent</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getMetrickind <em>Metrickind</em>}</li>
 *   <li>{@link cloudelasticity.crmd.Event#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see cloudelasticity.crmd.crmdPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
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
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getId <em>Id</em>}' attribute.
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
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Predicatetype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see cloudelasticity.crmd.Predicatetype
	 * @see #setPredicate(Predicatetype)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Predicate()
	 * @model
	 * @generated
	 */
	Predicatetype getPredicate();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see cloudelasticity.crmd.Predicatetype
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicatetype value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Reference value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference value</em>' attribute.
	 * @see #setReference_value(String)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Reference_value()
	 * @model
	 * @generated
	 */
	String getReference_value();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getReference_value <em>Reference value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference value</em>' attribute.
	 * @see #getReference_value()
	 * @generated
	 */
	void setReference_value(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Weakday</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.weakdays}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weakday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weakday</em>' attribute.
	 * @see cloudelasticity.crmd.weakdays
	 * @see #setWeakday(weakdays)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Weakday()
	 * @model
	 * @generated
	 */
	weakdays getWeakday();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getWeakday <em>Weakday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weakday</em>' attribute.
	 * @see cloudelasticity.crmd.weakdays
	 * @see #getWeakday()
	 * @generated
	 */
	void setWeakday(weakdays value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Functiontype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see cloudelasticity.crmd.Functiontype
	 * @see #setFunction(Functiontype)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Function()
	 * @model
	 * @generated
	 */
	Functiontype getFunction();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see cloudelasticity.crmd.Functiontype
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Functiontype value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Propertyname}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see cloudelasticity.crmd.Propertyname
	 * @see #setMetric(Propertyname)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Metric()
	 * @model
	 * @generated
	 */
	Propertyname getMetric();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see cloudelasticity.crmd.Propertyname
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Propertyname value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Operatortype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see cloudelasticity.crmd.Operatortype
	 * @see #setOperator(Operatortype)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Operator()
	 * @model
	 * @generated
	 */
	Operatortype getOperator();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see cloudelasticity.crmd.Operatortype
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operatortype value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Unittype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see cloudelasticity.crmd.Unittype
	 * @see #setUnit(Unittype)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Unit()
	 * @model
	 * @generated
	 */
	Unittype getUnit();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see cloudelasticity.crmd.Unittype
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unittype value);

	/**
	 * Returns the value of the '<em><b>Timewindow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timewindow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timewindow</em>' attribute.
	 * @see #setTimewindow(String)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Timewindow()
	 * @model
	 * @generated
	 */
	String getTimewindow();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getTimewindow <em>Timewindow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timewindow</em>' attribute.
	 * @see #getTimewindow()
	 * @generated
	 */
	void setTimewindow(String value);

	/**
	 * Returns the value of the '<em><b>Targetresource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetresource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetresource</em>' attribute.
	 * @see #setTargetresource(String)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Targetresource()
	 * @model
	 * @generated
	 */
	String getTargetresource();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getTargetresource <em>Targetresource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetresource</em>' attribute.
	 * @see #getTargetresource()
	 * @generated
	 */
	void setTargetresource(String value);

	/**
	 * Returns the value of the '<em><b>Typeevent</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.Eventstype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeevent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeevent</em>' attribute.
	 * @see cloudelasticity.crmd.Eventstype
	 * @see #setTypeevent(Eventstype)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Typeevent()
	 * @model
	 * @generated
	 */
	Eventstype getTypeevent();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getTypeevent <em>Typeevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeevent</em>' attribute.
	 * @see cloudelasticity.crmd.Eventstype
	 * @see #getTypeevent()
	 * @generated
	 */
	void setTypeevent(Eventstype value);

	/**
	 * Returns the value of the '<em><b>Metrickind</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudelasticity.crmd.metrickinds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrickind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrickind</em>' attribute.
	 * @see cloudelasticity.crmd.metrickinds
	 * @see #setMetrickind(metrickinds)
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Metrickind()
	 * @model
	 * @generated
	 */
	metrickinds getMetrickind();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getMetrickind <em>Metrickind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrickind</em>' attribute.
	 * @see cloudelasticity.crmd.metrickinds
	 * @see #getMetrickind()
	 * @generated
	 */
	void setMetrickind(metrickinds value);

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
	 * @see cloudelasticity.crmd.crmdPackage#getEvent_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link cloudelasticity.crmd.Event#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Event
