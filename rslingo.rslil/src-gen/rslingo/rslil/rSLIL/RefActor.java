/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.RefActor#getRefActor <em>Ref Actor</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.RefActor#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getRefActor()
 * @model
 * @generated
 */
public interface RefActor extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Actor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Actor</em>' reference.
   * @see #setRefActor(Actor)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefActor_RefActor()
   * @model
   * @generated
   */
  Actor getRefActor();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.RefActor#getRefActor <em>Ref Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Actor</em>' reference.
   * @see #getRefActor()
   * @generated
   */
  void setRefActor(Actor value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getRefActor_Refs()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getRefs();

} // RefActor
