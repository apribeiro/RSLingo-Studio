/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getMetric <em>Metric</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getValue <em>Value</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getPriority <em>Priority</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getDepends <em>Depends</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getQR()
 * @model
 * @generated
 */
public interface QR extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Alias</em>' attribute.
   * @see #setNameAlias(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Type</em>' attribute.
   * @see #setSubType(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_SubType()
   * @model
   * @generated
   */
  String getSubType();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getSubType <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Type</em>' attribute.
   * @see #getSubType()
   * @generated
   */
  void setSubType(String value);

  /**
   * Returns the value of the '<em><b>Metric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metric</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metric</em>' attribute.
   * @see #setMetric(String)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_Metric()
   * @model
   * @generated
   */
  String getMetric();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getMetric <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metric</em>' attribute.
   * @see #getMetric()
   * @generated
   */
  void setMetric(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholder</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholder</em>' reference.
   * @see #setStakeholder(Stakeholder)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_Stakeholder()
   * @model
   * @generated
   */
  Stakeholder getStakeholder();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getStakeholder <em>Stakeholder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stakeholder</em>' reference.
   * @see #getStakeholder()
   * @generated
   */
  void setStakeholder(Stakeholder value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' containment reference.
   * @see #setPriority(Priority)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_Priority()
   * @model containment="true"
   * @generated
   */
  Priority getPriority();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getPriority <em>Priority</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' containment reference.
   * @see #getPriority()
   * @generated
   */
  void setPriority(Priority value);

  /**
   * Returns the value of the '<em><b>Depends</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil.rSLIL.DependsOnQR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends</em>' containment reference list.
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_Depends()
   * @model containment="true"
   * @generated
   */
  EList<DependsOnQR> getDepends();

  /**
   * Returns the value of the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Of</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Of</em>' reference.
   * @see #setPartOf(QR)
   * @see rslingo.rslil.rSLIL.RSLILPackage#getQR_PartOf()
   * @model
   * @generated
   */
  QR getPartOf();

  /**
   * Sets the value of the '{@link rslingo.rslil.rSLIL.QR#getPartOf <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Of</em>' reference.
   * @see #getPartOf()
   * @generated
   */
  void setPartOf(QR value);

} // QR
