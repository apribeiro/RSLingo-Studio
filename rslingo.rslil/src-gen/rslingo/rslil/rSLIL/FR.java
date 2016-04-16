/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.FR#getId <em>Id</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.FR#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.FR#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.FR#getModalityType <em>Modality Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.FR#getActionType <em>Action Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.FR#getSource <em>Source</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.FR#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getFR()
 * @model
 * @generated
 */
public interface FR extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getFR_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.FR#getId <em>Id</em>}' attribute.
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getFR_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.FR#getName <em>Name</em>}' attribute.
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getFR_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.FR#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Modality Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modality Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modality Type</em>' attribute.
   * @see #setModalityType(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getFR_ModalityType()
   * @model
   * @generated
   */
  String getModalityType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.FR#getModalityType <em>Modality Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modality Type</em>' attribute.
   * @see #getModalityType()
   * @generated
   */
  void setModalityType(String value);

  /**
   * Returns the value of the '<em><b>Action Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Type</em>' attribute.
   * @see #setActionType(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getFR_ActionType()
   * @model
   * @generated
   */
  String getActionType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.FR#getActionType <em>Action Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Type</em>' attribute.
   * @see #getActionType()
   * @generated
   */
  void setActionType(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Stakeholder)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getFR_Source()
   * @model
   * @generated
   */
  Stakeholder getSource();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.FR#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Stakeholder value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getFR_Priority()
   * @model
   * @generated
   */
  String getPriority();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.FR#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(String value);

} // FR