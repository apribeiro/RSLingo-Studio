/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Project#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Project#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Project#getRefSystem <em>Ref System</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getProject_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Project#getId <em>Id</em>}' attribute.
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getProject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Project#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getProject_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Project#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Ref System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref System</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref System</em>' containment reference.
   * @see #setRefSystem(RefSystem)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getProject_RefSystem()
   * @model containment="true"
   * @generated
   */
  RefSystem getRefSystem();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Project#getRefSystem <em>Ref System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref System</em>' containment reference.
   * @see #getRefSystem()
   * @generated
   */
  void setRefSystem(RefSystem value);

} // Project
