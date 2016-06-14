/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getImports <em>Imports</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getProject <em>Project</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getPackageGlossary <em>Package Glossary</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getPackageStakeholders <em>Package Stakeholders</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getPackageGoals <em>Package Goals</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getGoalRelations <em>Goal Relations</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getPackageSystems <em>Package Systems</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getSystemRelations <em>System Relations</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject()
 * @model
 * @generated
 */
public interface PackageProject extends Model
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' containment reference.
   * @see #setProject(Project)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_Project()
   * @model containment="true"
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.PackageProject#getProject <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' containment reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

  /**
   * Returns the value of the '<em><b>Package Glossary</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.PackageGlossary}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Glossary</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Glossary</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_PackageGlossary()
   * @model containment="true"
   * @generated
   */
  EList<PackageGlossary> getPackageGlossary();

  /**
   * Returns the value of the '<em><b>Package Stakeholders</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.PackageStakeholder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Stakeholders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Stakeholders</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_PackageStakeholders()
   * @model containment="true"
   * @generated
   */
  EList<PackageStakeholder> getPackageStakeholders();

  /**
   * Returns the value of the '<em><b>Package Goals</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.PackageGoal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Goals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Goals</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_PackageGoals()
   * @model containment="true"
   * @generated
   */
  EList<PackageGoal> getPackageGoals();

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_GoalRelations()
   * @model containment="true"
   * @generated
   */
  EList<GoalRelation> getGoalRelations();

  /**
   * Returns the value of the '<em><b>Package Systems</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.PackageSystem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Systems</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_PackageSystems()
   * @model containment="true"
   * @generated
   */
  EList<PackageSystem> getPackageSystems();

  /**
   * Returns the value of the '<em><b>System Relations</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.SystemRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Relations</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_SystemRelations()
   * @model containment="true"
   * @generated
   */
  EList<SystemRelation> getSystemRelations();

} // PackageProject
