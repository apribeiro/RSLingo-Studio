/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefSystem#getRefSystem <em>Ref System</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefSystem#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefSystem()
 * @model
 * @generated
 */
public interface RefSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref System</em>' reference.
   * @see #setRefSystem(rslingo.rslil.rSLIL.System)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefSystem_RefSystem()
   * @model
   * @generated
   */
  rslingo.rslil.rSLIL.System getRefSystem();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefSystem#getRefSystem <em>Ref System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref System</em>' reference.
   * @see #getRefSystem()
   * @generated
   */
  void setRefSystem(rslingo.rslil.rSLIL.System value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.System}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefSystem_Refs()
   * @model
   * @generated
   */
  EList<rslingo.rslil.rSLIL.System> getRefs();

} // RefSystem
