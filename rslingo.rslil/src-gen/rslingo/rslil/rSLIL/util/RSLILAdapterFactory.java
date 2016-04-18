/**
 */
package rslingo.rslil.rSLIL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.ComposedBy;
import rslingo.rslil.rSLIL.DependsOnActor;
import rslingo.rslil.rSLIL.DependsOnGoal;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.ExtensionPoint;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.Field;
import rslingo.rslil.rSLIL.Glossary;
import rslingo.rslil.rSLIL.GlossaryType;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.NFR;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefActor;
import rslingo.rslil.rSLIL.RefAttribute;
import rslingo.rslil.rSLIL.RefFR;
import rslingo.rslil.rSLIL.RefGlossaryType;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefSystem;
import rslingo.rslil.rSLIL.RefUC;
import rslingo.rslil.rSLIL.Reference;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.Term;
import rslingo.rslil.rSLIL.TermRelation;
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
      public Adapter caseGlossary(Glossary object)
      {
        return createGlossaryAdapter();
      }
      @Override
      public Adapter caseRefGlossaryType(RefGlossaryType object)
      {
        return createRefGlossaryTypeAdapter();
      }
      @Override
      public Adapter caseGlossaryType(GlossaryType object)
      {
        return createGlossaryTypeAdapter();
      }
      @Override
      public Adapter caseTermRelation(TermRelation object)
      {
        return createTermRelationAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
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
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseRefAttribute(RefAttribute object)
      {
        return createRefAttributeAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseDependsOnActor(DependsOnActor object)
      {
        return createDependsOnActorAdapter();
      }
      @Override
      public Adapter caseUseCase(UseCase object)
      {
        return createUseCaseAdapter();
      }
      @Override
      public Adapter caseRefGoal(RefGoal object)
      {
        return createRefGoalAdapter();
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
      public Adapter caseFR(FR object)
      {
        return createFRAdapter();
      }
      @Override
      public Adapter caseNFR(NFR object)
      {
        return createNFRAdapter();
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
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Glossary <em>Glossary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Glossary
   * @generated
   */
  public Adapter createGlossaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.RefGlossaryType <em>Ref Glossary Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.RefGlossaryType
   * @generated
   */
  public Adapter createRefGlossaryTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.GlossaryType <em>Glossary Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.GlossaryType
   * @generated
   */
  public Adapter createGlossaryTypeAdapter()
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
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Term
   * @generated
   */
  public Adapter createTermAdapter()
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
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
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
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.DependsOnActor <em>Depends On Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.DependsOnActor
   * @generated
   */
  public Adapter createDependsOnActorAdapter()
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
   * Creates a new adapter for an object of class '{@link rslingo.rslil.rSLIL.NFR <em>NFR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil.rSLIL.NFR
   * @generated
   */
  public Adapter createNFRAdapter()
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
