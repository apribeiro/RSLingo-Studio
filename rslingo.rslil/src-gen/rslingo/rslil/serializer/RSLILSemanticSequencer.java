/*
 * generated by Xtext
 */
package rslingo.rslil.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
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
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.Multiplicity;
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
import rslingo.rslil.services.RSLILGrammarAccess;

@SuppressWarnings("all")
public class RSLILSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RSLILGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RSLILPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RSLILPackage.ACTOR:
				sequence_Actor(context, (Actor) semanticObject); 
				return; 
			case RSLILPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case RSLILPackage.CHECK:
				sequence_Check(context, (Check) semanticObject); 
				return; 
			case RSLILPackage.COMPOSED_BY:
				sequence_ComposedBy(context, (ComposedBy) semanticObject); 
				return; 
			case RSLILPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case RSLILPackage.DEPENDS_ON_CONSTRAINT:
				sequence_DependsOnConstraint(context, (DependsOnConstraint) semanticObject); 
				return; 
			case RSLILPackage.DEPENDS_ON_FR:
				sequence_DependsOnFR(context, (DependsOnFR) semanticObject); 
				return; 
			case RSLILPackage.DEPENDS_ON_GOAL:
				sequence_DependsOnGoal(context, (DependsOnGoal) semanticObject); 
				return; 
			case RSLILPackage.DEPENDS_ON_QR:
				sequence_DependsOnQR(context, (DependsOnQR) semanticObject); 
				return; 
			case RSLILPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case RSLILPackage.ENTITY_TYPE:
				sequence_EntityType(context, (EntityType) semanticObject); 
				return; 
			case RSLILPackage.EXTENSION_POINT:
				sequence_ExtensionPoint(context, (ExtensionPoint) semanticObject); 
				return; 
			case RSLILPackage.FR:
				sequence_FR(context, (FR) semanticObject); 
				return; 
			case RSLILPackage.FOREIGN_KEY:
				sequence_ForeignKey(context, (ForeignKey) semanticObject); 
				return; 
			case RSLILPackage.GLOSSARY_TERM:
				sequence_GlossaryTerm(context, (GlossaryTerm) semanticObject); 
				return; 
			case RSLILPackage.GOAL:
				sequence_Goal(context, (Goal) semanticObject); 
				return; 
			case RSLILPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RSLILPackage.MULTIPLICITY:
				sequence_Multiplicity(context, (Multiplicity) semanticObject); 
				return; 
			case RSLILPackage.PRIMARY_KEY:
				sequence_PrimaryKey(context, (PrimaryKey) semanticObject); 
				return; 
			case RSLILPackage.PRIORITY:
				sequence_Priority(context, (Priority) semanticObject); 
				return; 
			case RSLILPackage.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case RSLILPackage.QR:
				sequence_QR(context, (QR) semanticObject); 
				return; 
			case RSLILPackage.REF_ACTOR:
				sequence_RefActor(context, (RefActor) semanticObject); 
				return; 
			case RSLILPackage.REF_ATTRIBUTE:
				sequence_RefAttribute(context, (RefAttribute) semanticObject); 
				return; 
			case RSLILPackage.REF_CONSTRAINT:
				sequence_RefConstraint(context, (RefConstraint) semanticObject); 
				return; 
			case RSLILPackage.REF_ENTITY:
				sequence_RefEntity(context, (RefEntity) semanticObject); 
				return; 
			case RSLILPackage.REF_FR:
				sequence_RefFR(context, (RefFR) semanticObject); 
				return; 
			case RSLILPackage.REF_GOAL:
				sequence_RefGoal(context, (RefGoal) semanticObject); 
				return; 
			case RSLILPackage.REF_QR:
				sequence_RefQR(context, (RefQR) semanticObject); 
				return; 
			case RSLILPackage.REF_SYSTEM:
				sequence_RefSystem(context, (RefSystem) semanticObject); 
				return; 
			case RSLILPackage.REF_TERM:
				sequence_RefTerm(context, (RefTerm) semanticObject); 
				return; 
			case RSLILPackage.REF_TERM_TYPE:
				sequence_RefTermType(context, (RefTermType) semanticObject); 
				return; 
			case RSLILPackage.REF_UC:
				sequence_RefUC(context, (RefUC) semanticObject); 
				return; 
			case RSLILPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case RSLILPackage.STAKEHOLDER:
				sequence_Stakeholder(context, (Stakeholder) semanticObject); 
				return; 
			case RSLILPackage.STEP:
				sequence_Step(context, (Step) semanticObject); 
				return; 
			case RSLILPackage.SYSTEM:
				sequence_System(context, (rslingo.rslil.rSLIL.System) semanticObject); 
				return; 
			case RSLILPackage.TERM_RELATION:
				sequence_TermRelation(context, (TermRelation) semanticObject); 
				return; 
			case RSLILPackage.TERM_TYPE:
				sequence_TermType(context, (TermType) semanticObject); 
				return; 
			case RSLILPackage.USE_CASE:
				sequence_UseCase(context, (UseCase) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         (type='User' | type='ExternalSystem' | type='Timer') 
	 *         stakeholder=[Stakeholder|ID]? 
	 *         actor=[Actor|ID]?
	 *     )
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         (
	 *             type='Boolean' | 
	 *             type='Integer' | 
	 *             type='Decimal' | 
	 *             type='Currency' | 
	 *             type='Date' | 
	 *             type='Time' | 
	 *             type='Datetime' | 
	 *             type='Enumeration' | 
	 *             type='Text' | 
	 *             type='Regex' | 
	 *             type='URL' | 
	 *             type='Image'
	 *         ) 
	 *         size=INT? 
	 *         multiplicity=Multiplicity? 
	 *         defaultValue=STRING? 
	 *         notNull='NotNull'? 
	 *         unique='Unique'?
	 *     )
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID checkExpression=STRING)
	 */
	protected void sequence_Check(EObject context, Check semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.CHECK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.CHECK__NAME));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.CHECK__CHECK_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.CHECK__CHECK_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCheckAccess().getCheckExpressionSTRINGTerminalRuleCall_2_0(), semanticObject.getCheckExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((type='Logic-And' | type='Logic-Or') refGoal=RefGoal)
	 */
	protected void sequence_ComposedBy(EObject context, ComposedBy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         (
	 *             type='Cultural' | 
	 *             type='Legal' | 
	 *             type='Organizational' | 
	 *             type='Physical' | 
	 *             type='Project' | 
	 *             type='Technological' | 
	 *             type='Other'
	 *         ) 
	 *         stakeholder=[Stakeholder|ID]? 
	 *         priority=Priority 
	 *         depends+=DependsOnConstraint* 
	 *         partOf=[Constraint|ID]?
	 *     )
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type='Requires' | type='Refines' | type='Conflicts') refConst=RefConstraint)
	 */
	protected void sequence_DependsOnConstraint(EObject context, DependsOnConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type='Requires' | type='Refines' | type='Conflicts') refFr=RefFR)
	 */
	protected void sequence_DependsOnFR(EObject context, DependsOnFR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type='Requires' | type='Supports' | type='Obstructs' | type='Conflicts' | type='Identical') refGoal=RefGoal)
	 */
	protected void sequence_DependsOnGoal(EObject context, DependsOnGoal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type='Requires' | type='Refines' | type='Conflicts') refQr=RefQR)
	 */
	protected void sequence_DependsOnQR(EObject context, DependsOnQR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='Master' | type='Detail' | type='Reference')
	 */
	protected void sequence_EntityType(EObject context, EntityType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         (type='Principal' | type='Secondary')? 
	 *         attributes+=Attribute+ 
	 *         primaryKey=PrimaryKey? 
	 *         foreignKeys+=ForeignKey* 
	 *         checks+=Check*
	 *     )
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_ExtensionPoint(EObject context, ExtensionPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING 
	 *         (type='Functional' | type='Behavioral' | type='Data') 
	 *         stakeholder=[Stakeholder|ID]? 
	 *         priority=Priority 
	 *         depends+=DependsOnFR* 
	 *         partOf=[FR|ID]?
	 *     )
	 */
	protected void sequence_FR(EObject context, FR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entity=[Entity|ID] refTo=RefAttribute multiplicity=Multiplicity)
	 */
	protected void sequence_ForeignKey(EObject context, ForeignKey semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.FOREIGN_KEY__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.FOREIGN_KEY__ENTITY));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.FOREIGN_KEY__REF_TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.FOREIGN_KEY__REF_TO));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.FOREIGN_KEY__MULTIPLICITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.FOREIGN_KEY__MULTIPLICITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForeignKeyAccess().getEntityEntityIDTerminalRuleCall_1_0_1(), semanticObject.getEntity());
		feeder.accept(grammarAccess.getForeignKeyAccess().getRefToRefAttributeParserRuleCall_3_0(), semanticObject.getRefTo());
		feeder.accept(grammarAccess.getForeignKeyAccess().getMultiplicityMultiplicityParserRuleCall_6_0(), semanticObject.getMultiplicity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         type=RefTermType 
	 *         acronym=STRING? 
	 *         (pos='Adjective' | pos='Adverb' | pos='Noun' | pos='Verb')? 
	 *         synset=STRING? 
	 *         termRelation+=TermRelation*
	 *     )
	 */
	protected void sequence_GlossaryTerm(EObject context, GlossaryTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         stakeholder=[Stakeholder|ID]? 
	 *         priority=Priority 
	 *         dependsOn+=DependsOnGoal* 
	 *         composedBy+=ComposedBy*
	 *     )
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         project=Project 
	 *         systems+=System* 
	 *         glossaryTerms+=GlossaryTerm* 
	 *         stakeholders+=Stakeholder* 
	 *         goals+=Goal* 
	 *         entities+=Entity* 
	 *         actors+=Actor* 
	 *         useCases+=UseCase* 
	 *         frs+=FR* 
	 *         qrs+=QR* 
	 *         constraints+=Constraint*
	 *     )
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='"0"' | value='"1"' | value='"0..1"' | value='"*"' | value=STRING)
	 */
	protected void sequence_Multiplicity(EObject context, Multiplicity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     refTo=RefAttribute
	 */
	protected void sequence_PrimaryKey(EObject context, PrimaryKey semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.PRIMARY_KEY__REF_TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.PRIMARY_KEY__REF_TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryKeyAccess().getRefToRefAttributeParserRuleCall_2_0(), semanticObject.getRefTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='Must' | value='Should' | value='Could' | value='Won't')
	 */
	protected void sequence_Priority(EObject context, Priority semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID nameAlias=STRING? description=STRING refSystem=RefSystem?)
	 */
	protected void sequence_Project(EObject context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING 
	 *         (
	 *             type='Security' | 
	 *             type='Performance' | 
	 *             type='Usability' | 
	 *             type='Appearance' | 
	 *             type='Operational' | 
	 *             type='Maintenance' | 
	 *             type='Cultural' | 
	 *             type='Legal'
	 *         ) 
	 *         (
	 *             subType='Security.Privacy' | 
	 *             subType='Security.Integrity' | 
	 *             subType='Usability.EaseOfUse' | 
	 *             subType='Usability.EaseOfLearn' | 
	 *             subType='Usability.Accessibility'
	 *         )? 
	 *         (
	 *             metric='Hours' | 
	 *             metric='Mins' | 
	 *             metric='Secs' | 
	 *             metric='mSecs' | 
	 *             metric='Tasks' | 
	 *             metric='Other'
	 *         ) 
	 *         value=INT 
	 *         stakeholder=[Stakeholder|ID]? 
	 *         priority=Priority 
	 *         depends+=DependsOnQR* 
	 *         partOf=[QR|ID]?
	 *     )
	 */
	protected void sequence_QR(EObject context, QR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refActor=[Actor|ID] refs+=[Actor|ID]*)
	 */
	protected void sequence_RefActor(EObject context, RefActor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refAttr=[Attribute|ID] refs+=[Attribute|ID]*)
	 */
	protected void sequence_RefAttribute(EObject context, RefAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refConst=[Constraint|ID] refs+=[Constraint|ID]*)
	 */
	protected void sequence_RefConstraint(EObject context, RefConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refEntity=[Entity|ID] type=EntityType (refs+=[Entity|ID] refType+=EntityType)*)
	 */
	protected void sequence_RefEntity(EObject context, RefEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refFR=[FR|ID] refs+=[FR|ID]*)
	 */
	protected void sequence_RefFR(EObject context, RefFR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refGoal=[Goal|ID] refs+=[Goal|ID]*)
	 */
	protected void sequence_RefGoal(EObject context, RefGoal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refQR=[QR|ID] refs+=[QR|ID]*)
	 */
	protected void sequence_RefQR(EObject context, RefQR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refSystem=[System|ID] refs+=[System|ID]*)
	 */
	protected void sequence_RefSystem(EObject context, RefSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refType=TermType refs+=TermType*)
	 */
	protected void sequence_RefTermType(EObject context, RefTermType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refTerm=STRING refs+=STRING*)
	 */
	protected void sequence_RefTerm(EObject context, RefTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refUC=[UseCase|ID] refs+=[UseCase|ID]*)
	 */
	protected void sequence_RefUC(EObject context, RefUC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         (type='Main' | type='Alternative' | type='Exception') 
	 *         (mode='Sequential' | mode='Parallel') 
	 *         steps+=Step*
	 *     )
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         (type='Group.Organization' | type='Group.BusinessUnit' | type='Group.Team' | type='Individual.Person' | type='Individual.ExternalSystem') 
	 *         (
	 *             category='Business' | 
	 *             category='Business.Customer' | 
	 *             category='Business.Customer.Sponsor' | 
	 *             category='Business.Customer.Champion' | 
	 *             category='Business.User.Direct' | 
	 *             category='Business.User.Indirect' | 
	 *             category='Business.Advisor.DomainExpert' | 
	 *             category='Business.Advisor.Trainer' | 
	 *             category='Business.Advisor.RegulatorAgent' | 
	 *             category='Business.System' | 
	 *             category='Technical' | 
	 *             category='Technical.BusinessAnalyst' | 
	 *             category='Technical.Requirements.Engineer' | 
	 *             category='Technical.Software.Architect' | 
	 *             category='Technical.Software.Designer' | 
	 *             category='Technical.Software.Tester'
	 *         ) 
	 *         partOf=[Stakeholder|ID]?
	 *     )
	 */
	protected void sequence_Stakeholder(EObject context, Stakeholder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         (type='ActorPrepareData' | type='ActorCallSystem' | type='SystemExecutes' | type='SystemReturnResult' | type='Other') 
	 *         actor=[Actor|ID]? 
	 *         preConditions=STRING? 
	 *         postConditions=STRING? 
	 *         next=[Step|ID]?
	 *     )
	 */
	protected void sequence_Step(EObject context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID nameAlias=STRING? description=STRING? partOf=[System|ID]?)
	 */
	protected void sequence_System(EObject context, rslingo.rslil.rSLIL.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type='Antonym' | type='Hypernym' | type='Synonym') refTerm=RefTerm)
	 */
	protected void sequence_TermRelation(EObject context, TermRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='Stakeholder' | type='Entity' | type='Architectural' | type='Actor')
	 */
	protected void sequence_TermType(EObject context, TermType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         nameAlias=STRING? 
	 *         description=STRING? 
	 *         (
	 *             type='EntityManage' | 
	 *             type='EntityBrowse' | 
	 *             type='EntitySearch' | 
	 *             type='EntityCreate' | 
	 *             type='EntityDelete' | 
	 *             type='EntitySync' | 
	 *             type='Report'
	 *         ) 
	 *         entities=RefEntity? 
	 *         priority=Priority 
	 *         extensionPoints+=ExtensionPoint* 
	 *         goals+=RefGoal* 
	 *         frs+=RefFR* 
	 *         actorInitiates=[Actor|ID] 
	 *         actors=RefActor? 
	 *         preConditions=STRING? 
	 *         postConditions=STRING? 
	 *         includes+=RefUC* 
	 *         (extends=[UseCase|ID] extPoint=[ExtensionPoint|ID])? 
	 *         scenarios+=Scenario*
	 *     )
	 */
	protected void sequence_UseCase(EObject context, UseCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
