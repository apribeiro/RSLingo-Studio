package rslingo.rslil.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import rslingo.rslil.services.RSLILGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRSLILParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package-Project'", "'{'", "'}'", "'Package-System'", "'.'", "'.*'", "'import'", "'Project'", "'Name'", "'Type'", "'SystemDevelopment'", "'SystemDesign'", "'SystemDeployment'", "'SystemMaintenance'", "'Training'", "'Research'", "'Other'", "'ApplicationDomain'", "'PublicSector'", "'Education'", "'Health'", "'Telecoms'", "'Energy&Utilities'", "'Finance&Banks'", "'ProjectProgress'", "'Summary'", "'Description'", "'PlannedSchedule'", "'Start'", "'End'", "'ActualSchedule'", "'-'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'", "'Organizations'", "'Customer'", "'Supplier'", "'Partners'", "'Not-Plan'", "'Plan'", "'On-Design'", "'On-Develop'", "'On-Test'", "'On-Deploy'", "'Concluded'", "'System'", "'Sub-System'", "'Reusable-System'", "'Scope'", "'In'", "'Out'", "'PartOf'", "'SystemRelation'", "'Source'", "'Target'", "'Category'", "'Import'", "'Export'", "'Import-Export'", "'Sync'", "'Interact'", "'In-Out'", "'GlossaryTerm'", "'Acronym'", "'POS'", "'Adjective'", "'Adverb'", "'Noun'", "'Verb'", "'Synonym'", "'Hypernym'", "','", "'Stakeholder'", "'Entity'", "'Architectural'", "'Actor'", "'Group.Organization'", "'Group.BusinessUnit'", "'Group.Team'", "'Individual.Person'", "'Individual.ExternalSystem'", "'Business'", "'Business.Customer'", "'Business.Customer.Sponsor'", "'Business.Customer.Champion'", "'Business.User.Direct'", "'Business.User.Indirect'", "'Business.Advisor.DomainExpert'", "'Business.Advisor.Trainer'", "'Business.Advisor.RegulatorAgent'", "'Business.System'", "'Technical'", "'Technical.BusinessAnalyst'", "'Technical.Requirements.Engineer'", "'Technical.Software.Architect'", "'Technical.Software.Designer'", "'Technical.Software.Tester'", "'IsA'", "'Goal'", "'Priority'", "'PartOf-And'", "'PartOf-Or'", "'GoalRelation'", "'Requires'", "'Supports'", "'Obstructs'", "'Conflicts'", "'Identical'", "'Must'", "'Should'", "'Could'", "'Won\\'t'", "'Principal'", "'Secondary'", "'Attribute'", "'Boolean'", "'Integer'", "'Decimal'", "'Currency'", "'Date'", "'Time'", "'Datetime'", "'Enumeration'", "'Text'", "'Regex'", "'URL'", "'Image'", "'Size'", "'Multiplicity'", "'DefaultValue'", "'NotNull'", "'Unique'", "'\"0\"'", "'\"1\"'", "'\"0..1\"'", "'\"*\"'", "'PrimaryKey'", "'('", "')'", "'ForeignKey'", "'Check'", "'User'", "'ExternalSystem'", "'Timer'", "'UseCase'", "'EntityManage'", "'EntityBrowse'", "'EntitySearch'", "'EntityCreate'", "'EntityDelete'", "'EntitySync'", "'Report'", "'Entities'", "'Goals'", "'FunctionalRequirements'", "'ActorInitiates'", "'ActorParticipates'", "'Pre-Conditions'", "'Post-Conditions'", "'Include'", "'Extend'", "'on'", "'as'", "'Master'", "'Detail'", "'Reference'", "'ExtensionPoint'", "'Scenario'", "'Main'", "'Alternative'", "'Exception'", "'ExecutionMode'", "'Sequential'", "'Parallel'", "'Step'", "'ActorPrepareData'", "'ActorCallSystem'", "'SystemExecutes'", "'SystemReturnResult'", "'NextStep'", "'FunctionalRequirement'", "'Functional'", "'Behavioral'", "'Data'", "'QualityRequirement'", "'Security'", "'Performance'", "'Usability'", "'Appearance'", "'Operational'", "'Maintenance'", "'Cultural'", "'Legal'", "'Sub-Type'", "'Security.Privacy'", "'Security.Integrity'", "'Usability.EaseOfUse'", "'Usability.EaseOfLearn'", "'Usability.Accessibility'", "'Metric'", "'Hours'", "'Mins'", "'Secs'", "'mSecs'", "'Tasks'", "'Value'", "'Constraint'", "'Organizational'", "'Physical'", "'Technological'", "'RequirementRelation'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__100=100;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__102=102;
    public static final int T__223=223;
    public static final int T__101=101;
    public static final int T__222=222;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__218=218;
    public static final int T__12=12;
    public static final int T__217=217;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__219=219;
    public static final int T__214=214;
    public static final int T__213=213;
    public static final int T__216=216;
    public static final int T__215=215;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__207=207;
    public static final int T__23=23;
    public static final int T__206=206;
    public static final int T__24=24;
    public static final int T__209=209;
    public static final int T__25=25;
    public static final int T__208=208;
    public static final int T__203=203;
    public static final int T__202=202;
    public static final int T__20=20;
    public static final int T__205=205;
    public static final int T__21=21;
    public static final int T__204=204;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__117=117;
    public static final int T__116=116;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__231=231;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__230=230;
    public static final int T__108=108;
    public static final int T__229=229;
    public static final int T__107=107;
    public static final int T__228=228;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__225=225;
    public static final int T__103=103;
    public static final int T__224=224;
    public static final int T__106=106;
    public static final int T__227=227;
    public static final int T__105=105;
    public static final int T__226=226;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__201=201;
    public static final int T__200=200;
    public static final int T__91=91;
    public static final int T__188=188;
    public static final int T__92=92;
    public static final int T__187=187;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__189=189;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__90=90;
    public static final int T__185=185;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__199=199;
    public static final int T__81=81;
    public static final int T__198=198;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int RULE_WS=9;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalRSLILParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRSLILParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRSLILParser.tokenNames; }
    public String getGrammarFileName() { return "../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g"; }



     	private RSLILGrammarAccess grammarAccess;
     	
        public InternalRSLILParser(TokenStream input, RSLILGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RSLILGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:76:1: ruleModel returns [EObject current=null] : (this_PackageProject_0= rulePackageProject | this_PackageSystem_1= rulePackageSystem ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_PackageProject_0 = null;

        EObject this_PackageSystem_1 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:79:28: ( (this_PackageProject_0= rulePackageProject | this_PackageSystem_1= rulePackageSystem ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: (this_PackageProject_0= rulePackageProject | this_PackageSystem_1= rulePackageSystem )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: (this_PackageProject_0= rulePackageProject | this_PackageSystem_1= rulePackageSystem )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:81:5: this_PackageProject_0= rulePackageProject
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getPackageProjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackageProject_in_ruleModel132);
                    this_PackageProject_0=rulePackageProject();

                    state._fsp--;

                     
                            current = this_PackageProject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:91:5: this_PackageSystem_1= rulePackageSystem
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getPackageSystemParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePackageSystem_in_ruleModel159);
                    this_PackageSystem_1=rulePackageSystem();

                    state._fsp--;

                     
                            current = this_PackageSystem_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageProject"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:107:1: entryRulePackageProject returns [EObject current=null] : iv_rulePackageProject= rulePackageProject EOF ;
    public final EObject entryRulePackageProject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageProject = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:108:2: (iv_rulePackageProject= rulePackageProject EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:109:2: iv_rulePackageProject= rulePackageProject EOF
            {
             newCompositeNode(grammarAccess.getPackageProjectRule()); 
            pushFollow(FOLLOW_rulePackageProject_in_entryRulePackageProject194);
            iv_rulePackageProject=rulePackageProject();

            state._fsp--;

             current =iv_rulePackageProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageProject204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageProject"


    // $ANTLR start "rulePackageProject"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:116:1: rulePackageProject returns [EObject current=null] : (otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_goalRelations_8_0= ruleGoalRelation ) )* ( (lv_packageSystems_9_0= rulePackageSystem ) )* ( (lv_systemRelations_10_0= ruleSystemRelation ) )* otherlv_11= '}' ) ;
    public final EObject rulePackageProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_project_4_0 = null;

        EObject lv_glossaryTerms_5_0 = null;

        EObject lv_stakeholders_6_0 = null;

        EObject lv_goals_7_0 = null;

        EObject lv_goalRelations_8_0 = null;

        EObject lv_packageSystems_9_0 = null;

        EObject lv_systemRelations_10_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:119:28: ( (otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_goalRelations_8_0= ruleGoalRelation ) )* ( (lv_packageSystems_9_0= rulePackageSystem ) )* ( (lv_systemRelations_10_0= ruleSystemRelation ) )* otherlv_11= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:120:1: (otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_goalRelations_8_0= ruleGoalRelation ) )* ( (lv_packageSystems_9_0= rulePackageSystem ) )* ( (lv_systemRelations_10_0= ruleSystemRelation ) )* otherlv_11= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:120:1: (otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_goalRelations_8_0= ruleGoalRelation ) )* ( (lv_packageSystems_9_0= rulePackageSystem ) )* ( (lv_systemRelations_10_0= ruleSystemRelation ) )* otherlv_11= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:120:3: otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_goalRelations_8_0= ruleGoalRelation ) )* ( (lv_packageSystems_9_0= rulePackageSystem ) )* ( (lv_systemRelations_10_0= ruleSystemRelation ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackageProject241); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageProjectAccess().getPackageProjectKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:124:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:125:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:125:1: (lv_name_1_0= ruleQualifiedName )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:126:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageProjectAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageProject262);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackageProject274); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageProjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:146:1: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:147:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:147:1: (lv_imports_3_0= ruleImport )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:148:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageProjectAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePackageProject295);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:164:3: ( (lv_project_4_0= ruleProject ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:165:1: (lv_project_4_0= ruleProject )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:165:1: (lv_project_4_0= ruleProject )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:166:3: lv_project_4_0= ruleProject
            {
             
            	        newCompositeNode(grammarAccess.getPackageProjectAccess().getProjectProjectParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleProject_in_rulePackageProject317);
            lv_project_4_0=ruleProject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	        }
                   		set(
                   			current, 
                   			"project",
                    		lv_project_4_0, 
                    		"Project");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:182:2: ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==83) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:183:1: (lv_glossaryTerms_5_0= ruleGlossaryTerm )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:183:1: (lv_glossaryTerms_5_0= ruleGlossaryTerm )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:184:3: lv_glossaryTerms_5_0= ruleGlossaryTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageProjectAccess().getGlossaryTermsGlossaryTermParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlossaryTerm_in_rulePackageProject338);
            	    lv_glossaryTerms_5_0=ruleGlossaryTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"glossaryTerms",
            	            		lv_glossaryTerms_5_0, 
            	            		"GlossaryTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:200:3: ( (lv_stakeholders_6_0= ruleStakeholder ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==93) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:201:1: (lv_stakeholders_6_0= ruleStakeholder )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:201:1: (lv_stakeholders_6_0= ruleStakeholder )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:202:3: lv_stakeholders_6_0= ruleStakeholder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageProjectAccess().getStakeholdersStakeholderParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStakeholder_in_rulePackageProject360);
            	    lv_stakeholders_6_0=ruleStakeholder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stakeholders",
            	            		lv_stakeholders_6_0, 
            	            		"Stakeholder");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:218:3: ( (lv_goals_7_0= ruleGoal ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==119) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:219:1: (lv_goals_7_0= ruleGoal )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:219:1: (lv_goals_7_0= ruleGoal )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:220:3: lv_goals_7_0= ruleGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageProjectAccess().getGoalsGoalParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_rulePackageProject382);
            	    lv_goals_7_0=ruleGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goals",
            	            		lv_goals_7_0, 
            	            		"Goal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:236:3: ( (lv_goalRelations_8_0= ruleGoalRelation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==123) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:237:1: (lv_goalRelations_8_0= ruleGoalRelation )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:237:1: (lv_goalRelations_8_0= ruleGoalRelation )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:238:3: lv_goalRelations_8_0= ruleGoalRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageProjectAccess().getGoalRelationsGoalRelationParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoalRelation_in_rulePackageProject404);
            	    lv_goalRelations_8_0=ruleGoalRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goalRelations",
            	            		lv_goalRelations_8_0, 
            	            		"GoalRelation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:254:3: ( (lv_packageSystems_9_0= rulePackageSystem ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:255:1: (lv_packageSystems_9_0= rulePackageSystem )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:255:1: (lv_packageSystems_9_0= rulePackageSystem )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:256:3: lv_packageSystems_9_0= rulePackageSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageProjectAccess().getPackageSystemsPackageSystemParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackageSystem_in_rulePackageProject426);
            	    lv_packageSystems_9_0=rulePackageSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packageSystems",
            	            		lv_packageSystems_9_0, 
            	            		"PackageSystem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:272:3: ( (lv_systemRelations_10_0= ruleSystemRelation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==73) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:273:1: (lv_systemRelations_10_0= ruleSystemRelation )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:273:1: (lv_systemRelations_10_0= ruleSystemRelation )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:274:3: lv_systemRelations_10_0= ruleSystemRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageProjectAccess().getSystemRelationsSystemRelationParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystemRelation_in_rulePackageProject448);
            	    lv_systemRelations_10_0=ruleSystemRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systemRelations",
            	            		lv_systemRelations_10_0, 
            	            		"SystemRelation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_rulePackageProject461); 

                	newLeafNode(otherlv_11, grammarAccess.getPackageProjectAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageProject"


    // $ANTLR start "entryRulePackageSystem"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:302:1: entryRulePackageSystem returns [EObject current=null] : iv_rulePackageSystem= rulePackageSystem EOF ;
    public final EObject entryRulePackageSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:303:2: (iv_rulePackageSystem= rulePackageSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:304:2: iv_rulePackageSystem= rulePackageSystem EOF
            {
             newCompositeNode(grammarAccess.getPackageSystemRule()); 
            pushFollow(FOLLOW_rulePackageSystem_in_entryRulePackageSystem497);
            iv_rulePackageSystem=rulePackageSystem();

            state._fsp--;

             current =iv_rulePackageSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageSystem507); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageSystem"


    // $ANTLR start "rulePackageSystem"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:311:1: rulePackageSystem returns [EObject current=null] : (otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* ( (lv_requirementRelations_11_0= ruleRequirementRelation ) )* otherlv_12= '}' ) ;
    public final EObject rulePackageSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_system_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_actors_6_0 = null;

        EObject lv_useCases_7_0 = null;

        EObject lv_frs_8_0 = null;

        EObject lv_qrs_9_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_requirementRelations_11_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:314:28: ( (otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* ( (lv_requirementRelations_11_0= ruleRequirementRelation ) )* otherlv_12= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:315:1: (otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* ( (lv_requirementRelations_11_0= ruleRequirementRelation ) )* otherlv_12= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:315:1: (otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* ( (lv_requirementRelations_11_0= ruleRequirementRelation ) )* otherlv_12= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:315:3: otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* ( (lv_requirementRelations_11_0= ruleRequirementRelation ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePackageSystem544); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageSystemAccess().getPackageSystemKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:319:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:320:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:320:1: (lv_name_1_0= ruleQualifiedName )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:321:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageSystemAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageSystem565);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackageSystem577); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:341:1: ( (lv_imports_3_0= ruleImport ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:342:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:342:1: (lv_imports_3_0= ruleImport )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:343:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePackageSystem598);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:359:3: ( (lv_system_4_0= ruleSystem ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:360:1: (lv_system_4_0= ruleSystem )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:360:1: (lv_system_4_0= ruleSystem )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:361:3: lv_system_4_0= ruleSystem
            {
             
            	        newCompositeNode(grammarAccess.getPackageSystemAccess().getSystemSystemParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSystem_in_rulePackageSystem620);
            lv_system_4_0=ruleSystem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	        }
                   		set(
                   			current, 
                   			"system",
                    		lv_system_4_0, 
                    		"System");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:377:2: ( (lv_entities_5_0= ruleEntity ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==94) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:378:1: (lv_entities_5_0= ruleEntity )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:378:1: (lv_entities_5_0= ruleEntity )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:379:3: lv_entities_5_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getEntitiesEntityParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_rulePackageSystem641);
            	    lv_entities_5_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_5_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:395:3: ( (lv_actors_6_0= ruleActor ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==96) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:396:1: (lv_actors_6_0= ruleActor )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:396:1: (lv_actors_6_0= ruleActor )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:397:3: lv_actors_6_0= ruleActor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getActorsActorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActor_in_rulePackageSystem663);
            	    lv_actors_6_0=ruleActor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actors",
            	            		lv_actors_6_0, 
            	            		"Actor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:413:3: ( (lv_useCases_7_0= ruleUseCase ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==165) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:414:1: (lv_useCases_7_0= ruleUseCase )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:414:1: (lv_useCases_7_0= ruleUseCase )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:415:3: lv_useCases_7_0= ruleUseCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getUseCasesUseCaseParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUseCase_in_rulePackageSystem685);
            	    lv_useCases_7_0=ruleUseCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"useCases",
            	            		lv_useCases_7_0, 
            	            		"UseCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:431:3: ( (lv_frs_8_0= ruleFR ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==201) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:432:1: (lv_frs_8_0= ruleFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:432:1: (lv_frs_8_0= ruleFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:433:3: lv_frs_8_0= ruleFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getFrsFRParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFR_in_rulePackageSystem707);
            	    lv_frs_8_0=ruleFR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"frs",
            	            		lv_frs_8_0, 
            	            		"FR");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:449:3: ( (lv_qrs_9_0= ruleQR ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==205) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:450:1: (lv_qrs_9_0= ruleQR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:450:1: (lv_qrs_9_0= ruleQR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:451:3: lv_qrs_9_0= ruleQR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getQrsQRParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQR_in_rulePackageSystem729);
            	    lv_qrs_9_0=ruleQR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"qrs",
            	            		lv_qrs_9_0, 
            	            		"QR");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:467:3: ( (lv_constraints_10_0= ruleConstraint ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==227) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:468:1: (lv_constraints_10_0= ruleConstraint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:468:1: (lv_constraints_10_0= ruleConstraint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:469:3: lv_constraints_10_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getConstraintsConstraintParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_rulePackageSystem751);
            	    lv_constraints_10_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_10_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:485:3: ( (lv_requirementRelations_11_0= ruleRequirementRelation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==231) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:486:1: (lv_requirementRelations_11_0= ruleRequirementRelation )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:486:1: (lv_requirementRelations_11_0= ruleRequirementRelation )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:487:3: lv_requirementRelations_11_0= ruleRequirementRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getRequirementRelationsRequirementRelationParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirementRelation_in_rulePackageSystem773);
            	    lv_requirementRelations_11_0=ruleRequirementRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requirementRelations",
            	            		lv_requirementRelations_11_0, 
            	            		"RequirementRelation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_rulePackageSystem786); 

                	newLeafNode(otherlv_12, grammarAccess.getPackageSystemAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageSystem"


    // $ANTLR start "entryRuleQualifiedName"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:515:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:516:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:517:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName823);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName834); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:524:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:527:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:528:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:528:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:528:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName874); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:535:1: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:536:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName893); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName908); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:556:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:557:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:558:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard956);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard967); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:565:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:568:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:569:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:569:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:570:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1014);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:580:1: (kw= '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:581:2: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard1033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:594:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:595:2: (iv_ruleImport= ruleImport EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:596:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1075);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1085); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:603:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:606:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:607:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:607:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:607:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport1122); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:611:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:612:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:612:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:613:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport1143);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleProject"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:637:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:638:2: (iv_ruleProject= ruleProject EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:639:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject1179);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject1189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:646:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'ProjectProgress' ( (lv_progress_13_0= ruleProjectProgress ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_type_6_1=null;
        Token lv_type_6_2=null;
        Token lv_type_6_3=null;
        Token lv_type_6_4=null;
        Token lv_type_6_5=null;
        Token lv_type_6_6=null;
        Token lv_type_6_7=null;
        Token otherlv_7=null;
        Token lv_domain_8_1=null;
        Token lv_domain_8_2=null;
        Token lv_domain_8_3=null;
        Token lv_domain_8_4=null;
        Token lv_domain_8_5=null;
        Token lv_domain_8_6=null;
        Token lv_domain_8_7=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_summary_15_0=null;
        Token otherlv_16=null;
        Token lv_description_17_0=null;
        Token otherlv_18=null;
        EObject lv_planned_9_0 = null;

        EObject lv_actual_10_0 = null;

        EObject lv_organizations_11_0 = null;

        EObject lv_progress_13_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:649:28: ( (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'ProjectProgress' ( (lv_progress_13_0= ruleProjectProgress ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:650:1: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'ProjectProgress' ( (lv_progress_13_0= ruleProjectProgress ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:650:1: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'ProjectProgress' ( (lv_progress_13_0= ruleProjectProgress ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:650:3: otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'ProjectProgress' ( (lv_progress_13_0= ruleProjectProgress ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProject1226); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:654:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:655:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:655:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:656:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject1243); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProject1260); 

                	newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:676:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:676:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleProject1273); 

                        	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:680:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:681:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:681:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:682:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject1290); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getProjectAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleProject1309); 

                	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getTypeKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:702:1: ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:703:1: ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:703:1: ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:704:1: (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:704:1: (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' )
            int alt20=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt20=1;
                }
                break;
            case 22:
                {
                alt20=2;
                }
                break;
            case 23:
                {
                alt20=3;
                }
                break;
            case 24:
                {
                alt20=4;
                }
                break;
            case 25:
                {
                alt20=5;
                }
                break;
            case 26:
                {
                alt20=6;
                }
                break;
            case 27:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:705:3: lv_type_6_1= 'SystemDevelopment'
                    {
                    lv_type_6_1=(Token)match(input,21,FOLLOW_21_in_ruleProject1329); 

                            newLeafNode(lv_type_6_1, grammarAccess.getProjectAccess().getTypeSystemDevelopmentKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:717:8: lv_type_6_2= 'SystemDesign'
                    {
                    lv_type_6_2=(Token)match(input,22,FOLLOW_22_in_ruleProject1358); 

                            newLeafNode(lv_type_6_2, grammarAccess.getProjectAccess().getTypeSystemDesignKeyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:729:8: lv_type_6_3= 'SystemDeployment'
                    {
                    lv_type_6_3=(Token)match(input,23,FOLLOW_23_in_ruleProject1387); 

                            newLeafNode(lv_type_6_3, grammarAccess.getProjectAccess().getTypeSystemDeploymentKeyword_5_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:741:8: lv_type_6_4= 'SystemMaintenance'
                    {
                    lv_type_6_4=(Token)match(input,24,FOLLOW_24_in_ruleProject1416); 

                            newLeafNode(lv_type_6_4, grammarAccess.getProjectAccess().getTypeSystemMaintenanceKeyword_5_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:753:8: lv_type_6_5= 'Training'
                    {
                    lv_type_6_5=(Token)match(input,25,FOLLOW_25_in_ruleProject1445); 

                            newLeafNode(lv_type_6_5, grammarAccess.getProjectAccess().getTypeTrainingKeyword_5_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:765:8: lv_type_6_6= 'Research'
                    {
                    lv_type_6_6=(Token)match(input,26,FOLLOW_26_in_ruleProject1474); 

                            newLeafNode(lv_type_6_6, grammarAccess.getProjectAccess().getTypeResearchKeyword_5_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:777:8: lv_type_6_7= 'Other'
                    {
                    lv_type_6_7=(Token)match(input,27,FOLLOW_27_in_ruleProject1503); 

                            newLeafNode(lv_type_6_7, grammarAccess.getProjectAccess().getTypeOtherKeyword_5_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_7, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleProject1531); 

                	newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getApplicationDomainKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:796:1: ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:797:1: ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:797:1: ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:1: (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:1: (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' )
            int alt21=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            case 32:
                {
                alt21=4;
                }
                break;
            case 33:
                {
                alt21=5;
                }
                break;
            case 34:
                {
                alt21=6;
                }
                break;
            case 27:
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:799:3: lv_domain_8_1= 'PublicSector'
                    {
                    lv_domain_8_1=(Token)match(input,29,FOLLOW_29_in_ruleProject1551); 

                            newLeafNode(lv_domain_8_1, grammarAccess.getProjectAccess().getDomainPublicSectorKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:811:8: lv_domain_8_2= 'Education'
                    {
                    lv_domain_8_2=(Token)match(input,30,FOLLOW_30_in_ruleProject1580); 

                            newLeafNode(lv_domain_8_2, grammarAccess.getProjectAccess().getDomainEducationKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:823:8: lv_domain_8_3= 'Health'
                    {
                    lv_domain_8_3=(Token)match(input,31,FOLLOW_31_in_ruleProject1609); 

                            newLeafNode(lv_domain_8_3, grammarAccess.getProjectAccess().getDomainHealthKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:835:8: lv_domain_8_4= 'Telecoms'
                    {
                    lv_domain_8_4=(Token)match(input,32,FOLLOW_32_in_ruleProject1638); 

                            newLeafNode(lv_domain_8_4, grammarAccess.getProjectAccess().getDomainTelecomsKeyword_7_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:847:8: lv_domain_8_5= 'Energy&Utilities'
                    {
                    lv_domain_8_5=(Token)match(input,33,FOLLOW_33_in_ruleProject1667); 

                            newLeafNode(lv_domain_8_5, grammarAccess.getProjectAccess().getDomainEnergyUtilitiesKeyword_7_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:859:8: lv_domain_8_6= 'Finance&Banks'
                    {
                    lv_domain_8_6=(Token)match(input,34,FOLLOW_34_in_ruleProject1696); 

                            newLeafNode(lv_domain_8_6, grammarAccess.getProjectAccess().getDomainFinanceBanksKeyword_7_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:871:8: lv_domain_8_7= 'Other'
                    {
                    lv_domain_8_7=(Token)match(input,27,FOLLOW_27_in_ruleProject1725); 

                            newLeafNode(lv_domain_8_7, grammarAccess.getProjectAccess().getDomainOtherKeyword_7_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_7, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:886:2: ( (lv_planned_9_0= rulePlannedSchedule ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:887:1: (lv_planned_9_0= rulePlannedSchedule )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:887:1: (lv_planned_9_0= rulePlannedSchedule )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:888:3: lv_planned_9_0= rulePlannedSchedule
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getPlannedPlannedScheduleParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_rulePlannedSchedule_in_ruleProject1762);
                    lv_planned_9_0=rulePlannedSchedule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"planned",
                            		lv_planned_9_0, 
                            		"PlannedSchedule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:904:3: ( (lv_actual_10_0= ruleActualSchedule ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:905:1: (lv_actual_10_0= ruleActualSchedule )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:905:1: (lv_actual_10_0= ruleActualSchedule )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:906:3: lv_actual_10_0= ruleActualSchedule
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getActualActualScheduleParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActualSchedule_in_ruleProject1784);
                    lv_actual_10_0=ruleActualSchedule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"actual",
                            		lv_actual_10_0, 
                            		"ActualSchedule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:922:3: ( (lv_organizations_11_0= ruleOrganizations ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==55) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:923:1: (lv_organizations_11_0= ruleOrganizations )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:923:1: (lv_organizations_11_0= ruleOrganizations )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:924:3: lv_organizations_11_0= ruleOrganizations
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getOrganizationsOrganizationsParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrganizations_in_ruleProject1806);
                    lv_organizations_11_0=ruleOrganizations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"organizations",
                            		lv_organizations_11_0, 
                            		"Organizations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:940:3: (otherlv_12= 'ProjectProgress' ( (lv_progress_13_0= ruleProjectProgress ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:940:5: otherlv_12= 'ProjectProgress' ( (lv_progress_13_0= ruleProjectProgress ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleProject1820); 

                        	newLeafNode(otherlv_12, grammarAccess.getProjectAccess().getProjectProgressKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:944:1: ( (lv_progress_13_0= ruleProjectProgress ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:945:1: (lv_progress_13_0= ruleProjectProgress )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:945:1: (lv_progress_13_0= ruleProjectProgress )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:946:3: lv_progress_13_0= ruleProjectProgress
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getProgressProjectProgressParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectProgress_in_ruleProject1841);
                    lv_progress_13_0=ruleProjectProgress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"progress",
                            		lv_progress_13_0, 
                            		"ProjectProgress");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleProject1855); 

                	newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getSummaryKeyword_12());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:966:1: ( (lv_summary_15_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:967:1: (lv_summary_15_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:967:1: (lv_summary_15_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:968:3: lv_summary_15_0= RULE_STRING
            {
            lv_summary_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject1872); 

            			newLeafNode(lv_summary_15_0, grammarAccess.getProjectAccess().getSummarySTRINGTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"summary",
                    		lv_summary_15_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_16=(Token)match(input,37,FOLLOW_37_in_ruleProject1889); 

                	newLeafNode(otherlv_16, grammarAccess.getProjectAccess().getDescriptionKeyword_14());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:988:1: ( (lv_description_17_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:989:1: (lv_description_17_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:989:1: (lv_description_17_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:990:3: lv_description_17_0= RULE_STRING
            {
            lv_description_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject1906); 

            			newLeafNode(lv_description_17_0, grammarAccess.getProjectAccess().getDescriptionSTRINGTerminalRuleCall_15_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_17_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleProject1923); 

                	newLeafNode(otherlv_18, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_16());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRulePlannedSchedule"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1018:1: entryRulePlannedSchedule returns [EObject current=null] : iv_rulePlannedSchedule= rulePlannedSchedule EOF ;
    public final EObject entryRulePlannedSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlannedSchedule = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1019:2: (iv_rulePlannedSchedule= rulePlannedSchedule EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1020:2: iv_rulePlannedSchedule= rulePlannedSchedule EOF
            {
             newCompositeNode(grammarAccess.getPlannedScheduleRule()); 
            pushFollow(FOLLOW_rulePlannedSchedule_in_entryRulePlannedSchedule1959);
            iv_rulePlannedSchedule=rulePlannedSchedule();

            state._fsp--;

             current =iv_rulePlannedSchedule; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlannedSchedule1969); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlannedSchedule"


    // $ANTLR start "rulePlannedSchedule"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1027:1: rulePlannedSchedule returns [EObject current=null] : (otherlv_0= 'PlannedSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) otherlv_6= '}' ) ;
    public final EObject rulePlannedSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_start_3_0 = null;

        EObject lv_end_5_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1030:28: ( (otherlv_0= 'PlannedSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) otherlv_6= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1031:1: (otherlv_0= 'PlannedSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) otherlv_6= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1031:1: (otherlv_0= 'PlannedSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) otherlv_6= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1031:3: otherlv_0= 'PlannedSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulePlannedSchedule2006); 

                	newLeafNode(otherlv_0, grammarAccess.getPlannedScheduleAccess().getPlannedScheduleKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePlannedSchedule2018); 

                	newLeafNode(otherlv_1, grammarAccess.getPlannedScheduleAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_rulePlannedSchedule2030); 

                	newLeafNode(otherlv_2, grammarAccess.getPlannedScheduleAccess().getStartKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1043:1: ( (lv_start_3_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1044:1: (lv_start_3_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1044:1: (lv_start_3_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1045:3: lv_start_3_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPlannedScheduleAccess().getStartDateParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_rulePlannedSchedule2051);
            lv_start_3_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlannedScheduleRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_3_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_rulePlannedSchedule2063); 

                	newLeafNode(otherlv_4, grammarAccess.getPlannedScheduleAccess().getEndKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1065:1: ( (lv_end_5_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1066:1: (lv_end_5_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1066:1: (lv_end_5_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1067:3: lv_end_5_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPlannedScheduleAccess().getEndDateParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_rulePlannedSchedule2084);
            lv_end_5_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlannedScheduleRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_5_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePlannedSchedule2096); 

                	newLeafNode(otherlv_6, grammarAccess.getPlannedScheduleAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlannedSchedule"


    // $ANTLR start "entryRuleActualSchedule"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1095:1: entryRuleActualSchedule returns [EObject current=null] : iv_ruleActualSchedule= ruleActualSchedule EOF ;
    public final EObject entryRuleActualSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualSchedule = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1096:2: (iv_ruleActualSchedule= ruleActualSchedule EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1097:2: iv_ruleActualSchedule= ruleActualSchedule EOF
            {
             newCompositeNode(grammarAccess.getActualScheduleRule()); 
            pushFollow(FOLLOW_ruleActualSchedule_in_entryRuleActualSchedule2132);
            iv_ruleActualSchedule=ruleActualSchedule();

            state._fsp--;

             current =iv_ruleActualSchedule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualSchedule2142); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActualSchedule"


    // $ANTLR start "ruleActualSchedule"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1104:1: ruleActualSchedule returns [EObject current=null] : (otherlv_0= 'ActualSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) (otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleActualSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_start_3_0 = null;

        EObject lv_end_5_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1107:28: ( (otherlv_0= 'ActualSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) (otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) )? otherlv_6= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1108:1: (otherlv_0= 'ActualSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) (otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) )? otherlv_6= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1108:1: (otherlv_0= 'ActualSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) (otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) )? otherlv_6= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1108:3: otherlv_0= 'ActualSchedule' otherlv_1= '{' otherlv_2= 'Start' ( (lv_start_3_0= ruleDate ) ) (otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleActualSchedule2179); 

                	newLeafNode(otherlv_0, grammarAccess.getActualScheduleAccess().getActualScheduleKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleActualSchedule2191); 

                	newLeafNode(otherlv_1, grammarAccess.getActualScheduleAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleActualSchedule2203); 

                	newLeafNode(otherlv_2, grammarAccess.getActualScheduleAccess().getStartKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1120:1: ( (lv_start_3_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1121:1: (lv_start_3_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1121:1: (lv_start_3_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1122:3: lv_start_3_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getActualScheduleAccess().getStartDateParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_ruleActualSchedule2224);
            lv_start_3_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActualScheduleRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_3_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1138:2: (otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1138:4: otherlv_4= 'End' ( (lv_end_5_0= ruleDate ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleActualSchedule2237); 

                        	newLeafNode(otherlv_4, grammarAccess.getActualScheduleAccess().getEndKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1142:1: ( (lv_end_5_0= ruleDate ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1143:1: (lv_end_5_0= ruleDate )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1143:1: (lv_end_5_0= ruleDate )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1144:3: lv_end_5_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getActualScheduleAccess().getEndDateParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDate_in_ruleActualSchedule2258);
                    lv_end_5_0=ruleDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActualScheduleRule());
                    	        }
                           		set(
                           			current, 
                           			"end",
                            		lv_end_5_0, 
                            		"Date");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleActualSchedule2272); 

                	newLeafNode(otherlv_6, grammarAccess.getActualScheduleAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActualSchedule"


    // $ANTLR start "entryRuleDate"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1172:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1173:2: (iv_ruleDate= ruleDate EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1174:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate2308);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate2318); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1181:1: ruleDate returns [EObject current=null] : ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_day_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        EObject lv_month_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1184:28: ( ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1185:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1185:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1185:2: ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1185:2: ( (lv_day_0_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1186:1: (lv_day_0_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1186:1: (lv_day_0_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1187:3: lv_day_0_0= RULE_INT
            {
            lv_day_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate2360); 

            			newLeafNode(lv_day_0_0, grammarAccess.getDateAccess().getDayINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"day",
                    		lv_day_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleDate2377); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getHyphenMinusKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1207:1: ( (lv_month_2_0= ruleMonth ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1208:1: (lv_month_2_0= ruleMonth )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1208:1: (lv_month_2_0= ruleMonth )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1209:3: lv_month_2_0= ruleMonth
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMonth_in_ruleDate2398);
            lv_month_2_0=ruleMonth();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	        }
                   		set(
                   			current, 
                   			"month",
                    		lv_month_2_0, 
                    		"Month");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleDate2410); 

                	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getHyphenMinusKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1229:1: ( (lv_year_4_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1230:1: (lv_year_4_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1230:1: (lv_year_4_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1231:3: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate2427); 

            			newLeafNode(lv_year_4_0, grammarAccess.getDateAccess().getYearINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"year",
                    		lv_year_4_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleMonth"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1255:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1256:2: (iv_ruleMonth= ruleMonth EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1257:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_ruleMonth_in_entryRuleMonth2468);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonth2478); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonth"


    // $ANTLR start "ruleMonth"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1264:1: ruleMonth returns [EObject current=null] : ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) ;
    public final EObject ruleMonth() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;
        Token lv_name_0_8=null;
        Token lv_name_0_9=null;
        Token lv_name_0_10=null;
        Token lv_name_0_11=null;
        Token lv_name_0_12=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1267:28: ( ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1268:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1268:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1269:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1269:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1270:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1270:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            int alt27=12;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt27=1;
                }
                break;
            case 44:
                {
                alt27=2;
                }
                break;
            case 45:
                {
                alt27=3;
                }
                break;
            case 46:
                {
                alt27=4;
                }
                break;
            case 47:
                {
                alt27=5;
                }
                break;
            case 48:
                {
                alt27=6;
                }
                break;
            case 49:
                {
                alt27=7;
                }
                break;
            case 50:
                {
                alt27=8;
                }
                break;
            case 51:
                {
                alt27=9;
                }
                break;
            case 52:
                {
                alt27=10;
                }
                break;
            case 53:
                {
                alt27=11;
                }
                break;
            case 54:
                {
                alt27=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1271:3: lv_name_0_1= 'Jan'
                    {
                    lv_name_0_1=(Token)match(input,43,FOLLOW_43_in_ruleMonth2522); 

                            newLeafNode(lv_name_0_1, grammarAccess.getMonthAccess().getNameJanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1283:8: lv_name_0_2= 'Feb'
                    {
                    lv_name_0_2=(Token)match(input,44,FOLLOW_44_in_ruleMonth2551); 

                            newLeafNode(lv_name_0_2, grammarAccess.getMonthAccess().getNameFebKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1295:8: lv_name_0_3= 'Mar'
                    {
                    lv_name_0_3=(Token)match(input,45,FOLLOW_45_in_ruleMonth2580); 

                            newLeafNode(lv_name_0_3, grammarAccess.getMonthAccess().getNameMarKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1307:8: lv_name_0_4= 'Apr'
                    {
                    lv_name_0_4=(Token)match(input,46,FOLLOW_46_in_ruleMonth2609); 

                            newLeafNode(lv_name_0_4, grammarAccess.getMonthAccess().getNameAprKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1319:8: lv_name_0_5= 'May'
                    {
                    lv_name_0_5=(Token)match(input,47,FOLLOW_47_in_ruleMonth2638); 

                            newLeafNode(lv_name_0_5, grammarAccess.getMonthAccess().getNameMayKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1331:8: lv_name_0_6= 'Jun'
                    {
                    lv_name_0_6=(Token)match(input,48,FOLLOW_48_in_ruleMonth2667); 

                            newLeafNode(lv_name_0_6, grammarAccess.getMonthAccess().getNameJunKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1343:8: lv_name_0_7= 'Jul'
                    {
                    lv_name_0_7=(Token)match(input,49,FOLLOW_49_in_ruleMonth2696); 

                            newLeafNode(lv_name_0_7, grammarAccess.getMonthAccess().getNameJulKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1355:8: lv_name_0_8= 'Aug'
                    {
                    lv_name_0_8=(Token)match(input,50,FOLLOW_50_in_ruleMonth2725); 

                            newLeafNode(lv_name_0_8, grammarAccess.getMonthAccess().getNameAugKeyword_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1367:8: lv_name_0_9= 'Sep'
                    {
                    lv_name_0_9=(Token)match(input,51,FOLLOW_51_in_ruleMonth2754); 

                            newLeafNode(lv_name_0_9, grammarAccess.getMonthAccess().getNameSepKeyword_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1379:8: lv_name_0_10= 'Oct'
                    {
                    lv_name_0_10=(Token)match(input,52,FOLLOW_52_in_ruleMonth2783); 

                            newLeafNode(lv_name_0_10, grammarAccess.getMonthAccess().getNameOctKeyword_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1391:8: lv_name_0_11= 'Nov'
                    {
                    lv_name_0_11=(Token)match(input,53,FOLLOW_53_in_ruleMonth2812); 

                            newLeafNode(lv_name_0_11, grammarAccess.getMonthAccess().getNameNovKeyword_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1403:8: lv_name_0_12= 'Dec'
                    {
                    lv_name_0_12=(Token)match(input,54,FOLLOW_54_in_ruleMonth2841); 

                            newLeafNode(lv_name_0_12, grammarAccess.getMonthAccess().getNameDecKeyword_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_12, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonth"


    // $ANTLR start "entryRuleOrganizations"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1426:1: entryRuleOrganizations returns [EObject current=null] : iv_ruleOrganizations= ruleOrganizations EOF ;
    public final EObject entryRuleOrganizations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizations = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1427:2: (iv_ruleOrganizations= ruleOrganizations EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1428:2: iv_ruleOrganizations= ruleOrganizations EOF
            {
             newCompositeNode(grammarAccess.getOrganizationsRule()); 
            pushFollow(FOLLOW_ruleOrganizations_in_entryRuleOrganizations2892);
            iv_ruleOrganizations=ruleOrganizations();

            state._fsp--;

             current =iv_ruleOrganizations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganizations2902); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrganizations"


    // $ANTLR start "ruleOrganizations"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1435:1: ruleOrganizations returns [EObject current=null] : (otherlv_0= 'Organizations' otherlv_1= '{' otherlv_2= 'Customer' ( (lv_customer_3_0= RULE_STRING ) ) otherlv_4= 'Supplier' ( (lv_supplier_5_0= RULE_STRING ) ) otherlv_6= 'Partners' ( (lv_partners_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleOrganizations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_customer_3_0=null;
        Token otherlv_4=null;
        Token lv_supplier_5_0=null;
        Token otherlv_6=null;
        Token lv_partners_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1438:28: ( (otherlv_0= 'Organizations' otherlv_1= '{' otherlv_2= 'Customer' ( (lv_customer_3_0= RULE_STRING ) ) otherlv_4= 'Supplier' ( (lv_supplier_5_0= RULE_STRING ) ) otherlv_6= 'Partners' ( (lv_partners_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1439:1: (otherlv_0= 'Organizations' otherlv_1= '{' otherlv_2= 'Customer' ( (lv_customer_3_0= RULE_STRING ) ) otherlv_4= 'Supplier' ( (lv_supplier_5_0= RULE_STRING ) ) otherlv_6= 'Partners' ( (lv_partners_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1439:1: (otherlv_0= 'Organizations' otherlv_1= '{' otherlv_2= 'Customer' ( (lv_customer_3_0= RULE_STRING ) ) otherlv_4= 'Supplier' ( (lv_supplier_5_0= RULE_STRING ) ) otherlv_6= 'Partners' ( (lv_partners_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1439:3: otherlv_0= 'Organizations' otherlv_1= '{' otherlv_2= 'Customer' ( (lv_customer_3_0= RULE_STRING ) ) otherlv_4= 'Supplier' ( (lv_supplier_5_0= RULE_STRING ) ) otherlv_6= 'Partners' ( (lv_partners_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleOrganizations2939); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganizationsAccess().getOrganizationsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleOrganizations2951); 

                	newLeafNode(otherlv_1, grammarAccess.getOrganizationsAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleOrganizations2963); 

                	newLeafNode(otherlv_2, grammarAccess.getOrganizationsAccess().getCustomerKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1451:1: ( (lv_customer_3_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1452:1: (lv_customer_3_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1452:1: (lv_customer_3_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1453:3: lv_customer_3_0= RULE_STRING
            {
            lv_customer_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizations2980); 

            			newLeafNode(lv_customer_3_0, grammarAccess.getOrganizationsAccess().getCustomerSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizationsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"customer",
                    		lv_customer_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleOrganizations2997); 

                	newLeafNode(otherlv_4, grammarAccess.getOrganizationsAccess().getSupplierKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1473:1: ( (lv_supplier_5_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1474:1: (lv_supplier_5_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1474:1: (lv_supplier_5_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1475:3: lv_supplier_5_0= RULE_STRING
            {
            lv_supplier_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizations3014); 

            			newLeafNode(lv_supplier_5_0, grammarAccess.getOrganizationsAccess().getSupplierSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizationsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"supplier",
                    		lv_supplier_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,58,FOLLOW_58_in_ruleOrganizations3031); 

                	newLeafNode(otherlv_6, grammarAccess.getOrganizationsAccess().getPartnersKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1495:1: ( (lv_partners_7_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1496:1: (lv_partners_7_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1496:1: (lv_partners_7_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1497:3: lv_partners_7_0= RULE_STRING
            {
            lv_partners_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizations3048); 

            			newLeafNode(lv_partners_7_0, grammarAccess.getOrganizationsAccess().getPartnersSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizationsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"partners",
                    		lv_partners_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleOrganizations3065); 

                	newLeafNode(otherlv_8, grammarAccess.getOrganizationsAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrganizations"


    // $ANTLR start "entryRuleProjectProgress"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1525:1: entryRuleProjectProgress returns [EObject current=null] : iv_ruleProjectProgress= ruleProjectProgress EOF ;
    public final EObject entryRuleProjectProgress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectProgress = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1526:2: (iv_ruleProjectProgress= ruleProjectProgress EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1527:2: iv_ruleProjectProgress= ruleProjectProgress EOF
            {
             newCompositeNode(grammarAccess.getProjectProgressRule()); 
            pushFollow(FOLLOW_ruleProjectProgress_in_entryRuleProjectProgress3101);
            iv_ruleProjectProgress=ruleProjectProgress();

            state._fsp--;

             current =iv_ruleProjectProgress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectProgress3111); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjectProgress"


    // $ANTLR start "ruleProjectProgress"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1534:1: ruleProjectProgress returns [EObject current=null] : ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) ) ;
    public final EObject ruleProjectProgress() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        Token lv_value_0_7=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1537:28: ( ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1538:1: ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1538:1: ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1539:1: ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1539:1: ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1540:1: (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1540:1: (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' )
            int alt28=7;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt28=1;
                }
                break;
            case 60:
                {
                alt28=2;
                }
                break;
            case 61:
                {
                alt28=3;
                }
                break;
            case 62:
                {
                alt28=4;
                }
                break;
            case 63:
                {
                alt28=5;
                }
                break;
            case 64:
                {
                alt28=6;
                }
                break;
            case 65:
                {
                alt28=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1541:3: lv_value_0_1= 'Not-Plan'
                    {
                    lv_value_0_1=(Token)match(input,59,FOLLOW_59_in_ruleProjectProgress3155); 

                            newLeafNode(lv_value_0_1, grammarAccess.getProjectProgressAccess().getValueNotPlanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1553:8: lv_value_0_2= 'Plan'
                    {
                    lv_value_0_2=(Token)match(input,60,FOLLOW_60_in_ruleProjectProgress3184); 

                            newLeafNode(lv_value_0_2, grammarAccess.getProjectProgressAccess().getValuePlanKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1565:8: lv_value_0_3= 'On-Design'
                    {
                    lv_value_0_3=(Token)match(input,61,FOLLOW_61_in_ruleProjectProgress3213); 

                            newLeafNode(lv_value_0_3, grammarAccess.getProjectProgressAccess().getValueOnDesignKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1577:8: lv_value_0_4= 'On-Develop'
                    {
                    lv_value_0_4=(Token)match(input,62,FOLLOW_62_in_ruleProjectProgress3242); 

                            newLeafNode(lv_value_0_4, grammarAccess.getProjectProgressAccess().getValueOnDevelopKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1589:8: lv_value_0_5= 'On-Test'
                    {
                    lv_value_0_5=(Token)match(input,63,FOLLOW_63_in_ruleProjectProgress3271); 

                            newLeafNode(lv_value_0_5, grammarAccess.getProjectProgressAccess().getValueOnTestKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1601:8: lv_value_0_6= 'On-Deploy'
                    {
                    lv_value_0_6=(Token)match(input,64,FOLLOW_64_in_ruleProjectProgress3300); 

                            newLeafNode(lv_value_0_6, grammarAccess.getProjectProgressAccess().getValueOnDeployKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1613:8: lv_value_0_7= 'Concluded'
                    {
                    lv_value_0_7=(Token)match(input,65,FOLLOW_65_in_ruleProjectProgress3329); 

                            newLeafNode(lv_value_0_7, grammarAccess.getProjectProgressAccess().getValueConcludedKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_7, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectProgress"


    // $ANTLR start "entryRuleSystem"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1636:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1637:2: (iv_ruleSystem= ruleSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1638:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem3380);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem3390); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1645:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token otherlv_9=null;
        Token lv_scope_10_1=null;
        Token lv_scope_10_2=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1648:28: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1649:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1649:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1649:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleSystem3427); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1653:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1654:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1654:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1655:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem3444); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem3461); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1675:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1675:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSystem3474); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1679:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1680:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1680:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1681:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem3491); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getSystemAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1697:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1697:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleSystem3511); 

                        	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1701:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1702:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1702:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1703:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem3528); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleSystem3547); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1723:1: ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1724:1: ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1724:1: ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1725:1: (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1725:1: (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt31=1;
                }
                break;
            case 67:
                {
                alt31=2;
                }
                break;
            case 68:
                {
                alt31=3;
                }
                break;
            case 27:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1726:3: lv_type_8_1= 'System'
                    {
                    lv_type_8_1=(Token)match(input,66,FOLLOW_66_in_ruleSystem3567); 

                            newLeafNode(lv_type_8_1, grammarAccess.getSystemAccess().getTypeSystemKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1738:8: lv_type_8_2= 'Sub-System'
                    {
                    lv_type_8_2=(Token)match(input,67,FOLLOW_67_in_ruleSystem3596); 

                            newLeafNode(lv_type_8_2, grammarAccess.getSystemAccess().getTypeSubSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1750:8: lv_type_8_3= 'Reusable-System'
                    {
                    lv_type_8_3=(Token)match(input,68,FOLLOW_68_in_ruleSystem3625); 

                            newLeafNode(lv_type_8_3, grammarAccess.getSystemAccess().getTypeReusableSystemKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1762:8: lv_type_8_4= 'Other'
                    {
                    lv_type_8_4=(Token)match(input,27,FOLLOW_27_in_ruleSystem3654); 

                            newLeafNode(lv_type_8_4, grammarAccess.getSystemAccess().getTypeOtherKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_9=(Token)match(input,69,FOLLOW_69_in_ruleSystem3682); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getScopeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1781:1: ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1782:1: ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1782:1: ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1783:1: (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1783:1: (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==70) ) {
                alt32=1;
            }
            else if ( (LA32_0==71) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1784:3: lv_scope_10_1= 'In'
                    {
                    lv_scope_10_1=(Token)match(input,70,FOLLOW_70_in_ruleSystem3702); 

                            newLeafNode(lv_scope_10_1, grammarAccess.getSystemAccess().getScopeInKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1796:8: lv_scope_10_2= 'Out'
                    {
                    lv_scope_10_2=(Token)match(input,71,FOLLOW_71_in_ruleSystem3731); 

                            newLeafNode(lv_scope_10_2, grammarAccess.getSystemAccess().getScopeOutKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_10_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1811:2: (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==72) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1811:4: otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,72,FOLLOW_72_in_ruleSystem3760); 

                        	newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getPartOfKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1815:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1816:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1816:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1817:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem3780); 

                    		newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getPartOfSystemCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleSystem3794); 

                	newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSystemRelation"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1840:1: entryRuleSystemRelation returns [EObject current=null] : iv_ruleSystemRelation= ruleSystemRelation EOF ;
    public final EObject entryRuleSystemRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRelation = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1841:2: (iv_ruleSystemRelation= ruleSystemRelation EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1842:2: iv_ruleSystemRelation= ruleSystemRelation EOF
            {
             newCompositeNode(grammarAccess.getSystemRelationRule()); 
            pushFollow(FOLLOW_ruleSystemRelation_in_entryRuleSystemRelation3830);
            iv_ruleSystemRelation=ruleSystemRelation();

            state._fsp--;

             current =iv_ruleSystemRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemRelation3840); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemRelation"


    // $ANTLR start "ruleSystemRelation"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1849:1: ruleSystemRelation returns [EObject current=null] : (otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleSystemRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_category_8_1=null;
        Token lv_category_8_2=null;
        Token lv_category_8_3=null;
        Token lv_category_8_4=null;
        Token lv_category_8_5=null;
        Token lv_category_8_6=null;
        Token otherlv_9=null;
        Token lv_type_10_1=null;
        Token lv_type_10_2=null;
        Token lv_type_10_3=null;
        Token otherlv_11=null;
        Token lv_description_12_0=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1852:28: ( (otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1853:1: (otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1853:1: (otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1853:3: otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleSystemRelation3877); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemRelationAccess().getSystemRelationKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1857:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1858:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1858:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1859:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemRelation3894); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystemRelation3911); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemRelationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleSystemRelation3923); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemRelationAccess().getSourceKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1883:1: ( (otherlv_4= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1884:1: (otherlv_4= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1884:1: (otherlv_4= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1885:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRelationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemRelation3943); 

            		newLeafNode(otherlv_4, grammarAccess.getSystemRelationAccess().getSourceSystemCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleSystemRelation3955); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemRelationAccess().getTargetKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1900:1: ( (otherlv_6= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1901:1: (otherlv_6= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1901:1: (otherlv_6= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1902:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemRelation3975); 

            		newLeafNode(otherlv_6, grammarAccess.getSystemRelationAccess().getTargetSystemCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,76,FOLLOW_76_in_ruleSystemRelation3987); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemRelationAccess().getCategoryKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1917:1: ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1918:1: ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1918:1: ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1919:1: (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1919:1: (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' )
            int alt34=6;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt34=1;
                }
                break;
            case 78:
                {
                alt34=2;
                }
                break;
            case 79:
                {
                alt34=3;
                }
                break;
            case 80:
                {
                alt34=4;
                }
                break;
            case 81:
                {
                alt34=5;
                }
                break;
            case 27:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1920:3: lv_category_8_1= 'Import'
                    {
                    lv_category_8_1=(Token)match(input,77,FOLLOW_77_in_ruleSystemRelation4007); 

                            newLeafNode(lv_category_8_1, grammarAccess.getSystemRelationAccess().getCategoryImportKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1932:8: lv_category_8_2= 'Export'
                    {
                    lv_category_8_2=(Token)match(input,78,FOLLOW_78_in_ruleSystemRelation4036); 

                            newLeafNode(lv_category_8_2, grammarAccess.getSystemRelationAccess().getCategoryExportKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1944:8: lv_category_8_3= 'Import-Export'
                    {
                    lv_category_8_3=(Token)match(input,79,FOLLOW_79_in_ruleSystemRelation4065); 

                            newLeafNode(lv_category_8_3, grammarAccess.getSystemRelationAccess().getCategoryImportExportKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1956:8: lv_category_8_4= 'Sync'
                    {
                    lv_category_8_4=(Token)match(input,80,FOLLOW_80_in_ruleSystemRelation4094); 

                            newLeafNode(lv_category_8_4, grammarAccess.getSystemRelationAccess().getCategorySyncKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1968:8: lv_category_8_5= 'Interact'
                    {
                    lv_category_8_5=(Token)match(input,81,FOLLOW_81_in_ruleSystemRelation4123); 

                            newLeafNode(lv_category_8_5, grammarAccess.getSystemRelationAccess().getCategoryInteractKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1980:8: lv_category_8_6= 'Other'
                    {
                    lv_category_8_6=(Token)match(input,27,FOLLOW_27_in_ruleSystemRelation4152); 

                            newLeafNode(lv_category_8_6, grammarAccess.getSystemRelationAccess().getCategoryOtherKeyword_8_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_6, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleSystemRelation4180); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemRelationAccess().getTypeKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1999:1: ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2000:1: ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2000:1: ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2001:1: (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2001:1: (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt35=1;
                }
                break;
            case 71:
                {
                alt35=2;
                }
                break;
            case 82:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2002:3: lv_type_10_1= 'In'
                    {
                    lv_type_10_1=(Token)match(input,70,FOLLOW_70_in_ruleSystemRelation4200); 

                            newLeafNode(lv_type_10_1, grammarAccess.getSystemRelationAccess().getTypeInKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2014:8: lv_type_10_2= 'Out'
                    {
                    lv_type_10_2=(Token)match(input,71,FOLLOW_71_in_ruleSystemRelation4229); 

                            newLeafNode(lv_type_10_2, grammarAccess.getSystemRelationAccess().getTypeOutKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2026:8: lv_type_10_3= 'In-Out'
                    {
                    lv_type_10_3=(Token)match(input,82,FOLLOW_82_in_ruleSystemRelation4258); 

                            newLeafNode(lv_type_10_3, grammarAccess.getSystemRelationAccess().getTypeInOutKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2041:2: (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2041:4: otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleSystemRelation4287); 

                        	newLeafNode(otherlv_11, grammarAccess.getSystemRelationAccess().getDescriptionKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2045:1: ( (lv_description_12_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2046:1: (lv_description_12_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2046:1: (lv_description_12_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2047:3: lv_description_12_0= RULE_STRING
                    {
                    lv_description_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystemRelation4304); 

                    			newLeafNode(lv_description_12_0, grammarAccess.getSystemRelationAccess().getDescriptionSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_12_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleSystemRelation4323); 

                	newLeafNode(otherlv_13, grammarAccess.getSystemRelationAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemRelation"


    // $ANTLR start "entryRuleGlossaryTerm"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2075:1: entryRuleGlossaryTerm returns [EObject current=null] : iv_ruleGlossaryTerm= ruleGlossaryTerm EOF ;
    public final EObject entryRuleGlossaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossaryTerm = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2076:2: (iv_ruleGlossaryTerm= ruleGlossaryTerm EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2077:2: iv_ruleGlossaryTerm= ruleGlossaryTerm EOF
            {
             newCompositeNode(grammarAccess.getGlossaryTermRule()); 
            pushFollow(FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm4359);
            iv_ruleGlossaryTerm=ruleGlossaryTerm();

            state._fsp--;

             current =iv_ruleGlossaryTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossaryTerm4369); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlossaryTerm"


    // $ANTLR start "ruleGlossaryTerm"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2084:1: ruleGlossaryTerm returns [EObject current=null] : (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleGlossaryTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_acronym_10_0=null;
        Token otherlv_11=null;
        Token lv_pos_12_1=null;
        Token lv_pos_12_2=null;
        Token lv_pos_12_3=null;
        Token lv_pos_12_4=null;
        Token otherlv_13=null;
        Token lv_synonym_14_0=null;
        Token otherlv_15=null;
        Token lv_hypernym_16_0=null;
        Token otherlv_17=null;
        EObject lv_type_8_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2087:28: ( (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2088:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2088:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2088:3: otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleGlossaryTerm4406); 

                	newLeafNode(otherlv_0, grammarAccess.getGlossaryTermAccess().getGlossaryTermKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2092:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2093:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2093:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2094:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlossaryTerm4423); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGlossaryTermAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGlossaryTerm4440); 

                	newLeafNode(otherlv_2, grammarAccess.getGlossaryTermAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2114:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2114:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleGlossaryTerm4453); 

                        	newLeafNode(otherlv_3, grammarAccess.getGlossaryTermAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2118:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2119:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2119:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2120:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4470); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getGlossaryTermAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2136:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2136:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleGlossaryTerm4490); 

                        	newLeafNode(otherlv_5, grammarAccess.getGlossaryTermAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2140:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2141:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2141:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2142:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4507); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getGlossaryTermAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleGlossaryTerm4526); 

                	newLeafNode(otherlv_7, grammarAccess.getGlossaryTermAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2162:1: ( (lv_type_8_0= ruleRefTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2163:1: (lv_type_8_0= ruleRefTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2163:1: (lv_type_8_0= ruleRefTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2164:3: lv_type_8_0= ruleRefTermType
            {
             
            	        newCompositeNode(grammarAccess.getGlossaryTermAccess().getTypeRefTermTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleRefTermType_in_ruleGlossaryTerm4547);
            lv_type_8_0=ruleRefTermType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlossaryTermRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"RefTermType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2180:2: (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==84) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2180:4: otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,84,FOLLOW_84_in_ruleGlossaryTerm4560); 

                        	newLeafNode(otherlv_9, grammarAccess.getGlossaryTermAccess().getAcronymKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2184:1: ( (lv_acronym_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2185:1: (lv_acronym_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2185:1: (lv_acronym_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2186:3: lv_acronym_10_0= RULE_STRING
                    {
                    lv_acronym_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4577); 

                    			newLeafNode(lv_acronym_10_0, grammarAccess.getGlossaryTermAccess().getAcronymSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"acronym",
                            		lv_acronym_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2202:4: (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==85) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2202:6: otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    {
                    otherlv_11=(Token)match(input,85,FOLLOW_85_in_ruleGlossaryTerm4597); 

                        	newLeafNode(otherlv_11, grammarAccess.getGlossaryTermAccess().getPOSKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2206:1: ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2207:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2207:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2208:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2208:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    int alt40=4;
                    switch ( input.LA(1) ) {
                    case 86:
                        {
                        alt40=1;
                        }
                        break;
                    case 87:
                        {
                        alt40=2;
                        }
                        break;
                    case 88:
                        {
                        alt40=3;
                        }
                        break;
                    case 89:
                        {
                        alt40=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2209:3: lv_pos_12_1= 'Adjective'
                            {
                            lv_pos_12_1=(Token)match(input,86,FOLLOW_86_in_ruleGlossaryTerm4617); 

                                    newLeafNode(lv_pos_12_1, grammarAccess.getGlossaryTermAccess().getPosAdjectiveKeyword_8_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2221:8: lv_pos_12_2= 'Adverb'
                            {
                            lv_pos_12_2=(Token)match(input,87,FOLLOW_87_in_ruleGlossaryTerm4646); 

                                    newLeafNode(lv_pos_12_2, grammarAccess.getGlossaryTermAccess().getPosAdverbKeyword_8_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2233:8: lv_pos_12_3= 'Noun'
                            {
                            lv_pos_12_3=(Token)match(input,88,FOLLOW_88_in_ruleGlossaryTerm4675); 

                                    newLeafNode(lv_pos_12_3, grammarAccess.getGlossaryTermAccess().getPosNounKeyword_8_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2245:8: lv_pos_12_4= 'Verb'
                            {
                            lv_pos_12_4=(Token)match(input,89,FOLLOW_89_in_ruleGlossaryTerm4704); 

                                    newLeafNode(lv_pos_12_4, grammarAccess.getGlossaryTermAccess().getPosVerbKeyword_8_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_4, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2260:4: (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==90) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2260:6: otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,90,FOLLOW_90_in_ruleGlossaryTerm4735); 

                        	newLeafNode(otherlv_13, grammarAccess.getGlossaryTermAccess().getSynonymKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2264:1: ( (lv_synonym_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2265:1: (lv_synonym_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2265:1: (lv_synonym_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2266:3: lv_synonym_14_0= RULE_STRING
                    {
                    lv_synonym_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4752); 

                    			newLeafNode(lv_synonym_14_0, grammarAccess.getGlossaryTermAccess().getSynonymSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"synonym",
                            		lv_synonym_14_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2282:4: (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==91) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2282:6: otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,91,FOLLOW_91_in_ruleGlossaryTerm4772); 

                        	newLeafNode(otherlv_15, grammarAccess.getGlossaryTermAccess().getHypernymKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2286:1: ( (lv_hypernym_16_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2287:1: (lv_hypernym_16_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2287:1: (lv_hypernym_16_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2288:3: lv_hypernym_16_0= RULE_STRING
                    {
                    lv_hypernym_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4789); 

                    			newLeafNode(lv_hypernym_16_0, grammarAccess.getGlossaryTermAccess().getHypernymSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hypernym",
                            		lv_hypernym_16_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleGlossaryTerm4808); 

                	newLeafNode(otherlv_17, grammarAccess.getGlossaryTermAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlossaryTerm"


    // $ANTLR start "entryRuleRefTermType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2316:1: entryRuleRefTermType returns [EObject current=null] : iv_ruleRefTermType= ruleRefTermType EOF ;
    public final EObject entryRuleRefTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2317:2: (iv_ruleRefTermType= ruleRefTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2318:2: iv_ruleRefTermType= ruleRefTermType EOF
            {
             newCompositeNode(grammarAccess.getRefTermTypeRule()); 
            pushFollow(FOLLOW_ruleRefTermType_in_entryRuleRefTermType4844);
            iv_ruleRefTermType=ruleRefTermType();

            state._fsp--;

             current =iv_ruleRefTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTermType4854); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefTermType"


    // $ANTLR start "ruleRefTermType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2325:1: ruleRefTermType returns [EObject current=null] : ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) ;
    public final EObject ruleRefTermType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_refType_0_0 = null;

        EObject lv_refs_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2328:28: ( ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2329:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2329:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2329:2: ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2329:2: ( (lv_refType_0_0= ruleTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2330:1: (lv_refType_0_0= ruleTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2330:1: (lv_refType_0_0= ruleTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2331:3: lv_refType_0_0= ruleTermType
            {
             
            	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefTypeTermTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType4900);
            lv_refType_0_0=ruleTermType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRefTermTypeRule());
            	        }
                   		set(
                   			current, 
                   			"refType",
                    		lv_refType_0_0, 
                    		"TermType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2347:2: (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==92) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2347:4: otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefTermType4913); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefTermTypeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2351:1: ( (lv_refs_2_0= ruleTermType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2352:1: (lv_refs_2_0= ruleTermType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2352:1: (lv_refs_2_0= ruleTermType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2353:3: lv_refs_2_0= ruleTermType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefsTermTypeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType4934);
            	    lv_refs_2_0=ruleTermType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefTermTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"refs",
            	            		lv_refs_2_0, 
            	            		"TermType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefTermType"


    // $ANTLR start "entryRuleTermType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2377:1: entryRuleTermType returns [EObject current=null] : iv_ruleTermType= ruleTermType EOF ;
    public final EObject entryRuleTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2378:2: (iv_ruleTermType= ruleTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2379:2: iv_ruleTermType= ruleTermType EOF
            {
             newCompositeNode(grammarAccess.getTermTypeRule()); 
            pushFollow(FOLLOW_ruleTermType_in_entryRuleTermType4972);
            iv_ruleTermType=ruleTermType();

            state._fsp--;

             current =iv_ruleTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermType4982); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermType"


    // $ANTLR start "ruleTermType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2386:1: ruleTermType returns [EObject current=null] : ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) ;
    public final EObject ruleTermType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2389:28: ( ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2390:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2390:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2391:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2391:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2392:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2392:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt45=1;
                }
                break;
            case 94:
                {
                alt45=2;
                }
                break;
            case 95:
                {
                alt45=3;
                }
                break;
            case 96:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2393:3: lv_type_0_1= 'Stakeholder'
                    {
                    lv_type_0_1=(Token)match(input,93,FOLLOW_93_in_ruleTermType5026); 

                            newLeafNode(lv_type_0_1, grammarAccess.getTermTypeAccess().getTypeStakeholderKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2405:8: lv_type_0_2= 'Entity'
                    {
                    lv_type_0_2=(Token)match(input,94,FOLLOW_94_in_ruleTermType5055); 

                            newLeafNode(lv_type_0_2, grammarAccess.getTermTypeAccess().getTypeEntityKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2417:8: lv_type_0_3= 'Architectural'
                    {
                    lv_type_0_3=(Token)match(input,95,FOLLOW_95_in_ruleTermType5084); 

                            newLeafNode(lv_type_0_3, grammarAccess.getTermTypeAccess().getTypeArchitecturalKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2429:8: lv_type_0_4= 'Actor'
                    {
                    lv_type_0_4=(Token)match(input,96,FOLLOW_96_in_ruleTermType5113); 

                            newLeafNode(lv_type_0_4, grammarAccess.getTermTypeAccess().getTypeActorKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_4, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermType"


    // $ANTLR start "entryRuleStakeholder"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2452:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2453:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2454:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder5164);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder5174); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStakeholder"


    // $ANTLR start "ruleStakeholder"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2461:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token lv_type_8_5=null;
        Token otherlv_9=null;
        Token lv_category_10_1=null;
        Token lv_category_10_2=null;
        Token lv_category_10_3=null;
        Token lv_category_10_4=null;
        Token lv_category_10_5=null;
        Token lv_category_10_6=null;
        Token lv_category_10_7=null;
        Token lv_category_10_8=null;
        Token lv_category_10_9=null;
        Token lv_category_10_10=null;
        Token lv_category_10_11=null;
        Token lv_category_10_12=null;
        Token lv_category_10_13=null;
        Token lv_category_10_14=null;
        Token lv_category_10_15=null;
        Token lv_category_10_16=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2464:28: ( (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2465:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2465:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2465:3: otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleStakeholder5211); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2469:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2470:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2470:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2471:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder5228); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStakeholderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStakeholder5245); 

                	newLeafNode(otherlv_2, grammarAccess.getStakeholderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2491:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==19) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2491:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStakeholder5258); 

                        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2495:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2496:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2496:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2497:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder5275); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getStakeholderAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2513:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2513:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleStakeholder5295); 

                        	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2517:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2518:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2518:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2519:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder5312); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStakeholder5331); 

                	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2539:1: ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2540:1: ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2540:1: ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2541:1: (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2541:1: (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt48=1;
                }
                break;
            case 98:
                {
                alt48=2;
                }
                break;
            case 99:
                {
                alt48=3;
                }
                break;
            case 100:
                {
                alt48=4;
                }
                break;
            case 101:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2542:3: lv_type_8_1= 'Group.Organization'
                    {
                    lv_type_8_1=(Token)match(input,97,FOLLOW_97_in_ruleStakeholder5351); 

                            newLeafNode(lv_type_8_1, grammarAccess.getStakeholderAccess().getTypeGroupOrganizationKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2554:8: lv_type_8_2= 'Group.BusinessUnit'
                    {
                    lv_type_8_2=(Token)match(input,98,FOLLOW_98_in_ruleStakeholder5380); 

                            newLeafNode(lv_type_8_2, grammarAccess.getStakeholderAccess().getTypeGroupBusinessUnitKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2566:8: lv_type_8_3= 'Group.Team'
                    {
                    lv_type_8_3=(Token)match(input,99,FOLLOW_99_in_ruleStakeholder5409); 

                            newLeafNode(lv_type_8_3, grammarAccess.getStakeholderAccess().getTypeGroupTeamKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2578:8: lv_type_8_4= 'Individual.Person'
                    {
                    lv_type_8_4=(Token)match(input,100,FOLLOW_100_in_ruleStakeholder5438); 

                            newLeafNode(lv_type_8_4, grammarAccess.getStakeholderAccess().getTypeIndividualPersonKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2590:8: lv_type_8_5= 'Individual.ExternalSystem'
                    {
                    lv_type_8_5=(Token)match(input,101,FOLLOW_101_in_ruleStakeholder5467); 

                            newLeafNode(lv_type_8_5, grammarAccess.getStakeholderAccess().getTypeIndividualExternalSystemKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_9=(Token)match(input,76,FOLLOW_76_in_ruleStakeholder5495); 

                	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getCategoryKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2609:1: ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2610:1: ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2610:1: ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2611:1: (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2611:1: (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' )
            int alt49=16;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt49=1;
                }
                break;
            case 103:
                {
                alt49=2;
                }
                break;
            case 104:
                {
                alt49=3;
                }
                break;
            case 105:
                {
                alt49=4;
                }
                break;
            case 106:
                {
                alt49=5;
                }
                break;
            case 107:
                {
                alt49=6;
                }
                break;
            case 108:
                {
                alt49=7;
                }
                break;
            case 109:
                {
                alt49=8;
                }
                break;
            case 110:
                {
                alt49=9;
                }
                break;
            case 111:
                {
                alt49=10;
                }
                break;
            case 112:
                {
                alt49=11;
                }
                break;
            case 113:
                {
                alt49=12;
                }
                break;
            case 114:
                {
                alt49=13;
                }
                break;
            case 115:
                {
                alt49=14;
                }
                break;
            case 116:
                {
                alt49=15;
                }
                break;
            case 117:
                {
                alt49=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2612:3: lv_category_10_1= 'Business'
                    {
                    lv_category_10_1=(Token)match(input,102,FOLLOW_102_in_ruleStakeholder5515); 

                            newLeafNode(lv_category_10_1, grammarAccess.getStakeholderAccess().getCategoryBusinessKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2624:8: lv_category_10_2= 'Business.Customer'
                    {
                    lv_category_10_2=(Token)match(input,103,FOLLOW_103_in_ruleStakeholder5544); 

                            newLeafNode(lv_category_10_2, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2636:8: lv_category_10_3= 'Business.Customer.Sponsor'
                    {
                    lv_category_10_3=(Token)match(input,104,FOLLOW_104_in_ruleStakeholder5573); 

                            newLeafNode(lv_category_10_3, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerSponsorKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2648:8: lv_category_10_4= 'Business.Customer.Champion'
                    {
                    lv_category_10_4=(Token)match(input,105,FOLLOW_105_in_ruleStakeholder5602); 

                            newLeafNode(lv_category_10_4, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerChampionKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2660:8: lv_category_10_5= 'Business.User.Direct'
                    {
                    lv_category_10_5=(Token)match(input,106,FOLLOW_106_in_ruleStakeholder5631); 

                            newLeafNode(lv_category_10_5, grammarAccess.getStakeholderAccess().getCategoryBusinessUserDirectKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2672:8: lv_category_10_6= 'Business.User.Indirect'
                    {
                    lv_category_10_6=(Token)match(input,107,FOLLOW_107_in_ruleStakeholder5660); 

                            newLeafNode(lv_category_10_6, grammarAccess.getStakeholderAccess().getCategoryBusinessUserIndirectKeyword_8_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2684:8: lv_category_10_7= 'Business.Advisor.DomainExpert'
                    {
                    lv_category_10_7=(Token)match(input,108,FOLLOW_108_in_ruleStakeholder5689); 

                            newLeafNode(lv_category_10_7, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorDomainExpertKeyword_8_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2696:8: lv_category_10_8= 'Business.Advisor.Trainer'
                    {
                    lv_category_10_8=(Token)match(input,109,FOLLOW_109_in_ruleStakeholder5718); 

                            newLeafNode(lv_category_10_8, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorTrainerKeyword_8_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2708:8: lv_category_10_9= 'Business.Advisor.RegulatorAgent'
                    {
                    lv_category_10_9=(Token)match(input,110,FOLLOW_110_in_ruleStakeholder5747); 

                            newLeafNode(lv_category_10_9, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorRegulatorAgentKeyword_8_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2720:8: lv_category_10_10= 'Business.System'
                    {
                    lv_category_10_10=(Token)match(input,111,FOLLOW_111_in_ruleStakeholder5776); 

                            newLeafNode(lv_category_10_10, grammarAccess.getStakeholderAccess().getCategoryBusinessSystemKeyword_8_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2732:8: lv_category_10_11= 'Technical'
                    {
                    lv_category_10_11=(Token)match(input,112,FOLLOW_112_in_ruleStakeholder5805); 

                            newLeafNode(lv_category_10_11, grammarAccess.getStakeholderAccess().getCategoryTechnicalKeyword_8_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2744:8: lv_category_10_12= 'Technical.BusinessAnalyst'
                    {
                    lv_category_10_12=(Token)match(input,113,FOLLOW_113_in_ruleStakeholder5834); 

                            newLeafNode(lv_category_10_12, grammarAccess.getStakeholderAccess().getCategoryTechnicalBusinessAnalystKeyword_8_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_12, null);
                    	    

                    }
                    break;
                case 13 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2756:8: lv_category_10_13= 'Technical.Requirements.Engineer'
                    {
                    lv_category_10_13=(Token)match(input,114,FOLLOW_114_in_ruleStakeholder5863); 

                            newLeafNode(lv_category_10_13, grammarAccess.getStakeholderAccess().getCategoryTechnicalRequirementsEngineerKeyword_8_0_12());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_13, null);
                    	    

                    }
                    break;
                case 14 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2768:8: lv_category_10_14= 'Technical.Software.Architect'
                    {
                    lv_category_10_14=(Token)match(input,115,FOLLOW_115_in_ruleStakeholder5892); 

                            newLeafNode(lv_category_10_14, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareArchitectKeyword_8_0_13());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_14, null);
                    	    

                    }
                    break;
                case 15 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2780:8: lv_category_10_15= 'Technical.Software.Designer'
                    {
                    lv_category_10_15=(Token)match(input,116,FOLLOW_116_in_ruleStakeholder5921); 

                            newLeafNode(lv_category_10_15, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareDesignerKeyword_8_0_14());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_15, null);
                    	    

                    }
                    break;
                case 16 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2792:8: lv_category_10_16= 'Technical.Software.Tester'
                    {
                    lv_category_10_16=(Token)match(input,117,FOLLOW_117_in_ruleStakeholder5950); 

                            newLeafNode(lv_category_10_16, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareTesterKeyword_8_0_15());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_16, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2807:2: (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==118) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2807:4: otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,118,FOLLOW_118_in_ruleStakeholder5979); 

                        	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getIsAKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2811:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2812:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2812:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2813:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder5999); 

                    		newLeafNode(otherlv_12, grammarAccess.getStakeholderAccess().getIsAStakeholderCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2824:4: (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==72) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2824:6: otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,72,FOLLOW_72_in_ruleStakeholder6014); 

                        	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getPartOfKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2828:1: ( (otherlv_14= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2829:1: (otherlv_14= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2829:1: (otherlv_14= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2830:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder6034); 

                    		newLeafNode(otherlv_14, grammarAccess.getStakeholderAccess().getPartOfStakeholderCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleStakeholder6048); 

                	newLeafNode(otherlv_15, grammarAccess.getStakeholderAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStakeholder"


    // $ANTLR start "entryRuleGoal"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2853:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2854:2: (iv_ruleGoal= ruleGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2855:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal6084);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal6094); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2862:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_priority_10_0 = null;

        EObject lv_progress_12_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2865:28: ( (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2866:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2866:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2866:3: otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_119_in_ruleGoal6131); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2870:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2871:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2871:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2872:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal6148); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoal6165); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2892:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2892:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleGoal6178); 

                        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2896:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2897:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2897:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2898:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal6195); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getGoalAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2914:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==37) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2914:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleGoal6215); 

                        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2918:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2919:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2919:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2920:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal6232); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,93,FOLLOW_93_in_ruleGoal6251); 

                	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getStakeholderKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2940:1: ( (otherlv_8= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2941:1: (otherlv_8= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2941:1: (otherlv_8= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2942:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal6271); 

            		newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getStakeholderStakeholderCrossReference_6_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,120,FOLLOW_120_in_ruleGoal6283); 

                	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getPriorityKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2957:1: ( (lv_priority_10_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2958:1: (lv_priority_10_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2958:1: (lv_priority_10_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2959:3: lv_priority_10_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getGoalAccess().getPriorityPriorityParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleGoal6304);
            lv_priority_10_0=rulePriority();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	        }
                   		set(
                   			current, 
                   			"priority",
                    		lv_priority_10_0, 
                    		"Priority");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2975:2: (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==35) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2975:4: otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleGoal6317); 

                        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getProjectProgressKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2979:1: ( (lv_progress_12_0= ruleProjectProgress ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2980:1: (lv_progress_12_0= ruleProjectProgress )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2980:1: (lv_progress_12_0= ruleProjectProgress )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2981:3: lv_progress_12_0= ruleProjectProgress
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getProgressProjectProgressParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectProgress_in_ruleGoal6338);
                    lv_progress_12_0=ruleProjectProgress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	        }
                           		set(
                           			current, 
                           			"progress",
                            		lv_progress_12_0, 
                            		"ProjectProgress");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2997:4: (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==121) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2997:6: otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,121,FOLLOW_121_in_ruleGoal6353); 

                        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getPartOfAndKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3001:1: ( (otherlv_14= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3002:1: (otherlv_14= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3002:1: (otherlv_14= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3003:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal6373); 

                    		newLeafNode(otherlv_14, grammarAccess.getGoalAccess().getPartOfAndGoalCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3014:4: (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==122) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3014:6: otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,122,FOLLOW_122_in_ruleGoal6388); 

                        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getPartOfOrKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3018:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3019:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3019:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3020:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal6408); 

                    		newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getPartOfOrGoalCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleGoal6422); 

                	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleGoalRelation"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3043:1: entryRuleGoalRelation returns [EObject current=null] : iv_ruleGoalRelation= ruleGoalRelation EOF ;
    public final EObject entryRuleGoalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalRelation = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3044:2: (iv_ruleGoalRelation= ruleGoalRelation EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3045:2: iv_ruleGoalRelation= ruleGoalRelation EOF
            {
             newCompositeNode(grammarAccess.getGoalRelationRule()); 
            pushFollow(FOLLOW_ruleGoalRelation_in_entryRuleGoalRelation6458);
            iv_ruleGoalRelation=ruleGoalRelation();

            state._fsp--;

             current =iv_ruleGoalRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalRelation6468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalRelation"


    // $ANTLR start "ruleGoalRelation"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3052:1: ruleGoalRelation returns [EObject current=null] : (otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleGoalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token lv_type_8_5=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3055:28: ( (otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3056:1: (otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3056:1: (otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3056:3: otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,123,FOLLOW_123_in_ruleGoalRelation6505); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalRelationAccess().getGoalRelationKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3060:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3061:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3061:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3062:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoalRelation6522); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGoalRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoalRelation6539); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalRelationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleGoalRelation6551); 

                	newLeafNode(otherlv_3, grammarAccess.getGoalRelationAccess().getSourceKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3086:1: ( (otherlv_4= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3087:1: (otherlv_4= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3087:1: (otherlv_4= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3088:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRelationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoalRelation6571); 

            		newLeafNode(otherlv_4, grammarAccess.getGoalRelationAccess().getSourceGoalCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleGoalRelation6583); 

                	newLeafNode(otherlv_5, grammarAccess.getGoalRelationAccess().getTargetKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3103:1: ( (otherlv_6= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3104:1: (otherlv_6= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3104:1: (otherlv_6= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3105:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoalRelation6603); 

            		newLeafNode(otherlv_6, grammarAccess.getGoalRelationAccess().getTargetGoalCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleGoalRelation6615); 

                	newLeafNode(otherlv_7, grammarAccess.getGoalRelationAccess().getTypeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3120:1: ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3121:1: ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3121:1: ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3122:1: (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3122:1: (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt57=1;
                }
                break;
            case 125:
                {
                alt57=2;
                }
                break;
            case 126:
                {
                alt57=3;
                }
                break;
            case 127:
                {
                alt57=4;
                }
                break;
            case 128:
                {
                alt57=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3123:3: lv_type_8_1= 'Requires'
                    {
                    lv_type_8_1=(Token)match(input,124,FOLLOW_124_in_ruleGoalRelation6635); 

                            newLeafNode(lv_type_8_1, grammarAccess.getGoalRelationAccess().getTypeRequiresKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3135:8: lv_type_8_2= 'Supports'
                    {
                    lv_type_8_2=(Token)match(input,125,FOLLOW_125_in_ruleGoalRelation6664); 

                            newLeafNode(lv_type_8_2, grammarAccess.getGoalRelationAccess().getTypeSupportsKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3147:8: lv_type_8_3= 'Obstructs'
                    {
                    lv_type_8_3=(Token)match(input,126,FOLLOW_126_in_ruleGoalRelation6693); 

                            newLeafNode(lv_type_8_3, grammarAccess.getGoalRelationAccess().getTypeObstructsKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3159:8: lv_type_8_4= 'Conflicts'
                    {
                    lv_type_8_4=(Token)match(input,127,FOLLOW_127_in_ruleGoalRelation6722); 

                            newLeafNode(lv_type_8_4, grammarAccess.getGoalRelationAccess().getTypeConflictsKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3171:8: lv_type_8_5= 'Identical'
                    {
                    lv_type_8_5=(Token)match(input,128,FOLLOW_128_in_ruleGoalRelation6751); 

                            newLeafNode(lv_type_8_5, grammarAccess.getGoalRelationAccess().getTypeIdenticalKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3186:2: (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==37) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3186:4: otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleGoalRelation6780); 

                        	newLeafNode(otherlv_9, grammarAccess.getGoalRelationAccess().getDescriptionKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3190:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3191:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3191:1: (lv_description_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3192:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoalRelation6797); 

                    			newLeafNode(lv_description_10_0, grammarAccess.getGoalRelationAccess().getDescriptionSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleGoalRelation6816); 

                	newLeafNode(otherlv_11, grammarAccess.getGoalRelationAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoalRelation"


    // $ANTLR start "entryRulePriority"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3220:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3221:2: (iv_rulePriority= rulePriority EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3222:2: iv_rulePriority= rulePriority EOF
            {
             newCompositeNode(grammarAccess.getPriorityRule()); 
            pushFollow(FOLLOW_rulePriority_in_entryRulePriority6852);
            iv_rulePriority=rulePriority();

            state._fsp--;

             current =iv_rulePriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePriority6862); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePriority"


    // $ANTLR start "rulePriority"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3229:1: rulePriority returns [EObject current=null] : ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3232:28: ( ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3233:1: ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3233:1: ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3234:1: ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3234:1: ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3235:1: (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3235:1: (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' )
            int alt59=4;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt59=1;
                }
                break;
            case 130:
                {
                alt59=2;
                }
                break;
            case 131:
                {
                alt59=3;
                }
                break;
            case 132:
                {
                alt59=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3236:3: lv_value_0_1= 'Must'
                    {
                    lv_value_0_1=(Token)match(input,129,FOLLOW_129_in_rulePriority6906); 

                            newLeafNode(lv_value_0_1, grammarAccess.getPriorityAccess().getValueMustKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3248:8: lv_value_0_2= 'Should'
                    {
                    lv_value_0_2=(Token)match(input,130,FOLLOW_130_in_rulePriority6935); 

                            newLeafNode(lv_value_0_2, grammarAccess.getPriorityAccess().getValueShouldKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3260:8: lv_value_0_3= 'Could'
                    {
                    lv_value_0_3=(Token)match(input,131,FOLLOW_131_in_rulePriority6964); 

                            newLeafNode(lv_value_0_3, grammarAccess.getPriorityAccess().getValueCouldKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3272:8: lv_value_0_4= 'Won\\'t'
                    {
                    lv_value_0_4=(Token)match(input,132,FOLLOW_132_in_rulePriority6993); 

                            newLeafNode(lv_value_0_4, grammarAccess.getPriorityAccess().getValueWonTKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePriority"


    // $ANTLR start "entryRuleRefGoal"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3295:1: entryRuleRefGoal returns [EObject current=null] : iv_ruleRefGoal= ruleRefGoal EOF ;
    public final EObject entryRuleRefGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3296:2: (iv_ruleRefGoal= ruleRefGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3297:2: iv_ruleRefGoal= ruleRefGoal EOF
            {
             newCompositeNode(grammarAccess.getRefGoalRule()); 
            pushFollow(FOLLOW_ruleRefGoal_in_entryRuleRefGoal7044);
            iv_ruleRefGoal=ruleRefGoal();

            state._fsp--;

             current =iv_ruleRefGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGoal7054); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefGoal"


    // $ANTLR start "ruleRefGoal"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3304:1: ruleRefGoal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3307:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3308:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3308:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3308:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3308:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3309:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3309:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3310:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefGoalRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal7099); 

            		newLeafNode(otherlv_0, grammarAccess.getRefGoalAccess().getRefGoalGoalCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3321:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==92) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3321:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefGoal7112); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefGoalAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3325:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3326:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3326:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3327:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefGoalRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal7132); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefGoalAccess().getRefsGoalCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefGoal"


    // $ANTLR start "entryRuleEntity"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3346:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3347:2: (iv_ruleEntity= ruleEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3348:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity7170);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity7180); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3355:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token otherlv_13=null;
        EObject lv_attributes_9_0 = null;

        EObject lv_primaryKey_10_0 = null;

        EObject lv_foreignKeys_11_0 = null;

        EObject lv_checks_12_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3358:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3359:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3359:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3359:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleEntity7217); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3363:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3364:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3364:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3365:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity7234); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity7251); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3385:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==19) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3385:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEntity7264); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3389:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3390:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3390:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3391:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity7281); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getEntityAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3407:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==37) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3407:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleEntity7301); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3411:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3412:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3412:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3413:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity7318); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3429:4: (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==20) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3429:6: otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEntity7338); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getTypeKeyword_5_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3433:1: ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3434:1: ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3434:1: ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3435:1: (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3435:1: (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==133) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==134) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3436:3: lv_type_8_1= 'Principal'
                            {
                            lv_type_8_1=(Token)match(input,133,FOLLOW_133_in_ruleEntity7358); 

                                    newLeafNode(lv_type_8_1, grammarAccess.getEntityAccess().getTypePrincipalKeyword_5_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEntityRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_8_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3448:8: lv_type_8_2= 'Secondary'
                            {
                            lv_type_8_2=(Token)match(input,134,FOLLOW_134_in_ruleEntity7387); 

                                    newLeafNode(lv_type_8_2, grammarAccess.getEntityAccess().getTypeSecondaryKeyword_5_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEntityRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_8_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3463:4: ( (lv_attributes_9_0= ruleAttribute ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==135) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3464:1: (lv_attributes_9_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3464:1: (lv_attributes_9_0= ruleAttribute )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3465:3: lv_attributes_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity7426);
            	    lv_attributes_9_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_9_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3481:3: ( (lv_primaryKey_10_0= rulePrimaryKey ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==157) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3482:1: (lv_primaryKey_10_0= rulePrimaryKey )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3482:1: (lv_primaryKey_10_0= rulePrimaryKey )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3483:3: lv_primaryKey_10_0= rulePrimaryKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getPrimaryKeyPrimaryKeyParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryKey_in_ruleEntity7448);
                    lv_primaryKey_10_0=rulePrimaryKey();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		set(
                           			current, 
                           			"primaryKey",
                            		lv_primaryKey_10_0, 
                            		"PrimaryKey");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3499:3: ( (lv_foreignKeys_11_0= ruleForeignKey ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==160) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3500:1: (lv_foreignKeys_11_0= ruleForeignKey )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3500:1: (lv_foreignKeys_11_0= ruleForeignKey )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3501:3: lv_foreignKeys_11_0= ruleForeignKey
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getForeignKeysForeignKeyParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleForeignKey_in_ruleEntity7470);
            	    lv_foreignKeys_11_0=ruleForeignKey();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"foreignKeys",
            	            		lv_foreignKeys_11_0, 
            	            		"ForeignKey");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3517:3: ( (lv_checks_12_0= ruleCheck ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==161) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3518:1: (lv_checks_12_0= ruleCheck )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3518:1: (lv_checks_12_0= ruleCheck )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3519:3: lv_checks_12_0= ruleCheck
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getChecksCheckParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCheck_in_ruleEntity7492);
            	    lv_checks_12_0=ruleCheck();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"checks",
            	            		lv_checks_12_0, 
            	            		"Check");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleEntity7505); 

                	newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3547:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3548:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3549:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute7541);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute7551); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3556:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token lv_type_8_5=null;
        Token lv_type_8_6=null;
        Token lv_type_8_7=null;
        Token lv_type_8_8=null;
        Token lv_type_8_9=null;
        Token lv_type_8_10=null;
        Token lv_type_8_11=null;
        Token lv_type_8_12=null;
        Token otherlv_9=null;
        Token lv_size_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_defaultValue_14_0=null;
        Token lv_notNull_15_0=null;
        Token lv_unique_16_0=null;
        Token otherlv_17=null;
        EObject lv_multiplicity_12_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3559:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3560:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3560:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3560:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,135,FOLLOW_135_in_ruleAttribute7588); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3564:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3565:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3565:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3566:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute7605); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute7622); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3586:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==19) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3586:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAttribute7635); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3590:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3591:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3591:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3592:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute7652); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getAttributeAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3608:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==37) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3608:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleAttribute7672); 

                        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3612:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3613:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3613:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3614:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute7689); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleAttribute7708); 

                	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3634:1: ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3635:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3635:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3636:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3636:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            int alt71=12;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt71=1;
                }
                break;
            case 137:
                {
                alt71=2;
                }
                break;
            case 138:
                {
                alt71=3;
                }
                break;
            case 139:
                {
                alt71=4;
                }
                break;
            case 140:
                {
                alt71=5;
                }
                break;
            case 141:
                {
                alt71=6;
                }
                break;
            case 142:
                {
                alt71=7;
                }
                break;
            case 143:
                {
                alt71=8;
                }
                break;
            case 144:
                {
                alt71=9;
                }
                break;
            case 145:
                {
                alt71=10;
                }
                break;
            case 146:
                {
                alt71=11;
                }
                break;
            case 147:
                {
                alt71=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3637:3: lv_type_8_1= 'Boolean'
                    {
                    lv_type_8_1=(Token)match(input,136,FOLLOW_136_in_ruleAttribute7728); 

                            newLeafNode(lv_type_8_1, grammarAccess.getAttributeAccess().getTypeBooleanKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3649:8: lv_type_8_2= 'Integer'
                    {
                    lv_type_8_2=(Token)match(input,137,FOLLOW_137_in_ruleAttribute7757); 

                            newLeafNode(lv_type_8_2, grammarAccess.getAttributeAccess().getTypeIntegerKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3661:8: lv_type_8_3= 'Decimal'
                    {
                    lv_type_8_3=(Token)match(input,138,FOLLOW_138_in_ruleAttribute7786); 

                            newLeafNode(lv_type_8_3, grammarAccess.getAttributeAccess().getTypeDecimalKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3673:8: lv_type_8_4= 'Currency'
                    {
                    lv_type_8_4=(Token)match(input,139,FOLLOW_139_in_ruleAttribute7815); 

                            newLeafNode(lv_type_8_4, grammarAccess.getAttributeAccess().getTypeCurrencyKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3685:8: lv_type_8_5= 'Date'
                    {
                    lv_type_8_5=(Token)match(input,140,FOLLOW_140_in_ruleAttribute7844); 

                            newLeafNode(lv_type_8_5, grammarAccess.getAttributeAccess().getTypeDateKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3697:8: lv_type_8_6= 'Time'
                    {
                    lv_type_8_6=(Token)match(input,141,FOLLOW_141_in_ruleAttribute7873); 

                            newLeafNode(lv_type_8_6, grammarAccess.getAttributeAccess().getTypeTimeKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3709:8: lv_type_8_7= 'Datetime'
                    {
                    lv_type_8_7=(Token)match(input,142,FOLLOW_142_in_ruleAttribute7902); 

                            newLeafNode(lv_type_8_7, grammarAccess.getAttributeAccess().getTypeDatetimeKeyword_6_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3721:8: lv_type_8_8= 'Enumeration'
                    {
                    lv_type_8_8=(Token)match(input,143,FOLLOW_143_in_ruleAttribute7931); 

                            newLeafNode(lv_type_8_8, grammarAccess.getAttributeAccess().getTypeEnumerationKeyword_6_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3733:8: lv_type_8_9= 'Text'
                    {
                    lv_type_8_9=(Token)match(input,144,FOLLOW_144_in_ruleAttribute7960); 

                            newLeafNode(lv_type_8_9, grammarAccess.getAttributeAccess().getTypeTextKeyword_6_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3745:8: lv_type_8_10= 'Regex'
                    {
                    lv_type_8_10=(Token)match(input,145,FOLLOW_145_in_ruleAttribute7989); 

                            newLeafNode(lv_type_8_10, grammarAccess.getAttributeAccess().getTypeRegexKeyword_6_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3757:8: lv_type_8_11= 'URL'
                    {
                    lv_type_8_11=(Token)match(input,146,FOLLOW_146_in_ruleAttribute8018); 

                            newLeafNode(lv_type_8_11, grammarAccess.getAttributeAccess().getTypeURLKeyword_6_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3769:8: lv_type_8_12= 'Image'
                    {
                    lv_type_8_12=(Token)match(input,147,FOLLOW_147_in_ruleAttribute8047); 

                            newLeafNode(lv_type_8_12, grammarAccess.getAttributeAccess().getTypeImageKeyword_6_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_12, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3784:2: (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==148) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3784:4: otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,148,FOLLOW_148_in_ruleAttribute8076); 

                        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getSizeKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3788:1: ( (lv_size_10_0= RULE_INT ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3789:1: (lv_size_10_0= RULE_INT )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3789:1: (lv_size_10_0= RULE_INT )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3790:3: lv_size_10_0= RULE_INT
                    {
                    lv_size_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttribute8093); 

                    			newLeafNode(lv_size_10_0, grammarAccess.getAttributeAccess().getSizeINTTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"size",
                            		lv_size_10_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3806:4: (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==149) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3806:6: otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) )
                    {
                    otherlv_11=(Token)match(input,149,FOLLOW_149_in_ruleAttribute8113); 

                        	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getMultiplicityKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3810:1: ( (lv_multiplicity_12_0= ruleMultiplicity ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3811:1: (lv_multiplicity_12_0= ruleMultiplicity )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3811:1: (lv_multiplicity_12_0= ruleMultiplicity )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3812:3: lv_multiplicity_12_0= ruleMultiplicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleAttribute8134);
                    lv_multiplicity_12_0=ruleMultiplicity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplicity",
                            		lv_multiplicity_12_0, 
                            		"Multiplicity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3828:4: (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==150) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3828:6: otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,150,FOLLOW_150_in_ruleAttribute8149); 

                        	newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getDefaultValueKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3832:1: ( (lv_defaultValue_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3833:1: (lv_defaultValue_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3833:1: (lv_defaultValue_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3834:3: lv_defaultValue_14_0= RULE_STRING
                    {
                    lv_defaultValue_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute8166); 

                    			newLeafNode(lv_defaultValue_14_0, grammarAccess.getAttributeAccess().getDefaultValueSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_14_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3850:4: ( (lv_notNull_15_0= 'NotNull' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==151) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3851:1: (lv_notNull_15_0= 'NotNull' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3851:1: (lv_notNull_15_0= 'NotNull' )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3852:3: lv_notNull_15_0= 'NotNull'
                    {
                    lv_notNull_15_0=(Token)match(input,151,FOLLOW_151_in_ruleAttribute8191); 

                            newLeafNode(lv_notNull_15_0, grammarAccess.getAttributeAccess().getNotNullNotNullKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "notNull", lv_notNull_15_0, "NotNull");
                    	    

                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3865:3: ( (lv_unique_16_0= 'Unique' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==152) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3866:1: (lv_unique_16_0= 'Unique' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3866:1: (lv_unique_16_0= 'Unique' )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3867:3: lv_unique_16_0= 'Unique'
                    {
                    lv_unique_16_0=(Token)match(input,152,FOLLOW_152_in_ruleAttribute8223); 

                            newLeafNode(lv_unique_16_0, grammarAccess.getAttributeAccess().getUniqueUniqueKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "unique", lv_unique_16_0, "Unique");
                    	    

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleAttribute8249); 

                	newLeafNode(otherlv_17, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMultiplicity"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3892:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3893:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3894:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity8285);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity8295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3901:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3904:28: ( ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3905:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3905:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3906:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3906:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3907:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3907:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            int alt77=5;
            switch ( input.LA(1) ) {
            case 153:
                {
                alt77=1;
                }
                break;
            case 154:
                {
                alt77=2;
                }
                break;
            case 155:
                {
                alt77=3;
                }
                break;
            case 156:
                {
                alt77=4;
                }
                break;
            case RULE_STRING:
                {
                alt77=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3908:3: lv_value_0_1= '\"0\"'
                    {
                    lv_value_0_1=(Token)match(input,153,FOLLOW_153_in_ruleMultiplicity8339); 

                            newLeafNode(lv_value_0_1, grammarAccess.getMultiplicityAccess().getValue0Keyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3920:8: lv_value_0_2= '\"1\"'
                    {
                    lv_value_0_2=(Token)match(input,154,FOLLOW_154_in_ruleMultiplicity8368); 

                            newLeafNode(lv_value_0_2, grammarAccess.getMultiplicityAccess().getValue1Keyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3932:8: lv_value_0_3= '\"0..1\"'
                    {
                    lv_value_0_3=(Token)match(input,155,FOLLOW_155_in_ruleMultiplicity8397); 

                            newLeafNode(lv_value_0_3, grammarAccess.getMultiplicityAccess().getValue01Keyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3944:8: lv_value_0_4= '\"*\"'
                    {
                    lv_value_0_4=(Token)match(input,156,FOLLOW_156_in_ruleMultiplicity8426); 

                            newLeafNode(lv_value_0_4, grammarAccess.getMultiplicityAccess().getValueQuotationMarkAsteriskQuotationMarkKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3956:8: lv_value_0_5= RULE_STRING
                    {
                    lv_value_0_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiplicity8454); 

                    			newLeafNode(lv_value_0_5, grammarAccess.getMultiplicityAccess().getValueSTRINGTerminalRuleCall_0_4()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_5, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRulePrimaryKey"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3982:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3983:2: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3984:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey8497);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;

             current =iv_rulePrimaryKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryKey8507); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3991:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refTo_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3994:28: ( (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3995:1: (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3995:1: (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3995:3: otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,157,FOLLOW_157_in_rulePrimaryKey8544); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPrimaryKeyKeyword_0());
                
            otherlv_1=(Token)match(input,158,FOLLOW_158_in_rulePrimaryKey8556); 

                	newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4003:1: ( (lv_refTo_2_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4004:1: (lv_refTo_2_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4004:1: (lv_refTo_2_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4005:3: lv_refTo_2_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getPrimaryKeyAccess().getRefToRefAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_rulePrimaryKey8577);
            lv_refTo_2_0=ruleRefAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimaryKeyRule());
            	        }
                   		set(
                   			current, 
                   			"refTo",
                    		lv_refTo_2_0, 
                    		"RefAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,159,FOLLOW_159_in_rulePrimaryKey8589); 

                	newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleForeignKey"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4033:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4034:2: (iv_ruleForeignKey= ruleForeignKey EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4035:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_ruleForeignKey_in_entryRuleForeignKey8625);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignKey8635); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4042:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_refTo_3_0 = null;

        EObject lv_multiplicity_6_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4045:28: ( (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4046:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4046:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4046:3: otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            {
            otherlv_0=(Token)match(input,160,FOLLOW_160_in_ruleForeignKey8672); 

                	newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getForeignKeyKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4050:1: ( (otherlv_1= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4051:1: (otherlv_1= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4051:1: (otherlv_1= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4052:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForeignKeyRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeignKey8692); 

            		newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getEntityEntityCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,158,FOLLOW_158_in_ruleForeignKey8704); 

                	newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4067:1: ( (lv_refTo_3_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4068:1: (lv_refTo_3_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4068:1: (lv_refTo_3_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4069:3: lv_refTo_3_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getRefToRefAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_ruleForeignKey8725);
            lv_refTo_3_0=ruleRefAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForeignKeyRule());
            	        }
                   		set(
                   			current, 
                   			"refTo",
                    		lv_refTo_3_0, 
                    		"RefAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,159,FOLLOW_159_in_ruleForeignKey8737); 

                	newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,149,FOLLOW_149_in_ruleForeignKey8749); 

                	newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getMultiplicityKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4093:1: ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4094:1: (lv_multiplicity_6_0= ruleMultiplicity )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4094:1: (lv_multiplicity_6_0= ruleMultiplicity )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4095:3: lv_multiplicity_6_0= ruleMultiplicity
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getMultiplicityMultiplicityParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleForeignKey8770);
            lv_multiplicity_6_0=ruleMultiplicity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForeignKeyRule());
            	        }
                   		set(
                   			current, 
                   			"multiplicity",
                    		lv_multiplicity_6_0, 
                    		"Multiplicity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleRefAttribute"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4119:1: entryRuleRefAttribute returns [EObject current=null] : iv_ruleRefAttribute= ruleRefAttribute EOF ;
    public final EObject entryRuleRefAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4120:2: (iv_ruleRefAttribute= ruleRefAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4121:2: iv_ruleRefAttribute= ruleRefAttribute EOF
            {
             newCompositeNode(grammarAccess.getRefAttributeRule()); 
            pushFollow(FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute8806);
            iv_ruleRefAttribute=ruleRefAttribute();

            state._fsp--;

             current =iv_ruleRefAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefAttribute8816); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefAttribute"


    // $ANTLR start "ruleRefAttribute"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4128:1: ruleRefAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4131:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4132:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4132:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4132:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4132:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4133:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4133:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4134:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute8861); 

            		newLeafNode(otherlv_0, grammarAccess.getRefAttributeAccess().getRefAttrAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4145:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==92) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4145:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefAttribute8874); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefAttributeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4149:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4150:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4150:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4151:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute8894); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefAttributeAccess().getRefsAttributeCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefAttribute"


    // $ANTLR start "entryRuleCheck"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4170:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4171:2: (iv_ruleCheck= ruleCheck EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4172:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck8932);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck8942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4179:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_checkExpression_2_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4182:28: ( (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4183:1: (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4183:1: (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4183:3: otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,161,FOLLOW_161_in_ruleCheck8979); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4187:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4188:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4188:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4189:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheck8996); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCheckAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4205:2: ( (lv_checkExpression_2_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4206:1: (lv_checkExpression_2_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4206:1: (lv_checkExpression_2_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4207:3: lv_checkExpression_2_0= RULE_STRING
            {
            lv_checkExpression_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheck9018); 

            			newLeafNode(lv_checkExpression_2_0, grammarAccess.getCheckAccess().getCheckExpressionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"checkExpression",
                    		lv_checkExpression_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4231:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4232:2: (iv_ruleActor= ruleActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4233:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor9059);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor9069); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4240:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4243:28: ( (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4244:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4244:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4244:3: otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleActor9106); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4248:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4249:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4249:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4250:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor9123); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActor9140); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4270:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==19) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4270:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleActor9153); 

                        	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4274:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4275:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4275:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4276:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor9170); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getActorAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4292:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==37) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4292:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleActor9190); 

                        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4296:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4297:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4297:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4298:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor9207); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleActor9226); 

                	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4318:1: ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4319:1: ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4319:1: ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4320:1: (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4320:1: (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 162:
                {
                alt81=1;
                }
                break;
            case 163:
                {
                alt81=2;
                }
                break;
            case 164:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4321:3: lv_type_8_1= 'User'
                    {
                    lv_type_8_1=(Token)match(input,162,FOLLOW_162_in_ruleActor9246); 

                            newLeafNode(lv_type_8_1, grammarAccess.getActorAccess().getTypeUserKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4333:8: lv_type_8_2= 'ExternalSystem'
                    {
                    lv_type_8_2=(Token)match(input,163,FOLLOW_163_in_ruleActor9275); 

                            newLeafNode(lv_type_8_2, grammarAccess.getActorAccess().getTypeExternalSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4345:8: lv_type_8_3= 'Timer'
                    {
                    lv_type_8_3=(Token)match(input,164,FOLLOW_164_in_ruleActor9304); 

                            newLeafNode(lv_type_8_3, grammarAccess.getActorAccess().getTypeTimerKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4360:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==93) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4360:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,93,FOLLOW_93_in_ruleActor9333); 

                        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4364:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4365:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4365:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4366:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor9353); 

                    		newLeafNode(otherlv_10, grammarAccess.getActorAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4377:4: (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==118) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4377:6: otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,118,FOLLOW_118_in_ruleActor9368); 

                        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getIsAKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4381:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4382:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4382:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4383:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor9388); 

                    		newLeafNode(otherlv_12, grammarAccess.getActorAccess().getActorActorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleActor9402); 

                	newLeafNode(otherlv_13, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleUseCase"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4406:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4407:2: (iv_ruleUseCase= ruleUseCase EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4408:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase9438);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase9448); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4415:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token lv_type_8_5=null;
        Token lv_type_8_6=null;
        Token lv_type_8_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token lv_preConditions_23_0=null;
        Token otherlv_24=null;
        Token lv_postConditions_25_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        EObject lv_entities_10_0 = null;

        EObject lv_priority_12_0 = null;

        EObject lv_extensionPoints_13_0 = null;

        EObject lv_goals_15_0 = null;

        EObject lv_frs_17_0 = null;

        EObject lv_actors_21_0 = null;

        EObject lv_includes_27_0 = null;

        EObject lv_scenarios_32_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4418:28: ( (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4419:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4419:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4419:3: otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,165,FOLLOW_165_in_ruleUseCase9485); 

                	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4423:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4424:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4424:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4425:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase9502); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUseCase9519); 

                	newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4445:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==19) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4445:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleUseCase9532); 

                        	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4449:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4450:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4450:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4451:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase9549); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getUseCaseAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4467:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==37) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4467:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleUseCase9569); 

                        	newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4471:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4472:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4472:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4473:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase9586); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleUseCase9605); 

                	newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4493:1: ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4494:1: ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4494:1: ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4495:1: (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4495:1: (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' )
            int alt86=7;
            switch ( input.LA(1) ) {
            case 166:
                {
                alt86=1;
                }
                break;
            case 167:
                {
                alt86=2;
                }
                break;
            case 168:
                {
                alt86=3;
                }
                break;
            case 169:
                {
                alt86=4;
                }
                break;
            case 170:
                {
                alt86=5;
                }
                break;
            case 171:
                {
                alt86=6;
                }
                break;
            case 172:
                {
                alt86=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4496:3: lv_type_8_1= 'EntityManage'
                    {
                    lv_type_8_1=(Token)match(input,166,FOLLOW_166_in_ruleUseCase9625); 

                            newLeafNode(lv_type_8_1, grammarAccess.getUseCaseAccess().getTypeEntityManageKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4508:8: lv_type_8_2= 'EntityBrowse'
                    {
                    lv_type_8_2=(Token)match(input,167,FOLLOW_167_in_ruleUseCase9654); 

                            newLeafNode(lv_type_8_2, grammarAccess.getUseCaseAccess().getTypeEntityBrowseKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4520:8: lv_type_8_3= 'EntitySearch'
                    {
                    lv_type_8_3=(Token)match(input,168,FOLLOW_168_in_ruleUseCase9683); 

                            newLeafNode(lv_type_8_3, grammarAccess.getUseCaseAccess().getTypeEntitySearchKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4532:8: lv_type_8_4= 'EntityCreate'
                    {
                    lv_type_8_4=(Token)match(input,169,FOLLOW_169_in_ruleUseCase9712); 

                            newLeafNode(lv_type_8_4, grammarAccess.getUseCaseAccess().getTypeEntityCreateKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4544:8: lv_type_8_5= 'EntityDelete'
                    {
                    lv_type_8_5=(Token)match(input,170,FOLLOW_170_in_ruleUseCase9741); 

                            newLeafNode(lv_type_8_5, grammarAccess.getUseCaseAccess().getTypeEntityDeleteKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4556:8: lv_type_8_6= 'EntitySync'
                    {
                    lv_type_8_6=(Token)match(input,171,FOLLOW_171_in_ruleUseCase9770); 

                            newLeafNode(lv_type_8_6, grammarAccess.getUseCaseAccess().getTypeEntitySyncKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4568:8: lv_type_8_7= 'Report'
                    {
                    lv_type_8_7=(Token)match(input,172,FOLLOW_172_in_ruleUseCase9799); 

                            newLeafNode(lv_type_8_7, grammarAccess.getUseCaseAccess().getTypeReportKeyword_6_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4583:2: (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==173) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4583:4: otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) )
                    {
                    otherlv_9=(Token)match(input,173,FOLLOW_173_in_ruleUseCase9828); 

                        	newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getEntitiesKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4587:1: ( (lv_entities_10_0= ruleRefEntity ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4588:1: (lv_entities_10_0= ruleRefEntity )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4588:1: (lv_entities_10_0= ruleRefEntity )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4589:3: lv_entities_10_0= ruleRefEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getEntitiesRefEntityParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefEntity_in_ruleUseCase9849);
                    lv_entities_10_0=ruleRefEntity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"entities",
                            		lv_entities_10_0, 
                            		"RefEntity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,120,FOLLOW_120_in_ruleUseCase9863); 

                	newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4609:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4610:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4610:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4611:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getUseCaseAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleUseCase9884);
            lv_priority_12_0=rulePriority();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	        }
                   		set(
                   			current, 
                   			"priority",
                    		lv_priority_12_0, 
                    		"Priority");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4627:2: ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==187) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4628:1: (lv_extensionPoints_13_0= ruleExtensionPoint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4628:1: (lv_extensionPoints_13_0= ruleExtensionPoint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4629:3: lv_extensionPoints_13_0= ruleExtensionPoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtensionPoint_in_ruleUseCase9905);
            	    lv_extensionPoints_13_0=ruleExtensionPoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensionPoints",
            	            		lv_extensionPoints_13_0, 
            	            		"ExtensionPoint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4645:3: (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==174) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4645:5: otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )*
                    {
                    otherlv_14=(Token)match(input,174,FOLLOW_174_in_ruleUseCase9919); 

                        	newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getGoalsKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4649:1: ( (lv_goals_15_0= ruleRefGoal ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==RULE_ID) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4650:1: (lv_goals_15_0= ruleRefGoal )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4650:1: (lv_goals_15_0= ruleRefGoal )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4651:3: lv_goals_15_0= ruleRefGoal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getGoalsRefGoalParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefGoal_in_ruleUseCase9940);
                    	    lv_goals_15_0=ruleRefGoal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"goals",
                    	            		lv_goals_15_0, 
                    	            		"RefGoal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4667:5: (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==175) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4667:7: otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )*
                    {
                    otherlv_16=(Token)match(input,175,FOLLOW_175_in_ruleUseCase9956); 

                        	newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getFunctionalRequirementsKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4671:1: ( (lv_frs_17_0= ruleRefFR ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==RULE_ID) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4672:1: (lv_frs_17_0= ruleRefFR )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4672:1: (lv_frs_17_0= ruleRefFR )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4673:3: lv_frs_17_0= ruleRefFR
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getFrsRefFRParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefFR_in_ruleUseCase9977);
                    	    lv_frs_17_0=ruleRefFR();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"frs",
                    	            		lv_frs_17_0, 
                    	            		"RefFR");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,176,FOLLOW_176_in_ruleUseCase9992); 

                	newLeafNode(otherlv_18, grammarAccess.getUseCaseAccess().getActorInitiatesKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4693:1: ( (otherlv_19= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4694:1: (otherlv_19= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4694:1: (otherlv_19= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4695:3: otherlv_19= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
            otherlv_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase10012); 

            		newLeafNode(otherlv_19, grammarAccess.getUseCaseAccess().getActorInitiatesActorCrossReference_14_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4706:2: (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==177) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4706:4: otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) )
                    {
                    otherlv_20=(Token)match(input,177,FOLLOW_177_in_ruleUseCase10025); 

                        	newLeafNode(otherlv_20, grammarAccess.getUseCaseAccess().getActorParticipatesKeyword_15_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4710:1: ( (lv_actors_21_0= ruleRefActor ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4711:1: (lv_actors_21_0= ruleRefActor )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4711:1: (lv_actors_21_0= ruleRefActor )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4712:3: lv_actors_21_0= ruleRefActor
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getActorsRefActorParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefActor_in_ruleUseCase10046);
                    lv_actors_21_0=ruleRefActor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"actors",
                            		lv_actors_21_0, 
                            		"RefActor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4728:4: (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==178) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4728:6: otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) )
                    {
                    otherlv_22=(Token)match(input,178,FOLLOW_178_in_ruleUseCase10061); 

                        	newLeafNode(otherlv_22, grammarAccess.getUseCaseAccess().getPreConditionsKeyword_16_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4732:1: ( (lv_preConditions_23_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4733:1: (lv_preConditions_23_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4733:1: (lv_preConditions_23_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4734:3: lv_preConditions_23_0= RULE_STRING
                    {
                    lv_preConditions_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase10078); 

                    			newLeafNode(lv_preConditions_23_0, grammarAccess.getUseCaseAccess().getPreConditionsSTRINGTerminalRuleCall_16_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"preConditions",
                            		lv_preConditions_23_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4750:4: (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==179) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4750:6: otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) )
                    {
                    otherlv_24=(Token)match(input,179,FOLLOW_179_in_ruleUseCase10098); 

                        	newLeafNode(otherlv_24, grammarAccess.getUseCaseAccess().getPostConditionsKeyword_17_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4754:1: ( (lv_postConditions_25_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4755:1: (lv_postConditions_25_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4755:1: (lv_postConditions_25_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4756:3: lv_postConditions_25_0= RULE_STRING
                    {
                    lv_postConditions_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase10115); 

                    			newLeafNode(lv_postConditions_25_0, grammarAccess.getUseCaseAccess().getPostConditionsSTRINGTerminalRuleCall_17_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"postConditions",
                            		lv_postConditions_25_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4772:4: (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==180) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4772:6: otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )*
                    {
                    otherlv_26=(Token)match(input,180,FOLLOW_180_in_ruleUseCase10135); 

                        	newLeafNode(otherlv_26, grammarAccess.getUseCaseAccess().getIncludeKeyword_18_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4776:1: ( (lv_includes_27_0= ruleRefUC ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==RULE_ID) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4777:1: (lv_includes_27_0= ruleRefUC )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4777:1: (lv_includes_27_0= ruleRefUC )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4778:3: lv_includes_27_0= ruleRefUC
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getIncludesRefUCParserRuleCall_18_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefUC_in_ruleUseCase10156);
                    	    lv_includes_27_0=ruleRefUC();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"includes",
                    	            		lv_includes_27_0, 
                    	            		"RefUC");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4794:5: (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==181) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4794:7: otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) )
                    {
                    otherlv_28=(Token)match(input,181,FOLLOW_181_in_ruleUseCase10172); 

                        	newLeafNode(otherlv_28, grammarAccess.getUseCaseAccess().getExtendKeyword_19_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4798:1: ( (otherlv_29= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4799:1: (otherlv_29= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4799:1: (otherlv_29= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4800:3: otherlv_29= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase10192); 

                    		newLeafNode(otherlv_29, grammarAccess.getUseCaseAccess().getExtendsUseCaseCrossReference_19_1_0()); 
                    	

                    }


                    }

                    otherlv_30=(Token)match(input,182,FOLLOW_182_in_ruleUseCase10204); 

                        	newLeafNode(otherlv_30, grammarAccess.getUseCaseAccess().getOnKeyword_19_2());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4815:1: ( (otherlv_31= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4816:1: (otherlv_31= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4816:1: (otherlv_31= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4817:3: otherlv_31= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase10224); 

                    		newLeafNode(otherlv_31, grammarAccess.getUseCaseAccess().getExtPointExtensionPointCrossReference_19_3_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4828:4: ( (lv_scenarios_32_0= ruleScenario ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==188) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4829:1: (lv_scenarios_32_0= ruleScenario )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4829:1: (lv_scenarios_32_0= ruleScenario )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4830:3: lv_scenarios_32_0= ruleScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getScenariosScenarioParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScenario_in_ruleUseCase10247);
            	    lv_scenarios_32_0=ruleScenario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"scenarios",
            	            		lv_scenarios_32_0, 
            	            		"Scenario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            otherlv_33=(Token)match(input,13,FOLLOW_13_in_ruleUseCase10260); 

                	newLeafNode(otherlv_33, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_21());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleRefEntity"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4858:1: entryRuleRefEntity returns [EObject current=null] : iv_ruleRefEntity= ruleRefEntity EOF ;
    public final EObject entryRuleRefEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4859:2: (iv_ruleRefEntity= ruleRefEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4860:2: iv_ruleRefEntity= ruleRefEntity EOF
            {
             newCompositeNode(grammarAccess.getRefEntityRule()); 
            pushFollow(FOLLOW_ruleRefEntity_in_entryRuleRefEntity10296);
            iv_ruleRefEntity=ruleRefEntity();

            state._fsp--;

             current =iv_ruleRefEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefEntity10306); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefEntity"


    // $ANTLR start "ruleRefEntity"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4867:1: ruleRefEntity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* ) ;
    public final EObject ruleRefEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_refType_6_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4870:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4871:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4871:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4871:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4871:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4872:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4872:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4873:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefEntityRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEntity10351); 

            		newLeafNode(otherlv_0, grammarAccess.getRefEntityAccess().getRefEntityEntityCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,183,FOLLOW_183_in_ruleRefEntity10363); 

                	newLeafNode(otherlv_1, grammarAccess.getRefEntityAccess().getAsKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4888:1: ( (lv_type_2_0= ruleEntityType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4889:1: (lv_type_2_0= ruleEntityType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4889:1: (lv_type_2_0= ruleEntityType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4890:3: lv_type_2_0= ruleEntityType
            {
             
            	        newCompositeNode(grammarAccess.getRefEntityAccess().getTypeEntityTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEntityType_in_ruleRefEntity10384);
            lv_type_2_0=ruleEntityType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRefEntityRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"EntityType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4906:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==92) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4906:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) )
            	    {
            	    otherlv_3=(Token)match(input,92,FOLLOW_92_in_ruleRefEntity10397); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRefEntityAccess().getCommaKeyword_3_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4910:1: ( (otherlv_4= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4911:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4911:1: (otherlv_4= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4912:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefEntityRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEntity10417); 

            	    		newLeafNode(otherlv_4, grammarAccess.getRefEntityAccess().getRefsEntityCrossReference_3_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_5=(Token)match(input,183,FOLLOW_183_in_ruleRefEntity10429); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRefEntityAccess().getAsKeyword_3_2());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4927:1: ( (lv_refType_6_0= ruleEntityType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4928:1: (lv_refType_6_0= ruleEntityType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4928:1: (lv_refType_6_0= ruleEntityType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4929:3: lv_refType_6_0= ruleEntityType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefEntityAccess().getRefTypeEntityTypeParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityType_in_ruleRefEntity10450);
            	    lv_refType_6_0=ruleEntityType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"refType",
            	            		lv_refType_6_0, 
            	            		"EntityType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefEntity"


    // $ANTLR start "entryRuleEntityType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4953:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4954:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4955:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType10488);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType10498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4962:1: ruleEntityType returns [EObject current=null] : ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4965:28: ( ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4966:1: ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4966:1: ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4967:1: ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4967:1: ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4968:1: (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4968:1: (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' )
            int alt101=3;
            switch ( input.LA(1) ) {
            case 184:
                {
                alt101=1;
                }
                break;
            case 185:
                {
                alt101=2;
                }
                break;
            case 186:
                {
                alt101=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4969:3: lv_type_0_1= 'Master'
                    {
                    lv_type_0_1=(Token)match(input,184,FOLLOW_184_in_ruleEntityType10542); 

                            newLeafNode(lv_type_0_1, grammarAccess.getEntityTypeAccess().getTypeMasterKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4981:8: lv_type_0_2= 'Detail'
                    {
                    lv_type_0_2=(Token)match(input,185,FOLLOW_185_in_ruleEntityType10571); 

                            newLeafNode(lv_type_0_2, grammarAccess.getEntityTypeAccess().getTypeDetailKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4993:8: lv_type_0_3= 'Reference'
                    {
                    lv_type_0_3=(Token)match(input,186,FOLLOW_186_in_ruleEntityType10600); 

                            newLeafNode(lv_type_0_3, grammarAccess.getEntityTypeAccess().getTypeReferenceKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleRefFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5016:1: entryRuleRefFR returns [EObject current=null] : iv_ruleRefFR= ruleRefFR EOF ;
    public final EObject entryRuleRefFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5017:2: (iv_ruleRefFR= ruleRefFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5018:2: iv_ruleRefFR= ruleRefFR EOF
            {
             newCompositeNode(grammarAccess.getRefFRRule()); 
            pushFollow(FOLLOW_ruleRefFR_in_entryRuleRefFR10651);
            iv_ruleRefFR=ruleRefFR();

            state._fsp--;

             current =iv_ruleRefFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefFR10661); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefFR"


    // $ANTLR start "ruleRefFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5025:1: ruleRefFR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5028:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5029:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5029:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5029:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5029:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5030:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5030:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5031:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefFRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR10706); 

            		newLeafNode(otherlv_0, grammarAccess.getRefFRAccess().getRefFRFRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5042:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==92) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5042:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefFR10719); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefFRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5046:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5047:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5047:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5048:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefFRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR10739); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefFRAccess().getRefsFRCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefFR"


    // $ANTLR start "entryRuleRefActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5067:1: entryRuleRefActor returns [EObject current=null] : iv_ruleRefActor= ruleRefActor EOF ;
    public final EObject entryRuleRefActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5068:2: (iv_ruleRefActor= ruleRefActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5069:2: iv_ruleRefActor= ruleRefActor EOF
            {
             newCompositeNode(grammarAccess.getRefActorRule()); 
            pushFollow(FOLLOW_ruleRefActor_in_entryRuleRefActor10777);
            iv_ruleRefActor=ruleRefActor();

            state._fsp--;

             current =iv_ruleRefActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefActor10787); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefActor"


    // $ANTLR start "ruleRefActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5076:1: ruleRefActor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5079:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5080:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5080:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5080:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5080:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5081:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5081:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5082:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefActorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefActor10832); 

            		newLeafNode(otherlv_0, grammarAccess.getRefActorAccess().getRefActorActorCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5093:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==92) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5093:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefActor10845); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefActorAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5097:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5098:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5098:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5099:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefActorRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefActor10865); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefActorAccess().getRefsActorCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefActor"


    // $ANTLR start "entryRuleRefUC"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5118:1: entryRuleRefUC returns [EObject current=null] : iv_ruleRefUC= ruleRefUC EOF ;
    public final EObject entryRuleRefUC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefUC = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5119:2: (iv_ruleRefUC= ruleRefUC EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5120:2: iv_ruleRefUC= ruleRefUC EOF
            {
             newCompositeNode(grammarAccess.getRefUCRule()); 
            pushFollow(FOLLOW_ruleRefUC_in_entryRuleRefUC10903);
            iv_ruleRefUC=ruleRefUC();

            state._fsp--;

             current =iv_ruleRefUC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefUC10913); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefUC"


    // $ANTLR start "ruleRefUC"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5127:1: ruleRefUC returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefUC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5130:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5131:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5131:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5131:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5131:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5132:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5132:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5133:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefUCRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC10958); 

            		newLeafNode(otherlv_0, grammarAccess.getRefUCAccess().getRefUCUseCaseCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5144:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==92) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5144:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefUC10971); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefUCAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5148:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5149:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5149:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5150:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefUCRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC10991); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefUCAccess().getRefsUseCaseCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefUC"


    // $ANTLR start "entryRuleExtensionPoint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5169:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5170:2: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5171:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
            {
             newCompositeNode(grammarAccess.getExtensionPointRule()); 
            pushFollow(FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint11029);
            iv_ruleExtensionPoint=ruleExtensionPoint();

            state._fsp--;

             current =iv_ruleExtensionPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionPoint11039); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtensionPoint"


    // $ANTLR start "ruleExtensionPoint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5178:1: ruleExtensionPoint returns [EObject current=null] : (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5181:28: ( (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5182:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5182:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5182:3: otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,187,FOLLOW_187_in_ruleExtensionPoint11076); 

                	newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getExtensionPointKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5186:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5187:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5187:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5188:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtensionPoint11093); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExtensionPointAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtensionPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5204:2: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==37) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5204:4: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleExtensionPoint11111); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtensionPointAccess().getDescriptionKeyword_2_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5208:1: ( (lv_description_3_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5209:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5209:1: (lv_description_3_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5210:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExtensionPoint11128); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getExtensionPointAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtensionPointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtensionPoint"


    // $ANTLR start "entryRuleScenario"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5234:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5235:2: (iv_ruleScenario= ruleScenario EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5236:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario11171);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario11181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5243:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token otherlv_9=null;
        Token lv_mode_10_1=null;
        Token lv_mode_10_2=null;
        Token otherlv_12=null;
        EObject lv_steps_11_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5246:28: ( (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5247:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5247:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5247:3: otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,188,FOLLOW_188_in_ruleScenario11218); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5251:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5252:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5252:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5253:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScenario11235); 

            			newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleScenario11252); 

                	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5273:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==19) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5273:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleScenario11265); 

                        	newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5277:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5278:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5278:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5279:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario11282); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getScenarioAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5295:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==37) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5295:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleScenario11302); 

                        	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5299:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5300:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5300:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5301:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario11319); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getScenarioAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleScenario11338); 

                	newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5321:1: ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5322:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5322:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5323:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5323:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            int alt108=3;
            switch ( input.LA(1) ) {
            case 189:
                {
                alt108=1;
                }
                break;
            case 190:
                {
                alt108=2;
                }
                break;
            case 191:
                {
                alt108=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5324:3: lv_type_8_1= 'Main'
                    {
                    lv_type_8_1=(Token)match(input,189,FOLLOW_189_in_ruleScenario11358); 

                            newLeafNode(lv_type_8_1, grammarAccess.getScenarioAccess().getTypeMainKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5336:8: lv_type_8_2= 'Alternative'
                    {
                    lv_type_8_2=(Token)match(input,190,FOLLOW_190_in_ruleScenario11387); 

                            newLeafNode(lv_type_8_2, grammarAccess.getScenarioAccess().getTypeAlternativeKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5348:8: lv_type_8_3= 'Exception'
                    {
                    lv_type_8_3=(Token)match(input,191,FOLLOW_191_in_ruleScenario11416); 

                            newLeafNode(lv_type_8_3, grammarAccess.getScenarioAccess().getTypeExceptionKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_9=(Token)match(input,192,FOLLOW_192_in_ruleScenario11444); 

                	newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getExecutionModeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5367:1: ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5368:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5368:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5369:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5369:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==193) ) {
                alt109=1;
            }
            else if ( (LA109_0==194) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5370:3: lv_mode_10_1= 'Sequential'
                    {
                    lv_mode_10_1=(Token)match(input,193,FOLLOW_193_in_ruleScenario11464); 

                            newLeafNode(lv_mode_10_1, grammarAccess.getScenarioAccess().getModeSequentialKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "mode", lv_mode_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5382:8: lv_mode_10_2= 'Parallel'
                    {
                    lv_mode_10_2=(Token)match(input,194,FOLLOW_194_in_ruleScenario11493); 

                            newLeafNode(lv_mode_10_2, grammarAccess.getScenarioAccess().getModeParallelKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "mode", lv_mode_10_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5397:2: ( (lv_steps_11_0= ruleStep ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==195) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5398:1: (lv_steps_11_0= ruleStep )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5398:1: (lv_steps_11_0= ruleStep )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5399:3: lv_steps_11_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenario11530);
            	    lv_steps_11_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_11_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleScenario11543); 

                	newLeafNode(otherlv_12, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStep"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5427:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5428:2: (iv_ruleStep= ruleStep EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5429:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep11579);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep11589); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5436:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token lv_type_8_5=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_preConditions_12_0=null;
        Token otherlv_13=null;
        Token lv_postConditions_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5439:28: ( (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5440:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5440:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5440:3: otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,195,FOLLOW_195_in_ruleStep11626); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5444:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5445:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5445:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5446:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep11643); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStepAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStepRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStep11660); 

                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5466:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==19) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5466:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStep11673); 

                        	newLeafNode(otherlv_3, grammarAccess.getStepAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5470:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5471:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5471:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5472:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11690); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getStepAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5488:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==37) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5488:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleStep11710); 

                        	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5492:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5493:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5493:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5494:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11727); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getStepAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStep11746); 

                	newLeafNode(otherlv_7, grammarAccess.getStepAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5514:1: ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5515:1: ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5515:1: ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5516:1: (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5516:1: (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' )
            int alt113=5;
            switch ( input.LA(1) ) {
            case 196:
                {
                alt113=1;
                }
                break;
            case 197:
                {
                alt113=2;
                }
                break;
            case 198:
                {
                alt113=3;
                }
                break;
            case 199:
                {
                alt113=4;
                }
                break;
            case 27:
                {
                alt113=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5517:3: lv_type_8_1= 'ActorPrepareData'
                    {
                    lv_type_8_1=(Token)match(input,196,FOLLOW_196_in_ruleStep11766); 

                            newLeafNode(lv_type_8_1, grammarAccess.getStepAccess().getTypeActorPrepareDataKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5529:8: lv_type_8_2= 'ActorCallSystem'
                    {
                    lv_type_8_2=(Token)match(input,197,FOLLOW_197_in_ruleStep11795); 

                            newLeafNode(lv_type_8_2, grammarAccess.getStepAccess().getTypeActorCallSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5541:8: lv_type_8_3= 'SystemExecutes'
                    {
                    lv_type_8_3=(Token)match(input,198,FOLLOW_198_in_ruleStep11824); 

                            newLeafNode(lv_type_8_3, grammarAccess.getStepAccess().getTypeSystemExecutesKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5553:8: lv_type_8_4= 'SystemReturnResult'
                    {
                    lv_type_8_4=(Token)match(input,199,FOLLOW_199_in_ruleStep11853); 

                            newLeafNode(lv_type_8_4, grammarAccess.getStepAccess().getTypeSystemReturnResultKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5565:8: lv_type_8_5= 'Other'
                    {
                    lv_type_8_5=(Token)match(input,27,FOLLOW_27_in_ruleStep11882); 

                            newLeafNode(lv_type_8_5, grammarAccess.getStepAccess().getTypeOtherKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5580:2: (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==96) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5580:4: otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,96,FOLLOW_96_in_ruleStep11911); 

                        	newLeafNode(otherlv_9, grammarAccess.getStepAccess().getActorKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5584:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5585:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5585:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5586:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep11931); 

                    		newLeafNode(otherlv_10, grammarAccess.getStepAccess().getActorActorCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5597:4: (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==178) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5597:6: otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,178,FOLLOW_178_in_ruleStep11946); 

                        	newLeafNode(otherlv_11, grammarAccess.getStepAccess().getPreConditionsKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5601:1: ( (lv_preConditions_12_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5602:1: (lv_preConditions_12_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5602:1: (lv_preConditions_12_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5603:3: lv_preConditions_12_0= RULE_STRING
                    {
                    lv_preConditions_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11963); 

                    			newLeafNode(lv_preConditions_12_0, grammarAccess.getStepAccess().getPreConditionsSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"preConditions",
                            		lv_preConditions_12_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5619:4: (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==179) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5619:6: otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,179,FOLLOW_179_in_ruleStep11983); 

                        	newLeafNode(otherlv_13, grammarAccess.getStepAccess().getPostConditionsKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5623:1: ( (lv_postConditions_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5624:1: (lv_postConditions_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5624:1: (lv_postConditions_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5625:3: lv_postConditions_14_0= RULE_STRING
                    {
                    lv_postConditions_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep12000); 

                    			newLeafNode(lv_postConditions_14_0, grammarAccess.getStepAccess().getPostConditionsSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"postConditions",
                            		lv_postConditions_14_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5641:4: (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==200) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5641:6: otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,200,FOLLOW_200_in_ruleStep12020); 

                        	newLeafNode(otherlv_15, grammarAccess.getStepAccess().getNextStepKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5645:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5646:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5646:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5647:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep12040); 

                    		newLeafNode(otherlv_16, grammarAccess.getStepAccess().getNextStepCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleStep12054); 

                	newLeafNode(otherlv_17, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5670:1: entryRuleFR returns [EObject current=null] : iv_ruleFR= ruleFR EOF ;
    public final EObject entryRuleFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5671:2: (iv_ruleFR= ruleFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5672:2: iv_ruleFR= ruleFR EOF
            {
             newCompositeNode(grammarAccess.getFRRule()); 
            pushFollow(FOLLOW_ruleFR_in_entryRuleFR12090);
            iv_ruleFR=ruleFR();

            state._fsp--;

             current =iv_ruleFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFR12100); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFR"


    // $ANTLR start "ruleFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5679:1: ruleFR returns [EObject current=null] : (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_priority_12_0 = null;

        EObject lv_progress_16_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5682:28: ( (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5683:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5683:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5683:3: otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,201,FOLLOW_201_in_ruleFR12137); 

                	newLeafNode(otherlv_0, grammarAccess.getFRAccess().getFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5687:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5688:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5688:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5689:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR12154); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFRAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFR12171); 

                	newLeafNode(otherlv_2, grammarAccess.getFRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5709:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==19) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5709:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFR12184); 

                        	newLeafNode(otherlv_3, grammarAccess.getFRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5713:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5714:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5714:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5715:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR12201); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getFRAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5731:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==37) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5731:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleFR12221); 

                        	newLeafNode(otherlv_5, grammarAccess.getFRAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5735:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5736:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5736:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5737:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR12238); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getFRAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleFR12257); 

                	newLeafNode(otherlv_7, grammarAccess.getFRAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5757:1: ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5758:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5758:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5759:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5759:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            int alt120=3;
            switch ( input.LA(1) ) {
            case 202:
                {
                alt120=1;
                }
                break;
            case 203:
                {
                alt120=2;
                }
                break;
            case 204:
                {
                alt120=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5760:3: lv_type_8_1= 'Functional'
                    {
                    lv_type_8_1=(Token)match(input,202,FOLLOW_202_in_ruleFR12277); 

                            newLeafNode(lv_type_8_1, grammarAccess.getFRAccess().getTypeFunctionalKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5772:8: lv_type_8_2= 'Behavioral'
                    {
                    lv_type_8_2=(Token)match(input,203,FOLLOW_203_in_ruleFR12306); 

                            newLeafNode(lv_type_8_2, grammarAccess.getFRAccess().getTypeBehavioralKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5784:8: lv_type_8_3= 'Data'
                    {
                    lv_type_8_3=(Token)match(input,204,FOLLOW_204_in_ruleFR12335); 

                            newLeafNode(lv_type_8_3, grammarAccess.getFRAccess().getTypeDataKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5799:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==93) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5799:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,93,FOLLOW_93_in_ruleFR12364); 

                        	newLeafNode(otherlv_9, grammarAccess.getFRAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5803:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5804:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5804:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5805:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR12384); 

                    		newLeafNode(otherlv_10, grammarAccess.getFRAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,120,FOLLOW_120_in_ruleFR12398); 

                	newLeafNode(otherlv_11, grammarAccess.getFRAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5820:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5821:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5821:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5822:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getFRAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleFR12419);
            lv_priority_12_0=rulePriority();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFRRule());
            	        }
                   		set(
                   			current, 
                   			"priority",
                    		lv_priority_12_0, 
                    		"Priority");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5838:2: (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==72) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5838:4: otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,72,FOLLOW_72_in_ruleFR12432); 

                        	newLeafNode(otherlv_13, grammarAccess.getFRAccess().getPartOfKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5842:1: ( (otherlv_14= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5843:1: (otherlv_14= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5843:1: (otherlv_14= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5844:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR12452); 

                    		newLeafNode(otherlv_14, grammarAccess.getFRAccess().getPartOfFRCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5855:4: (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==35) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5855:6: otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) )
                    {
                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleFR12467); 

                        	newLeafNode(otherlv_15, grammarAccess.getFRAccess().getProjectProgressKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5859:1: ( (lv_progress_16_0= ruleProjectProgress ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5860:1: (lv_progress_16_0= ruleProjectProgress )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5860:1: (lv_progress_16_0= ruleProjectProgress )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5861:3: lv_progress_16_0= ruleProjectProgress
                    {
                     
                    	        newCompositeNode(grammarAccess.getFRAccess().getProgressProjectProgressParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectProgress_in_ruleFR12488);
                    lv_progress_16_0=ruleProjectProgress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFRRule());
                    	        }
                           		set(
                           			current, 
                           			"progress",
                            		lv_progress_16_0, 
                            		"ProjectProgress");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleFR12502); 

                	newLeafNode(otherlv_17, grammarAccess.getFRAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFR"


    // $ANTLR start "entryRuleQR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5889:1: entryRuleQR returns [EObject current=null] : iv_ruleQR= ruleQR EOF ;
    public final EObject entryRuleQR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5890:2: (iv_ruleQR= ruleQR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5891:2: iv_ruleQR= ruleQR EOF
            {
             newCompositeNode(grammarAccess.getQRRule()); 
            pushFollow(FOLLOW_ruleQR_in_entryRuleQR12538);
            iv_ruleQR=ruleQR();

            state._fsp--;

             current =iv_ruleQR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQR12548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQR"


    // $ANTLR start "ruleQR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5898:1: ruleQR returns [EObject current=null] : (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}' ) ;
    public final EObject ruleQR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token lv_type_8_5=null;
        Token lv_type_8_6=null;
        Token lv_type_8_7=null;
        Token lv_type_8_8=null;
        Token otherlv_9=null;
        Token lv_subType_10_1=null;
        Token lv_subType_10_2=null;
        Token lv_subType_10_3=null;
        Token lv_subType_10_4=null;
        Token lv_subType_10_5=null;
        Token otherlv_11=null;
        Token lv_metric_12_1=null;
        Token lv_metric_12_2=null;
        Token lv_metric_12_3=null;
        Token lv_metric_12_4=null;
        Token lv_metric_12_5=null;
        Token lv_metric_12_6=null;
        Token otherlv_13=null;
        Token lv_value_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_priority_18_0 = null;

        EObject lv_progress_22_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5901:28: ( (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5902:1: (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5902:1: (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5902:3: otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,205,FOLLOW_205_in_ruleQR12585); 

                	newLeafNode(otherlv_0, grammarAccess.getQRAccess().getQualityRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5906:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5907:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5907:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5908:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR12602); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQRAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQR12619); 

                	newLeafNode(otherlv_2, grammarAccess.getQRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5928:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==19) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5928:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleQR12632); 

                        	newLeafNode(otherlv_3, grammarAccess.getQRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5932:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5933:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5933:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5934:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQR12649); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getQRAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5950:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==37) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5950:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleQR12669); 

                        	newLeafNode(otherlv_5, grammarAccess.getQRAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5954:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5955:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5955:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5956:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQR12686); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getQRAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleQR12705); 

                	newLeafNode(otherlv_7, grammarAccess.getQRAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5976:1: ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5977:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5977:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5978:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5978:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            int alt126=8;
            switch ( input.LA(1) ) {
            case 206:
                {
                alt126=1;
                }
                break;
            case 207:
                {
                alt126=2;
                }
                break;
            case 208:
                {
                alt126=3;
                }
                break;
            case 209:
                {
                alt126=4;
                }
                break;
            case 210:
                {
                alt126=5;
                }
                break;
            case 211:
                {
                alt126=6;
                }
                break;
            case 212:
                {
                alt126=7;
                }
                break;
            case 213:
                {
                alt126=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5979:3: lv_type_8_1= 'Security'
                    {
                    lv_type_8_1=(Token)match(input,206,FOLLOW_206_in_ruleQR12725); 

                            newLeafNode(lv_type_8_1, grammarAccess.getQRAccess().getTypeSecurityKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5991:8: lv_type_8_2= 'Performance'
                    {
                    lv_type_8_2=(Token)match(input,207,FOLLOW_207_in_ruleQR12754); 

                            newLeafNode(lv_type_8_2, grammarAccess.getQRAccess().getTypePerformanceKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6003:8: lv_type_8_3= 'Usability'
                    {
                    lv_type_8_3=(Token)match(input,208,FOLLOW_208_in_ruleQR12783); 

                            newLeafNode(lv_type_8_3, grammarAccess.getQRAccess().getTypeUsabilityKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6015:8: lv_type_8_4= 'Appearance'
                    {
                    lv_type_8_4=(Token)match(input,209,FOLLOW_209_in_ruleQR12812); 

                            newLeafNode(lv_type_8_4, grammarAccess.getQRAccess().getTypeAppearanceKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6027:8: lv_type_8_5= 'Operational'
                    {
                    lv_type_8_5=(Token)match(input,210,FOLLOW_210_in_ruleQR12841); 

                            newLeafNode(lv_type_8_5, grammarAccess.getQRAccess().getTypeOperationalKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6039:8: lv_type_8_6= 'Maintenance'
                    {
                    lv_type_8_6=(Token)match(input,211,FOLLOW_211_in_ruleQR12870); 

                            newLeafNode(lv_type_8_6, grammarAccess.getQRAccess().getTypeMaintenanceKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6051:8: lv_type_8_7= 'Cultural'
                    {
                    lv_type_8_7=(Token)match(input,212,FOLLOW_212_in_ruleQR12899); 

                            newLeafNode(lv_type_8_7, grammarAccess.getQRAccess().getTypeCulturalKeyword_6_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6063:8: lv_type_8_8= 'Legal'
                    {
                    lv_type_8_8=(Token)match(input,213,FOLLOW_213_in_ruleQR12928); 

                            newLeafNode(lv_type_8_8, grammarAccess.getQRAccess().getTypeLegalKeyword_6_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_8, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6078:2: (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==214) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6078:4: otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    {
                    otherlv_9=(Token)match(input,214,FOLLOW_214_in_ruleQR12957); 

                        	newLeafNode(otherlv_9, grammarAccess.getQRAccess().getSubTypeKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6082:1: ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6083:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6083:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6084:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6084:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    int alt127=5;
                    switch ( input.LA(1) ) {
                    case 215:
                        {
                        alt127=1;
                        }
                        break;
                    case 216:
                        {
                        alt127=2;
                        }
                        break;
                    case 217:
                        {
                        alt127=3;
                        }
                        break;
                    case 218:
                        {
                        alt127=4;
                        }
                        break;
                    case 219:
                        {
                        alt127=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 0, input);

                        throw nvae;
                    }

                    switch (alt127) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6085:3: lv_subType_10_1= 'Security.Privacy'
                            {
                            lv_subType_10_1=(Token)match(input,215,FOLLOW_215_in_ruleQR12977); 

                                    newLeafNode(lv_subType_10_1, grammarAccess.getQRAccess().getSubTypeSecurityPrivacyKeyword_7_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6097:8: lv_subType_10_2= 'Security.Integrity'
                            {
                            lv_subType_10_2=(Token)match(input,216,FOLLOW_216_in_ruleQR13006); 

                                    newLeafNode(lv_subType_10_2, grammarAccess.getQRAccess().getSubTypeSecurityIntegrityKeyword_7_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6109:8: lv_subType_10_3= 'Usability.EaseOfUse'
                            {
                            lv_subType_10_3=(Token)match(input,217,FOLLOW_217_in_ruleQR13035); 

                                    newLeafNode(lv_subType_10_3, grammarAccess.getQRAccess().getSubTypeUsabilityEaseOfUseKeyword_7_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6121:8: lv_subType_10_4= 'Usability.EaseOfLearn'
                            {
                            lv_subType_10_4=(Token)match(input,218,FOLLOW_218_in_ruleQR13064); 

                                    newLeafNode(lv_subType_10_4, grammarAccess.getQRAccess().getSubTypeUsabilityEaseOfLearnKeyword_7_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6133:8: lv_subType_10_5= 'Usability.Accessibility'
                            {
                            lv_subType_10_5=(Token)match(input,219,FOLLOW_219_in_ruleQR13093); 

                                    newLeafNode(lv_subType_10_5, grammarAccess.getQRAccess().getSubTypeUsabilityAccessibilityKeyword_7_1_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_5, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,220,FOLLOW_220_in_ruleQR13123); 

                	newLeafNode(otherlv_11, grammarAccess.getQRAccess().getMetricKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6152:1: ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6153:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6153:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6154:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6154:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            int alt129=6;
            switch ( input.LA(1) ) {
            case 221:
                {
                alt129=1;
                }
                break;
            case 222:
                {
                alt129=2;
                }
                break;
            case 223:
                {
                alt129=3;
                }
                break;
            case 224:
                {
                alt129=4;
                }
                break;
            case 225:
                {
                alt129=5;
                }
                break;
            case 27:
                {
                alt129=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6155:3: lv_metric_12_1= 'Hours'
                    {
                    lv_metric_12_1=(Token)match(input,221,FOLLOW_221_in_ruleQR13143); 

                            newLeafNode(lv_metric_12_1, grammarAccess.getQRAccess().getMetricHoursKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6167:8: lv_metric_12_2= 'Mins'
                    {
                    lv_metric_12_2=(Token)match(input,222,FOLLOW_222_in_ruleQR13172); 

                            newLeafNode(lv_metric_12_2, grammarAccess.getQRAccess().getMetricMinsKeyword_9_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6179:8: lv_metric_12_3= 'Secs'
                    {
                    lv_metric_12_3=(Token)match(input,223,FOLLOW_223_in_ruleQR13201); 

                            newLeafNode(lv_metric_12_3, grammarAccess.getQRAccess().getMetricSecsKeyword_9_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6191:8: lv_metric_12_4= 'mSecs'
                    {
                    lv_metric_12_4=(Token)match(input,224,FOLLOW_224_in_ruleQR13230); 

                            newLeafNode(lv_metric_12_4, grammarAccess.getQRAccess().getMetricMSecsKeyword_9_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6203:8: lv_metric_12_5= 'Tasks'
                    {
                    lv_metric_12_5=(Token)match(input,225,FOLLOW_225_in_ruleQR13259); 

                            newLeafNode(lv_metric_12_5, grammarAccess.getQRAccess().getMetricTasksKeyword_9_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6215:8: lv_metric_12_6= 'Other'
                    {
                    lv_metric_12_6=(Token)match(input,27,FOLLOW_27_in_ruleQR13288); 

                            newLeafNode(lv_metric_12_6, grammarAccess.getQRAccess().getMetricOtherKeyword_9_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_6, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_13=(Token)match(input,226,FOLLOW_226_in_ruleQR13316); 

                	newLeafNode(otherlv_13, grammarAccess.getQRAccess().getValueKeyword_10());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6234:1: ( (lv_value_14_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6235:1: (lv_value_14_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6235:1: (lv_value_14_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6236:3: lv_value_14_0= RULE_INT
            {
            lv_value_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQR13333); 

            			newLeafNode(lv_value_14_0, grammarAccess.getQRAccess().getValueINTTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_14_0, 
                    		"INT");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6252:2: (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==93) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6252:4: otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,93,FOLLOW_93_in_ruleQR13351); 

                        	newLeafNode(otherlv_15, grammarAccess.getQRAccess().getStakeholderKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6256:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6257:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6257:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6258:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR13371); 

                    		newLeafNode(otherlv_16, grammarAccess.getQRAccess().getStakeholderStakeholderCrossReference_12_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,120,FOLLOW_120_in_ruleQR13385); 

                	newLeafNode(otherlv_17, grammarAccess.getQRAccess().getPriorityKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6273:1: ( (lv_priority_18_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6274:1: (lv_priority_18_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6274:1: (lv_priority_18_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6275:3: lv_priority_18_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getQRAccess().getPriorityPriorityParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleQR13406);
            lv_priority_18_0=rulePriority();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQRRule());
            	        }
                   		set(
                   			current, 
                   			"priority",
                    		lv_priority_18_0, 
                    		"Priority");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6291:2: (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==72) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6291:4: otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) )
                    {
                    otherlv_19=(Token)match(input,72,FOLLOW_72_in_ruleQR13419); 

                        	newLeafNode(otherlv_19, grammarAccess.getQRAccess().getPartOfKeyword_15_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6295:1: ( (otherlv_20= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6296:1: (otherlv_20= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6296:1: (otherlv_20= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6297:3: otherlv_20= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                            
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR13439); 

                    		newLeafNode(otherlv_20, grammarAccess.getQRAccess().getPartOfQRCrossReference_15_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6308:4: (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==35) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6308:6: otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) )
                    {
                    otherlv_21=(Token)match(input,35,FOLLOW_35_in_ruleQR13454); 

                        	newLeafNode(otherlv_21, grammarAccess.getQRAccess().getProjectProgressKeyword_16_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6312:1: ( (lv_progress_22_0= ruleProjectProgress ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6313:1: (lv_progress_22_0= ruleProjectProgress )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6313:1: (lv_progress_22_0= ruleProjectProgress )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6314:3: lv_progress_22_0= ruleProjectProgress
                    {
                     
                    	        newCompositeNode(grammarAccess.getQRAccess().getProgressProjectProgressParserRuleCall_16_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectProgress_in_ruleQR13475);
                    lv_progress_22_0=ruleProjectProgress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQRRule());
                    	        }
                           		set(
                           			current, 
                           			"progress",
                            		lv_progress_22_0, 
                            		"ProjectProgress");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleQR13489); 

                	newLeafNode(otherlv_23, grammarAccess.getQRAccess().getRightCurlyBracketKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQR"


    // $ANTLR start "entryRuleConstraint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6342:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6343:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6344:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint13525);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint13535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6351:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token lv_type_8_5=null;
        Token lv_type_8_6=null;
        Token lv_type_8_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_priority_12_0 = null;

        EObject lv_progress_16_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6354:28: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6355:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6355:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6355:3: otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,227,FOLLOW_227_in_ruleConstraint13572); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6359:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6360:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6360:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6361:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint13589); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConstraint13606); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6381:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==19) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6381:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleConstraint13619); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6385:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6386:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6386:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6387:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint13636); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getConstraintAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nameAlias",
                            		lv_nameAlias_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6403:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==37) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6403:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleConstraint13656); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6407:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6408:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6408:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6409:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint13673); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleConstraint13692); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6429:1: ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6430:1: ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6430:1: ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6431:1: (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6431:1: (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' )
            int alt135=7;
            switch ( input.LA(1) ) {
            case 212:
                {
                alt135=1;
                }
                break;
            case 213:
                {
                alt135=2;
                }
                break;
            case 228:
                {
                alt135=3;
                }
                break;
            case 229:
                {
                alt135=4;
                }
                break;
            case 18:
                {
                alt135=5;
                }
                break;
            case 230:
                {
                alt135=6;
                }
                break;
            case 27:
                {
                alt135=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6432:3: lv_type_8_1= 'Cultural'
                    {
                    lv_type_8_1=(Token)match(input,212,FOLLOW_212_in_ruleConstraint13712); 

                            newLeafNode(lv_type_8_1, grammarAccess.getConstraintAccess().getTypeCulturalKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6444:8: lv_type_8_2= 'Legal'
                    {
                    lv_type_8_2=(Token)match(input,213,FOLLOW_213_in_ruleConstraint13741); 

                            newLeafNode(lv_type_8_2, grammarAccess.getConstraintAccess().getTypeLegalKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6456:8: lv_type_8_3= 'Organizational'
                    {
                    lv_type_8_3=(Token)match(input,228,FOLLOW_228_in_ruleConstraint13770); 

                            newLeafNode(lv_type_8_3, grammarAccess.getConstraintAccess().getTypeOrganizationalKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6468:8: lv_type_8_4= 'Physical'
                    {
                    lv_type_8_4=(Token)match(input,229,FOLLOW_229_in_ruleConstraint13799); 

                            newLeafNode(lv_type_8_4, grammarAccess.getConstraintAccess().getTypePhysicalKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6480:8: lv_type_8_5= 'Project'
                    {
                    lv_type_8_5=(Token)match(input,18,FOLLOW_18_in_ruleConstraint13828); 

                            newLeafNode(lv_type_8_5, grammarAccess.getConstraintAccess().getTypeProjectKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6492:8: lv_type_8_6= 'Technological'
                    {
                    lv_type_8_6=(Token)match(input,230,FOLLOW_230_in_ruleConstraint13857); 

                            newLeafNode(lv_type_8_6, grammarAccess.getConstraintAccess().getTypeTechnologicalKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6504:8: lv_type_8_7= 'Other'
                    {
                    lv_type_8_7=(Token)match(input,27,FOLLOW_27_in_ruleConstraint13886); 

                            newLeafNode(lv_type_8_7, grammarAccess.getConstraintAccess().getTypeOtherKeyword_6_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6519:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==93) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6519:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,93,FOLLOW_93_in_ruleConstraint13915); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6523:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6524:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6524:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6525:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint13935); 

                    		newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,120,FOLLOW_120_in_ruleConstraint13949); 

                	newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6540:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6541:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6541:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6542:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleConstraint13970);
            lv_priority_12_0=rulePriority();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"priority",
                    		lv_priority_12_0, 
                    		"Priority");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6558:2: (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==72) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6558:4: otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,72,FOLLOW_72_in_ruleConstraint13983); 

                        	newLeafNode(otherlv_13, grammarAccess.getConstraintAccess().getPartOfKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6562:1: ( (otherlv_14= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6563:1: (otherlv_14= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6563:1: (otherlv_14= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6564:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint14003); 

                    		newLeafNode(otherlv_14, grammarAccess.getConstraintAccess().getPartOfConstraintCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6575:4: (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==35) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6575:6: otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) )
                    {
                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleConstraint14018); 

                        	newLeafNode(otherlv_15, grammarAccess.getConstraintAccess().getProjectProgressKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6579:1: ( (lv_progress_16_0= ruleProjectProgress ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6580:1: (lv_progress_16_0= ruleProjectProgress )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6580:1: (lv_progress_16_0= ruleProjectProgress )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6581:3: lv_progress_16_0= ruleProjectProgress
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintAccess().getProgressProjectProgressParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectProgress_in_ruleConstraint14039);
                    lv_progress_16_0=ruleProjectProgress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"progress",
                            		lv_progress_16_0, 
                            		"ProjectProgress");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleConstraint14053); 

                	newLeafNode(otherlv_17, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRequirementRelation"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6611:1: entryRuleRequirementRelation returns [EObject current=null] : iv_ruleRequirementRelation= ruleRequirementRelation EOF ;
    public final EObject entryRuleRequirementRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementRelation = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6612:2: (iv_ruleRequirementRelation= ruleRequirementRelation EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6613:2: iv_ruleRequirementRelation= ruleRequirementRelation EOF
            {
             newCompositeNode(grammarAccess.getRequirementRelationRule()); 
            pushFollow(FOLLOW_ruleRequirementRelation_in_entryRuleRequirementRelation14091);
            iv_ruleRequirementRelation=ruleRequirementRelation();

            state._fsp--;

             current =iv_ruleRequirementRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementRelation14101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirementRelation"


    // $ANTLR start "ruleRequirementRelation"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6620:1: ruleRequirementRelation returns [EObject current=null] : (otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleRequirementRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token lv_type_8_5=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6623:28: ( (otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6624:1: (otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6624:1: (otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6624:3: otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,231,FOLLOW_231_in_ruleRequirementRelation14138); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementRelationAccess().getRequirementRelationKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6628:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6629:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6629:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6630:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementRelation14155); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequirementRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRequirementRelation14172); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementRelationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleRequirementRelation14184); 

                	newLeafNode(otherlv_3, grammarAccess.getRequirementRelationAccess().getSourceKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6654:1: ( (otherlv_4= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6655:1: (otherlv_4= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6655:1: (otherlv_4= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6656:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementRelationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementRelation14204); 

            		newLeafNode(otherlv_4, grammarAccess.getRequirementRelationAccess().getSourceRequirementCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleRequirementRelation14216); 

                	newLeafNode(otherlv_5, grammarAccess.getRequirementRelationAccess().getTargetKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6671:1: ( (otherlv_6= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6672:1: (otherlv_6= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6672:1: (otherlv_6= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6673:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementRelation14236); 

            		newLeafNode(otherlv_6, grammarAccess.getRequirementRelationAccess().getTargetRequirementCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleRequirementRelation14248); 

                	newLeafNode(otherlv_7, grammarAccess.getRequirementRelationAccess().getTypeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6688:1: ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6689:1: ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6689:1: ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6690:1: (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6690:1: (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' )
            int alt139=5;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt139=1;
                }
                break;
            case 125:
                {
                alt139=2;
                }
                break;
            case 126:
                {
                alt139=3;
                }
                break;
            case 127:
                {
                alt139=4;
                }
                break;
            case 128:
                {
                alt139=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6691:3: lv_type_8_1= 'Requires'
                    {
                    lv_type_8_1=(Token)match(input,124,FOLLOW_124_in_ruleRequirementRelation14268); 

                            newLeafNode(lv_type_8_1, grammarAccess.getRequirementRelationAccess().getTypeRequiresKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6703:8: lv_type_8_2= 'Supports'
                    {
                    lv_type_8_2=(Token)match(input,125,FOLLOW_125_in_ruleRequirementRelation14297); 

                            newLeafNode(lv_type_8_2, grammarAccess.getRequirementRelationAccess().getTypeSupportsKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6715:8: lv_type_8_3= 'Obstructs'
                    {
                    lv_type_8_3=(Token)match(input,126,FOLLOW_126_in_ruleRequirementRelation14326); 

                            newLeafNode(lv_type_8_3, grammarAccess.getRequirementRelationAccess().getTypeObstructsKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6727:8: lv_type_8_4= 'Conflicts'
                    {
                    lv_type_8_4=(Token)match(input,127,FOLLOW_127_in_ruleRequirementRelation14355); 

                            newLeafNode(lv_type_8_4, grammarAccess.getRequirementRelationAccess().getTypeConflictsKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6739:8: lv_type_8_5= 'Identical'
                    {
                    lv_type_8_5=(Token)match(input,128,FOLLOW_128_in_ruleRequirementRelation14384); 

                            newLeafNode(lv_type_8_5, grammarAccess.getRequirementRelationAccess().getTypeIdenticalKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6754:2: (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==37) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6754:4: otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleRequirementRelation14413); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequirementRelationAccess().getDescriptionKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6758:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6759:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6759:1: (lv_description_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6760:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirementRelation14430); 

                    			newLeafNode(lv_description_10_0, grammarAccess.getRequirementRelationAccess().getDescriptionSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRequirementRelation14449); 

                	newLeafNode(otherlv_11, grammarAccess.getRequirementRelationAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageProject_in_ruleModel132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageSystem_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageProject_in_entryRulePackageProject194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageProject204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackageProject241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageProject262 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackageProject274 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleImport_in_rulePackageProject295 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleProject_in_rulePackageProject317 = new BitSet(new long[]{0x0000000000006000L,0x0880000020080200L});
    public static final BitSet FOLLOW_ruleGlossaryTerm_in_rulePackageProject338 = new BitSet(new long[]{0x0000000000006000L,0x0880000020080200L});
    public static final BitSet FOLLOW_ruleStakeholder_in_rulePackageProject360 = new BitSet(new long[]{0x0000000000006000L,0x0880000020000200L});
    public static final BitSet FOLLOW_ruleGoal_in_rulePackageProject382 = new BitSet(new long[]{0x0000000000006000L,0x0880000000000200L});
    public static final BitSet FOLLOW_ruleGoalRelation_in_rulePackageProject404 = new BitSet(new long[]{0x0000000000006000L,0x0800000000000200L});
    public static final BitSet FOLLOW_rulePackageSystem_in_rulePackageProject426 = new BitSet(new long[]{0x0000000000006000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleSystemRelation_in_rulePackageProject448 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_13_in_rulePackageProject461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageSystem_in_entryRulePackageSystem497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageSystem507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePackageSystem544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageSystem565 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackageSystem577 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleImport_in_rulePackageSystem598 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSystem_in_rulePackageSystem620 = new BitSet(new long[]{0x0000000000002000L,0x0000000140000000L,0x0000002000000000L,0x0000008800002200L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePackageSystem641 = new BitSet(new long[]{0x0000000000002000L,0x0000000140000000L,0x0000002000000000L,0x0000008800002200L});
    public static final BitSet FOLLOW_ruleActor_in_rulePackageSystem663 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x0000002000000000L,0x0000008800002200L});
    public static final BitSet FOLLOW_ruleUseCase_in_rulePackageSystem685 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000002000000000L,0x0000008800002200L});
    public static final BitSet FOLLOW_ruleFR_in_rulePackageSystem707 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000008800002200L});
    public static final BitSet FOLLOW_ruleQR_in_rulePackageSystem729 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000008800002000L});
    public static final BitSet FOLLOW_ruleConstraint_in_rulePackageSystem751 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000008800000000L});
    public static final BitSet FOLLOW_ruleRequirementRelation_in_rulePackageSystem773 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_13_in_rulePackageSystem786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName874 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName908 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1014 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProject1226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject1243 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject1260 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleProject1273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject1290 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleProject1309 = new BitSet(new long[]{0x000000000FE00000L});
    public static final BitSet FOLLOW_21_in_ruleProject1329 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22_in_ruleProject1358 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23_in_ruleProject1387 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24_in_ruleProject1416 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25_in_ruleProject1445 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26_in_ruleProject1474 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27_in_ruleProject1503 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleProject1531 = new BitSet(new long[]{0x00000007E8000000L});
    public static final BitSet FOLLOW_29_in_ruleProject1551 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_30_in_ruleProject1580 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_31_in_ruleProject1609 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_32_in_ruleProject1638 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_33_in_ruleProject1667 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_34_in_ruleProject1696 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_27_in_ruleProject1725 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_rulePlannedSchedule_in_ruleProject1762 = new BitSet(new long[]{0x0080021800000000L});
    public static final BitSet FOLLOW_ruleActualSchedule_in_ruleProject1784 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_ruleOrganizations_in_ruleProject1806 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleProject1820 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_ruleProject1841 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleProject1855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject1872 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleProject1889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject1906 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProject1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlannedSchedule_in_entryRulePlannedSchedule1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlannedSchedule1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePlannedSchedule2006 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePlannedSchedule2018 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePlannedSchedule2030 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_rulePlannedSchedule2051 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulePlannedSchedule2063 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_rulePlannedSchedule2084 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePlannedSchedule2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualSchedule_in_entryRuleActualSchedule2132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualSchedule2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleActualSchedule2179 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActualSchedule2191 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleActualSchedule2203 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleActualSchedule2224 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_40_in_ruleActualSchedule2237 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleActualSchedule2258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActualSchedule2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate2308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate2360 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDate2377 = new BitSet(new long[]{0x007FF80000000000L});
    public static final BitSet FOLLOW_ruleMonth_in_ruleDate2398 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDate2410 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_entryRuleMonth2468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonth2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMonth2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMonth2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMonth2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMonth2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMonth2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMonth2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMonth2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMonth2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMonth2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMonth2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMonth2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMonth2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganizations_in_entryRuleOrganizations2892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganizations2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOrganizations2939 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOrganizations2951 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleOrganizations2963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizations2980 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleOrganizations2997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizations3014 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleOrganizations3031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizations3048 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOrganizations3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_entryRuleProjectProgress3101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectProgress3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleProjectProgress3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleProjectProgress3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleProjectProgress3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleProjectProgress3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleProjectProgress3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleProjectProgress3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleProjectProgress3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem3380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSystem3427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem3444 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem3461 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleSystem3474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem3491 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleSystem3511 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem3528 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSystem3547 = new BitSet(new long[]{0x0000000008000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleSystem3567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_67_in_ruleSystem3596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_68_in_ruleSystem3625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_27_in_ruleSystem3654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSystem3682 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleSystem3702 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_71_in_ruleSystem3731 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleSystem3760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem3780 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemRelation_in_entryRuleSystemRelation3830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemRelation3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSystemRelation3877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemRelation3894 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystemRelation3911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleSystemRelation3923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemRelation3943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleSystemRelation3955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemRelation3975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleSystemRelation3987 = new BitSet(new long[]{0x0000000008000000L,0x000000000003E000L});
    public static final BitSet FOLLOW_77_in_ruleSystemRelation4007 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_78_in_ruleSystemRelation4036 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_79_in_ruleSystemRelation4065 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_80_in_ruleSystemRelation4094 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_81_in_ruleSystemRelation4123 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27_in_ruleSystemRelation4152 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSystemRelation4180 = new BitSet(new long[]{0x0000000000000000L,0x00000000000400C0L});
    public static final BitSet FOLLOW_70_in_ruleSystemRelation4200 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_71_in_ruleSystemRelation4229 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_82_in_ruleSystemRelation4258 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_37_in_ruleSystemRelation4287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystemRelation4304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystemRelation4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm4359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossaryTerm4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleGlossaryTerm4406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlossaryTerm4423 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGlossaryTerm4440 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleGlossaryTerm4453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4470 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleGlossaryTerm4490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4507 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGlossaryTerm4526 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleRefTermType_in_ruleGlossaryTerm4547 = new BitSet(new long[]{0x0000000000002000L,0x000000000C300000L});
    public static final BitSet FOLLOW_84_in_ruleGlossaryTerm4560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4577 = new BitSet(new long[]{0x0000000000002000L,0x000000000C200000L});
    public static final BitSet FOLLOW_85_in_ruleGlossaryTerm4597 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_86_in_ruleGlossaryTerm4617 = new BitSet(new long[]{0x0000000000002000L,0x000000000C000000L});
    public static final BitSet FOLLOW_87_in_ruleGlossaryTerm4646 = new BitSet(new long[]{0x0000000000002000L,0x000000000C000000L});
    public static final BitSet FOLLOW_88_in_ruleGlossaryTerm4675 = new BitSet(new long[]{0x0000000000002000L,0x000000000C000000L});
    public static final BitSet FOLLOW_89_in_ruleGlossaryTerm4704 = new BitSet(new long[]{0x0000000000002000L,0x000000000C000000L});
    public static final BitSet FOLLOW_90_in_ruleGlossaryTerm4735 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4752 = new BitSet(new long[]{0x0000000000002000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleGlossaryTerm4772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4789 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGlossaryTerm4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTermType_in_entryRuleRefTermType4844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTermType4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType4900 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefTermType4913 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType4934 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleTermType_in_entryRuleTermType4972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermType4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTermType5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTermType5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTermType5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTermType5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder5164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleStakeholder5211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder5228 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStakeholder5245 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleStakeholder5258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder5275 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleStakeholder5295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder5312 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStakeholder5331 = new BitSet(new long[]{0x0000000000000000L,0x0000003E00000000L});
    public static final BitSet FOLLOW_97_in_ruleStakeholder5351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_98_in_ruleStakeholder5380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_99_in_ruleStakeholder5409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_100_in_ruleStakeholder5438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_101_in_ruleStakeholder5467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleStakeholder5495 = new BitSet(new long[]{0x0000000000000000L,0x003FFFC000000000L});
    public static final BitSet FOLLOW_102_in_ruleStakeholder5515 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_103_in_ruleStakeholder5544 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_104_in_ruleStakeholder5573 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_105_in_ruleStakeholder5602 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_106_in_ruleStakeholder5631 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_107_in_ruleStakeholder5660 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_108_in_ruleStakeholder5689 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_109_in_ruleStakeholder5718 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_110_in_ruleStakeholder5747 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_111_in_ruleStakeholder5776 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_112_in_ruleStakeholder5805 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_113_in_ruleStakeholder5834 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_114_in_ruleStakeholder5863 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_115_in_ruleStakeholder5892 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_116_in_ruleStakeholder5921 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_117_in_ruleStakeholder5950 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_118_in_ruleStakeholder5979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder5999 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleStakeholder6014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder6034 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStakeholder6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal6084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleGoal6131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal6148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoal6165 = new BitSet(new long[]{0x0000002000080000L,0x0000000020000000L});
    public static final BitSet FOLLOW_19_in_ruleGoal6178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal6195 = new BitSet(new long[]{0x0000002000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_37_in_ruleGoal6215 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal6232 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleGoal6251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal6271 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleGoal6283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleGoal6304 = new BitSet(new long[]{0x0000000800002000L,0x0600000000000000L});
    public static final BitSet FOLLOW_35_in_ruleGoal6317 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_ruleGoal6338 = new BitSet(new long[]{0x0000000000002000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_ruleGoal6353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal6373 = new BitSet(new long[]{0x0000000000002000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleGoal6388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal6408 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGoal6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalRelation_in_entryRuleGoalRelation6458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalRelation6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleGoalRelation6505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoalRelation6522 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoalRelation6539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGoalRelation6551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoalRelation6571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleGoalRelation6583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoalRelation6603 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGoalRelation6615 = new BitSet(new long[]{0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_124_in_ruleGoalRelation6635 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_125_in_ruleGoalRelation6664 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_126_in_ruleGoalRelation6693 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_127_in_ruleGoalRelation6722 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_128_in_ruleGoalRelation6751 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_37_in_ruleGoalRelation6780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoalRelation6797 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGoalRelation6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriority_in_entryRulePriority6852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePriority6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_rulePriority6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_rulePriority6935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_rulePriority6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_rulePriority6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGoal_in_entryRuleRefGoal7044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGoal7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal7099 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefGoal7112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal7132 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity7170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleEntity7217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity7234 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity7251 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_19_in_ruleEntity7264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity7281 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_37_in_ruleEntity7301 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity7318 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_20_in_ruleEntity7338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_133_in_ruleEntity7358 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_134_in_ruleEntity7387 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity7426 = new BitSet(new long[]{0x0000002000182000L,0x0000000000000000L,0x0000000320000080L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_ruleEntity7448 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleForeignKey_in_ruleEntity7470 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleEntity7492 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_13_in_ruleEntity7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute7541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute7551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleAttribute7588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute7605 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute7622 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute7635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute7652 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleAttribute7672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute7689 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute7708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000FFF00L});
    public static final BitSet FOLLOW_136_in_ruleAttribute7728 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_137_in_ruleAttribute7757 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_138_in_ruleAttribute7786 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_139_in_ruleAttribute7815 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_140_in_ruleAttribute7844 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_141_in_ruleAttribute7873 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_142_in_ruleAttribute7902 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_143_in_ruleAttribute7931 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_144_in_ruleAttribute7960 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_145_in_ruleAttribute7989 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_146_in_ruleAttribute8018 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_147_in_ruleAttribute8047 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_148_in_ruleAttribute8076 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttribute8093 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001E00000L});
    public static final BitSet FOLLOW_149_in_ruleAttribute8113 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAttribute8134 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_150_in_ruleAttribute8149 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute8166 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_151_in_ruleAttribute8191 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_ruleAttribute8223 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity8285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleMultiplicity8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleMultiplicity8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleMultiplicity8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleMultiplicity8426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiplicity8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey8497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryKey8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_rulePrimaryKey8544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_rulePrimaryKey8556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_rulePrimaryKey8577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_rulePrimaryKey8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_entryRuleForeignKey8625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignKey8635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleForeignKey8672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeignKey8692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_ruleForeignKey8704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_ruleForeignKey8725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_ruleForeignKey8737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_ruleForeignKey8749 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleForeignKey8770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute8806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefAttribute8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute8861 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefAttribute8874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute8894 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck8932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck8942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_ruleCheck8979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheck8996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheck9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor9059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleActor9106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor9123 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor9140 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleActor9153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor9170 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleActor9190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor9207 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor9226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_162_in_ruleActor9246 = new BitSet(new long[]{0x0000000000002000L,0x0040000020000000L});
    public static final BitSet FOLLOW_163_in_ruleActor9275 = new BitSet(new long[]{0x0000000000002000L,0x0040000020000000L});
    public static final BitSet FOLLOW_164_in_ruleActor9304 = new BitSet(new long[]{0x0000000000002000L,0x0040000020000000L});
    public static final BitSet FOLLOW_93_in_ruleActor9333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor9353 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleActor9368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor9388 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActor9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase9438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_ruleUseCase9485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase9502 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase9519 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleUseCase9532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase9549 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleUseCase9569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase9586 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUseCase9605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00001FC000000000L});
    public static final BitSet FOLLOW_166_in_ruleUseCase9625 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_167_in_ruleUseCase9654 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_168_in_ruleUseCase9683 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_169_in_ruleUseCase9712 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_170_in_ruleUseCase9741 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_171_in_ruleUseCase9770 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_172_in_ruleUseCase9799 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_173_in_ruleUseCase9828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefEntity_in_ruleUseCase9849 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleUseCase9863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleUseCase9884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0801C00000000000L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_ruleUseCase9905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0801C00000000000L});
    public static final BitSet FOLLOW_174_in_ruleUseCase9919 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleUseCase9940 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_175_in_ruleUseCase9956 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleUseCase9977 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_ruleUseCase9992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase10012 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x103E000000000000L});
    public static final BitSet FOLLOW_177_in_ruleUseCase10025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefActor_in_ruleUseCase10046 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x103C000000000000L});
    public static final BitSet FOLLOW_178_in_ruleUseCase10061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase10078 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1038000000000000L});
    public static final BitSet FOLLOW_179_in_ruleUseCase10098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase10115 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1030000000000000L});
    public static final BitSet FOLLOW_180_in_ruleUseCase10135 = new BitSet(new long[]{0x0000000000002010L,0x0000000000000000L,0x1020000000000000L});
    public static final BitSet FOLLOW_ruleRefUC_in_ruleUseCase10156 = new BitSet(new long[]{0x0000000000002010L,0x0000000000000000L,0x1020000000000000L});
    public static final BitSet FOLLOW_181_in_ruleUseCase10172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase10192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_ruleUseCase10204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase10224 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleUseCase10247 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_13_in_ruleUseCase10260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefEntity_in_entryRuleRefEntity10296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefEntity10306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEntity10351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_ruleRefEntity10363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleRefEntity10384 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefEntity10397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEntity10417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_ruleRefEntity10429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleRefEntity10450 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType10488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType10498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_ruleEntityType10542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_ruleEntityType10571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_ruleEntityType10600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefFR_in_entryRuleRefFR10651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefFR10661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR10706 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefFR10719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR10739 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleRefActor_in_entryRuleRefActor10777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefActor10787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefActor10832 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefActor10845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefActor10865 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleRefUC_in_entryRuleRefUC10903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefUC10913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC10958 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefUC10971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC10991 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint11029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionPoint11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_ruleExtensionPoint11076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionPoint11093 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleExtensionPoint11111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExtensionPoint11128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario11171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_ruleScenario11218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScenario11235 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleScenario11252 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleScenario11265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario11282 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleScenario11302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario11319 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScenario11338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xE000000000000000L});
    public static final BitSet FOLLOW_189_in_ruleScenario11358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_190_in_ruleScenario11387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_191_in_ruleScenario11416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_ruleScenario11444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_193_in_ruleScenario11464 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_194_in_ruleScenario11493 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenario11530 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_13_in_ruleScenario11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep11579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_ruleStep11626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep11643 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStep11660 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleStep11673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11690 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleStep11710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11727 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStep11746 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_196_in_ruleStep11766 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_197_in_ruleStep11795 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_198_in_ruleStep11824 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_199_in_ruleStep11853 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_27_in_ruleStep11882 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_96_in_ruleStep11911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep11931 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_178_in_ruleStep11946 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11963 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_179_in_ruleStep11983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep12000 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_ruleStep12020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep12040 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStep12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFR_in_entryRuleFR12090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFR12100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_ruleFR12137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR12154 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFR12171 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleFR12184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR12201 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleFR12221 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR12238 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFR12257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_202_in_ruleFR12277 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_203_in_ruleFR12306 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_204_in_ruleFR12335 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_93_in_ruleFR12364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR12384 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleFR12398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleFR12419 = new BitSet(new long[]{0x0000000800002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleFR12432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR12452 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_35_in_ruleFR12467 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_ruleFR12488 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFR12502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQR_in_entryRuleQR12538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQR12548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_ruleQR12585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR12602 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQR12619 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleQR12632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQR12649 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleQR12669 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQR12686 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQR12705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000003FC000L});
    public static final BitSet FOLLOW_206_in_ruleQR12725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_207_in_ruleQR12754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_208_in_ruleQR12783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_209_in_ruleQR12812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_210_in_ruleQR12841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_211_in_ruleQR12870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_212_in_ruleQR12899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_213_in_ruleQR12928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_214_in_ruleQR12957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000F800000L});
    public static final BitSet FOLLOW_215_in_ruleQR12977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_216_in_ruleQR13006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_217_in_ruleQR13035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_218_in_ruleQR13064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_219_in_ruleQR13093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_220_in_ruleQR13123 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000000L,0x00000003E0000000L});
    public static final BitSet FOLLOW_221_in_ruleQR13143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_222_in_ruleQR13172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_223_in_ruleQR13201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_224_in_ruleQR13230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_225_in_ruleQR13259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_27_in_ruleQR13288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_226_in_ruleQR13316 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQR13333 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_93_in_ruleQR13351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR13371 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleQR13385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleQR13406 = new BitSet(new long[]{0x0000000800002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleQR13419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR13439 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_35_in_ruleQR13454 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_ruleQR13475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQR13489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint13525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint13535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_ruleConstraint13572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint13589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstraint13606 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint13619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint13636 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleConstraint13656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint13673 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint13692 = new BitSet(new long[]{0x0000000008040000L,0x0000000000000000L,0x0000000000000000L,0x0000007000300000L});
    public static final BitSet FOLLOW_212_in_ruleConstraint13712 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_213_in_ruleConstraint13741 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_228_in_ruleConstraint13770 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_229_in_ruleConstraint13799 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint13828 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_230_in_ruleConstraint13857 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_27_in_ruleConstraint13886 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_93_in_ruleConstraint13915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint13935 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleConstraint13949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleConstraint13970 = new BitSet(new long[]{0x0000000800002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleConstraint13983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint14003 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_35_in_ruleConstraint14018 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_ruleConstraint14039 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstraint14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementRelation_in_entryRuleRequirementRelation14091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementRelation14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_ruleRequirementRelation14138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementRelation14155 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRequirementRelation14172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleRequirementRelation14184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementRelation14204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleRequirementRelation14216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementRelation14236 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRequirementRelation14248 = new BitSet(new long[]{0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_124_in_ruleRequirementRelation14268 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_125_in_ruleRequirementRelation14297 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_126_in_ruleRequirementRelation14326 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_127_in_ruleRequirementRelation14355 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_128_in_ruleRequirementRelation14384 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_37_in_ruleRequirementRelation14413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirementRelation14430 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirementRelation14449 = new BitSet(new long[]{0x0000000000000002L});

}