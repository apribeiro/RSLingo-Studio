/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.ForeignKey#getEntity <em>Entity</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.ForeignKey#getRefTo <em>Ref To</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.ForeignKey#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getForeignKey_Entity()
   * @model
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.ForeignKey#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getForeignKey_RefTo()
   * @model containment="true"
   * @generated
   */
  RefAttribute getRefTo();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.ForeignKey#getRefTo <em>Ref To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref To</em>' containment reference.
   * @see #getRefTo()
   * @generated
   */
  void setRefTo(RefAttribute value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' containment reference.
   * @see #setMultiplicity(Multiplicity)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getForeignKey_Multiplicity()
   * @model containment="true"
   * @generated
   */
  Multiplicity getMultiplicity();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.ForeignKey#getMultiplicity <em>Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' containment reference.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(Multiplicity value);

} // ForeignKey
