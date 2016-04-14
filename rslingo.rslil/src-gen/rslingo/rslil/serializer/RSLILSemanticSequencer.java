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
import rslingo.rslil.rSLIL.Glossary;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefSystem;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.services.RSLILGrammarAccess;

@SuppressWarnings("all")
public class RSLILSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RSLILGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RSLILPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RSLILPackage.GLOSSARY:
				sequence_Glossary(context, (Glossary) semanticObject); 
				return; 
			case RSLILPackage.GOAL:
				sequence_Goal(context, (Goal) semanticObject); 
				return; 
			case RSLILPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RSLILPackage.REF_SYSTEM:
				sequence_RefSystem(context, (RefSystem) semanticObject); 
				return; 
			case RSLILPackage.STAKEHOLDER:
				sequence_Stakeholder(context, (Stakeholder) semanticObject); 
				return; 
			case RSLILPackage.SYSTEM:
				sequence_System(context, (rslingo.rslil.rSLIL.System) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         name=STRING 
	 *         type=STRING 
	 *         acronym=STRING 
	 *         description=STRING 
	 *         pos=STRING 
	 *         synset=STRING 
	 *         termRelationType=STRING 
	 *         termRelation=STRING
	 *     )
	 */
	protected void sequence_Glossary(EObject context, Glossary semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GLOSSARY__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GLOSSARY__ID));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GLOSSARY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GLOSSARY__NAME));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GLOSSARY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GLOSSARY__TYPE));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GLOSSARY__ACRONYM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GLOSSARY__ACRONYM));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GLOSSARY__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GLOSSARY__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GLOSSARY__POS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GLOSSARY__POS));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GLOSSARY__SYNSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GLOSSARY__SYNSET));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GLOSSARY__TERM_RELATION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GLOSSARY__TERM_RELATION_TYPE));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GLOSSARY__TERM_RELATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GLOSSARY__TERM_RELATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGlossaryAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGlossaryAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGlossaryAccess().getTypeSTRINGTerminalRuleCall_6_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGlossaryAccess().getAcronymSTRINGTerminalRuleCall_8_0(), semanticObject.getAcronym());
		feeder.accept(grammarAccess.getGlossaryAccess().getDescriptionSTRINGTerminalRuleCall_10_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getGlossaryAccess().getPosSTRINGTerminalRuleCall_12_0(), semanticObject.getPos());
		feeder.accept(grammarAccess.getGlossaryAccess().getSynsetSTRINGTerminalRuleCall_14_0(), semanticObject.getSynset());
		feeder.accept(grammarAccess.getGlossaryAccess().getTermRelationTypeSTRINGTerminalRuleCall_16_0(), semanticObject.getTermRelationType());
		feeder.accept(grammarAccess.getGlossaryAccess().getTermRelationSTRINGTerminalRuleCall_18_0(), semanticObject.getTermRelation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         description=STRING 
	 *         stakeholder=[Stakeholder|ID] 
	 *         priority=STRING 
	 *         dependsOnType=STRING 
	 *         dependsOn=STRING 
	 *         composedByType=STRING 
	 *         composedBy=STRING
	 *     )
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GOAL__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GOAL__ID));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GOAL__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GOAL__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GOAL__STAKEHOLDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GOAL__STAKEHOLDER));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GOAL__PRIORITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GOAL__PRIORITY));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GOAL__DEPENDS_ON_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GOAL__DEPENDS_ON_TYPE));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GOAL__DEPENDS_ON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GOAL__DEPENDS_ON));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GOAL__COMPOSED_BY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GOAL__COMPOSED_BY_TYPE));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.GOAL__COMPOSED_BY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.GOAL__COMPOSED_BY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGoalAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getGoalAccess().getStakeholderStakeholderIDTerminalRuleCall_6_0_1(), semanticObject.getStakeholder());
		feeder.accept(grammarAccess.getGoalAccess().getPrioritySTRINGTerminalRuleCall_8_0(), semanticObject.getPriority());
		feeder.accept(grammarAccess.getGoalAccess().getDependsOnTypeSTRINGTerminalRuleCall_10_0(), semanticObject.getDependsOnType());
		feeder.accept(grammarAccess.getGoalAccess().getDependsOnSTRINGTerminalRuleCall_12_0(), semanticObject.getDependsOn());
		feeder.accept(grammarAccess.getGoalAccess().getComposedByTypeSTRINGTerminalRuleCall_14_0(), semanticObject.getComposedByType());
		feeder.accept(grammarAccess.getGoalAccess().getComposedBySTRINGTerminalRuleCall_16_0(), semanticObject.getComposedBy());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (systems+=System* glossaries+=Glossary* stakeholders+=Stakeholder* goals+=Goal*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
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
	 *     (
	 *         id=ID 
	 *         name=STRING 
	 *         type=STRING 
	 *         category=STRING 
	 *         description=STRING 
	 *         dependsOnType=STRING 
	 *         dependsOn=STRING
	 *     )
	 */
	protected void sequence_Stakeholder(EObject context, Stakeholder semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.STAKEHOLDER__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.STAKEHOLDER__ID));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.STAKEHOLDER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.STAKEHOLDER__NAME));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.STAKEHOLDER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.STAKEHOLDER__TYPE));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.STAKEHOLDER__CATEGORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.STAKEHOLDER__CATEGORY));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.STAKEHOLDER__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.STAKEHOLDER__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.STAKEHOLDER__DEPENDS_ON_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.STAKEHOLDER__DEPENDS_ON_TYPE));
			if(transientValues.isValueTransient(semanticObject, RSLILPackage.Literals.STAKEHOLDER__DEPENDS_ON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLILPackage.Literals.STAKEHOLDER__DEPENDS_ON));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStakeholderAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getStakeholderAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStakeholderAccess().getTypeSTRINGTerminalRuleCall_6_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getStakeholderAccess().getCategorySTRINGTerminalRuleCall_8_0(), semanticObject.getCategory());
		feeder.accept(grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_10_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getStakeholderAccess().getDependsOnTypeSTRINGTerminalRuleCall_12_0(), semanticObject.getDependsOnType());
		feeder.accept(grammarAccess.getStakeholderAccess().getDependsOnSTRINGTerminalRuleCall_14_0(), semanticObject.getDependsOn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         systemId=STRING 
	 *         name=STRING 
	 *         description=STRING 
	 *         refSystem=RefSystem? 
	 *         partOf=[System|ID]?
	 *     )
	 */
	protected void sequence_System(EObject context, rslingo.rslil.rSLIL.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
