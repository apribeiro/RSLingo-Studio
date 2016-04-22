/*
 * generated by Xtext
 */
package rslingo.rslil.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import rslingo.rslil.services.RSLILGrammarAccess;

@SuppressWarnings("all")
public class RSLILSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RSLILGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Field_NotNullKeyword_7_q;
	protected AbstractElementAlias match_Field_UniqueKeyword_8_q;
	protected AbstractElementAlias match_UseCase_FunctionalRequirementsKeyword_12_0_q;
	protected AbstractElementAlias match_UseCase_GoalsKeyword_11_0_q;
	protected AbstractElementAlias match_UseCase_IncludeKeyword_18_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RSLILGrammarAccess) access;
		match_Field_NotNullKeyword_7_q = new TokenAlias(false, true, grammarAccess.getFieldAccess().getNotNullKeyword_7());
		match_Field_UniqueKeyword_8_q = new TokenAlias(false, true, grammarAccess.getFieldAccess().getUniqueKeyword_8());
		match_UseCase_FunctionalRequirementsKeyword_12_0_q = new TokenAlias(false, true, grammarAccess.getUseCaseAccess().getFunctionalRequirementsKeyword_12_0());
		match_UseCase_GoalsKeyword_11_0_q = new TokenAlias(false, true, grammarAccess.getUseCaseAccess().getGoalsKeyword_11_0());
		match_UseCase_IncludeKeyword_18_0_q = new TokenAlias(false, true, grammarAccess.getUseCaseAccess().getIncludeKeyword_18_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Field_NotNullKeyword_7_q.equals(syntax))
				emit_Field_NotNullKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Field_UniqueKeyword_8_q.equals(syntax))
				emit_Field_UniqueKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UseCase_FunctionalRequirementsKeyword_12_0_q.equals(syntax))
				emit_UseCase_FunctionalRequirementsKeyword_12_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UseCase_GoalsKeyword_11_0_q.equals(syntax))
				emit_UseCase_GoalsKeyword_11_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UseCase_IncludeKeyword_18_0_q.equals(syntax))
				emit_UseCase_IncludeKeyword_18_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'NotNull'?
	 *
	 * This ambiguous syntax occurs at:
	 *     defaultValue=STRING (ambiguity) 'Unique'? 'Check' value=STRING
	 *     defaultValue=STRING (ambiguity) 'Unique'? '}' (rule end)
	 *     multiplicity=Multiplicity (ambiguity) 'Unique'? 'Check' value=STRING
	 *     multiplicity=Multiplicity (ambiguity) 'Unique'? '}' (rule end)
	 */
	protected void emit_Field_NotNullKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Unique'?
	 *
	 * This ambiguous syntax occurs at:
	 *     defaultValue=STRING 'NotNull'? (ambiguity) 'Check' value=STRING
	 *     defaultValue=STRING 'NotNull'? (ambiguity) '}' (rule end)
	 *     multiplicity=Multiplicity 'NotNull'? (ambiguity) 'Check' value=STRING
	 *     multiplicity=Multiplicity 'NotNull'? (ambiguity) '}' (rule end)
	 */
	protected void emit_Field_UniqueKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'FunctionalRequirements'?
	 *
	 * This ambiguous syntax occurs at:
	 *     extensionnPoints+=ExtensionPoint 'Goals'? (ambiguity) 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     goals+=RefGoal (ambiguity) 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='High' 'Goals'? (ambiguity) 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='Low' 'Goals'? (ambiguity) 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='Medium' 'Goals'? (ambiguity) 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='VeryHigh' 'Goals'? (ambiguity) 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='VeryLow' 'Goals'? (ambiguity) 'ActorInitiates' actorInitiates=[Actor|ID]
	 */
	protected void emit_UseCase_FunctionalRequirementsKeyword_12_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Goals'?
	 *
	 * This ambiguous syntax occurs at:
	 *     extensionnPoints+=ExtensionPoint (ambiguity) 'FunctionalRequirements' frs+=RefFR
	 *     extensionnPoints+=ExtensionPoint (ambiguity) 'FunctionalRequirements'? 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='High' (ambiguity) 'FunctionalRequirements' frs+=RefFR
	 *     priotity='High' (ambiguity) 'FunctionalRequirements'? 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='Low' (ambiguity) 'FunctionalRequirements' frs+=RefFR
	 *     priotity='Low' (ambiguity) 'FunctionalRequirements'? 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='Medium' (ambiguity) 'FunctionalRequirements' frs+=RefFR
	 *     priotity='Medium' (ambiguity) 'FunctionalRequirements'? 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='VeryHigh' (ambiguity) 'FunctionalRequirements' frs+=RefFR
	 *     priotity='VeryHigh' (ambiguity) 'FunctionalRequirements'? 'ActorInitiates' actorInitiates=[Actor|ID]
	 *     priotity='VeryLow' (ambiguity) 'FunctionalRequirements' frs+=RefFR
	 *     priotity='VeryLow' (ambiguity) 'FunctionalRequirements'? 'ActorInitiates' actorInitiates=[Actor|ID]
	 */
	protected void emit_UseCase_GoalsKeyword_11_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Include'?
	 *
	 * This ambiguous syntax occurs at:
	 *     actorInitiates=[Actor|ID] (ambiguity) 'Extend' extends=[UseCase|ID]
	 *     actorInitiates=[Actor|ID] (ambiguity) '}' (rule end)
	 *     actorInitiates=[Actor|ID] (ambiguity) scenarios+=Scenario
	 *     actors=RefActor (ambiguity) 'Extend' extends=[UseCase|ID]
	 *     actors=RefActor (ambiguity) '}' (rule end)
	 *     actors=RefActor (ambiguity) scenarios+=Scenario
	 *     postConditions=STRING (ambiguity) 'Extend' extends=[UseCase|ID]
	 *     postConditions=STRING (ambiguity) '}' (rule end)
	 *     postConditions=STRING (ambiguity) scenarios+=Scenario
	 *     preConditions=STRING (ambiguity) 'Extend' extends=[UseCase|ID]
	 *     preConditions=STRING (ambiguity) '}' (rule end)
	 *     preConditions=STRING (ambiguity) scenarios+=Scenario
	 */
	protected void emit_UseCase_IncludeKeyword_18_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
