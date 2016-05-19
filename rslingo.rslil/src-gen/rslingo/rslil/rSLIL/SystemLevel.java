/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.SystemLevel#getSystems <em>Systems</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.SystemLevel#getEntities <em>Entities</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.SystemLevel#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.SystemLevel#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.SystemLevel#getFrs <em>Frs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.SystemLevel#getQrs <em>Qrs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.SystemLevel#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getSystemLevel()
 * @model
 * @generated
 */
public interface SystemLevel extends EObject
{
  /**
   * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.System}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Systems</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getSystemLevel_Systems()
   * @model containment="true"
   * @generated
   */
  EList<rslingo.rslil.rSLIL.System> getSystems();

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getSystemLevel_Entities()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getSystemLevel_Actors()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getSystemLevel_UseCases()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getSystemLevel_Frs()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getSystemLevel_Qrs()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getSystemLevel_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // SystemLevel
