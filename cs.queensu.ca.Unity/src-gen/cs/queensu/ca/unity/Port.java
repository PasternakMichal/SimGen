/**
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.unity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.Port#getName <em>Name</em>}</li>
 *   <li>{@link cs.queensu.ca.unity.Port#getPortnumber <em>Portnumber</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
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
   * @see cs.queensu.ca.unity.UnityPackage#getPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Portnumber</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Portnumber</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Portnumber</em>' attribute.
   * @see #setPortnumber(int)
   * @see cs.queensu.ca.unity.UnityPackage#getPort_Portnumber()
   * @model
   * @generated
   */
  int getPortnumber();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.Port#getPortnumber <em>Portnumber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Portnumber</em>' attribute.
   * @see #getPortnumber()
   * @generated
   */
  void setPortnumber(int value);

} // Port
