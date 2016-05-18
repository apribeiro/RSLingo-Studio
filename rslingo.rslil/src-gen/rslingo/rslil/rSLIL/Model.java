/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getProject <em>Project</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getSystems <em>Systems</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getGlossaryTerms <em>Glossary Terms</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getGoals <em>Goals</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getEntities <em>Entities</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getFrs <em>Frs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getNfrs <em>Nfrs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Project()
   * @model containment="true"
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Model#getProject <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' containment reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Systems()
   * @model containment="true"
   * @generated
   */
  EList<rslingo.rslil.rSLIL.System> getSystems();

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_GlossaryTerms()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Stakeholders()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Goals()
   * @model containment="true"
   * @generated
   */
  EList<Goal> getGoals();

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Entities()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Actors()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_UseCases()
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Frs()
   * @model containment="true"
   * @generated
   */
  EList<FR> getFrs();

  /**
   * Returns the value of the '<em><b>Nfrs</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.NFR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nfrs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nfrs</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Nfrs()
   * @model containment="true"
   * @generated
   */
  EList<NFR> getNfrs();

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // Model
