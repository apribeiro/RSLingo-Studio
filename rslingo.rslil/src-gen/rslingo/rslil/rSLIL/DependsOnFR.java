/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depends On FR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.DependsOnFR#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.DependsOnFR#getRefFr <em>Ref Fr</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getDependsOnFR()
 * @model
 * @generated
 */
public interface DependsOnFR extends EObject
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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getDependsOnFR_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.DependsOnFR#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Ref Fr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Fr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Fr</em>' containment reference.
   * @see #setRefFr(RefFR)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getDependsOnFR_RefFr()
   * @model containment="true"
   * @generated
   */
  RefFR getRefFr();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.DependsOnFR#getRefFr <em>Ref Fr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Fr</em>' containment reference.
   * @see #getRefFr()
   * @generated
   */
  void setRefFr(RefFR value);

} // DependsOnFR
