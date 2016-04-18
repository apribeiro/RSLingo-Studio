/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.Term#getRefTerm <em>Ref Term</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.Term#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Term</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Term</em>' attribute.
   * @see #setRefTerm(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getTerm_RefTerm()
   * @model
   * @generated
   */
  String getRefTerm();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.Term#getRefTerm <em>Ref Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Term</em>' attribute.
   * @see #getRefTerm()
   * @generated
   */
  void setRefTerm(String value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' attribute list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getTerm_Refs()
   * @model unique="false"
   * @generated
   */
  EList<String> getRefs();

} // Term
