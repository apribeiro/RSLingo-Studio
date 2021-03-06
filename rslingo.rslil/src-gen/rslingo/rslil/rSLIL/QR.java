/**
 */
package rslingo.rslil.rSLIL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getMetric <em>Metric</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getValue <em>Value</em>}</li>
 *   <li>{@link rslingo.rslil.rSLIL.QR#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil.rSLIL.RSLILPackage#getQR()
 * @model
 * @generated
 */
public interface QR extends Requirement
{
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
