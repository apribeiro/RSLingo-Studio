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
 *   <li>{@link rslingo.rslil.rSLIL.Model#getSystems <em>Systems</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getGlossaries <em>Glossaries</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Model#getGoals <em>Goals</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Systems()
   * @model containment="true"
   * @generated
   */
  EList<rslingo.rslil.rSLIL.System> getSystems();

  /**
   * Returns the value of the '<em><b>Glossaries</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Glossary}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Glossaries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glossaries</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getModel_Glossaries()
   * @model containment="true"
   * @generated
   */
  EList<Glossary> getGlossaries();

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

} // Model
