/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.PackageGoal#getGoals <em>Goals</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageGoal#getGoalRelations <em>Goal Relations</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageGoal()
 * @model
 * @generated
 */
public interface PackageGoal extends Model
{
  /**
   * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageGoal_Goals()
   * @model containment="true"
   * @generated
   */
  EList<Goal> getGoals();

  /**
   * Returns the value of the '<em><b>Goal Relations</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.GoalRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal Relations</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageGoal_GoalRelations()
   * @model containment="true"
   * @generated
   */
  EList<GoalRelation> getGoalRelations();

} // PackageGoal
