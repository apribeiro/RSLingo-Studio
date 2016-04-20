/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Term Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefTermType#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefTermType#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefTermType()
 * @model
 * @generated
 */
public interface RefTermType extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Type</em>' containment reference.
   * @see #setRefType(TermType)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefTermType_RefType()
   * @model containment="true"
   * @generated
   */
  TermType getRefType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefTermType#getRefType <em>Ref Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Type</em>' containment reference.
   * @see #getRefType()
   * @generated
   */
  void setRefType(TermType value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.TermType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefTermType_Refs()
   * @model containment="true"
   * @generated
   */
  EList<TermType> getRefs();

} // RefTermType
