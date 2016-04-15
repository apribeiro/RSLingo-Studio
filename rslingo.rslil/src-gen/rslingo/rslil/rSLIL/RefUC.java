/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref UC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefUC#getRefUC <em>Ref UC</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefUC#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefUC()
 * @model
 * @generated
 */
public interface RefUC extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref UC</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref UC</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref UC</em>' reference.
   * @see #setRefUC(UseCase)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefUC_RefUC()
   * @model
   * @generated
   */
  UseCase getRefUC();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefUC#getRefUC <em>Ref UC</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref UC</em>' reference.
   * @see #getRefUC()
   * @generated
   */
  void setRefUC(UseCase value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.UseCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefUC_Refs()
   * @model
   * @generated
   */
  EList<UseCase> getRefs();

} // RefUC
