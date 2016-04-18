/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Reference#getRefTo <em>Ref To</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Reference#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getReference_RefTo()
   * @model containment="true"
   * @generated
   */
  RefAttribute getRefTo();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Reference#getRefTo <em>Ref To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref To</em>' containment reference.
   * @see #getRefTo()
   * @generated
   */
  void setRefTo(RefAttribute value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getReference_Multiplicity()
   * @model
   * @generated
   */
  String getMultiplicity();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Reference#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(String value);

} // Reference
