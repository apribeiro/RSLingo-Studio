/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depends On Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.DependsOnGoal#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.DependsOnGoal#getRefGoal <em>Ref Goal</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getDependsOnGoal()
 * @model
 * @generated
 */
public interface DependsOnGoal extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getDependsOnGoal_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.DependsOnGoal#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Ref Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Goal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Goal</em>' containment reference.
   * @see #setRefGoal(RefGoal)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getDependsOnGoal_RefGoal()
   * @model containment="true"
   * @generated
   */
  RefGoal getRefGoal();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.DependsOnGoal#getRefGoal <em>Ref Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Goal</em>' containment reference.
   * @see #getRefGoal()
   * @generated
   */
  void setRefGoal(RefGoal value);

} // DependsOnGoal
