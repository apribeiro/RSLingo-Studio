/**
 */
package rslingo.rslil.rSLIL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.Check;
import rslingo.rslil.rSLIL.ComposedBy;
import rslingo.rslil.rSLIL.Constraint;
import rslingo.rslil.rSLIL.DependsOnConstraint;
import rslingo.rslil.rSLIL.DependsOnFR;
import rslingo.rslil.rSLIL.DependsOnGoal;
import rslingo.rslil.rSLIL.DependsOnQR;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.EntityType;
import rslingo.rslil.rSLIL.ExtensionPoint;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.ForeignKey;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.Import;
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.Multiplicity;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.PrimaryKey;
import rslingo.rslil.rSLIL.Priority;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefActor;
import rslingo.rslil.rSLIL.RefAttribute;
import rslingo.rslil.rSLIL.RefConstraint;
import rslingo.rslil.rSLIL.RefEntity;
import rslingo.rslil.rSLIL.RefFR;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefQR;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rslingo.rslil.rSLIL.RSLILPackage
 * @generated
 */
public class RSLILAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RSLILPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLILAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RSLILPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RSLILSwitch<Adapter> modelSwitch =
    new RSLILSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePackageProject(PackageProject object)
      {
        return createPackageProjectAdapter();
      }
      @Override
      public Adapter casePackageSystem(PackageSystem object)
      {
        return createPackageSystemAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseSystem(rslingo.rslil.rSLIL.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseRefSystem(RefSystem object)
      {
        return createRefSystemAdapter();
      }
      @Override
      public Adapter caseGlossaryTerm(GlossaryTerm object)
      {
        return createGlossaryTermAdapter();
      }
      @Override
      public Adapter caseRefTermType(RefTermType object)
      {
        return createRefTermTypeAdapter();
      }
      @Override
      public Adapter caseTermType(TermType object)
      {
        return createTermTypeAdapter();
      }
      @Override
      public Adapter caseTermRelation(TermRelation object)
      {
        return createTermRelationAdapter();
      }
      @Override
      public Adapter caseRefTerm(RefTerm object)
      {
        return createRefTermAdapter();
      }
      @Override
      public Adapter caseStakeholder(Stakeholder object)
      {
        return createStakeholderAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter casePriority(Priority object)
      {
        return createPriorityAdapter();
      }
      @Override
      public Adapter caseDependsOnGoal(DependsOnGoal object)
      {
        return createDependsOnGoalAdapter();
      }
      @Override
      public Adapter caseComposedBy(ComposedBy object)
      {
        return createComposedByAdapter();
      }
      @Override
      public Adapter caseRefGoal(RefGoal object)
      {
        return createRefGoalAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseMultiplicity(Multiplicity object)
      {
        return createMultiplicityAdapter();
      }
      @Override
      public Adapter casePrimaryKey(PrimaryKey object)
      {
        return createPrimaryKeyAdapter();
      }
      @Override
      public Adapter caseForeignKey(ForeignKey object)
      {
        return createForeignKeyAdapter();
      }
      @Override
      public Adapter caseRefAttribute(RefAttribute object)
      {
        return createRefAttributeAdapter();
      }
      @Override
      public Adapter caseCheck(Check object)
      {
        return createCheckAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseUseCase(UseCase object)
      {
        return createUseCaseAdapter();
      }
      @Override
      public Adapter caseRefEntity(RefEntity object)
      {
        return createRefEntityAdapter();
      }
      @Override
      public Adapter caseEntityType(EntityType object)
      {
        return createEntityTypeAdapter();
      }
      @Override
      public Adapter caseRefFR(RefFR object)
      {
        return createRefFRAdapter();
      }
      @Override
      public Adapter caseRefActor(RefActor object)
      {
        return createRefActorAdapter();
      }
      @Override
      public Adapter caseRefUC(RefUC object)
      {
        return createRefUCAdapter();
      }
      @Override
      public Adapter caseExtensionPoint(ExtensionPoint object)
      {
        return createExtensionPointAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseStep(Step object)
      {
        return createStepAdapter();
      }
      @Override
      public Adapter caseFR(FR object)
      {
        return createFRAdapter();
      }
      @Override
      public Adapter caseDependsOnFR(DependsOnFR object)
      {
        return createDependsOnFRAdapter();
      }
      @Override
      public Adapter caseQR(QR object)
      {
        return createQRAdapter();
      }
      @Override
      public Adapter caseDependsOnQR(DependsOnQR object)
      {
        return createDependsOnQRAdapter();
      }
      @Override
      public Adapter caseRefQR(RefQR object)
      {
        return createRefQRAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseDependsOnConstraint(DependsOnConstraint object)
      {
        return createDependsOnConstraintAdapter();
      }
      @Override
      public Adapter caseRefConstraint(RefConstraint object)
      {
        return createRefConstraintAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.PackageProject <em>Package Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.PackageProject
   * @generated
   */
  public Adapter createPackageProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.PackageSystem <em>Package System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.PackageSystem
   * @generated
   */
  public Adapter createPackageSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefSystem <em>Ref System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefSystem
   * @generated
   */
  public Adapter createRefSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.GlossaryTerm <em>Glossary Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.GlossaryTerm
   * @generated
   */
  public Adapter createGlossaryTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefTermType <em>Ref Term Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefTermType
   * @generated
   */
  public Adapter createRefTermTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.TermType <em>Term Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.TermType
   * @generated
   */
  public Adapter createTermTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.TermRelation <em>Term Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.TermRelation
   * @generated
   */
  public Adapter createTermRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefTerm <em>Ref Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefTerm
   * @generated
   */
  public Adapter createRefTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Stakeholder
   * @generated
   */
  public Adapter createStakeholderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Priority
   * @generated
   */
  public Adapter createPriorityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.DependsOnGoal <em>Depends On Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.DependsOnGoal
   * @generated
   */
  public Adapter createDependsOnGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.ComposedBy <em>Composed By</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.ComposedBy
   * @generated
   */
  public Adapter createComposedByAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefGoal <em>Ref Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefGoal
   * @generated
   */
  public Adapter createRefGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Multiplicity
   * @generated
   */
  public Adapter createMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.PrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.PrimaryKey
   * @generated
   */
  public Adapter createPrimaryKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.ForeignKey
   * @generated
   */
  public Adapter createForeignKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefAttribute <em>Ref Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefAttribute
   * @generated
   */
  public Adapter createRefAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Check
   * @generated
   */
  public Adapter createCheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.UseCase
   * @generated
   */
  public Adapter createUseCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefEntity <em>Ref Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefEntity
   * @generated
   */
  public Adapter createRefEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.EntityType
   * @generated
   */
  public Adapter createEntityTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefFR <em>Ref FR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefFR
   * @generated
   */
  public Adapter createRefFRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefActor <em>Ref Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefActor
   * @generated
   */
  public Adapter createRefActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefUC <em>Ref UC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefUC
   * @generated
   */
  public Adapter createRefUCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.ExtensionPoint <em>Extension Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.ExtensionPoint
   * @generated
   */
  public Adapter createExtensionPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Step
   * @generated
   */
  public Adapter createStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.FR <em>FR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.FR
   * @generated
   */
  public Adapter createFRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.DependsOnFR <em>Depends On FR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.DependsOnFR
   * @generated
   */
  public Adapter createDependsOnFRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.QR <em>QR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.QR
   * @generated
   */
  public Adapter createQRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.DependsOnQR <em>Depends On QR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.DependsOnQR
   * @generated
   */
  public Adapter createDependsOnQRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefQR <em>Ref QR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefQR
   * @generated
   */
  public Adapter createRefQRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.DependsOnConstraint <em>Depends On Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.DependsOnConstraint
   * @generated
   */
  public Adapter createDependsOnConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefConstraint <em>Ref Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefConstraint
   * @generated
   */
  public Adapter createRefConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RSLILAdapterFactory
