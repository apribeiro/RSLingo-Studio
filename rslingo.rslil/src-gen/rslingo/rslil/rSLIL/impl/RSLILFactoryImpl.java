/**
 */
package rslingo.rslil.rSLIL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.ComposedBy;
import rslingo.rslil.rSLIL.DependsOnFR;
import rslingo.rslil.rSLIL.DependsOnGoal;
import rslingo.rslil.rSLIL.DependsOnNFR;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.ExtensionPoint;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.Field;
import rslingo.rslil.rSLIL.ForeignKey;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.Multiplicity;
import rslingo.rslil.rSLIL.NFR;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.RSLILFactory;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefActor;
import rslingo.rslil.rSLIL.RefAttribute;
import rslingo.rslil.rSLIL.RefFR;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefNFR;
import rslingo.rslil.rSLIL.RefSystem;
import rslingo.rslil.rSLIL.RefTerm;
import rslingo.rslil.rSLIL.RefTermType;
import rslingo.rslil.rSLIL.RefUC;
import rslingo.rslil.rSLIL.Scenario;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.Step;
import rslingo.rslil.rSLIL.TermRelation;
import rslingo.rslil.rSLIL.TermType;
import rslingo.rslil.rSLIL.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RSLILFactoryImpl extends EFactoryImpl implements RSLILFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RSLILFactory init()
  {
    try
    {
      RSLILFactory theRSLILFactory = (RSLILFactory)EPackage.Registry.INSTANCE.getEFactory(RSLILPackage.eNS_URI);
      if (theRSLILFactory != null)
      {
        return theRSLILFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RSLILFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLILFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RSLILPackage.MODEL: return createModel();
      case RSLILPackage.PROJECT: return createProject();
      case RSLILPackage.SYSTEM: return createSystem();
      case RSLILPackage.REF_SYSTEM: return createRefSystem();
      case RSLILPackage.GLOSSARY_TERM: return createGlossaryTerm();
      case RSLILPackage.REF_TERM_TYPE: return createRefTermType();
      case RSLILPackage.TERM_TYPE: return createTermType();
      case RSLILPackage.TERM_RELATION: return createTermRelation();
      case RSLILPackage.REF_TERM: return createRefTerm();
      case RSLILPackage.STAKEHOLDER: return createStakeholder();
      case RSLILPackage.GOAL: return createGoal();
      case RSLILPackage.DEPENDS_ON_GOAL: return createDependsOnGoal();
      case RSLILPackage.COMPOSED_BY: return createComposedBy();
      case RSLILPackage.REF_GOAL: return createRefGoal();
      case RSLILPackage.ENTITY: return createEntity();
      case RSLILPackage.ATTRIBUTE: return createAttribute();
      case RSLILPackage.FIELD: return createField();
      case RSLILPackage.MULTIPLICITY: return createMultiplicity();
      case RSLILPackage.FOREIGN_KEY: return createForeignKey();
      case RSLILPackage.REF_ATTRIBUTE: return createRefAttribute();
      case RSLILPackage.ACTOR: return createActor();
      case RSLILPackage.USE_CASE: return createUseCase();
      case RSLILPackage.REF_FR: return createRefFR();
      case RSLILPackage.REF_ACTOR: return createRefActor();
      case RSLILPackage.REF_UC: return createRefUC();
      case RSLILPackage.EXTENSION_POINT: return createExtensionPoint();
      case RSLILPackage.SCENARIO: return createScenario();
      case RSLILPackage.STEP: return createStep();
      case RSLILPackage.FR: return createFR();
      case RSLILPackage.DEPENDS_ON_FR: return createDependsOnFR();
      case RSLILPackage.NFR: return createNFR();
      case RSLILPackage.DEPENDS_ON_NFR: return createDependsOnNFR();
      case RSLILPackage.REF_NFR: return createRefNFR();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rslil.rSLIL.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefSystem createRefSystem()
  {
    RefSystemImpl refSystem = new RefSystemImpl();
    return refSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlossaryTerm createGlossaryTerm()
  {
    GlossaryTermImpl glossaryTerm = new GlossaryTermImpl();
    return glossaryTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefTermType createRefTermType()
  {
    RefTermTypeImpl refTermType = new RefTermTypeImpl();
    return refTermType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermType createTermType()
  {
    TermTypeImpl termType = new TermTypeImpl();
    return termType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermRelation createTermRelation()
  {
    TermRelationImpl termRelation = new TermRelationImpl();
    return termRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefTerm createRefTerm()
  {
    RefTermImpl refTerm = new RefTermImpl();
    return refTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder createStakeholder()
  {
    StakeholderImpl stakeholder = new StakeholderImpl();
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependsOnGoal createDependsOnGoal()
  {
    DependsOnGoalImpl dependsOnGoal = new DependsOnGoalImpl();
    return dependsOnGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposedBy createComposedBy()
  {
    ComposedByImpl composedBy = new ComposedByImpl();
    return composedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefGoal createRefGoal()
  {
    RefGoalImpl refGoal = new RefGoalImpl();
    return refGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity createMultiplicity()
  {
    MultiplicityImpl multiplicity = new MultiplicityImpl();
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeignKey createForeignKey()
  {
    ForeignKeyImpl foreignKey = new ForeignKeyImpl();
    return foreignKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefAttribute createRefAttribute()
  {
    RefAttributeImpl refAttribute = new RefAttributeImpl();
    return refAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase createUseCase()
  {
    UseCaseImpl useCase = new UseCaseImpl();
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefFR createRefFR()
  {
    RefFRImpl refFR = new RefFRImpl();
    return refFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefActor createRefActor()
  {
    RefActorImpl refActor = new RefActorImpl();
    return refActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefUC createRefUC()
  {
    RefUCImpl refUC = new RefUCImpl();
    return refUC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionPoint createExtensionPoint()
  {
    ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
    return extensionPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FR createFR()
  {
    FRImpl fr = new FRImpl();
    return fr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependsOnFR createDependsOnFR()
  {
    DependsOnFRImpl dependsOnFR = new DependsOnFRImpl();
    return dependsOnFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFR createNFR()
  {
    NFRImpl nfr = new NFRImpl();
    return nfr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependsOnNFR createDependsOnNFR()
  {
    DependsOnNFRImpl dependsOnNFR = new DependsOnNFRImpl();
    return dependsOnNFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefNFR createRefNFR()
  {
    RefNFRImpl refNFR = new RefNFRImpl();
    return refNFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLILPackage getRSLILPackage()
  {
    return (RSLILPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RSLILPackage getPackage()
  {
    return RSLILPackage.eINSTANCE;
  }

} //RSLILFactoryImpl
