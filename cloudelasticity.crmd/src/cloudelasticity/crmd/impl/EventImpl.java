/**
 */
package cloudelasticity.crmd.impl;

import cloudelasticity.crmd.Event;
import cloudelasticity.crmd.Eventstype;
import cloudelasticity.crmd.Functiontype;
import cloudelasticity.crmd.Operatortype;
import cloudelasticity.crmd.Predicatetype;
import cloudelasticity.crmd.Propertyname;
import cloudelasticity.crmd.Unittype;
import cloudelasticity.crmd.crmdPackage;
import cloudelasticity.crmd.metrickinds;
import cloudelasticity.crmd.weakdays;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getReference_value <em>Reference value</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getDate <em>Date</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getWeakday <em>Weakday</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getTimewindow <em>Timewindow</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getTargetresource <em>Targetresource</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getTypeevent <em>Typeevent</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getMetrickind <em>Metrickind</em>}</li>
 *   <li>{@link cloudelasticity.crmd.impl.EventImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final Predicatetype PREDICATE_EDEFAULT = Predicatetype.DEFAULT;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected Predicatetype predicate = PREDICATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReference_value() <em>Reference value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_value()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference_value() <em>Reference value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_value()
	 * @generated
	 * @ordered
	 */
	protected String reference_value = REFERENCE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeakday() <em>Weakday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeakday()
	 * @generated
	 * @ordered
	 */
	protected static final weakdays WEAKDAY_EDEFAULT = weakdays.MONDAY;

	/**
	 * The cached value of the '{@link #getWeakday() <em>Weakday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeakday()
	 * @generated
	 * @ordered
	 */
	protected weakdays weakday = WEAKDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final Functiontype FUNCTION_EDEFAULT = Functiontype.DEFAULT;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Functiontype function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final Propertyname METRIC_EDEFAULT = Propertyname.DEFAULT;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected Propertyname metric = METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operatortype OPERATOR_EDEFAULT = Operatortype.GREATOR_THAN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operatortype operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Unittype UNIT_EDEFAULT = Unittype.DEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unittype unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimewindow() <em>Timewindow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimewindow()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEWINDOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimewindow() <em>Timewindow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimewindow()
	 * @generated
	 * @ordered
	 */
	protected String timewindow = TIMEWINDOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetresource() <em>Targetresource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetresource()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETRESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetresource() <em>Targetresource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetresource()
	 * @generated
	 * @ordered
	 */
	protected String targetresource = TARGETRESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeevent() <em>Typeevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeevent()
	 * @generated
	 * @ordered
	 */
	protected static final Eventstype TYPEEVENT_EDEFAULT = Eventstype.TEMPORAL_EVENT;

	/**
	 * The cached value of the '{@link #getTypeevent() <em>Typeevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeevent()
	 * @generated
	 * @ordered
	 */
	protected Eventstype typeevent = TYPEEVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetrickind() <em>Metrickind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrickind()
	 * @generated
	 * @ordered
	 */
	protected static final metrickinds METRICKIND_EDEFAULT = metrickinds.MEASURABLE;

	/**
	 * The cached value of the '{@link #getMetrickind() <em>Metrickind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrickind()
	 * @generated
	 * @ordered
	 */
	protected metrickinds metrickind = METRICKIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crmdPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicatetype getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Predicatetype newPredicate) {
		Predicatetype oldPredicate = predicate;
		predicate = newPredicate == null ? PREDICATE_EDEFAULT : newPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__PREDICATE, oldPredicate, predicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference_value() {
		return reference_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference_value(String newReference_value) {
		String oldReference_value = reference_value;
		reference_value = newReference_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__REFERENCE_VALUE, oldReference_value, reference_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public weakdays getWeakday() {
		return weakday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeakday(weakdays newWeakday) {
		weakdays oldWeakday = weakday;
		weakday = newWeakday == null ? WEAKDAY_EDEFAULT : newWeakday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__WEAKDAY, oldWeakday, weakday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functiontype getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Functiontype newFunction) {
		Functiontype oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propertyname getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(Propertyname newMetric) {
		Propertyname oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operatortype getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operatortype newOperator) {
		Operatortype oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unittype getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unittype newUnit) {
		Unittype oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimewindow() {
		return timewindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimewindow(String newTimewindow) {
		String oldTimewindow = timewindow;
		timewindow = newTimewindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__TIMEWINDOW, oldTimewindow, timewindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetresource() {
		return targetresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetresource(String newTargetresource) {
		String oldTargetresource = targetresource;
		targetresource = newTargetresource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__TARGETRESOURCE, oldTargetresource, targetresource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eventstype getTypeevent() {
		return typeevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeevent(Eventstype newTypeevent) {
		Eventstype oldTypeevent = typeevent;
		typeevent = newTypeevent == null ? TYPEEVENT_EDEFAULT : newTypeevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__TYPEEVENT, oldTypeevent, typeevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public metrickinds getMetrickind() {
		return metrickind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrickind(metrickinds newMetrickind) {
		metrickinds oldMetrickind = metrickind;
		metrickind = newMetrickind == null ? METRICKIND_EDEFAULT : newMetrickind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__METRICKIND, oldMetrickind, metrickind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crmdPackage.EVENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crmdPackage.EVENT__ID:
				return getId();
			case crmdPackage.EVENT__NAME:
				return getName();
			case crmdPackage.EVENT__PREDICATE:
				return getPredicate();
			case crmdPackage.EVENT__EXPRESSION:
				return getExpression();
			case crmdPackage.EVENT__REFERENCE_VALUE:
				return getReference_value();
			case crmdPackage.EVENT__DATE:
				return getDate();
			case crmdPackage.EVENT__WEAKDAY:
				return getWeakday();
			case crmdPackage.EVENT__FUNCTION:
				return getFunction();
			case crmdPackage.EVENT__METRIC:
				return getMetric();
			case crmdPackage.EVENT__OPERATOR:
				return getOperator();
			case crmdPackage.EVENT__UNIT:
				return getUnit();
			case crmdPackage.EVENT__TIMEWINDOW:
				return getTimewindow();
			case crmdPackage.EVENT__TARGETRESOURCE:
				return getTargetresource();
			case crmdPackage.EVENT__TYPEEVENT:
				return getTypeevent();
			case crmdPackage.EVENT__METRICKIND:
				return getMetrickind();
			case crmdPackage.EVENT__LABEL:
				return getLabel();
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
			case crmdPackage.EVENT__ID:
				setId((String)newValue);
				return;
			case crmdPackage.EVENT__NAME:
				setName((String)newValue);
				return;
			case crmdPackage.EVENT__PREDICATE:
				setPredicate((Predicatetype)newValue);
				return;
			case crmdPackage.EVENT__EXPRESSION:
				setExpression((String)newValue);
				return;
			case crmdPackage.EVENT__REFERENCE_VALUE:
				setReference_value((String)newValue);
				return;
			case crmdPackage.EVENT__DATE:
				setDate((Date)newValue);
				return;
			case crmdPackage.EVENT__WEAKDAY:
				setWeakday((weakdays)newValue);
				return;
			case crmdPackage.EVENT__FUNCTION:
				setFunction((Functiontype)newValue);
				return;
			case crmdPackage.EVENT__METRIC:
				setMetric((Propertyname)newValue);
				return;
			case crmdPackage.EVENT__OPERATOR:
				setOperator((Operatortype)newValue);
				return;
			case crmdPackage.EVENT__UNIT:
				setUnit((Unittype)newValue);
				return;
			case crmdPackage.EVENT__TIMEWINDOW:
				setTimewindow((String)newValue);
				return;
			case crmdPackage.EVENT__TARGETRESOURCE:
				setTargetresource((String)newValue);
				return;
			case crmdPackage.EVENT__TYPEEVENT:
				setTypeevent((Eventstype)newValue);
				return;
			case crmdPackage.EVENT__METRICKIND:
				setMetrickind((metrickinds)newValue);
				return;
			case crmdPackage.EVENT__LABEL:
				setLabel((String)newValue);
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
			case crmdPackage.EVENT__ID:
				setId(ID_EDEFAULT);
				return;
			case crmdPackage.EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crmdPackage.EVENT__PREDICATE:
				setPredicate(PREDICATE_EDEFAULT);
				return;
			case crmdPackage.EVENT__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case crmdPackage.EVENT__REFERENCE_VALUE:
				setReference_value(REFERENCE_VALUE_EDEFAULT);
				return;
			case crmdPackage.EVENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case crmdPackage.EVENT__WEAKDAY:
				setWeakday(WEAKDAY_EDEFAULT);
				return;
			case crmdPackage.EVENT__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case crmdPackage.EVENT__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case crmdPackage.EVENT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case crmdPackage.EVENT__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case crmdPackage.EVENT__TIMEWINDOW:
				setTimewindow(TIMEWINDOW_EDEFAULT);
				return;
			case crmdPackage.EVENT__TARGETRESOURCE:
				setTargetresource(TARGETRESOURCE_EDEFAULT);
				return;
			case crmdPackage.EVENT__TYPEEVENT:
				setTypeevent(TYPEEVENT_EDEFAULT);
				return;
			case crmdPackage.EVENT__METRICKIND:
				setMetrickind(METRICKIND_EDEFAULT);
				return;
			case crmdPackage.EVENT__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case crmdPackage.EVENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case crmdPackage.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crmdPackage.EVENT__PREDICATE:
				return predicate != PREDICATE_EDEFAULT;
			case crmdPackage.EVENT__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case crmdPackage.EVENT__REFERENCE_VALUE:
				return REFERENCE_VALUE_EDEFAULT == null ? reference_value != null : !REFERENCE_VALUE_EDEFAULT.equals(reference_value);
			case crmdPackage.EVENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case crmdPackage.EVENT__WEAKDAY:
				return weakday != WEAKDAY_EDEFAULT;
			case crmdPackage.EVENT__FUNCTION:
				return function != FUNCTION_EDEFAULT;
			case crmdPackage.EVENT__METRIC:
				return metric != METRIC_EDEFAULT;
			case crmdPackage.EVENT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case crmdPackage.EVENT__UNIT:
				return unit != UNIT_EDEFAULT;
			case crmdPackage.EVENT__TIMEWINDOW:
				return TIMEWINDOW_EDEFAULT == null ? timewindow != null : !TIMEWINDOW_EDEFAULT.equals(timewindow);
			case crmdPackage.EVENT__TARGETRESOURCE:
				return TARGETRESOURCE_EDEFAULT == null ? targetresource != null : !TARGETRESOURCE_EDEFAULT.equals(targetresource);
			case crmdPackage.EVENT__TYPEEVENT:
				return typeevent != TYPEEVENT_EDEFAULT;
			case crmdPackage.EVENT__METRICKIND:
				return metrickind != METRICKIND_EDEFAULT;
			case crmdPackage.EVENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", predicate: ");
		result.append(predicate);
		result.append(", expression: ");
		result.append(expression);
		result.append(", reference_value: ");
		result.append(reference_value);
		result.append(", date: ");
		result.append(date);
		result.append(", weakday: ");
		result.append(weakday);
		result.append(", Function: ");
		result.append(function);
		result.append(", metric: ");
		result.append(metric);
		result.append(", Operator: ");
		result.append(operator);
		result.append(", unit: ");
		result.append(unit);
		result.append(", timewindow: ");
		result.append(timewindow);
		result.append(", targetresource: ");
		result.append(targetresource);
		result.append(", typeevent: ");
		result.append(typeevent);
		result.append(", metrickind: ");
		result.append(metrickind);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //EventImpl
