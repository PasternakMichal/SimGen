/**
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.unity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.Attribute#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.Attribute#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Property
{
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
   * @see cs.queensu.ca.unity.UnityPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Property Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Type</em>' containment reference.
   * @see #setPropertyType(VarType)
   * @see cs.queensu.ca.unity.UnityPackage#getAttribute_PropertyType()
   * @model containment="true"
   * @generated
   */
  VarType getPropertyType();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Attribute#getPropertyType <em>Property Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Type</em>' containment reference.
   * @see #getPropertyType()
   * @generated
   */
  void setPropertyType(VarType value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Range)
   * @see cs.queensu.ca.unity.UnityPackage#getAttribute_Range()
   * @model containment="true"
   * @generated
   */
  Range getRange();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Attribute#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Range value);

} // Attribute
