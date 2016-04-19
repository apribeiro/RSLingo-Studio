/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Step#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Step#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Step#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Step#getActor <em>Actor</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Step#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Step#getPostConditions <em>Post Conditions</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getStep_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Step#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(RefActionType)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getStep_Type()
   * @model containment="true"
   * @generated
   */
  RefActionType getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Step#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(RefActionType value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getStep_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Step#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor</em>' reference.
   * @see #setActor(Actor)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getStep_Actor()
   * @model
   * @generated
   */
  Actor getActor();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Step#getActor <em>Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actor</em>' reference.
   * @see #getActor()
   * @generated
   */
  void setActor(Actor value);

  /**
   * Returns the value of the '<em><b>Pre Conditions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Conditions</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Conditions</em>' attribute.
   * @see #setPreConditions(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getStep_PreConditions()
   * @model
   * @generated
   */
  String getPreConditions();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Step#getPreConditions <em>Pre Conditions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Conditions</em>' attribute.
   * @see #getPreConditions()
   * @generated
   */
  void setPreConditions(String value);

  /**
   * Returns the value of the '<em><b>Post Conditions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Conditions</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Conditions</em>' attribute.
   * @see #setPostConditions(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getStep_PostConditions()
   * @model
   * @generated
   */
  String getPostConditions();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Step#getPostConditions <em>Post Conditions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Conditions</em>' attribute.
   * @see #getPostConditions()
   * @generated
   */
  void setPostConditions(String value);

} // Step
