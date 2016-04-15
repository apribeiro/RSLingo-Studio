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
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.Glossary;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.NFR;
import rslingo.rslil.rSLIL.RSLILFactory;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefFR;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefSystem;
import rslingo.rslil.rSLIL.RefUC;
import rslingo.rslil.rSLIL.Stakeholder;
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
      case RSLILPackage.SYSTEM: return createSystem();
      case RSLILPackage.REF_SYSTEM: return createRefSystem();
      case RSLILPackage.GLOSSARY: return createGlossary();
      case RSLILPackage.STAKEHOLDER: return createStakeholder();
      case RSLILPackage.GOAL: return createGoal();
      case RSLILPackage.ENTITY: return createEntity();
      case RSLILPackage.ATTRIBUTE: return createAttribute();
      case RSLILPackage.ACTOR: return createActor();
      case RSLILPackage.USE_CASE: return createUseCase();
      case RSLILPackage.FR: return createFR();
      case RSLILPackage.NFR: return createNFR();
      case RSLILPackage.REF_GOAL: return createRefGoal();
      case RSLILPackage.REF_FR: return createRefFR();
      case RSLILPackage.REF_UC: return createRefUC();
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
  public Glossary createGlossary()
  {
    GlossaryImpl glossary = new GlossaryImpl();
    return glossary;
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
