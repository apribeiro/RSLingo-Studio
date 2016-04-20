/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.TermRelation#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.TermRelation#getRefTerm <em>Ref Term</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getTermRelation()
 * @model
 * @generated
 */
public interface TermRelation extends EObject
{
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getTermRelation_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.TermRelation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Ref Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Term</em>' containment reference.
   * @see #setRefTerm(RefTerm)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getTermRelation_RefTerm()
   * @model containment="true"
   * @generated
   */
  RefTerm getRefTerm();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.TermRelation#getRefTerm <em>Ref Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Term</em>' containment reference.
   * @see #getRefTerm()
   * @generated
   */
  void setRefTerm(RefTerm value);

} // TermRelation
