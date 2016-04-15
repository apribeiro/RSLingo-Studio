/**
 */
package rslingo.rslil.rSLIL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rslingo.rslil.rSLIL.RSLILPackage
 * @generated
 */
public interface RSLILFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RSLILFactory eINSTANCE = rslingo.rslil.rSLIL.impl.RSLILFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System</em>'.
   * @generated
   */
  System createSystem();

  /**
   * Returns a new object of class '<em>Ref System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref System</em>'.
   * @generated
   */
  RefSystem createRefSystem();

  /**
   * Returns a new object of class '<em>Glossary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Glossary</em>'.
   * @generated
   */
  Glossary createGlossary();

  /**
   * Returns a new object of class '<em>Stakeholder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stakeholder</em>'.
   * @generated
   */
  Stakeholder createStakeholder();

  /**
   * Returns a new object of class '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal</em>'.
   * @generated
   */
  Goal createGoal();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor</em>'.
   * @generated
   */
  Actor createActor();

  /**
   * Returns a new object of class '<em>Use Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Case</em>'.
   * @generated
   */
  UseCase createUseCase();

  /**
   * Returns a new object of class '<em>FR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FR</em>'.
   * @generated
   */
  FR createFR();

  /**
   * Returns a new object of class '<em>NFR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR</em>'.
   * @generated
   */
  NFR createNFR();

  /**
   * Returns a new object of class '<em>Ref Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Goal</em>'.
   * @generated
   */
  RefGoal createRefGoal();

  /**
   * Returns a new object of class '<em>Ref FR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref FR</em>'.
   * @generated
   */
  RefFR createRefFR();

  /**
   * Returns a new object of class '<em>Ref UC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref UC</em>'.
   * @generated
   */
  RefUC createRefUC();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RSLILPackage getRSLILPackage();

} //RSLILFactory
