/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Goal#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Goal#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Goal#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Goal#getPriority <em>Priority</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Goal#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Goal#getComposedBy <em>Composed By</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGoal_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Goal#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGoal_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Goal#getDescription <em>Description</em>}' attribute.
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGoal_Stakeholder()
   * @model
   * @generated
   */
  Stakeholder getStakeholder();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Goal#getStakeholder <em>Stakeholder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stakeholder</em>' reference.
   * @see #getStakeholder()
   * @generated
   */
  void setStakeholder(Stakeholder value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGoal_Priority()
   * @model
   * @generated
   */
  String getPriority();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Goal#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(String value);

  /**
   * Returns the value of the '<em><b>Depends On</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.DependsOnGoal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends On</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends On</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGoal_DependsOn()
   * @model containment="true"
   * @generated
   */
  EList<DependsOnGoal> getDependsOn();

  /**
   * Returns the value of the '<em><b>Composed By</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.ComposedBy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composed By</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composed By</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getGoal_ComposedBy()
   * @model containment="true"
   * @generated
   */
  EList<ComposedBy> getComposedBy();

} // Goal
