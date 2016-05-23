/*
 * generated by Xtext
 */
package rslingo.rslil.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import rslingo.rslil.services.RSLILGrammarAccess;

public class RSLILParser extends AbstractContentAssistParser {
	
	@Inject
	private RSLILGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected rslingo.rslil.ui.contentassist.antlr.internal.InternalRSLILParser createParser() {
		rslingo.rslil.ui.contentassist.antlr.internal.InternalRSLILParser result = new rslingo.rslil.ui.contentassist.antlr.internal.InternalRSLILParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getGlossaryTermAccess().getPosAlternatives_8_1_0(), "rule__GlossaryTerm__PosAlternatives_8_1_0");
					put(grammarAccess.getTermTypeAccess().getTypeAlternatives_0(), "rule__TermType__TypeAlternatives_0");
					put(grammarAccess.getTermRelationAccess().getTypeAlternatives_0_0(), "rule__TermRelation__TypeAlternatives_0_0");
					put(grammarAccess.getStakeholderAccess().getTypeAlternatives_6_0(), "rule__Stakeholder__TypeAlternatives_6_0");
					put(grammarAccess.getStakeholderAccess().getCategoryAlternatives_8_0(), "rule__Stakeholder__CategoryAlternatives_8_0");
					put(grammarAccess.getPriorityAccess().getValueAlternatives_0(), "rule__Priority__ValueAlternatives_0");
					put(grammarAccess.getDependsOnGoalAccess().getTypeAlternatives_0_0(), "rule__DependsOnGoal__TypeAlternatives_0_0");
					put(grammarAccess.getComposedByAccess().getTypeAlternatives_1_0(), "rule__ComposedBy__TypeAlternatives_1_0");
					put(grammarAccess.getEntityAccess().getTypeAlternatives_5_1_0(), "rule__Entity__TypeAlternatives_5_1_0");
					put(grammarAccess.getAttributeAccess().getTypeAlternatives_6_0(), "rule__Attribute__TypeAlternatives_6_0");
					put(grammarAccess.getMultiplicityAccess().getValueAlternatives_0(), "rule__Multiplicity__ValueAlternatives_0");
					put(grammarAccess.getActorAccess().getTypeAlternatives_6_0(), "rule__Actor__TypeAlternatives_6_0");
					put(grammarAccess.getUseCaseAccess().getTypeAlternatives_6_0(), "rule__UseCase__TypeAlternatives_6_0");
					put(grammarAccess.getEntityTypeAccess().getTypeAlternatives_0(), "rule__EntityType__TypeAlternatives_0");
					put(grammarAccess.getScenarioAccess().getTypeAlternatives_6_0(), "rule__Scenario__TypeAlternatives_6_0");
					put(grammarAccess.getScenarioAccess().getModeAlternatives_8_0(), "rule__Scenario__ModeAlternatives_8_0");
					put(grammarAccess.getStepAccess().getTypeAlternatives_6_0(), "rule__Step__TypeAlternatives_6_0");
					put(grammarAccess.getFRAccess().getTypeAlternatives_7_0(), "rule__FR__TypeAlternatives_7_0");
					put(grammarAccess.getDependsOnFRAccess().getTypeAlternatives_0_0(), "rule__DependsOnFR__TypeAlternatives_0_0");
					put(grammarAccess.getQRAccess().getTypeAlternatives_7_0(), "rule__QR__TypeAlternatives_7_0");
					put(grammarAccess.getQRAccess().getSubTypeAlternatives_8_1_0(), "rule__QR__SubTypeAlternatives_8_1_0");
					put(grammarAccess.getQRAccess().getMetricAlternatives_10_0(), "rule__QR__MetricAlternatives_10_0");
					put(grammarAccess.getDependsOnQRAccess().getTypeAlternatives_0_0(), "rule__DependsOnQR__TypeAlternatives_0_0");
					put(grammarAccess.getConstraintAccess().getTypeAlternatives_6_0(), "rule__Constraint__TypeAlternatives_6_0");
					put(grammarAccess.getDependsOnConstraintAccess().getTypeAlternatives_0_0(), "rule__DependsOnConstraint__TypeAlternatives_0_0");
					put(grammarAccess.getPackageProjectAccess().getGroup(), "rule__PackageProject__Group__0");
					put(grammarAccess.getPackageSystemAccess().getGroup(), "rule__PackageSystem__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getProjectAccess().getGroup_3(), "rule__Project__Group_3__0");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getSystemAccess().getGroup_3(), "rule__System__Group_3__0");
					put(grammarAccess.getSystemAccess().getGroup_4(), "rule__System__Group_4__0");
					put(grammarAccess.getSystemAccess().getGroup_7(), "rule__System__Group_7__0");
					put(grammarAccess.getRefSystemAccess().getGroup(), "rule__RefSystem__Group__0");
					put(grammarAccess.getRefSystemAccess().getGroup_1(), "rule__RefSystem__Group_1__0");
					put(grammarAccess.getGlossaryTermAccess().getGroup(), "rule__GlossaryTerm__Group__0");
					put(grammarAccess.getGlossaryTermAccess().getGroup_3(), "rule__GlossaryTerm__Group_3__0");
					put(grammarAccess.getGlossaryTermAccess().getGroup_4(), "rule__GlossaryTerm__Group_4__0");
					put(grammarAccess.getGlossaryTermAccess().getGroup_7(), "rule__GlossaryTerm__Group_7__0");
					put(grammarAccess.getGlossaryTermAccess().getGroup_8(), "rule__GlossaryTerm__Group_8__0");
					put(grammarAccess.getGlossaryTermAccess().getGroup_9(), "rule__GlossaryTerm__Group_9__0");
					put(grammarAccess.getRefTermTypeAccess().getGroup(), "rule__RefTermType__Group__0");
					put(grammarAccess.getRefTermTypeAccess().getGroup_1(), "rule__RefTermType__Group_1__0");
					put(grammarAccess.getTermRelationAccess().getGroup(), "rule__TermRelation__Group__0");
					put(grammarAccess.getRefTermAccess().getGroup(), "rule__RefTerm__Group__0");
					put(grammarAccess.getRefTermAccess().getGroup_1(), "rule__RefTerm__Group_1__0");
					put(grammarAccess.getStakeholderAccess().getGroup(), "rule__Stakeholder__Group__0");
					put(grammarAccess.getStakeholderAccess().getGroup_3(), "rule__Stakeholder__Group_3__0");
					put(grammarAccess.getStakeholderAccess().getGroup_4(), "rule__Stakeholder__Group_4__0");
					put(grammarAccess.getStakeholderAccess().getGroup_9(), "rule__Stakeholder__Group_9__0");
					put(grammarAccess.getGoalAccess().getGroup(), "rule__Goal__Group__0");
					put(grammarAccess.getGoalAccess().getGroup_3(), "rule__Goal__Group_3__0");
					put(grammarAccess.getGoalAccess().getGroup_4(), "rule__Goal__Group_4__0");
					put(grammarAccess.getGoalAccess().getGroup_5(), "rule__Goal__Group_5__0");
					put(grammarAccess.getDependsOnGoalAccess().getGroup(), "rule__DependsOnGoal__Group__0");
					put(grammarAccess.getComposedByAccess().getGroup(), "rule__ComposedBy__Group__0");
					put(grammarAccess.getRefGoalAccess().getGroup(), "rule__RefGoal__Group__0");
					put(grammarAccess.getRefGoalAccess().getGroup_1(), "rule__RefGoal__Group_1__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
					put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
					put(grammarAccess.getEntityAccess().getGroup_5(), "rule__Entity__Group_5__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_3(), "rule__Attribute__Group_3__0");
					put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
					put(grammarAccess.getAttributeAccess().getGroup_7(), "rule__Attribute__Group_7__0");
					put(grammarAccess.getAttributeAccess().getGroup_8(), "rule__Attribute__Group_8__0");
					put(grammarAccess.getAttributeAccess().getGroup_9(), "rule__Attribute__Group_9__0");
					put(grammarAccess.getPrimaryKeyAccess().getGroup(), "rule__PrimaryKey__Group__0");
					put(grammarAccess.getForeignKeyAccess().getGroup(), "rule__ForeignKey__Group__0");
					put(grammarAccess.getRefAttributeAccess().getGroup(), "rule__RefAttribute__Group__0");
					put(grammarAccess.getRefAttributeAccess().getGroup_1(), "rule__RefAttribute__Group_1__0");
					put(grammarAccess.getCheckAccess().getGroup(), "rule__Check__Group__0");
					put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
					put(grammarAccess.getActorAccess().getGroup_3(), "rule__Actor__Group_3__0");
					put(grammarAccess.getActorAccess().getGroup_4(), "rule__Actor__Group_4__0");
					put(grammarAccess.getActorAccess().getGroup_7(), "rule__Actor__Group_7__0");
					put(grammarAccess.getActorAccess().getGroup_8(), "rule__Actor__Group_8__0");
					put(grammarAccess.getUseCaseAccess().getGroup(), "rule__UseCase__Group__0");
					put(grammarAccess.getUseCaseAccess().getGroup_3(), "rule__UseCase__Group_3__0");
					put(grammarAccess.getUseCaseAccess().getGroup_4(), "rule__UseCase__Group_4__0");
					put(grammarAccess.getUseCaseAccess().getGroup_7(), "rule__UseCase__Group_7__0");
					put(grammarAccess.getUseCaseAccess().getGroup_11(), "rule__UseCase__Group_11__0");
					put(grammarAccess.getUseCaseAccess().getGroup_12(), "rule__UseCase__Group_12__0");
					put(grammarAccess.getUseCaseAccess().getGroup_15(), "rule__UseCase__Group_15__0");
					put(grammarAccess.getUseCaseAccess().getGroup_16(), "rule__UseCase__Group_16__0");
					put(grammarAccess.getUseCaseAccess().getGroup_17(), "rule__UseCase__Group_17__0");
					put(grammarAccess.getUseCaseAccess().getGroup_18(), "rule__UseCase__Group_18__0");
					put(grammarAccess.getUseCaseAccess().getGroup_19(), "rule__UseCase__Group_19__0");
					put(grammarAccess.getRefEntityAccess().getGroup(), "rule__RefEntity__Group__0");
					put(grammarAccess.getRefEntityAccess().getGroup_3(), "rule__RefEntity__Group_3__0");
					put(grammarAccess.getRefFRAccess().getGroup(), "rule__RefFR__Group__0");
					put(grammarAccess.getRefFRAccess().getGroup_1(), "rule__RefFR__Group_1__0");
					put(grammarAccess.getRefActorAccess().getGroup(), "rule__RefActor__Group__0");
					put(grammarAccess.getRefActorAccess().getGroup_1(), "rule__RefActor__Group_1__0");
					put(grammarAccess.getRefUCAccess().getGroup(), "rule__RefUC__Group__0");
					put(grammarAccess.getRefUCAccess().getGroup_1(), "rule__RefUC__Group_1__0");
					put(grammarAccess.getExtensionPointAccess().getGroup(), "rule__ExtensionPoint__Group__0");
					put(grammarAccess.getExtensionPointAccess().getGroup_2(), "rule__ExtensionPoint__Group_2__0");
					put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
					put(grammarAccess.getScenarioAccess().getGroup_3(), "rule__Scenario__Group_3__0");
					put(grammarAccess.getScenarioAccess().getGroup_4(), "rule__Scenario__Group_4__0");
					put(grammarAccess.getStepAccess().getGroup(), "rule__Step__Group__0");
					put(grammarAccess.getStepAccess().getGroup_3(), "rule__Step__Group_3__0");
					put(grammarAccess.getStepAccess().getGroup_4(), "rule__Step__Group_4__0");
					put(grammarAccess.getStepAccess().getGroup_7(), "rule__Step__Group_7__0");
					put(grammarAccess.getStepAccess().getGroup_8(), "rule__Step__Group_8__0");
					put(grammarAccess.getStepAccess().getGroup_9(), "rule__Step__Group_9__0");
					put(grammarAccess.getStepAccess().getGroup_10(), "rule__Step__Group_10__0");
					put(grammarAccess.getFRAccess().getGroup(), "rule__FR__Group__0");
					put(grammarAccess.getFRAccess().getGroup_3(), "rule__FR__Group_3__0");
					put(grammarAccess.getFRAccess().getGroup_8(), "rule__FR__Group_8__0");
					put(grammarAccess.getFRAccess().getGroup_12(), "rule__FR__Group_12__0");
					put(grammarAccess.getDependsOnFRAccess().getGroup(), "rule__DependsOnFR__Group__0");
					put(grammarAccess.getQRAccess().getGroup(), "rule__QR__Group__0");
					put(grammarAccess.getQRAccess().getGroup_3(), "rule__QR__Group_3__0");
					put(grammarAccess.getQRAccess().getGroup_8(), "rule__QR__Group_8__0");
					put(grammarAccess.getQRAccess().getGroup_13(), "rule__QR__Group_13__0");
					put(grammarAccess.getQRAccess().getGroup_17(), "rule__QR__Group_17__0");
					put(grammarAccess.getDependsOnQRAccess().getGroup(), "rule__DependsOnQR__Group__0");
					put(grammarAccess.getRefQRAccess().getGroup(), "rule__RefQR__Group__0");
					put(grammarAccess.getRefQRAccess().getGroup_1(), "rule__RefQR__Group_1__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup_3(), "rule__Constraint__Group_3__0");
					put(grammarAccess.getConstraintAccess().getGroup_4(), "rule__Constraint__Group_4__0");
					put(grammarAccess.getConstraintAccess().getGroup_7(), "rule__Constraint__Group_7__0");
					put(grammarAccess.getConstraintAccess().getGroup_11(), "rule__Constraint__Group_11__0");
					put(grammarAccess.getDependsOnConstraintAccess().getGroup(), "rule__DependsOnConstraint__Group__0");
					put(grammarAccess.getRefConstraintAccess().getGroup(), "rule__RefConstraint__Group__0");
					put(grammarAccess.getRefConstraintAccess().getGroup_1(), "rule__RefConstraint__Group_1__0");
					put(grammarAccess.getPackageProjectAccess().getNameAssignment_1(), "rule__PackageProject__NameAssignment_1");
					put(grammarAccess.getPackageProjectAccess().getImportsAssignment_3(), "rule__PackageProject__ImportsAssignment_3");
					put(grammarAccess.getPackageProjectAccess().getProjectAssignment_4(), "rule__PackageProject__ProjectAssignment_4");
					put(grammarAccess.getPackageProjectAccess().getGlossaryTermsAssignment_5(), "rule__PackageProject__GlossaryTermsAssignment_5");
					put(grammarAccess.getPackageProjectAccess().getStakeholdersAssignment_6(), "rule__PackageProject__StakeholdersAssignment_6");
					put(grammarAccess.getPackageProjectAccess().getGoalsAssignment_7(), "rule__PackageProject__GoalsAssignment_7");
					put(grammarAccess.getPackageProjectAccess().getPackageSystemsAssignment_8(), "rule__PackageProject__PackageSystemsAssignment_8");
					put(grammarAccess.getPackageSystemAccess().getNameAssignment_1(), "rule__PackageSystem__NameAssignment_1");
					put(grammarAccess.getPackageSystemAccess().getImportsAssignment_3(), "rule__PackageSystem__ImportsAssignment_3");
					put(grammarAccess.getPackageSystemAccess().getSystemsAssignment_4(), "rule__PackageSystem__SystemsAssignment_4");
					put(grammarAccess.getPackageSystemAccess().getEntitiesAssignment_5(), "rule__PackageSystem__EntitiesAssignment_5");
					put(grammarAccess.getPackageSystemAccess().getActorsAssignment_6(), "rule__PackageSystem__ActorsAssignment_6");
					put(grammarAccess.getPackageSystemAccess().getUseCasesAssignment_7(), "rule__PackageSystem__UseCasesAssignment_7");
					put(grammarAccess.getPackageSystemAccess().getFrsAssignment_8(), "rule__PackageSystem__FrsAssignment_8");
					put(grammarAccess.getPackageSystemAccess().getQrsAssignment_9(), "rule__PackageSystem__QrsAssignment_9");
					put(grammarAccess.getPackageSystemAccess().getConstraintsAssignment_10(), "rule__PackageSystem__ConstraintsAssignment_10");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getProjectAccess().getNameAssignment_1(), "rule__Project__NameAssignment_1");
					put(grammarAccess.getProjectAccess().getNameAliasAssignment_3_1(), "rule__Project__NameAliasAssignment_3_1");
					put(grammarAccess.getProjectAccess().getDescriptionAssignment_5(), "rule__Project__DescriptionAssignment_5");
					put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
					put(grammarAccess.getSystemAccess().getNameAliasAssignment_3_1(), "rule__System__NameAliasAssignment_3_1");
					put(grammarAccess.getSystemAccess().getDescriptionAssignment_4_1(), "rule__System__DescriptionAssignment_4_1");
					put(grammarAccess.getSystemAccess().getProjectAssignment_6(), "rule__System__ProjectAssignment_6");
					put(grammarAccess.getSystemAccess().getPartOfAssignment_7_1(), "rule__System__PartOfAssignment_7_1");
					put(grammarAccess.getRefSystemAccess().getRefSystemAssignment_0(), "rule__RefSystem__RefSystemAssignment_0");
					put(grammarAccess.getRefSystemAccess().getRefsAssignment_1_1(), "rule__RefSystem__RefsAssignment_1_1");
					put(grammarAccess.getGlossaryTermAccess().getNameAssignment_1(), "rule__GlossaryTerm__NameAssignment_1");
					put(grammarAccess.getGlossaryTermAccess().getNameAliasAssignment_3_1(), "rule__GlossaryTerm__NameAliasAssignment_3_1");
					put(grammarAccess.getGlossaryTermAccess().getDescriptionAssignment_4_1(), "rule__GlossaryTerm__DescriptionAssignment_4_1");
					put(grammarAccess.getGlossaryTermAccess().getTypeAssignment_6(), "rule__GlossaryTerm__TypeAssignment_6");
					put(grammarAccess.getGlossaryTermAccess().getAcronymAssignment_7_1(), "rule__GlossaryTerm__AcronymAssignment_7_1");
					put(grammarAccess.getGlossaryTermAccess().getPosAssignment_8_1(), "rule__GlossaryTerm__PosAssignment_8_1");
					put(grammarAccess.getGlossaryTermAccess().getSynsetAssignment_9_1(), "rule__GlossaryTerm__SynsetAssignment_9_1");
					put(grammarAccess.getGlossaryTermAccess().getTermRelationAssignment_10(), "rule__GlossaryTerm__TermRelationAssignment_10");
					put(grammarAccess.getRefTermTypeAccess().getRefTypeAssignment_0(), "rule__RefTermType__RefTypeAssignment_0");
					put(grammarAccess.getRefTermTypeAccess().getRefsAssignment_1_1(), "rule__RefTermType__RefsAssignment_1_1");
					put(grammarAccess.getTermTypeAccess().getTypeAssignment(), "rule__TermType__TypeAssignment");
					put(grammarAccess.getTermRelationAccess().getTypeAssignment_0(), "rule__TermRelation__TypeAssignment_0");
					put(grammarAccess.getTermRelationAccess().getRefTermAssignment_1(), "rule__TermRelation__RefTermAssignment_1");
					put(grammarAccess.getRefTermAccess().getRefTermAssignment_0(), "rule__RefTerm__RefTermAssignment_0");
					put(grammarAccess.getRefTermAccess().getRefsAssignment_1_1(), "rule__RefTerm__RefsAssignment_1_1");
					put(grammarAccess.getStakeholderAccess().getNameAssignment_1(), "rule__Stakeholder__NameAssignment_1");
					put(grammarAccess.getStakeholderAccess().getNameAliasAssignment_3_1(), "rule__Stakeholder__NameAliasAssignment_3_1");
					put(grammarAccess.getStakeholderAccess().getDescriptionAssignment_4_1(), "rule__Stakeholder__DescriptionAssignment_4_1");
					put(grammarAccess.getStakeholderAccess().getTypeAssignment_6(), "rule__Stakeholder__TypeAssignment_6");
					put(grammarAccess.getStakeholderAccess().getCategoryAssignment_8(), "rule__Stakeholder__CategoryAssignment_8");
					put(grammarAccess.getStakeholderAccess().getPartOfAssignment_9_1(), "rule__Stakeholder__PartOfAssignment_9_1");
					put(grammarAccess.getGoalAccess().getNameAssignment_1(), "rule__Goal__NameAssignment_1");
					put(grammarAccess.getGoalAccess().getNameAliasAssignment_3_1(), "rule__Goal__NameAliasAssignment_3_1");
					put(grammarAccess.getGoalAccess().getDescriptionAssignment_4_1(), "rule__Goal__DescriptionAssignment_4_1");
					put(grammarAccess.getGoalAccess().getStakeholderAssignment_5_1(), "rule__Goal__StakeholderAssignment_5_1");
					put(grammarAccess.getGoalAccess().getPriorityAssignment_7(), "rule__Goal__PriorityAssignment_7");
					put(grammarAccess.getGoalAccess().getDependsOnAssignment_8(), "rule__Goal__DependsOnAssignment_8");
					put(grammarAccess.getGoalAccess().getComposedByAssignment_9(), "rule__Goal__ComposedByAssignment_9");
					put(grammarAccess.getPriorityAccess().getValueAssignment(), "rule__Priority__ValueAssignment");
					put(grammarAccess.getDependsOnGoalAccess().getTypeAssignment_0(), "rule__DependsOnGoal__TypeAssignment_0");
					put(grammarAccess.getDependsOnGoalAccess().getRefGoalAssignment_1(), "rule__DependsOnGoal__RefGoalAssignment_1");
					put(grammarAccess.getComposedByAccess().getTypeAssignment_1(), "rule__ComposedBy__TypeAssignment_1");
					put(grammarAccess.getComposedByAccess().getRefGoalAssignment_2(), "rule__ComposedBy__RefGoalAssignment_2");
					put(grammarAccess.getRefGoalAccess().getRefGoalAssignment_0(), "rule__RefGoal__RefGoalAssignment_0");
					put(grammarAccess.getRefGoalAccess().getRefsAssignment_1_1(), "rule__RefGoal__RefsAssignment_1_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getNameAliasAssignment_3_1(), "rule__Entity__NameAliasAssignment_3_1");
					put(grammarAccess.getEntityAccess().getDescriptionAssignment_4_1(), "rule__Entity__DescriptionAssignment_4_1");
					put(grammarAccess.getEntityAccess().getTypeAssignment_5_1(), "rule__Entity__TypeAssignment_5_1");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_6(), "rule__Entity__AttributesAssignment_6");
					put(grammarAccess.getEntityAccess().getPrimaryKeyAssignment_7(), "rule__Entity__PrimaryKeyAssignment_7");
					put(grammarAccess.getEntityAccess().getForeignKeysAssignment_8(), "rule__Entity__ForeignKeysAssignment_8");
					put(grammarAccess.getEntityAccess().getChecksAssignment_9(), "rule__Entity__ChecksAssignment_9");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getNameAliasAssignment_3_1(), "rule__Attribute__NameAliasAssignment_3_1");
					put(grammarAccess.getAttributeAccess().getDescriptionAssignment_4_1(), "rule__Attribute__DescriptionAssignment_4_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_6(), "rule__Attribute__TypeAssignment_6");
					put(grammarAccess.getAttributeAccess().getSizeAssignment_7_1(), "rule__Attribute__SizeAssignment_7_1");
					put(grammarAccess.getAttributeAccess().getMultiplicityAssignment_8_1(), "rule__Attribute__MultiplicityAssignment_8_1");
					put(grammarAccess.getAttributeAccess().getDefaultValueAssignment_9_1(), "rule__Attribute__DefaultValueAssignment_9_1");
					put(grammarAccess.getAttributeAccess().getNotNullAssignment_10(), "rule__Attribute__NotNullAssignment_10");
					put(grammarAccess.getAttributeAccess().getUniqueAssignment_11(), "rule__Attribute__UniqueAssignment_11");
					put(grammarAccess.getMultiplicityAccess().getValueAssignment(), "rule__Multiplicity__ValueAssignment");
					put(grammarAccess.getPrimaryKeyAccess().getRefToAssignment_2(), "rule__PrimaryKey__RefToAssignment_2");
					put(grammarAccess.getForeignKeyAccess().getEntityAssignment_1(), "rule__ForeignKey__EntityAssignment_1");
					put(grammarAccess.getForeignKeyAccess().getRefToAssignment_3(), "rule__ForeignKey__RefToAssignment_3");
					put(grammarAccess.getForeignKeyAccess().getMultiplicityAssignment_6(), "rule__ForeignKey__MultiplicityAssignment_6");
					put(grammarAccess.getRefAttributeAccess().getRefAttrAssignment_0(), "rule__RefAttribute__RefAttrAssignment_0");
					put(grammarAccess.getRefAttributeAccess().getRefsAssignment_1_1(), "rule__RefAttribute__RefsAssignment_1_1");
					put(grammarAccess.getCheckAccess().getNameAssignment_1(), "rule__Check__NameAssignment_1");
					put(grammarAccess.getCheckAccess().getCheckExpressionAssignment_2(), "rule__Check__CheckExpressionAssignment_2");
					put(grammarAccess.getActorAccess().getNameAssignment_1(), "rule__Actor__NameAssignment_1");
					put(grammarAccess.getActorAccess().getNameAliasAssignment_3_1(), "rule__Actor__NameAliasAssignment_3_1");
					put(grammarAccess.getActorAccess().getDescriptionAssignment_4_1(), "rule__Actor__DescriptionAssignment_4_1");
					put(grammarAccess.getActorAccess().getTypeAssignment_6(), "rule__Actor__TypeAssignment_6");
					put(grammarAccess.getActorAccess().getStakeholderAssignment_7_1(), "rule__Actor__StakeholderAssignment_7_1");
					put(grammarAccess.getActorAccess().getActorAssignment_8_1(), "rule__Actor__ActorAssignment_8_1");
					put(grammarAccess.getUseCaseAccess().getNameAssignment_1(), "rule__UseCase__NameAssignment_1");
					put(grammarAccess.getUseCaseAccess().getNameAliasAssignment_3_1(), "rule__UseCase__NameAliasAssignment_3_1");
					put(grammarAccess.getUseCaseAccess().getDescriptionAssignment_4_1(), "rule__UseCase__DescriptionAssignment_4_1");
					put(grammarAccess.getUseCaseAccess().getTypeAssignment_6(), "rule__UseCase__TypeAssignment_6");
					put(grammarAccess.getUseCaseAccess().getEntitiesAssignment_7_1(), "rule__UseCase__EntitiesAssignment_7_1");
					put(grammarAccess.getUseCaseAccess().getPriorityAssignment_9(), "rule__UseCase__PriorityAssignment_9");
					put(grammarAccess.getUseCaseAccess().getExtensionPointsAssignment_10(), "rule__UseCase__ExtensionPointsAssignment_10");
					put(grammarAccess.getUseCaseAccess().getGoalsAssignment_11_1(), "rule__UseCase__GoalsAssignment_11_1");
					put(grammarAccess.getUseCaseAccess().getFrsAssignment_12_1(), "rule__UseCase__FrsAssignment_12_1");
					put(grammarAccess.getUseCaseAccess().getActorInitiatesAssignment_14(), "rule__UseCase__ActorInitiatesAssignment_14");
					put(grammarAccess.getUseCaseAccess().getActorsAssignment_15_1(), "rule__UseCase__ActorsAssignment_15_1");
					put(grammarAccess.getUseCaseAccess().getPreConditionsAssignment_16_1(), "rule__UseCase__PreConditionsAssignment_16_1");
					put(grammarAccess.getUseCaseAccess().getPostConditionsAssignment_17_1(), "rule__UseCase__PostConditionsAssignment_17_1");
					put(grammarAccess.getUseCaseAccess().getIncludesAssignment_18_1(), "rule__UseCase__IncludesAssignment_18_1");
					put(grammarAccess.getUseCaseAccess().getExtendsAssignment_19_1(), "rule__UseCase__ExtendsAssignment_19_1");
					put(grammarAccess.getUseCaseAccess().getExtPointAssignment_19_3(), "rule__UseCase__ExtPointAssignment_19_3");
					put(grammarAccess.getUseCaseAccess().getScenariosAssignment_20(), "rule__UseCase__ScenariosAssignment_20");
					put(grammarAccess.getRefEntityAccess().getRefEntityAssignment_0(), "rule__RefEntity__RefEntityAssignment_0");
					put(grammarAccess.getRefEntityAccess().getTypeAssignment_2(), "rule__RefEntity__TypeAssignment_2");
					put(grammarAccess.getRefEntityAccess().getRefsAssignment_3_1(), "rule__RefEntity__RefsAssignment_3_1");
					put(grammarAccess.getRefEntityAccess().getRefTypeAssignment_3_3(), "rule__RefEntity__RefTypeAssignment_3_3");
					put(grammarAccess.getEntityTypeAccess().getTypeAssignment(), "rule__EntityType__TypeAssignment");
					put(grammarAccess.getRefFRAccess().getRefFRAssignment_0(), "rule__RefFR__RefFRAssignment_0");
					put(grammarAccess.getRefFRAccess().getRefsAssignment_1_1(), "rule__RefFR__RefsAssignment_1_1");
					put(grammarAccess.getRefActorAccess().getRefActorAssignment_0(), "rule__RefActor__RefActorAssignment_0");
					put(grammarAccess.getRefActorAccess().getRefsAssignment_1_1(), "rule__RefActor__RefsAssignment_1_1");
					put(grammarAccess.getRefUCAccess().getRefUCAssignment_0(), "rule__RefUC__RefUCAssignment_0");
					put(grammarAccess.getRefUCAccess().getRefsAssignment_1_1(), "rule__RefUC__RefsAssignment_1_1");
					put(grammarAccess.getExtensionPointAccess().getNameAssignment_1(), "rule__ExtensionPoint__NameAssignment_1");
					put(grammarAccess.getExtensionPointAccess().getDescriptionAssignment_2_1(), "rule__ExtensionPoint__DescriptionAssignment_2_1");
					put(grammarAccess.getScenarioAccess().getNameAssignment_1(), "rule__Scenario__NameAssignment_1");
					put(grammarAccess.getScenarioAccess().getNameAliasAssignment_3_1(), "rule__Scenario__NameAliasAssignment_3_1");
					put(grammarAccess.getScenarioAccess().getDescriptionAssignment_4_1(), "rule__Scenario__DescriptionAssignment_4_1");
					put(grammarAccess.getScenarioAccess().getTypeAssignment_6(), "rule__Scenario__TypeAssignment_6");
					put(grammarAccess.getScenarioAccess().getModeAssignment_8(), "rule__Scenario__ModeAssignment_8");
					put(grammarAccess.getScenarioAccess().getStepsAssignment_9(), "rule__Scenario__StepsAssignment_9");
					put(grammarAccess.getStepAccess().getNameAssignment_1(), "rule__Step__NameAssignment_1");
					put(grammarAccess.getStepAccess().getNameAliasAssignment_3_1(), "rule__Step__NameAliasAssignment_3_1");
					put(grammarAccess.getStepAccess().getDescriptionAssignment_4_1(), "rule__Step__DescriptionAssignment_4_1");
					put(grammarAccess.getStepAccess().getTypeAssignment_6(), "rule__Step__TypeAssignment_6");
					put(grammarAccess.getStepAccess().getActorAssignment_7_1(), "rule__Step__ActorAssignment_7_1");
					put(grammarAccess.getStepAccess().getPreConditionsAssignment_8_1(), "rule__Step__PreConditionsAssignment_8_1");
					put(grammarAccess.getStepAccess().getPostConditionsAssignment_9_1(), "rule__Step__PostConditionsAssignment_9_1");
					put(grammarAccess.getStepAccess().getNextAssignment_10_1(), "rule__Step__NextAssignment_10_1");
					put(grammarAccess.getFRAccess().getNameAssignment_1(), "rule__FR__NameAssignment_1");
					put(grammarAccess.getFRAccess().getNameAliasAssignment_3_1(), "rule__FR__NameAliasAssignment_3_1");
					put(grammarAccess.getFRAccess().getDescriptionAssignment_5(), "rule__FR__DescriptionAssignment_5");
					put(grammarAccess.getFRAccess().getTypeAssignment_7(), "rule__FR__TypeAssignment_7");
					put(grammarAccess.getFRAccess().getStakeholderAssignment_8_1(), "rule__FR__StakeholderAssignment_8_1");
					put(grammarAccess.getFRAccess().getPriorityAssignment_10(), "rule__FR__PriorityAssignment_10");
					put(grammarAccess.getFRAccess().getDependsAssignment_11(), "rule__FR__DependsAssignment_11");
					put(grammarAccess.getFRAccess().getPartOfAssignment_12_1(), "rule__FR__PartOfAssignment_12_1");
					put(grammarAccess.getDependsOnFRAccess().getTypeAssignment_0(), "rule__DependsOnFR__TypeAssignment_0");
					put(grammarAccess.getDependsOnFRAccess().getRefFrAssignment_1(), "rule__DependsOnFR__RefFrAssignment_1");
					put(grammarAccess.getQRAccess().getNameAssignment_1(), "rule__QR__NameAssignment_1");
					put(grammarAccess.getQRAccess().getNameAliasAssignment_3_1(), "rule__QR__NameAliasAssignment_3_1");
					put(grammarAccess.getQRAccess().getDescriptionAssignment_5(), "rule__QR__DescriptionAssignment_5");
					put(grammarAccess.getQRAccess().getTypeAssignment_7(), "rule__QR__TypeAssignment_7");
					put(grammarAccess.getQRAccess().getSubTypeAssignment_8_1(), "rule__QR__SubTypeAssignment_8_1");
					put(grammarAccess.getQRAccess().getMetricAssignment_10(), "rule__QR__MetricAssignment_10");
					put(grammarAccess.getQRAccess().getValueAssignment_12(), "rule__QR__ValueAssignment_12");
					put(grammarAccess.getQRAccess().getStakeholderAssignment_13_1(), "rule__QR__StakeholderAssignment_13_1");
					put(grammarAccess.getQRAccess().getPriorityAssignment_15(), "rule__QR__PriorityAssignment_15");
					put(grammarAccess.getQRAccess().getDependsAssignment_16(), "rule__QR__DependsAssignment_16");
					put(grammarAccess.getQRAccess().getPartOfAssignment_17_1(), "rule__QR__PartOfAssignment_17_1");
					put(grammarAccess.getDependsOnQRAccess().getTypeAssignment_0(), "rule__DependsOnQR__TypeAssignment_0");
					put(grammarAccess.getDependsOnQRAccess().getRefQrAssignment_1(), "rule__DependsOnQR__RefQrAssignment_1");
					put(grammarAccess.getRefQRAccess().getRefQRAssignment_0(), "rule__RefQR__RefQRAssignment_0");
					put(grammarAccess.getRefQRAccess().getRefsAssignment_1_1(), "rule__RefQR__RefsAssignment_1_1");
					put(grammarAccess.getConstraintAccess().getNameAssignment_1(), "rule__Constraint__NameAssignment_1");
					put(grammarAccess.getConstraintAccess().getNameAliasAssignment_3_1(), "rule__Constraint__NameAliasAssignment_3_1");
					put(grammarAccess.getConstraintAccess().getDescriptionAssignment_4_1(), "rule__Constraint__DescriptionAssignment_4_1");
					put(grammarAccess.getConstraintAccess().getTypeAssignment_6(), "rule__Constraint__TypeAssignment_6");
					put(grammarAccess.getConstraintAccess().getStakeholderAssignment_7_1(), "rule__Constraint__StakeholderAssignment_7_1");
					put(grammarAccess.getConstraintAccess().getPriorityAssignment_9(), "rule__Constraint__PriorityAssignment_9");
					put(grammarAccess.getConstraintAccess().getDependsAssignment_10(), "rule__Constraint__DependsAssignment_10");
					put(grammarAccess.getConstraintAccess().getPartOfAssignment_11_1(), "rule__Constraint__PartOfAssignment_11_1");
					put(grammarAccess.getDependsOnConstraintAccess().getTypeAssignment_0(), "rule__DependsOnConstraint__TypeAssignment_0");
					put(grammarAccess.getDependsOnConstraintAccess().getRefConstAssignment_1(), "rule__DependsOnConstraint__RefConstAssignment_1");
					put(grammarAccess.getRefConstraintAccess().getRefConstAssignment_0(), "rule__RefConstraint__RefConstAssignment_0");
					put(grammarAccess.getRefConstraintAccess().getRefsAssignment_1_1(), "rule__RefConstraint__RefsAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			rslingo.rslil.ui.contentassist.antlr.internal.InternalRSLILParser typedParser = (rslingo.rslil.ui.contentassist.antlr.internal.InternalRSLILParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RSLILGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RSLILGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
