/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefConstraint#getRefConst <em>Ref Const</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefConstraint#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefConstraint()
 * @model
 * @generated
 */
public interface RefConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Const</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Const</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Const</em>' reference.
   * @see #setRefConst(Constraint)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefConstraint_RefConst()
   * @model
   * @generated
   */
  Constraint getRefConst();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefConstraint#getRefConst <em>Ref Const</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Const</em>' reference.
   * @see #getRefConst()
   * @generated
   */
  void setRefConst(Constraint value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefConstraint_Refs()
   * @model
   * @generated
   */
  EList<Constraint> getRefs();

} // RefConstraint
