/**
 * generated by Xtext 2.12.0
 */
package cs.queensu.ca.unity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.queensu.ca.unity.IP#getIpAddr <em>Ip Addr</em>}</li>
 * </ul>
 *
 * @see cs.queensu.ca.unity.UnityPackage#getIP()
 * @model
 * @generated
 */
public interface IP extends EObject
{
  /**
   * Returns the value of the '<em><b>Ip Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip Addr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip Addr</em>' attribute.
   * @see #setIpAddr(String)
   * @see cs.queensu.ca.unity.UnityPackage#getIP_IpAddr()
   * @model
   * @generated
   */
  String getIpAddr();

  /**
   * Sets the value of the '{@link cs.queensu.ca.unity.IP#getIpAddr <em>Ip Addr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip Addr</em>' attribute.
   * @see #getIpAddr()
   * @generated
   */
  void setIpAddr(String value);

} // IP
