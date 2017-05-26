/**
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.unity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.ConfigAssignment#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.ConfigAssignment#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getConfigAssignment()
 * @model
 * @generated
 */
public interface ConfigAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Property Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Name</em>' reference.
   * @see #setPropertyName(Attribute)
   * @see cs.queensu.ca.unity.UnityPackage#getConfigAssignment_PropertyName()
   * @model
   * @generated
   */
  Attribute getPropertyName();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.ConfigAssignment#getPropertyName <em>Property Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Name</em>' reference.
   * @see #getPropertyName()
   * @generated
   */
  void setPropertyName(Attribute value);

  /**
   * Returns the value of the '<em><b>Property Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Value</em>' containment reference.
   * @see #setPropertyValue(Expression)
   * @see cs.queensu.ca.unity.UnityPackage#getConfigAssignment_PropertyValue()
   * @model containment="true"
   * @generated
   */
  Expression getPropertyValue();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.ConfigAssignment#getPropertyValue <em>Property Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Value</em>' containment reference.
   * @see #getPropertyValue()
   * @generated
   */
  void setPropertyValue(Expression value);

} // ConfigAssignment