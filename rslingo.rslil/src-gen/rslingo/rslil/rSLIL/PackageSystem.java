/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.PackageSystem#getImports <em>Imports</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageSystem#getSystem <em>System</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageSystem#getEntities <em>Entities</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageSystem#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageSystem#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageSystem#getFrs <em>Frs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageSystem#getQrs <em>Qrs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageSystem#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.PackageSystem#getRequirementRelations <em>Requirement Relations</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem()
 * @model
 * @generated
 */
public interface PackageSystem extends Model
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' containment reference.
   * @see #setSystem(rslingo.rslil.rSLIL.System)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem_System()
   * @model containment="true"
   * @generated
   */
  rslingo.rslil.rSLIL.System getSystem();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.PackageSystem#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(rslingo.rslil.rSLIL.System value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem_Actors()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActors();

  /**
   * Returns the value of the '<em><b>Use Cases</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.UseCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Cases</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem_UseCases()
   * @model containment="true"
   * @generated
   */
  EList<UseCase> getUseCases();

  /**
   * Returns the value of the '<em><b>Frs</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.FR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frs</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem_Frs()
   * @model containment="true"
   * @generated
   */
  EList<FR> getFrs();

  /**
   * Returns the value of the '<em><b>Qrs</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.QR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qrs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qrs</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem_Qrs()
   * @model containment="true"
   * @generated
   */
  EList<QR> getQrs();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

  /**
   * Returns the value of the '<em><b>Requirement Relations</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.RequirementRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirement Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement Relations</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPackageSystem_RequirementRelations()
   * @model containment="true"
   * @generated
   */
  EList<RequirementRelation> getRequirementRelations();

} // PackageSystem
