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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package-Project'", "'{'", "'}'", "'Package-System'", "'.'", "'.*'", "'import'", "'Project'", "'Name'", "'Type'", "'SystemDevelopment'", "'SystemDesign'", "'SystemDeployment'", "'SystemMaintenance'", "'Training'", "'Research'", "'Other'", "'ApplicationDomain'", "'PublicSector'", "'Education'", "'Health'", "'Telecoms'", "'Energy&Utilities'", "'Finance&Banks'", "'ProjectProgress'", "'Summary'", "'Description'", "'PlannedSchedule {'", "'Start'", "'End'", "'ActualSchedule {'", "'-'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'", "'Organizations {'", "'Customer'", "'Supplier'", "'Partners'", "'Not-Plan'", "'Plan'", "'On-Design'", "'On-Develop'", "'On-Test'", "'On-Deploy'", "'Concluded'", "'System'", "'Sub-System'", "'Reusable-System'", "'Scope'", "'In'", "'Out'", "'PartOf'", "'SystemRelation'", "'Source'", "'Target'", "'Category'", "'Import'", "'Export'", "'Import-Export'", "'Sync'", "'Interact'", "'In-Out'", "'GlossaryTerm'", "'Acronym'", "'POS'", "'Adjective'", "'Adverb'", "'Noun'", "'Verb'", "'Synonym'", "'Hypernym'", "','", "'Stakeholder'", "'Entity'", "'Architectural'", "'Actor'", "'Group.Organization'", "'Group.BusinessUnit'", "'Group.Team'", "'Individual.Person'", "'Individual.ExternalSystem'", "'Business'", "'Business.Customer'", "'Business.Customer.Sponsor'", "'Business.Customer.Champion'", "'Business.User.Direct'", "'Business.User.Indirect'", "'Business.Advisor.DomainExpert'", "'Business.Advisor.Trainer'", "'Business.Advisor.RegulatorAgent'", "'Business.System'", "'Technical'", "'Technical.BusinessAnalyst'", "'Technical.Requirements.Engineer'", "'Technical.Software.Architect'", "'Technical.Software.Designer'", "'Technical.Software.Tester'", "'IsA'", "'Goal'", "'Priority'", "'PartOf-And'", "'PartOf-Or'", "'GoalRelation'", "'Requires'", "'Supports'", "'Obstructs'", "'Conflicts'", "'Identical'", "'Must'", "'Should'", "'Could'", "'Won\\'t'", "'Principal'", "'Secondary'", "'Attribute'", "'Boolean'", "'Integer'", "'Decimal'", "'Currency'", "'Date'", "'Time'", "'Datetime'", "'Enumeration'", "'Text'", "'Regex'", "'URL'", "'Image'", "'Size'", "'Multiplicity'", "'DefaultValue'", "'NotNull'", "'Unique'", "'\"0\"'", "'\"1\"'", "'\"0..1\"'", "'\"*\"'", "'PrimaryKey'", "'('", "')'", "'ForeignKey'", "'Check'", "'User'", "'ExternalSystem'", "'Timer'", "'UseCase'", "'EntityManage'", "'EntityBrowse'", "'EntitySearch'", "'EntityCreate'", "'EntityDelete'", "'EntitySync'", "'Report'", "'Entities'", "'Goals'", "'FunctionalRequirements'", "'ActorInitiates'", "'ActorParticipates'", "'Pre-Conditions'", "'Post-Conditions'", "'Include'", "'Extend'", "'on'", "'as'", "'Master'", "'Detail'", "'Reference'", "'ExtensionPoint'", "'Scenario'", "'Main'", "'Alternative'", "'Exception'", "'ExecutionMode'", "'Sequential'", "'Parallel'", "'Step'", "'ActorPrepareData'", "'ActorCallSystem'", "'SystemExecutes'", "'SystemReturnResult'", "'NextStep'", "'FunctionalRequirement'", "'Functional'", "'Behavioral'", "'Data'", "'QualityRequirement'", "'Security'", "'Performance'", "'Usability'", "'Appearance'", "'Operational'", "'Maintenance'", "'Cultural'", "'Legal'", "'Sub-Type'", "'Security.Privacy'", "'Security.Integrity'", "'Usability.EaseOfUse'", "'Usability.EaseOfLearn'", "'Usability.Accessibility'", "'Metric'", "'Hours'", "'Mins'", "'Secs'", "'mSecs'", "'Tasks'", "'Value'", "'Constraint'", "'Organizational'", "'Physical'", "'Technological'", "'RequirementRelation'"
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1027:1: rulePlannedSchedule returns [EObject current=null] : (otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' ) ;
    public final EObject rulePlannedSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_start_2_0 = null;

        EObject lv_end_4_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1030:28: ( (otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1031:1: (otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1031:1: (otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1031:3: otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulePlannedSchedule2006); 

                	newLeafNode(otherlv_0, grammarAccess.getPlannedScheduleAccess().getPlannedScheduleKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulePlannedSchedule2018); 

                	newLeafNode(otherlv_1, grammarAccess.getPlannedScheduleAccess().getStartKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1039:1: ( (lv_start_2_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1040:1: (lv_start_2_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1040:1: (lv_start_2_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1041:3: lv_start_2_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPlannedScheduleAccess().getStartDateParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_rulePlannedSchedule2039);
            lv_start_2_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlannedScheduleRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_2_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_rulePlannedSchedule2051); 

                	newLeafNode(otherlv_3, grammarAccess.getPlannedScheduleAccess().getEndKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1061:1: ( (lv_end_4_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1062:1: (lv_end_4_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1062:1: (lv_end_4_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1063:3: lv_end_4_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPlannedScheduleAccess().getEndDateParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_rulePlannedSchedule2072);
            lv_end_4_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlannedScheduleRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_4_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_rulePlannedSchedule2084); 

                	newLeafNode(otherlv_5, grammarAccess.getPlannedScheduleAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1091:1: entryRuleActualSchedule returns [EObject current=null] : iv_ruleActualSchedule= ruleActualSchedule EOF ;
    public final EObject entryRuleActualSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualSchedule = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1092:2: (iv_ruleActualSchedule= ruleActualSchedule EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1093:2: iv_ruleActualSchedule= ruleActualSchedule EOF
            {
             newCompositeNode(grammarAccess.getActualScheduleRule()); 
            pushFollow(FOLLOW_ruleActualSchedule_in_entryRuleActualSchedule2120);
            iv_ruleActualSchedule=ruleActualSchedule();

            state._fsp--;

             current =iv_ruleActualSchedule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualSchedule2130); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1100:1: ruleActualSchedule returns [EObject current=null] : (otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' ) ;
    public final EObject ruleActualSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_start_2_0 = null;

        EObject lv_end_4_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1103:28: ( (otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1104:1: (otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1104:1: (otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1104:3: otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleActualSchedule2167); 

                	newLeafNode(otherlv_0, grammarAccess.getActualScheduleAccess().getActualScheduleKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleActualSchedule2179); 

                	newLeafNode(otherlv_1, grammarAccess.getActualScheduleAccess().getStartKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1112:1: ( (lv_start_2_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1113:1: (lv_start_2_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1113:1: (lv_start_2_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1114:3: lv_start_2_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getActualScheduleAccess().getStartDateParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_ruleActualSchedule2200);
            lv_start_2_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActualScheduleRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_2_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleActualSchedule2212); 

                	newLeafNode(otherlv_3, grammarAccess.getActualScheduleAccess().getEndKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1134:1: ( (lv_end_4_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1135:1: (lv_end_4_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1135:1: (lv_end_4_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1136:3: lv_end_4_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getActualScheduleAccess().getEndDateParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_ruleActualSchedule2233);
            lv_end_4_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActualScheduleRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_4_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleActualSchedule2245); 

                	newLeafNode(otherlv_5, grammarAccess.getActualScheduleAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1164:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1165:2: (iv_ruleDate= ruleDate EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1166:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate2281);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate2291); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1173:1: ruleDate returns [EObject current=null] : ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_day_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        EObject lv_month_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1176:28: ( ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1177:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1177:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1177:2: ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1177:2: ( (lv_day_0_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1178:1: (lv_day_0_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1178:1: (lv_day_0_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1179:3: lv_day_0_0= RULE_INT
            {
            lv_day_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate2333); 

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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleDate2350); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getHyphenMinusKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1199:1: ( (lv_month_2_0= ruleMonth ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1200:1: (lv_month_2_0= ruleMonth )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1200:1: (lv_month_2_0= ruleMonth )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1201:3: lv_month_2_0= ruleMonth
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMonth_in_ruleDate2371);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleDate2383); 

                	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getHyphenMinusKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1221:1: ( (lv_year_4_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1222:1: (lv_year_4_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1222:1: (lv_year_4_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1223:3: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate2400); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1247:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1248:2: (iv_ruleMonth= ruleMonth EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1249:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_ruleMonth_in_entryRuleMonth2441);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonth2451); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1256:1: ruleMonth returns [EObject current=null] : ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1259:28: ( ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1260:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1260:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1261:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1261:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1262:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1262:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            int alt26=12;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt26=1;
                }
                break;
            case 44:
                {
                alt26=2;
                }
                break;
            case 45:
                {
                alt26=3;
                }
                break;
            case 46:
                {
                alt26=4;
                }
                break;
            case 47:
                {
                alt26=5;
                }
                break;
            case 48:
                {
                alt26=6;
                }
                break;
            case 49:
                {
                alt26=7;
                }
                break;
            case 50:
                {
                alt26=8;
                }
                break;
            case 51:
                {
                alt26=9;
                }
                break;
            case 52:
                {
                alt26=10;
                }
                break;
            case 53:
                {
                alt26=11;
                }
                break;
            case 54:
                {
                alt26=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1263:3: lv_name_0_1= 'Jan'
                    {
                    lv_name_0_1=(Token)match(input,43,FOLLOW_43_in_ruleMonth2495); 

                            newLeafNode(lv_name_0_1, grammarAccess.getMonthAccess().getNameJanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1275:8: lv_name_0_2= 'Feb'
                    {
                    lv_name_0_2=(Token)match(input,44,FOLLOW_44_in_ruleMonth2524); 

                            newLeafNode(lv_name_0_2, grammarAccess.getMonthAccess().getNameFebKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1287:8: lv_name_0_3= 'Mar'
                    {
                    lv_name_0_3=(Token)match(input,45,FOLLOW_45_in_ruleMonth2553); 

                            newLeafNode(lv_name_0_3, grammarAccess.getMonthAccess().getNameMarKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1299:8: lv_name_0_4= 'Apr'
                    {
                    lv_name_0_4=(Token)match(input,46,FOLLOW_46_in_ruleMonth2582); 

                            newLeafNode(lv_name_0_4, grammarAccess.getMonthAccess().getNameAprKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1311:8: lv_name_0_5= 'May'
                    {
                    lv_name_0_5=(Token)match(input,47,FOLLOW_47_in_ruleMonth2611); 

                            newLeafNode(lv_name_0_5, grammarAccess.getMonthAccess().getNameMayKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1323:8: lv_name_0_6= 'Jun'
                    {
                    lv_name_0_6=(Token)match(input,48,FOLLOW_48_in_ruleMonth2640); 

                            newLeafNode(lv_name_0_6, grammarAccess.getMonthAccess().getNameJunKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1335:8: lv_name_0_7= 'Jul'
                    {
                    lv_name_0_7=(Token)match(input,49,FOLLOW_49_in_ruleMonth2669); 

                            newLeafNode(lv_name_0_7, grammarAccess.getMonthAccess().getNameJulKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1347:8: lv_name_0_8= 'Aug'
                    {
                    lv_name_0_8=(Token)match(input,50,FOLLOW_50_in_ruleMonth2698); 

                            newLeafNode(lv_name_0_8, grammarAccess.getMonthAccess().getNameAugKeyword_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1359:8: lv_name_0_9= 'Sep'
                    {
                    lv_name_0_9=(Token)match(input,51,FOLLOW_51_in_ruleMonth2727); 

                            newLeafNode(lv_name_0_9, grammarAccess.getMonthAccess().getNameSepKeyword_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1371:8: lv_name_0_10= 'Oct'
                    {
                    lv_name_0_10=(Token)match(input,52,FOLLOW_52_in_ruleMonth2756); 

                            newLeafNode(lv_name_0_10, grammarAccess.getMonthAccess().getNameOctKeyword_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1383:8: lv_name_0_11= 'Nov'
                    {
                    lv_name_0_11=(Token)match(input,53,FOLLOW_53_in_ruleMonth2785); 

                            newLeafNode(lv_name_0_11, grammarAccess.getMonthAccess().getNameNovKeyword_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1395:8: lv_name_0_12= 'Dec'
                    {
                    lv_name_0_12=(Token)match(input,54,FOLLOW_54_in_ruleMonth2814); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1418:1: entryRuleOrganizations returns [EObject current=null] : iv_ruleOrganizations= ruleOrganizations EOF ;
    public final EObject entryRuleOrganizations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizations = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1419:2: (iv_ruleOrganizations= ruleOrganizations EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1420:2: iv_ruleOrganizations= ruleOrganizations EOF
            {
             newCompositeNode(grammarAccess.getOrganizationsRule()); 
            pushFollow(FOLLOW_ruleOrganizations_in_entryRuleOrganizations2865);
            iv_ruleOrganizations=ruleOrganizations();

            state._fsp--;

             current =iv_ruleOrganizations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganizations2875); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1427:1: ruleOrganizations returns [EObject current=null] : (otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleOrganizations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_customer_2_0=null;
        Token otherlv_3=null;
        Token lv_supplier_4_0=null;
        Token otherlv_5=null;
        Token lv_partners_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1430:28: ( (otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1431:1: (otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1431:1: (otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1431:3: otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleOrganizations2912); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganizationsAccess().getOrganizationsKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleOrganizations2924); 

                	newLeafNode(otherlv_1, grammarAccess.getOrganizationsAccess().getCustomerKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1439:1: ( (lv_customer_2_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1440:1: (lv_customer_2_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1440:1: (lv_customer_2_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1441:3: lv_customer_2_0= RULE_STRING
            {
            lv_customer_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizations2941); 

            			newLeafNode(lv_customer_2_0, grammarAccess.getOrganizationsAccess().getCustomerSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizationsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"customer",
                    		lv_customer_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleOrganizations2958); 

                	newLeafNode(otherlv_3, grammarAccess.getOrganizationsAccess().getSupplierKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1461:1: ( (lv_supplier_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1462:1: (lv_supplier_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1462:1: (lv_supplier_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1463:3: lv_supplier_4_0= RULE_STRING
            {
            lv_supplier_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizations2975); 

            			newLeafNode(lv_supplier_4_0, grammarAccess.getOrganizationsAccess().getSupplierSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizationsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"supplier",
                    		lv_supplier_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,58,FOLLOW_58_in_ruleOrganizations2992); 

                	newLeafNode(otherlv_5, grammarAccess.getOrganizationsAccess().getPartnersKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1483:1: ( (lv_partners_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1484:1: (lv_partners_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1484:1: (lv_partners_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1485:3: lv_partners_6_0= RULE_STRING
            {
            lv_partners_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizations3009); 

            			newLeafNode(lv_partners_6_0, grammarAccess.getOrganizationsAccess().getPartnersSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizationsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"partners",
                    		lv_partners_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleOrganizations3026); 

                	newLeafNode(otherlv_7, grammarAccess.getOrganizationsAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1513:1: entryRuleProjectProgress returns [EObject current=null] : iv_ruleProjectProgress= ruleProjectProgress EOF ;
    public final EObject entryRuleProjectProgress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectProgress = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1514:2: (iv_ruleProjectProgress= ruleProjectProgress EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1515:2: iv_ruleProjectProgress= ruleProjectProgress EOF
            {
             newCompositeNode(grammarAccess.getProjectProgressRule()); 
            pushFollow(FOLLOW_ruleProjectProgress_in_entryRuleProjectProgress3062);
            iv_ruleProjectProgress=ruleProjectProgress();

            state._fsp--;

             current =iv_ruleProjectProgress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectProgress3072); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1522:1: ruleProjectProgress returns [EObject current=null] : ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1525:28: ( ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1526:1: ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1526:1: ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1527:1: ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1527:1: ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1528:1: (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1528:1: (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' )
            int alt27=7;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt27=1;
                }
                break;
            case 60:
                {
                alt27=2;
                }
                break;
            case 61:
                {
                alt27=3;
                }
                break;
            case 62:
                {
                alt27=4;
                }
                break;
            case 63:
                {
                alt27=5;
                }
                break;
            case 64:
                {
                alt27=6;
                }
                break;
            case 65:
                {
                alt27=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1529:3: lv_value_0_1= 'Not-Plan'
                    {
                    lv_value_0_1=(Token)match(input,59,FOLLOW_59_in_ruleProjectProgress3116); 

                            newLeafNode(lv_value_0_1, grammarAccess.getProjectProgressAccess().getValueNotPlanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1541:8: lv_value_0_2= 'Plan'
                    {
                    lv_value_0_2=(Token)match(input,60,FOLLOW_60_in_ruleProjectProgress3145); 

                            newLeafNode(lv_value_0_2, grammarAccess.getProjectProgressAccess().getValuePlanKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1553:8: lv_value_0_3= 'On-Design'
                    {
                    lv_value_0_3=(Token)match(input,61,FOLLOW_61_in_ruleProjectProgress3174); 

                            newLeafNode(lv_value_0_3, grammarAccess.getProjectProgressAccess().getValueOnDesignKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1565:8: lv_value_0_4= 'On-Develop'
                    {
                    lv_value_0_4=(Token)match(input,62,FOLLOW_62_in_ruleProjectProgress3203); 

                            newLeafNode(lv_value_0_4, grammarAccess.getProjectProgressAccess().getValueOnDevelopKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1577:8: lv_value_0_5= 'On-Test'
                    {
                    lv_value_0_5=(Token)match(input,63,FOLLOW_63_in_ruleProjectProgress3232); 

                            newLeafNode(lv_value_0_5, grammarAccess.getProjectProgressAccess().getValueOnTestKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1589:8: lv_value_0_6= 'On-Deploy'
                    {
                    lv_value_0_6=(Token)match(input,64,FOLLOW_64_in_ruleProjectProgress3261); 

                            newLeafNode(lv_value_0_6, grammarAccess.getProjectProgressAccess().getValueOnDeployKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectProgressRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1601:8: lv_value_0_7= 'Concluded'
                    {
                    lv_value_0_7=(Token)match(input,65,FOLLOW_65_in_ruleProjectProgress3290); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1624:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1625:2: (iv_ruleSystem= ruleSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1626:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem3341);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem3351); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1633:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1636:28: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1637:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1637:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1637:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) ) otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleSystem3388); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1641:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1642:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1642:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1643:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem3405); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem3422); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1663:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1663:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSystem3435); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1667:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1668:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1668:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1669:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem3452); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1685:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1685:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleSystem3472); 

                        	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1689:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1690:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1690:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1691:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem3489); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleSystem3508); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1711:1: ( ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1712:1: ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1712:1: ( (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1713:1: (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1713:1: (lv_type_8_1= 'System' | lv_type_8_2= 'Sub-System' | lv_type_8_3= 'Reusable-System' | lv_type_8_4= 'Other' )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt30=1;
                }
                break;
            case 67:
                {
                alt30=2;
                }
                break;
            case 68:
                {
                alt30=3;
                }
                break;
            case 27:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1714:3: lv_type_8_1= 'System'
                    {
                    lv_type_8_1=(Token)match(input,66,FOLLOW_66_in_ruleSystem3528); 

                            newLeafNode(lv_type_8_1, grammarAccess.getSystemAccess().getTypeSystemKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1726:8: lv_type_8_2= 'Sub-System'
                    {
                    lv_type_8_2=(Token)match(input,67,FOLLOW_67_in_ruleSystem3557); 

                            newLeafNode(lv_type_8_2, grammarAccess.getSystemAccess().getTypeSubSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1738:8: lv_type_8_3= 'Reusable-System'
                    {
                    lv_type_8_3=(Token)match(input,68,FOLLOW_68_in_ruleSystem3586); 

                            newLeafNode(lv_type_8_3, grammarAccess.getSystemAccess().getTypeReusableSystemKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1750:8: lv_type_8_4= 'Other'
                    {
                    lv_type_8_4=(Token)match(input,27,FOLLOW_27_in_ruleSystem3615); 

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

            otherlv_9=(Token)match(input,69,FOLLOW_69_in_ruleSystem3643); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getScopeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1769:1: ( ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1770:1: ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1770:1: ( (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1771:1: (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1771:1: (lv_scope_10_1= 'In' | lv_scope_10_2= 'Out' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==70) ) {
                alt31=1;
            }
            else if ( (LA31_0==71) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1772:3: lv_scope_10_1= 'In'
                    {
                    lv_scope_10_1=(Token)match(input,70,FOLLOW_70_in_ruleSystem3663); 

                            newLeafNode(lv_scope_10_1, grammarAccess.getSystemAccess().getScopeInKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1784:8: lv_scope_10_2= 'Out'
                    {
                    lv_scope_10_2=(Token)match(input,71,FOLLOW_71_in_ruleSystem3692); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1799:2: (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==72) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1799:4: otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,72,FOLLOW_72_in_ruleSystem3721); 

                        	newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getPartOfKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1803:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1804:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1804:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1805:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem3741); 

                    		newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getPartOfSystemCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleSystem3755); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1828:1: entryRuleSystemRelation returns [EObject current=null] : iv_ruleSystemRelation= ruleSystemRelation EOF ;
    public final EObject entryRuleSystemRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRelation = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1829:2: (iv_ruleSystemRelation= ruleSystemRelation EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1830:2: iv_ruleSystemRelation= ruleSystemRelation EOF
            {
             newCompositeNode(grammarAccess.getSystemRelationRule()); 
            pushFollow(FOLLOW_ruleSystemRelation_in_entryRuleSystemRelation3791);
            iv_ruleSystemRelation=ruleSystemRelation();

            state._fsp--;

             current =iv_ruleSystemRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemRelation3801); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1837:1: ruleSystemRelation returns [EObject current=null] : (otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1840:28: ( (otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1841:1: (otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1841:1: (otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1841:3: otherlv_0= 'SystemRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) ) otherlv_9= 'Type' ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) ) (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleSystemRelation3838); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemRelationAccess().getSystemRelationKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1845:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1846:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1846:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1847:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemRelation3855); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystemRelation3872); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemRelationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleSystemRelation3884); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemRelationAccess().getSourceKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1871:1: ( (otherlv_4= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1872:1: (otherlv_4= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1872:1: (otherlv_4= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1873:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRelationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemRelation3904); 

            		newLeafNode(otherlv_4, grammarAccess.getSystemRelationAccess().getSourceSystemCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleSystemRelation3916); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemRelationAccess().getTargetKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1888:1: ( (otherlv_6= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1889:1: (otherlv_6= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1889:1: (otherlv_6= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1890:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemRelation3936); 

            		newLeafNode(otherlv_6, grammarAccess.getSystemRelationAccess().getTargetSystemCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,76,FOLLOW_76_in_ruleSystemRelation3948); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemRelationAccess().getCategoryKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1905:1: ( ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1906:1: ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1906:1: ( (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1907:1: (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1907:1: (lv_category_8_1= 'Import' | lv_category_8_2= 'Export' | lv_category_8_3= 'Import-Export' | lv_category_8_4= 'Sync' | lv_category_8_5= 'Interact' | lv_category_8_6= 'Other' )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt33=1;
                }
                break;
            case 78:
                {
                alt33=2;
                }
                break;
            case 79:
                {
                alt33=3;
                }
                break;
            case 80:
                {
                alt33=4;
                }
                break;
            case 81:
                {
                alt33=5;
                }
                break;
            case 27:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1908:3: lv_category_8_1= 'Import'
                    {
                    lv_category_8_1=(Token)match(input,77,FOLLOW_77_in_ruleSystemRelation3968); 

                            newLeafNode(lv_category_8_1, grammarAccess.getSystemRelationAccess().getCategoryImportKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1920:8: lv_category_8_2= 'Export'
                    {
                    lv_category_8_2=(Token)match(input,78,FOLLOW_78_in_ruleSystemRelation3997); 

                            newLeafNode(lv_category_8_2, grammarAccess.getSystemRelationAccess().getCategoryExportKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1932:8: lv_category_8_3= 'Import-Export'
                    {
                    lv_category_8_3=(Token)match(input,79,FOLLOW_79_in_ruleSystemRelation4026); 

                            newLeafNode(lv_category_8_3, grammarAccess.getSystemRelationAccess().getCategoryImportExportKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1944:8: lv_category_8_4= 'Sync'
                    {
                    lv_category_8_4=(Token)match(input,80,FOLLOW_80_in_ruleSystemRelation4055); 

                            newLeafNode(lv_category_8_4, grammarAccess.getSystemRelationAccess().getCategorySyncKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1956:8: lv_category_8_5= 'Interact'
                    {
                    lv_category_8_5=(Token)match(input,81,FOLLOW_81_in_ruleSystemRelation4084); 

                            newLeafNode(lv_category_8_5, grammarAccess.getSystemRelationAccess().getCategoryInteractKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1968:8: lv_category_8_6= 'Other'
                    {
                    lv_category_8_6=(Token)match(input,27,FOLLOW_27_in_ruleSystemRelation4113); 

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

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleSystemRelation4141); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemRelationAccess().getTypeKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1987:1: ( ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1988:1: ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1988:1: ( (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1989:1: (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1989:1: (lv_type_10_1= 'In' | lv_type_10_2= 'Out' | lv_type_10_3= 'In-Out' )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt34=1;
                }
                break;
            case 71:
                {
                alt34=2;
                }
                break;
            case 82:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1990:3: lv_type_10_1= 'In'
                    {
                    lv_type_10_1=(Token)match(input,70,FOLLOW_70_in_ruleSystemRelation4161); 

                            newLeafNode(lv_type_10_1, grammarAccess.getSystemRelationAccess().getTypeInKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2002:8: lv_type_10_2= 'Out'
                    {
                    lv_type_10_2=(Token)match(input,71,FOLLOW_71_in_ruleSystemRelation4190); 

                            newLeafNode(lv_type_10_2, grammarAccess.getSystemRelationAccess().getTypeOutKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2014:8: lv_type_10_3= 'In-Out'
                    {
                    lv_type_10_3=(Token)match(input,82,FOLLOW_82_in_ruleSystemRelation4219); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2029:2: (otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2029:4: otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleSystemRelation4248); 

                        	newLeafNode(otherlv_11, grammarAccess.getSystemRelationAccess().getDescriptionKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2033:1: ( (lv_description_12_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2034:1: (lv_description_12_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2034:1: (lv_description_12_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2035:3: lv_description_12_0= RULE_STRING
                    {
                    lv_description_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystemRelation4265); 

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

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleSystemRelation4284); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2063:1: entryRuleGlossaryTerm returns [EObject current=null] : iv_ruleGlossaryTerm= ruleGlossaryTerm EOF ;
    public final EObject entryRuleGlossaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossaryTerm = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2064:2: (iv_ruleGlossaryTerm= ruleGlossaryTerm EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2065:2: iv_ruleGlossaryTerm= ruleGlossaryTerm EOF
            {
             newCompositeNode(grammarAccess.getGlossaryTermRule()); 
            pushFollow(FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm4320);
            iv_ruleGlossaryTerm=ruleGlossaryTerm();

            state._fsp--;

             current =iv_ruleGlossaryTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossaryTerm4330); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2072:1: ruleGlossaryTerm returns [EObject current=null] : (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2075:28: ( (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2076:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2076:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2076:3: otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )? (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleGlossaryTerm4367); 

                	newLeafNode(otherlv_0, grammarAccess.getGlossaryTermAccess().getGlossaryTermKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2080:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2081:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2081:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2082:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlossaryTerm4384); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGlossaryTerm4401); 

                	newLeafNode(otherlv_2, grammarAccess.getGlossaryTermAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2102:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2102:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleGlossaryTerm4414); 

                        	newLeafNode(otherlv_3, grammarAccess.getGlossaryTermAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2106:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2107:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2107:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2108:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4431); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2124:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2124:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleGlossaryTerm4451); 

                        	newLeafNode(otherlv_5, grammarAccess.getGlossaryTermAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2128:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2129:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2129:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2130:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4468); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleGlossaryTerm4487); 

                	newLeafNode(otherlv_7, grammarAccess.getGlossaryTermAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2150:1: ( (lv_type_8_0= ruleRefTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2151:1: (lv_type_8_0= ruleRefTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2151:1: (lv_type_8_0= ruleRefTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2152:3: lv_type_8_0= ruleRefTermType
            {
             
            	        newCompositeNode(grammarAccess.getGlossaryTermAccess().getTypeRefTermTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleRefTermType_in_ruleGlossaryTerm4508);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2168:2: (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==84) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2168:4: otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,84,FOLLOW_84_in_ruleGlossaryTerm4521); 

                        	newLeafNode(otherlv_9, grammarAccess.getGlossaryTermAccess().getAcronymKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2172:1: ( (lv_acronym_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2173:1: (lv_acronym_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2173:1: (lv_acronym_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2174:3: lv_acronym_10_0= RULE_STRING
                    {
                    lv_acronym_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4538); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2190:4: (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==85) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2190:6: otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    {
                    otherlv_11=(Token)match(input,85,FOLLOW_85_in_ruleGlossaryTerm4558); 

                        	newLeafNode(otherlv_11, grammarAccess.getGlossaryTermAccess().getPOSKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2194:1: ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2195:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2195:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2196:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2196:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    int alt39=4;
                    switch ( input.LA(1) ) {
                    case 86:
                        {
                        alt39=1;
                        }
                        break;
                    case 87:
                        {
                        alt39=2;
                        }
                        break;
                    case 88:
                        {
                        alt39=3;
                        }
                        break;
                    case 89:
                        {
                        alt39=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }

                    switch (alt39) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2197:3: lv_pos_12_1= 'Adjective'
                            {
                            lv_pos_12_1=(Token)match(input,86,FOLLOW_86_in_ruleGlossaryTerm4578); 

                                    newLeafNode(lv_pos_12_1, grammarAccess.getGlossaryTermAccess().getPosAdjectiveKeyword_8_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2209:8: lv_pos_12_2= 'Adverb'
                            {
                            lv_pos_12_2=(Token)match(input,87,FOLLOW_87_in_ruleGlossaryTerm4607); 

                                    newLeafNode(lv_pos_12_2, grammarAccess.getGlossaryTermAccess().getPosAdverbKeyword_8_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2221:8: lv_pos_12_3= 'Noun'
                            {
                            lv_pos_12_3=(Token)match(input,88,FOLLOW_88_in_ruleGlossaryTerm4636); 

                                    newLeafNode(lv_pos_12_3, grammarAccess.getGlossaryTermAccess().getPosNounKeyword_8_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2233:8: lv_pos_12_4= 'Verb'
                            {
                            lv_pos_12_4=(Token)match(input,89,FOLLOW_89_in_ruleGlossaryTerm4665); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2248:4: (otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==90) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2248:6: otherlv_13= 'Synonym' ( (lv_synonym_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,90,FOLLOW_90_in_ruleGlossaryTerm4696); 

                        	newLeafNode(otherlv_13, grammarAccess.getGlossaryTermAccess().getSynonymKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2252:1: ( (lv_synonym_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2253:1: (lv_synonym_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2253:1: (lv_synonym_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2254:3: lv_synonym_14_0= RULE_STRING
                    {
                    lv_synonym_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4713); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2270:4: (otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==91) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2270:6: otherlv_15= 'Hypernym' ( (lv_hypernym_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,91,FOLLOW_91_in_ruleGlossaryTerm4733); 

                        	newLeafNode(otherlv_15, grammarAccess.getGlossaryTermAccess().getHypernymKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2274:1: ( (lv_hypernym_16_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2275:1: (lv_hypernym_16_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2275:1: (lv_hypernym_16_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2276:3: lv_hypernym_16_0= RULE_STRING
                    {
                    lv_hypernym_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm4750); 

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

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleGlossaryTerm4769); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2304:1: entryRuleRefTermType returns [EObject current=null] : iv_ruleRefTermType= ruleRefTermType EOF ;
    public final EObject entryRuleRefTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2305:2: (iv_ruleRefTermType= ruleRefTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2306:2: iv_ruleRefTermType= ruleRefTermType EOF
            {
             newCompositeNode(grammarAccess.getRefTermTypeRule()); 
            pushFollow(FOLLOW_ruleRefTermType_in_entryRuleRefTermType4805);
            iv_ruleRefTermType=ruleRefTermType();

            state._fsp--;

             current =iv_ruleRefTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTermType4815); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2313:1: ruleRefTermType returns [EObject current=null] : ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) ;
    public final EObject ruleRefTermType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_refType_0_0 = null;

        EObject lv_refs_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2316:28: ( ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2317:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2317:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2317:2: ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2317:2: ( (lv_refType_0_0= ruleTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2318:1: (lv_refType_0_0= ruleTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2318:1: (lv_refType_0_0= ruleTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2319:3: lv_refType_0_0= ruleTermType
            {
             
            	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefTypeTermTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType4861);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2335:2: (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==92) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2335:4: otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefTermType4874); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefTermTypeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2339:1: ( (lv_refs_2_0= ruleTermType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2340:1: (lv_refs_2_0= ruleTermType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2340:1: (lv_refs_2_0= ruleTermType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2341:3: lv_refs_2_0= ruleTermType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefsTermTypeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType4895);
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
            	    break loop43;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2365:1: entryRuleTermType returns [EObject current=null] : iv_ruleTermType= ruleTermType EOF ;
    public final EObject entryRuleTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2366:2: (iv_ruleTermType= ruleTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2367:2: iv_ruleTermType= ruleTermType EOF
            {
             newCompositeNode(grammarAccess.getTermTypeRule()); 
            pushFollow(FOLLOW_ruleTermType_in_entryRuleTermType4933);
            iv_ruleTermType=ruleTermType();

            state._fsp--;

             current =iv_ruleTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermType4943); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2374:1: ruleTermType returns [EObject current=null] : ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) ;
    public final EObject ruleTermType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2377:28: ( ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2378:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2378:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2379:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2379:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2380:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2380:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt44=1;
                }
                break;
            case 94:
                {
                alt44=2;
                }
                break;
            case 95:
                {
                alt44=3;
                }
                break;
            case 96:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2381:3: lv_type_0_1= 'Stakeholder'
                    {
                    lv_type_0_1=(Token)match(input,93,FOLLOW_93_in_ruleTermType4987); 

                            newLeafNode(lv_type_0_1, grammarAccess.getTermTypeAccess().getTypeStakeholderKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2393:8: lv_type_0_2= 'Entity'
                    {
                    lv_type_0_2=(Token)match(input,94,FOLLOW_94_in_ruleTermType5016); 

                            newLeafNode(lv_type_0_2, grammarAccess.getTermTypeAccess().getTypeEntityKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2405:8: lv_type_0_3= 'Architectural'
                    {
                    lv_type_0_3=(Token)match(input,95,FOLLOW_95_in_ruleTermType5045); 

                            newLeafNode(lv_type_0_3, grammarAccess.getTermTypeAccess().getTypeArchitecturalKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2417:8: lv_type_0_4= 'Actor'
                    {
                    lv_type_0_4=(Token)match(input,96,FOLLOW_96_in_ruleTermType5074); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2440:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2441:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2442:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder5125);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder5135); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2449:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2452:28: ( (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2453:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2453:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2453:3: otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleStakeholder5172); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2457:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2458:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2458:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2459:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder5189); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStakeholder5206); 

                	newLeafNode(otherlv_2, grammarAccess.getStakeholderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2479:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2479:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStakeholder5219); 

                        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2483:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2484:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2484:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2485:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder5236); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2501:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2501:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleStakeholder5256); 

                        	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2505:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2506:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2506:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2507:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder5273); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStakeholder5292); 

                	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2527:1: ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2528:1: ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2528:1: ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2529:1: (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2529:1: (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' )
            int alt47=5;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt47=1;
                }
                break;
            case 98:
                {
                alt47=2;
                }
                break;
            case 99:
                {
                alt47=3;
                }
                break;
            case 100:
                {
                alt47=4;
                }
                break;
            case 101:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2530:3: lv_type_8_1= 'Group.Organization'
                    {
                    lv_type_8_1=(Token)match(input,97,FOLLOW_97_in_ruleStakeholder5312); 

                            newLeafNode(lv_type_8_1, grammarAccess.getStakeholderAccess().getTypeGroupOrganizationKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2542:8: lv_type_8_2= 'Group.BusinessUnit'
                    {
                    lv_type_8_2=(Token)match(input,98,FOLLOW_98_in_ruleStakeholder5341); 

                            newLeafNode(lv_type_8_2, grammarAccess.getStakeholderAccess().getTypeGroupBusinessUnitKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2554:8: lv_type_8_3= 'Group.Team'
                    {
                    lv_type_8_3=(Token)match(input,99,FOLLOW_99_in_ruleStakeholder5370); 

                            newLeafNode(lv_type_8_3, grammarAccess.getStakeholderAccess().getTypeGroupTeamKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2566:8: lv_type_8_4= 'Individual.Person'
                    {
                    lv_type_8_4=(Token)match(input,100,FOLLOW_100_in_ruleStakeholder5399); 

                            newLeafNode(lv_type_8_4, grammarAccess.getStakeholderAccess().getTypeIndividualPersonKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2578:8: lv_type_8_5= 'Individual.ExternalSystem'
                    {
                    lv_type_8_5=(Token)match(input,101,FOLLOW_101_in_ruleStakeholder5428); 

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

            otherlv_9=(Token)match(input,76,FOLLOW_76_in_ruleStakeholder5456); 

                	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getCategoryKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2597:1: ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2598:1: ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2598:1: ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2599:1: (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2599:1: (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' )
            int alt48=16;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt48=1;
                }
                break;
            case 103:
                {
                alt48=2;
                }
                break;
            case 104:
                {
                alt48=3;
                }
                break;
            case 105:
                {
                alt48=4;
                }
                break;
            case 106:
                {
                alt48=5;
                }
                break;
            case 107:
                {
                alt48=6;
                }
                break;
            case 108:
                {
                alt48=7;
                }
                break;
            case 109:
                {
                alt48=8;
                }
                break;
            case 110:
                {
                alt48=9;
                }
                break;
            case 111:
                {
                alt48=10;
                }
                break;
            case 112:
                {
                alt48=11;
                }
                break;
            case 113:
                {
                alt48=12;
                }
                break;
            case 114:
                {
                alt48=13;
                }
                break;
            case 115:
                {
                alt48=14;
                }
                break;
            case 116:
                {
                alt48=15;
                }
                break;
            case 117:
                {
                alt48=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2600:3: lv_category_10_1= 'Business'
                    {
                    lv_category_10_1=(Token)match(input,102,FOLLOW_102_in_ruleStakeholder5476); 

                            newLeafNode(lv_category_10_1, grammarAccess.getStakeholderAccess().getCategoryBusinessKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2612:8: lv_category_10_2= 'Business.Customer'
                    {
                    lv_category_10_2=(Token)match(input,103,FOLLOW_103_in_ruleStakeholder5505); 

                            newLeafNode(lv_category_10_2, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2624:8: lv_category_10_3= 'Business.Customer.Sponsor'
                    {
                    lv_category_10_3=(Token)match(input,104,FOLLOW_104_in_ruleStakeholder5534); 

                            newLeafNode(lv_category_10_3, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerSponsorKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2636:8: lv_category_10_4= 'Business.Customer.Champion'
                    {
                    lv_category_10_4=(Token)match(input,105,FOLLOW_105_in_ruleStakeholder5563); 

                            newLeafNode(lv_category_10_4, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerChampionKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2648:8: lv_category_10_5= 'Business.User.Direct'
                    {
                    lv_category_10_5=(Token)match(input,106,FOLLOW_106_in_ruleStakeholder5592); 

                            newLeafNode(lv_category_10_5, grammarAccess.getStakeholderAccess().getCategoryBusinessUserDirectKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2660:8: lv_category_10_6= 'Business.User.Indirect'
                    {
                    lv_category_10_6=(Token)match(input,107,FOLLOW_107_in_ruleStakeholder5621); 

                            newLeafNode(lv_category_10_6, grammarAccess.getStakeholderAccess().getCategoryBusinessUserIndirectKeyword_8_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2672:8: lv_category_10_7= 'Business.Advisor.DomainExpert'
                    {
                    lv_category_10_7=(Token)match(input,108,FOLLOW_108_in_ruleStakeholder5650); 

                            newLeafNode(lv_category_10_7, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorDomainExpertKeyword_8_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2684:8: lv_category_10_8= 'Business.Advisor.Trainer'
                    {
                    lv_category_10_8=(Token)match(input,109,FOLLOW_109_in_ruleStakeholder5679); 

                            newLeafNode(lv_category_10_8, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorTrainerKeyword_8_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2696:8: lv_category_10_9= 'Business.Advisor.RegulatorAgent'
                    {
                    lv_category_10_9=(Token)match(input,110,FOLLOW_110_in_ruleStakeholder5708); 

                            newLeafNode(lv_category_10_9, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorRegulatorAgentKeyword_8_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2708:8: lv_category_10_10= 'Business.System'
                    {
                    lv_category_10_10=(Token)match(input,111,FOLLOW_111_in_ruleStakeholder5737); 

                            newLeafNode(lv_category_10_10, grammarAccess.getStakeholderAccess().getCategoryBusinessSystemKeyword_8_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2720:8: lv_category_10_11= 'Technical'
                    {
                    lv_category_10_11=(Token)match(input,112,FOLLOW_112_in_ruleStakeholder5766); 

                            newLeafNode(lv_category_10_11, grammarAccess.getStakeholderAccess().getCategoryTechnicalKeyword_8_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2732:8: lv_category_10_12= 'Technical.BusinessAnalyst'
                    {
                    lv_category_10_12=(Token)match(input,113,FOLLOW_113_in_ruleStakeholder5795); 

                            newLeafNode(lv_category_10_12, grammarAccess.getStakeholderAccess().getCategoryTechnicalBusinessAnalystKeyword_8_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_12, null);
                    	    

                    }
                    break;
                case 13 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2744:8: lv_category_10_13= 'Technical.Requirements.Engineer'
                    {
                    lv_category_10_13=(Token)match(input,114,FOLLOW_114_in_ruleStakeholder5824); 

                            newLeafNode(lv_category_10_13, grammarAccess.getStakeholderAccess().getCategoryTechnicalRequirementsEngineerKeyword_8_0_12());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_13, null);
                    	    

                    }
                    break;
                case 14 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2756:8: lv_category_10_14= 'Technical.Software.Architect'
                    {
                    lv_category_10_14=(Token)match(input,115,FOLLOW_115_in_ruleStakeholder5853); 

                            newLeafNode(lv_category_10_14, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareArchitectKeyword_8_0_13());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_14, null);
                    	    

                    }
                    break;
                case 15 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2768:8: lv_category_10_15= 'Technical.Software.Designer'
                    {
                    lv_category_10_15=(Token)match(input,116,FOLLOW_116_in_ruleStakeholder5882); 

                            newLeafNode(lv_category_10_15, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareDesignerKeyword_8_0_14());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_15, null);
                    	    

                    }
                    break;
                case 16 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2780:8: lv_category_10_16= 'Technical.Software.Tester'
                    {
                    lv_category_10_16=(Token)match(input,117,FOLLOW_117_in_ruleStakeholder5911); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2795:2: (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==118) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2795:4: otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,118,FOLLOW_118_in_ruleStakeholder5940); 

                        	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getIsAKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2799:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2800:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2800:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2801:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder5960); 

                    		newLeafNode(otherlv_12, grammarAccess.getStakeholderAccess().getIsAStakeholderCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2812:4: (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==72) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2812:6: otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,72,FOLLOW_72_in_ruleStakeholder5975); 

                        	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getPartOfKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2816:1: ( (otherlv_14= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2817:1: (otherlv_14= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2817:1: (otherlv_14= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2818:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder5995); 

                    		newLeafNode(otherlv_14, grammarAccess.getStakeholderAccess().getPartOfStakeholderCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleStakeholder6009); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2841:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2842:2: (iv_ruleGoal= ruleGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2843:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal6045);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal6055); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2850:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2853:28: ( (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2854:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2854:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2854:3: otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )? (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_119_in_ruleGoal6092); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2858:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2859:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2859:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2860:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal6109); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoal6126); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2880:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==19) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2880:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleGoal6139); 

                        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2884:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2885:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2885:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2886:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal6156); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2902:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==37) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2902:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleGoal6176); 

                        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2906:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2907:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2907:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2908:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal6193); 

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

            otherlv_7=(Token)match(input,93,FOLLOW_93_in_ruleGoal6212); 

                	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getStakeholderKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2928:1: ( (otherlv_8= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2929:1: (otherlv_8= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2929:1: (otherlv_8= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2930:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal6232); 

            		newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getStakeholderStakeholderCrossReference_6_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,120,FOLLOW_120_in_ruleGoal6244); 

                	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getPriorityKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2945:1: ( (lv_priority_10_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2946:1: (lv_priority_10_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2946:1: (lv_priority_10_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2947:3: lv_priority_10_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getGoalAccess().getPriorityPriorityParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleGoal6265);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2963:2: (otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==35) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2963:4: otherlv_11= 'ProjectProgress' ( (lv_progress_12_0= ruleProjectProgress ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleGoal6278); 

                        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getProjectProgressKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2967:1: ( (lv_progress_12_0= ruleProjectProgress ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2968:1: (lv_progress_12_0= ruleProjectProgress )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2968:1: (lv_progress_12_0= ruleProjectProgress )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2969:3: lv_progress_12_0= ruleProjectProgress
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoalAccess().getProgressProjectProgressParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectProgress_in_ruleGoal6299);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2985:4: (otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==121) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2985:6: otherlv_13= 'PartOf-And' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,121,FOLLOW_121_in_ruleGoal6314); 

                        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getPartOfAndKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2989:1: ( (otherlv_14= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2990:1: (otherlv_14= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2990:1: (otherlv_14= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2991:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal6334); 

                    		newLeafNode(otherlv_14, grammarAccess.getGoalAccess().getPartOfAndGoalCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3002:4: (otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==122) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3002:6: otherlv_15= 'PartOf-Or' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,122,FOLLOW_122_in_ruleGoal6349); 

                        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getPartOfOrKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3006:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3007:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3007:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3008:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal6369); 

                    		newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getPartOfOrGoalCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleGoal6383); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3031:1: entryRuleGoalRelation returns [EObject current=null] : iv_ruleGoalRelation= ruleGoalRelation EOF ;
    public final EObject entryRuleGoalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalRelation = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3032:2: (iv_ruleGoalRelation= ruleGoalRelation EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3033:2: iv_ruleGoalRelation= ruleGoalRelation EOF
            {
             newCompositeNode(grammarAccess.getGoalRelationRule()); 
            pushFollow(FOLLOW_ruleGoalRelation_in_entryRuleGoalRelation6419);
            iv_ruleGoalRelation=ruleGoalRelation();

            state._fsp--;

             current =iv_ruleGoalRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalRelation6429); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3040:1: ruleGoalRelation returns [EObject current=null] : (otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3043:28: ( (otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3044:1: (otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3044:1: (otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3044:3: otherlv_0= 'GoalRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,123,FOLLOW_123_in_ruleGoalRelation6466); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalRelationAccess().getGoalRelationKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3048:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3049:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3049:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3050:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoalRelation6483); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoalRelation6500); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalRelationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleGoalRelation6512); 

                	newLeafNode(otherlv_3, grammarAccess.getGoalRelationAccess().getSourceKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3074:1: ( (otherlv_4= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3075:1: (otherlv_4= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3075:1: (otherlv_4= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3076:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRelationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoalRelation6532); 

            		newLeafNode(otherlv_4, grammarAccess.getGoalRelationAccess().getSourceGoalCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleGoalRelation6544); 

                	newLeafNode(otherlv_5, grammarAccess.getGoalRelationAccess().getTargetKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3091:1: ( (otherlv_6= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3092:1: (otherlv_6= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3092:1: (otherlv_6= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3093:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoalRelation6564); 

            		newLeafNode(otherlv_6, grammarAccess.getGoalRelationAccess().getTargetGoalCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleGoalRelation6576); 

                	newLeafNode(otherlv_7, grammarAccess.getGoalRelationAccess().getTypeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3108:1: ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3109:1: ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3109:1: ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3110:1: (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3110:1: (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' )
            int alt56=5;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt56=1;
                }
                break;
            case 125:
                {
                alt56=2;
                }
                break;
            case 126:
                {
                alt56=3;
                }
                break;
            case 127:
                {
                alt56=4;
                }
                break;
            case 128:
                {
                alt56=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3111:3: lv_type_8_1= 'Requires'
                    {
                    lv_type_8_1=(Token)match(input,124,FOLLOW_124_in_ruleGoalRelation6596); 

                            newLeafNode(lv_type_8_1, grammarAccess.getGoalRelationAccess().getTypeRequiresKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3123:8: lv_type_8_2= 'Supports'
                    {
                    lv_type_8_2=(Token)match(input,125,FOLLOW_125_in_ruleGoalRelation6625); 

                            newLeafNode(lv_type_8_2, grammarAccess.getGoalRelationAccess().getTypeSupportsKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3135:8: lv_type_8_3= 'Obstructs'
                    {
                    lv_type_8_3=(Token)match(input,126,FOLLOW_126_in_ruleGoalRelation6654); 

                            newLeafNode(lv_type_8_3, grammarAccess.getGoalRelationAccess().getTypeObstructsKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3147:8: lv_type_8_4= 'Conflicts'
                    {
                    lv_type_8_4=(Token)match(input,127,FOLLOW_127_in_ruleGoalRelation6683); 

                            newLeafNode(lv_type_8_4, grammarAccess.getGoalRelationAccess().getTypeConflictsKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3159:8: lv_type_8_5= 'Identical'
                    {
                    lv_type_8_5=(Token)match(input,128,FOLLOW_128_in_ruleGoalRelation6712); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3174:2: (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3174:4: otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleGoalRelation6741); 

                        	newLeafNode(otherlv_9, grammarAccess.getGoalRelationAccess().getDescriptionKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3178:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3179:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3179:1: (lv_description_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3180:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoalRelation6758); 

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

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleGoalRelation6777); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3208:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3209:2: (iv_rulePriority= rulePriority EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3210:2: iv_rulePriority= rulePriority EOF
            {
             newCompositeNode(grammarAccess.getPriorityRule()); 
            pushFollow(FOLLOW_rulePriority_in_entryRulePriority6813);
            iv_rulePriority=rulePriority();

            state._fsp--;

             current =iv_rulePriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePriority6823); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3217:1: rulePriority returns [EObject current=null] : ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3220:28: ( ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3221:1: ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3221:1: ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3222:1: ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3222:1: ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3223:1: (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3223:1: (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt58=1;
                }
                break;
            case 130:
                {
                alt58=2;
                }
                break;
            case 131:
                {
                alt58=3;
                }
                break;
            case 132:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3224:3: lv_value_0_1= 'Must'
                    {
                    lv_value_0_1=(Token)match(input,129,FOLLOW_129_in_rulePriority6867); 

                            newLeafNode(lv_value_0_1, grammarAccess.getPriorityAccess().getValueMustKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3236:8: lv_value_0_2= 'Should'
                    {
                    lv_value_0_2=(Token)match(input,130,FOLLOW_130_in_rulePriority6896); 

                            newLeafNode(lv_value_0_2, grammarAccess.getPriorityAccess().getValueShouldKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3248:8: lv_value_0_3= 'Could'
                    {
                    lv_value_0_3=(Token)match(input,131,FOLLOW_131_in_rulePriority6925); 

                            newLeafNode(lv_value_0_3, grammarAccess.getPriorityAccess().getValueCouldKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3260:8: lv_value_0_4= 'Won\\'t'
                    {
                    lv_value_0_4=(Token)match(input,132,FOLLOW_132_in_rulePriority6954); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3283:1: entryRuleRefGoal returns [EObject current=null] : iv_ruleRefGoal= ruleRefGoal EOF ;
    public final EObject entryRuleRefGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3284:2: (iv_ruleRefGoal= ruleRefGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3285:2: iv_ruleRefGoal= ruleRefGoal EOF
            {
             newCompositeNode(grammarAccess.getRefGoalRule()); 
            pushFollow(FOLLOW_ruleRefGoal_in_entryRuleRefGoal7005);
            iv_ruleRefGoal=ruleRefGoal();

            state._fsp--;

             current =iv_ruleRefGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGoal7015); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3292:1: ruleRefGoal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3295:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3296:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3296:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3296:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3296:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3297:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3297:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3298:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefGoalRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal7060); 

            		newLeafNode(otherlv_0, grammarAccess.getRefGoalAccess().getRefGoalGoalCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3309:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==92) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3309:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefGoal7073); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefGoalAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3313:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3314:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3314:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3315:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefGoalRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal7093); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefGoalAccess().getRefsGoalCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3334:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3335:2: (iv_ruleEntity= ruleEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3336:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity7131);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity7141); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3343:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3346:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3347:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3347:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3347:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleEntity7178); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3351:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3352:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3352:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3353:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity7195); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity7212); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3373:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==19) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3373:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEntity7225); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3377:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3378:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3378:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3379:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity7242); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3395:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==37) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3395:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleEntity7262); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3399:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3400:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3400:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3401:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity7279); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3417:4: (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==20) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3417:6: otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEntity7299); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getTypeKeyword_5_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3421:1: ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3422:1: ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3422:1: ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3423:1: (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3423:1: (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==133) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==134) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3424:3: lv_type_8_1= 'Principal'
                            {
                            lv_type_8_1=(Token)match(input,133,FOLLOW_133_in_ruleEntity7319); 

                                    newLeafNode(lv_type_8_1, grammarAccess.getEntityAccess().getTypePrincipalKeyword_5_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEntityRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_8_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3436:8: lv_type_8_2= 'Secondary'
                            {
                            lv_type_8_2=(Token)match(input,134,FOLLOW_134_in_ruleEntity7348); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3451:4: ( (lv_attributes_9_0= ruleAttribute ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==135) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3452:1: (lv_attributes_9_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3452:1: (lv_attributes_9_0= ruleAttribute )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3453:3: lv_attributes_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity7387);
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
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3469:3: ( (lv_primaryKey_10_0= rulePrimaryKey ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==157) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3470:1: (lv_primaryKey_10_0= rulePrimaryKey )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3470:1: (lv_primaryKey_10_0= rulePrimaryKey )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3471:3: lv_primaryKey_10_0= rulePrimaryKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getPrimaryKeyPrimaryKeyParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryKey_in_ruleEntity7409);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3487:3: ( (lv_foreignKeys_11_0= ruleForeignKey ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==160) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3488:1: (lv_foreignKeys_11_0= ruleForeignKey )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3488:1: (lv_foreignKeys_11_0= ruleForeignKey )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3489:3: lv_foreignKeys_11_0= ruleForeignKey
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getForeignKeysForeignKeyParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleForeignKey_in_ruleEntity7431);
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
            	    break loop66;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3505:3: ( (lv_checks_12_0= ruleCheck ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==161) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3506:1: (lv_checks_12_0= ruleCheck )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3506:1: (lv_checks_12_0= ruleCheck )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3507:3: lv_checks_12_0= ruleCheck
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getChecksCheckParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCheck_in_ruleEntity7453);
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
            	    break loop67;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleEntity7466); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3535:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3536:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3537:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute7502);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute7512); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3544:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3547:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3548:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3548:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3548:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,135,FOLLOW_135_in_ruleAttribute7549); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3552:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3553:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3553:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3554:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute7566); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute7583); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3574:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==19) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3574:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAttribute7596); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3578:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3579:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3579:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3580:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute7613); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3596:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==37) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3596:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleAttribute7633); 

                        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3600:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3601:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3601:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3602:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute7650); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleAttribute7669); 

                	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3622:1: ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3623:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3623:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3624:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3624:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            int alt70=12;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt70=1;
                }
                break;
            case 137:
                {
                alt70=2;
                }
                break;
            case 138:
                {
                alt70=3;
                }
                break;
            case 139:
                {
                alt70=4;
                }
                break;
            case 140:
                {
                alt70=5;
                }
                break;
            case 141:
                {
                alt70=6;
                }
                break;
            case 142:
                {
                alt70=7;
                }
                break;
            case 143:
                {
                alt70=8;
                }
                break;
            case 144:
                {
                alt70=9;
                }
                break;
            case 145:
                {
                alt70=10;
                }
                break;
            case 146:
                {
                alt70=11;
                }
                break;
            case 147:
                {
                alt70=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3625:3: lv_type_8_1= 'Boolean'
                    {
                    lv_type_8_1=(Token)match(input,136,FOLLOW_136_in_ruleAttribute7689); 

                            newLeafNode(lv_type_8_1, grammarAccess.getAttributeAccess().getTypeBooleanKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3637:8: lv_type_8_2= 'Integer'
                    {
                    lv_type_8_2=(Token)match(input,137,FOLLOW_137_in_ruleAttribute7718); 

                            newLeafNode(lv_type_8_2, grammarAccess.getAttributeAccess().getTypeIntegerKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3649:8: lv_type_8_3= 'Decimal'
                    {
                    lv_type_8_3=(Token)match(input,138,FOLLOW_138_in_ruleAttribute7747); 

                            newLeafNode(lv_type_8_3, grammarAccess.getAttributeAccess().getTypeDecimalKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3661:8: lv_type_8_4= 'Currency'
                    {
                    lv_type_8_4=(Token)match(input,139,FOLLOW_139_in_ruleAttribute7776); 

                            newLeafNode(lv_type_8_4, grammarAccess.getAttributeAccess().getTypeCurrencyKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3673:8: lv_type_8_5= 'Date'
                    {
                    lv_type_8_5=(Token)match(input,140,FOLLOW_140_in_ruleAttribute7805); 

                            newLeafNode(lv_type_8_5, grammarAccess.getAttributeAccess().getTypeDateKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3685:8: lv_type_8_6= 'Time'
                    {
                    lv_type_8_6=(Token)match(input,141,FOLLOW_141_in_ruleAttribute7834); 

                            newLeafNode(lv_type_8_6, grammarAccess.getAttributeAccess().getTypeTimeKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3697:8: lv_type_8_7= 'Datetime'
                    {
                    lv_type_8_7=(Token)match(input,142,FOLLOW_142_in_ruleAttribute7863); 

                            newLeafNode(lv_type_8_7, grammarAccess.getAttributeAccess().getTypeDatetimeKeyword_6_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3709:8: lv_type_8_8= 'Enumeration'
                    {
                    lv_type_8_8=(Token)match(input,143,FOLLOW_143_in_ruleAttribute7892); 

                            newLeafNode(lv_type_8_8, grammarAccess.getAttributeAccess().getTypeEnumerationKeyword_6_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3721:8: lv_type_8_9= 'Text'
                    {
                    lv_type_8_9=(Token)match(input,144,FOLLOW_144_in_ruleAttribute7921); 

                            newLeafNode(lv_type_8_9, grammarAccess.getAttributeAccess().getTypeTextKeyword_6_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3733:8: lv_type_8_10= 'Regex'
                    {
                    lv_type_8_10=(Token)match(input,145,FOLLOW_145_in_ruleAttribute7950); 

                            newLeafNode(lv_type_8_10, grammarAccess.getAttributeAccess().getTypeRegexKeyword_6_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3745:8: lv_type_8_11= 'URL'
                    {
                    lv_type_8_11=(Token)match(input,146,FOLLOW_146_in_ruleAttribute7979); 

                            newLeafNode(lv_type_8_11, grammarAccess.getAttributeAccess().getTypeURLKeyword_6_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3757:8: lv_type_8_12= 'Image'
                    {
                    lv_type_8_12=(Token)match(input,147,FOLLOW_147_in_ruleAttribute8008); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3772:2: (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==148) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3772:4: otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,148,FOLLOW_148_in_ruleAttribute8037); 

                        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getSizeKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3776:1: ( (lv_size_10_0= RULE_INT ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3777:1: (lv_size_10_0= RULE_INT )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3777:1: (lv_size_10_0= RULE_INT )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3778:3: lv_size_10_0= RULE_INT
                    {
                    lv_size_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttribute8054); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3794:4: (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==149) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3794:6: otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) )
                    {
                    otherlv_11=(Token)match(input,149,FOLLOW_149_in_ruleAttribute8074); 

                        	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getMultiplicityKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3798:1: ( (lv_multiplicity_12_0= ruleMultiplicity ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3799:1: (lv_multiplicity_12_0= ruleMultiplicity )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3799:1: (lv_multiplicity_12_0= ruleMultiplicity )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3800:3: lv_multiplicity_12_0= ruleMultiplicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleAttribute8095);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3816:4: (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==150) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3816:6: otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,150,FOLLOW_150_in_ruleAttribute8110); 

                        	newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getDefaultValueKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3820:1: ( (lv_defaultValue_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3821:1: (lv_defaultValue_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3821:1: (lv_defaultValue_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3822:3: lv_defaultValue_14_0= RULE_STRING
                    {
                    lv_defaultValue_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute8127); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3838:4: ( (lv_notNull_15_0= 'NotNull' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==151) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3839:1: (lv_notNull_15_0= 'NotNull' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3839:1: (lv_notNull_15_0= 'NotNull' )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3840:3: lv_notNull_15_0= 'NotNull'
                    {
                    lv_notNull_15_0=(Token)match(input,151,FOLLOW_151_in_ruleAttribute8152); 

                            newLeafNode(lv_notNull_15_0, grammarAccess.getAttributeAccess().getNotNullNotNullKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "notNull", lv_notNull_15_0, "NotNull");
                    	    

                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3853:3: ( (lv_unique_16_0= 'Unique' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==152) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3854:1: (lv_unique_16_0= 'Unique' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3854:1: (lv_unique_16_0= 'Unique' )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3855:3: lv_unique_16_0= 'Unique'
                    {
                    lv_unique_16_0=(Token)match(input,152,FOLLOW_152_in_ruleAttribute8184); 

                            newLeafNode(lv_unique_16_0, grammarAccess.getAttributeAccess().getUniqueUniqueKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "unique", lv_unique_16_0, "Unique");
                    	    

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleAttribute8210); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3880:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3881:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3882:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity8246);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity8256); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3889:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3892:28: ( ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3893:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3893:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3894:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3894:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3895:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3895:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            int alt76=5;
            switch ( input.LA(1) ) {
            case 153:
                {
                alt76=1;
                }
                break;
            case 154:
                {
                alt76=2;
                }
                break;
            case 155:
                {
                alt76=3;
                }
                break;
            case 156:
                {
                alt76=4;
                }
                break;
            case RULE_STRING:
                {
                alt76=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3896:3: lv_value_0_1= '\"0\"'
                    {
                    lv_value_0_1=(Token)match(input,153,FOLLOW_153_in_ruleMultiplicity8300); 

                            newLeafNode(lv_value_0_1, grammarAccess.getMultiplicityAccess().getValue0Keyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3908:8: lv_value_0_2= '\"1\"'
                    {
                    lv_value_0_2=(Token)match(input,154,FOLLOW_154_in_ruleMultiplicity8329); 

                            newLeafNode(lv_value_0_2, grammarAccess.getMultiplicityAccess().getValue1Keyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3920:8: lv_value_0_3= '\"0..1\"'
                    {
                    lv_value_0_3=(Token)match(input,155,FOLLOW_155_in_ruleMultiplicity8358); 

                            newLeafNode(lv_value_0_3, grammarAccess.getMultiplicityAccess().getValue01Keyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3932:8: lv_value_0_4= '\"*\"'
                    {
                    lv_value_0_4=(Token)match(input,156,FOLLOW_156_in_ruleMultiplicity8387); 

                            newLeafNode(lv_value_0_4, grammarAccess.getMultiplicityAccess().getValueQuotationMarkAsteriskQuotationMarkKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3944:8: lv_value_0_5= RULE_STRING
                    {
                    lv_value_0_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiplicity8415); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3970:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3971:2: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3972:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey8458);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;

             current =iv_rulePrimaryKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryKey8468); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3979:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refTo_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3982:28: ( (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3983:1: (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3983:1: (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3983:3: otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,157,FOLLOW_157_in_rulePrimaryKey8505); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPrimaryKeyKeyword_0());
                
            otherlv_1=(Token)match(input,158,FOLLOW_158_in_rulePrimaryKey8517); 

                	newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3991:1: ( (lv_refTo_2_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3992:1: (lv_refTo_2_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3992:1: (lv_refTo_2_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3993:3: lv_refTo_2_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getPrimaryKeyAccess().getRefToRefAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_rulePrimaryKey8538);
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

            otherlv_3=(Token)match(input,159,FOLLOW_159_in_rulePrimaryKey8550); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4021:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4022:2: (iv_ruleForeignKey= ruleForeignKey EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4023:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_ruleForeignKey_in_entryRuleForeignKey8586);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignKey8596); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4030:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4033:28: ( (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4034:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4034:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4034:3: otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            {
            otherlv_0=(Token)match(input,160,FOLLOW_160_in_ruleForeignKey8633); 

                	newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getForeignKeyKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4038:1: ( (otherlv_1= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4039:1: (otherlv_1= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4039:1: (otherlv_1= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4040:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForeignKeyRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeignKey8653); 

            		newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getEntityEntityCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,158,FOLLOW_158_in_ruleForeignKey8665); 

                	newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4055:1: ( (lv_refTo_3_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4056:1: (lv_refTo_3_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4056:1: (lv_refTo_3_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4057:3: lv_refTo_3_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getRefToRefAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_ruleForeignKey8686);
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

            otherlv_4=(Token)match(input,159,FOLLOW_159_in_ruleForeignKey8698); 

                	newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,149,FOLLOW_149_in_ruleForeignKey8710); 

                	newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getMultiplicityKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4081:1: ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4082:1: (lv_multiplicity_6_0= ruleMultiplicity )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4082:1: (lv_multiplicity_6_0= ruleMultiplicity )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4083:3: lv_multiplicity_6_0= ruleMultiplicity
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getMultiplicityMultiplicityParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleForeignKey8731);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4107:1: entryRuleRefAttribute returns [EObject current=null] : iv_ruleRefAttribute= ruleRefAttribute EOF ;
    public final EObject entryRuleRefAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4108:2: (iv_ruleRefAttribute= ruleRefAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4109:2: iv_ruleRefAttribute= ruleRefAttribute EOF
            {
             newCompositeNode(grammarAccess.getRefAttributeRule()); 
            pushFollow(FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute8767);
            iv_ruleRefAttribute=ruleRefAttribute();

            state._fsp--;

             current =iv_ruleRefAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefAttribute8777); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4116:1: ruleRefAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4119:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4120:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4120:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4120:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4120:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4121:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4121:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4122:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute8822); 

            		newLeafNode(otherlv_0, grammarAccess.getRefAttributeAccess().getRefAttrAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4133:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==92) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4133:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefAttribute8835); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefAttributeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4137:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4138:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4138:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4139:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute8855); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefAttributeAccess().getRefsAttributeCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4158:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4159:2: (iv_ruleCheck= ruleCheck EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4160:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck8893);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck8903); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4167:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_checkExpression_2_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4170:28: ( (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4171:1: (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4171:1: (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4171:3: otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,161,FOLLOW_161_in_ruleCheck8940); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4175:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4176:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4176:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4177:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheck8957); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4193:2: ( (lv_checkExpression_2_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4194:1: (lv_checkExpression_2_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4194:1: (lv_checkExpression_2_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4195:3: lv_checkExpression_2_0= RULE_STRING
            {
            lv_checkExpression_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheck8979); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4219:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4220:2: (iv_ruleActor= ruleActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4221:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor9020);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor9030); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4228:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4231:28: ( (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4232:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4232:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4232:3: otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleActor9067); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4236:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4237:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4237:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4238:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor9084); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActor9101); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4258:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==19) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4258:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleActor9114); 

                        	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4262:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4263:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4263:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4264:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor9131); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4280:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==37) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4280:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleActor9151); 

                        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4284:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4285:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4285:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4286:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor9168); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleActor9187); 

                	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4306:1: ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4307:1: ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4307:1: ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4308:1: (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4308:1: (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 162:
                {
                alt80=1;
                }
                break;
            case 163:
                {
                alt80=2;
                }
                break;
            case 164:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4309:3: lv_type_8_1= 'User'
                    {
                    lv_type_8_1=(Token)match(input,162,FOLLOW_162_in_ruleActor9207); 

                            newLeafNode(lv_type_8_1, grammarAccess.getActorAccess().getTypeUserKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4321:8: lv_type_8_2= 'ExternalSystem'
                    {
                    lv_type_8_2=(Token)match(input,163,FOLLOW_163_in_ruleActor9236); 

                            newLeafNode(lv_type_8_2, grammarAccess.getActorAccess().getTypeExternalSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4333:8: lv_type_8_3= 'Timer'
                    {
                    lv_type_8_3=(Token)match(input,164,FOLLOW_164_in_ruleActor9265); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4348:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==93) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4348:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,93,FOLLOW_93_in_ruleActor9294); 

                        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4352:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4353:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4353:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4354:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor9314); 

                    		newLeafNode(otherlv_10, grammarAccess.getActorAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4365:4: (otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==118) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4365:6: otherlv_11= 'IsA' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,118,FOLLOW_118_in_ruleActor9329); 

                        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getIsAKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4369:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4370:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4370:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4371:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor9349); 

                    		newLeafNode(otherlv_12, grammarAccess.getActorAccess().getActorActorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleActor9363); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4394:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4395:2: (iv_ruleUseCase= ruleUseCase EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4396:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase9399);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase9409); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4403:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4406:28: ( (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4407:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4407:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4407:3: otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,165,FOLLOW_165_in_ruleUseCase9446); 

                	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4411:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4412:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4412:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4413:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase9463); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUseCase9480); 

                	newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4433:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==19) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4433:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleUseCase9493); 

                        	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4437:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4438:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4438:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4439:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase9510); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4455:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==37) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4455:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleUseCase9530); 

                        	newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4459:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4460:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4460:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4461:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase9547); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleUseCase9566); 

                	newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4481:1: ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4482:1: ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4482:1: ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4483:1: (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4483:1: (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' )
            int alt85=7;
            switch ( input.LA(1) ) {
            case 166:
                {
                alt85=1;
                }
                break;
            case 167:
                {
                alt85=2;
                }
                break;
            case 168:
                {
                alt85=3;
                }
                break;
            case 169:
                {
                alt85=4;
                }
                break;
            case 170:
                {
                alt85=5;
                }
                break;
            case 171:
                {
                alt85=6;
                }
                break;
            case 172:
                {
                alt85=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4484:3: lv_type_8_1= 'EntityManage'
                    {
                    lv_type_8_1=(Token)match(input,166,FOLLOW_166_in_ruleUseCase9586); 

                            newLeafNode(lv_type_8_1, grammarAccess.getUseCaseAccess().getTypeEntityManageKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4496:8: lv_type_8_2= 'EntityBrowse'
                    {
                    lv_type_8_2=(Token)match(input,167,FOLLOW_167_in_ruleUseCase9615); 

                            newLeafNode(lv_type_8_2, grammarAccess.getUseCaseAccess().getTypeEntityBrowseKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4508:8: lv_type_8_3= 'EntitySearch'
                    {
                    lv_type_8_3=(Token)match(input,168,FOLLOW_168_in_ruleUseCase9644); 

                            newLeafNode(lv_type_8_3, grammarAccess.getUseCaseAccess().getTypeEntitySearchKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4520:8: lv_type_8_4= 'EntityCreate'
                    {
                    lv_type_8_4=(Token)match(input,169,FOLLOW_169_in_ruleUseCase9673); 

                            newLeafNode(lv_type_8_4, grammarAccess.getUseCaseAccess().getTypeEntityCreateKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4532:8: lv_type_8_5= 'EntityDelete'
                    {
                    lv_type_8_5=(Token)match(input,170,FOLLOW_170_in_ruleUseCase9702); 

                            newLeafNode(lv_type_8_5, grammarAccess.getUseCaseAccess().getTypeEntityDeleteKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4544:8: lv_type_8_6= 'EntitySync'
                    {
                    lv_type_8_6=(Token)match(input,171,FOLLOW_171_in_ruleUseCase9731); 

                            newLeafNode(lv_type_8_6, grammarAccess.getUseCaseAccess().getTypeEntitySyncKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4556:8: lv_type_8_7= 'Report'
                    {
                    lv_type_8_7=(Token)match(input,172,FOLLOW_172_in_ruleUseCase9760); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4571:2: (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==173) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4571:4: otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) )
                    {
                    otherlv_9=(Token)match(input,173,FOLLOW_173_in_ruleUseCase9789); 

                        	newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getEntitiesKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4575:1: ( (lv_entities_10_0= ruleRefEntity ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4576:1: (lv_entities_10_0= ruleRefEntity )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4576:1: (lv_entities_10_0= ruleRefEntity )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4577:3: lv_entities_10_0= ruleRefEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getEntitiesRefEntityParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefEntity_in_ruleUseCase9810);
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

            otherlv_11=(Token)match(input,120,FOLLOW_120_in_ruleUseCase9824); 

                	newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4597:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4598:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4598:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4599:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getUseCaseAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleUseCase9845);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4615:2: ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==187) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4616:1: (lv_extensionPoints_13_0= ruleExtensionPoint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4616:1: (lv_extensionPoints_13_0= ruleExtensionPoint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4617:3: lv_extensionPoints_13_0= ruleExtensionPoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtensionPoint_in_ruleUseCase9866);
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
            	    break loop87;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4633:3: (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==174) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4633:5: otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )*
                    {
                    otherlv_14=(Token)match(input,174,FOLLOW_174_in_ruleUseCase9880); 

                        	newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getGoalsKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4637:1: ( (lv_goals_15_0= ruleRefGoal ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==RULE_ID) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4638:1: (lv_goals_15_0= ruleRefGoal )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4638:1: (lv_goals_15_0= ruleRefGoal )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4639:3: lv_goals_15_0= ruleRefGoal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getGoalsRefGoalParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefGoal_in_ruleUseCase9901);
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
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4655:5: (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==175) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4655:7: otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )*
                    {
                    otherlv_16=(Token)match(input,175,FOLLOW_175_in_ruleUseCase9917); 

                        	newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getFunctionalRequirementsKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4659:1: ( (lv_frs_17_0= ruleRefFR ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==RULE_ID) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4660:1: (lv_frs_17_0= ruleRefFR )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4660:1: (lv_frs_17_0= ruleRefFR )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4661:3: lv_frs_17_0= ruleRefFR
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getFrsRefFRParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefFR_in_ruleUseCase9938);
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
                    	    break loop90;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,176,FOLLOW_176_in_ruleUseCase9953); 

                	newLeafNode(otherlv_18, grammarAccess.getUseCaseAccess().getActorInitiatesKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4681:1: ( (otherlv_19= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4682:1: (otherlv_19= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4682:1: (otherlv_19= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4683:3: otherlv_19= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
            otherlv_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase9973); 

            		newLeafNode(otherlv_19, grammarAccess.getUseCaseAccess().getActorInitiatesActorCrossReference_14_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4694:2: (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==177) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4694:4: otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) )
                    {
                    otherlv_20=(Token)match(input,177,FOLLOW_177_in_ruleUseCase9986); 

                        	newLeafNode(otherlv_20, grammarAccess.getUseCaseAccess().getActorParticipatesKeyword_15_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4698:1: ( (lv_actors_21_0= ruleRefActor ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4699:1: (lv_actors_21_0= ruleRefActor )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4699:1: (lv_actors_21_0= ruleRefActor )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4700:3: lv_actors_21_0= ruleRefActor
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getActorsRefActorParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefActor_in_ruleUseCase10007);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4716:4: (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==178) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4716:6: otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) )
                    {
                    otherlv_22=(Token)match(input,178,FOLLOW_178_in_ruleUseCase10022); 

                        	newLeafNode(otherlv_22, grammarAccess.getUseCaseAccess().getPreConditionsKeyword_16_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4720:1: ( (lv_preConditions_23_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4721:1: (lv_preConditions_23_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4721:1: (lv_preConditions_23_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4722:3: lv_preConditions_23_0= RULE_STRING
                    {
                    lv_preConditions_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase10039); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4738:4: (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==179) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4738:6: otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) )
                    {
                    otherlv_24=(Token)match(input,179,FOLLOW_179_in_ruleUseCase10059); 

                        	newLeafNode(otherlv_24, grammarAccess.getUseCaseAccess().getPostConditionsKeyword_17_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4742:1: ( (lv_postConditions_25_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4743:1: (lv_postConditions_25_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4743:1: (lv_postConditions_25_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4744:3: lv_postConditions_25_0= RULE_STRING
                    {
                    lv_postConditions_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase10076); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4760:4: (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==180) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4760:6: otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )*
                    {
                    otherlv_26=(Token)match(input,180,FOLLOW_180_in_ruleUseCase10096); 

                        	newLeafNode(otherlv_26, grammarAccess.getUseCaseAccess().getIncludeKeyword_18_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4764:1: ( (lv_includes_27_0= ruleRefUC ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==RULE_ID) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4765:1: (lv_includes_27_0= ruleRefUC )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4765:1: (lv_includes_27_0= ruleRefUC )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4766:3: lv_includes_27_0= ruleRefUC
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getIncludesRefUCParserRuleCall_18_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefUC_in_ruleUseCase10117);
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
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4782:5: (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==181) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4782:7: otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) )
                    {
                    otherlv_28=(Token)match(input,181,FOLLOW_181_in_ruleUseCase10133); 

                        	newLeafNode(otherlv_28, grammarAccess.getUseCaseAccess().getExtendKeyword_19_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4786:1: ( (otherlv_29= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4787:1: (otherlv_29= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4787:1: (otherlv_29= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4788:3: otherlv_29= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase10153); 

                    		newLeafNode(otherlv_29, grammarAccess.getUseCaseAccess().getExtendsUseCaseCrossReference_19_1_0()); 
                    	

                    }


                    }

                    otherlv_30=(Token)match(input,182,FOLLOW_182_in_ruleUseCase10165); 

                        	newLeafNode(otherlv_30, grammarAccess.getUseCaseAccess().getOnKeyword_19_2());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4803:1: ( (otherlv_31= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4804:1: (otherlv_31= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4804:1: (otherlv_31= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4805:3: otherlv_31= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase10185); 

                    		newLeafNode(otherlv_31, grammarAccess.getUseCaseAccess().getExtPointExtensionPointCrossReference_19_3_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4816:4: ( (lv_scenarios_32_0= ruleScenario ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==188) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4817:1: (lv_scenarios_32_0= ruleScenario )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4817:1: (lv_scenarios_32_0= ruleScenario )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4818:3: lv_scenarios_32_0= ruleScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getScenariosScenarioParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScenario_in_ruleUseCase10208);
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
            	    break loop98;
                }
            } while (true);

            otherlv_33=(Token)match(input,13,FOLLOW_13_in_ruleUseCase10221); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4846:1: entryRuleRefEntity returns [EObject current=null] : iv_ruleRefEntity= ruleRefEntity EOF ;
    public final EObject entryRuleRefEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4847:2: (iv_ruleRefEntity= ruleRefEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4848:2: iv_ruleRefEntity= ruleRefEntity EOF
            {
             newCompositeNode(grammarAccess.getRefEntityRule()); 
            pushFollow(FOLLOW_ruleRefEntity_in_entryRuleRefEntity10257);
            iv_ruleRefEntity=ruleRefEntity();

            state._fsp--;

             current =iv_ruleRefEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefEntity10267); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4855:1: ruleRefEntity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4858:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4859:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4859:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4859:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4859:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4860:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4860:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4861:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefEntityRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEntity10312); 

            		newLeafNode(otherlv_0, grammarAccess.getRefEntityAccess().getRefEntityEntityCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,183,FOLLOW_183_in_ruleRefEntity10324); 

                	newLeafNode(otherlv_1, grammarAccess.getRefEntityAccess().getAsKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4876:1: ( (lv_type_2_0= ruleEntityType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4877:1: (lv_type_2_0= ruleEntityType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4877:1: (lv_type_2_0= ruleEntityType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4878:3: lv_type_2_0= ruleEntityType
            {
             
            	        newCompositeNode(grammarAccess.getRefEntityAccess().getTypeEntityTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEntityType_in_ruleRefEntity10345);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4894:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==92) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4894:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) )
            	    {
            	    otherlv_3=(Token)match(input,92,FOLLOW_92_in_ruleRefEntity10358); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRefEntityAccess().getCommaKeyword_3_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4898:1: ( (otherlv_4= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4899:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4899:1: (otherlv_4= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4900:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefEntityRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEntity10378); 

            	    		newLeafNode(otherlv_4, grammarAccess.getRefEntityAccess().getRefsEntityCrossReference_3_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_5=(Token)match(input,183,FOLLOW_183_in_ruleRefEntity10390); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRefEntityAccess().getAsKeyword_3_2());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4915:1: ( (lv_refType_6_0= ruleEntityType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4916:1: (lv_refType_6_0= ruleEntityType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4916:1: (lv_refType_6_0= ruleEntityType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4917:3: lv_refType_6_0= ruleEntityType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefEntityAccess().getRefTypeEntityTypeParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityType_in_ruleRefEntity10411);
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
            	    break loop99;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4941:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4942:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4943:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType10449);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType10459); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4950:1: ruleEntityType returns [EObject current=null] : ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4953:28: ( ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4954:1: ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4954:1: ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4955:1: ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4955:1: ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4956:1: (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4956:1: (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' )
            int alt100=3;
            switch ( input.LA(1) ) {
            case 184:
                {
                alt100=1;
                }
                break;
            case 185:
                {
                alt100=2;
                }
                break;
            case 186:
                {
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4957:3: lv_type_0_1= 'Master'
                    {
                    lv_type_0_1=(Token)match(input,184,FOLLOW_184_in_ruleEntityType10503); 

                            newLeafNode(lv_type_0_1, grammarAccess.getEntityTypeAccess().getTypeMasterKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4969:8: lv_type_0_2= 'Detail'
                    {
                    lv_type_0_2=(Token)match(input,185,FOLLOW_185_in_ruleEntityType10532); 

                            newLeafNode(lv_type_0_2, grammarAccess.getEntityTypeAccess().getTypeDetailKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4981:8: lv_type_0_3= 'Reference'
                    {
                    lv_type_0_3=(Token)match(input,186,FOLLOW_186_in_ruleEntityType10561); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5004:1: entryRuleRefFR returns [EObject current=null] : iv_ruleRefFR= ruleRefFR EOF ;
    public final EObject entryRuleRefFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5005:2: (iv_ruleRefFR= ruleRefFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5006:2: iv_ruleRefFR= ruleRefFR EOF
            {
             newCompositeNode(grammarAccess.getRefFRRule()); 
            pushFollow(FOLLOW_ruleRefFR_in_entryRuleRefFR10612);
            iv_ruleRefFR=ruleRefFR();

            state._fsp--;

             current =iv_ruleRefFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefFR10622); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5013:1: ruleRefFR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5016:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5017:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5017:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5017:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5017:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5018:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5018:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5019:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefFRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR10667); 

            		newLeafNode(otherlv_0, grammarAccess.getRefFRAccess().getRefFRFRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5030:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==92) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5030:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefFR10680); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefFRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5034:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5035:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5035:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5036:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefFRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR10700); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefFRAccess().getRefsFRCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5055:1: entryRuleRefActor returns [EObject current=null] : iv_ruleRefActor= ruleRefActor EOF ;
    public final EObject entryRuleRefActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5056:2: (iv_ruleRefActor= ruleRefActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5057:2: iv_ruleRefActor= ruleRefActor EOF
            {
             newCompositeNode(grammarAccess.getRefActorRule()); 
            pushFollow(FOLLOW_ruleRefActor_in_entryRuleRefActor10738);
            iv_ruleRefActor=ruleRefActor();

            state._fsp--;

             current =iv_ruleRefActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefActor10748); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5064:1: ruleRefActor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5067:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5068:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5068:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5068:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5068:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5069:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5069:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5070:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefActorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefActor10793); 

            		newLeafNode(otherlv_0, grammarAccess.getRefActorAccess().getRefActorActorCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5081:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==92) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5081:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefActor10806); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefActorAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5085:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5086:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5086:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5087:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefActorRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefActor10826); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefActorAccess().getRefsActorCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleRefActor"


    // $ANTLR start "entryRuleRefUC"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5106:1: entryRuleRefUC returns [EObject current=null] : iv_ruleRefUC= ruleRefUC EOF ;
    public final EObject entryRuleRefUC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefUC = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5107:2: (iv_ruleRefUC= ruleRefUC EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5108:2: iv_ruleRefUC= ruleRefUC EOF
            {
             newCompositeNode(grammarAccess.getRefUCRule()); 
            pushFollow(FOLLOW_ruleRefUC_in_entryRuleRefUC10864);
            iv_ruleRefUC=ruleRefUC();

            state._fsp--;

             current =iv_ruleRefUC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefUC10874); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5115:1: ruleRefUC returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefUC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5118:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5119:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5119:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5119:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5119:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5120:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5120:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5121:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefUCRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC10919); 

            		newLeafNode(otherlv_0, grammarAccess.getRefUCAccess().getRefUCUseCaseCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5132:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==92) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5132:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleRefUC10932); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefUCAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5136:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5137:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5137:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5138:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefUCRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC10952); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefUCAccess().getRefsUseCaseCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleRefUC"


    // $ANTLR start "entryRuleExtensionPoint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5157:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5158:2: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5159:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
            {
             newCompositeNode(grammarAccess.getExtensionPointRule()); 
            pushFollow(FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint10990);
            iv_ruleExtensionPoint=ruleExtensionPoint();

            state._fsp--;

             current =iv_ruleExtensionPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionPoint11000); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5166:1: ruleExtensionPoint returns [EObject current=null] : (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5169:28: ( (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5170:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5170:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5170:3: otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,187,FOLLOW_187_in_ruleExtensionPoint11037); 

                	newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getExtensionPointKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5174:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5175:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5175:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5176:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtensionPoint11054); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5192:2: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==37) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5192:4: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleExtensionPoint11072); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtensionPointAccess().getDescriptionKeyword_2_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5196:1: ( (lv_description_3_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5197:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5197:1: (lv_description_3_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5198:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExtensionPoint11089); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5222:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5223:2: (iv_ruleScenario= ruleScenario EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5224:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario11132);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario11142); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5231:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5234:28: ( (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5235:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5235:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5235:3: otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,188,FOLLOW_188_in_ruleScenario11179); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5239:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5240:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5240:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5241:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScenario11196); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleScenario11213); 

                	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5261:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==19) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5261:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleScenario11226); 

                        	newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5265:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5266:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5266:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5267:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario11243); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5283:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==37) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5283:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleScenario11263); 

                        	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5287:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5288:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5288:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5289:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario11280); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleScenario11299); 

                	newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5309:1: ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5310:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5310:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5311:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5311:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            int alt107=3;
            switch ( input.LA(1) ) {
            case 189:
                {
                alt107=1;
                }
                break;
            case 190:
                {
                alt107=2;
                }
                break;
            case 191:
                {
                alt107=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5312:3: lv_type_8_1= 'Main'
                    {
                    lv_type_8_1=(Token)match(input,189,FOLLOW_189_in_ruleScenario11319); 

                            newLeafNode(lv_type_8_1, grammarAccess.getScenarioAccess().getTypeMainKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5324:8: lv_type_8_2= 'Alternative'
                    {
                    lv_type_8_2=(Token)match(input,190,FOLLOW_190_in_ruleScenario11348); 

                            newLeafNode(lv_type_8_2, grammarAccess.getScenarioAccess().getTypeAlternativeKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5336:8: lv_type_8_3= 'Exception'
                    {
                    lv_type_8_3=(Token)match(input,191,FOLLOW_191_in_ruleScenario11377); 

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

            otherlv_9=(Token)match(input,192,FOLLOW_192_in_ruleScenario11405); 

                	newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getExecutionModeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5355:1: ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5356:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5356:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5357:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5357:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==193) ) {
                alt108=1;
            }
            else if ( (LA108_0==194) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5358:3: lv_mode_10_1= 'Sequential'
                    {
                    lv_mode_10_1=(Token)match(input,193,FOLLOW_193_in_ruleScenario11425); 

                            newLeafNode(lv_mode_10_1, grammarAccess.getScenarioAccess().getModeSequentialKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "mode", lv_mode_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5370:8: lv_mode_10_2= 'Parallel'
                    {
                    lv_mode_10_2=(Token)match(input,194,FOLLOW_194_in_ruleScenario11454); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5385:2: ( (lv_steps_11_0= ruleStep ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==195) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5386:1: (lv_steps_11_0= ruleStep )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5386:1: (lv_steps_11_0= ruleStep )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5387:3: lv_steps_11_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenario11491);
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
            	    break loop109;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleScenario11504); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5415:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5416:2: (iv_ruleStep= ruleStep EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5417:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep11540);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep11550); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5424:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5427:28: ( (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5428:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5428:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5428:3: otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,195,FOLLOW_195_in_ruleStep11587); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5432:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5433:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5433:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5434:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep11604); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStep11621); 

                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5454:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==19) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5454:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStep11634); 

                        	newLeafNode(otherlv_3, grammarAccess.getStepAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5458:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5459:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5459:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5460:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11651); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5476:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==37) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5476:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleStep11671); 

                        	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5480:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5481:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5481:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5482:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11688); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStep11707); 

                	newLeafNode(otherlv_7, grammarAccess.getStepAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5502:1: ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5503:1: ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5503:1: ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5504:1: (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5504:1: (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' )
            int alt112=5;
            switch ( input.LA(1) ) {
            case 196:
                {
                alt112=1;
                }
                break;
            case 197:
                {
                alt112=2;
                }
                break;
            case 198:
                {
                alt112=3;
                }
                break;
            case 199:
                {
                alt112=4;
                }
                break;
            case 27:
                {
                alt112=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5505:3: lv_type_8_1= 'ActorPrepareData'
                    {
                    lv_type_8_1=(Token)match(input,196,FOLLOW_196_in_ruleStep11727); 

                            newLeafNode(lv_type_8_1, grammarAccess.getStepAccess().getTypeActorPrepareDataKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5517:8: lv_type_8_2= 'ActorCallSystem'
                    {
                    lv_type_8_2=(Token)match(input,197,FOLLOW_197_in_ruleStep11756); 

                            newLeafNode(lv_type_8_2, grammarAccess.getStepAccess().getTypeActorCallSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5529:8: lv_type_8_3= 'SystemExecutes'
                    {
                    lv_type_8_3=(Token)match(input,198,FOLLOW_198_in_ruleStep11785); 

                            newLeafNode(lv_type_8_3, grammarAccess.getStepAccess().getTypeSystemExecutesKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5541:8: lv_type_8_4= 'SystemReturnResult'
                    {
                    lv_type_8_4=(Token)match(input,199,FOLLOW_199_in_ruleStep11814); 

                            newLeafNode(lv_type_8_4, grammarAccess.getStepAccess().getTypeSystemReturnResultKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5553:8: lv_type_8_5= 'Other'
                    {
                    lv_type_8_5=(Token)match(input,27,FOLLOW_27_in_ruleStep11843); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5568:2: (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==96) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5568:4: otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,96,FOLLOW_96_in_ruleStep11872); 

                        	newLeafNode(otherlv_9, grammarAccess.getStepAccess().getActorKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5572:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5573:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5573:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5574:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep11892); 

                    		newLeafNode(otherlv_10, grammarAccess.getStepAccess().getActorActorCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5585:4: (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==178) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5585:6: otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,178,FOLLOW_178_in_ruleStep11907); 

                        	newLeafNode(otherlv_11, grammarAccess.getStepAccess().getPreConditionsKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5589:1: ( (lv_preConditions_12_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5590:1: (lv_preConditions_12_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5590:1: (lv_preConditions_12_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5591:3: lv_preConditions_12_0= RULE_STRING
                    {
                    lv_preConditions_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11924); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5607:4: (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==179) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5607:6: otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,179,FOLLOW_179_in_ruleStep11944); 

                        	newLeafNode(otherlv_13, grammarAccess.getStepAccess().getPostConditionsKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5611:1: ( (lv_postConditions_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5612:1: (lv_postConditions_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5612:1: (lv_postConditions_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5613:3: lv_postConditions_14_0= RULE_STRING
                    {
                    lv_postConditions_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11961); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5629:4: (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==200) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5629:6: otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,200,FOLLOW_200_in_ruleStep11981); 

                        	newLeafNode(otherlv_15, grammarAccess.getStepAccess().getNextStepKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5633:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5634:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5634:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5635:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep12001); 

                    		newLeafNode(otherlv_16, grammarAccess.getStepAccess().getNextStepCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleStep12015); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5658:1: entryRuleFR returns [EObject current=null] : iv_ruleFR= ruleFR EOF ;
    public final EObject entryRuleFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5659:2: (iv_ruleFR= ruleFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5660:2: iv_ruleFR= ruleFR EOF
            {
             newCompositeNode(grammarAccess.getFRRule()); 
            pushFollow(FOLLOW_ruleFR_in_entryRuleFR12051);
            iv_ruleFR=ruleFR();

            state._fsp--;

             current =iv_ruleFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFR12061); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5667:1: ruleFR returns [EObject current=null] : (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5670:28: ( (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5671:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5671:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5671:3: otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,201,FOLLOW_201_in_ruleFR12098); 

                	newLeafNode(otherlv_0, grammarAccess.getFRAccess().getFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5675:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5676:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5676:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5677:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR12115); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFR12132); 

                	newLeafNode(otherlv_2, grammarAccess.getFRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5697:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==19) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5697:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFR12145); 

                        	newLeafNode(otherlv_3, grammarAccess.getFRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5701:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5702:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5702:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5703:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR12162); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5719:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==37) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5719:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleFR12182); 

                        	newLeafNode(otherlv_5, grammarAccess.getFRAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5723:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5724:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5724:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5725:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR12199); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleFR12218); 

                	newLeafNode(otherlv_7, grammarAccess.getFRAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5745:1: ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5746:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5746:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5747:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5747:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            int alt119=3;
            switch ( input.LA(1) ) {
            case 202:
                {
                alt119=1;
                }
                break;
            case 203:
                {
                alt119=2;
                }
                break;
            case 204:
                {
                alt119=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5748:3: lv_type_8_1= 'Functional'
                    {
                    lv_type_8_1=(Token)match(input,202,FOLLOW_202_in_ruleFR12238); 

                            newLeafNode(lv_type_8_1, grammarAccess.getFRAccess().getTypeFunctionalKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5760:8: lv_type_8_2= 'Behavioral'
                    {
                    lv_type_8_2=(Token)match(input,203,FOLLOW_203_in_ruleFR12267); 

                            newLeafNode(lv_type_8_2, grammarAccess.getFRAccess().getTypeBehavioralKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5772:8: lv_type_8_3= 'Data'
                    {
                    lv_type_8_3=(Token)match(input,204,FOLLOW_204_in_ruleFR12296); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5787:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==93) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5787:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,93,FOLLOW_93_in_ruleFR12325); 

                        	newLeafNode(otherlv_9, grammarAccess.getFRAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5791:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5792:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5792:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5793:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR12345); 

                    		newLeafNode(otherlv_10, grammarAccess.getFRAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,120,FOLLOW_120_in_ruleFR12359); 

                	newLeafNode(otherlv_11, grammarAccess.getFRAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5808:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5809:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5809:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5810:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getFRAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleFR12380);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5826:2: (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==72) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5826:4: otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,72,FOLLOW_72_in_ruleFR12393); 

                        	newLeafNode(otherlv_13, grammarAccess.getFRAccess().getPartOfKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5830:1: ( (otherlv_14= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5831:1: (otherlv_14= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5831:1: (otherlv_14= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5832:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR12413); 

                    		newLeafNode(otherlv_14, grammarAccess.getFRAccess().getPartOfFRCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5843:4: (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==35) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5843:6: otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) )
                    {
                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleFR12428); 

                        	newLeafNode(otherlv_15, grammarAccess.getFRAccess().getProjectProgressKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5847:1: ( (lv_progress_16_0= ruleProjectProgress ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5848:1: (lv_progress_16_0= ruleProjectProgress )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5848:1: (lv_progress_16_0= ruleProjectProgress )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5849:3: lv_progress_16_0= ruleProjectProgress
                    {
                     
                    	        newCompositeNode(grammarAccess.getFRAccess().getProgressProjectProgressParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectProgress_in_ruleFR12449);
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

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleFR12463); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5877:1: entryRuleQR returns [EObject current=null] : iv_ruleQR= ruleQR EOF ;
    public final EObject entryRuleQR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5878:2: (iv_ruleQR= ruleQR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5879:2: iv_ruleQR= ruleQR EOF
            {
             newCompositeNode(grammarAccess.getQRRule()); 
            pushFollow(FOLLOW_ruleQR_in_entryRuleQR12499);
            iv_ruleQR=ruleQR();

            state._fsp--;

             current =iv_ruleQR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQR12509); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5886:1: ruleQR returns [EObject current=null] : (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5889:28: ( (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5890:1: (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5890:1: (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5890:3: otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )? (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,205,FOLLOW_205_in_ruleQR12546); 

                	newLeafNode(otherlv_0, grammarAccess.getQRAccess().getQualityRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5894:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5895:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5895:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5896:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR12563); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQR12580); 

                	newLeafNode(otherlv_2, grammarAccess.getQRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5916:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==19) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5916:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleQR12593); 

                        	newLeafNode(otherlv_3, grammarAccess.getQRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5920:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5921:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5921:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5922:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQR12610); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5938:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==37) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5938:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleQR12630); 

                        	newLeafNode(otherlv_5, grammarAccess.getQRAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5942:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5943:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5943:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5944:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQR12647); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleQR12666); 

                	newLeafNode(otherlv_7, grammarAccess.getQRAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5964:1: ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5965:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5965:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5966:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5966:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            int alt125=8;
            switch ( input.LA(1) ) {
            case 206:
                {
                alt125=1;
                }
                break;
            case 207:
                {
                alt125=2;
                }
                break;
            case 208:
                {
                alt125=3;
                }
                break;
            case 209:
                {
                alt125=4;
                }
                break;
            case 210:
                {
                alt125=5;
                }
                break;
            case 211:
                {
                alt125=6;
                }
                break;
            case 212:
                {
                alt125=7;
                }
                break;
            case 213:
                {
                alt125=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5967:3: lv_type_8_1= 'Security'
                    {
                    lv_type_8_1=(Token)match(input,206,FOLLOW_206_in_ruleQR12686); 

                            newLeafNode(lv_type_8_1, grammarAccess.getQRAccess().getTypeSecurityKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5979:8: lv_type_8_2= 'Performance'
                    {
                    lv_type_8_2=(Token)match(input,207,FOLLOW_207_in_ruleQR12715); 

                            newLeafNode(lv_type_8_2, grammarAccess.getQRAccess().getTypePerformanceKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5991:8: lv_type_8_3= 'Usability'
                    {
                    lv_type_8_3=(Token)match(input,208,FOLLOW_208_in_ruleQR12744); 

                            newLeafNode(lv_type_8_3, grammarAccess.getQRAccess().getTypeUsabilityKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6003:8: lv_type_8_4= 'Appearance'
                    {
                    lv_type_8_4=(Token)match(input,209,FOLLOW_209_in_ruleQR12773); 

                            newLeafNode(lv_type_8_4, grammarAccess.getQRAccess().getTypeAppearanceKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6015:8: lv_type_8_5= 'Operational'
                    {
                    lv_type_8_5=(Token)match(input,210,FOLLOW_210_in_ruleQR12802); 

                            newLeafNode(lv_type_8_5, grammarAccess.getQRAccess().getTypeOperationalKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6027:8: lv_type_8_6= 'Maintenance'
                    {
                    lv_type_8_6=(Token)match(input,211,FOLLOW_211_in_ruleQR12831); 

                            newLeafNode(lv_type_8_6, grammarAccess.getQRAccess().getTypeMaintenanceKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6039:8: lv_type_8_7= 'Cultural'
                    {
                    lv_type_8_7=(Token)match(input,212,FOLLOW_212_in_ruleQR12860); 

                            newLeafNode(lv_type_8_7, grammarAccess.getQRAccess().getTypeCulturalKeyword_6_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6051:8: lv_type_8_8= 'Legal'
                    {
                    lv_type_8_8=(Token)match(input,213,FOLLOW_213_in_ruleQR12889); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6066:2: (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==214) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6066:4: otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    {
                    otherlv_9=(Token)match(input,214,FOLLOW_214_in_ruleQR12918); 

                        	newLeafNode(otherlv_9, grammarAccess.getQRAccess().getSubTypeKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6070:1: ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6071:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6071:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6072:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6072:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    int alt126=5;
                    switch ( input.LA(1) ) {
                    case 215:
                        {
                        alt126=1;
                        }
                        break;
                    case 216:
                        {
                        alt126=2;
                        }
                        break;
                    case 217:
                        {
                        alt126=3;
                        }
                        break;
                    case 218:
                        {
                        alt126=4;
                        }
                        break;
                    case 219:
                        {
                        alt126=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        throw nvae;
                    }

                    switch (alt126) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6073:3: lv_subType_10_1= 'Security.Privacy'
                            {
                            lv_subType_10_1=(Token)match(input,215,FOLLOW_215_in_ruleQR12938); 

                                    newLeafNode(lv_subType_10_1, grammarAccess.getQRAccess().getSubTypeSecurityPrivacyKeyword_7_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6085:8: lv_subType_10_2= 'Security.Integrity'
                            {
                            lv_subType_10_2=(Token)match(input,216,FOLLOW_216_in_ruleQR12967); 

                                    newLeafNode(lv_subType_10_2, grammarAccess.getQRAccess().getSubTypeSecurityIntegrityKeyword_7_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6097:8: lv_subType_10_3= 'Usability.EaseOfUse'
                            {
                            lv_subType_10_3=(Token)match(input,217,FOLLOW_217_in_ruleQR12996); 

                                    newLeafNode(lv_subType_10_3, grammarAccess.getQRAccess().getSubTypeUsabilityEaseOfUseKeyword_7_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6109:8: lv_subType_10_4= 'Usability.EaseOfLearn'
                            {
                            lv_subType_10_4=(Token)match(input,218,FOLLOW_218_in_ruleQR13025); 

                                    newLeafNode(lv_subType_10_4, grammarAccess.getQRAccess().getSubTypeUsabilityEaseOfLearnKeyword_7_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6121:8: lv_subType_10_5= 'Usability.Accessibility'
                            {
                            lv_subType_10_5=(Token)match(input,219,FOLLOW_219_in_ruleQR13054); 

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

            otherlv_11=(Token)match(input,220,FOLLOW_220_in_ruleQR13084); 

                	newLeafNode(otherlv_11, grammarAccess.getQRAccess().getMetricKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6140:1: ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6141:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6141:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6142:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6142:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            int alt128=6;
            switch ( input.LA(1) ) {
            case 221:
                {
                alt128=1;
                }
                break;
            case 222:
                {
                alt128=2;
                }
                break;
            case 223:
                {
                alt128=3;
                }
                break;
            case 224:
                {
                alt128=4;
                }
                break;
            case 225:
                {
                alt128=5;
                }
                break;
            case 27:
                {
                alt128=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6143:3: lv_metric_12_1= 'Hours'
                    {
                    lv_metric_12_1=(Token)match(input,221,FOLLOW_221_in_ruleQR13104); 

                            newLeafNode(lv_metric_12_1, grammarAccess.getQRAccess().getMetricHoursKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6155:8: lv_metric_12_2= 'Mins'
                    {
                    lv_metric_12_2=(Token)match(input,222,FOLLOW_222_in_ruleQR13133); 

                            newLeafNode(lv_metric_12_2, grammarAccess.getQRAccess().getMetricMinsKeyword_9_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6167:8: lv_metric_12_3= 'Secs'
                    {
                    lv_metric_12_3=(Token)match(input,223,FOLLOW_223_in_ruleQR13162); 

                            newLeafNode(lv_metric_12_3, grammarAccess.getQRAccess().getMetricSecsKeyword_9_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6179:8: lv_metric_12_4= 'mSecs'
                    {
                    lv_metric_12_4=(Token)match(input,224,FOLLOW_224_in_ruleQR13191); 

                            newLeafNode(lv_metric_12_4, grammarAccess.getQRAccess().getMetricMSecsKeyword_9_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6191:8: lv_metric_12_5= 'Tasks'
                    {
                    lv_metric_12_5=(Token)match(input,225,FOLLOW_225_in_ruleQR13220); 

                            newLeafNode(lv_metric_12_5, grammarAccess.getQRAccess().getMetricTasksKeyword_9_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6203:8: lv_metric_12_6= 'Other'
                    {
                    lv_metric_12_6=(Token)match(input,27,FOLLOW_27_in_ruleQR13249); 

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

            otherlv_13=(Token)match(input,226,FOLLOW_226_in_ruleQR13277); 

                	newLeafNode(otherlv_13, grammarAccess.getQRAccess().getValueKeyword_10());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6222:1: ( (lv_value_14_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6223:1: (lv_value_14_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6223:1: (lv_value_14_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6224:3: lv_value_14_0= RULE_INT
            {
            lv_value_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQR13294); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6240:2: (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==93) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6240:4: otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,93,FOLLOW_93_in_ruleQR13312); 

                        	newLeafNode(otherlv_15, grammarAccess.getQRAccess().getStakeholderKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6244:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6245:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6245:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6246:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR13332); 

                    		newLeafNode(otherlv_16, grammarAccess.getQRAccess().getStakeholderStakeholderCrossReference_12_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,120,FOLLOW_120_in_ruleQR13346); 

                	newLeafNode(otherlv_17, grammarAccess.getQRAccess().getPriorityKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6261:1: ( (lv_priority_18_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6262:1: (lv_priority_18_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6262:1: (lv_priority_18_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6263:3: lv_priority_18_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getQRAccess().getPriorityPriorityParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleQR13367);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6279:2: (otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==72) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6279:4: otherlv_19= 'PartOf' ( (otherlv_20= RULE_ID ) )
                    {
                    otherlv_19=(Token)match(input,72,FOLLOW_72_in_ruleQR13380); 

                        	newLeafNode(otherlv_19, grammarAccess.getQRAccess().getPartOfKeyword_15_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6283:1: ( (otherlv_20= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6284:1: (otherlv_20= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6284:1: (otherlv_20= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6285:3: otherlv_20= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                            
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR13400); 

                    		newLeafNode(otherlv_20, grammarAccess.getQRAccess().getPartOfQRCrossReference_15_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6296:4: (otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==35) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6296:6: otherlv_21= 'ProjectProgress' ( (lv_progress_22_0= ruleProjectProgress ) )
                    {
                    otherlv_21=(Token)match(input,35,FOLLOW_35_in_ruleQR13415); 

                        	newLeafNode(otherlv_21, grammarAccess.getQRAccess().getProjectProgressKeyword_16_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6300:1: ( (lv_progress_22_0= ruleProjectProgress ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6301:1: (lv_progress_22_0= ruleProjectProgress )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6301:1: (lv_progress_22_0= ruleProjectProgress )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6302:3: lv_progress_22_0= ruleProjectProgress
                    {
                     
                    	        newCompositeNode(grammarAccess.getQRAccess().getProgressProjectProgressParserRuleCall_16_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectProgress_in_ruleQR13436);
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

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleQR13450); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6330:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6331:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6332:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint13486);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint13496); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6339:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6342:28: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6343:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6343:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6343:3: otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,227,FOLLOW_227_in_ruleConstraint13533); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6347:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6348:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6348:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6349:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint13550); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConstraint13567); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6369:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==19) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6369:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleConstraint13580); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6373:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6374:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6374:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6375:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint13597); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6391:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==37) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6391:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleConstraint13617); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6395:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6396:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6396:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6397:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint13634); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleConstraint13653); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6417:1: ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6418:1: ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6418:1: ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6419:1: (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6419:1: (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' )
            int alt134=7;
            switch ( input.LA(1) ) {
            case 212:
                {
                alt134=1;
                }
                break;
            case 213:
                {
                alt134=2;
                }
                break;
            case 228:
                {
                alt134=3;
                }
                break;
            case 229:
                {
                alt134=4;
                }
                break;
            case 18:
                {
                alt134=5;
                }
                break;
            case 230:
                {
                alt134=6;
                }
                break;
            case 27:
                {
                alt134=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6420:3: lv_type_8_1= 'Cultural'
                    {
                    lv_type_8_1=(Token)match(input,212,FOLLOW_212_in_ruleConstraint13673); 

                            newLeafNode(lv_type_8_1, grammarAccess.getConstraintAccess().getTypeCulturalKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6432:8: lv_type_8_2= 'Legal'
                    {
                    lv_type_8_2=(Token)match(input,213,FOLLOW_213_in_ruleConstraint13702); 

                            newLeafNode(lv_type_8_2, grammarAccess.getConstraintAccess().getTypeLegalKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6444:8: lv_type_8_3= 'Organizational'
                    {
                    lv_type_8_3=(Token)match(input,228,FOLLOW_228_in_ruleConstraint13731); 

                            newLeafNode(lv_type_8_3, grammarAccess.getConstraintAccess().getTypeOrganizationalKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6456:8: lv_type_8_4= 'Physical'
                    {
                    lv_type_8_4=(Token)match(input,229,FOLLOW_229_in_ruleConstraint13760); 

                            newLeafNode(lv_type_8_4, grammarAccess.getConstraintAccess().getTypePhysicalKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6468:8: lv_type_8_5= 'Project'
                    {
                    lv_type_8_5=(Token)match(input,18,FOLLOW_18_in_ruleConstraint13789); 

                            newLeafNode(lv_type_8_5, grammarAccess.getConstraintAccess().getTypeProjectKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6480:8: lv_type_8_6= 'Technological'
                    {
                    lv_type_8_6=(Token)match(input,230,FOLLOW_230_in_ruleConstraint13818); 

                            newLeafNode(lv_type_8_6, grammarAccess.getConstraintAccess().getTypeTechnologicalKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6492:8: lv_type_8_7= 'Other'
                    {
                    lv_type_8_7=(Token)match(input,27,FOLLOW_27_in_ruleConstraint13847); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6507:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==93) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6507:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,93,FOLLOW_93_in_ruleConstraint13876); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6511:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6512:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6512:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6513:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint13896); 

                    		newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,120,FOLLOW_120_in_ruleConstraint13910); 

                	newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6528:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6529:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6529:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6530:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleConstraint13931);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6546:2: (otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==72) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6546:4: otherlv_13= 'PartOf' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,72,FOLLOW_72_in_ruleConstraint13944); 

                        	newLeafNode(otherlv_13, grammarAccess.getConstraintAccess().getPartOfKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6550:1: ( (otherlv_14= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6551:1: (otherlv_14= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6551:1: (otherlv_14= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6552:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint13964); 

                    		newLeafNode(otherlv_14, grammarAccess.getConstraintAccess().getPartOfConstraintCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6563:4: (otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==35) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6563:6: otherlv_15= 'ProjectProgress' ( (lv_progress_16_0= ruleProjectProgress ) )
                    {
                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleConstraint13979); 

                        	newLeafNode(otherlv_15, grammarAccess.getConstraintAccess().getProjectProgressKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6567:1: ( (lv_progress_16_0= ruleProjectProgress ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6568:1: (lv_progress_16_0= ruleProjectProgress )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6568:1: (lv_progress_16_0= ruleProjectProgress )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6569:3: lv_progress_16_0= ruleProjectProgress
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintAccess().getProgressProjectProgressParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectProgress_in_ruleConstraint14000);
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

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleConstraint14014); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6599:1: entryRuleRequirementRelation returns [EObject current=null] : iv_ruleRequirementRelation= ruleRequirementRelation EOF ;
    public final EObject entryRuleRequirementRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementRelation = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6600:2: (iv_ruleRequirementRelation= ruleRequirementRelation EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6601:2: iv_ruleRequirementRelation= ruleRequirementRelation EOF
            {
             newCompositeNode(grammarAccess.getRequirementRelationRule()); 
            pushFollow(FOLLOW_ruleRequirementRelation_in_entryRuleRequirementRelation14052);
            iv_ruleRequirementRelation=ruleRequirementRelation();

            state._fsp--;

             current =iv_ruleRequirementRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementRelation14062); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6608:1: ruleRequirementRelation returns [EObject current=null] : (otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6611:28: ( (otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6612:1: (otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6612:1: (otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6612:3: otherlv_0= 'RequirementRelation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,231,FOLLOW_231_in_ruleRequirementRelation14099); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementRelationAccess().getRequirementRelationKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6616:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6617:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6617:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6618:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementRelation14116); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRequirementRelation14133); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementRelationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleRequirementRelation14145); 

                	newLeafNode(otherlv_3, grammarAccess.getRequirementRelationAccess().getSourceKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6642:1: ( (otherlv_4= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6643:1: (otherlv_4= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6643:1: (otherlv_4= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6644:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementRelationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementRelation14165); 

            		newLeafNode(otherlv_4, grammarAccess.getRequirementRelationAccess().getSourceRequirementCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleRequirementRelation14177); 

                	newLeafNode(otherlv_5, grammarAccess.getRequirementRelationAccess().getTargetKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6659:1: ( (otherlv_6= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6660:1: (otherlv_6= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6660:1: (otherlv_6= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6661:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementRelation14197); 

            		newLeafNode(otherlv_6, grammarAccess.getRequirementRelationAccess().getTargetRequirementCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleRequirementRelation14209); 

                	newLeafNode(otherlv_7, grammarAccess.getRequirementRelationAccess().getTypeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6676:1: ( ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6677:1: ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6677:1: ( (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6678:1: (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6678:1: (lv_type_8_1= 'Requires' | lv_type_8_2= 'Supports' | lv_type_8_3= 'Obstructs' | lv_type_8_4= 'Conflicts' | lv_type_8_5= 'Identical' )
            int alt138=5;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt138=1;
                }
                break;
            case 125:
                {
                alt138=2;
                }
                break;
            case 126:
                {
                alt138=3;
                }
                break;
            case 127:
                {
                alt138=4;
                }
                break;
            case 128:
                {
                alt138=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6679:3: lv_type_8_1= 'Requires'
                    {
                    lv_type_8_1=(Token)match(input,124,FOLLOW_124_in_ruleRequirementRelation14229); 

                            newLeafNode(lv_type_8_1, grammarAccess.getRequirementRelationAccess().getTypeRequiresKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6691:8: lv_type_8_2= 'Supports'
                    {
                    lv_type_8_2=(Token)match(input,125,FOLLOW_125_in_ruleRequirementRelation14258); 

                            newLeafNode(lv_type_8_2, grammarAccess.getRequirementRelationAccess().getTypeSupportsKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6703:8: lv_type_8_3= 'Obstructs'
                    {
                    lv_type_8_3=(Token)match(input,126,FOLLOW_126_in_ruleRequirementRelation14287); 

                            newLeafNode(lv_type_8_3, grammarAccess.getRequirementRelationAccess().getTypeObstructsKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6715:8: lv_type_8_4= 'Conflicts'
                    {
                    lv_type_8_4=(Token)match(input,127,FOLLOW_127_in_ruleRequirementRelation14316); 

                            newLeafNode(lv_type_8_4, grammarAccess.getRequirementRelationAccess().getTypeConflictsKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6727:8: lv_type_8_5= 'Identical'
                    {
                    lv_type_8_5=(Token)match(input,128,FOLLOW_128_in_ruleRequirementRelation14345); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6742:2: (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==37) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6742:4: otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleRequirementRelation14374); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequirementRelationAccess().getDescriptionKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6746:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6747:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6747:1: (lv_description_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6748:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirementRelation14391); 

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

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRequirementRelation14410); 

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
    public static final BitSet FOLLOW_38_in_rulePlannedSchedule2006 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePlannedSchedule2018 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_rulePlannedSchedule2039 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulePlannedSchedule2051 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_rulePlannedSchedule2072 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePlannedSchedule2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualSchedule_in_entryRuleActualSchedule2120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualSchedule2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleActualSchedule2167 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleActualSchedule2179 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleActualSchedule2200 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleActualSchedule2212 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleActualSchedule2233 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActualSchedule2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate2333 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDate2350 = new BitSet(new long[]{0x007FF80000000000L});
    public static final BitSet FOLLOW_ruleMonth_in_ruleDate2371 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDate2383 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_entryRuleMonth2441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonth2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMonth2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMonth2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMonth2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMonth2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMonth2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMonth2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMonth2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMonth2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMonth2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMonth2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMonth2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMonth2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganizations_in_entryRuleOrganizations2865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganizations2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOrganizations2912 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleOrganizations2924 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizations2941 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleOrganizations2958 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizations2975 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleOrganizations2992 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizations3009 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOrganizations3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_entryRuleProjectProgress3062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectProgress3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleProjectProgress3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleProjectProgress3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleProjectProgress3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleProjectProgress3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleProjectProgress3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleProjectProgress3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleProjectProgress3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem3341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSystem3388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem3405 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem3422 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleSystem3435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem3452 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleSystem3472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem3489 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSystem3508 = new BitSet(new long[]{0x0000000008000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleSystem3528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_67_in_ruleSystem3557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_68_in_ruleSystem3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_27_in_ruleSystem3615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSystem3643 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleSystem3663 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_71_in_ruleSystem3692 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleSystem3721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem3741 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemRelation_in_entryRuleSystemRelation3791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemRelation3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSystemRelation3838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemRelation3855 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystemRelation3872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleSystemRelation3884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemRelation3904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleSystemRelation3916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemRelation3936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleSystemRelation3948 = new BitSet(new long[]{0x0000000008000000L,0x000000000003E000L});
    public static final BitSet FOLLOW_77_in_ruleSystemRelation3968 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_78_in_ruleSystemRelation3997 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_79_in_ruleSystemRelation4026 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_80_in_ruleSystemRelation4055 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_81_in_ruleSystemRelation4084 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27_in_ruleSystemRelation4113 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSystemRelation4141 = new BitSet(new long[]{0x0000000000000000L,0x00000000000400C0L});
    public static final BitSet FOLLOW_70_in_ruleSystemRelation4161 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_71_in_ruleSystemRelation4190 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_82_in_ruleSystemRelation4219 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_37_in_ruleSystemRelation4248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystemRelation4265 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystemRelation4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm4320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossaryTerm4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleGlossaryTerm4367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlossaryTerm4384 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGlossaryTerm4401 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleGlossaryTerm4414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4431 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleGlossaryTerm4451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4468 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGlossaryTerm4487 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleRefTermType_in_ruleGlossaryTerm4508 = new BitSet(new long[]{0x0000000000002000L,0x000000000C300000L});
    public static final BitSet FOLLOW_84_in_ruleGlossaryTerm4521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4538 = new BitSet(new long[]{0x0000000000002000L,0x000000000C200000L});
    public static final BitSet FOLLOW_85_in_ruleGlossaryTerm4558 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_86_in_ruleGlossaryTerm4578 = new BitSet(new long[]{0x0000000000002000L,0x000000000C000000L});
    public static final BitSet FOLLOW_87_in_ruleGlossaryTerm4607 = new BitSet(new long[]{0x0000000000002000L,0x000000000C000000L});
    public static final BitSet FOLLOW_88_in_ruleGlossaryTerm4636 = new BitSet(new long[]{0x0000000000002000L,0x000000000C000000L});
    public static final BitSet FOLLOW_89_in_ruleGlossaryTerm4665 = new BitSet(new long[]{0x0000000000002000L,0x000000000C000000L});
    public static final BitSet FOLLOW_90_in_ruleGlossaryTerm4696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4713 = new BitSet(new long[]{0x0000000000002000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleGlossaryTerm4733 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm4750 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGlossaryTerm4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTermType_in_entryRuleRefTermType4805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTermType4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType4861 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefTermType4874 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType4895 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleTermType_in_entryRuleTermType4933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermType4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTermType4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTermType5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTermType5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTermType5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder5125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleStakeholder5172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder5189 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStakeholder5206 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleStakeholder5219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder5236 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleStakeholder5256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder5273 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStakeholder5292 = new BitSet(new long[]{0x0000000000000000L,0x0000003E00000000L});
    public static final BitSet FOLLOW_97_in_ruleStakeholder5312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_98_in_ruleStakeholder5341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_99_in_ruleStakeholder5370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_100_in_ruleStakeholder5399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_101_in_ruleStakeholder5428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleStakeholder5456 = new BitSet(new long[]{0x0000000000000000L,0x003FFFC000000000L});
    public static final BitSet FOLLOW_102_in_ruleStakeholder5476 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_103_in_ruleStakeholder5505 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_104_in_ruleStakeholder5534 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_105_in_ruleStakeholder5563 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_106_in_ruleStakeholder5592 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_107_in_ruleStakeholder5621 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_108_in_ruleStakeholder5650 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_109_in_ruleStakeholder5679 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_110_in_ruleStakeholder5708 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_111_in_ruleStakeholder5737 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_112_in_ruleStakeholder5766 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_113_in_ruleStakeholder5795 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_114_in_ruleStakeholder5824 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_115_in_ruleStakeholder5853 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_116_in_ruleStakeholder5882 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_117_in_ruleStakeholder5911 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000100L});
    public static final BitSet FOLLOW_118_in_ruleStakeholder5940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder5960 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleStakeholder5975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder5995 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStakeholder6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal6045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleGoal6092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal6109 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoal6126 = new BitSet(new long[]{0x0000002000080000L,0x0000000020000000L});
    public static final BitSet FOLLOW_19_in_ruleGoal6139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal6156 = new BitSet(new long[]{0x0000002000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_37_in_ruleGoal6176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal6193 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleGoal6212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal6232 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleGoal6244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleGoal6265 = new BitSet(new long[]{0x0000000800002000L,0x0600000000000000L});
    public static final BitSet FOLLOW_35_in_ruleGoal6278 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_ruleGoal6299 = new BitSet(new long[]{0x0000000000002000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_ruleGoal6314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal6334 = new BitSet(new long[]{0x0000000000002000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleGoal6349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal6369 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGoal6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalRelation_in_entryRuleGoalRelation6419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalRelation6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleGoalRelation6466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoalRelation6483 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoalRelation6500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGoalRelation6512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoalRelation6532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleGoalRelation6544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoalRelation6564 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGoalRelation6576 = new BitSet(new long[]{0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_124_in_ruleGoalRelation6596 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_125_in_ruleGoalRelation6625 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_126_in_ruleGoalRelation6654 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_127_in_ruleGoalRelation6683 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_128_in_ruleGoalRelation6712 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_37_in_ruleGoalRelation6741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoalRelation6758 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGoalRelation6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriority_in_entryRulePriority6813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePriority6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_rulePriority6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_rulePriority6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_rulePriority6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_rulePriority6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGoal_in_entryRuleRefGoal7005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGoal7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal7060 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefGoal7073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal7093 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity7131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleEntity7178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity7195 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity7212 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_19_in_ruleEntity7225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity7242 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_37_in_ruleEntity7262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity7279 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_20_in_ruleEntity7299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_133_in_ruleEntity7319 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_134_in_ruleEntity7348 = new BitSet(new long[]{0x0000002000180000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity7387 = new BitSet(new long[]{0x0000002000182000L,0x0000000000000000L,0x0000000320000080L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_ruleEntity7409 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleForeignKey_in_ruleEntity7431 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleEntity7453 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_13_in_ruleEntity7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute7502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleAttribute7549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute7566 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute7583 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute7596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute7613 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleAttribute7633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute7650 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute7669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000FFF00L});
    public static final BitSet FOLLOW_136_in_ruleAttribute7689 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_137_in_ruleAttribute7718 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_138_in_ruleAttribute7747 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_139_in_ruleAttribute7776 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_140_in_ruleAttribute7805 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_141_in_ruleAttribute7834 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_142_in_ruleAttribute7863 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_143_in_ruleAttribute7892 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_144_in_ruleAttribute7921 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_145_in_ruleAttribute7950 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_146_in_ruleAttribute7979 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_147_in_ruleAttribute8008 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_148_in_ruleAttribute8037 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttribute8054 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001E00000L});
    public static final BitSet FOLLOW_149_in_ruleAttribute8074 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAttribute8095 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_150_in_ruleAttribute8110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute8127 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_151_in_ruleAttribute8152 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_ruleAttribute8184 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute8210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity8246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleMultiplicity8300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleMultiplicity8329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleMultiplicity8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleMultiplicity8387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiplicity8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey8458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryKey8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_rulePrimaryKey8505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_rulePrimaryKey8517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_rulePrimaryKey8538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_rulePrimaryKey8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_entryRuleForeignKey8586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignKey8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleForeignKey8633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeignKey8653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_ruleForeignKey8665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_ruleForeignKey8686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_ruleForeignKey8698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_ruleForeignKey8710 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleForeignKey8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute8767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefAttribute8777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute8822 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefAttribute8835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute8855 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck8893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_ruleCheck8940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheck8957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheck8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor9020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleActor9067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor9084 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor9101 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleActor9114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor9131 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleActor9151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor9168 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor9187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_162_in_ruleActor9207 = new BitSet(new long[]{0x0000000000002000L,0x0040000020000000L});
    public static final BitSet FOLLOW_163_in_ruleActor9236 = new BitSet(new long[]{0x0000000000002000L,0x0040000020000000L});
    public static final BitSet FOLLOW_164_in_ruleActor9265 = new BitSet(new long[]{0x0000000000002000L,0x0040000020000000L});
    public static final BitSet FOLLOW_93_in_ruleActor9294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor9314 = new BitSet(new long[]{0x0000000000002000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleActor9329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor9349 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActor9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase9399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase9409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_ruleUseCase9446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase9463 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase9480 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleUseCase9493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase9510 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleUseCase9530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase9547 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUseCase9566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00001FC000000000L});
    public static final BitSet FOLLOW_166_in_ruleUseCase9586 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_167_in_ruleUseCase9615 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_168_in_ruleUseCase9644 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_169_in_ruleUseCase9673 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_170_in_ruleUseCase9702 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_171_in_ruleUseCase9731 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_172_in_ruleUseCase9760 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_173_in_ruleUseCase9789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefEntity_in_ruleUseCase9810 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleUseCase9824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleUseCase9845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0801C00000000000L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_ruleUseCase9866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0801C00000000000L});
    public static final BitSet FOLLOW_174_in_ruleUseCase9880 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleUseCase9901 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_175_in_ruleUseCase9917 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleUseCase9938 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_ruleUseCase9953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase9973 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x103E000000000000L});
    public static final BitSet FOLLOW_177_in_ruleUseCase9986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefActor_in_ruleUseCase10007 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x103C000000000000L});
    public static final BitSet FOLLOW_178_in_ruleUseCase10022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase10039 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1038000000000000L});
    public static final BitSet FOLLOW_179_in_ruleUseCase10059 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase10076 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1030000000000000L});
    public static final BitSet FOLLOW_180_in_ruleUseCase10096 = new BitSet(new long[]{0x0000000000002010L,0x0000000000000000L,0x1020000000000000L});
    public static final BitSet FOLLOW_ruleRefUC_in_ruleUseCase10117 = new BitSet(new long[]{0x0000000000002010L,0x0000000000000000L,0x1020000000000000L});
    public static final BitSet FOLLOW_181_in_ruleUseCase10133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase10153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_ruleUseCase10165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase10185 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleUseCase10208 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_13_in_ruleUseCase10221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefEntity_in_entryRuleRefEntity10257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefEntity10267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEntity10312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_ruleRefEntity10324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleRefEntity10345 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefEntity10358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEntity10378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_183_in_ruleRefEntity10390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleRefEntity10411 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType10449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_ruleEntityType10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_ruleEntityType10532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_ruleEntityType10561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefFR_in_entryRuleRefFR10612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefFR10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR10667 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefFR10680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR10700 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleRefActor_in_entryRuleRefActor10738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefActor10748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefActor10793 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefActor10806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefActor10826 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleRefUC_in_entryRuleRefUC10864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefUC10874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC10919 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleRefUC10932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC10952 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint10990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionPoint11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_ruleExtensionPoint11037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionPoint11054 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleExtensionPoint11072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExtensionPoint11089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario11132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_ruleScenario11179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScenario11196 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleScenario11213 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleScenario11226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario11243 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleScenario11263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario11280 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScenario11299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xE000000000000000L});
    public static final BitSet FOLLOW_189_in_ruleScenario11319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_190_in_ruleScenario11348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_191_in_ruleScenario11377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_ruleScenario11405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_193_in_ruleScenario11425 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_194_in_ruleScenario11454 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenario11491 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_13_in_ruleScenario11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep11540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep11550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_ruleStep11587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep11604 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStep11621 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleStep11634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11651 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleStep11671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11688 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStep11707 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_196_in_ruleStep11727 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_197_in_ruleStep11756 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_198_in_ruleStep11785 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_199_in_ruleStep11814 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_27_in_ruleStep11843 = new BitSet(new long[]{0x0000000000002000L,0x0000000100000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_96_in_ruleStep11872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep11892 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x000C000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_178_in_ruleStep11907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11924 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_179_in_ruleStep11944 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11961 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_ruleStep11981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep12001 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStep12015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFR_in_entryRuleFR12051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFR12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_ruleFR12098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR12115 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFR12132 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleFR12145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR12162 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleFR12182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR12199 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFR12218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_202_in_ruleFR12238 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_203_in_ruleFR12267 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_204_in_ruleFR12296 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_93_in_ruleFR12325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR12345 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleFR12359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleFR12380 = new BitSet(new long[]{0x0000000800002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleFR12393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR12413 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_35_in_ruleFR12428 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_ruleFR12449 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFR12463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQR_in_entryRuleQR12499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQR12509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_ruleQR12546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR12563 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQR12580 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleQR12593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQR12610 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleQR12630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQR12647 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQR12666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000003FC000L});
    public static final BitSet FOLLOW_206_in_ruleQR12686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_207_in_ruleQR12715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_208_in_ruleQR12744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_209_in_ruleQR12773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_210_in_ruleQR12802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_211_in_ruleQR12831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_212_in_ruleQR12860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_213_in_ruleQR12889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_214_in_ruleQR12918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000F800000L});
    public static final BitSet FOLLOW_215_in_ruleQR12938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_216_in_ruleQR12967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_217_in_ruleQR12996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_218_in_ruleQR13025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_219_in_ruleQR13054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_220_in_ruleQR13084 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000000L,0x00000003E0000000L});
    public static final BitSet FOLLOW_221_in_ruleQR13104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_222_in_ruleQR13133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_223_in_ruleQR13162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_224_in_ruleQR13191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_225_in_ruleQR13220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_27_in_ruleQR13249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_226_in_ruleQR13277 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQR13294 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_93_in_ruleQR13312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR13332 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleQR13346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleQR13367 = new BitSet(new long[]{0x0000000800002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleQR13380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR13400 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_35_in_ruleQR13415 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_ruleQR13436 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQR13450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint13486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint13496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_ruleConstraint13533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint13550 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstraint13567 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint13580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint13597 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleConstraint13617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint13634 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint13653 = new BitSet(new long[]{0x0000000008040000L,0x0000000000000000L,0x0000000000000000L,0x0000007000300000L});
    public static final BitSet FOLLOW_212_in_ruleConstraint13673 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_213_in_ruleConstraint13702 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_228_in_ruleConstraint13731 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_229_in_ruleConstraint13760 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint13789 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_230_in_ruleConstraint13818 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_27_in_ruleConstraint13847 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_93_in_ruleConstraint13876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint13896 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleConstraint13910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_rulePriority_in_ruleConstraint13931 = new BitSet(new long[]{0x0000000800002000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleConstraint13944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint13964 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_35_in_ruleConstraint13979 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleProjectProgress_in_ruleConstraint14000 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstraint14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementRelation_in_entryRuleRequirementRelation14052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementRelation14062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_ruleRequirementRelation14099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementRelation14116 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRequirementRelation14133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleRequirementRelation14145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementRelation14165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleRequirementRelation14177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementRelation14197 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRequirementRelation14209 = new BitSet(new long[]{0x0000000000000000L,0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_124_in_ruleRequirementRelation14229 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_125_in_ruleRequirementRelation14258 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_126_in_ruleRequirementRelation14287 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_127_in_ruleRequirementRelation14316 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_128_in_ruleRequirementRelation14345 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_37_in_ruleRequirementRelation14374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirementRelation14391 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirementRelation14410 = new BitSet(new long[]{0x0000000000000002L});

}