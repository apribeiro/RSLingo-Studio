/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depends On Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.DependsOnConstraint#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.DependsOnConstraint#getRefConst <em>Ref Const</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getDependsOnConstraint()
 * @model
 * @generated
 */
public interface DependsOnConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getDependsOnConstraint_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.DependsOnConstraint#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Ref Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Const</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Const</em>' containment reference.
   * @see #setRefConst(RefConstraint)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getDependsOnConstraint_RefConst()
   * @model containment="true"
   * @generated
   */
  RefConstraint getRefConst();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.DependsOnConstraint#getRefConst <em>Ref Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Const</em>' containment reference.
   * @see #getRefConst()
   * @generated
   */
  void setRefConst(RefConstraint value);

} // DependsOnConstraint
