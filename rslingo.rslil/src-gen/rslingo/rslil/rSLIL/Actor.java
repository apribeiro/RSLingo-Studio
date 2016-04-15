/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Actor#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Actor#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Actor#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Actor#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Actor#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Actor#getDependsOnType <em>Depends On Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Actor#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getActor_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Actor#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getActor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Actor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getActor_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Actor#getType <em>Type</em>}' attribute.
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getActor_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Actor#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholder</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholder</em>' reference.
   * @see #setStakeholder(Stakeholder)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getActor_Stakeholder()
   * @model
   * @generated
   */
  Stakeholder getStakeholder();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Actor#getStakeholder <em>Stakeholder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stakeholder</em>' reference.
   * @see #getStakeholder()
   * @generated
   */
  void setStakeholder(Stakeholder value);

  /**
   * Returns the value of the '<em><b>Depends On Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends On Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends On Type</em>' attribute.
   * @see #setDependsOnType(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getActor_DependsOnType()
   * @model
   * @generated
   */
  String getDependsOnType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Actor#getDependsOnType <em>Depends On Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depends On Type</em>' attribute.
   * @see #getDependsOnType()
   * @generated
   */
  void setDependsOnType(String value);

  /**
   * Returns the value of the '<em><b>Depends On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends On</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends On</em>' attribute.
   * @see #setDependsOn(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getActor_DependsOn()
   * @model
   * @generated
   */
  String getDependsOn();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Actor#getDependsOn <em>Depends On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depends On</em>' attribute.
   * @see #getDependsOn()
   * @generated
   */
  void setDependsOn(String value);

} // Actor
