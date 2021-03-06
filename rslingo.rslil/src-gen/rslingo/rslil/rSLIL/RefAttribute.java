/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefAttribute#getRefAttr <em>Ref Attr</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefAttribute#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefAttribute()
 * @model
 * @generated
 */
public interface RefAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Attr</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Attr</em>' reference.
   * @see #setRefAttr(Attribute)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefAttribute_RefAttr()
   * @model
   * @generated
   */
  Attribute getRefAttr();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefAttribute#getRefAttr <em>Ref Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Attr</em>' reference.
   * @see #getRefAttr()
   * @generated
   */
  void setRefAttr(Attribute value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefAttribute_Refs()
   * @model
   * @generated
   */
  EList<Attribute> getRefs();

} // RefAttribute
