/**
 */
package cloudelasticity.crmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Propertyname</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudelasticity.crmd.crmdPackage#getPropertyname()
 * @model
 * @generated
 */
public enum Propertyname implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "define property name"),

	/**
	 * The '<em><b>Bandwidthusage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANDWIDTHUSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	BANDWIDTHUSAGE(11, "bandwidthusage", "bandwidth usage"),

	/**
	 * The '<em><b>Storageresilience</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGERESILIENCE_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGERESILIENCE(6, "Storageresilience", "Storage resilience"),

	/**
	 * The '<em><b>Public Network Incoming Mbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_NETWORK_INCOMING_MBPS_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_NETWORK_INCOMING_MBPS(8, "PublicNetworkIncomingMbps", "Public Network Incoming Mbps"),

	/**
	 * The '<em><b>Cost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COST_VALUE
	 * @generated
	 * @ordered
	 */
	COST(7, "Cost", "Cost"),

	/**
	 * The '<em><b>Throughput</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THROUGHPUT_VALUE
	 * @generated
	 * @ordered
	 */
	THROUGHPUT(5, "Throughput", "Throughput"),

	/**
	 * The '<em><b>Availability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABILITY(1, "Availability", "Availability"),

	/**
	 * The '<em><b>CP Uusage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP_UUSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CP_UUSAGE(10, "CPUusage", "CPU usage"),

	/**
	 * The '<em><b>Accuracy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCURACY_VALUE
	 * @generated
	 * @ordered
	 */
	ACCURACY(4, "Accuracy", "Accuracy"),

	/**
	 * The '<em><b>Response Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE_TIME(2, "ResponseTime", "Response Time"),

	/**
	 * The '<em><b>RA Musage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RA_MUSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	RA_MUSAGE(9, "RAMusage", "RAM usage"),

	/**
	 * The '<em><b>Latency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATENCY_VALUE
	 * @generated
	 * @ordered
	 */
	LATENCY(3, "Latency", "Latency");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default" literal="define property name"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Bandwidthusage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bandwidthusage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANDWIDTHUSAGE
	 * @model name="bandwidthusage" literal="bandwidth usage"
	 * @generated
	 * @ordered
	 */
	public static final int BANDWIDTHUSAGE_VALUE = 11;

	/**
	 * The '<em><b>Storageresilience</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storageresilience</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGERESILIENCE
	 * @model name="Storageresilience" literal="Storage resilience"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGERESILIENCE_VALUE = 6;

	/**
	 * The '<em><b>Public Network Incoming Mbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Public Network Incoming Mbps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_NETWORK_INCOMING_MBPS
	 * @model name="PublicNetworkIncomingMbps" literal="Public Network Incoming Mbps"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_NETWORK_INCOMING_MBPS_VALUE = 8;

	/**
	 * The '<em><b>Cost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cost</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COST
	 * @model name="Cost"
	 * @generated
	 * @ordered
	 */
	public static final int COST_VALUE = 7;

	/**
	 * The '<em><b>Throughput</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Throughput</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THROUGHPUT
	 * @model name="Throughput"
	 * @generated
	 * @ordered
	 */
	public static final int THROUGHPUT_VALUE = 5;

	/**
	 * The '<em><b>Availability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Availability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY
	 * @model name="Availability"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABILITY_VALUE = 1;

	/**
	 * The '<em><b>CP Uusage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP Uusage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP_UUSAGE
	 * @model name="CPUusage" literal="CPU usage"
	 * @generated
	 * @ordered
	 */
	public static final int CP_UUSAGE_VALUE = 10;

	/**
	 * The '<em><b>Accuracy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accuracy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCURACY
	 * @model name="Accuracy"
	 * @generated
	 * @ordered
	 */
	public static final int ACCURACY_VALUE = 4;

	/**
	 * The '<em><b>Response Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Response Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME
	 * @model name="ResponseTime" literal="Response Time"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_TIME_VALUE = 2;

	/**
	 * The '<em><b>RA Musage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RA Musage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RA_MUSAGE
	 * @model name="RAMusage" literal="RAM usage"
	 * @generated
	 * @ordered
	 */
	public static final int RA_MUSAGE_VALUE = 9;

	/**
	 * The '<em><b>Latency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Latency</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATENCY
	 * @model name="Latency"
	 * @generated
	 * @ordered
	 */
	public static final int LATENCY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Propertyname</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Propertyname[] VALUES_ARRAY =
		new Propertyname[] {
			DEFAULT,
			BANDWIDTHUSAGE,
			STORAGERESILIENCE,
			PUBLIC_NETWORK_INCOMING_MBPS,
			COST,
			THROUGHPUT,
			AVAILABILITY,
			CP_UUSAGE,
			ACCURACY,
			RESPONSE_TIME,
			RA_MUSAGE,
			LATENCY,
		};

	/**
	 * A public read-only list of all the '<em><b>Propertyname</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Propertyname> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Propertyname</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Propertyname get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Propertyname result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Propertyname</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Propertyname getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Propertyname result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Propertyname</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Propertyname get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case BANDWIDTHUSAGE_VALUE: return BANDWIDTHUSAGE;
			case STORAGERESILIENCE_VALUE: return STORAGERESILIENCE;
			case PUBLIC_NETWORK_INCOMING_MBPS_VALUE: return PUBLIC_NETWORK_INCOMING_MBPS;
			case COST_VALUE: return COST;
			case THROUGHPUT_VALUE: return THROUGHPUT;
			case AVAILABILITY_VALUE: return AVAILABILITY;
			case CP_UUSAGE_VALUE: return CP_UUSAGE;
			case ACCURACY_VALUE: return ACCURACY;
			case RESPONSE_TIME_VALUE: return RESPONSE_TIME;
			case RA_MUSAGE_VALUE: return RA_MUSAGE;
			case LATENCY_VALUE: return LATENCY;
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
	private Propertyname(int value, String name, String literal) {
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
	
} //Propertyname
