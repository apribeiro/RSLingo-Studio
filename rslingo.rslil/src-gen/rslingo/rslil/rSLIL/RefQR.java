/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref QR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefQR#getRefQR <em>Ref QR</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefQR#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefQR()
 * @model
 * @generated
 */
public interface RefQR extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref QR</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref QR</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref QR</em>' reference.
   * @see #setRefQR(QR)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefQR_RefQR()
   * @model
   * @generated
   */
  QR getRefQR();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefQR#getRefQR <em>Ref QR</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref QR</em>' reference.
   * @see #getRefQR()
   * @generated
   */
  void setRefQR(QR value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.QR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefQR_Refs()
   * @model
   * @generated
   */
  EList<QR> getRefs();

} // RefQR
