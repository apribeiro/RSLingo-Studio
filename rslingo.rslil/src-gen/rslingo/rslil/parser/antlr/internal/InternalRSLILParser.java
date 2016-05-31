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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package-Project'", "'{'", "'}'", "'Package-System'", "'.'", "'.*'", "'import'", "'Project'", "'Name'", "'Type'", "'SystemDevelopment'", "'SystemDesign'", "'SystemDeployment'", "'SystemMaintenance'", "'Training'", "'Research'", "'Other'", "'ApplicationDomain'", "'PublicSector'", "'Education'", "'Health'", "'Telecoms'", "'Energy&Utilities'", "'Finance&Banks'", "'Status'", "'Summary'", "'Description'", "'PlannedSchedule {'", "'Start'", "'End'", "'ActualSchedule {'", "'-'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'", "'Organizations {'", "'Customer'", "'Supplier'", "'Partners'", "'Not-Plan'", "'Plan'", "'On-Design'", "'On-Develop'", "'On-Test'", "'On-Deploy'", "'Concluded'", "'System'", "'PartOf'", "'GlossaryTerm'", "'Acronym'", "'POS'", "'Adjective'", "'Adverb'", "'Noun'", "'Verb'", "'Synset'", "','", "'Stakeholder'", "'Entity'", "'Architectural'", "'Actor'", "'Antonym'", "'Hypernym'", "'Synonym'", "'Group.Organization'", "'Group.BusinessUnit'", "'Group.Team'", "'Individual.Person'", "'Individual.ExternalSystem'", "'Category'", "'Business'", "'Business.Customer'", "'Business.Customer.Sponsor'", "'Business.Customer.Champion'", "'Business.User.Direct'", "'Business.User.Indirect'", "'Business.Advisor.DomainExpert'", "'Business.Advisor.Trainer'", "'Business.Advisor.RegulatorAgent'", "'Business.System'", "'Technical'", "'Technical.BusinessAnalyst'", "'Technical.Requirements.Engineer'", "'Technical.Software.Architect'", "'Technical.Software.Designer'", "'Technical.Software.Tester'", "'Goal'", "'Priority'", "'Must'", "'Should'", "'Could'", "'Won\\'t'", "'Requires'", "'Supports'", "'Obstructs'", "'Conflicts'", "'Identical'", "'ComposedBy'", "'Logic-And'", "'Logic-Or'", "'Principal'", "'Secondary'", "'Attribute'", "'Boolean'", "'Integer'", "'Decimal'", "'Currency'", "'Date'", "'Time'", "'Datetime'", "'Enumeration'", "'Text'", "'Regex'", "'URL'", "'Image'", "'Size'", "'Multiplicity'", "'DefaultValue'", "'NotNull'", "'Unique'", "'\"0\"'", "'\"1\"'", "'\"0..1\"'", "'\"*\"'", "'PrimaryKey'", "'('", "')'", "'ForeignKey'", "'Check'", "'User'", "'ExternalSystem'", "'Timer'", "'SpecializedFrom'", "'UseCase'", "'EntityManage'", "'EntityBrowse'", "'EntitySearch'", "'EntityCreate'", "'EntityDelete'", "'EntitySync'", "'Report'", "'Entities'", "'Goals'", "'FunctionalRequirements'", "'ActorInitiates'", "'ActorParticipates'", "'Pre-Conditions'", "'Post-Conditions'", "'Include'", "'Extend'", "'on'", "'as'", "'Master'", "'Detail'", "'Reference'", "'ExtensionPoint'", "'Scenario'", "'Main'", "'Alternative'", "'Exception'", "'ExecutionMode'", "'Sequential'", "'Parallel'", "'Step'", "'ActorPrepareData'", "'ActorCallSystem'", "'SystemExecutes'", "'SystemReturnResult'", "'NextStep'", "'FunctionalRequirement'", "'Functional'", "'Behavioral'", "'Data'", "'Refines'", "'QualityRequirement'", "'Security'", "'Performance'", "'Usability'", "'Appearance'", "'Operational'", "'Maintenance'", "'Cultural'", "'Legal'", "'Sub-Type'", "'Security.Privacy'", "'Security.Integrity'", "'Usability.EaseOfUse'", "'Usability.EaseOfLearn'", "'Usability.Accessibility'", "'Metric'", "'Hours'", "'Mins'", "'Secs'", "'mSecs'", "'Tasks'", "'Value'", "'Constraint'", "'Organizational'", "'Physical'", "'Technological'"
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
    public static final int T__102=102;
    public static final int T__101=101;
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
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__108=108;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__103=103;
    public static final int T__106=106;
    public static final int T__105=105;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:116:1: rulePackageProject returns [EObject current=null] : (otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_packageSystems_8_0= rulePackageSystem ) )* otherlv_9= '}' ) ;
    public final EObject rulePackageProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_project_4_0 = null;

        EObject lv_glossaryTerms_5_0 = null;

        EObject lv_stakeholders_6_0 = null;

        EObject lv_goals_7_0 = null;

        EObject lv_packageSystems_8_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:119:28: ( (otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_packageSystems_8_0= rulePackageSystem ) )* otherlv_9= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:120:1: (otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_packageSystems_8_0= rulePackageSystem ) )* otherlv_9= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:120:1: (otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_packageSystems_8_0= rulePackageSystem ) )* otherlv_9= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:120:3: otherlv_0= 'Package-Project' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_project_4_0= ruleProject ) ) ( (lv_glossaryTerms_5_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_6_0= ruleStakeholder ) )* ( (lv_goals_7_0= ruleGoal ) )* ( (lv_packageSystems_8_0= rulePackageSystem ) )* otherlv_9= '}'
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

                if ( (LA3_0==68) ) {
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

                if ( (LA4_0==77) ) {
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

                if ( (LA5_0==106) ) {
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:236:3: ( (lv_packageSystems_8_0= rulePackageSystem ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:237:1: (lv_packageSystems_8_0= rulePackageSystem )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:237:1: (lv_packageSystems_8_0= rulePackageSystem )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:238:3: lv_packageSystems_8_0= rulePackageSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageProjectAccess().getPackageSystemsPackageSystemParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackageSystem_in_rulePackageProject404);
            	    lv_packageSystems_8_0=rulePackageSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packageSystems",
            	            		lv_packageSystems_8_0, 
            	            		"PackageSystem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_rulePackageProject417); 

                	newLeafNode(otherlv_9, grammarAccess.getPackageProjectAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:266:1: entryRulePackageSystem returns [EObject current=null] : iv_rulePackageSystem= rulePackageSystem EOF ;
    public final EObject entryRulePackageSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:267:2: (iv_rulePackageSystem= rulePackageSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:268:2: iv_rulePackageSystem= rulePackageSystem EOF
            {
             newCompositeNode(grammarAccess.getPackageSystemRule()); 
            pushFollow(FOLLOW_rulePackageSystem_in_entryRulePackageSystem453);
            iv_rulePackageSystem=rulePackageSystem();

            state._fsp--;

             current =iv_rulePackageSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageSystem463); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:275:1: rulePackageSystem returns [EObject current=null] : (otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* otherlv_11= '}' ) ;
    public final EObject rulePackageSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_system_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_actors_6_0 = null;

        EObject lv_useCases_7_0 = null;

        EObject lv_frs_8_0 = null;

        EObject lv_qrs_9_0 = null;

        EObject lv_constraints_10_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:278:28: ( (otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* otherlv_11= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:279:1: (otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* otherlv_11= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:279:1: (otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* otherlv_11= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:279:3: otherlv_0= 'Package-System' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_system_4_0= ruleSystem ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePackageSystem500); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageSystemAccess().getPackageSystemKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:283:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:284:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:284:1: (lv_name_1_0= ruleQualifiedName )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:285:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageSystemAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageSystem521);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackageSystem533); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:305:1: ( (lv_imports_3_0= ruleImport ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:306:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:306:1: (lv_imports_3_0= ruleImport )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:307:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePackageSystem554);
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
            	    break loop7;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:323:3: ( (lv_system_4_0= ruleSystem ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:324:1: (lv_system_4_0= ruleSystem )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:324:1: (lv_system_4_0= ruleSystem )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:325:3: lv_system_4_0= ruleSystem
            {
             
            	        newCompositeNode(grammarAccess.getPackageSystemAccess().getSystemSystemParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSystem_in_rulePackageSystem576);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:341:2: ( (lv_entities_5_0= ruleEntity ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==78) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:342:1: (lv_entities_5_0= ruleEntity )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:342:1: (lv_entities_5_0= ruleEntity )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:343:3: lv_entities_5_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getEntitiesEntityParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_rulePackageSystem597);
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
            	    break loop8;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:359:3: ( (lv_actors_6_0= ruleActor ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==80) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:360:1: (lv_actors_6_0= ruleActor )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:360:1: (lv_actors_6_0= ruleActor )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:361:3: lv_actors_6_0= ruleActor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getActorsActorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActor_in_rulePackageSystem619);
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
            	    break loop9;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:377:3: ( (lv_useCases_7_0= ruleUseCase ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==153) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:378:1: (lv_useCases_7_0= ruleUseCase )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:378:1: (lv_useCases_7_0= ruleUseCase )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:379:3: lv_useCases_7_0= ruleUseCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getUseCasesUseCaseParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUseCase_in_rulePackageSystem641);
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
            	    break loop10;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:395:3: ( (lv_frs_8_0= ruleFR ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==189) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:396:1: (lv_frs_8_0= ruleFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:396:1: (lv_frs_8_0= ruleFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:397:3: lv_frs_8_0= ruleFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getFrsFRParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFR_in_rulePackageSystem663);
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
            	    break loop11;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:413:3: ( (lv_qrs_9_0= ruleQR ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==194) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:414:1: (lv_qrs_9_0= ruleQR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:414:1: (lv_qrs_9_0= ruleQR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:415:3: lv_qrs_9_0= ruleQR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getQrsQRParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQR_in_rulePackageSystem685);
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
            	    break loop12;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:431:3: ( (lv_constraints_10_0= ruleConstraint ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==216) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:432:1: (lv_constraints_10_0= ruleConstraint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:432:1: (lv_constraints_10_0= ruleConstraint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:433:3: lv_constraints_10_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageSystemAccess().getConstraintsConstraintParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_rulePackageSystem707);
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
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_rulePackageSystem720); 

                	newLeafNode(otherlv_11, grammarAccess.getPackageSystemAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:461:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:462:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:463:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName757);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName768); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:470:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:473:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:474:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:474:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:474:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName808); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:481:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:482:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName827); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName842); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:502:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:503:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:504:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard890);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard901); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:511:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:514:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:515:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:515:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:516:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard948);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:526:1: (kw= '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:527:2: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard967); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:540:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:541:2: (iv_ruleImport= ruleImport EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:542:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1009);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1019); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:549:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:552:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:553:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:553:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:553:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport1056); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:557:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:558:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:558:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:559:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport1077);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:583:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:584:2: (iv_ruleProject= ruleProject EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:585:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject1113);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject1123); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:592:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'Status' ( (lv_status_13_0= ruleStatus ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}' ) ;
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

        EObject lv_status_13_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:595:28: ( (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'Status' ( (lv_status_13_0= ruleStatus ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:596:1: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'Status' ( (lv_status_13_0= ruleStatus ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:596:1: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'Status' ( (lv_status_13_0= ruleStatus ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:596:3: otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) ) otherlv_7= 'ApplicationDomain' ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) ) ( (lv_planned_9_0= rulePlannedSchedule ) )? ( (lv_actual_10_0= ruleActualSchedule ) )? ( (lv_organizations_11_0= ruleOrganizations ) )? (otherlv_12= 'Status' ( (lv_status_13_0= ruleStatus ) ) )? otherlv_14= 'Summary' ( (lv_summary_15_0= RULE_STRING ) ) otherlv_16= 'Description' ( (lv_description_17_0= RULE_STRING ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProject1160); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:600:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:601:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:601:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:602:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject1177); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProject1194); 

                	newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:622:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:622:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleProject1207); 

                        	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:626:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:627:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:627:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:628:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject1224); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleProject1243); 

                	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getTypeKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:648:1: ( ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:649:1: ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:649:1: ( (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:650:1: (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:650:1: (lv_type_6_1= 'SystemDevelopment' | lv_type_6_2= 'SystemDesign' | lv_type_6_3= 'SystemDeployment' | lv_type_6_4= 'SystemMaintenance' | lv_type_6_5= 'Training' | lv_type_6_6= 'Research' | lv_type_6_7= 'Other' )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt17=1;
                }
                break;
            case 22:
                {
                alt17=2;
                }
                break;
            case 23:
                {
                alt17=3;
                }
                break;
            case 24:
                {
                alt17=4;
                }
                break;
            case 25:
                {
                alt17=5;
                }
                break;
            case 26:
                {
                alt17=6;
                }
                break;
            case 27:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:651:3: lv_type_6_1= 'SystemDevelopment'
                    {
                    lv_type_6_1=(Token)match(input,21,FOLLOW_21_in_ruleProject1263); 

                            newLeafNode(lv_type_6_1, grammarAccess.getProjectAccess().getTypeSystemDevelopmentKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:663:8: lv_type_6_2= 'SystemDesign'
                    {
                    lv_type_6_2=(Token)match(input,22,FOLLOW_22_in_ruleProject1292); 

                            newLeafNode(lv_type_6_2, grammarAccess.getProjectAccess().getTypeSystemDesignKeyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:675:8: lv_type_6_3= 'SystemDeployment'
                    {
                    lv_type_6_3=(Token)match(input,23,FOLLOW_23_in_ruleProject1321); 

                            newLeafNode(lv_type_6_3, grammarAccess.getProjectAccess().getTypeSystemDeploymentKeyword_5_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:687:8: lv_type_6_4= 'SystemMaintenance'
                    {
                    lv_type_6_4=(Token)match(input,24,FOLLOW_24_in_ruleProject1350); 

                            newLeafNode(lv_type_6_4, grammarAccess.getProjectAccess().getTypeSystemMaintenanceKeyword_5_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:699:8: lv_type_6_5= 'Training'
                    {
                    lv_type_6_5=(Token)match(input,25,FOLLOW_25_in_ruleProject1379); 

                            newLeafNode(lv_type_6_5, grammarAccess.getProjectAccess().getTypeTrainingKeyword_5_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:711:8: lv_type_6_6= 'Research'
                    {
                    lv_type_6_6=(Token)match(input,26,FOLLOW_26_in_ruleProject1408); 

                            newLeafNode(lv_type_6_6, grammarAccess.getProjectAccess().getTypeResearchKeyword_5_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:723:8: lv_type_6_7= 'Other'
                    {
                    lv_type_6_7=(Token)match(input,27,FOLLOW_27_in_ruleProject1437); 

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

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleProject1465); 

                	newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getApplicationDomainKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:742:1: ( ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:743:1: ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:743:1: ( (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:744:1: (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:744:1: (lv_domain_8_1= 'PublicSector' | lv_domain_8_2= 'Education' | lv_domain_8_3= 'Health' | lv_domain_8_4= 'Telecoms' | lv_domain_8_5= 'Energy&Utilities' | lv_domain_8_6= 'Finance&Banks' | lv_domain_8_7= 'Other' )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            case 33:
                {
                alt18=5;
                }
                break;
            case 34:
                {
                alt18=6;
                }
                break;
            case 27:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:745:3: lv_domain_8_1= 'PublicSector'
                    {
                    lv_domain_8_1=(Token)match(input,29,FOLLOW_29_in_ruleProject1485); 

                            newLeafNode(lv_domain_8_1, grammarAccess.getProjectAccess().getDomainPublicSectorKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:757:8: lv_domain_8_2= 'Education'
                    {
                    lv_domain_8_2=(Token)match(input,30,FOLLOW_30_in_ruleProject1514); 

                            newLeafNode(lv_domain_8_2, grammarAccess.getProjectAccess().getDomainEducationKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:769:8: lv_domain_8_3= 'Health'
                    {
                    lv_domain_8_3=(Token)match(input,31,FOLLOW_31_in_ruleProject1543); 

                            newLeafNode(lv_domain_8_3, grammarAccess.getProjectAccess().getDomainHealthKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:781:8: lv_domain_8_4= 'Telecoms'
                    {
                    lv_domain_8_4=(Token)match(input,32,FOLLOW_32_in_ruleProject1572); 

                            newLeafNode(lv_domain_8_4, grammarAccess.getProjectAccess().getDomainTelecomsKeyword_7_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:793:8: lv_domain_8_5= 'Energy&Utilities'
                    {
                    lv_domain_8_5=(Token)match(input,33,FOLLOW_33_in_ruleProject1601); 

                            newLeafNode(lv_domain_8_5, grammarAccess.getProjectAccess().getDomainEnergyUtilitiesKeyword_7_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:805:8: lv_domain_8_6= 'Finance&Banks'
                    {
                    lv_domain_8_6=(Token)match(input,34,FOLLOW_34_in_ruleProject1630); 

                            newLeafNode(lv_domain_8_6, grammarAccess.getProjectAccess().getDomainFinanceBanksKeyword_7_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(current, "domain", lv_domain_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:817:8: lv_domain_8_7= 'Other'
                    {
                    lv_domain_8_7=(Token)match(input,27,FOLLOW_27_in_ruleProject1659); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:832:2: ( (lv_planned_9_0= rulePlannedSchedule ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:833:1: (lv_planned_9_0= rulePlannedSchedule )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:833:1: (lv_planned_9_0= rulePlannedSchedule )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:834:3: lv_planned_9_0= rulePlannedSchedule
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getPlannedPlannedScheduleParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_rulePlannedSchedule_in_ruleProject1696);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:850:3: ( (lv_actual_10_0= ruleActualSchedule ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:851:1: (lv_actual_10_0= ruleActualSchedule )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:851:1: (lv_actual_10_0= ruleActualSchedule )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:852:3: lv_actual_10_0= ruleActualSchedule
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getActualActualScheduleParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActualSchedule_in_ruleProject1718);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:868:3: ( (lv_organizations_11_0= ruleOrganizations ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==55) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:869:1: (lv_organizations_11_0= ruleOrganizations )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:869:1: (lv_organizations_11_0= ruleOrganizations )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:870:3: lv_organizations_11_0= ruleOrganizations
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getOrganizationsOrganizationsParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrganizations_in_ruleProject1740);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:886:3: (otherlv_12= 'Status' ( (lv_status_13_0= ruleStatus ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:886:5: otherlv_12= 'Status' ( (lv_status_13_0= ruleStatus ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleProject1754); 

                        	newLeafNode(otherlv_12, grammarAccess.getProjectAccess().getStatusKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:890:1: ( (lv_status_13_0= ruleStatus ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:891:1: (lv_status_13_0= ruleStatus )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:891:1: (lv_status_13_0= ruleStatus )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:892:3: lv_status_13_0= ruleStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getStatusStatusParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatus_in_ruleProject1775);
                    lv_status_13_0=ruleStatus();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"status",
                            		lv_status_13_0, 
                            		"Status");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleProject1789); 

                	newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getSummaryKeyword_12());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:912:1: ( (lv_summary_15_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:913:1: (lv_summary_15_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:913:1: (lv_summary_15_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:914:3: lv_summary_15_0= RULE_STRING
            {
            lv_summary_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject1806); 

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

            otherlv_16=(Token)match(input,37,FOLLOW_37_in_ruleProject1823); 

                	newLeafNode(otherlv_16, grammarAccess.getProjectAccess().getDescriptionKeyword_14());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:934:1: ( (lv_description_17_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:935:1: (lv_description_17_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:935:1: (lv_description_17_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:936:3: lv_description_17_0= RULE_STRING
            {
            lv_description_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject1840); 

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

            otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleProject1857); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:964:1: entryRulePlannedSchedule returns [EObject current=null] : iv_rulePlannedSchedule= rulePlannedSchedule EOF ;
    public final EObject entryRulePlannedSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlannedSchedule = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:965:2: (iv_rulePlannedSchedule= rulePlannedSchedule EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:966:2: iv_rulePlannedSchedule= rulePlannedSchedule EOF
            {
             newCompositeNode(grammarAccess.getPlannedScheduleRule()); 
            pushFollow(FOLLOW_rulePlannedSchedule_in_entryRulePlannedSchedule1893);
            iv_rulePlannedSchedule=rulePlannedSchedule();

            state._fsp--;

             current =iv_rulePlannedSchedule; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlannedSchedule1903); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:973:1: rulePlannedSchedule returns [EObject current=null] : (otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:976:28: ( (otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:977:1: (otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:977:1: (otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:977:3: otherlv_0= 'PlannedSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulePlannedSchedule1940); 

                	newLeafNode(otherlv_0, grammarAccess.getPlannedScheduleAccess().getPlannedScheduleKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulePlannedSchedule1952); 

                	newLeafNode(otherlv_1, grammarAccess.getPlannedScheduleAccess().getStartKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:985:1: ( (lv_start_2_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:986:1: (lv_start_2_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:986:1: (lv_start_2_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:987:3: lv_start_2_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPlannedScheduleAccess().getStartDateParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_rulePlannedSchedule1973);
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

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_rulePlannedSchedule1985); 

                	newLeafNode(otherlv_3, grammarAccess.getPlannedScheduleAccess().getEndKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1007:1: ( (lv_end_4_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1008:1: (lv_end_4_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1008:1: (lv_end_4_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1009:3: lv_end_4_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPlannedScheduleAccess().getEndDateParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_rulePlannedSchedule2006);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_rulePlannedSchedule2018); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1037:1: entryRuleActualSchedule returns [EObject current=null] : iv_ruleActualSchedule= ruleActualSchedule EOF ;
    public final EObject entryRuleActualSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualSchedule = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1038:2: (iv_ruleActualSchedule= ruleActualSchedule EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1039:2: iv_ruleActualSchedule= ruleActualSchedule EOF
            {
             newCompositeNode(grammarAccess.getActualScheduleRule()); 
            pushFollow(FOLLOW_ruleActualSchedule_in_entryRuleActualSchedule2054);
            iv_ruleActualSchedule=ruleActualSchedule();

            state._fsp--;

             current =iv_ruleActualSchedule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualSchedule2064); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1046:1: ruleActualSchedule returns [EObject current=null] : (otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1049:28: ( (otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1050:1: (otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1050:1: (otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1050:3: otherlv_0= 'ActualSchedule {' otherlv_1= 'Start' ( (lv_start_2_0= ruleDate ) ) otherlv_3= 'End' ( (lv_end_4_0= ruleDate ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleActualSchedule2101); 

                	newLeafNode(otherlv_0, grammarAccess.getActualScheduleAccess().getActualScheduleKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleActualSchedule2113); 

                	newLeafNode(otherlv_1, grammarAccess.getActualScheduleAccess().getStartKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1058:1: ( (lv_start_2_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1059:1: (lv_start_2_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1059:1: (lv_start_2_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1060:3: lv_start_2_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getActualScheduleAccess().getStartDateParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_ruleActualSchedule2134);
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

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleActualSchedule2146); 

                	newLeafNode(otherlv_3, grammarAccess.getActualScheduleAccess().getEndKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1080:1: ( (lv_end_4_0= ruleDate ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1081:1: (lv_end_4_0= ruleDate )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1081:1: (lv_end_4_0= ruleDate )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1082:3: lv_end_4_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getActualScheduleAccess().getEndDateParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_ruleActualSchedule2167);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleActualSchedule2179); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1110:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1111:2: (iv_ruleDate= ruleDate EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1112:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate2215);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate2225); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1119:1: ruleDate returns [EObject current=null] : ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_day_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        EObject lv_month_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1122:28: ( ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1123:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1123:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1123:2: ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1123:2: ( (lv_day_0_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1124:1: (lv_day_0_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1124:1: (lv_day_0_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1125:3: lv_day_0_0= RULE_INT
            {
            lv_day_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate2267); 

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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleDate2284); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getHyphenMinusKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1145:1: ( (lv_month_2_0= ruleMonth ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1146:1: (lv_month_2_0= ruleMonth )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1146:1: (lv_month_2_0= ruleMonth )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1147:3: lv_month_2_0= ruleMonth
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMonth_in_ruleDate2305);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleDate2317); 

                	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getHyphenMinusKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1167:1: ( (lv_year_4_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1168:1: (lv_year_4_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1168:1: (lv_year_4_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1169:3: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate2334); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1193:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1194:2: (iv_ruleMonth= ruleMonth EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1195:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_ruleMonth_in_entryRuleMonth2375);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonth2385); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1202:1: ruleMonth returns [EObject current=null] : ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1205:28: ( ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1206:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1206:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1207:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1207:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1208:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1208:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            int alt23=12;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt23=1;
                }
                break;
            case 44:
                {
                alt23=2;
                }
                break;
            case 45:
                {
                alt23=3;
                }
                break;
            case 46:
                {
                alt23=4;
                }
                break;
            case 47:
                {
                alt23=5;
                }
                break;
            case 48:
                {
                alt23=6;
                }
                break;
            case 49:
                {
                alt23=7;
                }
                break;
            case 50:
                {
                alt23=8;
                }
                break;
            case 51:
                {
                alt23=9;
                }
                break;
            case 52:
                {
                alt23=10;
                }
                break;
            case 53:
                {
                alt23=11;
                }
                break;
            case 54:
                {
                alt23=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1209:3: lv_name_0_1= 'Jan'
                    {
                    lv_name_0_1=(Token)match(input,43,FOLLOW_43_in_ruleMonth2429); 

                            newLeafNode(lv_name_0_1, grammarAccess.getMonthAccess().getNameJanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1221:8: lv_name_0_2= 'Feb'
                    {
                    lv_name_0_2=(Token)match(input,44,FOLLOW_44_in_ruleMonth2458); 

                            newLeafNode(lv_name_0_2, grammarAccess.getMonthAccess().getNameFebKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1233:8: lv_name_0_3= 'Mar'
                    {
                    lv_name_0_3=(Token)match(input,45,FOLLOW_45_in_ruleMonth2487); 

                            newLeafNode(lv_name_0_3, grammarAccess.getMonthAccess().getNameMarKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1245:8: lv_name_0_4= 'Apr'
                    {
                    lv_name_0_4=(Token)match(input,46,FOLLOW_46_in_ruleMonth2516); 

                            newLeafNode(lv_name_0_4, grammarAccess.getMonthAccess().getNameAprKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1257:8: lv_name_0_5= 'May'
                    {
                    lv_name_0_5=(Token)match(input,47,FOLLOW_47_in_ruleMonth2545); 

                            newLeafNode(lv_name_0_5, grammarAccess.getMonthAccess().getNameMayKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1269:8: lv_name_0_6= 'Jun'
                    {
                    lv_name_0_6=(Token)match(input,48,FOLLOW_48_in_ruleMonth2574); 

                            newLeafNode(lv_name_0_6, grammarAccess.getMonthAccess().getNameJunKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1281:8: lv_name_0_7= 'Jul'
                    {
                    lv_name_0_7=(Token)match(input,49,FOLLOW_49_in_ruleMonth2603); 

                            newLeafNode(lv_name_0_7, grammarAccess.getMonthAccess().getNameJulKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1293:8: lv_name_0_8= 'Aug'
                    {
                    lv_name_0_8=(Token)match(input,50,FOLLOW_50_in_ruleMonth2632); 

                            newLeafNode(lv_name_0_8, grammarAccess.getMonthAccess().getNameAugKeyword_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1305:8: lv_name_0_9= 'Sep'
                    {
                    lv_name_0_9=(Token)match(input,51,FOLLOW_51_in_ruleMonth2661); 

                            newLeafNode(lv_name_0_9, grammarAccess.getMonthAccess().getNameSepKeyword_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1317:8: lv_name_0_10= 'Oct'
                    {
                    lv_name_0_10=(Token)match(input,52,FOLLOW_52_in_ruleMonth2690); 

                            newLeafNode(lv_name_0_10, grammarAccess.getMonthAccess().getNameOctKeyword_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1329:8: lv_name_0_11= 'Nov'
                    {
                    lv_name_0_11=(Token)match(input,53,FOLLOW_53_in_ruleMonth2719); 

                            newLeafNode(lv_name_0_11, grammarAccess.getMonthAccess().getNameNovKeyword_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1341:8: lv_name_0_12= 'Dec'
                    {
                    lv_name_0_12=(Token)match(input,54,FOLLOW_54_in_ruleMonth2748); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1364:1: entryRuleOrganizations returns [EObject current=null] : iv_ruleOrganizations= ruleOrganizations EOF ;
    public final EObject entryRuleOrganizations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizations = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1365:2: (iv_ruleOrganizations= ruleOrganizations EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1366:2: iv_ruleOrganizations= ruleOrganizations EOF
            {
             newCompositeNode(grammarAccess.getOrganizationsRule()); 
            pushFollow(FOLLOW_ruleOrganizations_in_entryRuleOrganizations2799);
            iv_ruleOrganizations=ruleOrganizations();

            state._fsp--;

             current =iv_ruleOrganizations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganizations2809); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1373:1: ruleOrganizations returns [EObject current=null] : (otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1376:28: ( (otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1377:1: (otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1377:1: (otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1377:3: otherlv_0= 'Organizations {' otherlv_1= 'Customer' ( (lv_customer_2_0= RULE_STRING ) ) otherlv_3= 'Supplier' ( (lv_supplier_4_0= RULE_STRING ) ) otherlv_5= 'Partners' ( (lv_partners_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleOrganizations2846); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganizationsAccess().getOrganizationsKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleOrganizations2858); 

                	newLeafNode(otherlv_1, grammarAccess.getOrganizationsAccess().getCustomerKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1385:1: ( (lv_customer_2_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1386:1: (lv_customer_2_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1386:1: (lv_customer_2_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1387:3: lv_customer_2_0= RULE_STRING
            {
            lv_customer_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizations2875); 

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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleOrganizations2892); 

                	newLeafNode(otherlv_3, grammarAccess.getOrganizationsAccess().getSupplierKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1407:1: ( (lv_supplier_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1408:1: (lv_supplier_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1408:1: (lv_supplier_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1409:3: lv_supplier_4_0= RULE_STRING
            {
            lv_supplier_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizations2909); 

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

            otherlv_5=(Token)match(input,58,FOLLOW_58_in_ruleOrganizations2926); 

                	newLeafNode(otherlv_5, grammarAccess.getOrganizationsAccess().getPartnersKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1429:1: ( (lv_partners_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1430:1: (lv_partners_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1430:1: (lv_partners_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1431:3: lv_partners_6_0= RULE_STRING
            {
            lv_partners_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrganizations2943); 

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

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleOrganizations2960); 

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


    // $ANTLR start "entryRuleStatus"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1459:1: entryRuleStatus returns [EObject current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final EObject entryRuleStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatus = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1460:2: (iv_ruleStatus= ruleStatus EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1461:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_ruleStatus_in_entryRuleStatus2996);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatus3006); 

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
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1468:1: ruleStatus returns [EObject current=null] : ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) ) ;
    public final EObject ruleStatus() throws RecognitionException {
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1471:28: ( ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1472:1: ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1472:1: ( ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1473:1: ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1473:1: ( (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1474:1: (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1474:1: (lv_value_0_1= 'Not-Plan' | lv_value_0_2= 'Plan' | lv_value_0_3= 'On-Design' | lv_value_0_4= 'On-Develop' | lv_value_0_5= 'On-Test' | lv_value_0_6= 'On-Deploy' | lv_value_0_7= 'Concluded' )
            int alt24=7;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt24=1;
                }
                break;
            case 60:
                {
                alt24=2;
                }
                break;
            case 61:
                {
                alt24=3;
                }
                break;
            case 62:
                {
                alt24=4;
                }
                break;
            case 63:
                {
                alt24=5;
                }
                break;
            case 64:
                {
                alt24=6;
                }
                break;
            case 65:
                {
                alt24=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1475:3: lv_value_0_1= 'Not-Plan'
                    {
                    lv_value_0_1=(Token)match(input,59,FOLLOW_59_in_ruleStatus3050); 

                            newLeafNode(lv_value_0_1, grammarAccess.getStatusAccess().getValueNotPlanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatusRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1487:8: lv_value_0_2= 'Plan'
                    {
                    lv_value_0_2=(Token)match(input,60,FOLLOW_60_in_ruleStatus3079); 

                            newLeafNode(lv_value_0_2, grammarAccess.getStatusAccess().getValuePlanKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatusRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1499:8: lv_value_0_3= 'On-Design'
                    {
                    lv_value_0_3=(Token)match(input,61,FOLLOW_61_in_ruleStatus3108); 

                            newLeafNode(lv_value_0_3, grammarAccess.getStatusAccess().getValueOnDesignKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatusRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1511:8: lv_value_0_4= 'On-Develop'
                    {
                    lv_value_0_4=(Token)match(input,62,FOLLOW_62_in_ruleStatus3137); 

                            newLeafNode(lv_value_0_4, grammarAccess.getStatusAccess().getValueOnDevelopKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatusRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1523:8: lv_value_0_5= 'On-Test'
                    {
                    lv_value_0_5=(Token)match(input,63,FOLLOW_63_in_ruleStatus3166); 

                            newLeafNode(lv_value_0_5, grammarAccess.getStatusAccess().getValueOnTestKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatusRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1535:8: lv_value_0_6= 'On-Deploy'
                    {
                    lv_value_0_6=(Token)match(input,64,FOLLOW_64_in_ruleStatus3195); 

                            newLeafNode(lv_value_0_6, grammarAccess.getStatusAccess().getValueOnDeployKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatusRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1547:8: lv_value_0_7= 'Concluded'
                    {
                    lv_value_0_7=(Token)match(input,65,FOLLOW_65_in_ruleStatus3224); 

                            newLeafNode(lv_value_0_7, grammarAccess.getStatusAccess().getValueConcludedKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatusRule());
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
    // $ANTLR end "ruleStatus"


    // $ANTLR start "entryRuleSystem"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1570:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1571:2: (iv_ruleSystem= ruleSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1572:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem3275);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem3285); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1579:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Project' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'PartOf' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
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
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1582:28: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Project' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'PartOf' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1583:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Project' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'PartOf' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1583:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Project' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'PartOf' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1583:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Project' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'PartOf' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleSystem3322); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1587:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1588:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1588:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1589:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem3339); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem3356); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1609:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1609:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSystem3369); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1613:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1614:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1614:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1615:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem3386); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1631:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1631:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleSystem3406); 

                        	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1635:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1636:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1636:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1637:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem3423); 

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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSystem3442); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getProjectKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1657:1: ( (otherlv_8= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1658:1: (otherlv_8= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1658:1: (otherlv_8= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1659:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem3462); 

            		newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getProjectProjectCrossReference_6_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1670:2: (otherlv_9= 'PartOf' ( (otherlv_10= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==67) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1670:4: otherlv_9= 'PartOf' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,67,FOLLOW_67_in_ruleSystem3475); 

                        	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getPartOfKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1674:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1675:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1675:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1676:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem3495); 

                    		newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getPartOfSystemCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleSystem3509); 

                	newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleGlossaryTerm"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1699:1: entryRuleGlossaryTerm returns [EObject current=null] : iv_ruleGlossaryTerm= ruleGlossaryTerm EOF ;
    public final EObject entryRuleGlossaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossaryTerm = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1700:2: (iv_ruleGlossaryTerm= ruleGlossaryTerm EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1701:2: iv_ruleGlossaryTerm= ruleGlossaryTerm EOF
            {
             newCompositeNode(grammarAccess.getGlossaryTermRule()); 
            pushFollow(FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm3545);
            iv_ruleGlossaryTerm=ruleGlossaryTerm();

            state._fsp--;

             current =iv_ruleGlossaryTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossaryTerm3555); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1708:1: ruleGlossaryTerm returns [EObject current=null] : (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' ) ;
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
        Token lv_synset_14_0=null;
        Token otherlv_16=null;
        EObject lv_type_8_0 = null;

        EObject lv_termRelation_15_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1711:28: ( (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1712:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1712:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1712:3: otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleGlossaryTerm3592); 

                	newLeafNode(otherlv_0, grammarAccess.getGlossaryTermAccess().getGlossaryTermKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1716:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1717:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1717:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1718:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlossaryTerm3609); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGlossaryTerm3626); 

                	newLeafNode(otherlv_2, grammarAccess.getGlossaryTermAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1738:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1738:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleGlossaryTerm3639); 

                        	newLeafNode(otherlv_3, grammarAccess.getGlossaryTermAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1742:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1743:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1743:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1744:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm3656); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1760:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1760:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleGlossaryTerm3676); 

                        	newLeafNode(otherlv_5, grammarAccess.getGlossaryTermAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1764:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1765:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1765:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1766:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm3693); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleGlossaryTerm3712); 

                	newLeafNode(otherlv_7, grammarAccess.getGlossaryTermAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1786:1: ( (lv_type_8_0= ruleRefTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1787:1: (lv_type_8_0= ruleRefTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1787:1: (lv_type_8_0= ruleRefTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1788:3: lv_type_8_0= ruleRefTermType
            {
             
            	        newCompositeNode(grammarAccess.getGlossaryTermAccess().getTypeRefTermTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleRefTermType_in_ruleGlossaryTerm3733);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1804:2: (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==69) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1804:4: otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,69,FOLLOW_69_in_ruleGlossaryTerm3746); 

                        	newLeafNode(otherlv_9, grammarAccess.getGlossaryTermAccess().getAcronymKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1808:1: ( (lv_acronym_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1809:1: (lv_acronym_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1809:1: (lv_acronym_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1810:3: lv_acronym_10_0= RULE_STRING
                    {
                    lv_acronym_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm3763); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1826:4: (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==70) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1826:6: otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    {
                    otherlv_11=(Token)match(input,70,FOLLOW_70_in_ruleGlossaryTerm3783); 

                        	newLeafNode(otherlv_11, grammarAccess.getGlossaryTermAccess().getPOSKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1830:1: ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1831:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1831:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1832:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1832:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    int alt31=4;
                    switch ( input.LA(1) ) {
                    case 71:
                        {
                        alt31=1;
                        }
                        break;
                    case 72:
                        {
                        alt31=2;
                        }
                        break;
                    case 73:
                        {
                        alt31=3;
                        }
                        break;
                    case 74:
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
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1833:3: lv_pos_12_1= 'Adjective'
                            {
                            lv_pos_12_1=(Token)match(input,71,FOLLOW_71_in_ruleGlossaryTerm3803); 

                                    newLeafNode(lv_pos_12_1, grammarAccess.getGlossaryTermAccess().getPosAdjectiveKeyword_8_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1845:8: lv_pos_12_2= 'Adverb'
                            {
                            lv_pos_12_2=(Token)match(input,72,FOLLOW_72_in_ruleGlossaryTerm3832); 

                                    newLeafNode(lv_pos_12_2, grammarAccess.getGlossaryTermAccess().getPosAdverbKeyword_8_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1857:8: lv_pos_12_3= 'Noun'
                            {
                            lv_pos_12_3=(Token)match(input,73,FOLLOW_73_in_ruleGlossaryTerm3861); 

                                    newLeafNode(lv_pos_12_3, grammarAccess.getGlossaryTermAccess().getPosNounKeyword_8_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1869:8: lv_pos_12_4= 'Verb'
                            {
                            lv_pos_12_4=(Token)match(input,74,FOLLOW_74_in_ruleGlossaryTerm3890); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1884:4: (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==75) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1884:6: otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,75,FOLLOW_75_in_ruleGlossaryTerm3921); 

                        	newLeafNode(otherlv_13, grammarAccess.getGlossaryTermAccess().getSynsetKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1888:1: ( (lv_synset_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1889:1: (lv_synset_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1889:1: (lv_synset_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1890:3: lv_synset_14_0= RULE_STRING
                    {
                    lv_synset_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm3938); 

                    			newLeafNode(lv_synset_14_0, grammarAccess.getGlossaryTermAccess().getSynsetSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"synset",
                            		lv_synset_14_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1906:4: ( (lv_termRelation_15_0= ruleTermRelation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=81 && LA34_0<=83)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1907:1: (lv_termRelation_15_0= ruleTermRelation )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1907:1: (lv_termRelation_15_0= ruleTermRelation )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1908:3: lv_termRelation_15_0= ruleTermRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlossaryTermAccess().getTermRelationTermRelationParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTermRelation_in_ruleGlossaryTerm3966);
            	    lv_termRelation_15_0=ruleTermRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlossaryTermRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"termRelation",
            	            		lv_termRelation_15_0, 
            	            		"TermRelation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleGlossaryTerm3979); 

                	newLeafNode(otherlv_16, grammarAccess.getGlossaryTermAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1936:1: entryRuleRefTermType returns [EObject current=null] : iv_ruleRefTermType= ruleRefTermType EOF ;
    public final EObject entryRuleRefTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1937:2: (iv_ruleRefTermType= ruleRefTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1938:2: iv_ruleRefTermType= ruleRefTermType EOF
            {
             newCompositeNode(grammarAccess.getRefTermTypeRule()); 
            pushFollow(FOLLOW_ruleRefTermType_in_entryRuleRefTermType4015);
            iv_ruleRefTermType=ruleRefTermType();

            state._fsp--;

             current =iv_ruleRefTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTermType4025); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1945:1: ruleRefTermType returns [EObject current=null] : ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) ;
    public final EObject ruleRefTermType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_refType_0_0 = null;

        EObject lv_refs_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1948:28: ( ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1949:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1949:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1949:2: ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1949:2: ( (lv_refType_0_0= ruleTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1950:1: (lv_refType_0_0= ruleTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1950:1: (lv_refType_0_0= ruleTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1951:3: lv_refType_0_0= ruleTermType
            {
             
            	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefTypeTermTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType4071);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1967:2: (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==76) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1967:4: otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleRefTermType4084); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefTermTypeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1971:1: ( (lv_refs_2_0= ruleTermType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1972:1: (lv_refs_2_0= ruleTermType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1972:1: (lv_refs_2_0= ruleTermType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1973:3: lv_refs_2_0= ruleTermType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefsTermTypeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType4105);
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
            	    break loop35;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1997:1: entryRuleTermType returns [EObject current=null] : iv_ruleTermType= ruleTermType EOF ;
    public final EObject entryRuleTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1998:2: (iv_ruleTermType= ruleTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1999:2: iv_ruleTermType= ruleTermType EOF
            {
             newCompositeNode(grammarAccess.getTermTypeRule()); 
            pushFollow(FOLLOW_ruleTermType_in_entryRuleTermType4143);
            iv_ruleTermType=ruleTermType();

            state._fsp--;

             current =iv_ruleTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermType4153); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2006:1: ruleTermType returns [EObject current=null] : ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) ;
    public final EObject ruleTermType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2009:28: ( ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2010:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2010:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2011:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2011:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2012:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2012:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt36=1;
                }
                break;
            case 78:
                {
                alt36=2;
                }
                break;
            case 79:
                {
                alt36=3;
                }
                break;
            case 80:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2013:3: lv_type_0_1= 'Stakeholder'
                    {
                    lv_type_0_1=(Token)match(input,77,FOLLOW_77_in_ruleTermType4197); 

                            newLeafNode(lv_type_0_1, grammarAccess.getTermTypeAccess().getTypeStakeholderKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2025:8: lv_type_0_2= 'Entity'
                    {
                    lv_type_0_2=(Token)match(input,78,FOLLOW_78_in_ruleTermType4226); 

                            newLeafNode(lv_type_0_2, grammarAccess.getTermTypeAccess().getTypeEntityKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2037:8: lv_type_0_3= 'Architectural'
                    {
                    lv_type_0_3=(Token)match(input,79,FOLLOW_79_in_ruleTermType4255); 

                            newLeafNode(lv_type_0_3, grammarAccess.getTermTypeAccess().getTypeArchitecturalKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2049:8: lv_type_0_4= 'Actor'
                    {
                    lv_type_0_4=(Token)match(input,80,FOLLOW_80_in_ruleTermType4284); 

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


    // $ANTLR start "entryRuleTermRelation"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2072:1: entryRuleTermRelation returns [EObject current=null] : iv_ruleTermRelation= ruleTermRelation EOF ;
    public final EObject entryRuleTermRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermRelation = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2073:2: (iv_ruleTermRelation= ruleTermRelation EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2074:2: iv_ruleTermRelation= ruleTermRelation EOF
            {
             newCompositeNode(grammarAccess.getTermRelationRule()); 
            pushFollow(FOLLOW_ruleTermRelation_in_entryRuleTermRelation4335);
            iv_ruleTermRelation=ruleTermRelation();

            state._fsp--;

             current =iv_ruleTermRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermRelation4345); 

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
    // $ANTLR end "entryRuleTermRelation"


    // $ANTLR start "ruleTermRelation"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2081:1: ruleTermRelation returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) ) ;
    public final EObject ruleTermRelation() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refTerm_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2084:28: ( ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2085:1: ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2085:1: ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2085:2: ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2085:2: ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2086:1: ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2086:1: ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2087:1: (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2087:1: (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt37=1;
                }
                break;
            case 82:
                {
                alt37=2;
                }
                break;
            case 83:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2088:3: lv_type_0_1= 'Antonym'
                    {
                    lv_type_0_1=(Token)match(input,81,FOLLOW_81_in_ruleTermRelation4390); 

                            newLeafNode(lv_type_0_1, grammarAccess.getTermRelationAccess().getTypeAntonymKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2100:8: lv_type_0_2= 'Hypernym'
                    {
                    lv_type_0_2=(Token)match(input,82,FOLLOW_82_in_ruleTermRelation4419); 

                            newLeafNode(lv_type_0_2, grammarAccess.getTermRelationAccess().getTypeHypernymKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2112:8: lv_type_0_3= 'Synonym'
                    {
                    lv_type_0_3=(Token)match(input,83,FOLLOW_83_in_ruleTermRelation4448); 

                            newLeafNode(lv_type_0_3, grammarAccess.getTermRelationAccess().getTypeSynonymKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2127:2: ( (lv_refTerm_1_0= ruleRefTerm ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2128:1: (lv_refTerm_1_0= ruleRefTerm )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2128:1: (lv_refTerm_1_0= ruleRefTerm )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2129:3: lv_refTerm_1_0= ruleRefTerm
            {
             
            	        newCompositeNode(grammarAccess.getTermRelationAccess().getRefTermRefTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefTerm_in_ruleTermRelation4485);
            lv_refTerm_1_0=ruleRefTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermRelationRule());
            	        }
                   		set(
                   			current, 
                   			"refTerm",
                    		lv_refTerm_1_0, 
                    		"RefTerm");
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
    // $ANTLR end "ruleTermRelation"


    // $ANTLR start "entryRuleRefTerm"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2153:1: entryRuleRefTerm returns [EObject current=null] : iv_ruleRefTerm= ruleRefTerm EOF ;
    public final EObject entryRuleRefTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTerm = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2154:2: (iv_ruleRefTerm= ruleRefTerm EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2155:2: iv_ruleRefTerm= ruleRefTerm EOF
            {
             newCompositeNode(grammarAccess.getRefTermRule()); 
            pushFollow(FOLLOW_ruleRefTerm_in_entryRuleRefTerm4521);
            iv_ruleRefTerm=ruleRefTerm();

            state._fsp--;

             current =iv_ruleRefTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTerm4531); 

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
    // $ANTLR end "entryRuleRefTerm"


    // $ANTLR start "ruleRefTerm"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2162:1: ruleRefTerm returns [EObject current=null] : ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleRefTerm() throws RecognitionException {
        EObject current = null;

        Token lv_refTerm_0_0=null;
        Token otherlv_1=null;
        Token lv_refs_2_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2165:28: ( ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2166:1: ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2166:1: ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2166:2: ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2166:2: ( (lv_refTerm_0_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2167:1: (lv_refTerm_0_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2167:1: (lv_refTerm_0_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2168:3: lv_refTerm_0_0= RULE_STRING
            {
            lv_refTerm_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefTerm4573); 

            			newLeafNode(lv_refTerm_0_0, grammarAccess.getRefTermAccess().getRefTermSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefTermRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"refTerm",
                    		lv_refTerm_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2184:2: (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==76) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2184:4: otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleRefTerm4591); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefTermAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2188:1: ( (lv_refs_2_0= RULE_STRING ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2189:1: (lv_refs_2_0= RULE_STRING )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2189:1: (lv_refs_2_0= RULE_STRING )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2190:3: lv_refs_2_0= RULE_STRING
            	    {
            	    lv_refs_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefTerm4608); 

            	    			newLeafNode(lv_refs_2_0, grammarAccess.getRefTermAccess().getRefsSTRINGTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefTermRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"refs",
            	            		lv_refs_2_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "ruleRefTerm"


    // $ANTLR start "entryRuleStakeholder"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2214:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2215:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2216:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder4651);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder4661); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2223:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
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

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2226:28: ( (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2227:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2227:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2227:3: otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleStakeholder4698); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2231:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2232:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2232:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2233:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder4715); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStakeholder4732); 

                	newLeafNode(otherlv_2, grammarAccess.getStakeholderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2253:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2253:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStakeholder4745); 

                        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2257:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2258:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2258:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2259:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder4762); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2275:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2275:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleStakeholder4782); 

                        	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2279:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2280:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2280:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2281:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder4799); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStakeholder4818); 

                	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2301:1: ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2302:1: ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2302:1: ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2303:1: (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2303:1: (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt41=1;
                }
                break;
            case 85:
                {
                alt41=2;
                }
                break;
            case 86:
                {
                alt41=3;
                }
                break;
            case 87:
                {
                alt41=4;
                }
                break;
            case 88:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2304:3: lv_type_8_1= 'Group.Organization'
                    {
                    lv_type_8_1=(Token)match(input,84,FOLLOW_84_in_ruleStakeholder4838); 

                            newLeafNode(lv_type_8_1, grammarAccess.getStakeholderAccess().getTypeGroupOrganizationKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2316:8: lv_type_8_2= 'Group.BusinessUnit'
                    {
                    lv_type_8_2=(Token)match(input,85,FOLLOW_85_in_ruleStakeholder4867); 

                            newLeafNode(lv_type_8_2, grammarAccess.getStakeholderAccess().getTypeGroupBusinessUnitKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2328:8: lv_type_8_3= 'Group.Team'
                    {
                    lv_type_8_3=(Token)match(input,86,FOLLOW_86_in_ruleStakeholder4896); 

                            newLeafNode(lv_type_8_3, grammarAccess.getStakeholderAccess().getTypeGroupTeamKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2340:8: lv_type_8_4= 'Individual.Person'
                    {
                    lv_type_8_4=(Token)match(input,87,FOLLOW_87_in_ruleStakeholder4925); 

                            newLeafNode(lv_type_8_4, grammarAccess.getStakeholderAccess().getTypeIndividualPersonKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2352:8: lv_type_8_5= 'Individual.ExternalSystem'
                    {
                    lv_type_8_5=(Token)match(input,88,FOLLOW_88_in_ruleStakeholder4954); 

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

            otherlv_9=(Token)match(input,89,FOLLOW_89_in_ruleStakeholder4982); 

                	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getCategoryKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2371:1: ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2372:1: ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2372:1: ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2373:1: (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2373:1: (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' )
            int alt42=16;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt42=1;
                }
                break;
            case 91:
                {
                alt42=2;
                }
                break;
            case 92:
                {
                alt42=3;
                }
                break;
            case 93:
                {
                alt42=4;
                }
                break;
            case 94:
                {
                alt42=5;
                }
                break;
            case 95:
                {
                alt42=6;
                }
                break;
            case 96:
                {
                alt42=7;
                }
                break;
            case 97:
                {
                alt42=8;
                }
                break;
            case 98:
                {
                alt42=9;
                }
                break;
            case 99:
                {
                alt42=10;
                }
                break;
            case 100:
                {
                alt42=11;
                }
                break;
            case 101:
                {
                alt42=12;
                }
                break;
            case 102:
                {
                alt42=13;
                }
                break;
            case 103:
                {
                alt42=14;
                }
                break;
            case 104:
                {
                alt42=15;
                }
                break;
            case 105:
                {
                alt42=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2374:3: lv_category_10_1= 'Business'
                    {
                    lv_category_10_1=(Token)match(input,90,FOLLOW_90_in_ruleStakeholder5002); 

                            newLeafNode(lv_category_10_1, grammarAccess.getStakeholderAccess().getCategoryBusinessKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2386:8: lv_category_10_2= 'Business.Customer'
                    {
                    lv_category_10_2=(Token)match(input,91,FOLLOW_91_in_ruleStakeholder5031); 

                            newLeafNode(lv_category_10_2, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2398:8: lv_category_10_3= 'Business.Customer.Sponsor'
                    {
                    lv_category_10_3=(Token)match(input,92,FOLLOW_92_in_ruleStakeholder5060); 

                            newLeafNode(lv_category_10_3, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerSponsorKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2410:8: lv_category_10_4= 'Business.Customer.Champion'
                    {
                    lv_category_10_4=(Token)match(input,93,FOLLOW_93_in_ruleStakeholder5089); 

                            newLeafNode(lv_category_10_4, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerChampionKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2422:8: lv_category_10_5= 'Business.User.Direct'
                    {
                    lv_category_10_5=(Token)match(input,94,FOLLOW_94_in_ruleStakeholder5118); 

                            newLeafNode(lv_category_10_5, grammarAccess.getStakeholderAccess().getCategoryBusinessUserDirectKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2434:8: lv_category_10_6= 'Business.User.Indirect'
                    {
                    lv_category_10_6=(Token)match(input,95,FOLLOW_95_in_ruleStakeholder5147); 

                            newLeafNode(lv_category_10_6, grammarAccess.getStakeholderAccess().getCategoryBusinessUserIndirectKeyword_8_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2446:8: lv_category_10_7= 'Business.Advisor.DomainExpert'
                    {
                    lv_category_10_7=(Token)match(input,96,FOLLOW_96_in_ruleStakeholder5176); 

                            newLeafNode(lv_category_10_7, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorDomainExpertKeyword_8_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2458:8: lv_category_10_8= 'Business.Advisor.Trainer'
                    {
                    lv_category_10_8=(Token)match(input,97,FOLLOW_97_in_ruleStakeholder5205); 

                            newLeafNode(lv_category_10_8, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorTrainerKeyword_8_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2470:8: lv_category_10_9= 'Business.Advisor.RegulatorAgent'
                    {
                    lv_category_10_9=(Token)match(input,98,FOLLOW_98_in_ruleStakeholder5234); 

                            newLeafNode(lv_category_10_9, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorRegulatorAgentKeyword_8_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2482:8: lv_category_10_10= 'Business.System'
                    {
                    lv_category_10_10=(Token)match(input,99,FOLLOW_99_in_ruleStakeholder5263); 

                            newLeafNode(lv_category_10_10, grammarAccess.getStakeholderAccess().getCategoryBusinessSystemKeyword_8_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2494:8: lv_category_10_11= 'Technical'
                    {
                    lv_category_10_11=(Token)match(input,100,FOLLOW_100_in_ruleStakeholder5292); 

                            newLeafNode(lv_category_10_11, grammarAccess.getStakeholderAccess().getCategoryTechnicalKeyword_8_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2506:8: lv_category_10_12= 'Technical.BusinessAnalyst'
                    {
                    lv_category_10_12=(Token)match(input,101,FOLLOW_101_in_ruleStakeholder5321); 

                            newLeafNode(lv_category_10_12, grammarAccess.getStakeholderAccess().getCategoryTechnicalBusinessAnalystKeyword_8_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_12, null);
                    	    

                    }
                    break;
                case 13 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2518:8: lv_category_10_13= 'Technical.Requirements.Engineer'
                    {
                    lv_category_10_13=(Token)match(input,102,FOLLOW_102_in_ruleStakeholder5350); 

                            newLeafNode(lv_category_10_13, grammarAccess.getStakeholderAccess().getCategoryTechnicalRequirementsEngineerKeyword_8_0_12());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_13, null);
                    	    

                    }
                    break;
                case 14 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2530:8: lv_category_10_14= 'Technical.Software.Architect'
                    {
                    lv_category_10_14=(Token)match(input,103,FOLLOW_103_in_ruleStakeholder5379); 

                            newLeafNode(lv_category_10_14, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareArchitectKeyword_8_0_13());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_14, null);
                    	    

                    }
                    break;
                case 15 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2542:8: lv_category_10_15= 'Technical.Software.Designer'
                    {
                    lv_category_10_15=(Token)match(input,104,FOLLOW_104_in_ruleStakeholder5408); 

                            newLeafNode(lv_category_10_15, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareDesignerKeyword_8_0_14());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_15, null);
                    	    

                    }
                    break;
                case 16 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2554:8: lv_category_10_16= 'Technical.Software.Tester'
                    {
                    lv_category_10_16=(Token)match(input,105,FOLLOW_105_in_ruleStakeholder5437); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2569:2: (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==67) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2569:4: otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,67,FOLLOW_67_in_ruleStakeholder5466); 

                        	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getPartOfKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2573:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2574:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2574:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2575:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder5486); 

                    		newLeafNode(otherlv_12, grammarAccess.getStakeholderAccess().getPartOfStakeholderCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleStakeholder5500); 

                	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2598:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2599:2: (iv_ruleGoal= ruleGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2600:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal5536);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal5546); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2607:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' ) ;
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
        Token otherlv_13=null;
        EObject lv_priority_10_0 = null;

        EObject lv_dependsOn_11_0 = null;

        EObject lv_composedBy_12_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2610:28: ( (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2611:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2611:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2611:3: otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleGoal5583); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2615:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2616:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2616:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2617:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal5600); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoal5617); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2637:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==19) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2637:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleGoal5630); 

                        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2641:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2642:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2642:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2643:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal5647); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2659:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2659:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleGoal5667); 

                        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2663:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2664:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2664:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2665:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal5684); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2681:4: (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==77) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2681:6: otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,77,FOLLOW_77_in_ruleGoal5704); 

                        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getStakeholderKeyword_5_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2685:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2686:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2686:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2687:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal5724); 

                    		newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getStakeholderStakeholderCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,107,FOLLOW_107_in_ruleGoal5738); 

                	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getPriorityKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2702:1: ( (lv_priority_10_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2703:1: (lv_priority_10_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2703:1: (lv_priority_10_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2704:3: lv_priority_10_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getGoalAccess().getPriorityPriorityParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleGoal5759);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2720:2: ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=112 && LA47_0<=116)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2721:1: (lv_dependsOn_11_0= ruleDependsOnGoal )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2721:1: (lv_dependsOn_11_0= ruleDependsOnGoal )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2722:3: lv_dependsOn_11_0= ruleDependsOnGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDependsOnDependsOnGoalParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnGoal_in_ruleGoal5780);
            	    lv_dependsOn_11_0=ruleDependsOnGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dependsOn",
            	            		lv_dependsOn_11_0, 
            	            		"DependsOnGoal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2738:3: ( (lv_composedBy_12_0= ruleComposedBy ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==117) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2739:1: (lv_composedBy_12_0= ruleComposedBy )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2739:1: (lv_composedBy_12_0= ruleComposedBy )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2740:3: lv_composedBy_12_0= ruleComposedBy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getComposedByComposedByParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComposedBy_in_ruleGoal5802);
            	    lv_composedBy_12_0=ruleComposedBy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"composedBy",
            	            		lv_composedBy_12_0, 
            	            		"ComposedBy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleGoal5815); 

                	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRulePriority"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2768:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2769:2: (iv_rulePriority= rulePriority EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2770:2: iv_rulePriority= rulePriority EOF
            {
             newCompositeNode(grammarAccess.getPriorityRule()); 
            pushFollow(FOLLOW_rulePriority_in_entryRulePriority5851);
            iv_rulePriority=rulePriority();

            state._fsp--;

             current =iv_rulePriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePriority5861); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2777:1: rulePriority returns [EObject current=null] : ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2780:28: ( ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2781:1: ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2781:1: ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2782:1: ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2782:1: ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2783:1: (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2783:1: (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt49=1;
                }
                break;
            case 109:
                {
                alt49=2;
                }
                break;
            case 110:
                {
                alt49=3;
                }
                break;
            case 111:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2784:3: lv_value_0_1= 'Must'
                    {
                    lv_value_0_1=(Token)match(input,108,FOLLOW_108_in_rulePriority5905); 

                            newLeafNode(lv_value_0_1, grammarAccess.getPriorityAccess().getValueMustKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2796:8: lv_value_0_2= 'Should'
                    {
                    lv_value_0_2=(Token)match(input,109,FOLLOW_109_in_rulePriority5934); 

                            newLeafNode(lv_value_0_2, grammarAccess.getPriorityAccess().getValueShouldKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2808:8: lv_value_0_3= 'Could'
                    {
                    lv_value_0_3=(Token)match(input,110,FOLLOW_110_in_rulePriority5963); 

                            newLeafNode(lv_value_0_3, grammarAccess.getPriorityAccess().getValueCouldKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2820:8: lv_value_0_4= 'Won\\'t'
                    {
                    lv_value_0_4=(Token)match(input,111,FOLLOW_111_in_rulePriority5992); 

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


    // $ANTLR start "entryRuleDependsOnGoal"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2843:1: entryRuleDependsOnGoal returns [EObject current=null] : iv_ruleDependsOnGoal= ruleDependsOnGoal EOF ;
    public final EObject entryRuleDependsOnGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2844:2: (iv_ruleDependsOnGoal= ruleDependsOnGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2845:2: iv_ruleDependsOnGoal= ruleDependsOnGoal EOF
            {
             newCompositeNode(grammarAccess.getDependsOnGoalRule()); 
            pushFollow(FOLLOW_ruleDependsOnGoal_in_entryRuleDependsOnGoal6043);
            iv_ruleDependsOnGoal=ruleDependsOnGoal();

            state._fsp--;

             current =iv_ruleDependsOnGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnGoal6053); 

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
    // $ANTLR end "entryRuleDependsOnGoal"


    // $ANTLR start "ruleDependsOnGoal"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2852:1: ruleDependsOnGoal returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) ) ;
    public final EObject ruleDependsOnGoal() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        EObject lv_refGoal_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2855:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2856:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2856:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2856:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2856:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2857:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2857:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2858:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2858:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt50=1;
                }
                break;
            case 113:
                {
                alt50=2;
                }
                break;
            case 114:
                {
                alt50=3;
                }
                break;
            case 115:
                {
                alt50=4;
                }
                break;
            case 116:
                {
                alt50=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2859:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,112,FOLLOW_112_in_ruleDependsOnGoal6098); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnGoalAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2871:8: lv_type_0_2= 'Supports'
                    {
                    lv_type_0_2=(Token)match(input,113,FOLLOW_113_in_ruleDependsOnGoal6127); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnGoalAccess().getTypeSupportsKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2883:8: lv_type_0_3= 'Obstructs'
                    {
                    lv_type_0_3=(Token)match(input,114,FOLLOW_114_in_ruleDependsOnGoal6156); 

                            newLeafNode(lv_type_0_3, grammarAccess.getDependsOnGoalAccess().getTypeObstructsKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2895:8: lv_type_0_4= 'Conflicts'
                    {
                    lv_type_0_4=(Token)match(input,115,FOLLOW_115_in_ruleDependsOnGoal6185); 

                            newLeafNode(lv_type_0_4, grammarAccess.getDependsOnGoalAccess().getTypeConflictsKeyword_0_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2907:8: lv_type_0_5= 'Identical'
                    {
                    lv_type_0_5=(Token)match(input,116,FOLLOW_116_in_ruleDependsOnGoal6214); 

                            newLeafNode(lv_type_0_5, grammarAccess.getDependsOnGoalAccess().getTypeIdenticalKeyword_0_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2922:2: ( (lv_refGoal_1_0= ruleRefGoal ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2923:1: (lv_refGoal_1_0= ruleRefGoal )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2923:1: (lv_refGoal_1_0= ruleRefGoal )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2924:3: lv_refGoal_1_0= ruleRefGoal
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnGoalAccess().getRefGoalRefGoalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefGoal_in_ruleDependsOnGoal6251);
            lv_refGoal_1_0=ruleRefGoal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependsOnGoalRule());
            	        }
                   		set(
                   			current, 
                   			"refGoal",
                    		lv_refGoal_1_0, 
                    		"RefGoal");
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
    // $ANTLR end "ruleDependsOnGoal"


    // $ANTLR start "entryRuleComposedBy"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2948:1: entryRuleComposedBy returns [EObject current=null] : iv_ruleComposedBy= ruleComposedBy EOF ;
    public final EObject entryRuleComposedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposedBy = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2949:2: (iv_ruleComposedBy= ruleComposedBy EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2950:2: iv_ruleComposedBy= ruleComposedBy EOF
            {
             newCompositeNode(grammarAccess.getComposedByRule()); 
            pushFollow(FOLLOW_ruleComposedBy_in_entryRuleComposedBy6287);
            iv_ruleComposedBy=ruleComposedBy();

            state._fsp--;

             current =iv_ruleComposedBy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComposedBy6297); 

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
    // $ANTLR end "entryRuleComposedBy"


    // $ANTLR start "ruleComposedBy"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2957:1: ruleComposedBy returns [EObject current=null] : (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) ) ;
    public final EObject ruleComposedBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        EObject lv_refGoal_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2960:28: ( (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2961:1: (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2961:1: (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2961:3: otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) )
            {
            otherlv_0=(Token)match(input,117,FOLLOW_117_in_ruleComposedBy6334); 

                	newLeafNode(otherlv_0, grammarAccess.getComposedByAccess().getComposedByKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2965:1: ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2966:1: ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2966:1: ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2967:1: (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2967:1: (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==118) ) {
                alt51=1;
            }
            else if ( (LA51_0==119) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2968:3: lv_type_1_1= 'Logic-And'
                    {
                    lv_type_1_1=(Token)match(input,118,FOLLOW_118_in_ruleComposedBy6354); 

                            newLeafNode(lv_type_1_1, grammarAccess.getComposedByAccess().getTypeLogicAndKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComposedByRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2980:8: lv_type_1_2= 'Logic-Or'
                    {
                    lv_type_1_2=(Token)match(input,119,FOLLOW_119_in_ruleComposedBy6383); 

                            newLeafNode(lv_type_1_2, grammarAccess.getComposedByAccess().getTypeLogicOrKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComposedByRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2995:2: ( (lv_refGoal_2_0= ruleRefGoal ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2996:1: (lv_refGoal_2_0= ruleRefGoal )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2996:1: (lv_refGoal_2_0= ruleRefGoal )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2997:3: lv_refGoal_2_0= ruleRefGoal
            {
             
            	        newCompositeNode(grammarAccess.getComposedByAccess().getRefGoalRefGoalParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRefGoal_in_ruleComposedBy6420);
            lv_refGoal_2_0=ruleRefGoal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComposedByRule());
            	        }
                   		set(
                   			current, 
                   			"refGoal",
                    		lv_refGoal_2_0, 
                    		"RefGoal");
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
    // $ANTLR end "ruleComposedBy"


    // $ANTLR start "entryRuleRefGoal"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3021:1: entryRuleRefGoal returns [EObject current=null] : iv_ruleRefGoal= ruleRefGoal EOF ;
    public final EObject entryRuleRefGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3022:2: (iv_ruleRefGoal= ruleRefGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3023:2: iv_ruleRefGoal= ruleRefGoal EOF
            {
             newCompositeNode(grammarAccess.getRefGoalRule()); 
            pushFollow(FOLLOW_ruleRefGoal_in_entryRuleRefGoal6456);
            iv_ruleRefGoal=ruleRefGoal();

            state._fsp--;

             current =iv_ruleRefGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGoal6466); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3030:1: ruleRefGoal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3033:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3034:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3034:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3034:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3034:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3035:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3035:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3036:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefGoalRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal6511); 

            		newLeafNode(otherlv_0, grammarAccess.getRefGoalAccess().getRefGoalGoalCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3047:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==76) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3047:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleRefGoal6524); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefGoalAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3051:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3052:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3052:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3053:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefGoalRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal6544); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefGoalAccess().getRefsGoalCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3072:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3073:2: (iv_ruleEntity= ruleEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3074:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity6582);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity6592); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3081:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3084:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3085:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3085:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3085:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleEntity6629); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3089:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3090:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3090:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3091:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity6646); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity6663); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3111:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==19) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3111:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEntity6676); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3115:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3116:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3116:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3117:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity6693); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3133:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==37) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3133:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleEntity6713); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3137:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3138:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3138:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3139:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity6730); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3155:4: (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==20) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3155:6: otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEntity6750); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getTypeKeyword_5_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3159:1: ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3160:1: ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3160:1: ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3161:1: (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3161:1: (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==120) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==121) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3162:3: lv_type_8_1= 'Principal'
                            {
                            lv_type_8_1=(Token)match(input,120,FOLLOW_120_in_ruleEntity6770); 

                                    newLeafNode(lv_type_8_1, grammarAccess.getEntityAccess().getTypePrincipalKeyword_5_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEntityRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_8_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3174:8: lv_type_8_2= 'Secondary'
                            {
                            lv_type_8_2=(Token)match(input,121,FOLLOW_121_in_ruleEntity6799); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3189:4: ( (lv_attributes_9_0= ruleAttribute ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==122) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3190:1: (lv_attributes_9_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3190:1: (lv_attributes_9_0= ruleAttribute )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3191:3: lv_attributes_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity6838);
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
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3207:3: ( (lv_primaryKey_10_0= rulePrimaryKey ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==144) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3208:1: (lv_primaryKey_10_0= rulePrimaryKey )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3208:1: (lv_primaryKey_10_0= rulePrimaryKey )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3209:3: lv_primaryKey_10_0= rulePrimaryKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getPrimaryKeyPrimaryKeyParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryKey_in_ruleEntity6860);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3225:3: ( (lv_foreignKeys_11_0= ruleForeignKey ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==147) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3226:1: (lv_foreignKeys_11_0= ruleForeignKey )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3226:1: (lv_foreignKeys_11_0= ruleForeignKey )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3227:3: lv_foreignKeys_11_0= ruleForeignKey
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getForeignKeysForeignKeyParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleForeignKey_in_ruleEntity6882);
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
            	    break loop59;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3243:3: ( (lv_checks_12_0= ruleCheck ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==148) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3244:1: (lv_checks_12_0= ruleCheck )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3244:1: (lv_checks_12_0= ruleCheck )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3245:3: lv_checks_12_0= ruleCheck
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getChecksCheckParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCheck_in_ruleEntity6904);
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
            	    break loop60;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleEntity6917); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3273:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3274:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3275:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute6953);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute6963); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3282:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3285:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3286:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3286:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3286:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,122,FOLLOW_122_in_ruleAttribute7000); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3290:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3291:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3291:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3292:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute7017); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute7034); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3312:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==19) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3312:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAttribute7047); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3316:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3317:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3317:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3318:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute7064); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3334:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==37) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3334:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleAttribute7084); 

                        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3338:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3339:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3339:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3340:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute7101); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleAttribute7120); 

                	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3360:1: ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3361:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3361:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3362:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3362:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            int alt63=12;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt63=1;
                }
                break;
            case 124:
                {
                alt63=2;
                }
                break;
            case 125:
                {
                alt63=3;
                }
                break;
            case 126:
                {
                alt63=4;
                }
                break;
            case 127:
                {
                alt63=5;
                }
                break;
            case 128:
                {
                alt63=6;
                }
                break;
            case 129:
                {
                alt63=7;
                }
                break;
            case 130:
                {
                alt63=8;
                }
                break;
            case 131:
                {
                alt63=9;
                }
                break;
            case 132:
                {
                alt63=10;
                }
                break;
            case 133:
                {
                alt63=11;
                }
                break;
            case 134:
                {
                alt63=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3363:3: lv_type_8_1= 'Boolean'
                    {
                    lv_type_8_1=(Token)match(input,123,FOLLOW_123_in_ruleAttribute7140); 

                            newLeafNode(lv_type_8_1, grammarAccess.getAttributeAccess().getTypeBooleanKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3375:8: lv_type_8_2= 'Integer'
                    {
                    lv_type_8_2=(Token)match(input,124,FOLLOW_124_in_ruleAttribute7169); 

                            newLeafNode(lv_type_8_2, grammarAccess.getAttributeAccess().getTypeIntegerKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3387:8: lv_type_8_3= 'Decimal'
                    {
                    lv_type_8_3=(Token)match(input,125,FOLLOW_125_in_ruleAttribute7198); 

                            newLeafNode(lv_type_8_3, grammarAccess.getAttributeAccess().getTypeDecimalKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3399:8: lv_type_8_4= 'Currency'
                    {
                    lv_type_8_4=(Token)match(input,126,FOLLOW_126_in_ruleAttribute7227); 

                            newLeafNode(lv_type_8_4, grammarAccess.getAttributeAccess().getTypeCurrencyKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3411:8: lv_type_8_5= 'Date'
                    {
                    lv_type_8_5=(Token)match(input,127,FOLLOW_127_in_ruleAttribute7256); 

                            newLeafNode(lv_type_8_5, grammarAccess.getAttributeAccess().getTypeDateKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3423:8: lv_type_8_6= 'Time'
                    {
                    lv_type_8_6=(Token)match(input,128,FOLLOW_128_in_ruleAttribute7285); 

                            newLeafNode(lv_type_8_6, grammarAccess.getAttributeAccess().getTypeTimeKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3435:8: lv_type_8_7= 'Datetime'
                    {
                    lv_type_8_7=(Token)match(input,129,FOLLOW_129_in_ruleAttribute7314); 

                            newLeafNode(lv_type_8_7, grammarAccess.getAttributeAccess().getTypeDatetimeKeyword_6_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3447:8: lv_type_8_8= 'Enumeration'
                    {
                    lv_type_8_8=(Token)match(input,130,FOLLOW_130_in_ruleAttribute7343); 

                            newLeafNode(lv_type_8_8, grammarAccess.getAttributeAccess().getTypeEnumerationKeyword_6_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3459:8: lv_type_8_9= 'Text'
                    {
                    lv_type_8_9=(Token)match(input,131,FOLLOW_131_in_ruleAttribute7372); 

                            newLeafNode(lv_type_8_9, grammarAccess.getAttributeAccess().getTypeTextKeyword_6_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3471:8: lv_type_8_10= 'Regex'
                    {
                    lv_type_8_10=(Token)match(input,132,FOLLOW_132_in_ruleAttribute7401); 

                            newLeafNode(lv_type_8_10, grammarAccess.getAttributeAccess().getTypeRegexKeyword_6_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3483:8: lv_type_8_11= 'URL'
                    {
                    lv_type_8_11=(Token)match(input,133,FOLLOW_133_in_ruleAttribute7430); 

                            newLeafNode(lv_type_8_11, grammarAccess.getAttributeAccess().getTypeURLKeyword_6_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3495:8: lv_type_8_12= 'Image'
                    {
                    lv_type_8_12=(Token)match(input,134,FOLLOW_134_in_ruleAttribute7459); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3510:2: (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==135) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3510:4: otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,135,FOLLOW_135_in_ruleAttribute7488); 

                        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getSizeKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3514:1: ( (lv_size_10_0= RULE_INT ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3515:1: (lv_size_10_0= RULE_INT )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3515:1: (lv_size_10_0= RULE_INT )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3516:3: lv_size_10_0= RULE_INT
                    {
                    lv_size_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttribute7505); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3532:4: (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==136) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3532:6: otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) )
                    {
                    otherlv_11=(Token)match(input,136,FOLLOW_136_in_ruleAttribute7525); 

                        	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getMultiplicityKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3536:1: ( (lv_multiplicity_12_0= ruleMultiplicity ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3537:1: (lv_multiplicity_12_0= ruleMultiplicity )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3537:1: (lv_multiplicity_12_0= ruleMultiplicity )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3538:3: lv_multiplicity_12_0= ruleMultiplicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleAttribute7546);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3554:4: (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==137) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3554:6: otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,137,FOLLOW_137_in_ruleAttribute7561); 

                        	newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getDefaultValueKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3558:1: ( (lv_defaultValue_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3559:1: (lv_defaultValue_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3559:1: (lv_defaultValue_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3560:3: lv_defaultValue_14_0= RULE_STRING
                    {
                    lv_defaultValue_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute7578); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3576:4: ( (lv_notNull_15_0= 'NotNull' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==138) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3577:1: (lv_notNull_15_0= 'NotNull' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3577:1: (lv_notNull_15_0= 'NotNull' )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3578:3: lv_notNull_15_0= 'NotNull'
                    {
                    lv_notNull_15_0=(Token)match(input,138,FOLLOW_138_in_ruleAttribute7603); 

                            newLeafNode(lv_notNull_15_0, grammarAccess.getAttributeAccess().getNotNullNotNullKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "notNull", lv_notNull_15_0, "NotNull");
                    	    

                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3591:3: ( (lv_unique_16_0= 'Unique' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==139) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3592:1: (lv_unique_16_0= 'Unique' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3592:1: (lv_unique_16_0= 'Unique' )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3593:3: lv_unique_16_0= 'Unique'
                    {
                    lv_unique_16_0=(Token)match(input,139,FOLLOW_139_in_ruleAttribute7635); 

                            newLeafNode(lv_unique_16_0, grammarAccess.getAttributeAccess().getUniqueUniqueKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "unique", lv_unique_16_0, "Unique");
                    	    

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleAttribute7661); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3618:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3619:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3620:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity7697);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity7707); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3627:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3630:28: ( ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3631:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3631:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3632:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3632:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3633:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3633:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            int alt69=5;
            switch ( input.LA(1) ) {
            case 140:
                {
                alt69=1;
                }
                break;
            case 141:
                {
                alt69=2;
                }
                break;
            case 142:
                {
                alt69=3;
                }
                break;
            case 143:
                {
                alt69=4;
                }
                break;
            case RULE_STRING:
                {
                alt69=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3634:3: lv_value_0_1= '\"0\"'
                    {
                    lv_value_0_1=(Token)match(input,140,FOLLOW_140_in_ruleMultiplicity7751); 

                            newLeafNode(lv_value_0_1, grammarAccess.getMultiplicityAccess().getValue0Keyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3646:8: lv_value_0_2= '\"1\"'
                    {
                    lv_value_0_2=(Token)match(input,141,FOLLOW_141_in_ruleMultiplicity7780); 

                            newLeafNode(lv_value_0_2, grammarAccess.getMultiplicityAccess().getValue1Keyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3658:8: lv_value_0_3= '\"0..1\"'
                    {
                    lv_value_0_3=(Token)match(input,142,FOLLOW_142_in_ruleMultiplicity7809); 

                            newLeafNode(lv_value_0_3, grammarAccess.getMultiplicityAccess().getValue01Keyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3670:8: lv_value_0_4= '\"*\"'
                    {
                    lv_value_0_4=(Token)match(input,143,FOLLOW_143_in_ruleMultiplicity7838); 

                            newLeafNode(lv_value_0_4, grammarAccess.getMultiplicityAccess().getValueQuotationMarkAsteriskQuotationMarkKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3682:8: lv_value_0_5= RULE_STRING
                    {
                    lv_value_0_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiplicity7866); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3708:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3709:2: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3710:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey7909);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;

             current =iv_rulePrimaryKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryKey7919); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3717:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refTo_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3720:28: ( (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3721:1: (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3721:1: (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3721:3: otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,144,FOLLOW_144_in_rulePrimaryKey7956); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPrimaryKeyKeyword_0());
                
            otherlv_1=(Token)match(input,145,FOLLOW_145_in_rulePrimaryKey7968); 

                	newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3729:1: ( (lv_refTo_2_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3730:1: (lv_refTo_2_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3730:1: (lv_refTo_2_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3731:3: lv_refTo_2_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getPrimaryKeyAccess().getRefToRefAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_rulePrimaryKey7989);
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

            otherlv_3=(Token)match(input,146,FOLLOW_146_in_rulePrimaryKey8001); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3759:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3760:2: (iv_ruleForeignKey= ruleForeignKey EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3761:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_ruleForeignKey_in_entryRuleForeignKey8037);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignKey8047); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3768:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3771:28: ( (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3772:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3772:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3772:3: otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            {
            otherlv_0=(Token)match(input,147,FOLLOW_147_in_ruleForeignKey8084); 

                	newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getForeignKeyKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3776:1: ( (otherlv_1= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3777:1: (otherlv_1= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3777:1: (otherlv_1= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3778:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForeignKeyRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeignKey8104); 

            		newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getEntityEntityCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,145,FOLLOW_145_in_ruleForeignKey8116); 

                	newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3793:1: ( (lv_refTo_3_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3794:1: (lv_refTo_3_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3794:1: (lv_refTo_3_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3795:3: lv_refTo_3_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getRefToRefAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_ruleForeignKey8137);
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

            otherlv_4=(Token)match(input,146,FOLLOW_146_in_ruleForeignKey8149); 

                	newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,136,FOLLOW_136_in_ruleForeignKey8161); 

                	newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getMultiplicityKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3819:1: ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3820:1: (lv_multiplicity_6_0= ruleMultiplicity )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3820:1: (lv_multiplicity_6_0= ruleMultiplicity )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3821:3: lv_multiplicity_6_0= ruleMultiplicity
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getMultiplicityMultiplicityParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleForeignKey8182);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3845:1: entryRuleRefAttribute returns [EObject current=null] : iv_ruleRefAttribute= ruleRefAttribute EOF ;
    public final EObject entryRuleRefAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3846:2: (iv_ruleRefAttribute= ruleRefAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3847:2: iv_ruleRefAttribute= ruleRefAttribute EOF
            {
             newCompositeNode(grammarAccess.getRefAttributeRule()); 
            pushFollow(FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute8218);
            iv_ruleRefAttribute=ruleRefAttribute();

            state._fsp--;

             current =iv_ruleRefAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefAttribute8228); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3854:1: ruleRefAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3857:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3858:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3858:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3858:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3858:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3859:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3859:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3860:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute8273); 

            		newLeafNode(otherlv_0, grammarAccess.getRefAttributeAccess().getRefAttrAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3871:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==76) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3871:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleRefAttribute8286); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefAttributeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3875:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3876:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3876:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3877:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute8306); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefAttributeAccess().getRefsAttributeCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3896:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3897:2: (iv_ruleCheck= ruleCheck EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3898:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck8344);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck8354); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3905:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_checkExpression_2_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3908:28: ( (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3909:1: (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3909:1: (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3909:3: otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,148,FOLLOW_148_in_ruleCheck8391); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3913:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3914:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3914:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3915:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheck8408); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3931:2: ( (lv_checkExpression_2_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3932:1: (lv_checkExpression_2_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3932:1: (lv_checkExpression_2_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3933:3: lv_checkExpression_2_0= RULE_STRING
            {
            lv_checkExpression_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheck8430); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3957:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3958:2: (iv_ruleActor= ruleActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3959:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor8471);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor8481); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3966:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3969:28: ( (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3970:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3970:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3970:3: otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleActor8518); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3974:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3975:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3975:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3976:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor8535); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActor8552); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3996:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==19) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3996:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleActor8565); 

                        	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4000:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4001:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4001:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4002:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor8582); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4018:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==37) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4018:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleActor8602); 

                        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4022:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4023:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4023:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4024:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor8619); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleActor8638); 

                	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4044:1: ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4045:1: ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4045:1: ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4046:1: (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4046:1: (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 149:
                {
                alt73=1;
                }
                break;
            case 150:
                {
                alt73=2;
                }
                break;
            case 151:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4047:3: lv_type_8_1= 'User'
                    {
                    lv_type_8_1=(Token)match(input,149,FOLLOW_149_in_ruleActor8658); 

                            newLeafNode(lv_type_8_1, grammarAccess.getActorAccess().getTypeUserKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4059:8: lv_type_8_2= 'ExternalSystem'
                    {
                    lv_type_8_2=(Token)match(input,150,FOLLOW_150_in_ruleActor8687); 

                            newLeafNode(lv_type_8_2, grammarAccess.getActorAccess().getTypeExternalSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4071:8: lv_type_8_3= 'Timer'
                    {
                    lv_type_8_3=(Token)match(input,151,FOLLOW_151_in_ruleActor8716); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4086:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==77) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4086:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,77,FOLLOW_77_in_ruleActor8745); 

                        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4090:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4091:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4091:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4092:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor8765); 

                    		newLeafNode(otherlv_10, grammarAccess.getActorAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4103:4: (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==152) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4103:6: otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,152,FOLLOW_152_in_ruleActor8780); 

                        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getSpecializedFromKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4107:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4108:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4108:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4109:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor8800); 

                    		newLeafNode(otherlv_12, grammarAccess.getActorAccess().getActorActorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleActor8814); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4132:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4133:2: (iv_ruleUseCase= ruleUseCase EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4134:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase8850);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase8860); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4141:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4144:28: ( (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4145:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4145:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4145:3: otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,153,FOLLOW_153_in_ruleUseCase8897); 

                	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4149:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4150:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4150:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4151:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase8914); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUseCase8931); 

                	newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4171:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==19) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4171:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleUseCase8944); 

                        	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4175:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4176:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4176:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4177:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase8961); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4193:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==37) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4193:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleUseCase8981); 

                        	newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4197:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4198:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4198:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4199:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase8998); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleUseCase9017); 

                	newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4219:1: ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4220:1: ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4220:1: ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4221:1: (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4221:1: (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' )
            int alt78=7;
            switch ( input.LA(1) ) {
            case 154:
                {
                alt78=1;
                }
                break;
            case 155:
                {
                alt78=2;
                }
                break;
            case 156:
                {
                alt78=3;
                }
                break;
            case 157:
                {
                alt78=4;
                }
                break;
            case 158:
                {
                alt78=5;
                }
                break;
            case 159:
                {
                alt78=6;
                }
                break;
            case 160:
                {
                alt78=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4222:3: lv_type_8_1= 'EntityManage'
                    {
                    lv_type_8_1=(Token)match(input,154,FOLLOW_154_in_ruleUseCase9037); 

                            newLeafNode(lv_type_8_1, grammarAccess.getUseCaseAccess().getTypeEntityManageKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4234:8: lv_type_8_2= 'EntityBrowse'
                    {
                    lv_type_8_2=(Token)match(input,155,FOLLOW_155_in_ruleUseCase9066); 

                            newLeafNode(lv_type_8_2, grammarAccess.getUseCaseAccess().getTypeEntityBrowseKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4246:8: lv_type_8_3= 'EntitySearch'
                    {
                    lv_type_8_3=(Token)match(input,156,FOLLOW_156_in_ruleUseCase9095); 

                            newLeafNode(lv_type_8_3, grammarAccess.getUseCaseAccess().getTypeEntitySearchKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4258:8: lv_type_8_4= 'EntityCreate'
                    {
                    lv_type_8_4=(Token)match(input,157,FOLLOW_157_in_ruleUseCase9124); 

                            newLeafNode(lv_type_8_4, grammarAccess.getUseCaseAccess().getTypeEntityCreateKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4270:8: lv_type_8_5= 'EntityDelete'
                    {
                    lv_type_8_5=(Token)match(input,158,FOLLOW_158_in_ruleUseCase9153); 

                            newLeafNode(lv_type_8_5, grammarAccess.getUseCaseAccess().getTypeEntityDeleteKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4282:8: lv_type_8_6= 'EntitySync'
                    {
                    lv_type_8_6=(Token)match(input,159,FOLLOW_159_in_ruleUseCase9182); 

                            newLeafNode(lv_type_8_6, grammarAccess.getUseCaseAccess().getTypeEntitySyncKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4294:8: lv_type_8_7= 'Report'
                    {
                    lv_type_8_7=(Token)match(input,160,FOLLOW_160_in_ruleUseCase9211); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4309:2: (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==161) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4309:4: otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) )
                    {
                    otherlv_9=(Token)match(input,161,FOLLOW_161_in_ruleUseCase9240); 

                        	newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getEntitiesKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4313:1: ( (lv_entities_10_0= ruleRefEntity ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4314:1: (lv_entities_10_0= ruleRefEntity )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4314:1: (lv_entities_10_0= ruleRefEntity )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4315:3: lv_entities_10_0= ruleRefEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getEntitiesRefEntityParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefEntity_in_ruleUseCase9261);
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

            otherlv_11=(Token)match(input,107,FOLLOW_107_in_ruleUseCase9275); 

                	newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4335:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4336:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4336:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4337:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getUseCaseAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleUseCase9296);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4353:2: ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==175) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4354:1: (lv_extensionPoints_13_0= ruleExtensionPoint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4354:1: (lv_extensionPoints_13_0= ruleExtensionPoint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4355:3: lv_extensionPoints_13_0= ruleExtensionPoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtensionPoint_in_ruleUseCase9317);
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
            	    break loop80;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4371:3: (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==162) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4371:5: otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )*
                    {
                    otherlv_14=(Token)match(input,162,FOLLOW_162_in_ruleUseCase9331); 

                        	newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getGoalsKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4375:1: ( (lv_goals_15_0= ruleRefGoal ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==RULE_ID) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4376:1: (lv_goals_15_0= ruleRefGoal )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4376:1: (lv_goals_15_0= ruleRefGoal )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4377:3: lv_goals_15_0= ruleRefGoal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getGoalsRefGoalParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefGoal_in_ruleUseCase9352);
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
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4393:5: (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==163) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4393:7: otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )*
                    {
                    otherlv_16=(Token)match(input,163,FOLLOW_163_in_ruleUseCase9368); 

                        	newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getFunctionalRequirementsKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4397:1: ( (lv_frs_17_0= ruleRefFR ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==RULE_ID) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4398:1: (lv_frs_17_0= ruleRefFR )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4398:1: (lv_frs_17_0= ruleRefFR )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4399:3: lv_frs_17_0= ruleRefFR
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getFrsRefFRParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefFR_in_ruleUseCase9389);
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
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,164,FOLLOW_164_in_ruleUseCase9404); 

                	newLeafNode(otherlv_18, grammarAccess.getUseCaseAccess().getActorInitiatesKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4419:1: ( (otherlv_19= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4420:1: (otherlv_19= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4420:1: (otherlv_19= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4421:3: otherlv_19= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
            otherlv_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase9424); 

            		newLeafNode(otherlv_19, grammarAccess.getUseCaseAccess().getActorInitiatesActorCrossReference_14_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4432:2: (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==165) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4432:4: otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) )
                    {
                    otherlv_20=(Token)match(input,165,FOLLOW_165_in_ruleUseCase9437); 

                        	newLeafNode(otherlv_20, grammarAccess.getUseCaseAccess().getActorParticipatesKeyword_15_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4436:1: ( (lv_actors_21_0= ruleRefActor ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4437:1: (lv_actors_21_0= ruleRefActor )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4437:1: (lv_actors_21_0= ruleRefActor )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4438:3: lv_actors_21_0= ruleRefActor
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getActorsRefActorParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefActor_in_ruleUseCase9458);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4454:4: (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==166) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4454:6: otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) )
                    {
                    otherlv_22=(Token)match(input,166,FOLLOW_166_in_ruleUseCase9473); 

                        	newLeafNode(otherlv_22, grammarAccess.getUseCaseAccess().getPreConditionsKeyword_16_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4458:1: ( (lv_preConditions_23_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4459:1: (lv_preConditions_23_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4459:1: (lv_preConditions_23_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4460:3: lv_preConditions_23_0= RULE_STRING
                    {
                    lv_preConditions_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase9490); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4476:4: (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==167) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4476:6: otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) )
                    {
                    otherlv_24=(Token)match(input,167,FOLLOW_167_in_ruleUseCase9510); 

                        	newLeafNode(otherlv_24, grammarAccess.getUseCaseAccess().getPostConditionsKeyword_17_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4480:1: ( (lv_postConditions_25_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4481:1: (lv_postConditions_25_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4481:1: (lv_postConditions_25_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4482:3: lv_postConditions_25_0= RULE_STRING
                    {
                    lv_postConditions_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase9527); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4498:4: (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==168) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4498:6: otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )*
                    {
                    otherlv_26=(Token)match(input,168,FOLLOW_168_in_ruleUseCase9547); 

                        	newLeafNode(otherlv_26, grammarAccess.getUseCaseAccess().getIncludeKeyword_18_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4502:1: ( (lv_includes_27_0= ruleRefUC ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==RULE_ID) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4503:1: (lv_includes_27_0= ruleRefUC )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4503:1: (lv_includes_27_0= ruleRefUC )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4504:3: lv_includes_27_0= ruleRefUC
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getIncludesRefUCParserRuleCall_18_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefUC_in_ruleUseCase9568);
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
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4520:5: (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==169) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4520:7: otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) )
                    {
                    otherlv_28=(Token)match(input,169,FOLLOW_169_in_ruleUseCase9584); 

                        	newLeafNode(otherlv_28, grammarAccess.getUseCaseAccess().getExtendKeyword_19_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4524:1: ( (otherlv_29= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4525:1: (otherlv_29= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4525:1: (otherlv_29= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4526:3: otherlv_29= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase9604); 

                    		newLeafNode(otherlv_29, grammarAccess.getUseCaseAccess().getExtendsUseCaseCrossReference_19_1_0()); 
                    	

                    }


                    }

                    otherlv_30=(Token)match(input,170,FOLLOW_170_in_ruleUseCase9616); 

                        	newLeafNode(otherlv_30, grammarAccess.getUseCaseAccess().getOnKeyword_19_2());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4541:1: ( (otherlv_31= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4542:1: (otherlv_31= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4542:1: (otherlv_31= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4543:3: otherlv_31= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase9636); 

                    		newLeafNode(otherlv_31, grammarAccess.getUseCaseAccess().getExtPointExtensionPointCrossReference_19_3_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4554:4: ( (lv_scenarios_32_0= ruleScenario ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==176) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4555:1: (lv_scenarios_32_0= ruleScenario )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4555:1: (lv_scenarios_32_0= ruleScenario )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4556:3: lv_scenarios_32_0= ruleScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getScenariosScenarioParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScenario_in_ruleUseCase9659);
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
            	    break loop91;
                }
            } while (true);

            otherlv_33=(Token)match(input,13,FOLLOW_13_in_ruleUseCase9672); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4584:1: entryRuleRefEntity returns [EObject current=null] : iv_ruleRefEntity= ruleRefEntity EOF ;
    public final EObject entryRuleRefEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4585:2: (iv_ruleRefEntity= ruleRefEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4586:2: iv_ruleRefEntity= ruleRefEntity EOF
            {
             newCompositeNode(grammarAccess.getRefEntityRule()); 
            pushFollow(FOLLOW_ruleRefEntity_in_entryRuleRefEntity9708);
            iv_ruleRefEntity=ruleRefEntity();

            state._fsp--;

             current =iv_ruleRefEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefEntity9718); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4593:1: ruleRefEntity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4596:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4597:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4597:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4597:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4597:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4598:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4598:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4599:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefEntityRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEntity9763); 

            		newLeafNode(otherlv_0, grammarAccess.getRefEntityAccess().getRefEntityEntityCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,171,FOLLOW_171_in_ruleRefEntity9775); 

                	newLeafNode(otherlv_1, grammarAccess.getRefEntityAccess().getAsKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4614:1: ( (lv_type_2_0= ruleEntityType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4615:1: (lv_type_2_0= ruleEntityType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4615:1: (lv_type_2_0= ruleEntityType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4616:3: lv_type_2_0= ruleEntityType
            {
             
            	        newCompositeNode(grammarAccess.getRefEntityAccess().getTypeEntityTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEntityType_in_ruleRefEntity9796);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4632:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==76) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4632:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) )
            	    {
            	    otherlv_3=(Token)match(input,76,FOLLOW_76_in_ruleRefEntity9809); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRefEntityAccess().getCommaKeyword_3_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4636:1: ( (otherlv_4= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4637:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4637:1: (otherlv_4= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4638:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefEntityRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEntity9829); 

            	    		newLeafNode(otherlv_4, grammarAccess.getRefEntityAccess().getRefsEntityCrossReference_3_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_5=(Token)match(input,171,FOLLOW_171_in_ruleRefEntity9841); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRefEntityAccess().getAsKeyword_3_2());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4653:1: ( (lv_refType_6_0= ruleEntityType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4654:1: (lv_refType_6_0= ruleEntityType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4654:1: (lv_refType_6_0= ruleEntityType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4655:3: lv_refType_6_0= ruleEntityType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefEntityAccess().getRefTypeEntityTypeParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityType_in_ruleRefEntity9862);
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
            	    break loop92;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4679:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4680:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4681:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType9900);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType9910); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4688:1: ruleEntityType returns [EObject current=null] : ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4691:28: ( ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4692:1: ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4692:1: ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4693:1: ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4693:1: ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4694:1: (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4694:1: (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 172:
                {
                alt93=1;
                }
                break;
            case 173:
                {
                alt93=2;
                }
                break;
            case 174:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4695:3: lv_type_0_1= 'Master'
                    {
                    lv_type_0_1=(Token)match(input,172,FOLLOW_172_in_ruleEntityType9954); 

                            newLeafNode(lv_type_0_1, grammarAccess.getEntityTypeAccess().getTypeMasterKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4707:8: lv_type_0_2= 'Detail'
                    {
                    lv_type_0_2=(Token)match(input,173,FOLLOW_173_in_ruleEntityType9983); 

                            newLeafNode(lv_type_0_2, grammarAccess.getEntityTypeAccess().getTypeDetailKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4719:8: lv_type_0_3= 'Reference'
                    {
                    lv_type_0_3=(Token)match(input,174,FOLLOW_174_in_ruleEntityType10012); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4742:1: entryRuleRefFR returns [EObject current=null] : iv_ruleRefFR= ruleRefFR EOF ;
    public final EObject entryRuleRefFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4743:2: (iv_ruleRefFR= ruleRefFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4744:2: iv_ruleRefFR= ruleRefFR EOF
            {
             newCompositeNode(grammarAccess.getRefFRRule()); 
            pushFollow(FOLLOW_ruleRefFR_in_entryRuleRefFR10063);
            iv_ruleRefFR=ruleRefFR();

            state._fsp--;

             current =iv_ruleRefFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefFR10073); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4751:1: ruleRefFR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4754:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4755:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4755:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4755:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4755:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4756:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4756:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4757:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefFRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR10118); 

            		newLeafNode(otherlv_0, grammarAccess.getRefFRAccess().getRefFRFRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4768:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==76) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4768:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleRefFR10131); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefFRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4772:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4773:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4773:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4774:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefFRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR10151); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefFRAccess().getRefsFRCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4793:1: entryRuleRefActor returns [EObject current=null] : iv_ruleRefActor= ruleRefActor EOF ;
    public final EObject entryRuleRefActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4794:2: (iv_ruleRefActor= ruleRefActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4795:2: iv_ruleRefActor= ruleRefActor EOF
            {
             newCompositeNode(grammarAccess.getRefActorRule()); 
            pushFollow(FOLLOW_ruleRefActor_in_entryRuleRefActor10189);
            iv_ruleRefActor=ruleRefActor();

            state._fsp--;

             current =iv_ruleRefActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefActor10199); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4802:1: ruleRefActor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4805:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4806:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4806:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4806:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4806:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4807:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4807:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4808:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefActorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefActor10244); 

            		newLeafNode(otherlv_0, grammarAccess.getRefActorAccess().getRefActorActorCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4819:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==76) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4819:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleRefActor10257); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefActorAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4823:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4824:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4824:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4825:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefActorRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefActor10277); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefActorAccess().getRefsActorCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4844:1: entryRuleRefUC returns [EObject current=null] : iv_ruleRefUC= ruleRefUC EOF ;
    public final EObject entryRuleRefUC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefUC = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4845:2: (iv_ruleRefUC= ruleRefUC EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4846:2: iv_ruleRefUC= ruleRefUC EOF
            {
             newCompositeNode(grammarAccess.getRefUCRule()); 
            pushFollow(FOLLOW_ruleRefUC_in_entryRuleRefUC10315);
            iv_ruleRefUC=ruleRefUC();

            state._fsp--;

             current =iv_ruleRefUC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefUC10325); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4853:1: ruleRefUC returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefUC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4856:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4857:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4857:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4857:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4857:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4858:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4858:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4859:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefUCRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC10370); 

            		newLeafNode(otherlv_0, grammarAccess.getRefUCAccess().getRefUCUseCaseCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4870:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==76) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4870:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleRefUC10383); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefUCAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4874:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4875:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4875:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4876:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefUCRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC10403); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefUCAccess().getRefsUseCaseCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4895:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4896:2: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4897:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
            {
             newCompositeNode(grammarAccess.getExtensionPointRule()); 
            pushFollow(FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint10441);
            iv_ruleExtensionPoint=ruleExtensionPoint();

            state._fsp--;

             current =iv_ruleExtensionPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionPoint10451); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4904:1: ruleExtensionPoint returns [EObject current=null] : (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4907:28: ( (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4908:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4908:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4908:3: otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,175,FOLLOW_175_in_ruleExtensionPoint10488); 

                	newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getExtensionPointKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4912:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4913:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4913:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4914:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtensionPoint10505); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4930:2: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==37) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4930:4: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleExtensionPoint10523); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtensionPointAccess().getDescriptionKeyword_2_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4934:1: ( (lv_description_3_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4935:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4935:1: (lv_description_3_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4936:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExtensionPoint10540); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4960:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4961:2: (iv_ruleScenario= ruleScenario EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4962:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario10583);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario10593); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4969:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4972:28: ( (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4973:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4973:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4973:3: otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,176,FOLLOW_176_in_ruleScenario10630); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4977:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4978:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4978:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4979:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScenario10647); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleScenario10664); 

                	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4999:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==19) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4999:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleScenario10677); 

                        	newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5003:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5004:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5004:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5005:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario10694); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5021:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==37) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5021:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleScenario10714); 

                        	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5025:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5026:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5026:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5027:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario10731); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleScenario10750); 

                	newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5047:1: ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5048:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5048:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5049:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5049:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            int alt100=3;
            switch ( input.LA(1) ) {
            case 177:
                {
                alt100=1;
                }
                break;
            case 178:
                {
                alt100=2;
                }
                break;
            case 179:
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
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5050:3: lv_type_8_1= 'Main'
                    {
                    lv_type_8_1=(Token)match(input,177,FOLLOW_177_in_ruleScenario10770); 

                            newLeafNode(lv_type_8_1, grammarAccess.getScenarioAccess().getTypeMainKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5062:8: lv_type_8_2= 'Alternative'
                    {
                    lv_type_8_2=(Token)match(input,178,FOLLOW_178_in_ruleScenario10799); 

                            newLeafNode(lv_type_8_2, grammarAccess.getScenarioAccess().getTypeAlternativeKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5074:8: lv_type_8_3= 'Exception'
                    {
                    lv_type_8_3=(Token)match(input,179,FOLLOW_179_in_ruleScenario10828); 

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

            otherlv_9=(Token)match(input,180,FOLLOW_180_in_ruleScenario10856); 

                	newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getExecutionModeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5093:1: ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5094:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5094:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5095:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5095:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==181) ) {
                alt101=1;
            }
            else if ( (LA101_0==182) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5096:3: lv_mode_10_1= 'Sequential'
                    {
                    lv_mode_10_1=(Token)match(input,181,FOLLOW_181_in_ruleScenario10876); 

                            newLeafNode(lv_mode_10_1, grammarAccess.getScenarioAccess().getModeSequentialKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "mode", lv_mode_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5108:8: lv_mode_10_2= 'Parallel'
                    {
                    lv_mode_10_2=(Token)match(input,182,FOLLOW_182_in_ruleScenario10905); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5123:2: ( (lv_steps_11_0= ruleStep ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==183) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5124:1: (lv_steps_11_0= ruleStep )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5124:1: (lv_steps_11_0= ruleStep )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5125:3: lv_steps_11_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenario10942);
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
            	    break loop102;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleScenario10955); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5153:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5154:2: (iv_ruleStep= ruleStep EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5155:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep10991);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep11001); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5162:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5165:28: ( (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5166:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5166:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5166:3: otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,183,FOLLOW_183_in_ruleStep11038); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5170:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5171:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5171:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5172:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep11055); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStep11072); 

                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5192:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==19) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5192:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStep11085); 

                        	newLeafNode(otherlv_3, grammarAccess.getStepAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5196:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5197:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5197:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5198:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11102); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5214:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==37) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5214:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleStep11122); 

                        	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5218:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5219:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5219:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5220:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11139); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStep11158); 

                	newLeafNode(otherlv_7, grammarAccess.getStepAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5240:1: ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5241:1: ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5241:1: ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5242:1: (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5242:1: (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' )
            int alt105=5;
            switch ( input.LA(1) ) {
            case 184:
                {
                alt105=1;
                }
                break;
            case 185:
                {
                alt105=2;
                }
                break;
            case 186:
                {
                alt105=3;
                }
                break;
            case 187:
                {
                alt105=4;
                }
                break;
            case 27:
                {
                alt105=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5243:3: lv_type_8_1= 'ActorPrepareData'
                    {
                    lv_type_8_1=(Token)match(input,184,FOLLOW_184_in_ruleStep11178); 

                            newLeafNode(lv_type_8_1, grammarAccess.getStepAccess().getTypeActorPrepareDataKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5255:8: lv_type_8_2= 'ActorCallSystem'
                    {
                    lv_type_8_2=(Token)match(input,185,FOLLOW_185_in_ruleStep11207); 

                            newLeafNode(lv_type_8_2, grammarAccess.getStepAccess().getTypeActorCallSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5267:8: lv_type_8_3= 'SystemExecutes'
                    {
                    lv_type_8_3=(Token)match(input,186,FOLLOW_186_in_ruleStep11236); 

                            newLeafNode(lv_type_8_3, grammarAccess.getStepAccess().getTypeSystemExecutesKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5279:8: lv_type_8_4= 'SystemReturnResult'
                    {
                    lv_type_8_4=(Token)match(input,187,FOLLOW_187_in_ruleStep11265); 

                            newLeafNode(lv_type_8_4, grammarAccess.getStepAccess().getTypeSystemReturnResultKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5291:8: lv_type_8_5= 'Other'
                    {
                    lv_type_8_5=(Token)match(input,27,FOLLOW_27_in_ruleStep11294); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5306:2: (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==80) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5306:4: otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,80,FOLLOW_80_in_ruleStep11323); 

                        	newLeafNode(otherlv_9, grammarAccess.getStepAccess().getActorKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5310:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5311:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5311:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5312:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep11343); 

                    		newLeafNode(otherlv_10, grammarAccess.getStepAccess().getActorActorCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5323:4: (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==166) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5323:6: otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,166,FOLLOW_166_in_ruleStep11358); 

                        	newLeafNode(otherlv_11, grammarAccess.getStepAccess().getPreConditionsKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5327:1: ( (lv_preConditions_12_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5328:1: (lv_preConditions_12_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5328:1: (lv_preConditions_12_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5329:3: lv_preConditions_12_0= RULE_STRING
                    {
                    lv_preConditions_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11375); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5345:4: (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==167) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5345:6: otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,167,FOLLOW_167_in_ruleStep11395); 

                        	newLeafNode(otherlv_13, grammarAccess.getStepAccess().getPostConditionsKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5349:1: ( (lv_postConditions_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5350:1: (lv_postConditions_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5350:1: (lv_postConditions_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5351:3: lv_postConditions_14_0= RULE_STRING
                    {
                    lv_postConditions_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep11412); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5367:4: (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==188) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5367:6: otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,188,FOLLOW_188_in_ruleStep11432); 

                        	newLeafNode(otherlv_15, grammarAccess.getStepAccess().getNextStepKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5371:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5372:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5372:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5373:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep11452); 

                    		newLeafNode(otherlv_16, grammarAccess.getStepAccess().getNextStepCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleStep11466); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5396:1: entryRuleFR returns [EObject current=null] : iv_ruleFR= ruleFR EOF ;
    public final EObject entryRuleFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5397:2: (iv_ruleFR= ruleFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5398:2: iv_ruleFR= ruleFR EOF
            {
             newCompositeNode(grammarAccess.getFRRule()); 
            pushFollow(FOLLOW_ruleFR_in_entryRuleFR11502);
            iv_ruleFR=ruleFR();

            state._fsp--;

             current =iv_ruleFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFR11512); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5405:1: ruleFR returns [EObject current=null] : (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_priority_12_0 = null;

        EObject lv_depends_13_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5408:28: ( (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5409:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5409:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5409:3: otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,189,FOLLOW_189_in_ruleFR11549); 

                	newLeafNode(otherlv_0, grammarAccess.getFRAccess().getFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5413:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5414:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5414:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5415:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR11566); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFR11583); 

                	newLeafNode(otherlv_2, grammarAccess.getFRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5435:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==19) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5435:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFR11596); 

                        	newLeafNode(otherlv_3, grammarAccess.getFRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5439:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5440:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5440:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5441:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR11613); 

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

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleFR11632); 

                	newLeafNode(otherlv_5, grammarAccess.getFRAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5461:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5462:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5462:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5463:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR11649); 

            			newLeafNode(lv_description_6_0, grammarAccess.getFRAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleFR11666); 

                	newLeafNode(otherlv_7, grammarAccess.getFRAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5483:1: ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5484:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5484:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5485:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5485:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 190:
                {
                alt111=1;
                }
                break;
            case 191:
                {
                alt111=2;
                }
                break;
            case 192:
                {
                alt111=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5486:3: lv_type_8_1= 'Functional'
                    {
                    lv_type_8_1=(Token)match(input,190,FOLLOW_190_in_ruleFR11686); 

                            newLeafNode(lv_type_8_1, grammarAccess.getFRAccess().getTypeFunctionalKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5498:8: lv_type_8_2= 'Behavioral'
                    {
                    lv_type_8_2=(Token)match(input,191,FOLLOW_191_in_ruleFR11715); 

                            newLeafNode(lv_type_8_2, grammarAccess.getFRAccess().getTypeBehavioralKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5510:8: lv_type_8_3= 'Data'
                    {
                    lv_type_8_3=(Token)match(input,192,FOLLOW_192_in_ruleFR11744); 

                            newLeafNode(lv_type_8_3, grammarAccess.getFRAccess().getTypeDataKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5525:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==77) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5525:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,77,FOLLOW_77_in_ruleFR11773); 

                        	newLeafNode(otherlv_9, grammarAccess.getFRAccess().getStakeholderKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5529:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5530:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5530:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5531:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR11793); 

                    		newLeafNode(otherlv_10, grammarAccess.getFRAccess().getStakeholderStakeholderCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,107,FOLLOW_107_in_ruleFR11807); 

                	newLeafNode(otherlv_11, grammarAccess.getFRAccess().getPriorityKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5546:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5547:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5547:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5548:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getFRAccess().getPriorityPriorityParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleFR11828);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5564:2: ( (lv_depends_13_0= ruleDependsOnFR ) )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==112||LA113_0==115||LA113_0==193) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5565:1: (lv_depends_13_0= ruleDependsOnFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5565:1: (lv_depends_13_0= ruleDependsOnFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5566:3: lv_depends_13_0= ruleDependsOnFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFRAccess().getDependsDependsOnFRParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnFR_in_ruleFR11849);
            	    lv_depends_13_0=ruleDependsOnFR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFRRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"depends",
            	            		lv_depends_13_0, 
            	            		"DependsOnFR");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5582:3: (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==67) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5582:5: otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) )
                    {
                    otherlv_14=(Token)match(input,67,FOLLOW_67_in_ruleFR11863); 

                        	newLeafNode(otherlv_14, grammarAccess.getFRAccess().getPartOfKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5586:1: ( (otherlv_15= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5587:1: (otherlv_15= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5587:1: (otherlv_15= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5588:3: otherlv_15= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR11883); 

                    		newLeafNode(otherlv_15, grammarAccess.getFRAccess().getPartOfFRCrossReference_12_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleFR11897); 

                	newLeafNode(otherlv_16, grammarAccess.getFRAccess().getRightCurlyBracketKeyword_13());
                

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


    // $ANTLR start "entryRuleDependsOnFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5611:1: entryRuleDependsOnFR returns [EObject current=null] : iv_ruleDependsOnFR= ruleDependsOnFR EOF ;
    public final EObject entryRuleDependsOnFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5612:2: (iv_ruleDependsOnFR= ruleDependsOnFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5613:2: iv_ruleDependsOnFR= ruleDependsOnFR EOF
            {
             newCompositeNode(grammarAccess.getDependsOnFRRule()); 
            pushFollow(FOLLOW_ruleDependsOnFR_in_entryRuleDependsOnFR11933);
            iv_ruleDependsOnFR=ruleDependsOnFR();

            state._fsp--;

             current =iv_ruleDependsOnFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnFR11943); 

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
    // $ANTLR end "entryRuleDependsOnFR"


    // $ANTLR start "ruleDependsOnFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5620:1: ruleDependsOnFR returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFR_1_0= ruleRefFR ) ) ) ;
    public final EObject ruleDependsOnFR() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refFR_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5623:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFR_1_0= ruleRefFR ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5624:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFR_1_0= ruleRefFR ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5624:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFR_1_0= ruleRefFR ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5624:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFR_1_0= ruleRefFR ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5624:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5625:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5625:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5626:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5626:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            int alt115=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt115=1;
                }
                break;
            case 193:
                {
                alt115=2;
                }
                break;
            case 115:
                {
                alt115=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5627:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,112,FOLLOW_112_in_ruleDependsOnFR11988); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnFRAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5639:8: lv_type_0_2= 'Refines'
                    {
                    lv_type_0_2=(Token)match(input,193,FOLLOW_193_in_ruleDependsOnFR12017); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnFRAccess().getTypeRefinesKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5651:8: lv_type_0_3= 'Conflicts'
                    {
                    lv_type_0_3=(Token)match(input,115,FOLLOW_115_in_ruleDependsOnFR12046); 

                            newLeafNode(lv_type_0_3, grammarAccess.getDependsOnFRAccess().getTypeConflictsKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5666:2: ( (lv_refFR_1_0= ruleRefFR ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5667:1: (lv_refFR_1_0= ruleRefFR )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5667:1: (lv_refFR_1_0= ruleRefFR )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5668:3: lv_refFR_1_0= ruleRefFR
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnFRAccess().getRefFRRefFRParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefFR_in_ruleDependsOnFR12083);
            lv_refFR_1_0=ruleRefFR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependsOnFRRule());
            	        }
                   		set(
                   			current, 
                   			"refFR",
                    		lv_refFR_1_0, 
                    		"RefFR");
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
    // $ANTLR end "ruleDependsOnFR"


    // $ANTLR start "entryRuleQR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5692:1: entryRuleQR returns [EObject current=null] : iv_ruleQR= ruleQR EOF ;
    public final EObject entryRuleQR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5693:2: (iv_ruleQR= ruleQR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5694:2: iv_ruleQR= ruleQR EOF
            {
             newCompositeNode(grammarAccess.getQRRule()); 
            pushFollow(FOLLOW_ruleQR_in_entryRuleQR12119);
            iv_ruleQR=ruleQR();

            state._fsp--;

             current =iv_ruleQR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQR12129); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5701:1: ruleQR returns [EObject current=null] : (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_priority_18_0 = null;

        EObject lv_depends_19_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5704:28: ( (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5705:1: (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5705:1: (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5705:3: otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,194,FOLLOW_194_in_ruleQR12166); 

                	newLeafNode(otherlv_0, grammarAccess.getQRAccess().getQualityRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5709:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5710:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5710:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5711:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR12183); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQR12200); 

                	newLeafNode(otherlv_2, grammarAccess.getQRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5731:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==19) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5731:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleQR12213); 

                        	newLeafNode(otherlv_3, grammarAccess.getQRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5735:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5736:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5736:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5737:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQR12230); 

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

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleQR12249); 

                	newLeafNode(otherlv_5, grammarAccess.getQRAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5757:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5758:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5758:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5759:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQR12266); 

            			newLeafNode(lv_description_6_0, grammarAccess.getQRAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleQR12283); 

                	newLeafNode(otherlv_7, grammarAccess.getQRAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5779:1: ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5780:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5780:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5781:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5781:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            int alt117=8;
            switch ( input.LA(1) ) {
            case 195:
                {
                alt117=1;
                }
                break;
            case 196:
                {
                alt117=2;
                }
                break;
            case 197:
                {
                alt117=3;
                }
                break;
            case 198:
                {
                alt117=4;
                }
                break;
            case 199:
                {
                alt117=5;
                }
                break;
            case 200:
                {
                alt117=6;
                }
                break;
            case 201:
                {
                alt117=7;
                }
                break;
            case 202:
                {
                alt117=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5782:3: lv_type_8_1= 'Security'
                    {
                    lv_type_8_1=(Token)match(input,195,FOLLOW_195_in_ruleQR12303); 

                            newLeafNode(lv_type_8_1, grammarAccess.getQRAccess().getTypeSecurityKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5794:8: lv_type_8_2= 'Performance'
                    {
                    lv_type_8_2=(Token)match(input,196,FOLLOW_196_in_ruleQR12332); 

                            newLeafNode(lv_type_8_2, grammarAccess.getQRAccess().getTypePerformanceKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5806:8: lv_type_8_3= 'Usability'
                    {
                    lv_type_8_3=(Token)match(input,197,FOLLOW_197_in_ruleQR12361); 

                            newLeafNode(lv_type_8_3, grammarAccess.getQRAccess().getTypeUsabilityKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5818:8: lv_type_8_4= 'Appearance'
                    {
                    lv_type_8_4=(Token)match(input,198,FOLLOW_198_in_ruleQR12390); 

                            newLeafNode(lv_type_8_4, grammarAccess.getQRAccess().getTypeAppearanceKeyword_7_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5830:8: lv_type_8_5= 'Operational'
                    {
                    lv_type_8_5=(Token)match(input,199,FOLLOW_199_in_ruleQR12419); 

                            newLeafNode(lv_type_8_5, grammarAccess.getQRAccess().getTypeOperationalKeyword_7_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5842:8: lv_type_8_6= 'Maintenance'
                    {
                    lv_type_8_6=(Token)match(input,200,FOLLOW_200_in_ruleQR12448); 

                            newLeafNode(lv_type_8_6, grammarAccess.getQRAccess().getTypeMaintenanceKeyword_7_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5854:8: lv_type_8_7= 'Cultural'
                    {
                    lv_type_8_7=(Token)match(input,201,FOLLOW_201_in_ruleQR12477); 

                            newLeafNode(lv_type_8_7, grammarAccess.getQRAccess().getTypeCulturalKeyword_7_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5866:8: lv_type_8_8= 'Legal'
                    {
                    lv_type_8_8=(Token)match(input,202,FOLLOW_202_in_ruleQR12506); 

                            newLeafNode(lv_type_8_8, grammarAccess.getQRAccess().getTypeLegalKeyword_7_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_8, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5881:2: (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==203) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5881:4: otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    {
                    otherlv_9=(Token)match(input,203,FOLLOW_203_in_ruleQR12535); 

                        	newLeafNode(otherlv_9, grammarAccess.getQRAccess().getSubTypeKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5885:1: ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5886:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5886:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5887:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5887:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    int alt118=5;
                    switch ( input.LA(1) ) {
                    case 204:
                        {
                        alt118=1;
                        }
                        break;
                    case 205:
                        {
                        alt118=2;
                        }
                        break;
                    case 206:
                        {
                        alt118=3;
                        }
                        break;
                    case 207:
                        {
                        alt118=4;
                        }
                        break;
                    case 208:
                        {
                        alt118=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;
                    }

                    switch (alt118) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5888:3: lv_subType_10_1= 'Security.Privacy'
                            {
                            lv_subType_10_1=(Token)match(input,204,FOLLOW_204_in_ruleQR12555); 

                                    newLeafNode(lv_subType_10_1, grammarAccess.getQRAccess().getSubTypeSecurityPrivacyKeyword_8_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5900:8: lv_subType_10_2= 'Security.Integrity'
                            {
                            lv_subType_10_2=(Token)match(input,205,FOLLOW_205_in_ruleQR12584); 

                                    newLeafNode(lv_subType_10_2, grammarAccess.getQRAccess().getSubTypeSecurityIntegrityKeyword_8_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5912:8: lv_subType_10_3= 'Usability.EaseOfUse'
                            {
                            lv_subType_10_3=(Token)match(input,206,FOLLOW_206_in_ruleQR12613); 

                                    newLeafNode(lv_subType_10_3, grammarAccess.getQRAccess().getSubTypeUsabilityEaseOfUseKeyword_8_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5924:8: lv_subType_10_4= 'Usability.EaseOfLearn'
                            {
                            lv_subType_10_4=(Token)match(input,207,FOLLOW_207_in_ruleQR12642); 

                                    newLeafNode(lv_subType_10_4, grammarAccess.getQRAccess().getSubTypeUsabilityEaseOfLearnKeyword_8_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5936:8: lv_subType_10_5= 'Usability.Accessibility'
                            {
                            lv_subType_10_5=(Token)match(input,208,FOLLOW_208_in_ruleQR12671); 

                                    newLeafNode(lv_subType_10_5, grammarAccess.getQRAccess().getSubTypeUsabilityAccessibilityKeyword_8_1_0_4());
                                

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

            otherlv_11=(Token)match(input,209,FOLLOW_209_in_ruleQR12701); 

                	newLeafNode(otherlv_11, grammarAccess.getQRAccess().getMetricKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5955:1: ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5956:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5956:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5957:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5957:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            int alt120=6;
            switch ( input.LA(1) ) {
            case 210:
                {
                alt120=1;
                }
                break;
            case 211:
                {
                alt120=2;
                }
                break;
            case 212:
                {
                alt120=3;
                }
                break;
            case 213:
                {
                alt120=4;
                }
                break;
            case 214:
                {
                alt120=5;
                }
                break;
            case 27:
                {
                alt120=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5958:3: lv_metric_12_1= 'Hours'
                    {
                    lv_metric_12_1=(Token)match(input,210,FOLLOW_210_in_ruleQR12721); 

                            newLeafNode(lv_metric_12_1, grammarAccess.getQRAccess().getMetricHoursKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5970:8: lv_metric_12_2= 'Mins'
                    {
                    lv_metric_12_2=(Token)match(input,211,FOLLOW_211_in_ruleQR12750); 

                            newLeafNode(lv_metric_12_2, grammarAccess.getQRAccess().getMetricMinsKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5982:8: lv_metric_12_3= 'Secs'
                    {
                    lv_metric_12_3=(Token)match(input,212,FOLLOW_212_in_ruleQR12779); 

                            newLeafNode(lv_metric_12_3, grammarAccess.getQRAccess().getMetricSecsKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5994:8: lv_metric_12_4= 'mSecs'
                    {
                    lv_metric_12_4=(Token)match(input,213,FOLLOW_213_in_ruleQR12808); 

                            newLeafNode(lv_metric_12_4, grammarAccess.getQRAccess().getMetricMSecsKeyword_10_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6006:8: lv_metric_12_5= 'Tasks'
                    {
                    lv_metric_12_5=(Token)match(input,214,FOLLOW_214_in_ruleQR12837); 

                            newLeafNode(lv_metric_12_5, grammarAccess.getQRAccess().getMetricTasksKeyword_10_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6018:8: lv_metric_12_6= 'Other'
                    {
                    lv_metric_12_6=(Token)match(input,27,FOLLOW_27_in_ruleQR12866); 

                            newLeafNode(lv_metric_12_6, grammarAccess.getQRAccess().getMetricOtherKeyword_10_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_6, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_13=(Token)match(input,215,FOLLOW_215_in_ruleQR12894); 

                	newLeafNode(otherlv_13, grammarAccess.getQRAccess().getValueKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6037:1: ( (lv_value_14_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6038:1: (lv_value_14_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6038:1: (lv_value_14_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6039:3: lv_value_14_0= RULE_INT
            {
            lv_value_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQR12911); 

            			newLeafNode(lv_value_14_0, grammarAccess.getQRAccess().getValueINTTerminalRuleCall_12_0()); 
            		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6055:2: (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==77) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6055:4: otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,77,FOLLOW_77_in_ruleQR12929); 

                        	newLeafNode(otherlv_15, grammarAccess.getQRAccess().getStakeholderKeyword_13_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6059:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6060:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6060:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6061:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR12949); 

                    		newLeafNode(otherlv_16, grammarAccess.getQRAccess().getStakeholderStakeholderCrossReference_13_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,107,FOLLOW_107_in_ruleQR12963); 

                	newLeafNode(otherlv_17, grammarAccess.getQRAccess().getPriorityKeyword_14());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6076:1: ( (lv_priority_18_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6077:1: (lv_priority_18_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6077:1: (lv_priority_18_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6078:3: lv_priority_18_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getQRAccess().getPriorityPriorityParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleQR12984);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6094:2: ( (lv_depends_19_0= ruleDependsOnQR ) )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==112||LA122_0==115||LA122_0==193) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6095:1: (lv_depends_19_0= ruleDependsOnQR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6095:1: (lv_depends_19_0= ruleDependsOnQR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6096:3: lv_depends_19_0= ruleDependsOnQR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQRAccess().getDependsDependsOnQRParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnQR_in_ruleQR13005);
            	    lv_depends_19_0=ruleDependsOnQR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQRRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"depends",
            	            		lv_depends_19_0, 
            	            		"DependsOnQR");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6112:3: (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==67) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6112:5: otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) )
                    {
                    otherlv_20=(Token)match(input,67,FOLLOW_67_in_ruleQR13019); 

                        	newLeafNode(otherlv_20, grammarAccess.getQRAccess().getPartOfKeyword_17_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6116:1: ( (otherlv_21= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6117:1: (otherlv_21= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6117:1: (otherlv_21= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6118:3: otherlv_21= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                            
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR13039); 

                    		newLeafNode(otherlv_21, grammarAccess.getQRAccess().getPartOfQRCrossReference_17_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,13,FOLLOW_13_in_ruleQR13053); 

                	newLeafNode(otherlv_22, grammarAccess.getQRAccess().getRightCurlyBracketKeyword_18());
                

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


    // $ANTLR start "entryRuleDependsOnQR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6141:1: entryRuleDependsOnQR returns [EObject current=null] : iv_ruleDependsOnQR= ruleDependsOnQR EOF ;
    public final EObject entryRuleDependsOnQR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnQR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6142:2: (iv_ruleDependsOnQR= ruleDependsOnQR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6143:2: iv_ruleDependsOnQR= ruleDependsOnQR EOF
            {
             newCompositeNode(grammarAccess.getDependsOnQRRule()); 
            pushFollow(FOLLOW_ruleDependsOnQR_in_entryRuleDependsOnQR13089);
            iv_ruleDependsOnQR=ruleDependsOnQR();

            state._fsp--;

             current =iv_ruleDependsOnQR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnQR13099); 

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
    // $ANTLR end "entryRuleDependsOnQR"


    // $ANTLR start "ruleDependsOnQR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6150:1: ruleDependsOnQR returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQR_1_0= ruleRefQR ) ) ) ;
    public final EObject ruleDependsOnQR() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refQR_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6153:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQR_1_0= ruleRefQR ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6154:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQR_1_0= ruleRefQR ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6154:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQR_1_0= ruleRefQR ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6154:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQR_1_0= ruleRefQR ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6154:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6155:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6155:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6156:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6156:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            int alt124=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt124=1;
                }
                break;
            case 193:
                {
                alt124=2;
                }
                break;
            case 115:
                {
                alt124=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6157:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,112,FOLLOW_112_in_ruleDependsOnQR13144); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnQRAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6169:8: lv_type_0_2= 'Refines'
                    {
                    lv_type_0_2=(Token)match(input,193,FOLLOW_193_in_ruleDependsOnQR13173); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnQRAccess().getTypeRefinesKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6181:8: lv_type_0_3= 'Conflicts'
                    {
                    lv_type_0_3=(Token)match(input,115,FOLLOW_115_in_ruleDependsOnQR13202); 

                            newLeafNode(lv_type_0_3, grammarAccess.getDependsOnQRAccess().getTypeConflictsKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6196:2: ( (lv_refQR_1_0= ruleRefQR ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6197:1: (lv_refQR_1_0= ruleRefQR )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6197:1: (lv_refQR_1_0= ruleRefQR )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6198:3: lv_refQR_1_0= ruleRefQR
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnQRAccess().getRefQRRefQRParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefQR_in_ruleDependsOnQR13239);
            lv_refQR_1_0=ruleRefQR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependsOnQRRule());
            	        }
                   		set(
                   			current, 
                   			"refQR",
                    		lv_refQR_1_0, 
                    		"RefQR");
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
    // $ANTLR end "ruleDependsOnQR"


    // $ANTLR start "entryRuleRefQR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6222:1: entryRuleRefQR returns [EObject current=null] : iv_ruleRefQR= ruleRefQR EOF ;
    public final EObject entryRuleRefQR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefQR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6223:2: (iv_ruleRefQR= ruleRefQR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6224:2: iv_ruleRefQR= ruleRefQR EOF
            {
             newCompositeNode(grammarAccess.getRefQRRule()); 
            pushFollow(FOLLOW_ruleRefQR_in_entryRuleRefQR13275);
            iv_ruleRefQR=ruleRefQR();

            state._fsp--;

             current =iv_ruleRefQR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefQR13285); 

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
    // $ANTLR end "entryRuleRefQR"


    // $ANTLR start "ruleRefQR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6231:1: ruleRefQR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefQR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6234:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6235:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6235:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6235:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6235:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6236:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6236:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6237:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefQRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefQR13330); 

            		newLeafNode(otherlv_0, grammarAccess.getRefQRAccess().getRefQRQRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6248:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==76) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6248:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleRefQR13343); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefQRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6252:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6253:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6253:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6254:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefQRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefQR13363); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefQRAccess().getRefsQRCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop125;
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
    // $ANTLR end "ruleRefQR"


    // $ANTLR start "entryRuleConstraint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6273:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6274:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6275:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint13401);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint13411); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6282:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_priority_12_0 = null;

        EObject lv_depends_13_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6285:28: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6286:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6286:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6286:3: otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,216,FOLLOW_216_in_ruleConstraint13448); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6290:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6291:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6291:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6292:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint13465); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConstraint13482); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6312:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==19) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6312:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleConstraint13495); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6316:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6317:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6317:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6318:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint13512); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6334:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==37) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6334:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleConstraint13532); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6338:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6339:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6339:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6340:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint13549); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleConstraint13568); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6360:1: ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6361:1: ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6361:1: ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6362:1: (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6362:1: (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' )
            int alt128=7;
            switch ( input.LA(1) ) {
            case 201:
                {
                alt128=1;
                }
                break;
            case 202:
                {
                alt128=2;
                }
                break;
            case 217:
                {
                alt128=3;
                }
                break;
            case 218:
                {
                alt128=4;
                }
                break;
            case 18:
                {
                alt128=5;
                }
                break;
            case 219:
                {
                alt128=6;
                }
                break;
            case 27:
                {
                alt128=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6363:3: lv_type_8_1= 'Cultural'
                    {
                    lv_type_8_1=(Token)match(input,201,FOLLOW_201_in_ruleConstraint13588); 

                            newLeafNode(lv_type_8_1, grammarAccess.getConstraintAccess().getTypeCulturalKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6375:8: lv_type_8_2= 'Legal'
                    {
                    lv_type_8_2=(Token)match(input,202,FOLLOW_202_in_ruleConstraint13617); 

                            newLeafNode(lv_type_8_2, grammarAccess.getConstraintAccess().getTypeLegalKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6387:8: lv_type_8_3= 'Organizational'
                    {
                    lv_type_8_3=(Token)match(input,217,FOLLOW_217_in_ruleConstraint13646); 

                            newLeafNode(lv_type_8_3, grammarAccess.getConstraintAccess().getTypeOrganizationalKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6399:8: lv_type_8_4= 'Physical'
                    {
                    lv_type_8_4=(Token)match(input,218,FOLLOW_218_in_ruleConstraint13675); 

                            newLeafNode(lv_type_8_4, grammarAccess.getConstraintAccess().getTypePhysicalKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6411:8: lv_type_8_5= 'Project'
                    {
                    lv_type_8_5=(Token)match(input,18,FOLLOW_18_in_ruleConstraint13704); 

                            newLeafNode(lv_type_8_5, grammarAccess.getConstraintAccess().getTypeProjectKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6423:8: lv_type_8_6= 'Technological'
                    {
                    lv_type_8_6=(Token)match(input,219,FOLLOW_219_in_ruleConstraint13733); 

                            newLeafNode(lv_type_8_6, grammarAccess.getConstraintAccess().getTypeTechnologicalKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6435:8: lv_type_8_7= 'Other'
                    {
                    lv_type_8_7=(Token)match(input,27,FOLLOW_27_in_ruleConstraint13762); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6450:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==77) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6450:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,77,FOLLOW_77_in_ruleConstraint13791); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6454:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6455:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6455:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6456:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint13811); 

                    		newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,107,FOLLOW_107_in_ruleConstraint13825); 

                	newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6471:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6472:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6472:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6473:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleConstraint13846);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6489:2: ( (lv_depends_13_0= ruleDependsOnConstraint ) )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==112||LA130_0==115||LA130_0==193) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6490:1: (lv_depends_13_0= ruleDependsOnConstraint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6490:1: (lv_depends_13_0= ruleDependsOnConstraint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6491:3: lv_depends_13_0= ruleDependsOnConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getDependsDependsOnConstraintParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnConstraint_in_ruleConstraint13867);
            	    lv_depends_13_0=ruleDependsOnConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"depends",
            	            		lv_depends_13_0, 
            	            		"DependsOnConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6507:3: (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==67) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6507:5: otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) )
                    {
                    otherlv_14=(Token)match(input,67,FOLLOW_67_in_ruleConstraint13881); 

                        	newLeafNode(otherlv_14, grammarAccess.getConstraintAccess().getPartOfKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6511:1: ( (otherlv_15= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6512:1: (otherlv_15= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6512:1: (otherlv_15= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6513:3: otherlv_15= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint13901); 

                    		newLeafNode(otherlv_15, grammarAccess.getConstraintAccess().getPartOfConstraintCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleConstraint13915); 

                	newLeafNode(otherlv_16, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_12());
                

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


    // $ANTLR start "entryRuleDependsOnConstraint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6536:1: entryRuleDependsOnConstraint returns [EObject current=null] : iv_ruleDependsOnConstraint= ruleDependsOnConstraint EOF ;
    public final EObject entryRuleDependsOnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnConstraint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6537:2: (iv_ruleDependsOnConstraint= ruleDependsOnConstraint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6538:2: iv_ruleDependsOnConstraint= ruleDependsOnConstraint EOF
            {
             newCompositeNode(grammarAccess.getDependsOnConstraintRule()); 
            pushFollow(FOLLOW_ruleDependsOnConstraint_in_entryRuleDependsOnConstraint13951);
            iv_ruleDependsOnConstraint=ruleDependsOnConstraint();

            state._fsp--;

             current =iv_ruleDependsOnConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnConstraint13961); 

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
    // $ANTLR end "entryRuleDependsOnConstraint"


    // $ANTLR start "ruleDependsOnConstraint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6545:1: ruleDependsOnConstraint returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) ) ) ;
    public final EObject ruleDependsOnConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refConst_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6548:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6549:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6549:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6549:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6549:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6550:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6550:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6551:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6551:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            int alt132=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt132=1;
                }
                break;
            case 193:
                {
                alt132=2;
                }
                break;
            case 115:
                {
                alt132=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6552:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,112,FOLLOW_112_in_ruleDependsOnConstraint14006); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnConstraintAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6564:8: lv_type_0_2= 'Refines'
                    {
                    lv_type_0_2=(Token)match(input,193,FOLLOW_193_in_ruleDependsOnConstraint14035); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnConstraintAccess().getTypeRefinesKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6576:8: lv_type_0_3= 'Conflicts'
                    {
                    lv_type_0_3=(Token)match(input,115,FOLLOW_115_in_ruleDependsOnConstraint14064); 

                            newLeafNode(lv_type_0_3, grammarAccess.getDependsOnConstraintAccess().getTypeConflictsKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6591:2: ( (lv_refConst_1_0= ruleRefConstraint ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6592:1: (lv_refConst_1_0= ruleRefConstraint )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6592:1: (lv_refConst_1_0= ruleRefConstraint )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6593:3: lv_refConst_1_0= ruleRefConstraint
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnConstraintAccess().getRefConstRefConstraintParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefConstraint_in_ruleDependsOnConstraint14101);
            lv_refConst_1_0=ruleRefConstraint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependsOnConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"refConst",
                    		lv_refConst_1_0, 
                    		"RefConstraint");
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
    // $ANTLR end "ruleDependsOnConstraint"


    // $ANTLR start "entryRuleRefConstraint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6617:1: entryRuleRefConstraint returns [EObject current=null] : iv_ruleRefConstraint= ruleRefConstraint EOF ;
    public final EObject entryRuleRefConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefConstraint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6618:2: (iv_ruleRefConstraint= ruleRefConstraint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6619:2: iv_ruleRefConstraint= ruleRefConstraint EOF
            {
             newCompositeNode(grammarAccess.getRefConstraintRule()); 
            pushFollow(FOLLOW_ruleRefConstraint_in_entryRuleRefConstraint14137);
            iv_ruleRefConstraint=ruleRefConstraint();

            state._fsp--;

             current =iv_ruleRefConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefConstraint14147); 

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
    // $ANTLR end "entryRuleRefConstraint"


    // $ANTLR start "ruleRefConstraint"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6626:1: ruleRefConstraint returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6629:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6630:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6630:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6630:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6630:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6631:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6631:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6632:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefConstraintRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefConstraint14192); 

            		newLeafNode(otherlv_0, grammarAccess.getRefConstraintAccess().getRefConstConstraintCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6643:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==76) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6643:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleRefConstraint14205); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefConstraintAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6647:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6648:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6648:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:6649:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefConstraintRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefConstraint14225); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefConstraintAccess().getRefsConstraintCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop133;
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
    // $ANTLR end "ruleRefConstraint"

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
    public static final BitSet FOLLOW_ruleProject_in_rulePackageProject317 = new BitSet(new long[]{0x0000000000006000L,0x0000040000002010L});
    public static final BitSet FOLLOW_ruleGlossaryTerm_in_rulePackageProject338 = new BitSet(new long[]{0x0000000000006000L,0x0000040000002010L});
    public static final BitSet FOLLOW_ruleStakeholder_in_rulePackageProject360 = new BitSet(new long[]{0x0000000000006000L,0x0000040000002000L});
    public static final BitSet FOLLOW_ruleGoal_in_rulePackageProject382 = new BitSet(new long[]{0x0000000000006000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rulePackageSystem_in_rulePackageProject404 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePackageProject417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageSystem_in_entryRulePackageSystem453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageSystem463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePackageSystem500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageSystem521 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackageSystem533 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleImport_in_rulePackageSystem554 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSystem_in_rulePackageSystem576 = new BitSet(new long[]{0x0000000000002000L,0x0000000000014000L,0x2000000002000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePackageSystem597 = new BitSet(new long[]{0x0000000000002000L,0x0000000000014000L,0x2000000002000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_ruleActor_in_rulePackageSystem619 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L,0x2000000002000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_ruleUseCase_in_rulePackageSystem641 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x2000000002000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_ruleFR_in_rulePackageSystem663 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x2000000000000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_ruleQR_in_rulePackageSystem685 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000004L});
    public static final BitSet FOLLOW_ruleConstraint_in_rulePackageSystem707 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_13_in_rulePackageSystem720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName808 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName842 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard948 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport1056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject1113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProject1160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject1177 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject1194 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleProject1207 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject1224 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleProject1243 = new BitSet(new long[]{0x000000000FE00000L});
    public static final BitSet FOLLOW_21_in_ruleProject1263 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22_in_ruleProject1292 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23_in_ruleProject1321 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24_in_ruleProject1350 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25_in_ruleProject1379 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26_in_ruleProject1408 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27_in_ruleProject1437 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleProject1465 = new BitSet(new long[]{0x00000007E8000000L});
    public static final BitSet FOLLOW_29_in_ruleProject1485 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_30_in_ruleProject1514 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_31_in_ruleProject1543 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_32_in_ruleProject1572 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_33_in_ruleProject1601 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_34_in_ruleProject1630 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_27_in_ruleProject1659 = new BitSet(new long[]{0x0080025800000000L});
    public static final BitSet FOLLOW_rulePlannedSchedule_in_ruleProject1696 = new BitSet(new long[]{0x0080021800000000L});
    public static final BitSet FOLLOW_ruleActualSchedule_in_ruleProject1718 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_ruleOrganizations_in_ruleProject1740 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleProject1754 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleStatus_in_ruleProject1775 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleProject1789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject1806 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleProject1823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject1840 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProject1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlannedSchedule_in_entryRulePlannedSchedule1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlannedSchedule1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePlannedSchedule1940 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePlannedSchedule1952 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_rulePlannedSchedule1973 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulePlannedSchedule1985 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_rulePlannedSchedule2006 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePlannedSchedule2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualSchedule_in_entryRuleActualSchedule2054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualSchedule2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleActualSchedule2101 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleActualSchedule2113 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleActualSchedule2134 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleActualSchedule2146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleActualSchedule2167 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActualSchedule2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate2215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate2267 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDate2284 = new BitSet(new long[]{0x007FF80000000000L});
    public static final BitSet FOLLOW_ruleMonth_in_ruleDate2305 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDate2317 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_entryRuleMonth2375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonth2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMonth2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMonth2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMonth2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMonth2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMonth2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMonth2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMonth2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMonth2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMonth2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMonth2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMonth2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMonth2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganizations_in_entryRuleOrganizations2799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganizations2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOrganizations2846 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleOrganizations2858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizations2875 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleOrganizations2892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizations2909 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleOrganizations2926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrganizations2943 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOrganizations2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_entryRuleStatus2996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatus3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleStatus3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleStatus3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleStatus3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleStatus3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleStatus3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleStatus3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStatus3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem3275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSystem3322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem3339 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem3356 = new BitSet(new long[]{0x00000020000C0000L});
    public static final BitSet FOLLOW_19_in_ruleSystem3369 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem3386 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_37_in_ruleSystem3406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem3423 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSystem3442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem3462 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSystem3475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem3495 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm3545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossaryTerm3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleGlossaryTerm3592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlossaryTerm3609 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGlossaryTerm3626 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleGlossaryTerm3639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm3656 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleGlossaryTerm3676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm3693 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGlossaryTerm3712 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleRefTermType_in_ruleGlossaryTerm3733 = new BitSet(new long[]{0x0000000000002000L,0x00000000000E0860L});
    public static final BitSet FOLLOW_69_in_ruleGlossaryTerm3746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm3763 = new BitSet(new long[]{0x0000000000002000L,0x00000000000E0840L});
    public static final BitSet FOLLOW_70_in_ruleGlossaryTerm3783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_71_in_ruleGlossaryTerm3803 = new BitSet(new long[]{0x0000000000002000L,0x00000000000E0800L});
    public static final BitSet FOLLOW_72_in_ruleGlossaryTerm3832 = new BitSet(new long[]{0x0000000000002000L,0x00000000000E0800L});
    public static final BitSet FOLLOW_73_in_ruleGlossaryTerm3861 = new BitSet(new long[]{0x0000000000002000L,0x00000000000E0800L});
    public static final BitSet FOLLOW_74_in_ruleGlossaryTerm3890 = new BitSet(new long[]{0x0000000000002000L,0x00000000000E0800L});
    public static final BitSet FOLLOW_75_in_ruleGlossaryTerm3921 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm3938 = new BitSet(new long[]{0x0000000000002000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleTermRelation_in_ruleGlossaryTerm3966 = new BitSet(new long[]{0x0000000000002000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_13_in_ruleGlossaryTerm3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTermType_in_entryRuleRefTermType4015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTermType4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType4071 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefTermType4084 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType4105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleTermType_in_entryRuleTermType4143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermType4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTermType4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTermType4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleTermType4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleTermType4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermRelation_in_entryRuleTermRelation4335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermRelation4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleTermRelation4390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_82_in_ruleTermRelation4419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_83_in_ruleTermRelation4448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRefTerm_in_ruleTermRelation4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTerm_in_entryRuleRefTerm4521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTerm4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefTerm4573 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefTerm4591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefTerm4608 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder4651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleStakeholder4698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder4715 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStakeholder4732 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleStakeholder4745 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder4762 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleStakeholder4782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder4799 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStakeholder4818 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_84_in_ruleStakeholder4838 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_85_in_ruleStakeholder4867 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_86_in_ruleStakeholder4896 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_87_in_ruleStakeholder4925 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_88_in_ruleStakeholder4954 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleStakeholder4982 = new BitSet(new long[]{0x0000000000000000L,0x000003FFFC000000L});
    public static final BitSet FOLLOW_90_in_ruleStakeholder5002 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_91_in_ruleStakeholder5031 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_92_in_ruleStakeholder5060 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_93_in_ruleStakeholder5089 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_94_in_ruleStakeholder5118 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_95_in_ruleStakeholder5147 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_96_in_ruleStakeholder5176 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_97_in_ruleStakeholder5205 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_98_in_ruleStakeholder5234 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_ruleStakeholder5263 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_100_in_ruleStakeholder5292 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_101_in_ruleStakeholder5321 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_102_in_ruleStakeholder5350 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_103_in_ruleStakeholder5379 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_104_in_ruleStakeholder5408 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_105_in_ruleStakeholder5437 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStakeholder5466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder5486 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStakeholder5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal5536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleGoal5583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal5600 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoal5617 = new BitSet(new long[]{0x0000002000080000L,0x0000080000002000L});
    public static final BitSet FOLLOW_19_in_ruleGoal5630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal5647 = new BitSet(new long[]{0x0000002000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_37_in_ruleGoal5667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal5684 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_77_in_ruleGoal5704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal5724 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleGoal5738 = new BitSet(new long[]{0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleGoal5759 = new BitSet(new long[]{0x0000000000002000L,0x003F000000000000L});
    public static final BitSet FOLLOW_ruleDependsOnGoal_in_ruleGoal5780 = new BitSet(new long[]{0x0000000000002000L,0x003F000000000000L});
    public static final BitSet FOLLOW_ruleComposedBy_in_ruleGoal5802 = new BitSet(new long[]{0x0000000000002000L,0x0020000000000000L});
    public static final BitSet FOLLOW_13_in_ruleGoal5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriority_in_entryRulePriority5851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePriority5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rulePriority5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rulePriority5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rulePriority5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_rulePriority5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnGoal_in_entryRuleDependsOnGoal6043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnGoal6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleDependsOnGoal6098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_113_in_ruleDependsOnGoal6127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_114_in_ruleDependsOnGoal6156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_115_in_ruleDependsOnGoal6185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_116_in_ruleDependsOnGoal6214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleDependsOnGoal6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComposedBy_in_entryRuleComposedBy6287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComposedBy6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleComposedBy6334 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_ruleComposedBy6354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_119_in_ruleComposedBy6383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleComposedBy6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGoal_in_entryRuleRefGoal6456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGoal6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal6511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefGoal6524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal6544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity6582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleEntity6629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity6646 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity6663 = new BitSet(new long[]{0x0000002000180000L,0x0400000000000000L});
    public static final BitSet FOLLOW_19_in_ruleEntity6676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity6693 = new BitSet(new long[]{0x0000002000180000L,0x0400000000000000L});
    public static final BitSet FOLLOW_37_in_ruleEntity6713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity6730 = new BitSet(new long[]{0x0000002000180000L,0x0400000000000000L});
    public static final BitSet FOLLOW_20_in_ruleEntity6750 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleEntity6770 = new BitSet(new long[]{0x0000002000180000L,0x0400000000000000L});
    public static final BitSet FOLLOW_121_in_ruleEntity6799 = new BitSet(new long[]{0x0000002000180000L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity6838 = new BitSet(new long[]{0x0000002000182000L,0x0400000000000000L,0x0000000000190000L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_ruleEntity6860 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleForeignKey_in_ruleEntity6882 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleEntity6904 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_13_in_ruleEntity6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute6953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleAttribute7000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute7017 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute7034 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute7047 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute7064 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleAttribute7084 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute7101 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute7120 = new BitSet(new long[]{0x0000000000000000L,0xF800000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_123_in_ruleAttribute7140 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_124_in_ruleAttribute7169 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_125_in_ruleAttribute7198 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_126_in_ruleAttribute7227 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_127_in_ruleAttribute7256 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_128_in_ruleAttribute7285 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_129_in_ruleAttribute7314 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_130_in_ruleAttribute7343 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_131_in_ruleAttribute7372 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_132_in_ruleAttribute7401 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_133_in_ruleAttribute7430 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_134_in_ruleAttribute7459 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_135_in_ruleAttribute7488 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttribute7505 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_136_in_ruleAttribute7525 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAttribute7546 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_137_in_ruleAttribute7561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute7578 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_ruleAttribute7603 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_ruleAttribute7635 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity7697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleMultiplicity7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleMultiplicity7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleMultiplicity7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleMultiplicity7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiplicity7866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey7909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryKey7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_rulePrimaryKey7956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_rulePrimaryKey7968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_rulePrimaryKey7989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_rulePrimaryKey8001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_entryRuleForeignKey8037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignKey8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleForeignKey8084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeignKey8104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_ruleForeignKey8116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_ruleForeignKey8137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_ruleForeignKey8149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_ruleForeignKey8161 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleForeignKey8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute8218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefAttribute8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute8273 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefAttribute8286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute8306 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck8344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck8354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleCheck8391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheck8408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheck8430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor8471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor8481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleActor8518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor8535 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor8552 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleActor8565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor8582 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleActor8602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor8619 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor8638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_149_in_ruleActor8658 = new BitSet(new long[]{0x0000000000002000L,0x0000000000002000L,0x0000000001000000L});
    public static final BitSet FOLLOW_150_in_ruleActor8687 = new BitSet(new long[]{0x0000000000002000L,0x0000000000002000L,0x0000000001000000L});
    public static final BitSet FOLLOW_151_in_ruleActor8716 = new BitSet(new long[]{0x0000000000002000L,0x0000000000002000L,0x0000000001000000L});
    public static final BitSet FOLLOW_77_in_ruleActor8745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor8765 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_ruleActor8780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor8800 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActor8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase8850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase8860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleUseCase8897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase8914 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase8931 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleUseCase8944 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase8961 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleUseCase8981 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase8998 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUseCase9017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000001FC000000L});
    public static final BitSet FOLLOW_154_in_ruleUseCase9037 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_155_in_ruleUseCase9066 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_156_in_ruleUseCase9095 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_157_in_ruleUseCase9124 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_158_in_ruleUseCase9153 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_159_in_ruleUseCase9182 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_160_in_ruleUseCase9211 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_ruleUseCase9240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefEntity_in_ruleUseCase9261 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleUseCase9275 = new BitSet(new long[]{0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleUseCase9296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000801C00000000L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_ruleUseCase9317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000801C00000000L});
    public static final BitSet FOLLOW_162_in_ruleUseCase9331 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleUseCase9352 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_163_in_ruleUseCase9368 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleUseCase9389 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_ruleUseCase9404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase9424 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x000103E000000000L});
    public static final BitSet FOLLOW_165_in_ruleUseCase9437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefActor_in_ruleUseCase9458 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x000103C000000000L});
    public static final BitSet FOLLOW_166_in_ruleUseCase9473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase9490 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0001038000000000L});
    public static final BitSet FOLLOW_167_in_ruleUseCase9510 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase9527 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0001030000000000L});
    public static final BitSet FOLLOW_168_in_ruleUseCase9547 = new BitSet(new long[]{0x0000000000002010L,0x0000000000000000L,0x0001020000000000L});
    public static final BitSet FOLLOW_ruleRefUC_in_ruleUseCase9568 = new BitSet(new long[]{0x0000000000002010L,0x0000000000000000L,0x0001020000000000L});
    public static final BitSet FOLLOW_169_in_ruleUseCase9584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase9604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_170_in_ruleUseCase9616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase9636 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleUseCase9659 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_13_in_ruleUseCase9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefEntity_in_entryRuleRefEntity9708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefEntity9718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEntity9763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_171_in_ruleRefEntity9775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000700000000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleRefEntity9796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefEntity9809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEntity9829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_171_in_ruleRefEntity9841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000700000000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleRefEntity9862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType9900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_ruleEntityType9954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_ruleEntityType9983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_ruleEntityType10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefFR_in_entryRuleRefFR10063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefFR10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR10118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefFR10131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR10151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleRefActor_in_entryRuleRefActor10189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefActor10199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefActor10244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefActor10257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefActor10277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleRefUC_in_entryRuleRefUC10315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefUC10325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC10370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefUC10383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC10403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint10441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionPoint10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_ruleExtensionPoint10488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionPoint10505 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleExtensionPoint10523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExtensionPoint10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario10583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario10593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_ruleScenario10630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScenario10647 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleScenario10664 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleScenario10677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario10694 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleScenario10714 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario10731 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScenario10750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000E000000000000L});
    public static final BitSet FOLLOW_177_in_ruleScenario10770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_178_in_ruleScenario10799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_179_in_ruleScenario10828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_ruleScenario10856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_181_in_ruleScenario10876 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_182_in_ruleScenario10905 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenario10942 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_13_in_ruleScenario10955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep10991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_ruleStep11038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep11055 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStep11072 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleStep11085 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11102 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleStep11122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11139 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStep11158 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0F00000000000000L});
    public static final BitSet FOLLOW_184_in_ruleStep11178 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L,0x100000C000000000L});
    public static final BitSet FOLLOW_185_in_ruleStep11207 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L,0x100000C000000000L});
    public static final BitSet FOLLOW_186_in_ruleStep11236 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L,0x100000C000000000L});
    public static final BitSet FOLLOW_187_in_ruleStep11265 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L,0x100000C000000000L});
    public static final BitSet FOLLOW_27_in_ruleStep11294 = new BitSet(new long[]{0x0000000000002000L,0x0000000000010000L,0x100000C000000000L});
    public static final BitSet FOLLOW_80_in_ruleStep11323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep11343 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x100000C000000000L});
    public static final BitSet FOLLOW_166_in_ruleStep11358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11375 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1000008000000000L});
    public static final BitSet FOLLOW_167_in_ruleStep11395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep11412 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_ruleStep11432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep11452 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStep11466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFR_in_entryRuleFR11502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFR11512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_ruleFR11549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR11566 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFR11583 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_19_in_ruleFR11596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR11613 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFR11632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR11649 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFR11666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_190_in_ruleFR11686 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_191_in_ruleFR11715 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_192_in_ruleFR11744 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_77_in_ruleFR11773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR11793 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleFR11807 = new BitSet(new long[]{0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleFR11828 = new BitSet(new long[]{0x0000000000002000L,0x0009000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnFR_in_ruleFR11849 = new BitSet(new long[]{0x0000000000002000L,0x0009000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFR11863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR11883 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFR11897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnFR_in_entryRuleDependsOnFR11933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnFR11943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleDependsOnFR11988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_193_in_ruleDependsOnFR12017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_115_in_ruleDependsOnFR12046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleDependsOnFR12083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQR_in_entryRuleQR12119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQR12129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleQR12166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR12183 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQR12200 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_19_in_ruleQR12213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQR12230 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleQR12249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQR12266 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQR12283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000007F8L});
    public static final BitSet FOLLOW_195_in_ruleQR12303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_196_in_ruleQR12332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_197_in_ruleQR12361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_198_in_ruleQR12390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_199_in_ruleQR12419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_200_in_ruleQR12448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_201_in_ruleQR12477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_202_in_ruleQR12506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_203_in_ruleQR12535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_204_in_ruleQR12555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_205_in_ruleQR12584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_206_in_ruleQR12613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_207_in_ruleQR12642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_208_in_ruleQR12671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_209_in_ruleQR12701 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0000L});
    public static final BitSet FOLLOW_210_in_ruleQR12721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_211_in_ruleQR12750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_212_in_ruleQR12779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_213_in_ruleQR12808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_214_in_ruleQR12837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_27_in_ruleQR12866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_ruleQR12894 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQR12911 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_77_in_ruleQR12929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR12949 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleQR12963 = new BitSet(new long[]{0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleQR12984 = new BitSet(new long[]{0x0000000000002000L,0x0009000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnQR_in_ruleQR13005 = new BitSet(new long[]{0x0000000000002000L,0x0009000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleQR13019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR13039 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQR13053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnQR_in_entryRuleDependsOnQR13089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnQR13099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleDependsOnQR13144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_193_in_ruleDependsOnQR13173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_115_in_ruleDependsOnQR13202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefQR_in_ruleDependsOnQR13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefQR_in_entryRuleRefQR13275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefQR13285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefQR13330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefQR13343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefQR13363 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint13401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint13411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_ruleConstraint13448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint13465 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstraint13482 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint13495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint13512 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_37_in_ruleConstraint13532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint13549 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint13568 = new BitSet(new long[]{0x0000000008040000L,0x0000000000000000L,0x0000000000000000L,0x000000000E000600L});
    public static final BitSet FOLLOW_201_in_ruleConstraint13588 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_202_in_ruleConstraint13617 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_217_in_ruleConstraint13646 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_218_in_ruleConstraint13675 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint13704 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_219_in_ruleConstraint13733 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_27_in_ruleConstraint13762 = new BitSet(new long[]{0x0000000000000000L,0x0000080000002000L});
    public static final BitSet FOLLOW_77_in_ruleConstraint13791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint13811 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleConstraint13825 = new BitSet(new long[]{0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleConstraint13846 = new BitSet(new long[]{0x0000000000002000L,0x0009000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnConstraint_in_ruleConstraint13867 = new BitSet(new long[]{0x0000000000002000L,0x0009000000000008L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleConstraint13881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint13901 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstraint13915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnConstraint_in_entryRuleDependsOnConstraint13951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnConstraint13961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleDependsOnConstraint14006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_193_in_ruleDependsOnConstraint14035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_115_in_ruleDependsOnConstraint14064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefConstraint_in_ruleDependsOnConstraint14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefConstraint_in_entryRuleRefConstraint14137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefConstraint14147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefConstraint14192 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleRefConstraint14205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefConstraint14225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});

}