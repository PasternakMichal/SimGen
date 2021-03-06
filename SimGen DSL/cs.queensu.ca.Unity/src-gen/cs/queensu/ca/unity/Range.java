/**
 * generated by Xtext 2.13.0
 */
package cs.queensu.ca.unity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.Range#getFrom <em>From</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.Range#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(Value)
   * @see cs.queensu.ca.unity.UnityPackage#getRange_From()
   * @model containment="true"
   * @generated
   */
  Value getFrom();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Range#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Value value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(Value)
   * @see cs.queensu.ca.unity.UnityPackage#getRange_To()
   * @model containment="true"
   * @generated
   */
  Value getTo();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Range#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Value value);

} // Range
