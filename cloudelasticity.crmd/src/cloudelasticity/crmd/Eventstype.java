/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Eventstype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#getEventstype()
 * @model
 * @generated
 */
public enum Eventstype implements Enumerator {
	/**
	 * The '<em><b>Temporal Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORAL_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORAL_EVENT(0, "TemporalEvent", "Temporal Event"),

	/**
	 * The '<em><b>Market Related Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKET_RELATED_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	MARKET_RELATED_EVENT(4, "MarketRelatedEvent", "Market Related Event"),

	/**
	 * The '<em><b>User Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	USER_EVENT(3, "UserEvent", "User Event"),

	/**
	 * The '<em><b>Resource Usage Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_USAGE_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_USAGE_EVENT(2, "ResourceUsageEvent", "Resource Usage Event"),

	/**
	 * The '<em><b>Compositeevent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITEEVENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITEEVENT(4, "Compositeevent", "Compositeevent");

	/**
	 * The '<em><b>Temporal Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temporal Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPORAL_EVENT
	 * @model name="TemporalEvent" literal="Temporal Event"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORAL_EVENT_VALUE = 0;

	/**
	 * The '<em><b>Market Related Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Market Related Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARKET_RELATED_EVENT
	 * @model name="MarketRelatedEvent" literal="Market Related Event"
	 * @generated
	 * @ordered
	 */
	public static final int MARKET_RELATED_EVENT_VALUE = 4;

	/**
	 * The '<em><b>User Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>User Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_EVENT
	 * @model name="UserEvent" literal="User Event"
	 * @generated
	 * @ordered
	 */
	public static final int USER_EVENT_VALUE = 3;

	/**
	 * The '<em><b>Resource Usage Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource Usage Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_USAGE_EVENT
	 * @model name="ResourceUsageEvent" literal="Resource Usage Event"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_USAGE_EVENT_VALUE = 2;

	/**
	 * The '<em><b>Compositeevent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compositeevent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITEEVENT
	 * @model name="Compositeevent"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITEEVENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Eventstype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Eventstype[] VALUES_ARRAY =
		new Eventstype[] {
			TEMPORAL_EVENT,
			MARKET_RELATED_EVENT,
			USER_EVENT,
			RESOURCE_USAGE_EVENT,
			COMPOSITEEVENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Eventstype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Eventstype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eventstype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Eventstype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Eventstype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eventstype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Eventstype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Eventstype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eventstype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Eventstype get(int value) {
		switch (value) {
			case TEMPORAL_EVENT_VALUE: return TEMPORAL_EVENT;
			case MARKET_RELATED_EVENT_VALUE: return MARKET_RELATED_EVENT;
			case USER_EVENT_VALUE: return USER_EVENT;
			case RESOURCE_USAGE_EVENT_VALUE: return RESOURCE_USAGE_EVENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Eventstype(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Eventstype
