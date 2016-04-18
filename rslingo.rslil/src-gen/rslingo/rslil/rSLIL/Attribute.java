/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Attribute#getDescrition <em>Descrition</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Attribute#getField <em>Field</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Attribute#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Descrition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descrition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descrition</em>' attribute.
   * @see #setDescrition(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getAttribute_Descrition()
   * @model
   * @generated
   */
  String getDescrition();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Attribute#getDescrition <em>Descrition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Descrition</em>' attribute.
   * @see #getDescrition()
   * @generated
   */
  void setDescrition(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getAttribute_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Attribute#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference.
   * @see #setField(Field)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getAttribute_Field()
   * @model containment="true"
   * @generated
   */
  Field getField();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Attribute#getField <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' containment reference.
   * @see #getField()
   * @generated
   */
  void setField(Field value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(Reference)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getAttribute_Reference()
   * @model containment="true"
   * @generated
   */
  Reference getReference();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Attribute#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Reference value);

} // Attribute
