/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefActionType#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefActionType#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefActionType()
 * @model
 * @generated
 */
public interface RefActionType extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Type</em>' containment reference.
   * @see #setRefType(ActionType)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefActionType_RefType()
   * @model containment="true"
   * @generated
   */
  ActionType getRefType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefActionType#getRefType <em>Ref Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Type</em>' containment reference.
   * @see #getRefType()
   * @generated
   */
  void setRefType(ActionType value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.ActionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefActionType_Refs()
   * @model containment="true"
   * @generated
   */
  EList<ActionType> getRefs();

} // RefActionType
