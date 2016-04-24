/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.PrimaryKey#getRefTo <em>Ref To</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref To</em>' containment reference.
   * @see #setRefTo(RefAttribute)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getPrimaryKey_RefTo()
   * @model containment="true"
   * @generated
   */
  RefAttribute getRefTo();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.PrimaryKey#getRefTo <em>Ref To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref To</em>' containment reference.
   * @see #getRefTo()
   * @generated
   */
  void setRefTo(RefAttribute value);

} // PrimaryKey
