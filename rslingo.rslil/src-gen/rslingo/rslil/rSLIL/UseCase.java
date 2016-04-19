/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getPriotity <em>Priotity</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getGoals <em>Goals</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getFrs <em>Frs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getActorInitiates <em>Actor Initiates</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getIncludes <em>Includes</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getExtends <em>Extends</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getExtPoint <em>Ext Point</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getExtensionnPoints <em>Extensionn Points</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.UseCase#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Alias</em>' attribute.
   * @see #setNameAlias(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Priotity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priotity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priotity</em>' attribute.
   * @see #setPriotity(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Priotity()
   * @model
   * @generated
   */
  String getPriotity();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getPriotity <em>Priotity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priotity</em>' attribute.
   * @see #getPriotity()
   * @generated
   */
  void setPriotity(String value);

  /**
   * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.RefGoal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Goals()
   * @model containment="true"
   * @generated
   */
  EList<RefGoal> getGoals();

  /**
   * Returns the value of the '<em><b>Frs</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.RefFR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frs</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Frs()
   * @model containment="true"
   * @generated
   */
  EList<RefFR> getFrs();

  /**
   * Returns the value of the '<em><b>Actor Initiates</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor Initiates</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor Initiates</em>' reference.
   * @see #setActorInitiates(Actor)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_ActorInitiates()
   * @model
   * @generated
   */
  Actor getActorInitiates();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getActorInitiates <em>Actor Initiates</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actor Initiates</em>' reference.
   * @see #getActorInitiates()
   * @generated
   */
  void setActorInitiates(Actor value);

  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference.
   * @see #setActors(RefActor)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Actors()
   * @model containment="true"
   * @generated
   */
  RefActor getActors();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getActors <em>Actors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actors</em>' containment reference.
   * @see #getActors()
   * @generated
   */
  void setActors(RefActor value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_PreConditions()
   * @model
   * @generated
   */
  String getPreConditions();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getPreConditions <em>Pre Conditions</em>}' attribute.
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_PostConditions()
   * @model
   * @generated
   */
  String getPostConditions();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getPostConditions <em>Post Conditions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Conditions</em>' attribute.
   * @see #getPostConditions()
   * @generated
   */
  void setPostConditions(String value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.RefUC}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Includes()
   * @model containment="true"
   * @generated
   */
  EList<RefUC> getIncludes();

  /**
   * Returns the value of the '<em><b>Extends</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.UseCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Extends()
   * @model
   * @generated
   */
  EList<UseCase> getExtends();

  /**
   * Returns the value of the '<em><b>Ext Point</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ext Point</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ext Point</em>' reference.
   * @see #setExtPoint(ExtensionPoint)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_ExtPoint()
   * @model
   * @generated
   */
  ExtensionPoint getExtPoint();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.UseCase#getExtPoint <em>Ext Point</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ext Point</em>' reference.
   * @see #getExtPoint()
   * @generated
   */
  void setExtPoint(ExtensionPoint value);

  /**
   * Returns the value of the '<em><b>Extensionn Points</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.ExtensionPoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extensionn Points</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extensionn Points</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_ExtensionnPoints()
   * @model containment="true"
   * @generated
   */
  EList<ExtensionPoint> getExtensionnPoints();

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Scenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getUseCase_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<Scenario> getScenarios();

} // UseCase
