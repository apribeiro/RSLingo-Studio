/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref NFR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefNFR#getRefNFR <em>Ref NFR</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefNFR#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefNFR()
 * @model
 * @generated
 */
public interface RefNFR extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref NFR</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref NFR</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref NFR</em>' reference.
   * @see #setRefNFR(NFR)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefNFR_RefNFR()
   * @model
   * @generated
   */
  NFR getRefNFR();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefNFR#getRefNFR <em>Ref NFR</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref NFR</em>' reference.
   * @see #getRefNFR()
   * @generated
   */
  void setRefNFR(NFR value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.NFR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefNFR_Refs()
   * @model
   * @generated
   */
  EList<NFR> getRefs();

} // RefNFR
