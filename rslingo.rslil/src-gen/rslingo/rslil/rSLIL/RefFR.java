/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref FR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefFR#getRefFR <em>Ref FR</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefFR#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefFR()
 * @model
 * @generated
 */
public interface RefFR extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref FR</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref FR</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref FR</em>' reference.
   * @see #setRefFR(FR)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefFR_RefFR()
   * @model
   * @generated
   */
  FR getRefFR();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefFR#getRefFR <em>Ref FR</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref FR</em>' reference.
   * @see #getRefFR()
   * @generated
   */
  void setRefFR(FR value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.FR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefFR_Refs()
   * @model
   * @generated
   */
  EList<FR> getRefs();

} // RefFR
