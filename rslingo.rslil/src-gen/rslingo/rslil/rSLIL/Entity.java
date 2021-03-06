/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Entity#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Entity#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Entity#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Entity#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Entity#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Entity#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Entity#getChecks <em>Checks</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Entity#getName <em>Name</em>}' attribute.
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getEntity_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Entity#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getEntity_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Entity#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getEntity_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Entity#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getEntity_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key</em>' containment reference.
   * @see #setPrimaryKey(PrimaryKey)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getEntity_PrimaryKey()
   * @model containment="true"
   * @generated
   */
  PrimaryKey getPrimaryKey();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Entity#getPrimaryKey <em>Primary Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key</em>' containment reference.
   * @see #getPrimaryKey()
   * @generated
   */
  void setPrimaryKey(PrimaryKey value);

  /**
   * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.ForeignKey}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreign Keys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreign Keys</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getEntity_ForeignKeys()
   * @model containment="true"
   * @generated
   */
  EList<ForeignKey> getForeignKeys();

  /**
   * Returns the value of the '<em><b>Checks</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Check}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checks</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getEntity_Checks()
   * @model containment="true"
   * @generated
   */
  EList<Check> getChecks();

} // Entity
