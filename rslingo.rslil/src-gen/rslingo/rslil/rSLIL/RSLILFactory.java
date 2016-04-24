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
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  Project createProject();

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
   * Returns a new object of class '<em>Glossary Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Glossary Term</em>'.
   * @generated
   */
  GlossaryTerm createGlossaryTerm();

  /**
   * Returns a new object of class '<em>Ref Term Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Term Type</em>'.
   * @generated
   */
  RefTermType createRefTermType();

  /**
   * Returns a new object of class '<em>Term Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Type</em>'.
   * @generated
   */
  TermType createTermType();

  /**
   * Returns a new object of class '<em>Term Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Relation</em>'.
   * @generated
   */
  TermRelation createTermRelation();

  /**
   * Returns a new object of class '<em>Ref Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Term</em>'.
   * @generated
   */
  RefTerm createRefTerm();

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
   * Returns a new object of class '<em>Depends On Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Depends On Goal</em>'.
   * @generated
   */
  DependsOnGoal createDependsOnGoal();

  /**
   * Returns a new object of class '<em>Composed By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composed By</em>'.
   * @generated
   */
  ComposedBy createComposedBy();

  /**
   * Returns a new object of class '<em>Ref Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Goal</em>'.
   * @generated
   */
  RefGoal createRefGoal();

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
   * Returns a new object of class '<em>Multiplicity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicity</em>'.
   * @generated
   */
  Multiplicity createMultiplicity();

  /**
   * Returns a new object of class '<em>Primary Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Key</em>'.
   * @generated
   */
  PrimaryKey createPrimaryKey();

  /**
   * Returns a new object of class '<em>Foreign Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreign Key</em>'.
   * @generated
   */
  ForeignKey createForeignKey();

  /**
   * Returns a new object of class '<em>Ref Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Attribute</em>'.
   * @generated
   */
  RefAttribute createRefAttribute();

  /**
   * Returns a new object of class '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check</em>'.
   * @generated
   */
  Check createCheck();

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
   * Returns a new object of class '<em>Ref Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Entity</em>'.
   * @generated
   */
  RefEntity createRefEntity();

  /**
   * Returns a new object of class '<em>Entity Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Type</em>'.
   * @generated
   */
  EntityType createEntityType();

  /**
   * Returns a new object of class '<em>Ref FR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref FR</em>'.
   * @generated
   */
  RefFR createRefFR();

  /**
   * Returns a new object of class '<em>Ref Actor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Actor</em>'.
   * @generated
   */
  RefActor createRefActor();

  /**
   * Returns a new object of class '<em>Ref UC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref UC</em>'.
   * @generated
   */
  RefUC createRefUC();

  /**
   * Returns a new object of class '<em>Extension Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Point</em>'.
   * @generated
   */
  ExtensionPoint createExtensionPoint();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Step</em>'.
   * @generated
   */
  Step createStep();

  /**
   * Returns a new object of class '<em>FR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FR</em>'.
   * @generated
   */
  FR createFR();

  /**
   * Returns a new object of class '<em>Depends On FR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Depends On FR</em>'.
   * @generated
   */
  DependsOnFR createDependsOnFR();

  /**
   * Returns a new object of class '<em>NFR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR</em>'.
   * @generated
   */
  NFR createNFR();

  /**
   * Returns a new object of class '<em>Depends On NFR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Depends On NFR</em>'.
   * @generated
   */
  DependsOnNFR createDependsOnNFR();

  /**
   * Returns a new object of class '<em>Ref NFR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref NFR</em>'.
   * @generated
   */
  RefNFR createRefNFR();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RSLILPackage getRSLILPackage();

} //RSLILFactory
