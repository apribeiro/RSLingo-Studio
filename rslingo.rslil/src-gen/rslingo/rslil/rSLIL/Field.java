/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Field#getSize <em>Size</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Field#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Field#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getField_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Field#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see #setMultiplicity(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getField_Multiplicity()
   * @model
   * @generated
   */
  String getMultiplicity();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Field#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(String value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getField_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Field#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

} // Field
