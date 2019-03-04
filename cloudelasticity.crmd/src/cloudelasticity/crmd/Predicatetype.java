/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Predicatetype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#getPredicatetype()
 * @model
 * @generated
 */
public enum Predicatetype implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "define predicate type"),

	/**
	 * The '<em><b>TS Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TS_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	TS_EVENT(1, "TSEvent", "TS-Event"),

	/**
	 * The '<em><b>TP Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TP_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	TP_EVENT(2, "TPEvent", "TP-Event"),

	/**
	 * The '<em><b>Qevent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QEVENT_VALUE
	 * @generated
	 * @ordered
	 */
	QEVENT(3, "Qevent", "Q-Event"),

	/**
	 * The '<em><b>UEvent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UEVENT_VALUE
	 * @generated
	 * @ordered
	 */
	UEVENT(4, "UEvent", "U-Event"),

	/**
	 * The '<em><b>MEvent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEVENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEVENT(5, "MEvent", "M-Event");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default" literal="define predicate type"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>TS Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TS Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TS_EVENT
	 * @model name="TSEvent" literal="TS-Event"
	 * @generated
	 * @ordered
	 */
	public static final int TS_EVENT_VALUE = 1;

	/**
	 * The '<em><b>TP Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TP Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TP_EVENT
	 * @model name="TPEvent" literal="TP-Event"
	 * @generated
	 * @ordered
	 */
	public static final int TP_EVENT_VALUE = 2;

	/**
	 * The '<em><b>Qevent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qevent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QEVENT
	 * @model name="Qevent" literal="Q-Event"
	 * @generated
	 * @ordered
	 */
	public static final int QEVENT_VALUE = 3;

	/**
	 * The '<em><b>UEvent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UEvent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UEVENT
	 * @model name="UEvent" literal="U-Event"
	 * @generated
	 * @ordered
	 */
	public static final int UEVENT_VALUE = 4;

	/**
	 * The '<em><b>MEvent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEvent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEVENT
	 * @model name="MEvent" literal="M-Event"
	 * @generated
	 * @ordered
	 */
	public static final int MEVENT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Predicatetype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Predicatetype[] VALUES_ARRAY =
		new Predicatetype[] {
			DEFAULT,
			TS_EVENT,
			TP_EVENT,
			QEVENT,
			UEVENT,
			MEVENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Predicatetype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Predicatetype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Predicatetype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Predicatetype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Predicatetype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predicatetype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Predicatetype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Predicatetype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predicatetype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Predicatetype get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case TS_EVENT_VALUE: return TS_EVENT;
			case TP_EVENT_VALUE: return TP_EVENT;
			case QEVENT_VALUE: return QEVENT;
			case UEVENT_VALUE: return UEVENT;
			case MEVENT_VALUE: return MEVENT;
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
	private Predicatetype(int value, String name, String literal) {
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
	
} //Predicatetype
