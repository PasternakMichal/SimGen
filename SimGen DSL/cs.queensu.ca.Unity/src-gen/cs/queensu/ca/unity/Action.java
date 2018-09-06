/**
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.unity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.Action#getName <em>Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.Action#getPayload <em>Payload</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.Action#getReturnPayload <em>Return Payload</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.Action#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
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
   * @see cs.queensu.ca.unity.UnityPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Payload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Payload</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Payload</em>' containment reference.
   * @see #setPayload(Payload)
   * @see cs.queensu.ca.unity.UnityPackage#getAction_Payload()
   * @model containment="true"
   * @generated
   */
  Payload getPayload();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Action#getPayload <em>Payload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Payload</em>' containment reference.
   * @see #getPayload()
   * @generated
   */
  void setPayload(Payload value);

  /**
   * Returns the value of the '<em><b>Return Payload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Payload</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Payload</em>' containment reference.
   * @see #setReturnPayload(Payload)
   * @see cs.queensu.ca.unity.UnityPackage#getAction_ReturnPayload()
   * @model containment="true"
   * @generated
   */
  Payload getReturnPayload();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Action#getReturnPayload <em>Return Payload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Payload</em>' containment reference.
   * @see #getReturnPayload()
   * @generated
   */
  void setReturnPayload(Payload value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link cs.queensu.ca.unity.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see cs.queensu.ca.unity.UnityPackage#getAction_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Action