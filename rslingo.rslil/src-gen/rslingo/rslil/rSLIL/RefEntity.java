/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefEntity#getRefEntity <em>Ref Entity</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefEntity#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefEntity#getRefs <em>Refs</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefEntity#getRefType <em>Ref Type</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefEntity()
 * @model
 * @generated
 */
public interface RefEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Entity</em>' reference.
   * @see #setRefEntity(Entity)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefEntity_RefEntity()
   * @model
   * @generated
   */
  Entity getRefEntity();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefEntity#getRefEntity <em>Ref Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Entity</em>' reference.
   * @see #getRefEntity()
   * @generated
   */
  void setRefEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(EntityType)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefEntity_Type()
   * @model containment="true"
   * @generated
   */
  EntityType getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefEntity#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(EntityType value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefEntity_Refs()
   * @model
   * @generated
   */
  EList<Entity> getRefs();

  /**
   * Returns the value of the '<em><b>Ref Type</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.EntityType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Type</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefEntity_RefType()
   * @model containment="true"
   * @generated
   */
  EList<EntityType> getRefType();

} // RefEntity
