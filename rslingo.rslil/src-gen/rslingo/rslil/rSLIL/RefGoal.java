/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefGoal#getRefGoal <em>Ref Goal</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefGoal#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefGoal()
 * @model
 * @generated
 */
public interface RefGoal extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Goal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Goal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Goal</em>' reference.
   * @see #setRefGoal(Goal)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefGoal_RefGoal()
   * @model
   * @generated
   */
  Goal getRefGoal();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefGoal#getRefGoal <em>Ref Goal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Goal</em>' reference.
   * @see #getRefGoal()
   * @generated
   */
  void setRefGoal(Goal value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefGoal_Refs()
   * @model
   * @generated
   */
  EList<Goal> getRefs();

} // RefGoal
