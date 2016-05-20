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
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getProject <em>Project</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getGlossaryTerms <em>Glossary Terms</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getGoals <em>Goals</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageProject#getPackageSystems <em>Package Systems</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject()
 * @model
 * @generated
 */
public interface PackageProject extends Model
{
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
   * Returns the value of the '<em><b>Glossary Terms</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.GlossaryTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Glossary Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glossary Terms</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_GlossaryTerms()
   * @model containment="true"
   * @generated
   */
  EList<GlossaryTerm> getGlossaryTerms();

  /**
   * Returns the value of the '<em><b>Stakeholders</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Stakeholder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholders</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_Stakeholders()
   * @model containment="true"
   * @generated
   */
  EList<Stakeholder> getStakeholders();

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageProject_Goals()
   * @model containment="true"
   * @generated
   */
  EList<Goal> getGoals();

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

} // PackageProject
