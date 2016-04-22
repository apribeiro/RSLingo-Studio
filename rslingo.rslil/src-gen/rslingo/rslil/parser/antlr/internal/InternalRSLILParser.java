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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "'{'", "'Name'", "'Description'", "'HasSystems'", "'}'", "'System'", "'PartOf'", "','", "'GlossaryTerm'", "'Type'", "'Acronym'", "'POS'", "'Adjective'", "'Adverb'", "'Noun'", "'Verb'", "'Synset'", "'Stakeholder'", "'Entity'", "'Architectural'", "'Actor'", "'Antonym'", "'Hypernym'", "'Synonym'", "'Group.Organization'", "'Group.BusinessUnit'", "'Group.Team'", "'Individual.Person'", "'Individual.ExternalSystem'", "'Category'", "'Business'", "'Business.Customer'", "'Business.Customer.Sponsor'", "'Business.Customer.Champion'", "'Business.User.Direct'", "'Business.User.Indirect'", "'Business.Advisor.DomainExpert'", "'Business.Advisor.Trainer'", "'Business.Advisor.RegulatorAgent'", "'Business.System'", "'Technical'", "'Technical.BusinessAnalyst'", "'Technical.Requirements.Engineer'", "'Technical.Software.Architect'", "'Technical.Software.Designer'", "'Technical.Software.Tester'", "'Goal'", "'Priority'", "'VeryLow'", "'Low'", "'Medium'", "'High'", "'VeryHigh'", "'Requires'", "'Supports'", "'Obstructs'", "'Conflicts'", "'Identical'", "'ComposedBy'", "'Logic-And'", "'Logic-Or'", "'Main'", "'Secondary'", "'Attribute'", "'Boolean'", "'Integer'", "'Decimal'", "'Currency'", "'Date'", "'Time'", "'Datetime'", "'Enumeration'", "'Text'", "'Regex'", "'URL'", "'Image'", "'Field'", "'Size'", "'Multiplicity'", "'DefaultValue'", "'NotNull'", "'Unique'", "'Check'", "'\"0\"'", "'\"1\"'", "'\"0..1\"'", "'\"*\"'", "'ForeignKey'", "'('", "')'", "'User'", "'ExternalSystem'", "'Timer'", "'SpecializedFrom'", "'UseCase'", "'EntityManage'", "'EntityBrowse'", "'EntitySearch'", "'EntityCreate'", "'EntityDelete'", "'EntitySync'", "'Report'", "'Goals'", "'FunctionalRequirements'", "'ActorInitiates'", "'ActorParticipates'", "'Pre-Conditions'", "'Post-Conditions'", "'Include'", "'Extend'", "'on'", "'ExtensionPoint'", "'Scenario'", "'Alternative'", "'Exception'", "'ExecutionMode'", "'Sequential'", "'Parallel'", "'Step'", "'ActorPrepareData'", "'ActorCallSystem'", "'SystemExecutes'", "'SystemReturnResult'", "'Other'", "'NextStep'", "'FunctionalRequirement'", "'Functional'", "'Behavioral'", "'Data'", "'Modality'", "'Mandatory'", "'Desirable'", "'Optional'", "'Refines'", "'Non-FunctionalRequirement'", "'Security'", "'Performance'", "'Usability'", "'Appearance'", "'Operational'", "'Maintenance'", "'Cultural'", "'Legal'", "'Sub-Type'", "'Security.Privacy'", "'Security.Integrity'", "'Usability.EaseOfUse'", "'Usability.EaseOfLearn'", "'Usability.Accessibility'", "'Metric'", "'Hours'", "'Mins'", "'Secs'", "'mSecs'", "'Tasks'", "'Value'"
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
    public static final int RULE_ML_COMMENT=7;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_project_0_0 = null;

        EObject lv_systems_1_0 = null;

        EObject lv_glossaryTerms_2_0 = null;

        EObject lv_stakeholders_3_0 = null;

        EObject lv_goals_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_actors_6_0 = null;

        EObject lv_useCases_7_0 = null;

        EObject lv_frs_8_0 = null;

        EObject lv_nfrs_9_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:79:28: ( ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:2: ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:2: ( (lv_project_0_0= ruleProject ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:81:1: (lv_project_0_0= ruleProject )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:81:1: (lv_project_0_0= ruleProject )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:82:3: lv_project_0_0= ruleProject
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getProjectProjectParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleProject_in_ruleModel131);
            lv_project_0_0=ruleProject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"project",
                    		lv_project_0_0, 
                    		"Project");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:98:2: ( (lv_systems_1_0= ruleSystem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:99:1: (lv_systems_1_0= ruleSystem )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:99:1: (lv_systems_1_0= ruleSystem )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:100:3: lv_systems_1_0= ruleSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystem_in_ruleModel152);
            	    lv_systems_1_0=ruleSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systems",
            	            		lv_systems_1_0, 
            	            		"System");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:116:3: ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:117:1: (lv_glossaryTerms_2_0= ruleGlossaryTerm )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:117:1: (lv_glossaryTerms_2_0= ruleGlossaryTerm )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:118:3: lv_glossaryTerms_2_0= ruleGlossaryTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGlossaryTermsGlossaryTermParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlossaryTerm_in_ruleModel174);
            	    lv_glossaryTerms_2_0=ruleGlossaryTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"glossaryTerms",
            	            		lv_glossaryTerms_2_0, 
            	            		"GlossaryTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:134:3: ( (lv_stakeholders_3_0= ruleStakeholder ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:135:1: (lv_stakeholders_3_0= ruleStakeholder )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:135:1: (lv_stakeholders_3_0= ruleStakeholder )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:136:3: lv_stakeholders_3_0= ruleStakeholder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStakeholdersStakeholderParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStakeholder_in_ruleModel196);
            	    lv_stakeholders_3_0=ruleStakeholder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stakeholders",
            	            		lv_stakeholders_3_0, 
            	            		"Stakeholder");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:152:3: ( (lv_goals_4_0= ruleGoal ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==58) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:153:1: (lv_goals_4_0= ruleGoal )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:153:1: (lv_goals_4_0= ruleGoal )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:154:3: lv_goals_4_0= ruleGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGoalsGoalParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_ruleModel218);
            	    lv_goals_4_0=ruleGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goals",
            	            		lv_goals_4_0, 
            	            		"Goal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:170:3: ( (lv_entities_5_0= ruleEntity ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:171:1: (lv_entities_5_0= ruleEntity )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:171:1: (lv_entities_5_0= ruleEntity )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:172:3: lv_entities_5_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModel240);
            	    lv_entities_5_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
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
            	    break loop5;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:188:3: ( (lv_actors_6_0= ruleActor ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:189:1: (lv_actors_6_0= ruleActor )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:189:1: (lv_actors_6_0= ruleActor )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:190:3: lv_actors_6_0= ruleActor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getActorsActorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActor_in_ruleModel262);
            	    lv_actors_6_0=ruleActor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
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
            	    break loop6;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:206:3: ( (lv_useCases_7_0= ruleUseCase ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==106) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:207:1: (lv_useCases_7_0= ruleUseCase )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:207:1: (lv_useCases_7_0= ruleUseCase )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:208:3: lv_useCases_7_0= ruleUseCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUseCase_in_ruleModel284);
            	    lv_useCases_7_0=ruleUseCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
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
            	    break loop7;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:224:3: ( (lv_frs_8_0= ruleFR ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==137) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:225:1: (lv_frs_8_0= ruleFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:225:1: (lv_frs_8_0= ruleFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:226:3: lv_frs_8_0= ruleFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFrsFRParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFR_in_ruleModel306);
            	    lv_frs_8_0=ruleFR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
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
            	    break loop8;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:242:3: ( (lv_nfrs_9_0= ruleNFR ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==146) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:243:1: (lv_nfrs_9_0= ruleNFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:243:1: (lv_nfrs_9_0= ruleNFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:244:3: lv_nfrs_9_0= ruleNFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getNfrsNFRParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNFR_in_ruleModel328);
            	    lv_nfrs_9_0=ruleNFR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nfrs",
            	            		lv_nfrs_9_0, 
            	            		"NFR");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProject"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:268:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:269:2: (iv_ruleProject= ruleProject EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:270:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject365);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject375); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:277:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
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
        EObject lv_refSystem_8_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:280:28: ( (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:281:1: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:281:1: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:281:3: otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProject412); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:286:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject429); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProject446); 

                	newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:307:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:307:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProject459); 

                        	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:311:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:312:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:312:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:313:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject476); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleProject495); 

                	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:333:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:334:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:334:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:335:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject512); 

            			newLeafNode(lv_description_6_0, grammarAccess.getProjectAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:351:2: (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:351:4: otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleProject530); 

                        	newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getHasSystemsKeyword_6_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:355:1: ( (lv_refSystem_8_0= ruleRefSystem ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:356:1: (lv_refSystem_8_0= ruleRefSystem )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:356:1: (lv_refSystem_8_0= ruleRefSystem )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:357:3: lv_refSystem_8_0= ruleRefSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getRefSystemRefSystemParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefSystem_in_ruleProject551);
                    lv_refSystem_8_0=ruleRefSystem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"refSystem",
                            		lv_refSystem_8_0, 
                            		"RefSystem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleProject565); 

                	newLeafNode(otherlv_9, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleSystem"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:385:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:386:2: (iv_ruleSystem= ruleSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:387:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem601);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem611); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:394:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
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

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:397:28: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:398:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:398:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:398:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSystem648); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:402:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:403:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:403:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:404:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem665); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem682); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:424:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:424:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSystem695); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:428:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:429:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:429:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:430:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem712); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSystem731); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:450:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:451:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:451:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:452:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem748); 

            			newLeafNode(lv_description_6_0, grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:468:2: (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:468:4: otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSystem766); 

                        	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getPartOfKeyword_6_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:472:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:473:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:473:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:474:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem786); 

                    		newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getPartOfSystemCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSystem800); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleRefSystem"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:497:1: entryRuleRefSystem returns [EObject current=null] : iv_ruleRefSystem= ruleRefSystem EOF ;
    public final EObject entryRuleRefSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:498:2: (iv_ruleRefSystem= ruleRefSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:499:2: iv_ruleRefSystem= ruleRefSystem EOF
            {
             newCompositeNode(grammarAccess.getRefSystemRule()); 
            pushFollow(FOLLOW_ruleRefSystem_in_entryRuleRefSystem836);
            iv_ruleRefSystem=ruleRefSystem();

            state._fsp--;

             current =iv_ruleRefSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefSystem846); 

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
    // $ANTLR end "entryRuleRefSystem"


    // $ANTLR start "ruleRefSystem"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:506:1: ruleRefSystem returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:509:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:510:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:510:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:510:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:510:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:511:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:511:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:512:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefSystemRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefSystem891); 

            		newLeafNode(otherlv_0, grammarAccess.getRefSystemAccess().getRefSystemSystemCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:523:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:523:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefSystem904); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefSystemAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:527:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:528:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:528:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:529:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefSystemRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefSystem924); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefSystemAccess().getRefsSystemCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


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
    // $ANTLR end "ruleRefSystem"


    // $ANTLR start "entryRuleGlossaryTerm"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:548:1: entryRuleGlossaryTerm returns [EObject current=null] : iv_ruleGlossaryTerm= ruleGlossaryTerm EOF ;
    public final EObject entryRuleGlossaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossaryTerm = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:549:2: (iv_ruleGlossaryTerm= ruleGlossaryTerm EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:550:2: iv_ruleGlossaryTerm= ruleGlossaryTerm EOF
            {
             newCompositeNode(grammarAccess.getGlossaryTermRule()); 
            pushFollow(FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm962);
            iv_ruleGlossaryTerm=ruleGlossaryTerm();

            state._fsp--;

             current =iv_ruleGlossaryTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossaryTerm972); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:557:1: ruleGlossaryTerm returns [EObject current=null] : (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( (lv_type_6_0= ruleRefTermType ) ) (otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) )? otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' ) ;
    public final EObject ruleGlossaryTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nameAlias_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_acronym_8_0=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token lv_pos_12_1=null;
        Token lv_pos_12_2=null;
        Token lv_pos_12_3=null;
        Token lv_pos_12_4=null;
        Token otherlv_13=null;
        Token lv_synset_14_0=null;
        Token otherlv_16=null;
        EObject lv_type_6_0 = null;

        EObject lv_termRelation_15_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:560:28: ( (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( (lv_type_6_0= ruleRefTermType ) ) (otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) )? otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:561:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( (lv_type_6_0= ruleRefTermType ) ) (otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) )? otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:561:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( (lv_type_6_0= ruleRefTermType ) ) (otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) )? otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:561:3: otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( (lv_type_6_0= ruleRefTermType ) ) (otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) )? otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleGlossaryTerm1009); 

                	newLeafNode(otherlv_0, grammarAccess.getGlossaryTermAccess().getGlossaryTermKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:565:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:566:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:566:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:567:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlossaryTerm1026); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGlossaryTerm1043); 

                	newLeafNode(otherlv_2, grammarAccess.getGlossaryTermAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:587:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:587:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleGlossaryTerm1056); 

                        	newLeafNode(otherlv_3, grammarAccess.getGlossaryTermAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:591:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:592:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:592:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:593:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm1073); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleGlossaryTerm1092); 

                	newLeafNode(otherlv_5, grammarAccess.getGlossaryTermAccess().getTypeKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:613:1: ( (lv_type_6_0= ruleRefTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:614:1: (lv_type_6_0= ruleRefTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:614:1: (lv_type_6_0= ruleRefTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:615:3: lv_type_6_0= ruleRefTermType
            {
             
            	        newCompositeNode(grammarAccess.getGlossaryTermAccess().getTypeRefTermTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRefTermType_in_ruleGlossaryTerm1113);
            lv_type_6_0=ruleRefTermType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlossaryTermRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"RefTermType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:631:2: (otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:631:4: otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleGlossaryTerm1126); 

                        	newLeafNode(otherlv_7, grammarAccess.getGlossaryTermAccess().getAcronymKeyword_6_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:635:1: ( (lv_acronym_8_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:636:1: (lv_acronym_8_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:636:1: (lv_acronym_8_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:637:3: lv_acronym_8_0= RULE_STRING
                    {
                    lv_acronym_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm1143); 

                    			newLeafNode(lv_acronym_8_0, grammarAccess.getGlossaryTermAccess().getAcronymSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"acronym",
                            		lv_acronym_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleGlossaryTerm1162); 

                	newLeafNode(otherlv_9, grammarAccess.getGlossaryTermAccess().getDescriptionKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:657:1: ( (lv_description_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:658:1: (lv_description_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:658:1: (lv_description_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:659:3: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm1179); 

            			newLeafNode(lv_description_10_0, grammarAccess.getGlossaryTermAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_10_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:675:2: (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:675:4: otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleGlossaryTerm1197); 

                        	newLeafNode(otherlv_11, grammarAccess.getGlossaryTermAccess().getPOSKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:679:1: ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:680:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:680:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:681:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:681:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    int alt17=4;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt17=1;
                        }
                        break;
                    case 25:
                        {
                        alt17=2;
                        }
                        break;
                    case 26:
                        {
                        alt17=3;
                        }
                        break;
                    case 27:
                        {
                        alt17=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:682:3: lv_pos_12_1= 'Adjective'
                            {
                            lv_pos_12_1=(Token)match(input,24,FOLLOW_24_in_ruleGlossaryTerm1217); 

                                    newLeafNode(lv_pos_12_1, grammarAccess.getGlossaryTermAccess().getPosAdjectiveKeyword_9_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:694:8: lv_pos_12_2= 'Adverb'
                            {
                            lv_pos_12_2=(Token)match(input,25,FOLLOW_25_in_ruleGlossaryTerm1246); 

                                    newLeafNode(lv_pos_12_2, grammarAccess.getGlossaryTermAccess().getPosAdverbKeyword_9_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:706:8: lv_pos_12_3= 'Noun'
                            {
                            lv_pos_12_3=(Token)match(input,26,FOLLOW_26_in_ruleGlossaryTerm1275); 

                                    newLeafNode(lv_pos_12_3, grammarAccess.getGlossaryTermAccess().getPosNounKeyword_9_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:718:8: lv_pos_12_4= 'Verb'
                            {
                            lv_pos_12_4=(Token)match(input,27,FOLLOW_27_in_ruleGlossaryTerm1304); 

                                    newLeafNode(lv_pos_12_4, grammarAccess.getGlossaryTermAccess().getPosVerbKeyword_9_1_0_3());
                                

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:733:4: (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:733:6: otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleGlossaryTerm1335); 

                        	newLeafNode(otherlv_13, grammarAccess.getGlossaryTermAccess().getSynsetKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:737:1: ( (lv_synset_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:738:1: (lv_synset_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:738:1: (lv_synset_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:739:3: lv_synset_14_0= RULE_STRING
                    {
                    lv_synset_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm1352); 

                    			newLeafNode(lv_synset_14_0, grammarAccess.getGlossaryTermAccess().getSynsetSTRINGTerminalRuleCall_10_1_0()); 
                    		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:755:4: ( (lv_termRelation_15_0= ruleTermRelation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=33 && LA20_0<=35)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:756:1: (lv_termRelation_15_0= ruleTermRelation )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:756:1: (lv_termRelation_15_0= ruleTermRelation )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:757:3: lv_termRelation_15_0= ruleTermRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlossaryTermAccess().getTermRelationTermRelationParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTermRelation_in_ruleGlossaryTerm1380);
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
            	    break loop20;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleGlossaryTerm1393); 

                	newLeafNode(otherlv_16, grammarAccess.getGlossaryTermAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:785:1: entryRuleRefTermType returns [EObject current=null] : iv_ruleRefTermType= ruleRefTermType EOF ;
    public final EObject entryRuleRefTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:786:2: (iv_ruleRefTermType= ruleRefTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:787:2: iv_ruleRefTermType= ruleRefTermType EOF
            {
             newCompositeNode(grammarAccess.getRefTermTypeRule()); 
            pushFollow(FOLLOW_ruleRefTermType_in_entryRuleRefTermType1429);
            iv_ruleRefTermType=ruleRefTermType();

            state._fsp--;

             current =iv_ruleRefTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTermType1439); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:794:1: ruleRefTermType returns [EObject current=null] : ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) ;
    public final EObject ruleRefTermType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_refType_0_0 = null;

        EObject lv_refs_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:797:28: ( ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:2: ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:2: ( (lv_refType_0_0= ruleTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:799:1: (lv_refType_0_0= ruleTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:799:1: (lv_refType_0_0= ruleTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:800:3: lv_refType_0_0= ruleTermType
            {
             
            	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefTypeTermTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType1485);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:2: (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:4: otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefTermType1498); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefTermTypeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:820:1: ( (lv_refs_2_0= ruleTermType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:821:1: (lv_refs_2_0= ruleTermType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:821:1: (lv_refs_2_0= ruleTermType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:822:3: lv_refs_2_0= ruleTermType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefsTermTypeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType1519);
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
            	    break loop21;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:846:1: entryRuleTermType returns [EObject current=null] : iv_ruleTermType= ruleTermType EOF ;
    public final EObject entryRuleTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:847:2: (iv_ruleTermType= ruleTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:848:2: iv_ruleTermType= ruleTermType EOF
            {
             newCompositeNode(grammarAccess.getTermTypeRule()); 
            pushFollow(FOLLOW_ruleTermType_in_entryRuleTermType1557);
            iv_ruleTermType=ruleTermType();

            state._fsp--;

             current =iv_ruleTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermType1567); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:855:1: ruleTermType returns [EObject current=null] : ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) ;
    public final EObject ruleTermType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:858:28: ( ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:859:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:859:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:860:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:860:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:861:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:861:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case 30:
                {
                alt22=2;
                }
                break;
            case 31:
                {
                alt22=3;
                }
                break;
            case 32:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:862:3: lv_type_0_1= 'Stakeholder'
                    {
                    lv_type_0_1=(Token)match(input,29,FOLLOW_29_in_ruleTermType1611); 

                            newLeafNode(lv_type_0_1, grammarAccess.getTermTypeAccess().getTypeStakeholderKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:874:8: lv_type_0_2= 'Entity'
                    {
                    lv_type_0_2=(Token)match(input,30,FOLLOW_30_in_ruleTermType1640); 

                            newLeafNode(lv_type_0_2, grammarAccess.getTermTypeAccess().getTypeEntityKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:886:8: lv_type_0_3= 'Architectural'
                    {
                    lv_type_0_3=(Token)match(input,31,FOLLOW_31_in_ruleTermType1669); 

                            newLeafNode(lv_type_0_3, grammarAccess.getTermTypeAccess().getTypeArchitecturalKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:898:8: lv_type_0_4= 'Actor'
                    {
                    lv_type_0_4=(Token)match(input,32,FOLLOW_32_in_ruleTermType1698); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:921:1: entryRuleTermRelation returns [EObject current=null] : iv_ruleTermRelation= ruleTermRelation EOF ;
    public final EObject entryRuleTermRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermRelation = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:922:2: (iv_ruleTermRelation= ruleTermRelation EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:923:2: iv_ruleTermRelation= ruleTermRelation EOF
            {
             newCompositeNode(grammarAccess.getTermRelationRule()); 
            pushFollow(FOLLOW_ruleTermRelation_in_entryRuleTermRelation1749);
            iv_ruleTermRelation=ruleTermRelation();

            state._fsp--;

             current =iv_ruleTermRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermRelation1759); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:930:1: ruleTermRelation returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) ) ;
    public final EObject ruleTermRelation() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refTerm_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:933:28: ( ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:934:1: ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:934:1: ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:934:2: ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:934:2: ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:935:1: ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:935:1: ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:936:1: (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:936:1: (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:937:3: lv_type_0_1= 'Antonym'
                    {
                    lv_type_0_1=(Token)match(input,33,FOLLOW_33_in_ruleTermRelation1804); 

                            newLeafNode(lv_type_0_1, grammarAccess.getTermRelationAccess().getTypeAntonymKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:949:8: lv_type_0_2= 'Hypernym'
                    {
                    lv_type_0_2=(Token)match(input,34,FOLLOW_34_in_ruleTermRelation1833); 

                            newLeafNode(lv_type_0_2, grammarAccess.getTermRelationAccess().getTypeHypernymKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:961:8: lv_type_0_3= 'Synonym'
                    {
                    lv_type_0_3=(Token)match(input,35,FOLLOW_35_in_ruleTermRelation1862); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:976:2: ( (lv_refTerm_1_0= ruleRefTerm ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:977:1: (lv_refTerm_1_0= ruleRefTerm )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:977:1: (lv_refTerm_1_0= ruleRefTerm )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:978:3: lv_refTerm_1_0= ruleRefTerm
            {
             
            	        newCompositeNode(grammarAccess.getTermRelationAccess().getRefTermRefTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefTerm_in_ruleTermRelation1899);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1002:1: entryRuleRefTerm returns [EObject current=null] : iv_ruleRefTerm= ruleRefTerm EOF ;
    public final EObject entryRuleRefTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTerm = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1003:2: (iv_ruleRefTerm= ruleRefTerm EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1004:2: iv_ruleRefTerm= ruleRefTerm EOF
            {
             newCompositeNode(grammarAccess.getRefTermRule()); 
            pushFollow(FOLLOW_ruleRefTerm_in_entryRuleRefTerm1935);
            iv_ruleRefTerm=ruleRefTerm();

            state._fsp--;

             current =iv_ruleRefTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTerm1945); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1011:1: ruleRefTerm returns [EObject current=null] : ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleRefTerm() throws RecognitionException {
        EObject current = null;

        Token lv_refTerm_0_0=null;
        Token otherlv_1=null;
        Token lv_refs_2_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1014:28: ( ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1015:1: ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1015:1: ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1015:2: ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1015:2: ( (lv_refTerm_0_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1016:1: (lv_refTerm_0_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1016:1: (lv_refTerm_0_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1017:3: lv_refTerm_0_0= RULE_STRING
            {
            lv_refTerm_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefTerm1987); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1033:2: (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1033:4: otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefTerm2005); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefTermAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1037:1: ( (lv_refs_2_0= RULE_STRING ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1038:1: (lv_refs_2_0= RULE_STRING )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1038:1: (lv_refs_2_0= RULE_STRING )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1039:3: lv_refs_2_0= RULE_STRING
            	    {
            	    lv_refs_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefTerm2022); 

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
            	    break loop24;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1063:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1064:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1065:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder2065);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder2075); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1072:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
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
        Token otherlv_7=null;
        Token lv_category_8_1=null;
        Token lv_category_8_2=null;
        Token lv_category_8_3=null;
        Token lv_category_8_4=null;
        Token lv_category_8_5=null;
        Token lv_category_8_6=null;
        Token lv_category_8_7=null;
        Token lv_category_8_8=null;
        Token lv_category_8_9=null;
        Token lv_category_8_10=null;
        Token lv_category_8_11=null;
        Token lv_category_8_12=null;
        Token lv_category_8_13=null;
        Token lv_category_8_14=null;
        Token lv_category_8_15=null;
        Token lv_category_8_16=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1075:28: ( (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1076:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1076:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1076:3: otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStakeholder2112); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1080:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1081:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1081:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1082:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder2129); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStakeholder2146); 

                	newLeafNode(otherlv_2, grammarAccess.getStakeholderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1102:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1102:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStakeholder2159); 

                        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1106:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1107:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1107:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1108:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder2176); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleStakeholder2195); 

                	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getTypeKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1128:1: ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1129:1: ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1129:1: ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1130:1: (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1130:1: (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt26=1;
                }
                break;
            case 37:
                {
                alt26=2;
                }
                break;
            case 38:
                {
                alt26=3;
                }
                break;
            case 39:
                {
                alt26=4;
                }
                break;
            case 40:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1131:3: lv_type_6_1= 'Group.Organization'
                    {
                    lv_type_6_1=(Token)match(input,36,FOLLOW_36_in_ruleStakeholder2215); 

                            newLeafNode(lv_type_6_1, grammarAccess.getStakeholderAccess().getTypeGroupOrganizationKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1143:8: lv_type_6_2= 'Group.BusinessUnit'
                    {
                    lv_type_6_2=(Token)match(input,37,FOLLOW_37_in_ruleStakeholder2244); 

                            newLeafNode(lv_type_6_2, grammarAccess.getStakeholderAccess().getTypeGroupBusinessUnitKeyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1155:8: lv_type_6_3= 'Group.Team'
                    {
                    lv_type_6_3=(Token)match(input,38,FOLLOW_38_in_ruleStakeholder2273); 

                            newLeafNode(lv_type_6_3, grammarAccess.getStakeholderAccess().getTypeGroupTeamKeyword_5_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1167:8: lv_type_6_4= 'Individual.Person'
                    {
                    lv_type_6_4=(Token)match(input,39,FOLLOW_39_in_ruleStakeholder2302); 

                            newLeafNode(lv_type_6_4, grammarAccess.getStakeholderAccess().getTypeIndividualPersonKeyword_5_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1179:8: lv_type_6_5= 'Individual.ExternalSystem'
                    {
                    lv_type_6_5=(Token)match(input,40,FOLLOW_40_in_ruleStakeholder2331); 

                            newLeafNode(lv_type_6_5, grammarAccess.getStakeholderAccess().getTypeIndividualExternalSystemKeyword_5_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleStakeholder2359); 

                	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getCategoryKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1198:1: ( ( (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1199:1: ( (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1199:1: ( (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1200:1: (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1200:1: (lv_category_8_1= 'Business' | lv_category_8_2= 'Business.Customer' | lv_category_8_3= 'Business.Customer.Sponsor' | lv_category_8_4= 'Business.Customer.Champion' | lv_category_8_5= 'Business.User.Direct' | lv_category_8_6= 'Business.User.Indirect' | lv_category_8_7= 'Business.Advisor.DomainExpert' | lv_category_8_8= 'Business.Advisor.Trainer' | lv_category_8_9= 'Business.Advisor.RegulatorAgent' | lv_category_8_10= 'Business.System' | lv_category_8_11= 'Technical' | lv_category_8_12= 'Technical.BusinessAnalyst' | lv_category_8_13= 'Technical.Requirements.Engineer' | lv_category_8_14= 'Technical.Software.Architect' | lv_category_8_15= 'Technical.Software.Designer' | lv_category_8_16= 'Technical.Software.Tester' )
            int alt27=16;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt27=1;
                }
                break;
            case 43:
                {
                alt27=2;
                }
                break;
            case 44:
                {
                alt27=3;
                }
                break;
            case 45:
                {
                alt27=4;
                }
                break;
            case 46:
                {
                alt27=5;
                }
                break;
            case 47:
                {
                alt27=6;
                }
                break;
            case 48:
                {
                alt27=7;
                }
                break;
            case 49:
                {
                alt27=8;
                }
                break;
            case 50:
                {
                alt27=9;
                }
                break;
            case 51:
                {
                alt27=10;
                }
                break;
            case 52:
                {
                alt27=11;
                }
                break;
            case 53:
                {
                alt27=12;
                }
                break;
            case 54:
                {
                alt27=13;
                }
                break;
            case 55:
                {
                alt27=14;
                }
                break;
            case 56:
                {
                alt27=15;
                }
                break;
            case 57:
                {
                alt27=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1201:3: lv_category_8_1= 'Business'
                    {
                    lv_category_8_1=(Token)match(input,42,FOLLOW_42_in_ruleStakeholder2379); 

                            newLeafNode(lv_category_8_1, grammarAccess.getStakeholderAccess().getCategoryBusinessKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1213:8: lv_category_8_2= 'Business.Customer'
                    {
                    lv_category_8_2=(Token)match(input,43,FOLLOW_43_in_ruleStakeholder2408); 

                            newLeafNode(lv_category_8_2, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1225:8: lv_category_8_3= 'Business.Customer.Sponsor'
                    {
                    lv_category_8_3=(Token)match(input,44,FOLLOW_44_in_ruleStakeholder2437); 

                            newLeafNode(lv_category_8_3, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerSponsorKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1237:8: lv_category_8_4= 'Business.Customer.Champion'
                    {
                    lv_category_8_4=(Token)match(input,45,FOLLOW_45_in_ruleStakeholder2466); 

                            newLeafNode(lv_category_8_4, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerChampionKeyword_7_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1249:8: lv_category_8_5= 'Business.User.Direct'
                    {
                    lv_category_8_5=(Token)match(input,46,FOLLOW_46_in_ruleStakeholder2495); 

                            newLeafNode(lv_category_8_5, grammarAccess.getStakeholderAccess().getCategoryBusinessUserDirectKeyword_7_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1261:8: lv_category_8_6= 'Business.User.Indirect'
                    {
                    lv_category_8_6=(Token)match(input,47,FOLLOW_47_in_ruleStakeholder2524); 

                            newLeafNode(lv_category_8_6, grammarAccess.getStakeholderAccess().getCategoryBusinessUserIndirectKeyword_7_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1273:8: lv_category_8_7= 'Business.Advisor.DomainExpert'
                    {
                    lv_category_8_7=(Token)match(input,48,FOLLOW_48_in_ruleStakeholder2553); 

                            newLeafNode(lv_category_8_7, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorDomainExpertKeyword_7_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1285:8: lv_category_8_8= 'Business.Advisor.Trainer'
                    {
                    lv_category_8_8=(Token)match(input,49,FOLLOW_49_in_ruleStakeholder2582); 

                            newLeafNode(lv_category_8_8, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorTrainerKeyword_7_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1297:8: lv_category_8_9= 'Business.Advisor.RegulatorAgent'
                    {
                    lv_category_8_9=(Token)match(input,50,FOLLOW_50_in_ruleStakeholder2611); 

                            newLeafNode(lv_category_8_9, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorRegulatorAgentKeyword_7_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1309:8: lv_category_8_10= 'Business.System'
                    {
                    lv_category_8_10=(Token)match(input,51,FOLLOW_51_in_ruleStakeholder2640); 

                            newLeafNode(lv_category_8_10, grammarAccess.getStakeholderAccess().getCategoryBusinessSystemKeyword_7_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1321:8: lv_category_8_11= 'Technical'
                    {
                    lv_category_8_11=(Token)match(input,52,FOLLOW_52_in_ruleStakeholder2669); 

                            newLeafNode(lv_category_8_11, grammarAccess.getStakeholderAccess().getCategoryTechnicalKeyword_7_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1333:8: lv_category_8_12= 'Technical.BusinessAnalyst'
                    {
                    lv_category_8_12=(Token)match(input,53,FOLLOW_53_in_ruleStakeholder2698); 

                            newLeafNode(lv_category_8_12, grammarAccess.getStakeholderAccess().getCategoryTechnicalBusinessAnalystKeyword_7_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_12, null);
                    	    

                    }
                    break;
                case 13 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1345:8: lv_category_8_13= 'Technical.Requirements.Engineer'
                    {
                    lv_category_8_13=(Token)match(input,54,FOLLOW_54_in_ruleStakeholder2727); 

                            newLeafNode(lv_category_8_13, grammarAccess.getStakeholderAccess().getCategoryTechnicalRequirementsEngineerKeyword_7_0_12());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_13, null);
                    	    

                    }
                    break;
                case 14 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1357:8: lv_category_8_14= 'Technical.Software.Architect'
                    {
                    lv_category_8_14=(Token)match(input,55,FOLLOW_55_in_ruleStakeholder2756); 

                            newLeafNode(lv_category_8_14, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareArchitectKeyword_7_0_13());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_14, null);
                    	    

                    }
                    break;
                case 15 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1369:8: lv_category_8_15= 'Technical.Software.Designer'
                    {
                    lv_category_8_15=(Token)match(input,56,FOLLOW_56_in_ruleStakeholder2785); 

                            newLeafNode(lv_category_8_15, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareDesignerKeyword_7_0_14());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_15, null);
                    	    

                    }
                    break;
                case 16 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1381:8: lv_category_8_16= 'Technical.Software.Tester'
                    {
                    lv_category_8_16=(Token)match(input,57,FOLLOW_57_in_ruleStakeholder2814); 

                            newLeafNode(lv_category_8_16, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareTesterKeyword_7_0_15());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_16, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1396:2: (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1396:4: otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleStakeholder2843); 

                        	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getDescriptionKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1400:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1401:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1401:1: (lv_description_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1402:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder2860); 

                    			newLeafNode(lv_description_10_0, grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1418:4: (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==18) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1418:6: otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleStakeholder2880); 

                        	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getPartOfKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1422:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1423:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1423:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1424:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder2900); 

                    		newLeafNode(otherlv_12, grammarAccess.getStakeholderAccess().getPartOfStakeholderCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleStakeholder2914); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1447:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1448:2: (iv_ruleGoal= ruleGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1449:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2950);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2960); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1456:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( ( (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' ) ;
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
        Token lv_priority_10_1=null;
        Token lv_priority_10_2=null;
        Token lv_priority_10_3=null;
        Token lv_priority_10_4=null;
        Token lv_priority_10_5=null;
        Token otherlv_13=null;
        EObject lv_dependsOn_11_0 = null;

        EObject lv_composedBy_12_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1459:28: ( (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( ( (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1460:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( ( (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1460:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( ( (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1460:3: otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( ( (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleGoal2997); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1464:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1465:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1465:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1466:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3014); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoal3031); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1486:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1486:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleGoal3044); 

                        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1490:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1491:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1491:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1492:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3061); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleGoal3080); 

                	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1512:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1513:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1513:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1514:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3097); 

            			newLeafNode(lv_description_6_0, grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1530:2: (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1530:4: otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleGoal3115); 

                        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getStakeholderKeyword_6_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1534:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1535:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1535:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1536:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3135); 

                    		newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getStakeholderStakeholderCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,59,FOLLOW_59_in_ruleGoal3149); 

                	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getPriorityKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1551:1: ( ( (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1552:1: ( (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1552:1: ( (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1553:1: (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1553:1: (lv_priority_10_1= 'VeryLow' | lv_priority_10_2= 'Low' | lv_priority_10_3= 'Medium' | lv_priority_10_4= 'High' | lv_priority_10_5= 'VeryHigh' )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt32=1;
                }
                break;
            case 61:
                {
                alt32=2;
                }
                break;
            case 62:
                {
                alt32=3;
                }
                break;
            case 63:
                {
                alt32=4;
                }
                break;
            case 64:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1554:3: lv_priority_10_1= 'VeryLow'
                    {
                    lv_priority_10_1=(Token)match(input,60,FOLLOW_60_in_ruleGoal3169); 

                            newLeafNode(lv_priority_10_1, grammarAccess.getGoalAccess().getPriorityVeryLowKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1566:8: lv_priority_10_2= 'Low'
                    {
                    lv_priority_10_2=(Token)match(input,61,FOLLOW_61_in_ruleGoal3198); 

                            newLeafNode(lv_priority_10_2, grammarAccess.getGoalAccess().getPriorityLowKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1578:8: lv_priority_10_3= 'Medium'
                    {
                    lv_priority_10_3=(Token)match(input,62,FOLLOW_62_in_ruleGoal3227); 

                            newLeafNode(lv_priority_10_3, grammarAccess.getGoalAccess().getPriorityMediumKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1590:8: lv_priority_10_4= 'High'
                    {
                    lv_priority_10_4=(Token)match(input,63,FOLLOW_63_in_ruleGoal3256); 

                            newLeafNode(lv_priority_10_4, grammarAccess.getGoalAccess().getPriorityHighKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1602:8: lv_priority_10_5= 'VeryHigh'
                    {
                    lv_priority_10_5=(Token)match(input,64,FOLLOW_64_in_ruleGoal3285); 

                            newLeafNode(lv_priority_10_5, grammarAccess.getGoalAccess().getPriorityVeryHighKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_10_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1617:2: ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=65 && LA33_0<=69)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1618:1: (lv_dependsOn_11_0= ruleDependsOnGoal )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1618:1: (lv_dependsOn_11_0= ruleDependsOnGoal )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1619:3: lv_dependsOn_11_0= ruleDependsOnGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDependsOnDependsOnGoalParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnGoal_in_ruleGoal3322);
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
            	    break loop33;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1635:3: ( (lv_composedBy_12_0= ruleComposedBy ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==70) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1636:1: (lv_composedBy_12_0= ruleComposedBy )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1636:1: (lv_composedBy_12_0= ruleComposedBy )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1637:3: lv_composedBy_12_0= ruleComposedBy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getComposedByComposedByParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComposedBy_in_ruleGoal3344);
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
            	    break loop34;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleGoal3357); 

                	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_11());
                

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


    // $ANTLR start "entryRuleDependsOnGoal"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1665:1: entryRuleDependsOnGoal returns [EObject current=null] : iv_ruleDependsOnGoal= ruleDependsOnGoal EOF ;
    public final EObject entryRuleDependsOnGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1666:2: (iv_ruleDependsOnGoal= ruleDependsOnGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1667:2: iv_ruleDependsOnGoal= ruleDependsOnGoal EOF
            {
             newCompositeNode(grammarAccess.getDependsOnGoalRule()); 
            pushFollow(FOLLOW_ruleDependsOnGoal_in_entryRuleDependsOnGoal3393);
            iv_ruleDependsOnGoal=ruleDependsOnGoal();

            state._fsp--;

             current =iv_ruleDependsOnGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnGoal3403); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1674:1: ruleDependsOnGoal returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1677:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1678:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1678:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1678:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1678:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1679:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1679:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1680:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1680:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt35=1;
                }
                break;
            case 66:
                {
                alt35=2;
                }
                break;
            case 67:
                {
                alt35=3;
                }
                break;
            case 68:
                {
                alt35=4;
                }
                break;
            case 69:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1681:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,65,FOLLOW_65_in_ruleDependsOnGoal3448); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnGoalAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1693:8: lv_type_0_2= 'Supports'
                    {
                    lv_type_0_2=(Token)match(input,66,FOLLOW_66_in_ruleDependsOnGoal3477); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnGoalAccess().getTypeSupportsKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1705:8: lv_type_0_3= 'Obstructs'
                    {
                    lv_type_0_3=(Token)match(input,67,FOLLOW_67_in_ruleDependsOnGoal3506); 

                            newLeafNode(lv_type_0_3, grammarAccess.getDependsOnGoalAccess().getTypeObstructsKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1717:8: lv_type_0_4= 'Conflicts'
                    {
                    lv_type_0_4=(Token)match(input,68,FOLLOW_68_in_ruleDependsOnGoal3535); 

                            newLeafNode(lv_type_0_4, grammarAccess.getDependsOnGoalAccess().getTypeConflictsKeyword_0_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1729:8: lv_type_0_5= 'Identical'
                    {
                    lv_type_0_5=(Token)match(input,69,FOLLOW_69_in_ruleDependsOnGoal3564); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1744:2: ( (lv_refGoal_1_0= ruleRefGoal ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1745:1: (lv_refGoal_1_0= ruleRefGoal )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1745:1: (lv_refGoal_1_0= ruleRefGoal )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1746:3: lv_refGoal_1_0= ruleRefGoal
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnGoalAccess().getRefGoalRefGoalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefGoal_in_ruleDependsOnGoal3601);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1770:1: entryRuleComposedBy returns [EObject current=null] : iv_ruleComposedBy= ruleComposedBy EOF ;
    public final EObject entryRuleComposedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposedBy = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1771:2: (iv_ruleComposedBy= ruleComposedBy EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1772:2: iv_ruleComposedBy= ruleComposedBy EOF
            {
             newCompositeNode(grammarAccess.getComposedByRule()); 
            pushFollow(FOLLOW_ruleComposedBy_in_entryRuleComposedBy3637);
            iv_ruleComposedBy=ruleComposedBy();

            state._fsp--;

             current =iv_ruleComposedBy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComposedBy3647); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1779:1: ruleComposedBy returns [EObject current=null] : (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) ) ;
    public final EObject ruleComposedBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        EObject lv_refGoal_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1782:28: ( (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1783:1: (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1783:1: (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1783:3: otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleComposedBy3684); 

                	newLeafNode(otherlv_0, grammarAccess.getComposedByAccess().getComposedByKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1787:1: ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1788:1: ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1788:1: ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1789:1: (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1789:1: (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==71) ) {
                alt36=1;
            }
            else if ( (LA36_0==72) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1790:3: lv_type_1_1= 'Logic-And'
                    {
                    lv_type_1_1=(Token)match(input,71,FOLLOW_71_in_ruleComposedBy3704); 

                            newLeafNode(lv_type_1_1, grammarAccess.getComposedByAccess().getTypeLogicAndKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComposedByRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1802:8: lv_type_1_2= 'Logic-Or'
                    {
                    lv_type_1_2=(Token)match(input,72,FOLLOW_72_in_ruleComposedBy3733); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1817:2: ( (lv_refGoal_2_0= ruleRefGoal ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1818:1: (lv_refGoal_2_0= ruleRefGoal )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1818:1: (lv_refGoal_2_0= ruleRefGoal )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1819:3: lv_refGoal_2_0= ruleRefGoal
            {
             
            	        newCompositeNode(grammarAccess.getComposedByAccess().getRefGoalRefGoalParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRefGoal_in_ruleComposedBy3770);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1843:1: entryRuleRefGoal returns [EObject current=null] : iv_ruleRefGoal= ruleRefGoal EOF ;
    public final EObject entryRuleRefGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1844:2: (iv_ruleRefGoal= ruleRefGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1845:2: iv_ruleRefGoal= ruleRefGoal EOF
            {
             newCompositeNode(grammarAccess.getRefGoalRule()); 
            pushFollow(FOLLOW_ruleRefGoal_in_entryRuleRefGoal3806);
            iv_ruleRefGoal=ruleRefGoal();

            state._fsp--;

             current =iv_ruleRefGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGoal3816); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1852:1: ruleRefGoal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1855:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1856:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1856:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1856:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1856:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1857:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1857:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1858:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefGoalRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal3861); 

            		newLeafNode(otherlv_0, grammarAccess.getRefGoalAccess().getRefGoalGoalCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1869:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==19) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1869:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefGoal3874); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefGoalAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1873:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1874:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1874:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1875:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefGoalRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal3894); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefGoalAccess().getRefsGoalCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1894:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1895:2: (iv_ruleEntity= ruleEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1896:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity3932);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity3942); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1903:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_foreignKey_10_0= ruleForeignKey ) )? otherlv_11= '}' ) ;
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
        Token otherlv_11=null;
        EObject lv_attributes_9_0 = null;

        EObject lv_foreignKey_10_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1906:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_foreignKey_10_0= ruleForeignKey ) )? otherlv_11= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1907:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_foreignKey_10_0= ruleForeignKey ) )? otherlv_11= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1907:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_foreignKey_10_0= ruleForeignKey ) )? otherlv_11= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1907:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_foreignKey_10_0= ruleForeignKey ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleEntity3979); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1911:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1912:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1912:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1913:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3996); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity4013); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1933:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1933:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEntity4026); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1937:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1938:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1938:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1939:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity4043); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntity4062); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1959:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1960:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1960:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1961:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity4079); 

            			newLeafNode(lv_description_6_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1977:2: (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1977:4: otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleEntity4097); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getTypeKeyword_6_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1981:1: ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1982:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1982:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1983:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1983:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Secondary' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==73) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==74) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1984:3: lv_type_8_1= 'Main'
                            {
                            lv_type_8_1=(Token)match(input,73,FOLLOW_73_in_ruleEntity4117); 

                                    newLeafNode(lv_type_8_1, grammarAccess.getEntityAccess().getTypeMainKeyword_6_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEntityRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_8_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1996:8: lv_type_8_2= 'Secondary'
                            {
                            lv_type_8_2=(Token)match(input,74,FOLLOW_74_in_ruleEntity4146); 

                                    newLeafNode(lv_type_8_2, grammarAccess.getEntityAccess().getTypeSecondaryKeyword_6_1_0_1());
                                

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2011:4: ( (lv_attributes_9_0= ruleAttribute ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==75) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2012:1: (lv_attributes_9_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2012:1: (lv_attributes_9_0= ruleAttribute )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2013:3: lv_attributes_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity4185);
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
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2029:3: ( (lv_foreignKey_10_0= ruleForeignKey ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==99) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2030:1: (lv_foreignKey_10_0= ruleForeignKey )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2030:1: (lv_foreignKey_10_0= ruleForeignKey )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2031:3: lv_foreignKey_10_0= ruleForeignKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getForeignKeyForeignKeyParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForeignKey_in_ruleEntity4207);
                    lv_foreignKey_10_0=ruleForeignKey();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		set(
                           			current, 
                           			"foreignKey",
                            		lv_foreignKey_10_0, 
                            		"ForeignKey");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleEntity4220); 

                	newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2059:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2060:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2061:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4256);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4266); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2068:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) ( (lv_field_9_0= ruleField ) ) otherlv_10= '}' ) ;
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
        Token otherlv_10=null;
        EObject lv_field_9_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2071:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) ( (lv_field_9_0= ruleField ) ) otherlv_10= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2072:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) ( (lv_field_9_0= ruleField ) ) otherlv_10= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2072:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) ( (lv_field_9_0= ruleField ) ) otherlv_10= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2072:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) ( (lv_field_9_0= ruleField ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleAttribute4303); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2076:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2077:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2077:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2078:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4320); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute4337); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2098:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2098:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAttribute4350); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2102:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2103:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2103:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2104:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4367); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAttribute4386); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2124:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2125:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2125:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2126:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4403); 

            			newLeafNode(lv_description_6_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleAttribute4420); 

                	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2146:1: ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2147:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2147:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2148:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2148:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            int alt44=12;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt44=1;
                }
                break;
            case 77:
                {
                alt44=2;
                }
                break;
            case 78:
                {
                alt44=3;
                }
                break;
            case 79:
                {
                alt44=4;
                }
                break;
            case 80:
                {
                alt44=5;
                }
                break;
            case 81:
                {
                alt44=6;
                }
                break;
            case 82:
                {
                alt44=7;
                }
                break;
            case 83:
                {
                alt44=8;
                }
                break;
            case 84:
                {
                alt44=9;
                }
                break;
            case 85:
                {
                alt44=10;
                }
                break;
            case 86:
                {
                alt44=11;
                }
                break;
            case 87:
                {
                alt44=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2149:3: lv_type_8_1= 'Boolean'
                    {
                    lv_type_8_1=(Token)match(input,76,FOLLOW_76_in_ruleAttribute4440); 

                            newLeafNode(lv_type_8_1, grammarAccess.getAttributeAccess().getTypeBooleanKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2161:8: lv_type_8_2= 'Integer'
                    {
                    lv_type_8_2=(Token)match(input,77,FOLLOW_77_in_ruleAttribute4469); 

                            newLeafNode(lv_type_8_2, grammarAccess.getAttributeAccess().getTypeIntegerKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2173:8: lv_type_8_3= 'Decimal'
                    {
                    lv_type_8_3=(Token)match(input,78,FOLLOW_78_in_ruleAttribute4498); 

                            newLeafNode(lv_type_8_3, grammarAccess.getAttributeAccess().getTypeDecimalKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2185:8: lv_type_8_4= 'Currency'
                    {
                    lv_type_8_4=(Token)match(input,79,FOLLOW_79_in_ruleAttribute4527); 

                            newLeafNode(lv_type_8_4, grammarAccess.getAttributeAccess().getTypeCurrencyKeyword_7_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2197:8: lv_type_8_5= 'Date'
                    {
                    lv_type_8_5=(Token)match(input,80,FOLLOW_80_in_ruleAttribute4556); 

                            newLeafNode(lv_type_8_5, grammarAccess.getAttributeAccess().getTypeDateKeyword_7_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2209:8: lv_type_8_6= 'Time'
                    {
                    lv_type_8_6=(Token)match(input,81,FOLLOW_81_in_ruleAttribute4585); 

                            newLeafNode(lv_type_8_6, grammarAccess.getAttributeAccess().getTypeTimeKeyword_7_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2221:8: lv_type_8_7= 'Datetime'
                    {
                    lv_type_8_7=(Token)match(input,82,FOLLOW_82_in_ruleAttribute4614); 

                            newLeafNode(lv_type_8_7, grammarAccess.getAttributeAccess().getTypeDatetimeKeyword_7_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2233:8: lv_type_8_8= 'Enumeration'
                    {
                    lv_type_8_8=(Token)match(input,83,FOLLOW_83_in_ruleAttribute4643); 

                            newLeafNode(lv_type_8_8, grammarAccess.getAttributeAccess().getTypeEnumerationKeyword_7_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2245:8: lv_type_8_9= 'Text'
                    {
                    lv_type_8_9=(Token)match(input,84,FOLLOW_84_in_ruleAttribute4672); 

                            newLeafNode(lv_type_8_9, grammarAccess.getAttributeAccess().getTypeTextKeyword_7_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2257:8: lv_type_8_10= 'Regex'
                    {
                    lv_type_8_10=(Token)match(input,85,FOLLOW_85_in_ruleAttribute4701); 

                            newLeafNode(lv_type_8_10, grammarAccess.getAttributeAccess().getTypeRegexKeyword_7_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2269:8: lv_type_8_11= 'URL'
                    {
                    lv_type_8_11=(Token)match(input,86,FOLLOW_86_in_ruleAttribute4730); 

                            newLeafNode(lv_type_8_11, grammarAccess.getAttributeAccess().getTypeURLKeyword_7_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2281:8: lv_type_8_12= 'Image'
                    {
                    lv_type_8_12=(Token)match(input,87,FOLLOW_87_in_ruleAttribute4759); 

                            newLeafNode(lv_type_8_12, grammarAccess.getAttributeAccess().getTypeImageKeyword_7_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_12, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2296:2: ( (lv_field_9_0= ruleField ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2297:1: (lv_field_9_0= ruleField )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2297:1: (lv_field_9_0= ruleField )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2298:3: lv_field_9_0= ruleField
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getFieldFieldParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleField_in_ruleAttribute4796);
            lv_field_9_0=ruleField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"field",
                    		lv_field_9_0, 
                    		"Field");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleAttribute4808); 

                	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleField"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2326:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2327:2: (iv_ruleField= ruleField EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2328:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField4844);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField4854); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2335:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) (otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) )? (otherlv_8= 'NotNull' )? (otherlv_9= 'Unique' )? (otherlv_10= 'Check' ( (lv_value_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_defaultValue_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_value_11_0=null;
        Token otherlv_12=null;
        EObject lv_multiplicity_5_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2338:28: ( (otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) (otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) )? (otherlv_8= 'NotNull' )? (otherlv_9= 'Unique' )? (otherlv_10= 'Check' ( (lv_value_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2339:1: (otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) (otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) )? (otherlv_8= 'NotNull' )? (otherlv_9= 'Unique' )? (otherlv_10= 'Check' ( (lv_value_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2339:1: (otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) (otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) )? (otherlv_8= 'NotNull' )? (otherlv_9= 'Unique' )? (otherlv_10= 'Check' ( (lv_value_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2339:3: otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( (lv_multiplicity_5_0= ruleMultiplicity ) ) (otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) )? (otherlv_8= 'NotNull' )? (otherlv_9= 'Unique' )? (otherlv_10= 'Check' ( (lv_value_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleField4891); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleField4903); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,89,FOLLOW_89_in_ruleField4915); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getSizeKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2351:1: ( (lv_size_3_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2352:1: (lv_size_3_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2352:1: (lv_size_3_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2353:3: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField4932); 

            			newLeafNode(lv_size_3_0, grammarAccess.getFieldAccess().getSizeINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"size",
                    		lv_size_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,90,FOLLOW_90_in_ruleField4949); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getMultiplicityKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2373:1: ( (lv_multiplicity_5_0= ruleMultiplicity ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2374:1: (lv_multiplicity_5_0= ruleMultiplicity )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2374:1: (lv_multiplicity_5_0= ruleMultiplicity )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2375:3: lv_multiplicity_5_0= ruleMultiplicity
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getMultiplicityMultiplicityParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleField4970);
            lv_multiplicity_5_0=ruleMultiplicity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"multiplicity",
                    		lv_multiplicity_5_0, 
                    		"Multiplicity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2391:2: (otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==91) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2391:4: otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,91,FOLLOW_91_in_ruleField4983); 

                        	newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getDefaultValueKeyword_6_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2395:1: ( (lv_defaultValue_7_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2396:1: (lv_defaultValue_7_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2396:1: (lv_defaultValue_7_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2397:3: lv_defaultValue_7_0= RULE_STRING
                    {
                    lv_defaultValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField5000); 

                    			newLeafNode(lv_defaultValue_7_0, grammarAccess.getFieldAccess().getDefaultValueSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2413:4: (otherlv_8= 'NotNull' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==92) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2413:6: otherlv_8= 'NotNull'
                    {
                    otherlv_8=(Token)match(input,92,FOLLOW_92_in_ruleField5020); 

                        	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getNotNullKeyword_7());
                        

                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2417:3: (otherlv_9= 'Unique' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==93) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2417:5: otherlv_9= 'Unique'
                    {
                    otherlv_9=(Token)match(input,93,FOLLOW_93_in_ruleField5035); 

                        	newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getUniqueKeyword_8());
                        

                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2421:3: (otherlv_10= 'Check' ( (lv_value_11_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==94) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2421:5: otherlv_10= 'Check' ( (lv_value_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,94,FOLLOW_94_in_ruleField5050); 

                        	newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getCheckKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2425:1: ( (lv_value_11_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2426:1: (lv_value_11_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2426:1: (lv_value_11_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2427:3: lv_value_11_0= RULE_STRING
                    {
                    lv_value_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField5067); 

                    			newLeafNode(lv_value_11_0, grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleField5086); 

                	newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMultiplicity"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2455:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2456:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2457:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity5122);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity5132); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2464:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2467:28: ( ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2468:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2468:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2469:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2469:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2470:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2470:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            int alt49=5;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt49=1;
                }
                break;
            case 96:
                {
                alt49=2;
                }
                break;
            case 97:
                {
                alt49=3;
                }
                break;
            case 98:
                {
                alt49=4;
                }
                break;
            case RULE_STRING:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2471:3: lv_value_0_1= '\"0\"'
                    {
                    lv_value_0_1=(Token)match(input,95,FOLLOW_95_in_ruleMultiplicity5176); 

                            newLeafNode(lv_value_0_1, grammarAccess.getMultiplicityAccess().getValue0Keyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2483:8: lv_value_0_2= '\"1\"'
                    {
                    lv_value_0_2=(Token)match(input,96,FOLLOW_96_in_ruleMultiplicity5205); 

                            newLeafNode(lv_value_0_2, grammarAccess.getMultiplicityAccess().getValue1Keyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2495:8: lv_value_0_3= '\"0..1\"'
                    {
                    lv_value_0_3=(Token)match(input,97,FOLLOW_97_in_ruleMultiplicity5234); 

                            newLeafNode(lv_value_0_3, grammarAccess.getMultiplicityAccess().getValue01Keyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2507:8: lv_value_0_4= '\"*\"'
                    {
                    lv_value_0_4=(Token)match(input,98,FOLLOW_98_in_ruleMultiplicity5263); 

                            newLeafNode(lv_value_0_4, grammarAccess.getMultiplicityAccess().getValueQuotationMarkAsteriskQuotationMarkKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2519:8: lv_value_0_5= RULE_STRING
                    {
                    lv_value_0_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiplicity5291); 

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


    // $ANTLR start "entryRuleForeignKey"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2545:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2546:2: (iv_ruleForeignKey= ruleForeignKey EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2547:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_ruleForeignKey_in_entryRuleForeignKey5334);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignKey5344); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2554:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2557:28: ( (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2558:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2558:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2558:3: otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            {
            otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleForeignKey5381); 

                	newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getForeignKeyKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2562:1: ( (otherlv_1= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2563:1: (otherlv_1= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2563:1: (otherlv_1= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2564:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForeignKeyRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeignKey5401); 

            		newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getEntityEntityCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,100,FOLLOW_100_in_ruleForeignKey5413); 

                	newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2579:1: ( (lv_refTo_3_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2580:1: (lv_refTo_3_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2580:1: (lv_refTo_3_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2581:3: lv_refTo_3_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getRefToRefAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_ruleForeignKey5434);
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

            otherlv_4=(Token)match(input,101,FOLLOW_101_in_ruleForeignKey5446); 

                	newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,90,FOLLOW_90_in_ruleForeignKey5458); 

                	newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getMultiplicityKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2605:1: ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2606:1: (lv_multiplicity_6_0= ruleMultiplicity )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2606:1: (lv_multiplicity_6_0= ruleMultiplicity )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2607:3: lv_multiplicity_6_0= ruleMultiplicity
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getMultiplicityMultiplicityParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleForeignKey5479);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2631:1: entryRuleRefAttribute returns [EObject current=null] : iv_ruleRefAttribute= ruleRefAttribute EOF ;
    public final EObject entryRuleRefAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2632:2: (iv_ruleRefAttribute= ruleRefAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2633:2: iv_ruleRefAttribute= ruleRefAttribute EOF
            {
             newCompositeNode(grammarAccess.getRefAttributeRule()); 
            pushFollow(FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute5515);
            iv_ruleRefAttribute=ruleRefAttribute();

            state._fsp--;

             current =iv_ruleRefAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefAttribute5525); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2640:1: ruleRefAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2643:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2644:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2644:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2644:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2644:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2645:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2645:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2646:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute5570); 

            		newLeafNode(otherlv_0, grammarAccess.getRefAttributeAccess().getRefAttrAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2657:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==19) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2657:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefAttribute5583); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefAttributeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2661:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2662:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2662:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2663:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute5603); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefAttributeAccess().getRefsAttributeCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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


    // $ANTLR start "entryRuleActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2682:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2683:2: (iv_ruleActor= ruleActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2684:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor5641);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor5651); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2691:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
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
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2694:28: ( (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2695:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2695:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2695:3: otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleActor5688); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2699:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2700:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2700:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2701:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5705); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActor5722); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2721:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2721:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleActor5735); 

                        	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2725:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2726:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2726:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2727:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor5752); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleActor5771); 

                	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getTypeKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2747:1: ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2748:1: ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2748:1: ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2749:1: (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2749:1: (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt52=1;
                }
                break;
            case 103:
                {
                alt52=2;
                }
                break;
            case 104:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2750:3: lv_type_6_1= 'User'
                    {
                    lv_type_6_1=(Token)match(input,102,FOLLOW_102_in_ruleActor5791); 

                            newLeafNode(lv_type_6_1, grammarAccess.getActorAccess().getTypeUserKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2762:8: lv_type_6_2= 'ExternalSystem'
                    {
                    lv_type_6_2=(Token)match(input,103,FOLLOW_103_in_ruleActor5820); 

                            newLeafNode(lv_type_6_2, grammarAccess.getActorAccess().getTypeExternalSystemKeyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2774:8: lv_type_6_3= 'Timer'
                    {
                    lv_type_6_3=(Token)match(input,104,FOLLOW_104_in_ruleActor5849); 

                            newLeafNode(lv_type_6_3, grammarAccess.getActorAccess().getTypeTimerKeyword_5_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleActor5877); 

                	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getDescriptionKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2793:1: ( (lv_description_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2794:1: (lv_description_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2794:1: (lv_description_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2795:3: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor5894); 

            			newLeafNode(lv_description_8_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_8_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2811:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2811:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleActor5912); 

                        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getStakeholderKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2815:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2816:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2816:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2817:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5932); 

                    		newLeafNode(otherlv_10, grammarAccess.getActorAccess().getStakeholderStakeholderCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2828:4: (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==105) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2828:6: otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,105,FOLLOW_105_in_ruleActor5947); 

                        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getSpecializedFromKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2832:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2833:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2833:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2834:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5967); 

                    		newLeafNode(otherlv_12, grammarAccess.getActorAccess().getActorActorCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleActor5981); 

                	newLeafNode(otherlv_13, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2857:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2858:2: (iv_ruleUseCase= ruleUseCase EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2859:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase6017);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase6027); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2866:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( ( (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' ) ) ) ( (lv_extensionnPoints_11_0= ruleExtensionPoint ) )* (otherlv_12= 'Goals' ( (lv_goals_13_0= ruleRefGoal ) )* )? (otherlv_14= 'FunctionalRequirements' ( (lv_frs_15_0= ruleRefFR ) )* )? otherlv_16= 'ActorInitiates' ( (otherlv_17= RULE_ID ) ) (otherlv_18= 'ActorParticipates' ( (lv_actors_19_0= ruleRefActor ) ) )? (otherlv_20= 'Pre-Conditions' ( (lv_preConditions_21_0= RULE_STRING ) ) )? (otherlv_22= 'Post-Conditions' ( (lv_postConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Include' ( (lv_includes_25_0= ruleRefUC ) )* )? (otherlv_26= 'Extend' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'on' ( (otherlv_29= RULE_ID ) ) )? ( (lv_scenarios_30_0= ruleScenario ) )* otherlv_31= '}' ) ;
    public final EObject ruleUseCase() throws RecognitionException {
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
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token lv_priotity_10_1=null;
        Token lv_priotity_10_2=null;
        Token lv_priotity_10_3=null;
        Token lv_priotity_10_4=null;
        Token lv_priotity_10_5=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_preConditions_21_0=null;
        Token otherlv_22=null;
        Token lv_postConditions_23_0=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_extensionnPoints_11_0 = null;

        EObject lv_goals_13_0 = null;

        EObject lv_frs_15_0 = null;

        EObject lv_actors_19_0 = null;

        EObject lv_includes_25_0 = null;

        EObject lv_scenarios_30_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2869:28: ( (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( ( (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' ) ) ) ( (lv_extensionnPoints_11_0= ruleExtensionPoint ) )* (otherlv_12= 'Goals' ( (lv_goals_13_0= ruleRefGoal ) )* )? (otherlv_14= 'FunctionalRequirements' ( (lv_frs_15_0= ruleRefFR ) )* )? otherlv_16= 'ActorInitiates' ( (otherlv_17= RULE_ID ) ) (otherlv_18= 'ActorParticipates' ( (lv_actors_19_0= ruleRefActor ) ) )? (otherlv_20= 'Pre-Conditions' ( (lv_preConditions_21_0= RULE_STRING ) ) )? (otherlv_22= 'Post-Conditions' ( (lv_postConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Include' ( (lv_includes_25_0= ruleRefUC ) )* )? (otherlv_26= 'Extend' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'on' ( (otherlv_29= RULE_ID ) ) )? ( (lv_scenarios_30_0= ruleScenario ) )* otherlv_31= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2870:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( ( (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' ) ) ) ( (lv_extensionnPoints_11_0= ruleExtensionPoint ) )* (otherlv_12= 'Goals' ( (lv_goals_13_0= ruleRefGoal ) )* )? (otherlv_14= 'FunctionalRequirements' ( (lv_frs_15_0= ruleRefFR ) )* )? otherlv_16= 'ActorInitiates' ( (otherlv_17= RULE_ID ) ) (otherlv_18= 'ActorParticipates' ( (lv_actors_19_0= ruleRefActor ) ) )? (otherlv_20= 'Pre-Conditions' ( (lv_preConditions_21_0= RULE_STRING ) ) )? (otherlv_22= 'Post-Conditions' ( (lv_postConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Include' ( (lv_includes_25_0= ruleRefUC ) )* )? (otherlv_26= 'Extend' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'on' ( (otherlv_29= RULE_ID ) ) )? ( (lv_scenarios_30_0= ruleScenario ) )* otherlv_31= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2870:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( ( (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' ) ) ) ( (lv_extensionnPoints_11_0= ruleExtensionPoint ) )* (otherlv_12= 'Goals' ( (lv_goals_13_0= ruleRefGoal ) )* )? (otherlv_14= 'FunctionalRequirements' ( (lv_frs_15_0= ruleRefFR ) )* )? otherlv_16= 'ActorInitiates' ( (otherlv_17= RULE_ID ) ) (otherlv_18= 'ActorParticipates' ( (lv_actors_19_0= ruleRefActor ) ) )? (otherlv_20= 'Pre-Conditions' ( (lv_preConditions_21_0= RULE_STRING ) ) )? (otherlv_22= 'Post-Conditions' ( (lv_postConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Include' ( (lv_includes_25_0= ruleRefUC ) )* )? (otherlv_26= 'Extend' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'on' ( (otherlv_29= RULE_ID ) ) )? ( (lv_scenarios_30_0= ruleScenario ) )* otherlv_31= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2870:3: otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( ( (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' ) ) ) ( (lv_extensionnPoints_11_0= ruleExtensionPoint ) )* (otherlv_12= 'Goals' ( (lv_goals_13_0= ruleRefGoal ) )* )? (otherlv_14= 'FunctionalRequirements' ( (lv_frs_15_0= ruleRefFR ) )* )? otherlv_16= 'ActorInitiates' ( (otherlv_17= RULE_ID ) ) (otherlv_18= 'ActorParticipates' ( (lv_actors_19_0= ruleRefActor ) ) )? (otherlv_20= 'Pre-Conditions' ( (lv_preConditions_21_0= RULE_STRING ) ) )? (otherlv_22= 'Post-Conditions' ( (lv_postConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Include' ( (lv_includes_25_0= ruleRefUC ) )* )? (otherlv_26= 'Extend' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'on' ( (otherlv_29= RULE_ID ) ) )? ( (lv_scenarios_30_0= ruleScenario ) )* otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleUseCase6064); 

                	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2874:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2875:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2875:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2876:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase6081); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUseCase6098); 

                	newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2896:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==13) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2896:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleUseCase6111); 

                        	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2900:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2901:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2901:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2902:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase6128); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleUseCase6147); 

                	newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getTypeKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2922:1: ( ( (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2923:1: ( (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2923:1: ( (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2924:1: (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2924:1: (lv_type_6_1= 'EntityManage' | lv_type_6_2= 'EntityBrowse' | lv_type_6_3= 'EntitySearch' | lv_type_6_4= 'EntityCreate' | lv_type_6_5= 'EntityDelete' | lv_type_6_6= 'EntitySync' | lv_type_6_7= 'Report' )
            int alt56=7;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt56=1;
                }
                break;
            case 108:
                {
                alt56=2;
                }
                break;
            case 109:
                {
                alt56=3;
                }
                break;
            case 110:
                {
                alt56=4;
                }
                break;
            case 111:
                {
                alt56=5;
                }
                break;
            case 112:
                {
                alt56=6;
                }
                break;
            case 113:
                {
                alt56=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2925:3: lv_type_6_1= 'EntityManage'
                    {
                    lv_type_6_1=(Token)match(input,107,FOLLOW_107_in_ruleUseCase6167); 

                            newLeafNode(lv_type_6_1, grammarAccess.getUseCaseAccess().getTypeEntityManageKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2937:8: lv_type_6_2= 'EntityBrowse'
                    {
                    lv_type_6_2=(Token)match(input,108,FOLLOW_108_in_ruleUseCase6196); 

                            newLeafNode(lv_type_6_2, grammarAccess.getUseCaseAccess().getTypeEntityBrowseKeyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2949:8: lv_type_6_3= 'EntitySearch'
                    {
                    lv_type_6_3=(Token)match(input,109,FOLLOW_109_in_ruleUseCase6225); 

                            newLeafNode(lv_type_6_3, grammarAccess.getUseCaseAccess().getTypeEntitySearchKeyword_5_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2961:8: lv_type_6_4= 'EntityCreate'
                    {
                    lv_type_6_4=(Token)match(input,110,FOLLOW_110_in_ruleUseCase6254); 

                            newLeafNode(lv_type_6_4, grammarAccess.getUseCaseAccess().getTypeEntityCreateKeyword_5_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2973:8: lv_type_6_5= 'EntityDelete'
                    {
                    lv_type_6_5=(Token)match(input,111,FOLLOW_111_in_ruleUseCase6283); 

                            newLeafNode(lv_type_6_5, grammarAccess.getUseCaseAccess().getTypeEntityDeleteKeyword_5_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2985:8: lv_type_6_6= 'EntitySync'
                    {
                    lv_type_6_6=(Token)match(input,112,FOLLOW_112_in_ruleUseCase6312); 

                            newLeafNode(lv_type_6_6, grammarAccess.getUseCaseAccess().getTypeEntitySyncKeyword_5_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2997:8: lv_type_6_7= 'Report'
                    {
                    lv_type_6_7=(Token)match(input,113,FOLLOW_113_in_ruleUseCase6341); 

                            newLeafNode(lv_type_6_7, grammarAccess.getUseCaseAccess().getTypeReportKeyword_5_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_7, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleUseCase6369); 

                	newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getDescriptionKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3016:1: ( (lv_description_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3017:1: (lv_description_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3017:1: (lv_description_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3018:3: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase6386); 

            			newLeafNode(lv_description_8_0, grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,59,FOLLOW_59_in_ruleUseCase6403); 

                	newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3038:1: ( ( (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3039:1: ( (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3039:1: ( (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3040:1: (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3040:1: (lv_priotity_10_1= 'VeryLow' | lv_priotity_10_2= 'Low' | lv_priotity_10_3= 'Medium' | lv_priotity_10_4= 'High' | lv_priotity_10_5= 'VeryHigh' )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt57=1;
                }
                break;
            case 61:
                {
                alt57=2;
                }
                break;
            case 62:
                {
                alt57=3;
                }
                break;
            case 63:
                {
                alt57=4;
                }
                break;
            case 64:
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
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3041:3: lv_priotity_10_1= 'VeryLow'
                    {
                    lv_priotity_10_1=(Token)match(input,60,FOLLOW_60_in_ruleUseCase6423); 

                            newLeafNode(lv_priotity_10_1, grammarAccess.getUseCaseAccess().getPriotityVeryLowKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "priotity", lv_priotity_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3053:8: lv_priotity_10_2= 'Low'
                    {
                    lv_priotity_10_2=(Token)match(input,61,FOLLOW_61_in_ruleUseCase6452); 

                            newLeafNode(lv_priotity_10_2, grammarAccess.getUseCaseAccess().getPriotityLowKeyword_9_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "priotity", lv_priotity_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3065:8: lv_priotity_10_3= 'Medium'
                    {
                    lv_priotity_10_3=(Token)match(input,62,FOLLOW_62_in_ruleUseCase6481); 

                            newLeafNode(lv_priotity_10_3, grammarAccess.getUseCaseAccess().getPriotityMediumKeyword_9_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "priotity", lv_priotity_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3077:8: lv_priotity_10_4= 'High'
                    {
                    lv_priotity_10_4=(Token)match(input,63,FOLLOW_63_in_ruleUseCase6510); 

                            newLeafNode(lv_priotity_10_4, grammarAccess.getUseCaseAccess().getPriotityHighKeyword_9_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "priotity", lv_priotity_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3089:8: lv_priotity_10_5= 'VeryHigh'
                    {
                    lv_priotity_10_5=(Token)match(input,64,FOLLOW_64_in_ruleUseCase6539); 

                            newLeafNode(lv_priotity_10_5, grammarAccess.getUseCaseAccess().getPriotityVeryHighKeyword_9_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "priotity", lv_priotity_10_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3104:2: ( (lv_extensionnPoints_11_0= ruleExtensionPoint ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==123) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3105:1: (lv_extensionnPoints_11_0= ruleExtensionPoint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3105:1: (lv_extensionnPoints_11_0= ruleExtensionPoint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3106:3: lv_extensionnPoints_11_0= ruleExtensionPoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionnPointsExtensionPointParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtensionPoint_in_ruleUseCase6576);
            	    lv_extensionnPoints_11_0=ruleExtensionPoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensionnPoints",
            	            		lv_extensionnPoints_11_0, 
            	            		"ExtensionPoint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3122:3: (otherlv_12= 'Goals' ( (lv_goals_13_0= ruleRefGoal ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==114) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3122:5: otherlv_12= 'Goals' ( (lv_goals_13_0= ruleRefGoal ) )*
                    {
                    otherlv_12=(Token)match(input,114,FOLLOW_114_in_ruleUseCase6590); 

                        	newLeafNode(otherlv_12, grammarAccess.getUseCaseAccess().getGoalsKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3126:1: ( (lv_goals_13_0= ruleRefGoal ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3127:1: (lv_goals_13_0= ruleRefGoal )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3127:1: (lv_goals_13_0= ruleRefGoal )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3128:3: lv_goals_13_0= ruleRefGoal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getGoalsRefGoalParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefGoal_in_ruleUseCase6611);
                    	    lv_goals_13_0=ruleRefGoal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"goals",
                    	            		lv_goals_13_0, 
                    	            		"RefGoal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3144:5: (otherlv_14= 'FunctionalRequirements' ( (lv_frs_15_0= ruleRefFR ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==115) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3144:7: otherlv_14= 'FunctionalRequirements' ( (lv_frs_15_0= ruleRefFR ) )*
                    {
                    otherlv_14=(Token)match(input,115,FOLLOW_115_in_ruleUseCase6627); 

                        	newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getFunctionalRequirementsKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3148:1: ( (lv_frs_15_0= ruleRefFR ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3149:1: (lv_frs_15_0= ruleRefFR )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3149:1: (lv_frs_15_0= ruleRefFR )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3150:3: lv_frs_15_0= ruleRefFR
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getFrsRefFRParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefFR_in_ruleUseCase6648);
                    	    lv_frs_15_0=ruleRefFR();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"frs",
                    	            		lv_frs_15_0, 
                    	            		"RefFR");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,116,FOLLOW_116_in_ruleUseCase6663); 

                	newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getActorInitiatesKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3170:1: ( (otherlv_17= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3171:1: (otherlv_17= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3171:1: (otherlv_17= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3172:3: otherlv_17= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase6683); 

            		newLeafNode(otherlv_17, grammarAccess.getUseCaseAccess().getActorInitiatesActorCrossReference_14_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3183:2: (otherlv_18= 'ActorParticipates' ( (lv_actors_19_0= ruleRefActor ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==117) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3183:4: otherlv_18= 'ActorParticipates' ( (lv_actors_19_0= ruleRefActor ) )
                    {
                    otherlv_18=(Token)match(input,117,FOLLOW_117_in_ruleUseCase6696); 

                        	newLeafNode(otherlv_18, grammarAccess.getUseCaseAccess().getActorParticipatesKeyword_15_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3187:1: ( (lv_actors_19_0= ruleRefActor ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3188:1: (lv_actors_19_0= ruleRefActor )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3188:1: (lv_actors_19_0= ruleRefActor )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3189:3: lv_actors_19_0= ruleRefActor
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getActorsRefActorParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefActor_in_ruleUseCase6717);
                    lv_actors_19_0=ruleRefActor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"actors",
                            		lv_actors_19_0, 
                            		"RefActor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3205:4: (otherlv_20= 'Pre-Conditions' ( (lv_preConditions_21_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==118) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3205:6: otherlv_20= 'Pre-Conditions' ( (lv_preConditions_21_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,118,FOLLOW_118_in_ruleUseCase6732); 

                        	newLeafNode(otherlv_20, grammarAccess.getUseCaseAccess().getPreConditionsKeyword_16_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3209:1: ( (lv_preConditions_21_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3210:1: (lv_preConditions_21_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3210:1: (lv_preConditions_21_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3211:3: lv_preConditions_21_0= RULE_STRING
                    {
                    lv_preConditions_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase6749); 

                    			newLeafNode(lv_preConditions_21_0, grammarAccess.getUseCaseAccess().getPreConditionsSTRINGTerminalRuleCall_16_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"preConditions",
                            		lv_preConditions_21_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3227:4: (otherlv_22= 'Post-Conditions' ( (lv_postConditions_23_0= RULE_STRING ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==119) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3227:6: otherlv_22= 'Post-Conditions' ( (lv_postConditions_23_0= RULE_STRING ) )
                    {
                    otherlv_22=(Token)match(input,119,FOLLOW_119_in_ruleUseCase6769); 

                        	newLeafNode(otherlv_22, grammarAccess.getUseCaseAccess().getPostConditionsKeyword_17_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3231:1: ( (lv_postConditions_23_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3232:1: (lv_postConditions_23_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3232:1: (lv_postConditions_23_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3233:3: lv_postConditions_23_0= RULE_STRING
                    {
                    lv_postConditions_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase6786); 

                    			newLeafNode(lv_postConditions_23_0, grammarAccess.getUseCaseAccess().getPostConditionsSTRINGTerminalRuleCall_17_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"postConditions",
                            		lv_postConditions_23_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3249:4: (otherlv_24= 'Include' ( (lv_includes_25_0= ruleRefUC ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==120) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3249:6: otherlv_24= 'Include' ( (lv_includes_25_0= ruleRefUC ) )*
                    {
                    otherlv_24=(Token)match(input,120,FOLLOW_120_in_ruleUseCase6806); 

                        	newLeafNode(otherlv_24, grammarAccess.getUseCaseAccess().getIncludeKeyword_18_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3253:1: ( (lv_includes_25_0= ruleRefUC ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==RULE_ID) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3254:1: (lv_includes_25_0= ruleRefUC )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3254:1: (lv_includes_25_0= ruleRefUC )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3255:3: lv_includes_25_0= ruleRefUC
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getIncludesRefUCParserRuleCall_18_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefUC_in_ruleUseCase6827);
                    	    lv_includes_25_0=ruleRefUC();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"includes",
                    	            		lv_includes_25_0, 
                    	            		"RefUC");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3271:5: (otherlv_26= 'Extend' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'on' ( (otherlv_29= RULE_ID ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==121) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3271:7: otherlv_26= 'Extend' ( (otherlv_27= RULE_ID ) ) otherlv_28= 'on' ( (otherlv_29= RULE_ID ) )
                    {
                    otherlv_26=(Token)match(input,121,FOLLOW_121_in_ruleUseCase6843); 

                        	newLeafNode(otherlv_26, grammarAccess.getUseCaseAccess().getExtendKeyword_19_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3275:1: ( (otherlv_27= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3276:1: (otherlv_27= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3276:1: (otherlv_27= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3277:3: otherlv_27= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase6863); 

                    		newLeafNode(otherlv_27, grammarAccess.getUseCaseAccess().getExtendsUseCaseCrossReference_19_1_0()); 
                    	

                    }


                    }

                    otherlv_28=(Token)match(input,122,FOLLOW_122_in_ruleUseCase6875); 

                        	newLeafNode(otherlv_28, grammarAccess.getUseCaseAccess().getOnKeyword_19_2());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3292:1: ( (otherlv_29= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3293:1: (otherlv_29= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3293:1: (otherlv_29= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3294:3: otherlv_29= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase6895); 

                    		newLeafNode(otherlv_29, grammarAccess.getUseCaseAccess().getExtPointExtensionPointCrossReference_19_3_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3305:4: ( (lv_scenarios_30_0= ruleScenario ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==124) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3306:1: (lv_scenarios_30_0= ruleScenario )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3306:1: (lv_scenarios_30_0= ruleScenario )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3307:3: lv_scenarios_30_0= ruleScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getScenariosScenarioParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScenario_in_ruleUseCase6918);
            	    lv_scenarios_30_0=ruleScenario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"scenarios",
            	            		lv_scenarios_30_0, 
            	            		"Scenario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_31=(Token)match(input,16,FOLLOW_16_in_ruleUseCase6931); 

                	newLeafNode(otherlv_31, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_21());
                

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


    // $ANTLR start "entryRuleRefFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3335:1: entryRuleRefFR returns [EObject current=null] : iv_ruleRefFR= ruleRefFR EOF ;
    public final EObject entryRuleRefFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3336:2: (iv_ruleRefFR= ruleRefFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3337:2: iv_ruleRefFR= ruleRefFR EOF
            {
             newCompositeNode(grammarAccess.getRefFRRule()); 
            pushFollow(FOLLOW_ruleRefFR_in_entryRuleRefFR6967);
            iv_ruleRefFR=ruleRefFR();

            state._fsp--;

             current =iv_ruleRefFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefFR6977); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3344:1: ruleRefFR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3347:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3348:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3348:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3348:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3348:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3349:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3349:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3350:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefFRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR7022); 

            		newLeafNode(otherlv_0, grammarAccess.getRefFRAccess().getRefFRFRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3361:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==19) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3361:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefFR7035); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefFRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3365:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3366:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3366:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3367:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefFRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR7055); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefFRAccess().getRefsFRCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleRefFR"


    // $ANTLR start "entryRuleRefActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3386:1: entryRuleRefActor returns [EObject current=null] : iv_ruleRefActor= ruleRefActor EOF ;
    public final EObject entryRuleRefActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3387:2: (iv_ruleRefActor= ruleRefActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3388:2: iv_ruleRefActor= ruleRefActor EOF
            {
             newCompositeNode(grammarAccess.getRefActorRule()); 
            pushFollow(FOLLOW_ruleRefActor_in_entryRuleRefActor7093);
            iv_ruleRefActor=ruleRefActor();

            state._fsp--;

             current =iv_ruleRefActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefActor7103); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3395:1: ruleRefActor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleActor ) ) )* ) ;
    public final EObject ruleRefActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_refs_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3398:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleActor ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3399:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleActor ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3399:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleActor ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3399:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleActor ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3399:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3400:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3400:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3401:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefActorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefActor7148); 

            		newLeafNode(otherlv_0, grammarAccess.getRefActorAccess().getRefActorActorCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3412:2: (otherlv_1= ',' ( (lv_refs_2_0= ruleActor ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==19) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3412:4: otherlv_1= ',' ( (lv_refs_2_0= ruleActor ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefActor7161); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefActorAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3416:1: ( (lv_refs_2_0= ruleActor ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3417:1: (lv_refs_2_0= ruleActor )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3417:1: (lv_refs_2_0= ruleActor )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3418:3: lv_refs_2_0= ruleActor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefActorAccess().getRefsActorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActor_in_ruleRefActor7182);
            	    lv_refs_2_0=ruleActor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefActorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"refs",
            	            		lv_refs_2_0, 
            	            		"Actor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3442:1: entryRuleRefUC returns [EObject current=null] : iv_ruleRefUC= ruleRefUC EOF ;
    public final EObject entryRuleRefUC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefUC = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3443:2: (iv_ruleRefUC= ruleRefUC EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3444:2: iv_ruleRefUC= ruleRefUC EOF
            {
             newCompositeNode(grammarAccess.getRefUCRule()); 
            pushFollow(FOLLOW_ruleRefUC_in_entryRuleRefUC7220);
            iv_ruleRefUC=ruleRefUC();

            state._fsp--;

             current =iv_ruleRefUC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefUC7230); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3451:1: ruleRefUC returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefUC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3454:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3455:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3455:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3455:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3455:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3456:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3456:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3457:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefUCRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC7275); 

            		newLeafNode(otherlv_0, grammarAccess.getRefUCAccess().getRefUCUseCaseCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3468:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==19) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3468:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefUC7288); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefUCAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3472:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3473:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3473:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3474:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefUCRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC7308); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefUCAccess().getRefsUseCaseCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3493:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3494:2: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3495:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
            {
             newCompositeNode(grammarAccess.getExtensionPointRule()); 
            pushFollow(FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint7346);
            iv_ruleExtensionPoint=ruleExtensionPoint();

            state._fsp--;

             current =iv_ruleExtensionPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionPoint7356); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3502:1: ruleExtensionPoint returns [EObject current=null] : (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3505:28: ( (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3506:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3506:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3506:3: otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,123,FOLLOW_123_in_ruleExtensionPoint7393); 

                	newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getExtensionPointKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3510:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3511:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3511:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3512:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtensionPoint7410); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3528:2: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==14) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3528:4: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleExtensionPoint7428); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtensionPointAccess().getDescriptionKeyword_2_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3532:1: ( (lv_description_3_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3533:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3533:1: (lv_description_3_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3534:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExtensionPoint7445); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3558:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3559:2: (iv_ruleScenario= ruleScenario EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3560:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario7488);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario7498); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3567:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3570:28: ( (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3571:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3571:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3571:3: otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,124,FOLLOW_124_in_ruleScenario7535); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3575:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3576:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3576:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3577:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScenario7552); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleScenario7569); 

                	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3597:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==13) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3597:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleScenario7582); 

                        	newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3601:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3602:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3602:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3603:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario7599); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3619:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==14) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3619:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleScenario7619); 

                        	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3623:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3624:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3624:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3625:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario7636); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleScenario7655); 

                	newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3645:1: ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3646:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3646:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3647:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3647:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt76=1;
                }
                break;
            case 125:
                {
                alt76=2;
                }
                break;
            case 126:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3648:3: lv_type_8_1= 'Main'
                    {
                    lv_type_8_1=(Token)match(input,73,FOLLOW_73_in_ruleScenario7675); 

                            newLeafNode(lv_type_8_1, grammarAccess.getScenarioAccess().getTypeMainKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3660:8: lv_type_8_2= 'Alternative'
                    {
                    lv_type_8_2=(Token)match(input,125,FOLLOW_125_in_ruleScenario7704); 

                            newLeafNode(lv_type_8_2, grammarAccess.getScenarioAccess().getTypeAlternativeKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3672:8: lv_type_8_3= 'Exception'
                    {
                    lv_type_8_3=(Token)match(input,126,FOLLOW_126_in_ruleScenario7733); 

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

            otherlv_9=(Token)match(input,127,FOLLOW_127_in_ruleScenario7761); 

                	newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getExecutionModeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3691:1: ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3692:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3692:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3693:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3693:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==128) ) {
                alt77=1;
            }
            else if ( (LA77_0==129) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3694:3: lv_mode_10_1= 'Sequential'
                    {
                    lv_mode_10_1=(Token)match(input,128,FOLLOW_128_in_ruleScenario7781); 

                            newLeafNode(lv_mode_10_1, grammarAccess.getScenarioAccess().getModeSequentialKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "mode", lv_mode_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3706:8: lv_mode_10_2= 'Parallel'
                    {
                    lv_mode_10_2=(Token)match(input,129,FOLLOW_129_in_ruleScenario7810); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3721:2: ( (lv_steps_11_0= ruleStep ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==130) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3722:1: (lv_steps_11_0= ruleStep )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3722:1: (lv_steps_11_0= ruleStep )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3723:3: lv_steps_11_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenario7847);
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
            	    break loop78;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleScenario7860); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3751:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3752:2: (iv_ruleStep= ruleStep EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3753:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep7896);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep7906); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3760:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleStep() throws RecognitionException {
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
        Token otherlv_7=null;
        Token lv_description_8_0=null;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3763:28: ( (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3764:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3764:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3764:3: otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Type' ( ( (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,130,FOLLOW_130_in_ruleStep7943); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3768:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3769:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3769:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3770:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep7960); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStep7977); 

                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3790:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==13) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3790:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStep7990); 

                        	newLeafNode(otherlv_3, grammarAccess.getStepAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3794:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3795:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3795:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3796:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep8007); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleStep8026); 

                	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getTypeKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3816:1: ( ( (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3817:1: ( (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3817:1: ( (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3818:1: (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3818:1: (lv_type_6_1= 'ActorPrepareData' | lv_type_6_2= 'ActorCallSystem' | lv_type_6_3= 'SystemExecutes' | lv_type_6_4= 'SystemReturnResult' | lv_type_6_5= 'Other' )
            int alt80=5;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt80=1;
                }
                break;
            case 132:
                {
                alt80=2;
                }
                break;
            case 133:
                {
                alt80=3;
                }
                break;
            case 134:
                {
                alt80=4;
                }
                break;
            case 135:
                {
                alt80=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3819:3: lv_type_6_1= 'ActorPrepareData'
                    {
                    lv_type_6_1=(Token)match(input,131,FOLLOW_131_in_ruleStep8046); 

                            newLeafNode(lv_type_6_1, grammarAccess.getStepAccess().getTypeActorPrepareDataKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3831:8: lv_type_6_2= 'ActorCallSystem'
                    {
                    lv_type_6_2=(Token)match(input,132,FOLLOW_132_in_ruleStep8075); 

                            newLeafNode(lv_type_6_2, grammarAccess.getStepAccess().getTypeActorCallSystemKeyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3843:8: lv_type_6_3= 'SystemExecutes'
                    {
                    lv_type_6_3=(Token)match(input,133,FOLLOW_133_in_ruleStep8104); 

                            newLeafNode(lv_type_6_3, grammarAccess.getStepAccess().getTypeSystemExecutesKeyword_5_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3855:8: lv_type_6_4= 'SystemReturnResult'
                    {
                    lv_type_6_4=(Token)match(input,134,FOLLOW_134_in_ruleStep8133); 

                            newLeafNode(lv_type_6_4, grammarAccess.getStepAccess().getTypeSystemReturnResultKeyword_5_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3867:8: lv_type_6_5= 'Other'
                    {
                    lv_type_6_5=(Token)match(input,135,FOLLOW_135_in_ruleStep8162); 

                            newLeafNode(lv_type_6_5, grammarAccess.getStepAccess().getTypeOtherKeyword_5_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleStep8190); 

                	newLeafNode(otherlv_7, grammarAccess.getStepAccess().getDescriptionKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3886:1: ( (lv_description_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3887:1: (lv_description_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3887:1: (lv_description_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3888:3: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep8207); 

            			newLeafNode(lv_description_8_0, grammarAccess.getStepAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStepRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_8_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3904:2: (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==32) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3904:4: otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleStep8225); 

                        	newLeafNode(otherlv_9, grammarAccess.getStepAccess().getActorKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3908:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3909:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3909:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3910:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep8245); 

                    		newLeafNode(otherlv_10, grammarAccess.getStepAccess().getActorActorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3921:4: (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==118) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3921:6: otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,118,FOLLOW_118_in_ruleStep8260); 

                        	newLeafNode(otherlv_11, grammarAccess.getStepAccess().getPreConditionsKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3925:1: ( (lv_preConditions_12_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3926:1: (lv_preConditions_12_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3926:1: (lv_preConditions_12_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3927:3: lv_preConditions_12_0= RULE_STRING
                    {
                    lv_preConditions_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep8277); 

                    			newLeafNode(lv_preConditions_12_0, grammarAccess.getStepAccess().getPreConditionsSTRINGTerminalRuleCall_9_1_0()); 
                    		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3943:4: (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==119) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3943:6: otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,119,FOLLOW_119_in_ruleStep8297); 

                        	newLeafNode(otherlv_13, grammarAccess.getStepAccess().getPostConditionsKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3947:1: ( (lv_postConditions_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3948:1: (lv_postConditions_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3948:1: (lv_postConditions_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3949:3: lv_postConditions_14_0= RULE_STRING
                    {
                    lv_postConditions_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep8314); 

                    			newLeafNode(lv_postConditions_14_0, grammarAccess.getStepAccess().getPostConditionsSTRINGTerminalRuleCall_10_1_0()); 
                    		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3965:4: (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==136) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3965:6: otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,136,FOLLOW_136_in_ruleStep8334); 

                        	newLeafNode(otherlv_15, grammarAccess.getStepAccess().getNextStepKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3969:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3970:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3970:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3971:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep8354); 

                    		newLeafNode(otherlv_16, grammarAccess.getStepAccess().getNextStepCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleStep8368); 

                	newLeafNode(otherlv_17, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3994:1: entryRuleFR returns [EObject current=null] : iv_ruleFR= ruleFR EOF ;
    public final EObject entryRuleFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3995:2: (iv_ruleFR= ruleFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3996:2: iv_ruleFR= ruleFR EOF
            {
             newCompositeNode(grammarAccess.getFRRule()); 
            pushFollow(FOLLOW_ruleFR_in_entryRuleFR8404);
            iv_ruleFR=ruleFR();

            state._fsp--;

             current =iv_ruleFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFR8414); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4003:1: ruleFR returns [EObject current=null] : (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) otherlv_9= 'Modality' ( ( (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' ) ) ) (otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= 'Priority' ( ( (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' ) ) ) ( (lv_depends_15_0= ruleDependsOnFR ) )* (otherlv_16= 'PartOf' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '}' ) ;
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
        Token lv_modality_10_1=null;
        Token lv_modality_10_2=null;
        Token lv_modality_10_3=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_priority_14_1=null;
        Token lv_priority_14_2=null;
        Token lv_priority_14_3=null;
        Token lv_priority_14_4=null;
        Token lv_priority_14_5=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_depends_15_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4006:28: ( (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) otherlv_9= 'Modality' ( ( (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' ) ) ) (otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= 'Priority' ( ( (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' ) ) ) ( (lv_depends_15_0= ruleDependsOnFR ) )* (otherlv_16= 'PartOf' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4007:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) otherlv_9= 'Modality' ( ( (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' ) ) ) (otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= 'Priority' ( ( (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' ) ) ) ( (lv_depends_15_0= ruleDependsOnFR ) )* (otherlv_16= 'PartOf' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4007:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) otherlv_9= 'Modality' ( ( (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' ) ) ) (otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= 'Priority' ( ( (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' ) ) ) ( (lv_depends_15_0= ruleDependsOnFR ) )* (otherlv_16= 'PartOf' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4007:3: otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) otherlv_9= 'Modality' ( ( (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' ) ) ) (otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= 'Priority' ( ( (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' ) ) ) ( (lv_depends_15_0= ruleDependsOnFR ) )* (otherlv_16= 'PartOf' ( (otherlv_17= RULE_ID ) ) )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,137,FOLLOW_137_in_ruleFR8451); 

                	newLeafNode(otherlv_0, grammarAccess.getFRAccess().getFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4011:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4012:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4012:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4013:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR8468); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFR8485); 

                	newLeafNode(otherlv_2, grammarAccess.getFRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4033:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==13) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4033:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFR8498); 

                        	newLeafNode(otherlv_3, grammarAccess.getFRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4037:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4038:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4038:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4039:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR8515); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFR8534); 

                	newLeafNode(otherlv_5, grammarAccess.getFRAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4059:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4060:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4060:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4061:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR8551); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleFR8568); 

                	newLeafNode(otherlv_7, grammarAccess.getFRAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4081:1: ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4082:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4082:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4083:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4083:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            int alt86=3;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt86=1;
                }
                break;
            case 139:
                {
                alt86=2;
                }
                break;
            case 140:
                {
                alt86=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4084:3: lv_type_8_1= 'Functional'
                    {
                    lv_type_8_1=(Token)match(input,138,FOLLOW_138_in_ruleFR8588); 

                            newLeafNode(lv_type_8_1, grammarAccess.getFRAccess().getTypeFunctionalKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4096:8: lv_type_8_2= 'Behavioral'
                    {
                    lv_type_8_2=(Token)match(input,139,FOLLOW_139_in_ruleFR8617); 

                            newLeafNode(lv_type_8_2, grammarAccess.getFRAccess().getTypeBehavioralKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4108:8: lv_type_8_3= 'Data'
                    {
                    lv_type_8_3=(Token)match(input,140,FOLLOW_140_in_ruleFR8646); 

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

            otherlv_9=(Token)match(input,141,FOLLOW_141_in_ruleFR8674); 

                	newLeafNode(otherlv_9, grammarAccess.getFRAccess().getModalityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4127:1: ( ( (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4128:1: ( (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4128:1: ( (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4129:1: (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4129:1: (lv_modality_10_1= 'Mandatory' | lv_modality_10_2= 'Desirable' | lv_modality_10_3= 'Optional' )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 142:
                {
                alt87=1;
                }
                break;
            case 143:
                {
                alt87=2;
                }
                break;
            case 144:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4130:3: lv_modality_10_1= 'Mandatory'
                    {
                    lv_modality_10_1=(Token)match(input,142,FOLLOW_142_in_ruleFR8694); 

                            newLeafNode(lv_modality_10_1, grammarAccess.getFRAccess().getModalityMandatoryKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4142:8: lv_modality_10_2= 'Desirable'
                    {
                    lv_modality_10_2=(Token)match(input,143,FOLLOW_143_in_ruleFR8723); 

                            newLeafNode(lv_modality_10_2, grammarAccess.getFRAccess().getModalityDesirableKeyword_9_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4154:8: lv_modality_10_3= 'Optional'
                    {
                    lv_modality_10_3=(Token)match(input,144,FOLLOW_144_in_ruleFR8752); 

                            newLeafNode(lv_modality_10_3, grammarAccess.getFRAccess().getModalityOptionalKeyword_9_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_10_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4169:2: (otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==29) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4169:4: otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleFR8781); 

                        	newLeafNode(otherlv_11, grammarAccess.getFRAccess().getStakeholderKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4173:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4174:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4174:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4175:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR8801); 

                    		newLeafNode(otherlv_12, grammarAccess.getFRAccess().getStakeholderStakeholderCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,59,FOLLOW_59_in_ruleFR8815); 

                	newLeafNode(otherlv_13, grammarAccess.getFRAccess().getPriorityKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4190:1: ( ( (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4191:1: ( (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4191:1: ( (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4192:1: (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4192:1: (lv_priority_14_1= 'VeryLow' | lv_priority_14_2= 'Low' | lv_priority_14_3= 'Medium' | lv_priority_14_4= 'High' | lv_priority_14_5= 'VeryHigh' )
            int alt89=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt89=1;
                }
                break;
            case 61:
                {
                alt89=2;
                }
                break;
            case 62:
                {
                alt89=3;
                }
                break;
            case 63:
                {
                alt89=4;
                }
                break;
            case 64:
                {
                alt89=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4193:3: lv_priority_14_1= 'VeryLow'
                    {
                    lv_priority_14_1=(Token)match(input,60,FOLLOW_60_in_ruleFR8835); 

                            newLeafNode(lv_priority_14_1, grammarAccess.getFRAccess().getPriorityVeryLowKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_14_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4205:8: lv_priority_14_2= 'Low'
                    {
                    lv_priority_14_2=(Token)match(input,61,FOLLOW_61_in_ruleFR8864); 

                            newLeafNode(lv_priority_14_2, grammarAccess.getFRAccess().getPriorityLowKeyword_12_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_14_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4217:8: lv_priority_14_3= 'Medium'
                    {
                    lv_priority_14_3=(Token)match(input,62,FOLLOW_62_in_ruleFR8893); 

                            newLeafNode(lv_priority_14_3, grammarAccess.getFRAccess().getPriorityMediumKeyword_12_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_14_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4229:8: lv_priority_14_4= 'High'
                    {
                    lv_priority_14_4=(Token)match(input,63,FOLLOW_63_in_ruleFR8922); 

                            newLeafNode(lv_priority_14_4, grammarAccess.getFRAccess().getPriorityHighKeyword_12_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_14_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4241:8: lv_priority_14_5= 'VeryHigh'
                    {
                    lv_priority_14_5=(Token)match(input,64,FOLLOW_64_in_ruleFR8951); 

                            newLeafNode(lv_priority_14_5, grammarAccess.getFRAccess().getPriorityVeryHighKeyword_12_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_14_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4256:2: ( (lv_depends_15_0= ruleDependsOnFR ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==65||LA90_0==68||LA90_0==145) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4257:1: (lv_depends_15_0= ruleDependsOnFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4257:1: (lv_depends_15_0= ruleDependsOnFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4258:3: lv_depends_15_0= ruleDependsOnFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFRAccess().getDependsDependsOnFRParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnFR_in_ruleFR8988);
            	    lv_depends_15_0=ruleDependsOnFR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFRRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"depends",
            	            		lv_depends_15_0, 
            	            		"DependsOnFR");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4274:3: (otherlv_16= 'PartOf' ( (otherlv_17= RULE_ID ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==18) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4274:5: otherlv_16= 'PartOf' ( (otherlv_17= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleFR9002); 

                        	newLeafNode(otherlv_16, grammarAccess.getFRAccess().getPartOfKeyword_14_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4278:1: ( (otherlv_17= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4279:1: (otherlv_17= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4279:1: (otherlv_17= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4280:3: otherlv_17= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR9022); 

                    		newLeafNode(otherlv_17, grammarAccess.getFRAccess().getPartOfFRCrossReference_14_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleFR9036); 

                	newLeafNode(otherlv_18, grammarAccess.getFRAccess().getRightCurlyBracketKeyword_15());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4303:1: entryRuleDependsOnFR returns [EObject current=null] : iv_ruleDependsOnFR= ruleDependsOnFR EOF ;
    public final EObject entryRuleDependsOnFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4304:2: (iv_ruleDependsOnFR= ruleDependsOnFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4305:2: iv_ruleDependsOnFR= ruleDependsOnFR EOF
            {
             newCompositeNode(grammarAccess.getDependsOnFRRule()); 
            pushFollow(FOLLOW_ruleDependsOnFR_in_entryRuleDependsOnFR9072);
            iv_ruleDependsOnFR=ruleDependsOnFR();

            state._fsp--;

             current =iv_ruleDependsOnFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnFR9082); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4312:1: ruleDependsOnFR returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) ) ) ;
    public final EObject ruleDependsOnFR() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refFr_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4315:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4316:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4316:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4316:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4316:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4317:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4317:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4318:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4318:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt92=1;
                }
                break;
            case 145:
                {
                alt92=2;
                }
                break;
            case 68:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4319:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,65,FOLLOW_65_in_ruleDependsOnFR9127); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnFRAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4331:8: lv_type_0_2= 'Refines'
                    {
                    lv_type_0_2=(Token)match(input,145,FOLLOW_145_in_ruleDependsOnFR9156); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnFRAccess().getTypeRefinesKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4343:8: lv_type_0_3= 'Conflicts'
                    {
                    lv_type_0_3=(Token)match(input,68,FOLLOW_68_in_ruleDependsOnFR9185); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4358:2: ( (lv_refFr_1_0= ruleRefFR ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4359:1: (lv_refFr_1_0= ruleRefFR )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4359:1: (lv_refFr_1_0= ruleRefFR )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4360:3: lv_refFr_1_0= ruleRefFR
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnFRAccess().getRefFrRefFRParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefFR_in_ruleDependsOnFR9222);
            lv_refFr_1_0=ruleRefFR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependsOnFRRule());
            	        }
                   		set(
                   			current, 
                   			"refFr",
                    		lv_refFr_1_0, 
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


    // $ANTLR start "entryRuleNFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4384:1: entryRuleNFR returns [EObject current=null] : iv_ruleNFR= ruleNFR EOF ;
    public final EObject entryRuleNFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4385:2: (iv_ruleNFR= ruleNFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4386:2: iv_ruleNFR= ruleNFR EOF
            {
             newCompositeNode(grammarAccess.getNFRRule()); 
            pushFollow(FOLLOW_ruleNFR_in_entryRuleNFR9258);
            iv_ruleNFR=ruleNFR();

            state._fsp--;

             current =iv_ruleNFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFR9268); 

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
    // $ANTLR end "entryRuleNFR"


    // $ANTLR start "ruleNFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4393:1: ruleNFR returns [EObject current=null] : (otherlv_0= 'Non-FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( ( (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' ) ) ) ( (lv_depends_19_0= ruleDependsOnNFR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleNFR() throws RecognitionException {
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
        Token lv_priority_18_1=null;
        Token lv_priority_18_2=null;
        Token lv_priority_18_3=null;
        Token lv_priority_18_4=null;
        Token lv_priority_18_5=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_depends_19_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4396:28: ( (otherlv_0= 'Non-FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( ( (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' ) ) ) ( (lv_depends_19_0= ruleDependsOnNFR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4397:1: (otherlv_0= 'Non-FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( ( (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' ) ) ) ( (lv_depends_19_0= ruleDependsOnNFR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4397:1: (otherlv_0= 'Non-FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( ( (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' ) ) ) ( (lv_depends_19_0= ruleDependsOnNFR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4397:3: otherlv_0= 'Non-FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( ( (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' ) ) ) ( (lv_depends_19_0= ruleDependsOnNFR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,146,FOLLOW_146_in_ruleNFR9305); 

                	newLeafNode(otherlv_0, grammarAccess.getNFRAccess().getNonFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4401:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4402:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4402:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4403:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNFR9322); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNFRAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNFR9339); 

                	newLeafNode(otherlv_2, grammarAccess.getNFRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4423:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==13) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4423:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleNFR9352); 

                        	newLeafNode(otherlv_3, grammarAccess.getNFRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4427:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4428:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4428:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4429:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR9369); 

                    			newLeafNode(lv_nameAlias_4_0, grammarAccess.getNFRAccess().getNameAliasSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleNFR9388); 

                	newLeafNode(otherlv_5, grammarAccess.getNFRAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4449:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4450:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4450:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4451:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR9405); 

            			newLeafNode(lv_description_6_0, grammarAccess.getNFRAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleNFR9422); 

                	newLeafNode(otherlv_7, grammarAccess.getNFRAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4471:1: ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4472:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4472:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4473:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4473:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            int alt94=8;
            switch ( input.LA(1) ) {
            case 147:
                {
                alt94=1;
                }
                break;
            case 148:
                {
                alt94=2;
                }
                break;
            case 149:
                {
                alt94=3;
                }
                break;
            case 150:
                {
                alt94=4;
                }
                break;
            case 151:
                {
                alt94=5;
                }
                break;
            case 152:
                {
                alt94=6;
                }
                break;
            case 153:
                {
                alt94=7;
                }
                break;
            case 154:
                {
                alt94=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4474:3: lv_type_8_1= 'Security'
                    {
                    lv_type_8_1=(Token)match(input,147,FOLLOW_147_in_ruleNFR9442); 

                            newLeafNode(lv_type_8_1, grammarAccess.getNFRAccess().getTypeSecurityKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4486:8: lv_type_8_2= 'Performance'
                    {
                    lv_type_8_2=(Token)match(input,148,FOLLOW_148_in_ruleNFR9471); 

                            newLeafNode(lv_type_8_2, grammarAccess.getNFRAccess().getTypePerformanceKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4498:8: lv_type_8_3= 'Usability'
                    {
                    lv_type_8_3=(Token)match(input,149,FOLLOW_149_in_ruleNFR9500); 

                            newLeafNode(lv_type_8_3, grammarAccess.getNFRAccess().getTypeUsabilityKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4510:8: lv_type_8_4= 'Appearance'
                    {
                    lv_type_8_4=(Token)match(input,150,FOLLOW_150_in_ruleNFR9529); 

                            newLeafNode(lv_type_8_4, grammarAccess.getNFRAccess().getTypeAppearanceKeyword_7_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4522:8: lv_type_8_5= 'Operational'
                    {
                    lv_type_8_5=(Token)match(input,151,FOLLOW_151_in_ruleNFR9558); 

                            newLeafNode(lv_type_8_5, grammarAccess.getNFRAccess().getTypeOperationalKeyword_7_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4534:8: lv_type_8_6= 'Maintenance'
                    {
                    lv_type_8_6=(Token)match(input,152,FOLLOW_152_in_ruleNFR9587); 

                            newLeafNode(lv_type_8_6, grammarAccess.getNFRAccess().getTypeMaintenanceKeyword_7_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4546:8: lv_type_8_7= 'Cultural'
                    {
                    lv_type_8_7=(Token)match(input,153,FOLLOW_153_in_ruleNFR9616); 

                            newLeafNode(lv_type_8_7, grammarAccess.getNFRAccess().getTypeCulturalKeyword_7_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4558:8: lv_type_8_8= 'Legal'
                    {
                    lv_type_8_8=(Token)match(input,154,FOLLOW_154_in_ruleNFR9645); 

                            newLeafNode(lv_type_8_8, grammarAccess.getNFRAccess().getTypeLegalKeyword_7_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_8, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4573:2: (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==155) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4573:4: otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    {
                    otherlv_9=(Token)match(input,155,FOLLOW_155_in_ruleNFR9674); 

                        	newLeafNode(otherlv_9, grammarAccess.getNFRAccess().getSubTypeKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4577:1: ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4578:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4578:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4579:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4579:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    int alt95=5;
                    switch ( input.LA(1) ) {
                    case 156:
                        {
                        alt95=1;
                        }
                        break;
                    case 157:
                        {
                        alt95=2;
                        }
                        break;
                    case 158:
                        {
                        alt95=3;
                        }
                        break;
                    case 159:
                        {
                        alt95=4;
                        }
                        break;
                    case 160:
                        {
                        alt95=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }

                    switch (alt95) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4580:3: lv_subType_10_1= 'Security.Privacy'
                            {
                            lv_subType_10_1=(Token)match(input,156,FOLLOW_156_in_ruleNFR9694); 

                                    newLeafNode(lv_subType_10_1, grammarAccess.getNFRAccess().getSubTypeSecurityPrivacyKeyword_8_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNFRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4592:8: lv_subType_10_2= 'Security.Integrity'
                            {
                            lv_subType_10_2=(Token)match(input,157,FOLLOW_157_in_ruleNFR9723); 

                                    newLeafNode(lv_subType_10_2, grammarAccess.getNFRAccess().getSubTypeSecurityIntegrityKeyword_8_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNFRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4604:8: lv_subType_10_3= 'Usability.EaseOfUse'
                            {
                            lv_subType_10_3=(Token)match(input,158,FOLLOW_158_in_ruleNFR9752); 

                                    newLeafNode(lv_subType_10_3, grammarAccess.getNFRAccess().getSubTypeUsabilityEaseOfUseKeyword_8_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNFRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4616:8: lv_subType_10_4= 'Usability.EaseOfLearn'
                            {
                            lv_subType_10_4=(Token)match(input,159,FOLLOW_159_in_ruleNFR9781); 

                                    newLeafNode(lv_subType_10_4, grammarAccess.getNFRAccess().getSubTypeUsabilityEaseOfLearnKeyword_8_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNFRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4628:8: lv_subType_10_5= 'Usability.Accessibility'
                            {
                            lv_subType_10_5=(Token)match(input,160,FOLLOW_160_in_ruleNFR9810); 

                                    newLeafNode(lv_subType_10_5, grammarAccess.getNFRAccess().getSubTypeUsabilityAccessibilityKeyword_8_1_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNFRRule());
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

            otherlv_11=(Token)match(input,161,FOLLOW_161_in_ruleNFR9840); 

                	newLeafNode(otherlv_11, grammarAccess.getNFRAccess().getMetricKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4647:1: ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4648:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4648:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4649:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4649:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            int alt97=6;
            switch ( input.LA(1) ) {
            case 162:
                {
                alt97=1;
                }
                break;
            case 163:
                {
                alt97=2;
                }
                break;
            case 164:
                {
                alt97=3;
                }
                break;
            case 165:
                {
                alt97=4;
                }
                break;
            case 166:
                {
                alt97=5;
                }
                break;
            case 135:
                {
                alt97=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4650:3: lv_metric_12_1= 'Hours'
                    {
                    lv_metric_12_1=(Token)match(input,162,FOLLOW_162_in_ruleNFR9860); 

                            newLeafNode(lv_metric_12_1, grammarAccess.getNFRAccess().getMetricHoursKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4662:8: lv_metric_12_2= 'Mins'
                    {
                    lv_metric_12_2=(Token)match(input,163,FOLLOW_163_in_ruleNFR9889); 

                            newLeafNode(lv_metric_12_2, grammarAccess.getNFRAccess().getMetricMinsKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4674:8: lv_metric_12_3= 'Secs'
                    {
                    lv_metric_12_3=(Token)match(input,164,FOLLOW_164_in_ruleNFR9918); 

                            newLeafNode(lv_metric_12_3, grammarAccess.getNFRAccess().getMetricSecsKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4686:8: lv_metric_12_4= 'mSecs'
                    {
                    lv_metric_12_4=(Token)match(input,165,FOLLOW_165_in_ruleNFR9947); 

                            newLeafNode(lv_metric_12_4, grammarAccess.getNFRAccess().getMetricMSecsKeyword_10_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4698:8: lv_metric_12_5= 'Tasks'
                    {
                    lv_metric_12_5=(Token)match(input,166,FOLLOW_166_in_ruleNFR9976); 

                            newLeafNode(lv_metric_12_5, grammarAccess.getNFRAccess().getMetricTasksKeyword_10_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4710:8: lv_metric_12_6= 'Other'
                    {
                    lv_metric_12_6=(Token)match(input,135,FOLLOW_135_in_ruleNFR10005); 

                            newLeafNode(lv_metric_12_6, grammarAccess.getNFRAccess().getMetricOtherKeyword_10_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_6, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_13=(Token)match(input,167,FOLLOW_167_in_ruleNFR10033); 

                	newLeafNode(otherlv_13, grammarAccess.getNFRAccess().getValueKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4729:1: ( (lv_value_14_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4730:1: (lv_value_14_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4730:1: (lv_value_14_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4731:3: lv_value_14_0= RULE_INT
            {
            lv_value_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNFR10050); 

            			newLeafNode(lv_value_14_0, grammarAccess.getNFRAccess().getValueINTTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_14_0, 
                    		"INT");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4747:2: (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==29) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4747:4: otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleNFR10068); 

                        	newLeafNode(otherlv_15, grammarAccess.getNFRAccess().getStakeholderKeyword_13_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4751:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4752:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4752:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4753:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNFR10088); 

                    		newLeafNode(otherlv_16, grammarAccess.getNFRAccess().getStakeholderStakeholderCrossReference_13_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,59,FOLLOW_59_in_ruleNFR10102); 

                	newLeafNode(otherlv_17, grammarAccess.getNFRAccess().getPriorityKeyword_14());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4768:1: ( ( (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4769:1: ( (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4769:1: ( (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4770:1: (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4770:1: (lv_priority_18_1= 'VeryLow' | lv_priority_18_2= 'Low' | lv_priority_18_3= 'Medium' | lv_priority_18_4= 'High' | lv_priority_18_5= 'VeryHigh' )
            int alt99=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt99=1;
                }
                break;
            case 61:
                {
                alt99=2;
                }
                break;
            case 62:
                {
                alt99=3;
                }
                break;
            case 63:
                {
                alt99=4;
                }
                break;
            case 64:
                {
                alt99=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4771:3: lv_priority_18_1= 'VeryLow'
                    {
                    lv_priority_18_1=(Token)match(input,60,FOLLOW_60_in_ruleNFR10122); 

                            newLeafNode(lv_priority_18_1, grammarAccess.getNFRAccess().getPriorityVeryLowKeyword_15_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_18_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4783:8: lv_priority_18_2= 'Low'
                    {
                    lv_priority_18_2=(Token)match(input,61,FOLLOW_61_in_ruleNFR10151); 

                            newLeafNode(lv_priority_18_2, grammarAccess.getNFRAccess().getPriorityLowKeyword_15_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_18_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4795:8: lv_priority_18_3= 'Medium'
                    {
                    lv_priority_18_3=(Token)match(input,62,FOLLOW_62_in_ruleNFR10180); 

                            newLeafNode(lv_priority_18_3, grammarAccess.getNFRAccess().getPriorityMediumKeyword_15_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_18_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4807:8: lv_priority_18_4= 'High'
                    {
                    lv_priority_18_4=(Token)match(input,63,FOLLOW_63_in_ruleNFR10209); 

                            newLeafNode(lv_priority_18_4, grammarAccess.getNFRAccess().getPriorityHighKeyword_15_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_18_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4819:8: lv_priority_18_5= 'VeryHigh'
                    {
                    lv_priority_18_5=(Token)match(input,64,FOLLOW_64_in_ruleNFR10238); 

                            newLeafNode(lv_priority_18_5, grammarAccess.getNFRAccess().getPriorityVeryHighKeyword_15_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_18_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4834:2: ( (lv_depends_19_0= ruleDependsOnNFR ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==65||LA100_0==68||LA100_0==145) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4835:1: (lv_depends_19_0= ruleDependsOnNFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4835:1: (lv_depends_19_0= ruleDependsOnNFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4836:3: lv_depends_19_0= ruleDependsOnNFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNFRAccess().getDependsDependsOnNFRParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnNFR_in_ruleNFR10275);
            	    lv_depends_19_0=ruleDependsOnNFR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNFRRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"depends",
            	            		lv_depends_19_0, 
            	            		"DependsOnNFR");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4852:3: (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==18) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4852:5: otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) )
                    {
                    otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleNFR10289); 

                        	newLeafNode(otherlv_20, grammarAccess.getNFRAccess().getPartOfKeyword_17_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4856:1: ( (otherlv_21= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4857:1: (otherlv_21= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4857:1: (otherlv_21= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4858:3: otherlv_21= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNFRRule());
                    	        }
                            
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNFR10309); 

                    		newLeafNode(otherlv_21, grammarAccess.getNFRAccess().getPartOfNFRCrossReference_17_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,16,FOLLOW_16_in_ruleNFR10323); 

                	newLeafNode(otherlv_22, grammarAccess.getNFRAccess().getRightCurlyBracketKeyword_18());
                

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
    // $ANTLR end "ruleNFR"


    // $ANTLR start "entryRuleDependsOnNFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4881:1: entryRuleDependsOnNFR returns [EObject current=null] : iv_ruleDependsOnNFR= ruleDependsOnNFR EOF ;
    public final EObject entryRuleDependsOnNFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnNFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4882:2: (iv_ruleDependsOnNFR= ruleDependsOnNFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4883:2: iv_ruleDependsOnNFR= ruleDependsOnNFR EOF
            {
             newCompositeNode(grammarAccess.getDependsOnNFRRule()); 
            pushFollow(FOLLOW_ruleDependsOnNFR_in_entryRuleDependsOnNFR10359);
            iv_ruleDependsOnNFR=ruleDependsOnNFR();

            state._fsp--;

             current =iv_ruleDependsOnNFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnNFR10369); 

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
    // $ANTLR end "entryRuleDependsOnNFR"


    // $ANTLR start "ruleDependsOnNFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4890:1: ruleDependsOnNFR returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefNFR ) ) ) ;
    public final EObject ruleDependsOnNFR() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refFr_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4893:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefNFR ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4894:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefNFR ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4894:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefNFR ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4894:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefNFR ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4894:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4895:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4895:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4896:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4896:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            int alt102=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt102=1;
                }
                break;
            case 145:
                {
                alt102=2;
                }
                break;
            case 68:
                {
                alt102=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4897:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,65,FOLLOW_65_in_ruleDependsOnNFR10414); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnNFRAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4909:8: lv_type_0_2= 'Refines'
                    {
                    lv_type_0_2=(Token)match(input,145,FOLLOW_145_in_ruleDependsOnNFR10443); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnNFRAccess().getTypeRefinesKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4921:8: lv_type_0_3= 'Conflicts'
                    {
                    lv_type_0_3=(Token)match(input,68,FOLLOW_68_in_ruleDependsOnNFR10472); 

                            newLeafNode(lv_type_0_3, grammarAccess.getDependsOnNFRAccess().getTypeConflictsKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnNFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4936:2: ( (lv_refFr_1_0= ruleRefNFR ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4937:1: (lv_refFr_1_0= ruleRefNFR )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4937:1: (lv_refFr_1_0= ruleRefNFR )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4938:3: lv_refFr_1_0= ruleRefNFR
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnNFRAccess().getRefFrRefNFRParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefNFR_in_ruleDependsOnNFR10509);
            lv_refFr_1_0=ruleRefNFR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependsOnNFRRule());
            	        }
                   		set(
                   			current, 
                   			"refFr",
                    		lv_refFr_1_0, 
                    		"RefNFR");
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
    // $ANTLR end "ruleDependsOnNFR"


    // $ANTLR start "entryRuleRefNFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4962:1: entryRuleRefNFR returns [EObject current=null] : iv_ruleRefNFR= ruleRefNFR EOF ;
    public final EObject entryRuleRefNFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefNFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4963:2: (iv_ruleRefNFR= ruleRefNFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4964:2: iv_ruleRefNFR= ruleRefNFR EOF
            {
             newCompositeNode(grammarAccess.getRefNFRRule()); 
            pushFollow(FOLLOW_ruleRefNFR_in_entryRuleRefNFR10545);
            iv_ruleRefNFR=ruleRefNFR();

            state._fsp--;

             current =iv_ruleRefNFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefNFR10555); 

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
    // $ANTLR end "entryRuleRefNFR"


    // $ANTLR start "ruleRefNFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4971:1: ruleRefNFR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefNFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4974:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4975:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4975:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4975:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4975:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4976:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4976:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4977:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefNFRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefNFR10600); 

            		newLeafNode(otherlv_0, grammarAccess.getRefNFRAccess().getRefNFRNFRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4988:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==19) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4988:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefNFR10613); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefNFRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4992:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4993:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4993:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4994:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefNFRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefNFR10633); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefNFRAccess().getRefsNFRCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleRefNFR"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleModel131 = new BitSet(new long[]{0x0400000160120002L,0x0000040000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel152 = new BitSet(new long[]{0x0400000160120002L,0x0000040000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleGlossaryTerm_in_ruleModel174 = new BitSet(new long[]{0x0400000160100002L,0x0000040000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleModel196 = new BitSet(new long[]{0x0400000160000002L,0x0000040000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleModel218 = new BitSet(new long[]{0x0400000140000002L,0x0000040000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel240 = new BitSet(new long[]{0x0000000140000002L,0x0000040000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleActor_in_ruleModel262 = new BitSet(new long[]{0x0000000100000002L,0x0000040000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleUseCase_in_ruleModel284 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleFR_in_ruleModel306 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleNFR_in_ruleModel328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProject412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject429 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject446 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleProject459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject476 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject512 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleProject530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefSystem_in_ruleProject551 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProject565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSystem648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem665 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem682 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSystem695 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem712 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSystem731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem748 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleSystem766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem786 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSystem800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefSystem_in_entryRuleRefSystem836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefSystem846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefSystem891 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefSystem904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefSystem924 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossaryTerm972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleGlossaryTerm1009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlossaryTerm1026 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGlossaryTerm1043 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleGlossaryTerm1056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm1073 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGlossaryTerm1092 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleRefTermType_in_ruleGlossaryTerm1113 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_ruleGlossaryTerm1126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm1143 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGlossaryTerm1162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm1179 = new BitSet(new long[]{0x0000000E10810000L});
    public static final BitSet FOLLOW_23_in_ruleGlossaryTerm1197 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_24_in_ruleGlossaryTerm1217 = new BitSet(new long[]{0x0000000E10010000L});
    public static final BitSet FOLLOW_25_in_ruleGlossaryTerm1246 = new BitSet(new long[]{0x0000000E10010000L});
    public static final BitSet FOLLOW_26_in_ruleGlossaryTerm1275 = new BitSet(new long[]{0x0000000E10010000L});
    public static final BitSet FOLLOW_27_in_ruleGlossaryTerm1304 = new BitSet(new long[]{0x0000000E10010000L});
    public static final BitSet FOLLOW_28_in_ruleGlossaryTerm1335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm1352 = new BitSet(new long[]{0x0000000E00010000L});
    public static final BitSet FOLLOW_ruleTermRelation_in_ruleGlossaryTerm1380 = new BitSet(new long[]{0x0000000E00010000L});
    public static final BitSet FOLLOW_16_in_ruleGlossaryTerm1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTermType_in_entryRuleRefTermType1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTermType1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType1485 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefTermType1498 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType1519 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleTermType_in_entryRuleTermType1557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermType1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTermType1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTermType1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTermType1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTermType1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermRelation_in_entryRuleTermRelation1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermRelation1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTermRelation1804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34_in_ruleTermRelation1833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35_in_ruleTermRelation1862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRefTerm_in_ruleTermRelation1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTerm_in_entryRuleRefTerm1935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTerm1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefTerm1987 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefTerm2005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefTerm2022 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder2065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStakeholder2112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder2129 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStakeholder2146 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleStakeholder2159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder2176 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStakeholder2195 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_36_in_ruleStakeholder2215 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37_in_ruleStakeholder2244 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38_in_ruleStakeholder2273 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39_in_ruleStakeholder2302 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40_in_ruleStakeholder2331 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleStakeholder2359 = new BitSet(new long[]{0x03FFFC0000000000L});
    public static final BitSet FOLLOW_42_in_ruleStakeholder2379 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_43_in_ruleStakeholder2408 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_44_in_ruleStakeholder2437 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_45_in_ruleStakeholder2466 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_46_in_ruleStakeholder2495 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_47_in_ruleStakeholder2524 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_48_in_ruleStakeholder2553 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_49_in_ruleStakeholder2582 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_50_in_ruleStakeholder2611 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_51_in_ruleStakeholder2640 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_52_in_ruleStakeholder2669 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_53_in_ruleStakeholder2698 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_54_in_ruleStakeholder2727 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_55_in_ruleStakeholder2756 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_56_in_ruleStakeholder2785 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_57_in_ruleStakeholder2814 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_14_in_ruleStakeholder2843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder2860 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleStakeholder2880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder2900 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStakeholder2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleGoal2997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3014 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoal3031 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleGoal3044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3061 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGoal3080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3097 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGoal3115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3135 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleGoal3149 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60_in_ruleGoal3169 = new BitSet(new long[]{0x0000000000010000L,0x000000000000007EL});
    public static final BitSet FOLLOW_61_in_ruleGoal3198 = new BitSet(new long[]{0x0000000000010000L,0x000000000000007EL});
    public static final BitSet FOLLOW_62_in_ruleGoal3227 = new BitSet(new long[]{0x0000000000010000L,0x000000000000007EL});
    public static final BitSet FOLLOW_63_in_ruleGoal3256 = new BitSet(new long[]{0x0000000000010000L,0x000000000000007EL});
    public static final BitSet FOLLOW_64_in_ruleGoal3285 = new BitSet(new long[]{0x0000000000010000L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleDependsOnGoal_in_ruleGoal3322 = new BitSet(new long[]{0x0000000000010000L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleComposedBy_in_ruleGoal3344 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000040L});
    public static final BitSet FOLLOW_16_in_ruleGoal3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnGoal_in_entryRuleDependsOnGoal3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnGoal3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDependsOnGoal3448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_66_in_ruleDependsOnGoal3477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_67_in_ruleDependsOnGoal3506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDependsOnGoal3535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_69_in_ruleDependsOnGoal3564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleDependsOnGoal3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComposedBy_in_entryRuleComposedBy3637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComposedBy3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleComposedBy3684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleComposedBy3704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_72_in_ruleComposedBy3733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleComposedBy3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGoal_in_entryRuleRefGoal3806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGoal3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal3861 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefGoal3874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal3894 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity3932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEntity3979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3996 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity4013 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEntity4026 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity4043 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity4062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity4079 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_21_in_ruleEntity4097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleEntity4117 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_74_in_ruleEntity4146 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity4185 = new BitSet(new long[]{0x0000000000210000L,0x0000000800000800L});
    public static final BitSet FOLLOW_ruleForeignKey_in_ruleEntity4207 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEntity4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAttribute4303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute4337 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute4350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4367 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttribute4386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4403 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAttribute4420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FFF000L});
    public static final BitSet FOLLOW_76_in_ruleAttribute4440 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_77_in_ruleAttribute4469 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_78_in_ruleAttribute4498 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_79_in_ruleAttribute4527 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_80_in_ruleAttribute4556 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_81_in_ruleAttribute4585 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_82_in_ruleAttribute4614 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_83_in_ruleAttribute4643 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_84_in_ruleAttribute4672 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_85_in_ruleAttribute4701 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_86_in_ruleAttribute4730 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_87_in_ruleAttribute4759 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleField_in_ruleAttribute4796 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttribute4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField4844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleField4891 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField4903 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleField4915 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField4932 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleField4949 = new BitSet(new long[]{0x0000000000000020L,0x0000000780000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleField4970 = new BitSet(new long[]{0x0000000000010000L,0x0000000078000000L});
    public static final BitSet FOLLOW_91_in_ruleField4983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField5000 = new BitSet(new long[]{0x0000000000010000L,0x0000000070000000L});
    public static final BitSet FOLLOW_92_in_ruleField5020 = new BitSet(new long[]{0x0000000000010000L,0x0000000060000000L});
    public static final BitSet FOLLOW_93_in_ruleField5035 = new BitSet(new long[]{0x0000000000010000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleField5050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField5067 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleField5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity5122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleMultiplicity5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleMultiplicity5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleMultiplicity5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleMultiplicity5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiplicity5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_entryRuleForeignKey5334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignKey5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleForeignKey5381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeignKey5401 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleForeignKey5413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_ruleForeignKey5434 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleForeignKey5446 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleForeignKey5458 = new BitSet(new long[]{0x0000000000000020L,0x0000000780000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleForeignKey5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute5515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefAttribute5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute5570 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefAttribute5583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute5603 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor5641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleActor5688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5705 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor5722 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleActor5735 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor5752 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor5771 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_102_in_ruleActor5791 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_103_in_ruleActor5820 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_104_in_ruleActor5849 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActor5877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor5894 = new BitSet(new long[]{0x0000000020010000L,0x0000020000000000L});
    public static final BitSet FOLLOW_29_in_ruleActor5912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5932 = new BitSet(new long[]{0x0000000000010000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleActor5947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5967 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActor5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase6017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleUseCase6064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase6081 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase6098 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleUseCase6111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase6128 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUseCase6147 = new BitSet(new long[]{0x0000000000000000L,0x0003F80000000000L});
    public static final BitSet FOLLOW_107_in_ruleUseCase6167 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_108_in_ruleUseCase6196 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_109_in_ruleUseCase6225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_110_in_ruleUseCase6254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_111_in_ruleUseCase6283 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_112_in_ruleUseCase6312 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_113_in_ruleUseCase6341 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUseCase6369 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase6386 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleUseCase6403 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60_in_ruleUseCase6423 = new BitSet(new long[]{0x0000000000000000L,0x081C000000000000L});
    public static final BitSet FOLLOW_61_in_ruleUseCase6452 = new BitSet(new long[]{0x0000000000000000L,0x081C000000000000L});
    public static final BitSet FOLLOW_62_in_ruleUseCase6481 = new BitSet(new long[]{0x0000000000000000L,0x081C000000000000L});
    public static final BitSet FOLLOW_63_in_ruleUseCase6510 = new BitSet(new long[]{0x0000000000000000L,0x081C000000000000L});
    public static final BitSet FOLLOW_64_in_ruleUseCase6539 = new BitSet(new long[]{0x0000000000000000L,0x081C000000000000L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_ruleUseCase6576 = new BitSet(new long[]{0x0000000000000000L,0x081C000000000000L});
    public static final BitSet FOLLOW_114_in_ruleUseCase6590 = new BitSet(new long[]{0x0000000000000010L,0x0018000000000000L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleUseCase6611 = new BitSet(new long[]{0x0000000000000010L,0x0018000000000000L});
    public static final BitSet FOLLOW_115_in_ruleUseCase6627 = new BitSet(new long[]{0x0000000000000010L,0x0010000000000000L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleUseCase6648 = new BitSet(new long[]{0x0000000000000010L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleUseCase6663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase6683 = new BitSet(new long[]{0x0000000000010000L,0x13E0000000000000L});
    public static final BitSet FOLLOW_117_in_ruleUseCase6696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefActor_in_ruleUseCase6717 = new BitSet(new long[]{0x0000000000010000L,0x13C0000000000000L});
    public static final BitSet FOLLOW_118_in_ruleUseCase6732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase6749 = new BitSet(new long[]{0x0000000000010000L,0x1380000000000000L});
    public static final BitSet FOLLOW_119_in_ruleUseCase6769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase6786 = new BitSet(new long[]{0x0000000000010000L,0x1300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleUseCase6806 = new BitSet(new long[]{0x0000000000010010L,0x1200000000000000L});
    public static final BitSet FOLLOW_ruleRefUC_in_ruleUseCase6827 = new BitSet(new long[]{0x0000000000010010L,0x1200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleUseCase6843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase6863 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleUseCase6875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase6895 = new BitSet(new long[]{0x0000000000010000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleUseCase6918 = new BitSet(new long[]{0x0000000000010000L,0x1000000000000000L});
    public static final BitSet FOLLOW_16_in_ruleUseCase6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefFR_in_entryRuleRefFR6967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefFR6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR7022 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefFR7035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR7055 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRefActor_in_entryRuleRefActor7093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefActor7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefActor7148 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefActor7161 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleActor_in_ruleRefActor7182 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRefUC_in_entryRuleRefUC7220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefUC7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC7275 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefUC7288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC7308 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint7346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionPoint7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleExtensionPoint7393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionPoint7410 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleExtensionPoint7428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExtensionPoint7445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario7488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleScenario7535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScenario7552 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleScenario7569 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13_in_ruleScenario7582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario7599 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleScenario7619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario7636 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleScenario7655 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleScenario7675 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleScenario7704 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleScenario7733 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleScenario7761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_128_in_ruleScenario7781 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_129_in_ruleScenario7810 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenario7847 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_16_in_ruleScenario7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep7896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleStep7943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep7960 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStep7977 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleStep7990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep8007 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStep8026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_131_in_ruleStep8046 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_132_in_ruleStep8075 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_133_in_ruleStep8104 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_134_in_ruleStep8133 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_135_in_ruleStep8162 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStep8190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep8207 = new BitSet(new long[]{0x0000000100010000L,0x00C0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_32_in_ruleStep8225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep8245 = new BitSet(new long[]{0x0000000000010000L,0x00C0000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_118_in_ruleStep8260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep8277 = new BitSet(new long[]{0x0000000000010000L,0x0080000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_119_in_ruleStep8297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep8314 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_ruleStep8334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep8354 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStep8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFR_in_entryRuleFR8404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFR8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleFR8451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR8468 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFR8485 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleFR8498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR8515 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFR8534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR8551 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFR8568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_138_in_ruleFR8588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_139_in_ruleFR8617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_140_in_ruleFR8646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_ruleFR8674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_142_in_ruleFR8694 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_143_in_ruleFR8723 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_144_in_ruleFR8752 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFR8781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR8801 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleFR8815 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60_in_ruleFR8835 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_61_in_ruleFR8864 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_62_in_ruleFR8893 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_63_in_ruleFR8922 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_64_in_ruleFR8951 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleDependsOnFR_in_ruleFR8988 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_18_in_ruleFR9002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR9022 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFR9036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnFR_in_entryRuleDependsOnFR9072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnFR9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDependsOnFR9127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_145_in_ruleDependsOnFR9156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDependsOnFR9185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleDependsOnFR9222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFR_in_entryRuleNFR9258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFR9268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleNFR9305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNFR9322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNFR9339 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleNFR9352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR9369 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNFR9388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR9405 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNFR9422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000007F80000L});
    public static final BitSet FOLLOW_147_in_ruleNFR9442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208000000L});
    public static final BitSet FOLLOW_148_in_ruleNFR9471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208000000L});
    public static final BitSet FOLLOW_149_in_ruleNFR9500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208000000L});
    public static final BitSet FOLLOW_150_in_ruleNFR9529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208000000L});
    public static final BitSet FOLLOW_151_in_ruleNFR9558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208000000L});
    public static final BitSet FOLLOW_152_in_ruleNFR9587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208000000L});
    public static final BitSet FOLLOW_153_in_ruleNFR9616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208000000L});
    public static final BitSet FOLLOW_154_in_ruleNFR9645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208000000L});
    public static final BitSet FOLLOW_155_in_ruleNFR9674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000001F0000000L});
    public static final BitSet FOLLOW_156_in_ruleNFR9694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_157_in_ruleNFR9723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_158_in_ruleNFR9752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_159_in_ruleNFR9781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_160_in_ruleNFR9810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_ruleNFR9840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000007C00000080L});
    public static final BitSet FOLLOW_162_in_ruleNFR9860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_163_in_ruleNFR9889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_164_in_ruleNFR9918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_165_in_ruleNFR9947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_166_in_ruleNFR9976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_135_in_ruleNFR10005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_ruleNFR10033 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNFR10050 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNFR10068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNFR10088 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleNFR10102 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60_in_ruleNFR10122 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_61_in_ruleNFR10151 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_62_in_ruleNFR10180 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_63_in_ruleNFR10209 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_64_in_ruleNFR10238 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleDependsOnNFR_in_ruleNFR10275 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000012L,0x0000000000020000L});
    public static final BitSet FOLLOW_18_in_ruleNFR10289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNFR10309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNFR10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnNFR_in_entryRuleDependsOnNFR10359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnNFR10369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDependsOnNFR10414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_145_in_ruleDependsOnNFR10443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDependsOnNFR10472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefNFR_in_ruleDependsOnNFR10509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefNFR_in_entryRuleRefNFR10545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefNFR10555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefNFR10600 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefNFR10613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefNFR10633 = new BitSet(new long[]{0x0000000000080002L});

}