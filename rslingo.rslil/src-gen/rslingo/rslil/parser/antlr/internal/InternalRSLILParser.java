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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "'{'", "'Name'", "'Description'", "'HasSystems'", "'}'", "'System'", "'PartOf'", "','", "'GlossaryTerm'", "'Type'", "'Acronym'", "'POS'", "'Adjective'", "'Adverb'", "'Noun'", "'Verb'", "'Synset'", "'Stakeholder'", "'Entity'", "'Architectural'", "'Actor'", "'Antonym'", "'Hypernym'", "'Synonym'", "'Group.Organization'", "'Group.BusinessUnit'", "'Group.Team'", "'Individual.Person'", "'Individual.ExternalSystem'", "'Category'", "'Business'", "'Business.Customer'", "'Business.Customer.Sponsor'", "'Business.Customer.Champion'", "'Business.User.Direct'", "'Business.User.Indirect'", "'Business.Advisor.DomainExpert'", "'Business.Advisor.Trainer'", "'Business.Advisor.RegulatorAgent'", "'Business.System'", "'Technical'", "'Technical.BusinessAnalyst'", "'Technical.Requirements.Engineer'", "'Technical.Software.Architect'", "'Technical.Software.Designer'", "'Technical.Software.Tester'", "'Goal'", "'Priority'", "'Must'", "'Should'", "'Could'", "'Won\\'t'", "'Requires'", "'Supports'", "'Obstructs'", "'Conflicts'", "'Identical'", "'ComposedBy'", "'Logic-And'", "'Logic-Or'", "'Principal'", "'Secondary'", "'Attribute'", "'Boolean'", "'Integer'", "'Decimal'", "'Currency'", "'Date'", "'Time'", "'Datetime'", "'Enumeration'", "'Text'", "'Regex'", "'URL'", "'Image'", "'Size'", "'Multiplicity'", "'DefaultValue'", "'NotNull'", "'Unique'", "'\"0\"'", "'\"1\"'", "'\"0..1\"'", "'\"*\"'", "'PrimaryKey'", "'('", "')'", "'ForeignKey'", "'Check'", "'User'", "'ExternalSystem'", "'Timer'", "'SpecializedFrom'", "'UseCase'", "'EntityManage'", "'EntityBrowse'", "'EntitySearch'", "'EntityCreate'", "'EntityDelete'", "'EntitySync'", "'Report'", "'Entities'", "'Goals'", "'FunctionalRequirements'", "'ActorInitiates'", "'ActorParticipates'", "'Pre-Conditions'", "'Post-Conditions'", "'Include'", "'Extend'", "'on'", "'as'", "'Master'", "'Detail'", "'Reference'", "'ExtensionPoint'", "'Scenario'", "'Main'", "'Alternative'", "'Exception'", "'ExecutionMode'", "'Sequential'", "'Parallel'", "'Step'", "'ActorPrepareData'", "'ActorCallSystem'", "'SystemExecutes'", "'SystemReturnResult'", "'Other'", "'NextStep'", "'FunctionalRequirement'", "'Functional'", "'Behavioral'", "'Data'", "'Refines'", "'QualityRequirement'", "'Security'", "'Performance'", "'Usability'", "'Appearance'", "'Operational'", "'Maintenance'", "'Cultural'", "'Legal'", "'Sub-Type'", "'Security.Privacy'", "'Security.Integrity'", "'Usability.EaseOfUse'", "'Usability.EaseOfLearn'", "'Usability.Accessibility'", "'Metric'", "'Hours'", "'Mins'", "'Secs'", "'mSecs'", "'Tasks'", "'Value'", "'Constraint'", "'Organizational'", "'Physical'", "'Technological'"
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
    public static final int T__172=172;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__169=169;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* ) ;
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

        EObject lv_qrs_9_0 = null;

        EObject lv_constraints_10_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:79:28: ( ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:2: ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaryTerms_2_0= ruleGlossaryTerm ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_qrs_9_0= ruleQR ) )* ( (lv_constraints_10_0= ruleConstraint ) )*
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

                if ( (LA7_0==105) ) {
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

                if ( (LA8_0==142) ) {
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:242:3: ( (lv_qrs_9_0= ruleQR ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==147) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:243:1: (lv_qrs_9_0= ruleQR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:243:1: (lv_qrs_9_0= ruleQR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:244:3: lv_qrs_9_0= ruleQR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getQrsQRParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQR_in_ruleModel328);
            	    lv_qrs_9_0=ruleQR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
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
            	    break loop9;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:260:3: ( (lv_constraints_10_0= ruleConstraint ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==169) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:261:1: (lv_constraints_10_0= ruleConstraint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:261:1: (lv_constraints_10_0= ruleConstraint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:262:3: lv_constraints_10_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getConstraintsConstraintParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_ruleModel350);
            	    lv_constraints_10_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
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
            	    break loop10;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:286:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:287:2: (iv_ruleProject= ruleProject EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:288:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject387);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject397); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:295:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:298:28: ( (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:299:1: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:299:1: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:299:3: otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProject434); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:303:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:304:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:304:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:305:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject451); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProject468); 

                	newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:325:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:325:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProject481); 

                        	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:329:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:330:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:330:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:331:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject498); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleProject517); 

                	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:351:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:352:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:352:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:353:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject534); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:369:2: (otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:369:4: otherlv_7= 'HasSystems' ( (lv_refSystem_8_0= ruleRefSystem ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleProject552); 

                        	newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getHasSystemsKeyword_6_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:373:1: ( (lv_refSystem_8_0= ruleRefSystem ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:374:1: (lv_refSystem_8_0= ruleRefSystem )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:374:1: (lv_refSystem_8_0= ruleRefSystem )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:375:3: lv_refSystem_8_0= ruleRefSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getRefSystemRefSystemParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefSystem_in_ruleProject573);
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

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleProject587); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:403:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:404:2: (iv_ruleSystem= ruleSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:405:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem623);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem633); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:412:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:415:28: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:416:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:416:1: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:416:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSystem670); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:420:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:421:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:421:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:422:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem687); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem704); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:442:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:442:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSystem717); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:446:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:447:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:447:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:448:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem734); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:464:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:464:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSystem754); 

                        	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:468:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:469:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:469:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:470:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem771); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:486:4: (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:486:6: otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSystem791); 

                        	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getPartOfKeyword_5_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:490:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:491:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:491:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:492:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem811); 

                    		newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getPartOfSystemCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSystem825); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:515:1: entryRuleRefSystem returns [EObject current=null] : iv_ruleRefSystem= ruleRefSystem EOF ;
    public final EObject entryRuleRefSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:516:2: (iv_ruleRefSystem= ruleRefSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:517:2: iv_ruleRefSystem= ruleRefSystem EOF
            {
             newCompositeNode(grammarAccess.getRefSystemRule()); 
            pushFollow(FOLLOW_ruleRefSystem_in_entryRuleRefSystem861);
            iv_ruleRefSystem=ruleRefSystem();

            state._fsp--;

             current =iv_ruleRefSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefSystem871); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:524:1: ruleRefSystem returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:527:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:528:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:528:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:528:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:528:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:529:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:529:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:530:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefSystemRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefSystem916); 

            		newLeafNode(otherlv_0, grammarAccess.getRefSystemAccess().getRefSystemSystemCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:541:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:541:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefSystem929); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefSystemAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:545:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:546:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:546:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:547:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefSystemRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefSystem949); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefSystemAccess().getRefsSystemCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:566:1: entryRuleGlossaryTerm returns [EObject current=null] : iv_ruleGlossaryTerm= ruleGlossaryTerm EOF ;
    public final EObject entryRuleGlossaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossaryTerm = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:567:2: (iv_ruleGlossaryTerm= ruleGlossaryTerm EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:568:2: iv_ruleGlossaryTerm= ruleGlossaryTerm EOF
            {
             newCompositeNode(grammarAccess.getGlossaryTermRule()); 
            pushFollow(FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm987);
            iv_ruleGlossaryTerm=ruleGlossaryTerm();

            state._fsp--;

             current =iv_ruleGlossaryTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossaryTerm997); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:575:1: ruleGlossaryTerm returns [EObject current=null] : (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:578:28: ( (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:579:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:579:1: (otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:579:3: otherlv_0= 'GlossaryTerm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( (lv_type_8_0= ruleRefTermType ) ) (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )? (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleGlossaryTerm1034); 

                	newLeafNode(otherlv_0, grammarAccess.getGlossaryTermAccess().getGlossaryTermKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:583:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:584:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:584:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:585:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlossaryTerm1051); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGlossaryTerm1068); 

                	newLeafNode(otherlv_2, grammarAccess.getGlossaryTermAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:605:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:605:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleGlossaryTerm1081); 

                        	newLeafNode(otherlv_3, grammarAccess.getGlossaryTermAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:609:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:610:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:610:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:611:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm1098); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:627:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:627:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleGlossaryTerm1118); 

                        	newLeafNode(otherlv_5, grammarAccess.getGlossaryTermAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:631:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:632:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:632:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:633:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm1135); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleGlossaryTerm1154); 

                	newLeafNode(otherlv_7, grammarAccess.getGlossaryTermAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:653:1: ( (lv_type_8_0= ruleRefTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:654:1: (lv_type_8_0= ruleRefTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:654:1: (lv_type_8_0= ruleRefTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:655:3: lv_type_8_0= ruleRefTermType
            {
             
            	        newCompositeNode(grammarAccess.getGlossaryTermAccess().getTypeRefTermTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleRefTermType_in_ruleGlossaryTerm1175);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:671:2: (otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:671:4: otherlv_9= 'Acronym' ( (lv_acronym_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleGlossaryTerm1188); 

                        	newLeafNode(otherlv_9, grammarAccess.getGlossaryTermAccess().getAcronymKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:675:1: ( (lv_acronym_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:676:1: (lv_acronym_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:676:1: (lv_acronym_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:677:3: lv_acronym_10_0= RULE_STRING
                    {
                    lv_acronym_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm1205); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:693:4: (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:693:6: otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleGlossaryTerm1225); 

                        	newLeafNode(otherlv_11, grammarAccess.getGlossaryTermAccess().getPOSKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:697:1: ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:698:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:698:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:699:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:699:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    int alt20=4;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt20=1;
                        }
                        break;
                    case 25:
                        {
                        alt20=2;
                        }
                        break;
                    case 26:
                        {
                        alt20=3;
                        }
                        break;
                    case 27:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:700:3: lv_pos_12_1= 'Adjective'
                            {
                            lv_pos_12_1=(Token)match(input,24,FOLLOW_24_in_ruleGlossaryTerm1245); 

                                    newLeafNode(lv_pos_12_1, grammarAccess.getGlossaryTermAccess().getPosAdjectiveKeyword_8_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:712:8: lv_pos_12_2= 'Adverb'
                            {
                            lv_pos_12_2=(Token)match(input,25,FOLLOW_25_in_ruleGlossaryTerm1274); 

                                    newLeafNode(lv_pos_12_2, grammarAccess.getGlossaryTermAccess().getPosAdverbKeyword_8_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:724:8: lv_pos_12_3= 'Noun'
                            {
                            lv_pos_12_3=(Token)match(input,26,FOLLOW_26_in_ruleGlossaryTerm1303); 

                                    newLeafNode(lv_pos_12_3, grammarAccess.getGlossaryTermAccess().getPosNounKeyword_8_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryTermRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:736:8: lv_pos_12_4= 'Verb'
                            {
                            lv_pos_12_4=(Token)match(input,27,FOLLOW_27_in_ruleGlossaryTerm1332); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:751:4: (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:751:6: otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleGlossaryTerm1363); 

                        	newLeafNode(otherlv_13, grammarAccess.getGlossaryTermAccess().getSynsetKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:755:1: ( (lv_synset_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:756:1: (lv_synset_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:756:1: (lv_synset_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:757:3: lv_synset_14_0= RULE_STRING
                    {
                    lv_synset_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossaryTerm1380); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:773:4: ( (lv_termRelation_15_0= ruleTermRelation ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=33 && LA23_0<=35)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:774:1: (lv_termRelation_15_0= ruleTermRelation )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:774:1: (lv_termRelation_15_0= ruleTermRelation )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:775:3: lv_termRelation_15_0= ruleTermRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlossaryTermAccess().getTermRelationTermRelationParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTermRelation_in_ruleGlossaryTerm1408);
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
            	    break loop23;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleGlossaryTerm1421); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:803:1: entryRuleRefTermType returns [EObject current=null] : iv_ruleRefTermType= ruleRefTermType EOF ;
    public final EObject entryRuleRefTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:804:2: (iv_ruleRefTermType= ruleRefTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:805:2: iv_ruleRefTermType= ruleRefTermType EOF
            {
             newCompositeNode(grammarAccess.getRefTermTypeRule()); 
            pushFollow(FOLLOW_ruleRefTermType_in_entryRuleRefTermType1457);
            iv_ruleRefTermType=ruleRefTermType();

            state._fsp--;

             current =iv_ruleRefTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTermType1467); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:812:1: ruleRefTermType returns [EObject current=null] : ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) ;
    public final EObject ruleRefTermType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_refType_0_0 = null;

        EObject lv_refs_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:815:28: ( ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:1: ( ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:2: ( (lv_refType_0_0= ruleTermType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:2: ( (lv_refType_0_0= ruleTermType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:817:1: (lv_refType_0_0= ruleTermType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:817:1: (lv_refType_0_0= ruleTermType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:818:3: lv_refType_0_0= ruleTermType
            {
             
            	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefTypeTermTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType1513);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:834:2: (otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:834:4: otherlv_1= ',' ( (lv_refs_2_0= ruleTermType ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefTermType1526); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefTermTypeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:838:1: ( (lv_refs_2_0= ruleTermType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:839:1: (lv_refs_2_0= ruleTermType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:839:1: (lv_refs_2_0= ruleTermType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:840:3: lv_refs_2_0= ruleTermType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefTermTypeAccess().getRefsTermTypeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTermType_in_ruleRefTermType1547);
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
    // $ANTLR end "ruleRefTermType"


    // $ANTLR start "entryRuleTermType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:864:1: entryRuleTermType returns [EObject current=null] : iv_ruleTermType= ruleTermType EOF ;
    public final EObject entryRuleTermType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:865:2: (iv_ruleTermType= ruleTermType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:866:2: iv_ruleTermType= ruleTermType EOF
            {
             newCompositeNode(grammarAccess.getTermTypeRule()); 
            pushFollow(FOLLOW_ruleTermType_in_entryRuleTermType1585);
            iv_ruleTermType=ruleTermType();

            state._fsp--;

             current =iv_ruleTermType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermType1595); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:873:1: ruleTermType returns [EObject current=null] : ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) ;
    public final EObject ruleTermType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:876:28: ( ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:877:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:877:1: ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:878:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:878:1: ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:879:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:879:1: (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt25=1;
                }
                break;
            case 30:
                {
                alt25=2;
                }
                break;
            case 31:
                {
                alt25=3;
                }
                break;
            case 32:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:880:3: lv_type_0_1= 'Stakeholder'
                    {
                    lv_type_0_1=(Token)match(input,29,FOLLOW_29_in_ruleTermType1639); 

                            newLeafNode(lv_type_0_1, grammarAccess.getTermTypeAccess().getTypeStakeholderKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:892:8: lv_type_0_2= 'Entity'
                    {
                    lv_type_0_2=(Token)match(input,30,FOLLOW_30_in_ruleTermType1668); 

                            newLeafNode(lv_type_0_2, grammarAccess.getTermTypeAccess().getTypeEntityKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:904:8: lv_type_0_3= 'Architectural'
                    {
                    lv_type_0_3=(Token)match(input,31,FOLLOW_31_in_ruleTermType1697); 

                            newLeafNode(lv_type_0_3, grammarAccess.getTermTypeAccess().getTypeArchitecturalKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:916:8: lv_type_0_4= 'Actor'
                    {
                    lv_type_0_4=(Token)match(input,32,FOLLOW_32_in_ruleTermType1726); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:939:1: entryRuleTermRelation returns [EObject current=null] : iv_ruleTermRelation= ruleTermRelation EOF ;
    public final EObject entryRuleTermRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermRelation = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:940:2: (iv_ruleTermRelation= ruleTermRelation EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:941:2: iv_ruleTermRelation= ruleTermRelation EOF
            {
             newCompositeNode(grammarAccess.getTermRelationRule()); 
            pushFollow(FOLLOW_ruleTermRelation_in_entryRuleTermRelation1777);
            iv_ruleTermRelation=ruleTermRelation();

            state._fsp--;

             current =iv_ruleTermRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermRelation1787); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:948:1: ruleTermRelation returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) ) ;
    public final EObject ruleTermRelation() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refTerm_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:951:28: ( ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:952:1: ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:952:1: ( ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:952:2: ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) ) ( (lv_refTerm_1_0= ruleRefTerm ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:952:2: ( ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:953:1: ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:953:1: ( (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:954:1: (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:954:1: (lv_type_0_1= 'Antonym' | lv_type_0_2= 'Hypernym' | lv_type_0_3= 'Synonym' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt26=1;
                }
                break;
            case 34:
                {
                alt26=2;
                }
                break;
            case 35:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:955:3: lv_type_0_1= 'Antonym'
                    {
                    lv_type_0_1=(Token)match(input,33,FOLLOW_33_in_ruleTermRelation1832); 

                            newLeafNode(lv_type_0_1, grammarAccess.getTermRelationAccess().getTypeAntonymKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:967:8: lv_type_0_2= 'Hypernym'
                    {
                    lv_type_0_2=(Token)match(input,34,FOLLOW_34_in_ruleTermRelation1861); 

                            newLeafNode(lv_type_0_2, grammarAccess.getTermRelationAccess().getTypeHypernymKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:979:8: lv_type_0_3= 'Synonym'
                    {
                    lv_type_0_3=(Token)match(input,35,FOLLOW_35_in_ruleTermRelation1890); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:994:2: ( (lv_refTerm_1_0= ruleRefTerm ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:995:1: (lv_refTerm_1_0= ruleRefTerm )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:995:1: (lv_refTerm_1_0= ruleRefTerm )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:996:3: lv_refTerm_1_0= ruleRefTerm
            {
             
            	        newCompositeNode(grammarAccess.getTermRelationAccess().getRefTermRefTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefTerm_in_ruleTermRelation1927);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1020:1: entryRuleRefTerm returns [EObject current=null] : iv_ruleRefTerm= ruleRefTerm EOF ;
    public final EObject entryRuleRefTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefTerm = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1021:2: (iv_ruleRefTerm= ruleRefTerm EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1022:2: iv_ruleRefTerm= ruleRefTerm EOF
            {
             newCompositeNode(grammarAccess.getRefTermRule()); 
            pushFollow(FOLLOW_ruleRefTerm_in_entryRuleRefTerm1963);
            iv_ruleRefTerm=ruleRefTerm();

            state._fsp--;

             current =iv_ruleRefTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefTerm1973); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1029:1: ruleRefTerm returns [EObject current=null] : ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleRefTerm() throws RecognitionException {
        EObject current = null;

        Token lv_refTerm_0_0=null;
        Token otherlv_1=null;
        Token lv_refs_2_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1032:28: ( ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1033:1: ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1033:1: ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1033:2: ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1033:2: ( (lv_refTerm_0_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1034:1: (lv_refTerm_0_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1034:1: (lv_refTerm_0_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1035:3: lv_refTerm_0_0= RULE_STRING
            {
            lv_refTerm_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefTerm2015); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1051:2: (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==19) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1051:4: otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefTerm2033); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefTermAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1055:1: ( (lv_refs_2_0= RULE_STRING ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1056:1: (lv_refs_2_0= RULE_STRING )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1056:1: (lv_refs_2_0= RULE_STRING )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1057:3: lv_refs_2_0= RULE_STRING
            	    {
            	    lv_refs_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRefTerm2050); 

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
            	    break loop27;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1081:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1082:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1083:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder2093);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder2103); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1090:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1093:28: ( (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1094:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1094:1: (otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1094:3: otherlv_0= 'Stakeholder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) ) otherlv_9= 'Category' ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) ) (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStakeholder2140); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1098:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1099:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1099:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1100:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder2157); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStakeholder2174); 

                	newLeafNode(otherlv_2, grammarAccess.getStakeholderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1120:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1120:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStakeholder2187); 

                        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1124:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1125:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1125:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1126:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder2204); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1142:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1142:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStakeholder2224); 

                        	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1146:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1147:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1147:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1148:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder2241); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleStakeholder2260); 

                	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1168:1: ( ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1169:1: ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1169:1: ( (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1170:1: (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1170:1: (lv_type_8_1= 'Group.Organization' | lv_type_8_2= 'Group.BusinessUnit' | lv_type_8_3= 'Group.Team' | lv_type_8_4= 'Individual.Person' | lv_type_8_5= 'Individual.ExternalSystem' )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt30=1;
                }
                break;
            case 37:
                {
                alt30=2;
                }
                break;
            case 38:
                {
                alt30=3;
                }
                break;
            case 39:
                {
                alt30=4;
                }
                break;
            case 40:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1171:3: lv_type_8_1= 'Group.Organization'
                    {
                    lv_type_8_1=(Token)match(input,36,FOLLOW_36_in_ruleStakeholder2280); 

                            newLeafNode(lv_type_8_1, grammarAccess.getStakeholderAccess().getTypeGroupOrganizationKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1183:8: lv_type_8_2= 'Group.BusinessUnit'
                    {
                    lv_type_8_2=(Token)match(input,37,FOLLOW_37_in_ruleStakeholder2309); 

                            newLeafNode(lv_type_8_2, grammarAccess.getStakeholderAccess().getTypeGroupBusinessUnitKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1195:8: lv_type_8_3= 'Group.Team'
                    {
                    lv_type_8_3=(Token)match(input,38,FOLLOW_38_in_ruleStakeholder2338); 

                            newLeafNode(lv_type_8_3, grammarAccess.getStakeholderAccess().getTypeGroupTeamKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1207:8: lv_type_8_4= 'Individual.Person'
                    {
                    lv_type_8_4=(Token)match(input,39,FOLLOW_39_in_ruleStakeholder2367); 

                            newLeafNode(lv_type_8_4, grammarAccess.getStakeholderAccess().getTypeIndividualPersonKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1219:8: lv_type_8_5= 'Individual.ExternalSystem'
                    {
                    lv_type_8_5=(Token)match(input,40,FOLLOW_40_in_ruleStakeholder2396); 

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

            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleStakeholder2424); 

                	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getCategoryKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1238:1: ( ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1239:1: ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1239:1: ( (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1240:1: (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1240:1: (lv_category_10_1= 'Business' | lv_category_10_2= 'Business.Customer' | lv_category_10_3= 'Business.Customer.Sponsor' | lv_category_10_4= 'Business.Customer.Champion' | lv_category_10_5= 'Business.User.Direct' | lv_category_10_6= 'Business.User.Indirect' | lv_category_10_7= 'Business.Advisor.DomainExpert' | lv_category_10_8= 'Business.Advisor.Trainer' | lv_category_10_9= 'Business.Advisor.RegulatorAgent' | lv_category_10_10= 'Business.System' | lv_category_10_11= 'Technical' | lv_category_10_12= 'Technical.BusinessAnalyst' | lv_category_10_13= 'Technical.Requirements.Engineer' | lv_category_10_14= 'Technical.Software.Architect' | lv_category_10_15= 'Technical.Software.Designer' | lv_category_10_16= 'Technical.Software.Tester' )
            int alt31=16;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt31=1;
                }
                break;
            case 43:
                {
                alt31=2;
                }
                break;
            case 44:
                {
                alt31=3;
                }
                break;
            case 45:
                {
                alt31=4;
                }
                break;
            case 46:
                {
                alt31=5;
                }
                break;
            case 47:
                {
                alt31=6;
                }
                break;
            case 48:
                {
                alt31=7;
                }
                break;
            case 49:
                {
                alt31=8;
                }
                break;
            case 50:
                {
                alt31=9;
                }
                break;
            case 51:
                {
                alt31=10;
                }
                break;
            case 52:
                {
                alt31=11;
                }
                break;
            case 53:
                {
                alt31=12;
                }
                break;
            case 54:
                {
                alt31=13;
                }
                break;
            case 55:
                {
                alt31=14;
                }
                break;
            case 56:
                {
                alt31=15;
                }
                break;
            case 57:
                {
                alt31=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1241:3: lv_category_10_1= 'Business'
                    {
                    lv_category_10_1=(Token)match(input,42,FOLLOW_42_in_ruleStakeholder2444); 

                            newLeafNode(lv_category_10_1, grammarAccess.getStakeholderAccess().getCategoryBusinessKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1253:8: lv_category_10_2= 'Business.Customer'
                    {
                    lv_category_10_2=(Token)match(input,43,FOLLOW_43_in_ruleStakeholder2473); 

                            newLeafNode(lv_category_10_2, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1265:8: lv_category_10_3= 'Business.Customer.Sponsor'
                    {
                    lv_category_10_3=(Token)match(input,44,FOLLOW_44_in_ruleStakeholder2502); 

                            newLeafNode(lv_category_10_3, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerSponsorKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1277:8: lv_category_10_4= 'Business.Customer.Champion'
                    {
                    lv_category_10_4=(Token)match(input,45,FOLLOW_45_in_ruleStakeholder2531); 

                            newLeafNode(lv_category_10_4, grammarAccess.getStakeholderAccess().getCategoryBusinessCustomerChampionKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1289:8: lv_category_10_5= 'Business.User.Direct'
                    {
                    lv_category_10_5=(Token)match(input,46,FOLLOW_46_in_ruleStakeholder2560); 

                            newLeafNode(lv_category_10_5, grammarAccess.getStakeholderAccess().getCategoryBusinessUserDirectKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1301:8: lv_category_10_6= 'Business.User.Indirect'
                    {
                    lv_category_10_6=(Token)match(input,47,FOLLOW_47_in_ruleStakeholder2589); 

                            newLeafNode(lv_category_10_6, grammarAccess.getStakeholderAccess().getCategoryBusinessUserIndirectKeyword_8_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1313:8: lv_category_10_7= 'Business.Advisor.DomainExpert'
                    {
                    lv_category_10_7=(Token)match(input,48,FOLLOW_48_in_ruleStakeholder2618); 

                            newLeafNode(lv_category_10_7, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorDomainExpertKeyword_8_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1325:8: lv_category_10_8= 'Business.Advisor.Trainer'
                    {
                    lv_category_10_8=(Token)match(input,49,FOLLOW_49_in_ruleStakeholder2647); 

                            newLeafNode(lv_category_10_8, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorTrainerKeyword_8_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1337:8: lv_category_10_9= 'Business.Advisor.RegulatorAgent'
                    {
                    lv_category_10_9=(Token)match(input,50,FOLLOW_50_in_ruleStakeholder2676); 

                            newLeafNode(lv_category_10_9, grammarAccess.getStakeholderAccess().getCategoryBusinessAdvisorRegulatorAgentKeyword_8_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1349:8: lv_category_10_10= 'Business.System'
                    {
                    lv_category_10_10=(Token)match(input,51,FOLLOW_51_in_ruleStakeholder2705); 

                            newLeafNode(lv_category_10_10, grammarAccess.getStakeholderAccess().getCategoryBusinessSystemKeyword_8_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1361:8: lv_category_10_11= 'Technical'
                    {
                    lv_category_10_11=(Token)match(input,52,FOLLOW_52_in_ruleStakeholder2734); 

                            newLeafNode(lv_category_10_11, grammarAccess.getStakeholderAccess().getCategoryTechnicalKeyword_8_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1373:8: lv_category_10_12= 'Technical.BusinessAnalyst'
                    {
                    lv_category_10_12=(Token)match(input,53,FOLLOW_53_in_ruleStakeholder2763); 

                            newLeafNode(lv_category_10_12, grammarAccess.getStakeholderAccess().getCategoryTechnicalBusinessAnalystKeyword_8_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_12, null);
                    	    

                    }
                    break;
                case 13 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1385:8: lv_category_10_13= 'Technical.Requirements.Engineer'
                    {
                    lv_category_10_13=(Token)match(input,54,FOLLOW_54_in_ruleStakeholder2792); 

                            newLeafNode(lv_category_10_13, grammarAccess.getStakeholderAccess().getCategoryTechnicalRequirementsEngineerKeyword_8_0_12());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_13, null);
                    	    

                    }
                    break;
                case 14 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1397:8: lv_category_10_14= 'Technical.Software.Architect'
                    {
                    lv_category_10_14=(Token)match(input,55,FOLLOW_55_in_ruleStakeholder2821); 

                            newLeafNode(lv_category_10_14, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareArchitectKeyword_8_0_13());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_14, null);
                    	    

                    }
                    break;
                case 15 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1409:8: lv_category_10_15= 'Technical.Software.Designer'
                    {
                    lv_category_10_15=(Token)match(input,56,FOLLOW_56_in_ruleStakeholder2850); 

                            newLeafNode(lv_category_10_15, grammarAccess.getStakeholderAccess().getCategoryTechnicalSoftwareDesignerKeyword_8_0_14());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_10_15, null);
                    	    

                    }
                    break;
                case 16 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1421:8: lv_category_10_16= 'Technical.Software.Tester'
                    {
                    lv_category_10_16=(Token)match(input,57,FOLLOW_57_in_ruleStakeholder2879); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1436:2: (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1436:4: otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleStakeholder2908); 

                        	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getPartOfKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1440:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1441:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1441:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1442:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder2928); 

                    		newLeafNode(otherlv_12, grammarAccess.getStakeholderAccess().getPartOfStakeholderCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleStakeholder2942); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1465:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1466:2: (iv_ruleGoal= ruleGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1467:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2978);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2988); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1474:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1477:28: ( (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1478:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1478:1: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1478:3: otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Priority' ( (lv_priority_10_0= rulePriority ) ) ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )* ( (lv_composedBy_12_0= ruleComposedBy ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleGoal3025); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1482:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1483:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1483:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1484:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3042); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoal3059); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1504:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1504:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleGoal3072); 

                        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1508:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1509:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1509:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1510:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3089); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1526:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==14) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1526:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleGoal3109); 

                        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1530:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1531:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1531:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1532:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3126); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1548:4: (otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1548:6: otherlv_7= 'Stakeholder' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleGoal3146); 

                        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getStakeholderKeyword_5_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1552:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1553:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1553:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1554:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3166); 

                    		newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getStakeholderStakeholderCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,59,FOLLOW_59_in_ruleGoal3180); 

                	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getPriorityKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1569:1: ( (lv_priority_10_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1570:1: (lv_priority_10_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1570:1: (lv_priority_10_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1571:3: lv_priority_10_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getGoalAccess().getPriorityPriorityParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleGoal3201);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1587:2: ( (lv_dependsOn_11_0= ruleDependsOnGoal ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=64 && LA36_0<=68)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1588:1: (lv_dependsOn_11_0= ruleDependsOnGoal )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1588:1: (lv_dependsOn_11_0= ruleDependsOnGoal )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1589:3: lv_dependsOn_11_0= ruleDependsOnGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDependsOnDependsOnGoalParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnGoal_in_ruleGoal3222);
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
            	    break loop36;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1605:3: ( (lv_composedBy_12_0= ruleComposedBy ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==69) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1606:1: (lv_composedBy_12_0= ruleComposedBy )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1606:1: (lv_composedBy_12_0= ruleComposedBy )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1607:3: lv_composedBy_12_0= ruleComposedBy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getComposedByComposedByParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComposedBy_in_ruleGoal3244);
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
            	    break loop37;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleGoal3257); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1635:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1636:2: (iv_rulePriority= rulePriority EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1637:2: iv_rulePriority= rulePriority EOF
            {
             newCompositeNode(grammarAccess.getPriorityRule()); 
            pushFollow(FOLLOW_rulePriority_in_entryRulePriority3293);
            iv_rulePriority=rulePriority();

            state._fsp--;

             current =iv_rulePriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePriority3303); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1644:1: rulePriority returns [EObject current=null] : ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1647:28: ( ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1648:1: ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1648:1: ( ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1649:1: ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1649:1: ( (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1650:1: (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1650:1: (lv_value_0_1= 'Must' | lv_value_0_2= 'Should' | lv_value_0_3= 'Could' | lv_value_0_4= 'Won\\'t' )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt38=1;
                }
                break;
            case 61:
                {
                alt38=2;
                }
                break;
            case 62:
                {
                alt38=3;
                }
                break;
            case 63:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1651:3: lv_value_0_1= 'Must'
                    {
                    lv_value_0_1=(Token)match(input,60,FOLLOW_60_in_rulePriority3347); 

                            newLeafNode(lv_value_0_1, grammarAccess.getPriorityAccess().getValueMustKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1663:8: lv_value_0_2= 'Should'
                    {
                    lv_value_0_2=(Token)match(input,61,FOLLOW_61_in_rulePriority3376); 

                            newLeafNode(lv_value_0_2, grammarAccess.getPriorityAccess().getValueShouldKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1675:8: lv_value_0_3= 'Could'
                    {
                    lv_value_0_3=(Token)match(input,62,FOLLOW_62_in_rulePriority3405); 

                            newLeafNode(lv_value_0_3, grammarAccess.getPriorityAccess().getValueCouldKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriorityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1687:8: lv_value_0_4= 'Won\\'t'
                    {
                    lv_value_0_4=(Token)match(input,63,FOLLOW_63_in_rulePriority3434); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1710:1: entryRuleDependsOnGoal returns [EObject current=null] : iv_ruleDependsOnGoal= ruleDependsOnGoal EOF ;
    public final EObject entryRuleDependsOnGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1711:2: (iv_ruleDependsOnGoal= ruleDependsOnGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1712:2: iv_ruleDependsOnGoal= ruleDependsOnGoal EOF
            {
             newCompositeNode(grammarAccess.getDependsOnGoalRule()); 
            pushFollow(FOLLOW_ruleDependsOnGoal_in_entryRuleDependsOnGoal3485);
            iv_ruleDependsOnGoal=ruleDependsOnGoal();

            state._fsp--;

             current =iv_ruleDependsOnGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnGoal3495); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1719:1: ruleDependsOnGoal returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1722:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1723:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1723:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1723:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (lv_refGoal_1_0= ruleRefGoal ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1723:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1724:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1724:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1725:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1725:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt39=1;
                }
                break;
            case 65:
                {
                alt39=2;
                }
                break;
            case 66:
                {
                alt39=3;
                }
                break;
            case 67:
                {
                alt39=4;
                }
                break;
            case 68:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1726:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,64,FOLLOW_64_in_ruleDependsOnGoal3540); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnGoalAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1738:8: lv_type_0_2= 'Supports'
                    {
                    lv_type_0_2=(Token)match(input,65,FOLLOW_65_in_ruleDependsOnGoal3569); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnGoalAccess().getTypeSupportsKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1750:8: lv_type_0_3= 'Obstructs'
                    {
                    lv_type_0_3=(Token)match(input,66,FOLLOW_66_in_ruleDependsOnGoal3598); 

                            newLeafNode(lv_type_0_3, grammarAccess.getDependsOnGoalAccess().getTypeObstructsKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1762:8: lv_type_0_4= 'Conflicts'
                    {
                    lv_type_0_4=(Token)match(input,67,FOLLOW_67_in_ruleDependsOnGoal3627); 

                            newLeafNode(lv_type_0_4, grammarAccess.getDependsOnGoalAccess().getTypeConflictsKeyword_0_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1774:8: lv_type_0_5= 'Identical'
                    {
                    lv_type_0_5=(Token)match(input,68,FOLLOW_68_in_ruleDependsOnGoal3656); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1789:2: ( (lv_refGoal_1_0= ruleRefGoal ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1790:1: (lv_refGoal_1_0= ruleRefGoal )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1790:1: (lv_refGoal_1_0= ruleRefGoal )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1791:3: lv_refGoal_1_0= ruleRefGoal
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnGoalAccess().getRefGoalRefGoalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefGoal_in_ruleDependsOnGoal3693);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1815:1: entryRuleComposedBy returns [EObject current=null] : iv_ruleComposedBy= ruleComposedBy EOF ;
    public final EObject entryRuleComposedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposedBy = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1816:2: (iv_ruleComposedBy= ruleComposedBy EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1817:2: iv_ruleComposedBy= ruleComposedBy EOF
            {
             newCompositeNode(grammarAccess.getComposedByRule()); 
            pushFollow(FOLLOW_ruleComposedBy_in_entryRuleComposedBy3729);
            iv_ruleComposedBy=ruleComposedBy();

            state._fsp--;

             current =iv_ruleComposedBy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComposedBy3739); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1824:1: ruleComposedBy returns [EObject current=null] : (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) ) ;
    public final EObject ruleComposedBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        EObject lv_refGoal_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1827:28: ( (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1828:1: (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1828:1: (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1828:3: otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) ) ( (lv_refGoal_2_0= ruleRefGoal ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleComposedBy3776); 

                	newLeafNode(otherlv_0, grammarAccess.getComposedByAccess().getComposedByKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1832:1: ( ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1833:1: ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1833:1: ( (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1834:1: (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1834:1: (lv_type_1_1= 'Logic-And' | lv_type_1_2= 'Logic-Or' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==70) ) {
                alt40=1;
            }
            else if ( (LA40_0==71) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1835:3: lv_type_1_1= 'Logic-And'
                    {
                    lv_type_1_1=(Token)match(input,70,FOLLOW_70_in_ruleComposedBy3796); 

                            newLeafNode(lv_type_1_1, grammarAccess.getComposedByAccess().getTypeLogicAndKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComposedByRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1847:8: lv_type_1_2= 'Logic-Or'
                    {
                    lv_type_1_2=(Token)match(input,71,FOLLOW_71_in_ruleComposedBy3825); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1862:2: ( (lv_refGoal_2_0= ruleRefGoal ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1863:1: (lv_refGoal_2_0= ruleRefGoal )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1863:1: (lv_refGoal_2_0= ruleRefGoal )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1864:3: lv_refGoal_2_0= ruleRefGoal
            {
             
            	        newCompositeNode(grammarAccess.getComposedByAccess().getRefGoalRefGoalParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRefGoal_in_ruleComposedBy3862);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1888:1: entryRuleRefGoal returns [EObject current=null] : iv_ruleRefGoal= ruleRefGoal EOF ;
    public final EObject entryRuleRefGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1889:2: (iv_ruleRefGoal= ruleRefGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1890:2: iv_ruleRefGoal= ruleRefGoal EOF
            {
             newCompositeNode(grammarAccess.getRefGoalRule()); 
            pushFollow(FOLLOW_ruleRefGoal_in_entryRuleRefGoal3898);
            iv_ruleRefGoal=ruleRefGoal();

            state._fsp--;

             current =iv_ruleRefGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGoal3908); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1897:1: ruleRefGoal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1900:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1901:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1901:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1901:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1901:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1902:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1902:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1903:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefGoalRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal3953); 

            		newLeafNode(otherlv_0, grammarAccess.getRefGoalAccess().getRefGoalGoalCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1914:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==19) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1914:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefGoal3966); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefGoalAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1918:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1919:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1919:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1920:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefGoalRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal3986); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefGoalAccess().getRefsGoalCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1939:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1940:2: (iv_ruleEntity= ruleEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1941:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity4024);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity4034); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1948:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1951:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1952:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1952:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1952:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )+ ( (lv_primaryKey_10_0= rulePrimaryKey ) )? ( (lv_foreignKeys_11_0= ruleForeignKey ) )* ( (lv_checks_12_0= ruleCheck ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleEntity4071); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1956:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1957:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1957:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1958:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity4088); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity4105); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1978:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1978:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEntity4118); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1982:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1983:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1983:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1984:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity4135); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2000:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==14) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2000:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntity4155); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2004:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2005:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2005:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2006:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity4172); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2022:4: (otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2022:6: otherlv_7= 'Type' ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleEntity4192); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getTypeKeyword_5_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2026:1: ( ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2027:1: ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2027:1: ( (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2028:1: (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2028:1: (lv_type_8_1= 'Principal' | lv_type_8_2= 'Secondary' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==72) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==73) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2029:3: lv_type_8_1= 'Principal'
                            {
                            lv_type_8_1=(Token)match(input,72,FOLLOW_72_in_ruleEntity4212); 

                                    newLeafNode(lv_type_8_1, grammarAccess.getEntityAccess().getTypePrincipalKeyword_5_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEntityRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_8_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2041:8: lv_type_8_2= 'Secondary'
                            {
                            lv_type_8_2=(Token)match(input,73,FOLLOW_73_in_ruleEntity4241); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2056:4: ( (lv_attributes_9_0= ruleAttribute ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==74) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2057:1: (lv_attributes_9_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2057:1: (lv_attributes_9_0= ruleAttribute )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2058:3: lv_attributes_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity4280);
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
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2074:3: ( (lv_primaryKey_10_0= rulePrimaryKey ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==96) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2075:1: (lv_primaryKey_10_0= rulePrimaryKey )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2075:1: (lv_primaryKey_10_0= rulePrimaryKey )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2076:3: lv_primaryKey_10_0= rulePrimaryKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getPrimaryKeyPrimaryKeyParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryKey_in_ruleEntity4302);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2092:3: ( (lv_foreignKeys_11_0= ruleForeignKey ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==99) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2093:1: (lv_foreignKeys_11_0= ruleForeignKey )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2093:1: (lv_foreignKeys_11_0= ruleForeignKey )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2094:3: lv_foreignKeys_11_0= ruleForeignKey
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getForeignKeysForeignKeyParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleForeignKey_in_ruleEntity4324);
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
            	    break loop48;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2110:3: ( (lv_checks_12_0= ruleCheck ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==100) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2111:1: (lv_checks_12_0= ruleCheck )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2111:1: (lv_checks_12_0= ruleCheck )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2112:3: lv_checks_12_0= ruleCheck
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getChecksCheckParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCheck_in_ruleEntity4346);
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
            	    break loop49;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleEntity4359); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2140:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2141:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2142:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4395);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4405); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2149:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2152:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2153:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2153:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2153:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) ) (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )? (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )? (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )? ( (lv_notNull_15_0= 'NotNull' ) )? ( (lv_unique_16_0= 'Unique' ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleAttribute4442); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2157:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2158:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2158:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2159:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4459); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute4476); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2179:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==13) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2179:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAttribute4489); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2183:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2184:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2184:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2185:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4506); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2201:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==14) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2201:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAttribute4526); 

                        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2205:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2206:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2206:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2207:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute4543); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleAttribute4562); 

                	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2227:1: ( ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2228:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2228:1: ( (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2229:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2229:1: (lv_type_8_1= 'Boolean' | lv_type_8_2= 'Integer' | lv_type_8_3= 'Decimal' | lv_type_8_4= 'Currency' | lv_type_8_5= 'Date' | lv_type_8_6= 'Time' | lv_type_8_7= 'Datetime' | lv_type_8_8= 'Enumeration' | lv_type_8_9= 'Text' | lv_type_8_10= 'Regex' | lv_type_8_11= 'URL' | lv_type_8_12= 'Image' )
            int alt52=12;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt52=1;
                }
                break;
            case 76:
                {
                alt52=2;
                }
                break;
            case 77:
                {
                alt52=3;
                }
                break;
            case 78:
                {
                alt52=4;
                }
                break;
            case 79:
                {
                alt52=5;
                }
                break;
            case 80:
                {
                alt52=6;
                }
                break;
            case 81:
                {
                alt52=7;
                }
                break;
            case 82:
                {
                alt52=8;
                }
                break;
            case 83:
                {
                alt52=9;
                }
                break;
            case 84:
                {
                alt52=10;
                }
                break;
            case 85:
                {
                alt52=11;
                }
                break;
            case 86:
                {
                alt52=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2230:3: lv_type_8_1= 'Boolean'
                    {
                    lv_type_8_1=(Token)match(input,75,FOLLOW_75_in_ruleAttribute4582); 

                            newLeafNode(lv_type_8_1, grammarAccess.getAttributeAccess().getTypeBooleanKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2242:8: lv_type_8_2= 'Integer'
                    {
                    lv_type_8_2=(Token)match(input,76,FOLLOW_76_in_ruleAttribute4611); 

                            newLeafNode(lv_type_8_2, grammarAccess.getAttributeAccess().getTypeIntegerKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2254:8: lv_type_8_3= 'Decimal'
                    {
                    lv_type_8_3=(Token)match(input,77,FOLLOW_77_in_ruleAttribute4640); 

                            newLeafNode(lv_type_8_3, grammarAccess.getAttributeAccess().getTypeDecimalKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2266:8: lv_type_8_4= 'Currency'
                    {
                    lv_type_8_4=(Token)match(input,78,FOLLOW_78_in_ruleAttribute4669); 

                            newLeafNode(lv_type_8_4, grammarAccess.getAttributeAccess().getTypeCurrencyKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2278:8: lv_type_8_5= 'Date'
                    {
                    lv_type_8_5=(Token)match(input,79,FOLLOW_79_in_ruleAttribute4698); 

                            newLeafNode(lv_type_8_5, grammarAccess.getAttributeAccess().getTypeDateKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2290:8: lv_type_8_6= 'Time'
                    {
                    lv_type_8_6=(Token)match(input,80,FOLLOW_80_in_ruleAttribute4727); 

                            newLeafNode(lv_type_8_6, grammarAccess.getAttributeAccess().getTypeTimeKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2302:8: lv_type_8_7= 'Datetime'
                    {
                    lv_type_8_7=(Token)match(input,81,FOLLOW_81_in_ruleAttribute4756); 

                            newLeafNode(lv_type_8_7, grammarAccess.getAttributeAccess().getTypeDatetimeKeyword_6_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2314:8: lv_type_8_8= 'Enumeration'
                    {
                    lv_type_8_8=(Token)match(input,82,FOLLOW_82_in_ruleAttribute4785); 

                            newLeafNode(lv_type_8_8, grammarAccess.getAttributeAccess().getTypeEnumerationKeyword_6_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2326:8: lv_type_8_9= 'Text'
                    {
                    lv_type_8_9=(Token)match(input,83,FOLLOW_83_in_ruleAttribute4814); 

                            newLeafNode(lv_type_8_9, grammarAccess.getAttributeAccess().getTypeTextKeyword_6_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2338:8: lv_type_8_10= 'Regex'
                    {
                    lv_type_8_10=(Token)match(input,84,FOLLOW_84_in_ruleAttribute4843); 

                            newLeafNode(lv_type_8_10, grammarAccess.getAttributeAccess().getTypeRegexKeyword_6_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2350:8: lv_type_8_11= 'URL'
                    {
                    lv_type_8_11=(Token)match(input,85,FOLLOW_85_in_ruleAttribute4872); 

                            newLeafNode(lv_type_8_11, grammarAccess.getAttributeAccess().getTypeURLKeyword_6_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2362:8: lv_type_8_12= 'Image'
                    {
                    lv_type_8_12=(Token)match(input,86,FOLLOW_86_in_ruleAttribute4901); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2377:2: (otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==87) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2377:4: otherlv_9= 'Size' ( (lv_size_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,87,FOLLOW_87_in_ruleAttribute4930); 

                        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getSizeKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2381:1: ( (lv_size_10_0= RULE_INT ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2382:1: (lv_size_10_0= RULE_INT )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2382:1: (lv_size_10_0= RULE_INT )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2383:3: lv_size_10_0= RULE_INT
                    {
                    lv_size_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttribute4947); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2399:4: (otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==88) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2399:6: otherlv_11= 'Multiplicity' ( (lv_multiplicity_12_0= ruleMultiplicity ) )
                    {
                    otherlv_11=(Token)match(input,88,FOLLOW_88_in_ruleAttribute4967); 

                        	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getMultiplicityKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2403:1: ( (lv_multiplicity_12_0= ruleMultiplicity ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2404:1: (lv_multiplicity_12_0= ruleMultiplicity )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2404:1: (lv_multiplicity_12_0= ruleMultiplicity )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2405:3: lv_multiplicity_12_0= ruleMultiplicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleAttribute4988);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2421:4: (otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==89) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2421:6: otherlv_13= 'DefaultValue' ( (lv_defaultValue_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,89,FOLLOW_89_in_ruleAttribute5003); 

                        	newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getDefaultValueKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2425:1: ( (lv_defaultValue_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2426:1: (lv_defaultValue_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2426:1: (lv_defaultValue_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2427:3: lv_defaultValue_14_0= RULE_STRING
                    {
                    lv_defaultValue_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute5020); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2443:4: ( (lv_notNull_15_0= 'NotNull' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==90) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2444:1: (lv_notNull_15_0= 'NotNull' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2444:1: (lv_notNull_15_0= 'NotNull' )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2445:3: lv_notNull_15_0= 'NotNull'
                    {
                    lv_notNull_15_0=(Token)match(input,90,FOLLOW_90_in_ruleAttribute5045); 

                            newLeafNode(lv_notNull_15_0, grammarAccess.getAttributeAccess().getNotNullNotNullKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "notNull", lv_notNull_15_0, "NotNull");
                    	    

                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2458:3: ( (lv_unique_16_0= 'Unique' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==91) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2459:1: (lv_unique_16_0= 'Unique' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2459:1: (lv_unique_16_0= 'Unique' )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2460:3: lv_unique_16_0= 'Unique'
                    {
                    lv_unique_16_0=(Token)match(input,91,FOLLOW_91_in_ruleAttribute5077); 

                            newLeafNode(lv_unique_16_0, grammarAccess.getAttributeAccess().getUniqueUniqueKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "unique", lv_unique_16_0, "Unique");
                    	    

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleAttribute5103); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2485:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2486:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2487:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity5139);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity5149); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2494:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2497:28: ( ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2498:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2498:1: ( ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2499:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2499:1: ( (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2500:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2500:1: (lv_value_0_1= '\"0\"' | lv_value_0_2= '\"1\"' | lv_value_0_3= '\"0..1\"' | lv_value_0_4= '\"*\"' | lv_value_0_5= RULE_STRING )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt58=1;
                }
                break;
            case 93:
                {
                alt58=2;
                }
                break;
            case 94:
                {
                alt58=3;
                }
                break;
            case 95:
                {
                alt58=4;
                }
                break;
            case RULE_STRING:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2501:3: lv_value_0_1= '\"0\"'
                    {
                    lv_value_0_1=(Token)match(input,92,FOLLOW_92_in_ruleMultiplicity5193); 

                            newLeafNode(lv_value_0_1, grammarAccess.getMultiplicityAccess().getValue0Keyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2513:8: lv_value_0_2= '\"1\"'
                    {
                    lv_value_0_2=(Token)match(input,93,FOLLOW_93_in_ruleMultiplicity5222); 

                            newLeafNode(lv_value_0_2, grammarAccess.getMultiplicityAccess().getValue1Keyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2525:8: lv_value_0_3= '\"0..1\"'
                    {
                    lv_value_0_3=(Token)match(input,94,FOLLOW_94_in_ruleMultiplicity5251); 

                            newLeafNode(lv_value_0_3, grammarAccess.getMultiplicityAccess().getValue01Keyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2537:8: lv_value_0_4= '\"*\"'
                    {
                    lv_value_0_4=(Token)match(input,95,FOLLOW_95_in_ruleMultiplicity5280); 

                            newLeafNode(lv_value_0_4, grammarAccess.getMultiplicityAccess().getValueQuotationMarkAsteriskQuotationMarkKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicityRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2549:8: lv_value_0_5= RULE_STRING
                    {
                    lv_value_0_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiplicity5308); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2575:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2576:2: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2577:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey5351);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;

             current =iv_rulePrimaryKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryKey5361); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2584:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refTo_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2587:28: ( (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2588:1: (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2588:1: (otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2588:3: otherlv_0= 'PrimaryKey' otherlv_1= '(' ( (lv_refTo_2_0= ruleRefAttribute ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_rulePrimaryKey5398); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPrimaryKeyKeyword_0());
                
            otherlv_1=(Token)match(input,97,FOLLOW_97_in_rulePrimaryKey5410); 

                	newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2596:1: ( (lv_refTo_2_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2597:1: (lv_refTo_2_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2597:1: (lv_refTo_2_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2598:3: lv_refTo_2_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getPrimaryKeyAccess().getRefToRefAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_rulePrimaryKey5431);
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

            otherlv_3=(Token)match(input,98,FOLLOW_98_in_rulePrimaryKey5443); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2626:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2627:2: (iv_ruleForeignKey= ruleForeignKey EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2628:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_ruleForeignKey_in_entryRuleForeignKey5479);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignKey5489); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2635:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2638:28: ( (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2639:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2639:1: (otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2639:3: otherlv_0= 'ForeignKey' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_refTo_3_0= ruleRefAttribute ) ) otherlv_4= ')' otherlv_5= 'Multiplicity' ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            {
            otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleForeignKey5526); 

                	newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getForeignKeyKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2643:1: ( (otherlv_1= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2644:1: (otherlv_1= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2644:1: (otherlv_1= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2645:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForeignKeyRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeignKey5546); 

            		newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getEntityEntityCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,97,FOLLOW_97_in_ruleForeignKey5558); 

                	newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2660:1: ( (lv_refTo_3_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2661:1: (lv_refTo_3_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2661:1: (lv_refTo_3_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2662:3: lv_refTo_3_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getRefToRefAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_ruleForeignKey5579);
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

            otherlv_4=(Token)match(input,98,FOLLOW_98_in_ruleForeignKey5591); 

                	newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,88,FOLLOW_88_in_ruleForeignKey5603); 

                	newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getMultiplicityKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2686:1: ( (lv_multiplicity_6_0= ruleMultiplicity ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2687:1: (lv_multiplicity_6_0= ruleMultiplicity )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2687:1: (lv_multiplicity_6_0= ruleMultiplicity )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2688:3: lv_multiplicity_6_0= ruleMultiplicity
            {
             
            	        newCompositeNode(grammarAccess.getForeignKeyAccess().getMultiplicityMultiplicityParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleForeignKey5624);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2712:1: entryRuleRefAttribute returns [EObject current=null] : iv_ruleRefAttribute= ruleRefAttribute EOF ;
    public final EObject entryRuleRefAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2713:2: (iv_ruleRefAttribute= ruleRefAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2714:2: iv_ruleRefAttribute= ruleRefAttribute EOF
            {
             newCompositeNode(grammarAccess.getRefAttributeRule()); 
            pushFollow(FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute5660);
            iv_ruleRefAttribute=ruleRefAttribute();

            state._fsp--;

             current =iv_ruleRefAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefAttribute5670); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2721:1: ruleRefAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2724:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2725:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2725:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2725:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2725:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2726:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2726:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2727:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute5715); 

            		newLeafNode(otherlv_0, grammarAccess.getRefAttributeAccess().getRefAttrAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2738:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==19) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2738:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefAttribute5728); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefAttributeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2742:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2743:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2743:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2744:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute5748); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefAttributeAccess().getRefsAttributeCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleRefAttribute"


    // $ANTLR start "entryRuleCheck"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2763:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2764:2: (iv_ruleCheck= ruleCheck EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2765:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck5786);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck5796); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2772:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_checkExpression_2_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2775:28: ( (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2776:1: (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2776:1: (otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2776:3: otherlv_0= 'Check' ( (lv_name_1_0= RULE_ID ) ) ( (lv_checkExpression_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleCheck5833); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2780:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2781:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2781:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2782:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheck5850); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2798:2: ( (lv_checkExpression_2_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2799:1: (lv_checkExpression_2_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2799:1: (lv_checkExpression_2_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2800:3: lv_checkExpression_2_0= RULE_STRING
            {
            lv_checkExpression_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheck5872); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2824:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2825:2: (iv_ruleActor= ruleActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2826:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor5913);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor5923); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2833:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2836:28: ( (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2837:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2837:1: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2837:3: otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleActor5960); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2841:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2842:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2842:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2843:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5977); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActor5994); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2863:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2863:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleActor6007); 

                        	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2867:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2868:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2868:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2869:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor6024); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2885:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==14) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2885:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleActor6044); 

                        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2889:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2890:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2890:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2891:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor6061); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleActor6080); 

                	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2911:1: ( ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2912:1: ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2912:1: ( (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2913:1: (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2913:1: (lv_type_8_1= 'User' | lv_type_8_2= 'ExternalSystem' | lv_type_8_3= 'Timer' )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt62=1;
                }
                break;
            case 102:
                {
                alt62=2;
                }
                break;
            case 103:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2914:3: lv_type_8_1= 'User'
                    {
                    lv_type_8_1=(Token)match(input,101,FOLLOW_101_in_ruleActor6100); 

                            newLeafNode(lv_type_8_1, grammarAccess.getActorAccess().getTypeUserKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2926:8: lv_type_8_2= 'ExternalSystem'
                    {
                    lv_type_8_2=(Token)match(input,102,FOLLOW_102_in_ruleActor6129); 

                            newLeafNode(lv_type_8_2, grammarAccess.getActorAccess().getTypeExternalSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2938:8: lv_type_8_3= 'Timer'
                    {
                    lv_type_8_3=(Token)match(input,103,FOLLOW_103_in_ruleActor6158); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2953:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==29) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2953:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleActor6187); 

                        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2957:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2958:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2958:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2959:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor6207); 

                    		newLeafNode(otherlv_10, grammarAccess.getActorAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2970:4: (otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==104) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2970:6: otherlv_11= 'SpecializedFrom' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,104,FOLLOW_104_in_ruleActor6222); 

                        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getSpecializedFromKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2974:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2975:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2975:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2976:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor6242); 

                    		newLeafNode(otherlv_12, grammarAccess.getActorAccess().getActorActorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleActor6256); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2999:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3000:2: (iv_ruleUseCase= ruleUseCase EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3001:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase6292);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase6302); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3008:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3011:28: ( (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3012:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3012:1: (otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3012:3: otherlv_0= 'UseCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) ) (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )* (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )? (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )? otherlv_18= 'ActorInitiates' ( (otherlv_19= RULE_ID ) ) (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )? (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )? (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )? (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )? (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )? ( (lv_scenarios_32_0= ruleScenario ) )* otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleUseCase6339); 

                	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3016:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3017:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3017:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3018:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase6356); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUseCase6373); 

                	newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3038:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==13) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3038:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleUseCase6386); 

                        	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3042:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3043:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3043:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3044:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase6403); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3060:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==14) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3060:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleUseCase6423); 

                        	newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3064:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3065:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3065:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3066:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase6440); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleUseCase6459); 

                	newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3086:1: ( ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3087:1: ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3087:1: ( (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3088:1: (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3088:1: (lv_type_8_1= 'EntityManage' | lv_type_8_2= 'EntityBrowse' | lv_type_8_3= 'EntitySearch' | lv_type_8_4= 'EntityCreate' | lv_type_8_5= 'EntityDelete' | lv_type_8_6= 'EntitySync' | lv_type_8_7= 'Report' )
            int alt67=7;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt67=1;
                }
                break;
            case 107:
                {
                alt67=2;
                }
                break;
            case 108:
                {
                alt67=3;
                }
                break;
            case 109:
                {
                alt67=4;
                }
                break;
            case 110:
                {
                alt67=5;
                }
                break;
            case 111:
                {
                alt67=6;
                }
                break;
            case 112:
                {
                alt67=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3089:3: lv_type_8_1= 'EntityManage'
                    {
                    lv_type_8_1=(Token)match(input,106,FOLLOW_106_in_ruleUseCase6479); 

                            newLeafNode(lv_type_8_1, grammarAccess.getUseCaseAccess().getTypeEntityManageKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3101:8: lv_type_8_2= 'EntityBrowse'
                    {
                    lv_type_8_2=(Token)match(input,107,FOLLOW_107_in_ruleUseCase6508); 

                            newLeafNode(lv_type_8_2, grammarAccess.getUseCaseAccess().getTypeEntityBrowseKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3113:8: lv_type_8_3= 'EntitySearch'
                    {
                    lv_type_8_3=(Token)match(input,108,FOLLOW_108_in_ruleUseCase6537); 

                            newLeafNode(lv_type_8_3, grammarAccess.getUseCaseAccess().getTypeEntitySearchKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3125:8: lv_type_8_4= 'EntityCreate'
                    {
                    lv_type_8_4=(Token)match(input,109,FOLLOW_109_in_ruleUseCase6566); 

                            newLeafNode(lv_type_8_4, grammarAccess.getUseCaseAccess().getTypeEntityCreateKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3137:8: lv_type_8_5= 'EntityDelete'
                    {
                    lv_type_8_5=(Token)match(input,110,FOLLOW_110_in_ruleUseCase6595); 

                            newLeafNode(lv_type_8_5, grammarAccess.getUseCaseAccess().getTypeEntityDeleteKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3149:8: lv_type_8_6= 'EntitySync'
                    {
                    lv_type_8_6=(Token)match(input,111,FOLLOW_111_in_ruleUseCase6624); 

                            newLeafNode(lv_type_8_6, grammarAccess.getUseCaseAccess().getTypeEntitySyncKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3161:8: lv_type_8_7= 'Report'
                    {
                    lv_type_8_7=(Token)match(input,112,FOLLOW_112_in_ruleUseCase6653); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3176:2: (otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==113) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3176:4: otherlv_9= 'Entities' ( (lv_entities_10_0= ruleRefEntity ) )
                    {
                    otherlv_9=(Token)match(input,113,FOLLOW_113_in_ruleUseCase6682); 

                        	newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getEntitiesKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3180:1: ( (lv_entities_10_0= ruleRefEntity ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3181:1: (lv_entities_10_0= ruleRefEntity )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3181:1: (lv_entities_10_0= ruleRefEntity )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3182:3: lv_entities_10_0= ruleRefEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getEntitiesRefEntityParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefEntity_in_ruleUseCase6703);
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

            otherlv_11=(Token)match(input,59,FOLLOW_59_in_ruleUseCase6717); 

                	newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3202:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3203:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3203:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3204:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getUseCaseAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleUseCase6738);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3220:2: ( (lv_extensionPoints_13_0= ruleExtensionPoint ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==127) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3221:1: (lv_extensionPoints_13_0= ruleExtensionPoint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3221:1: (lv_extensionPoints_13_0= ruleExtensionPoint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3222:3: lv_extensionPoints_13_0= ruleExtensionPoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtensionPoint_in_ruleUseCase6759);
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
            	    break loop69;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3238:3: (otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==114) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3238:5: otherlv_14= 'Goals' ( (lv_goals_15_0= ruleRefGoal ) )*
                    {
                    otherlv_14=(Token)match(input,114,FOLLOW_114_in_ruleUseCase6773); 

                        	newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getGoalsKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3242:1: ( (lv_goals_15_0= ruleRefGoal ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==RULE_ID) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3243:1: (lv_goals_15_0= ruleRefGoal )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3243:1: (lv_goals_15_0= ruleRefGoal )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3244:3: lv_goals_15_0= ruleRefGoal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getGoalsRefGoalParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefGoal_in_ruleUseCase6794);
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
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3260:5: (otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==115) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3260:7: otherlv_16= 'FunctionalRequirements' ( (lv_frs_17_0= ruleRefFR ) )*
                    {
                    otherlv_16=(Token)match(input,115,FOLLOW_115_in_ruleUseCase6810); 

                        	newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getFunctionalRequirementsKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3264:1: ( (lv_frs_17_0= ruleRefFR ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==RULE_ID) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3265:1: (lv_frs_17_0= ruleRefFR )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3265:1: (lv_frs_17_0= ruleRefFR )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3266:3: lv_frs_17_0= ruleRefFR
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getFrsRefFRParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefFR_in_ruleUseCase6831);
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
                    	    break loop72;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,116,FOLLOW_116_in_ruleUseCase6846); 

                	newLeafNode(otherlv_18, grammarAccess.getUseCaseAccess().getActorInitiatesKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3286:1: ( (otherlv_19= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3287:1: (otherlv_19= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3287:1: (otherlv_19= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3288:3: otherlv_19= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
            otherlv_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase6866); 

            		newLeafNode(otherlv_19, grammarAccess.getUseCaseAccess().getActorInitiatesActorCrossReference_14_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3299:2: (otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==117) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3299:4: otherlv_20= 'ActorParticipates' ( (lv_actors_21_0= ruleRefActor ) )
                    {
                    otherlv_20=(Token)match(input,117,FOLLOW_117_in_ruleUseCase6879); 

                        	newLeafNode(otherlv_20, grammarAccess.getUseCaseAccess().getActorParticipatesKeyword_15_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3303:1: ( (lv_actors_21_0= ruleRefActor ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3304:1: (lv_actors_21_0= ruleRefActor )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3304:1: (lv_actors_21_0= ruleRefActor )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3305:3: lv_actors_21_0= ruleRefActor
                    {
                     
                    	        newCompositeNode(grammarAccess.getUseCaseAccess().getActorsRefActorParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefActor_in_ruleUseCase6900);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3321:4: (otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==118) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3321:6: otherlv_22= 'Pre-Conditions' ( (lv_preConditions_23_0= RULE_STRING ) )
                    {
                    otherlv_22=(Token)match(input,118,FOLLOW_118_in_ruleUseCase6915); 

                        	newLeafNode(otherlv_22, grammarAccess.getUseCaseAccess().getPreConditionsKeyword_16_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3325:1: ( (lv_preConditions_23_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3326:1: (lv_preConditions_23_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3326:1: (lv_preConditions_23_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3327:3: lv_preConditions_23_0= RULE_STRING
                    {
                    lv_preConditions_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase6932); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3343:4: (otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==119) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3343:6: otherlv_24= 'Post-Conditions' ( (lv_postConditions_25_0= RULE_STRING ) )
                    {
                    otherlv_24=(Token)match(input,119,FOLLOW_119_in_ruleUseCase6952); 

                        	newLeafNode(otherlv_24, grammarAccess.getUseCaseAccess().getPostConditionsKeyword_17_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3347:1: ( (lv_postConditions_25_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3348:1: (lv_postConditions_25_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3348:1: (lv_postConditions_25_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3349:3: lv_postConditions_25_0= RULE_STRING
                    {
                    lv_postConditions_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase6969); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3365:4: (otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==120) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3365:6: otherlv_26= 'Include' ( (lv_includes_27_0= ruleRefUC ) )*
                    {
                    otherlv_26=(Token)match(input,120,FOLLOW_120_in_ruleUseCase6989); 

                        	newLeafNode(otherlv_26, grammarAccess.getUseCaseAccess().getIncludeKeyword_18_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3369:1: ( (lv_includes_27_0= ruleRefUC ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==RULE_ID) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3370:1: (lv_includes_27_0= ruleRefUC )
                    	    {
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3370:1: (lv_includes_27_0= ruleRefUC )
                    	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3371:3: lv_includes_27_0= ruleRefUC
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getIncludesRefUCParserRuleCall_18_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefUC_in_ruleUseCase7010);
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
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3387:5: (otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==121) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3387:7: otherlv_28= 'Extend' ( (otherlv_29= RULE_ID ) ) otherlv_30= 'on' ( (otherlv_31= RULE_ID ) )
                    {
                    otherlv_28=(Token)match(input,121,FOLLOW_121_in_ruleUseCase7026); 

                        	newLeafNode(otherlv_28, grammarAccess.getUseCaseAccess().getExtendKeyword_19_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3391:1: ( (otherlv_29= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3392:1: (otherlv_29= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3392:1: (otherlv_29= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3393:3: otherlv_29= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase7046); 

                    		newLeafNode(otherlv_29, grammarAccess.getUseCaseAccess().getExtendsUseCaseCrossReference_19_1_0()); 
                    	

                    }


                    }

                    otherlv_30=(Token)match(input,122,FOLLOW_122_in_ruleUseCase7058); 

                        	newLeafNode(otherlv_30, grammarAccess.getUseCaseAccess().getOnKeyword_19_2());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3408:1: ( (otherlv_31= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3409:1: (otherlv_31= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3409:1: (otherlv_31= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3410:3: otherlv_31= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUseCaseRule());
                    	        }
                            
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase7078); 

                    		newLeafNode(otherlv_31, grammarAccess.getUseCaseAccess().getExtPointExtensionPointCrossReference_19_3_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3421:4: ( (lv_scenarios_32_0= ruleScenario ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==128) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3422:1: (lv_scenarios_32_0= ruleScenario )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3422:1: (lv_scenarios_32_0= ruleScenario )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3423:3: lv_scenarios_32_0= ruleScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getScenariosScenarioParserRuleCall_20_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScenario_in_ruleUseCase7101);
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
            	    break loop80;
                }
            } while (true);

            otherlv_33=(Token)match(input,16,FOLLOW_16_in_ruleUseCase7114); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3451:1: entryRuleRefEntity returns [EObject current=null] : iv_ruleRefEntity= ruleRefEntity EOF ;
    public final EObject entryRuleRefEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3452:2: (iv_ruleRefEntity= ruleRefEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3453:2: iv_ruleRefEntity= ruleRefEntity EOF
            {
             newCompositeNode(grammarAccess.getRefEntityRule()); 
            pushFollow(FOLLOW_ruleRefEntity_in_entryRuleRefEntity7150);
            iv_ruleRefEntity=ruleRefEntity();

            state._fsp--;

             current =iv_ruleRefEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefEntity7160); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3460:1: ruleRefEntity returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3463:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3464:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3464:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3464:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleEntityType ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3464:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3465:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3465:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3466:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefEntityRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEntity7205); 

            		newLeafNode(otherlv_0, grammarAccess.getRefEntityAccess().getRefEntityEntityCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,123,FOLLOW_123_in_ruleRefEntity7217); 

                	newLeafNode(otherlv_1, grammarAccess.getRefEntityAccess().getAsKeyword_1());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3481:1: ( (lv_type_2_0= ruleEntityType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3482:1: (lv_type_2_0= ruleEntityType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3482:1: (lv_type_2_0= ruleEntityType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3483:3: lv_type_2_0= ruleEntityType
            {
             
            	        newCompositeNode(grammarAccess.getRefEntityAccess().getTypeEntityTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEntityType_in_ruleRefEntity7238);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3499:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==19) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3499:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'as' ( (lv_refType_6_0= ruleEntityType ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleRefEntity7251); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRefEntityAccess().getCommaKeyword_3_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3503:1: ( (otherlv_4= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3504:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3504:1: (otherlv_4= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3505:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefEntityRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEntity7271); 

            	    		newLeafNode(otherlv_4, grammarAccess.getRefEntityAccess().getRefsEntityCrossReference_3_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_5=(Token)match(input,123,FOLLOW_123_in_ruleRefEntity7283); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRefEntityAccess().getAsKeyword_3_2());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3520:1: ( (lv_refType_6_0= ruleEntityType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3521:1: (lv_refType_6_0= ruleEntityType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3521:1: (lv_refType_6_0= ruleEntityType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3522:3: lv_refType_6_0= ruleEntityType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefEntityAccess().getRefTypeEntityTypeParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityType_in_ruleRefEntity7304);
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
            	    break loop81;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3546:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3547:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3548:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType7342);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType7352); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3555:1: ruleEntityType returns [EObject current=null] : ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3558:28: ( ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3559:1: ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3559:1: ( ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3560:1: ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3560:1: ( (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3561:1: (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3561:1: (lv_type_0_1= 'Master' | lv_type_0_2= 'Detail' | lv_type_0_3= 'Reference' )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt82=1;
                }
                break;
            case 125:
                {
                alt82=2;
                }
                break;
            case 126:
                {
                alt82=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3562:3: lv_type_0_1= 'Master'
                    {
                    lv_type_0_1=(Token)match(input,124,FOLLOW_124_in_ruleEntityType7396); 

                            newLeafNode(lv_type_0_1, grammarAccess.getEntityTypeAccess().getTypeMasterKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3574:8: lv_type_0_2= 'Detail'
                    {
                    lv_type_0_2=(Token)match(input,125,FOLLOW_125_in_ruleEntityType7425); 

                            newLeafNode(lv_type_0_2, grammarAccess.getEntityTypeAccess().getTypeDetailKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3586:8: lv_type_0_3= 'Reference'
                    {
                    lv_type_0_3=(Token)match(input,126,FOLLOW_126_in_ruleEntityType7454); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3609:1: entryRuleRefFR returns [EObject current=null] : iv_ruleRefFR= ruleRefFR EOF ;
    public final EObject entryRuleRefFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3610:2: (iv_ruleRefFR= ruleRefFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3611:2: iv_ruleRefFR= ruleRefFR EOF
            {
             newCompositeNode(grammarAccess.getRefFRRule()); 
            pushFollow(FOLLOW_ruleRefFR_in_entryRuleRefFR7505);
            iv_ruleRefFR=ruleRefFR();

            state._fsp--;

             current =iv_ruleRefFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefFR7515); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3618:1: ruleRefFR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3621:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3622:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3622:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3622:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3622:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3623:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3623:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3624:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefFRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR7560); 

            		newLeafNode(otherlv_0, grammarAccess.getRefFRAccess().getRefFRFRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3635:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==19) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3635:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefFR7573); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefFRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3639:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3640:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3640:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3641:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefFRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR7593); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefFRAccess().getRefsFRCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3660:1: entryRuleRefActor returns [EObject current=null] : iv_ruleRefActor= ruleRefActor EOF ;
    public final EObject entryRuleRefActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3661:2: (iv_ruleRefActor= ruleRefActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3662:2: iv_ruleRefActor= ruleRefActor EOF
            {
             newCompositeNode(grammarAccess.getRefActorRule()); 
            pushFollow(FOLLOW_ruleRefActor_in_entryRuleRefActor7631);
            iv_ruleRefActor=ruleRefActor();

            state._fsp--;

             current =iv_ruleRefActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefActor7641); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3669:1: ruleRefActor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3672:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3673:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3673:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3673:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3673:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3674:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3674:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3675:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefActorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefActor7686); 

            		newLeafNode(otherlv_0, grammarAccess.getRefActorAccess().getRefActorActorCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3686:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==19) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3686:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefActor7699); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefActorAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3690:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3691:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3691:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3692:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefActorRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefActor7719); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefActorAccess().getRefsActorCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3711:1: entryRuleRefUC returns [EObject current=null] : iv_ruleRefUC= ruleRefUC EOF ;
    public final EObject entryRuleRefUC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefUC = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3712:2: (iv_ruleRefUC= ruleRefUC EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3713:2: iv_ruleRefUC= ruleRefUC EOF
            {
             newCompositeNode(grammarAccess.getRefUCRule()); 
            pushFollow(FOLLOW_ruleRefUC_in_entryRuleRefUC7757);
            iv_ruleRefUC=ruleRefUC();

            state._fsp--;

             current =iv_ruleRefUC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefUC7767); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3720:1: ruleRefUC returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefUC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3723:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3724:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3724:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3724:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3724:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3725:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3725:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3726:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefUCRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC7812); 

            		newLeafNode(otherlv_0, grammarAccess.getRefUCAccess().getRefUCUseCaseCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3737:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==19) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3737:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefUC7825); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefUCAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3741:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3742:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3742:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3743:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefUCRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC7845); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefUCAccess().getRefsUseCaseCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3762:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3763:2: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3764:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
            {
             newCompositeNode(grammarAccess.getExtensionPointRule()); 
            pushFollow(FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint7883);
            iv_ruleExtensionPoint=ruleExtensionPoint();

            state._fsp--;

             current =iv_ruleExtensionPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionPoint7893); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3771:1: ruleExtensionPoint returns [EObject current=null] : (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3774:28: ( (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3775:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3775:1: (otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3775:3: otherlv_0= 'ExtensionPoint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,127,FOLLOW_127_in_ruleExtensionPoint7930); 

                	newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getExtensionPointKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3779:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3780:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3780:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3781:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtensionPoint7947); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3797:2: (otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==14) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3797:4: otherlv_2= 'Description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleExtensionPoint7965); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtensionPointAccess().getDescriptionKeyword_2_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3801:1: ( (lv_description_3_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3802:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3802:1: (lv_description_3_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3803:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExtensionPoint7982); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3827:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3828:2: (iv_ruleScenario= ruleScenario EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3829:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario8025);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario8035); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3836:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3839:28: ( (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3840:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3840:1: (otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3840:3: otherlv_0= 'Scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) ) otherlv_9= 'ExecutionMode' ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) ) ( (lv_steps_11_0= ruleStep ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,128,FOLLOW_128_in_ruleScenario8072); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3844:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3845:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3845:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3846:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScenario8089); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleScenario8106); 

                	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3866:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==13) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3866:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleScenario8119); 

                        	newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3870:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3871:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3871:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3872:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario8136); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3888:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==14) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3888:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleScenario8156); 

                        	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3892:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3893:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3893:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3894:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario8173); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleScenario8192); 

                	newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3914:1: ( ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3915:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3915:1: ( (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3916:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3916:1: (lv_type_8_1= 'Main' | lv_type_8_2= 'Alternative' | lv_type_8_3= 'Exception' )
            int alt89=3;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt89=1;
                }
                break;
            case 130:
                {
                alt89=2;
                }
                break;
            case 131:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3917:3: lv_type_8_1= 'Main'
                    {
                    lv_type_8_1=(Token)match(input,129,FOLLOW_129_in_ruleScenario8212); 

                            newLeafNode(lv_type_8_1, grammarAccess.getScenarioAccess().getTypeMainKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3929:8: lv_type_8_2= 'Alternative'
                    {
                    lv_type_8_2=(Token)match(input,130,FOLLOW_130_in_ruleScenario8241); 

                            newLeafNode(lv_type_8_2, grammarAccess.getScenarioAccess().getTypeAlternativeKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3941:8: lv_type_8_3= 'Exception'
                    {
                    lv_type_8_3=(Token)match(input,131,FOLLOW_131_in_ruleScenario8270); 

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

            otherlv_9=(Token)match(input,132,FOLLOW_132_in_ruleScenario8298); 

                	newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getExecutionModeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3960:1: ( ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3961:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3961:1: ( (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3962:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3962:1: (lv_mode_10_1= 'Sequential' | lv_mode_10_2= 'Parallel' )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==133) ) {
                alt90=1;
            }
            else if ( (LA90_0==134) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3963:3: lv_mode_10_1= 'Sequential'
                    {
                    lv_mode_10_1=(Token)match(input,133,FOLLOW_133_in_ruleScenario8318); 

                            newLeafNode(lv_mode_10_1, grammarAccess.getScenarioAccess().getModeSequentialKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "mode", lv_mode_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3975:8: lv_mode_10_2= 'Parallel'
                    {
                    lv_mode_10_2=(Token)match(input,134,FOLLOW_134_in_ruleScenario8347); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3990:2: ( (lv_steps_11_0= ruleStep ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==135) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3991:1: (lv_steps_11_0= ruleStep )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3991:1: (lv_steps_11_0= ruleStep )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3992:3: lv_steps_11_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenario8384);
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
            	    break loop91;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleScenario8397); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4020:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4021:2: (iv_ruleStep= ruleStep EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4022:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep8433);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep8443); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4029:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4032:28: ( (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4033:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4033:1: (otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4033:3: otherlv_0= 'Step' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) ) (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )? (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )? (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,135,FOLLOW_135_in_ruleStep8480); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4037:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4038:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4038:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4039:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep8497); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStep8514); 

                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4059:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==13) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4059:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStep8527); 

                        	newLeafNode(otherlv_3, grammarAccess.getStepAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4063:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4064:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4064:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4065:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep8544); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4081:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==14) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4081:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStep8564); 

                        	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4085:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4086:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4086:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4087:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep8581); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleStep8600); 

                	newLeafNode(otherlv_7, grammarAccess.getStepAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4107:1: ( ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4108:1: ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4108:1: ( (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4109:1: (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4109:1: (lv_type_8_1= 'ActorPrepareData' | lv_type_8_2= 'ActorCallSystem' | lv_type_8_3= 'SystemExecutes' | lv_type_8_4= 'SystemReturnResult' | lv_type_8_5= 'Other' )
            int alt94=5;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt94=1;
                }
                break;
            case 137:
                {
                alt94=2;
                }
                break;
            case 138:
                {
                alt94=3;
                }
                break;
            case 139:
                {
                alt94=4;
                }
                break;
            case 140:
                {
                alt94=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4110:3: lv_type_8_1= 'ActorPrepareData'
                    {
                    lv_type_8_1=(Token)match(input,136,FOLLOW_136_in_ruleStep8620); 

                            newLeafNode(lv_type_8_1, grammarAccess.getStepAccess().getTypeActorPrepareDataKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4122:8: lv_type_8_2= 'ActorCallSystem'
                    {
                    lv_type_8_2=(Token)match(input,137,FOLLOW_137_in_ruleStep8649); 

                            newLeafNode(lv_type_8_2, grammarAccess.getStepAccess().getTypeActorCallSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4134:8: lv_type_8_3= 'SystemExecutes'
                    {
                    lv_type_8_3=(Token)match(input,138,FOLLOW_138_in_ruleStep8678); 

                            newLeafNode(lv_type_8_3, grammarAccess.getStepAccess().getTypeSystemExecutesKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4146:8: lv_type_8_4= 'SystemReturnResult'
                    {
                    lv_type_8_4=(Token)match(input,139,FOLLOW_139_in_ruleStep8707); 

                            newLeafNode(lv_type_8_4, grammarAccess.getStepAccess().getTypeSystemReturnResultKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4158:8: lv_type_8_5= 'Other'
                    {
                    lv_type_8_5=(Token)match(input,140,FOLLOW_140_in_ruleStep8736); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4173:2: (otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==32) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4173:4: otherlv_9= 'Actor' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleStep8765); 

                        	newLeafNode(otherlv_9, grammarAccess.getStepAccess().getActorKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4177:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4178:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4178:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4179:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep8785); 

                    		newLeafNode(otherlv_10, grammarAccess.getStepAccess().getActorActorCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4190:4: (otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==118) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4190:6: otherlv_11= 'Pre-Conditions' ( (lv_preConditions_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,118,FOLLOW_118_in_ruleStep8800); 

                        	newLeafNode(otherlv_11, grammarAccess.getStepAccess().getPreConditionsKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4194:1: ( (lv_preConditions_12_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4195:1: (lv_preConditions_12_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4195:1: (lv_preConditions_12_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4196:3: lv_preConditions_12_0= RULE_STRING
                    {
                    lv_preConditions_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep8817); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4212:4: (otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==119) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4212:6: otherlv_13= 'Post-Conditions' ( (lv_postConditions_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,119,FOLLOW_119_in_ruleStep8837); 

                        	newLeafNode(otherlv_13, grammarAccess.getStepAccess().getPostConditionsKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4216:1: ( (lv_postConditions_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4217:1: (lv_postConditions_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4217:1: (lv_postConditions_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4218:3: lv_postConditions_14_0= RULE_STRING
                    {
                    lv_postConditions_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStep8854); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4234:4: (otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==141) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4234:6: otherlv_15= 'NextStep' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,141,FOLLOW_141_in_ruleStep8874); 

                        	newLeafNode(otherlv_15, grammarAccess.getStepAccess().getNextStepKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4238:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4239:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4239:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4240:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep8894); 

                    		newLeafNode(otherlv_16, grammarAccess.getStepAccess().getNextStepCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleStep8908); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4263:1: entryRuleFR returns [EObject current=null] : iv_ruleFR= ruleFR EOF ;
    public final EObject entryRuleFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4264:2: (iv_ruleFR= ruleFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4265:2: iv_ruleFR= ruleFR EOF
            {
             newCompositeNode(grammarAccess.getFRRule()); 
            pushFollow(FOLLOW_ruleFR_in_entryRuleFR8944);
            iv_ruleFR=ruleFR();

            state._fsp--;

             current =iv_ruleFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFR8954); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4272:1: ruleFR returns [EObject current=null] : (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4275:28: ( (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4276:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4276:1: (otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4276:3: otherlv_0= 'FunctionalRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnFR ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,142,FOLLOW_142_in_ruleFR8991); 

                	newLeafNode(otherlv_0, grammarAccess.getFRAccess().getFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4280:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4281:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4281:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4282:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR9008); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFR9025); 

                	newLeafNode(otherlv_2, grammarAccess.getFRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4302:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==13) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4302:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFR9038); 

                        	newLeafNode(otherlv_3, grammarAccess.getFRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4306:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4307:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4307:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4308:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR9055); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFR9074); 

                	newLeafNode(otherlv_5, grammarAccess.getFRAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4328:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4329:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4329:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4330:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR9091); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleFR9108); 

                	newLeafNode(otherlv_7, grammarAccess.getFRAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4350:1: ( ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4351:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4351:1: ( (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4352:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4352:1: (lv_type_8_1= 'Functional' | lv_type_8_2= 'Behavioral' | lv_type_8_3= 'Data' )
            int alt100=3;
            switch ( input.LA(1) ) {
            case 143:
                {
                alt100=1;
                }
                break;
            case 144:
                {
                alt100=2;
                }
                break;
            case 145:
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
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4353:3: lv_type_8_1= 'Functional'
                    {
                    lv_type_8_1=(Token)match(input,143,FOLLOW_143_in_ruleFR9128); 

                            newLeafNode(lv_type_8_1, grammarAccess.getFRAccess().getTypeFunctionalKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4365:8: lv_type_8_2= 'Behavioral'
                    {
                    lv_type_8_2=(Token)match(input,144,FOLLOW_144_in_ruleFR9157); 

                            newLeafNode(lv_type_8_2, grammarAccess.getFRAccess().getTypeBehavioralKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4377:8: lv_type_8_3= 'Data'
                    {
                    lv_type_8_3=(Token)match(input,145,FOLLOW_145_in_ruleFR9186); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4392:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==29) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4392:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleFR9215); 

                        	newLeafNode(otherlv_9, grammarAccess.getFRAccess().getStakeholderKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4396:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4397:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4397:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4398:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR9235); 

                    		newLeafNode(otherlv_10, grammarAccess.getFRAccess().getStakeholderStakeholderCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,59,FOLLOW_59_in_ruleFR9249); 

                	newLeafNode(otherlv_11, grammarAccess.getFRAccess().getPriorityKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4413:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4414:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4414:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4415:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getFRAccess().getPriorityPriorityParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleFR9270);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4431:2: ( (lv_depends_13_0= ruleDependsOnFR ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==64||LA102_0==67||LA102_0==146) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4432:1: (lv_depends_13_0= ruleDependsOnFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4432:1: (lv_depends_13_0= ruleDependsOnFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4433:3: lv_depends_13_0= ruleDependsOnFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFRAccess().getDependsDependsOnFRParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnFR_in_ruleFR9291);
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
            	    break loop102;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4449:3: (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==18) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4449:5: otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleFR9305); 

                        	newLeafNode(otherlv_14, grammarAccess.getFRAccess().getPartOfKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4453:1: ( (otherlv_15= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4454:1: (otherlv_15= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4454:1: (otherlv_15= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4455:3: otherlv_15= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFRRule());
                    	        }
                            
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR9325); 

                    		newLeafNode(otherlv_15, grammarAccess.getFRAccess().getPartOfFRCrossReference_12_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleFR9339); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4478:1: entryRuleDependsOnFR returns [EObject current=null] : iv_ruleDependsOnFR= ruleDependsOnFR EOF ;
    public final EObject entryRuleDependsOnFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4479:2: (iv_ruleDependsOnFR= ruleDependsOnFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4480:2: iv_ruleDependsOnFR= ruleDependsOnFR EOF
            {
             newCompositeNode(grammarAccess.getDependsOnFRRule()); 
            pushFollow(FOLLOW_ruleDependsOnFR_in_entryRuleDependsOnFR9375);
            iv_ruleDependsOnFR=ruleDependsOnFR();

            state._fsp--;

             current =iv_ruleDependsOnFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnFR9385); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4487:1: ruleDependsOnFR returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) ) ) ;
    public final EObject ruleDependsOnFR() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refFr_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4490:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4491:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4491:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4491:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refFr_1_0= ruleRefFR ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4491:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4492:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4492:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4493:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4493:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            int alt104=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt104=1;
                }
                break;
            case 146:
                {
                alt104=2;
                }
                break;
            case 67:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4494:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,64,FOLLOW_64_in_ruleDependsOnFR9430); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnFRAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4506:8: lv_type_0_2= 'Refines'
                    {
                    lv_type_0_2=(Token)match(input,146,FOLLOW_146_in_ruleDependsOnFR9459); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnFRAccess().getTypeRefinesKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnFRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4518:8: lv_type_0_3= 'Conflicts'
                    {
                    lv_type_0_3=(Token)match(input,67,FOLLOW_67_in_ruleDependsOnFR9488); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4533:2: ( (lv_refFr_1_0= ruleRefFR ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4534:1: (lv_refFr_1_0= ruleRefFR )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4534:1: (lv_refFr_1_0= ruleRefFR )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4535:3: lv_refFr_1_0= ruleRefFR
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnFRAccess().getRefFrRefFRParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefFR_in_ruleDependsOnFR9525);
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


    // $ANTLR start "entryRuleQR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4559:1: entryRuleQR returns [EObject current=null] : iv_ruleQR= ruleQR EOF ;
    public final EObject entryRuleQR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4560:2: (iv_ruleQR= ruleQR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4561:2: iv_ruleQR= ruleQR EOF
            {
             newCompositeNode(grammarAccess.getQRRule()); 
            pushFollow(FOLLOW_ruleQR_in_entryRuleQR9561);
            iv_ruleQR=ruleQR();

            state._fsp--;

             current =iv_ruleQR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQR9571); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4568:1: ruleQR returns [EObject current=null] : (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4571:28: ( (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4572:1: (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4572:1: (otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4572:3: otherlv_0= 'QualityRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) ) (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )? otherlv_11= 'Metric' ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_INT ) ) (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )? otherlv_17= 'Priority' ( (lv_priority_18_0= rulePriority ) ) ( (lv_depends_19_0= ruleDependsOnQR ) )* (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,147,FOLLOW_147_in_ruleQR9608); 

                	newLeafNode(otherlv_0, grammarAccess.getQRAccess().getQualityRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4576:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4577:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4577:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4578:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR9625); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQR9642); 

                	newLeafNode(otherlv_2, grammarAccess.getQRAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4598:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==13) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4598:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleQR9655); 

                        	newLeafNode(otherlv_3, grammarAccess.getQRAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4602:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4603:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4603:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4604:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQR9672); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleQR9691); 

                	newLeafNode(otherlv_5, grammarAccess.getQRAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4624:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4625:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4625:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4626:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQR9708); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleQR9725); 

                	newLeafNode(otherlv_7, grammarAccess.getQRAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4646:1: ( ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4647:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4647:1: ( (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4648:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4648:1: (lv_type_8_1= 'Security' | lv_type_8_2= 'Performance' | lv_type_8_3= 'Usability' | lv_type_8_4= 'Appearance' | lv_type_8_5= 'Operational' | lv_type_8_6= 'Maintenance' | lv_type_8_7= 'Cultural' | lv_type_8_8= 'Legal' )
            int alt106=8;
            switch ( input.LA(1) ) {
            case 148:
                {
                alt106=1;
                }
                break;
            case 149:
                {
                alt106=2;
                }
                break;
            case 150:
                {
                alt106=3;
                }
                break;
            case 151:
                {
                alt106=4;
                }
                break;
            case 152:
                {
                alt106=5;
                }
                break;
            case 153:
                {
                alt106=6;
                }
                break;
            case 154:
                {
                alt106=7;
                }
                break;
            case 155:
                {
                alt106=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4649:3: lv_type_8_1= 'Security'
                    {
                    lv_type_8_1=(Token)match(input,148,FOLLOW_148_in_ruleQR9745); 

                            newLeafNode(lv_type_8_1, grammarAccess.getQRAccess().getTypeSecurityKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4661:8: lv_type_8_2= 'Performance'
                    {
                    lv_type_8_2=(Token)match(input,149,FOLLOW_149_in_ruleQR9774); 

                            newLeafNode(lv_type_8_2, grammarAccess.getQRAccess().getTypePerformanceKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4673:8: lv_type_8_3= 'Usability'
                    {
                    lv_type_8_3=(Token)match(input,150,FOLLOW_150_in_ruleQR9803); 

                            newLeafNode(lv_type_8_3, grammarAccess.getQRAccess().getTypeUsabilityKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4685:8: lv_type_8_4= 'Appearance'
                    {
                    lv_type_8_4=(Token)match(input,151,FOLLOW_151_in_ruleQR9832); 

                            newLeafNode(lv_type_8_4, grammarAccess.getQRAccess().getTypeAppearanceKeyword_7_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4697:8: lv_type_8_5= 'Operational'
                    {
                    lv_type_8_5=(Token)match(input,152,FOLLOW_152_in_ruleQR9861); 

                            newLeafNode(lv_type_8_5, grammarAccess.getQRAccess().getTypeOperationalKeyword_7_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4709:8: lv_type_8_6= 'Maintenance'
                    {
                    lv_type_8_6=(Token)match(input,153,FOLLOW_153_in_ruleQR9890); 

                            newLeafNode(lv_type_8_6, grammarAccess.getQRAccess().getTypeMaintenanceKeyword_7_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4721:8: lv_type_8_7= 'Cultural'
                    {
                    lv_type_8_7=(Token)match(input,154,FOLLOW_154_in_ruleQR9919); 

                            newLeafNode(lv_type_8_7, grammarAccess.getQRAccess().getTypeCulturalKeyword_7_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4733:8: lv_type_8_8= 'Legal'
                    {
                    lv_type_8_8=(Token)match(input,155,FOLLOW_155_in_ruleQR9948); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4748:2: (otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==156) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4748:4: otherlv_9= 'Sub-Type' ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    {
                    otherlv_9=(Token)match(input,156,FOLLOW_156_in_ruleQR9977); 

                        	newLeafNode(otherlv_9, grammarAccess.getQRAccess().getSubTypeKeyword_8_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4752:1: ( ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4753:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4753:1: ( (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4754:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4754:1: (lv_subType_10_1= 'Security.Privacy' | lv_subType_10_2= 'Security.Integrity' | lv_subType_10_3= 'Usability.EaseOfUse' | lv_subType_10_4= 'Usability.EaseOfLearn' | lv_subType_10_5= 'Usability.Accessibility' )
                    int alt107=5;
                    switch ( input.LA(1) ) {
                    case 157:
                        {
                        alt107=1;
                        }
                        break;
                    case 158:
                        {
                        alt107=2;
                        }
                        break;
                    case 159:
                        {
                        alt107=3;
                        }
                        break;
                    case 160:
                        {
                        alt107=4;
                        }
                        break;
                    case 161:
                        {
                        alt107=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 0, input);

                        throw nvae;
                    }

                    switch (alt107) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4755:3: lv_subType_10_1= 'Security.Privacy'
                            {
                            lv_subType_10_1=(Token)match(input,157,FOLLOW_157_in_ruleQR9997); 

                                    newLeafNode(lv_subType_10_1, grammarAccess.getQRAccess().getSubTypeSecurityPrivacyKeyword_8_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4767:8: lv_subType_10_2= 'Security.Integrity'
                            {
                            lv_subType_10_2=(Token)match(input,158,FOLLOW_158_in_ruleQR10026); 

                                    newLeafNode(lv_subType_10_2, grammarAccess.getQRAccess().getSubTypeSecurityIntegrityKeyword_8_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4779:8: lv_subType_10_3= 'Usability.EaseOfUse'
                            {
                            lv_subType_10_3=(Token)match(input,159,FOLLOW_159_in_ruleQR10055); 

                                    newLeafNode(lv_subType_10_3, grammarAccess.getQRAccess().getSubTypeUsabilityEaseOfUseKeyword_8_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4791:8: lv_subType_10_4= 'Usability.EaseOfLearn'
                            {
                            lv_subType_10_4=(Token)match(input,160,FOLLOW_160_in_ruleQR10084); 

                                    newLeafNode(lv_subType_10_4, grammarAccess.getQRAccess().getSubTypeUsabilityEaseOfLearnKeyword_8_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQRRule());
                            	        }
                                   		setWithLastConsumed(current, "subType", lv_subType_10_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4803:8: lv_subType_10_5= 'Usability.Accessibility'
                            {
                            lv_subType_10_5=(Token)match(input,161,FOLLOW_161_in_ruleQR10113); 

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

            otherlv_11=(Token)match(input,162,FOLLOW_162_in_ruleQR10143); 

                	newLeafNode(otherlv_11, grammarAccess.getQRAccess().getMetricKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4822:1: ( ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4823:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4823:1: ( (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4824:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4824:1: (lv_metric_12_1= 'Hours' | lv_metric_12_2= 'Mins' | lv_metric_12_3= 'Secs' | lv_metric_12_4= 'mSecs' | lv_metric_12_5= 'Tasks' | lv_metric_12_6= 'Other' )
            int alt109=6;
            switch ( input.LA(1) ) {
            case 163:
                {
                alt109=1;
                }
                break;
            case 164:
                {
                alt109=2;
                }
                break;
            case 165:
                {
                alt109=3;
                }
                break;
            case 166:
                {
                alt109=4;
                }
                break;
            case 167:
                {
                alt109=5;
                }
                break;
            case 140:
                {
                alt109=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4825:3: lv_metric_12_1= 'Hours'
                    {
                    lv_metric_12_1=(Token)match(input,163,FOLLOW_163_in_ruleQR10163); 

                            newLeafNode(lv_metric_12_1, grammarAccess.getQRAccess().getMetricHoursKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4837:8: lv_metric_12_2= 'Mins'
                    {
                    lv_metric_12_2=(Token)match(input,164,FOLLOW_164_in_ruleQR10192); 

                            newLeafNode(lv_metric_12_2, grammarAccess.getQRAccess().getMetricMinsKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4849:8: lv_metric_12_3= 'Secs'
                    {
                    lv_metric_12_3=(Token)match(input,165,FOLLOW_165_in_ruleQR10221); 

                            newLeafNode(lv_metric_12_3, grammarAccess.getQRAccess().getMetricSecsKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4861:8: lv_metric_12_4= 'mSecs'
                    {
                    lv_metric_12_4=(Token)match(input,166,FOLLOW_166_in_ruleQR10250); 

                            newLeafNode(lv_metric_12_4, grammarAccess.getQRAccess().getMetricMSecsKeyword_10_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4873:8: lv_metric_12_5= 'Tasks'
                    {
                    lv_metric_12_5=(Token)match(input,167,FOLLOW_167_in_ruleQR10279); 

                            newLeafNode(lv_metric_12_5, grammarAccess.getQRAccess().getMetricTasksKeyword_10_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                           		setWithLastConsumed(current, "metric", lv_metric_12_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4885:8: lv_metric_12_6= 'Other'
                    {
                    lv_metric_12_6=(Token)match(input,140,FOLLOW_140_in_ruleQR10308); 

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

            otherlv_13=(Token)match(input,168,FOLLOW_168_in_ruleQR10336); 

                	newLeafNode(otherlv_13, grammarAccess.getQRAccess().getValueKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4904:1: ( (lv_value_14_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4905:1: (lv_value_14_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4905:1: (lv_value_14_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4906:3: lv_value_14_0= RULE_INT
            {
            lv_value_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQR10353); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4922:2: (otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==29) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4922:4: otherlv_15= 'Stakeholder' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleQR10371); 

                        	newLeafNode(otherlv_15, grammarAccess.getQRAccess().getStakeholderKeyword_13_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4926:1: ( (otherlv_16= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4927:1: (otherlv_16= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4927:1: (otherlv_16= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4928:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR10391); 

                    		newLeafNode(otherlv_16, grammarAccess.getQRAccess().getStakeholderStakeholderCrossReference_13_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,59,FOLLOW_59_in_ruleQR10405); 

                	newLeafNode(otherlv_17, grammarAccess.getQRAccess().getPriorityKeyword_14());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4943:1: ( (lv_priority_18_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4944:1: (lv_priority_18_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4944:1: (lv_priority_18_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4945:3: lv_priority_18_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getQRAccess().getPriorityPriorityParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleQR10426);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4961:2: ( (lv_depends_19_0= ruleDependsOnQR ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==64||LA111_0==67||LA111_0==146) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4962:1: (lv_depends_19_0= ruleDependsOnQR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4962:1: (lv_depends_19_0= ruleDependsOnQR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4963:3: lv_depends_19_0= ruleDependsOnQR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQRAccess().getDependsDependsOnQRParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnQR_in_ruleQR10447);
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
            	    break loop111;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4979:3: (otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==18) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4979:5: otherlv_20= 'PartOf' ( (otherlv_21= RULE_ID ) )
                    {
                    otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleQR10461); 

                        	newLeafNode(otherlv_20, grammarAccess.getQRAccess().getPartOfKeyword_17_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4983:1: ( (otherlv_21= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4984:1: (otherlv_21= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4984:1: (otherlv_21= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:4985:3: otherlv_21= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRRule());
                    	        }
                            
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQR10481); 

                    		newLeafNode(otherlv_21, grammarAccess.getQRAccess().getPartOfQRCrossReference_17_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,16,FOLLOW_16_in_ruleQR10495); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5008:1: entryRuleDependsOnQR returns [EObject current=null] : iv_ruleDependsOnQR= ruleDependsOnQR EOF ;
    public final EObject entryRuleDependsOnQR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnQR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5009:2: (iv_ruleDependsOnQR= ruleDependsOnQR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5010:2: iv_ruleDependsOnQR= ruleDependsOnQR EOF
            {
             newCompositeNode(grammarAccess.getDependsOnQRRule()); 
            pushFollow(FOLLOW_ruleDependsOnQR_in_entryRuleDependsOnQR10531);
            iv_ruleDependsOnQR=ruleDependsOnQR();

            state._fsp--;

             current =iv_ruleDependsOnQR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnQR10541); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5017:1: ruleDependsOnQR returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQr_1_0= ruleRefQR ) ) ) ;
    public final EObject ruleDependsOnQR() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refQr_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5020:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQr_1_0= ruleRefQR ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5021:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQr_1_0= ruleRefQR ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5021:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQr_1_0= ruleRefQR ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5021:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refQr_1_0= ruleRefQR ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5021:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5022:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5022:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5023:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5023:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt113=1;
                }
                break;
            case 146:
                {
                alt113=2;
                }
                break;
            case 67:
                {
                alt113=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5024:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,64,FOLLOW_64_in_ruleDependsOnQR10586); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnQRAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5036:8: lv_type_0_2= 'Refines'
                    {
                    lv_type_0_2=(Token)match(input,146,FOLLOW_146_in_ruleDependsOnQR10615); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnQRAccess().getTypeRefinesKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnQRRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5048:8: lv_type_0_3= 'Conflicts'
                    {
                    lv_type_0_3=(Token)match(input,67,FOLLOW_67_in_ruleDependsOnQR10644); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5063:2: ( (lv_refQr_1_0= ruleRefQR ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5064:1: (lv_refQr_1_0= ruleRefQR )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5064:1: (lv_refQr_1_0= ruleRefQR )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5065:3: lv_refQr_1_0= ruleRefQR
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnQRAccess().getRefQrRefQRParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefQR_in_ruleDependsOnQR10681);
            lv_refQr_1_0=ruleRefQR();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependsOnQRRule());
            	        }
                   		set(
                   			current, 
                   			"refQr",
                    		lv_refQr_1_0, 
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5089:1: entryRuleRefQR returns [EObject current=null] : iv_ruleRefQR= ruleRefQR EOF ;
    public final EObject entryRuleRefQR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefQR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5090:2: (iv_ruleRefQR= ruleRefQR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5091:2: iv_ruleRefQR= ruleRefQR EOF
            {
             newCompositeNode(grammarAccess.getRefQRRule()); 
            pushFollow(FOLLOW_ruleRefQR_in_entryRuleRefQR10717);
            iv_ruleRefQR=ruleRefQR();

            state._fsp--;

             current =iv_ruleRefQR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefQR10727); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5098:1: ruleRefQR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefQR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5101:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5102:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5102:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5102:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5102:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5103:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5103:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5104:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefQRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefQR10772); 

            		newLeafNode(otherlv_0, grammarAccess.getRefQRAccess().getRefQRQRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5115:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==19) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5115:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefQR10785); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefQRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5119:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5120:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5120:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5121:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefQRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefQR10805); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefQRAccess().getRefsQRCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5140:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5141:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5142:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint10843);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint10853); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5149:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5152:28: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5153:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5153:1: (otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5153:3: otherlv_0= 'Constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= 'Type' ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Priority' ( (lv_priority_12_0= rulePriority ) ) ( (lv_depends_13_0= ruleDependsOnConstraint ) )* (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,169,FOLLOW_169_in_ruleConstraint10890); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5157:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5158:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5158:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5159:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint10907); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConstraint10924); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5179:1: (otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==13) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5179:3: otherlv_3= 'Name' ( (lv_nameAlias_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleConstraint10937); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getNameKeyword_3_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5183:1: ( (lv_nameAlias_4_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5184:1: (lv_nameAlias_4_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5184:1: (lv_nameAlias_4_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5185:3: lv_nameAlias_4_0= RULE_STRING
                    {
                    lv_nameAlias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint10954); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5201:4: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==14) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5201:6: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleConstraint10974); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getDescriptionKeyword_4_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5205:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5206:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5206:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5207:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint10991); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleConstraint11010); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5227:1: ( ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5228:1: ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5228:1: ( (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5229:1: (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5229:1: (lv_type_8_1= 'Cultural' | lv_type_8_2= 'Legal' | lv_type_8_3= 'Organizational' | lv_type_8_4= 'Physical' | lv_type_8_5= 'Project' | lv_type_8_6= 'Technological' | lv_type_8_7= 'Other' )
            int alt117=7;
            switch ( input.LA(1) ) {
            case 154:
                {
                alt117=1;
                }
                break;
            case 155:
                {
                alt117=2;
                }
                break;
            case 170:
                {
                alt117=3;
                }
                break;
            case 171:
                {
                alt117=4;
                }
                break;
            case 11:
                {
                alt117=5;
                }
                break;
            case 172:
                {
                alt117=6;
                }
                break;
            case 140:
                {
                alt117=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5230:3: lv_type_8_1= 'Cultural'
                    {
                    lv_type_8_1=(Token)match(input,154,FOLLOW_154_in_ruleConstraint11030); 

                            newLeafNode(lv_type_8_1, grammarAccess.getConstraintAccess().getTypeCulturalKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5242:8: lv_type_8_2= 'Legal'
                    {
                    lv_type_8_2=(Token)match(input,155,FOLLOW_155_in_ruleConstraint11059); 

                            newLeafNode(lv_type_8_2, grammarAccess.getConstraintAccess().getTypeLegalKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5254:8: lv_type_8_3= 'Organizational'
                    {
                    lv_type_8_3=(Token)match(input,170,FOLLOW_170_in_ruleConstraint11088); 

                            newLeafNode(lv_type_8_3, grammarAccess.getConstraintAccess().getTypeOrganizationalKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5266:8: lv_type_8_4= 'Physical'
                    {
                    lv_type_8_4=(Token)match(input,171,FOLLOW_171_in_ruleConstraint11117); 

                            newLeafNode(lv_type_8_4, grammarAccess.getConstraintAccess().getTypePhysicalKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5278:8: lv_type_8_5= 'Project'
                    {
                    lv_type_8_5=(Token)match(input,11,FOLLOW_11_in_ruleConstraint11146); 

                            newLeafNode(lv_type_8_5, grammarAccess.getConstraintAccess().getTypeProjectKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5290:8: lv_type_8_6= 'Technological'
                    {
                    lv_type_8_6=(Token)match(input,172,FOLLOW_172_in_ruleConstraint11175); 

                            newLeafNode(lv_type_8_6, grammarAccess.getConstraintAccess().getTypeTechnologicalKeyword_6_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5302:8: lv_type_8_7= 'Other'
                    {
                    lv_type_8_7=(Token)match(input,140,FOLLOW_140_in_ruleConstraint11204); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5317:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==29) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5317:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleConstraint11233); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getStakeholderKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5321:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5322:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5322:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5323:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint11253); 

                    		newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getStakeholderStakeholderCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,59,FOLLOW_59_in_ruleConstraint11267); 

                	newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getPriorityKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5338:1: ( (lv_priority_12_0= rulePriority ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5339:1: (lv_priority_12_0= rulePriority )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5339:1: (lv_priority_12_0= rulePriority )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5340:3: lv_priority_12_0= rulePriority
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getPriorityPriorityParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_rulePriority_in_ruleConstraint11288);
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5356:2: ( (lv_depends_13_0= ruleDependsOnConstraint ) )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==64||LA119_0==67||LA119_0==146) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5357:1: (lv_depends_13_0= ruleDependsOnConstraint )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5357:1: (lv_depends_13_0= ruleDependsOnConstraint )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5358:3: lv_depends_13_0= ruleDependsOnConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getDependsDependsOnConstraintParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnConstraint_in_ruleConstraint11309);
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
            	    break loop119;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5374:3: (otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==18) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5374:5: otherlv_14= 'PartOf' ( (otherlv_15= RULE_ID ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleConstraint11323); 

                        	newLeafNode(otherlv_14, grammarAccess.getConstraintAccess().getPartOfKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5378:1: ( (otherlv_15= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5379:1: (otherlv_15= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5379:1: (otherlv_15= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5380:3: otherlv_15= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                            
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint11343); 

                    		newLeafNode(otherlv_15, grammarAccess.getConstraintAccess().getPartOfConstraintCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleConstraint11357); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5403:1: entryRuleDependsOnConstraint returns [EObject current=null] : iv_ruleDependsOnConstraint= ruleDependsOnConstraint EOF ;
    public final EObject entryRuleDependsOnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnConstraint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5404:2: (iv_ruleDependsOnConstraint= ruleDependsOnConstraint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5405:2: iv_ruleDependsOnConstraint= ruleDependsOnConstraint EOF
            {
             newCompositeNode(grammarAccess.getDependsOnConstraintRule()); 
            pushFollow(FOLLOW_ruleDependsOnConstraint_in_entryRuleDependsOnConstraint11393);
            iv_ruleDependsOnConstraint=ruleDependsOnConstraint();

            state._fsp--;

             current =iv_ruleDependsOnConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnConstraint11403); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5412:1: ruleDependsOnConstraint returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) ) ) ;
    public final EObject ruleDependsOnConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        EObject lv_refConst_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5415:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5416:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5416:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5416:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) ) ( (lv_refConst_1_0= ruleRefConstraint ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5416:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5417:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5417:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5418:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5418:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Refines' | lv_type_0_3= 'Conflicts' )
            int alt121=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt121=1;
                }
                break;
            case 146:
                {
                alt121=2;
                }
                break;
            case 67:
                {
                alt121=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5419:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,64,FOLLOW_64_in_ruleDependsOnConstraint11448); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnConstraintAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5431:8: lv_type_0_2= 'Refines'
                    {
                    lv_type_0_2=(Token)match(input,146,FOLLOW_146_in_ruleDependsOnConstraint11477); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnConstraintAccess().getTypeRefinesKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5443:8: lv_type_0_3= 'Conflicts'
                    {
                    lv_type_0_3=(Token)match(input,67,FOLLOW_67_in_ruleDependsOnConstraint11506); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5458:2: ( (lv_refConst_1_0= ruleRefConstraint ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5459:1: (lv_refConst_1_0= ruleRefConstraint )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5459:1: (lv_refConst_1_0= ruleRefConstraint )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5460:3: lv_refConst_1_0= ruleRefConstraint
            {
             
            	        newCompositeNode(grammarAccess.getDependsOnConstraintAccess().getRefConstRefConstraintParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefConstraint_in_ruleDependsOnConstraint11543);
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5484:1: entryRuleRefConstraint returns [EObject current=null] : iv_ruleRefConstraint= ruleRefConstraint EOF ;
    public final EObject entryRuleRefConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefConstraint = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5485:2: (iv_ruleRefConstraint= ruleRefConstraint EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5486:2: iv_ruleRefConstraint= ruleRefConstraint EOF
            {
             newCompositeNode(grammarAccess.getRefConstraintRule()); 
            pushFollow(FOLLOW_ruleRefConstraint_in_entryRuleRefConstraint11579);
            iv_ruleRefConstraint=ruleRefConstraint();

            state._fsp--;

             current =iv_ruleRefConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefConstraint11589); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5493:1: ruleRefConstraint returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5496:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5497:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5497:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5497:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5497:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5498:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5498:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5499:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefConstraintRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefConstraint11634); 

            		newLeafNode(otherlv_0, grammarAccess.getRefConstraintAccess().getRefConstConstraintCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5510:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==19) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5510:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefConstraint11647); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefConstraintAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5514:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5515:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5515:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:5516:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefConstraintRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefConstraint11667); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefConstraintAccess().getRefsConstraintCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop122;
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
    public static final BitSet FOLLOW_ruleProject_in_ruleModel131 = new BitSet(new long[]{0x0400000160120002L,0x0000020000000000L,0x0000020000084000L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel152 = new BitSet(new long[]{0x0400000160120002L,0x0000020000000000L,0x0000020000084000L});
    public static final BitSet FOLLOW_ruleGlossaryTerm_in_ruleModel174 = new BitSet(new long[]{0x0400000160100002L,0x0000020000000000L,0x0000020000084000L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleModel196 = new BitSet(new long[]{0x0400000160000002L,0x0000020000000000L,0x0000020000084000L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleModel218 = new BitSet(new long[]{0x0400000140000002L,0x0000020000000000L,0x0000020000084000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel240 = new BitSet(new long[]{0x0000000140000002L,0x0000020000000000L,0x0000020000084000L});
    public static final BitSet FOLLOW_ruleActor_in_ruleModel262 = new BitSet(new long[]{0x0000000100000002L,0x0000020000000000L,0x0000020000084000L});
    public static final BitSet FOLLOW_ruleUseCase_in_ruleModel284 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000020000084000L});
    public static final BitSet FOLLOW_ruleFR_in_ruleModel306 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000084000L});
    public static final BitSet FOLLOW_ruleQR_in_ruleModel328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000080000L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleModel350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProject434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject451 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject468 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleProject481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject534 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleProject552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefSystem_in_ruleProject573 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProject587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSystem670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem687 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem704 = new BitSet(new long[]{0x0000000000056000L});
    public static final BitSet FOLLOW_13_in_ruleSystem717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem734 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_14_in_ruleSystem754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem771 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleSystem791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem811 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSystem825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefSystem_in_entryRuleRefSystem861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefSystem871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefSystem916 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefSystem929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefSystem949 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleGlossaryTerm_in_entryRuleGlossaryTerm987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossaryTerm997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleGlossaryTerm1034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlossaryTerm1051 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGlossaryTerm1068 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13_in_ruleGlossaryTerm1081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm1098 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleGlossaryTerm1118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm1135 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGlossaryTerm1154 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleRefTermType_in_ruleGlossaryTerm1175 = new BitSet(new long[]{0x0000000E10C10000L});
    public static final BitSet FOLLOW_22_in_ruleGlossaryTerm1188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm1205 = new BitSet(new long[]{0x0000000E10810000L});
    public static final BitSet FOLLOW_23_in_ruleGlossaryTerm1225 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_24_in_ruleGlossaryTerm1245 = new BitSet(new long[]{0x0000000E10010000L});
    public static final BitSet FOLLOW_25_in_ruleGlossaryTerm1274 = new BitSet(new long[]{0x0000000E10010000L});
    public static final BitSet FOLLOW_26_in_ruleGlossaryTerm1303 = new BitSet(new long[]{0x0000000E10010000L});
    public static final BitSet FOLLOW_27_in_ruleGlossaryTerm1332 = new BitSet(new long[]{0x0000000E10010000L});
    public static final BitSet FOLLOW_28_in_ruleGlossaryTerm1363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossaryTerm1380 = new BitSet(new long[]{0x0000000E00010000L});
    public static final BitSet FOLLOW_ruleTermRelation_in_ruleGlossaryTerm1408 = new BitSet(new long[]{0x0000000E00010000L});
    public static final BitSet FOLLOW_16_in_ruleGlossaryTerm1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTermType_in_entryRuleRefTermType1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTermType1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType1513 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefTermType1526 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleTermType_in_ruleRefTermType1547 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleTermType_in_entryRuleTermType1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermType1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTermType1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTermType1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTermType1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTermType1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermRelation_in_entryRuleTermRelation1777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermRelation1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTermRelation1832 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34_in_ruleTermRelation1861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35_in_ruleTermRelation1890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRefTerm_in_ruleTermRelation1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefTerm_in_entryRuleRefTerm1963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefTerm1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefTerm2015 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefTerm2033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRefTerm2050 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStakeholder2140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder2157 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStakeholder2174 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13_in_ruleStakeholder2187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder2204 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleStakeholder2224 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder2241 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStakeholder2260 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_36_in_ruleStakeholder2280 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37_in_ruleStakeholder2309 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38_in_ruleStakeholder2338 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39_in_ruleStakeholder2367 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40_in_ruleStakeholder2396 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleStakeholder2424 = new BitSet(new long[]{0x03FFFC0000000000L});
    public static final BitSet FOLLOW_42_in_ruleStakeholder2444 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_43_in_ruleStakeholder2473 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_44_in_ruleStakeholder2502 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_45_in_ruleStakeholder2531 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_46_in_ruleStakeholder2560 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_47_in_ruleStakeholder2589 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_48_in_ruleStakeholder2618 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_49_in_ruleStakeholder2647 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_50_in_ruleStakeholder2676 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_51_in_ruleStakeholder2705 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_52_in_ruleStakeholder2734 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_53_in_ruleStakeholder2763 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_54_in_ruleStakeholder2792 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_55_in_ruleStakeholder2821 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_56_in_ruleStakeholder2850 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_57_in_ruleStakeholder2879 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleStakeholder2908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder2928 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStakeholder2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleGoal3025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3042 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoal3059 = new BitSet(new long[]{0x0800000020006000L});
    public static final BitSet FOLLOW_13_in_ruleGoal3072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3089 = new BitSet(new long[]{0x0800000020004000L});
    public static final BitSet FOLLOW_14_in_ruleGoal3109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3126 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGoal3146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3166 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleGoal3180 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleGoal3201 = new BitSet(new long[]{0x0000000000010000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleDependsOnGoal_in_ruleGoal3222 = new BitSet(new long[]{0x0000000000010000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleComposedBy_in_ruleGoal3244 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_16_in_ruleGoal3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriority_in_entryRulePriority3293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePriority3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePriority3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePriority3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePriority3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePriority3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnGoal_in_entryRuleDependsOnGoal3485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnGoal3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDependsOnGoal3540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_65_in_ruleDependsOnGoal3569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_66_in_ruleDependsOnGoal3598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_67_in_ruleDependsOnGoal3627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDependsOnGoal3656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleDependsOnGoal3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComposedBy_in_entryRuleComposedBy3729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComposedBy3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleComposedBy3776 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleComposedBy3796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_71_in_ruleComposedBy3825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleComposedBy3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGoal_in_entryRuleRefGoal3898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGoal3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal3953 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefGoal3966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal3986 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEntity4071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity4088 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity4105 = new BitSet(new long[]{0x0000000000206000L,0x0000000000000400L});
    public static final BitSet FOLLOW_13_in_ruleEntity4118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity4135 = new BitSet(new long[]{0x0000000000206000L,0x0000000000000400L});
    public static final BitSet FOLLOW_14_in_ruleEntity4155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity4172 = new BitSet(new long[]{0x0000000000206000L,0x0000000000000400L});
    public static final BitSet FOLLOW_21_in_ruleEntity4192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleEntity4212 = new BitSet(new long[]{0x0000000000206000L,0x0000000000000400L});
    public static final BitSet FOLLOW_73_in_ruleEntity4241 = new BitSet(new long[]{0x0000000000206000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity4280 = new BitSet(new long[]{0x0000000000216000L,0x0000001900000400L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_ruleEntity4302 = new BitSet(new long[]{0x0000000000010000L,0x0000001800000000L});
    public static final BitSet FOLLOW_ruleForeignKey_in_ruleEntity4324 = new BitSet(new long[]{0x0000000000010000L,0x0000001800000000L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleEntity4346 = new BitSet(new long[]{0x0000000000010000L,0x0000001000000000L});
    public static final BitSet FOLLOW_16_in_ruleEntity4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAttribute4442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4459 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute4476 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute4489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4506 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleAttribute4526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute4543 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAttribute4562 = new BitSet(new long[]{0x0000000000000000L,0x00000000007FF800L});
    public static final BitSet FOLLOW_75_in_ruleAttribute4582 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_76_in_ruleAttribute4611 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_77_in_ruleAttribute4640 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_78_in_ruleAttribute4669 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_79_in_ruleAttribute4698 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_80_in_ruleAttribute4727 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_81_in_ruleAttribute4756 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_82_in_ruleAttribute4785 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_83_in_ruleAttribute4814 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_84_in_ruleAttribute4843 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_85_in_ruleAttribute4872 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_86_in_ruleAttribute4901 = new BitSet(new long[]{0x0000000000010000L,0x000000000F800000L});
    public static final BitSet FOLLOW_87_in_ruleAttribute4930 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttribute4947 = new BitSet(new long[]{0x0000000000010000L,0x000000000F000000L});
    public static final BitSet FOLLOW_88_in_ruleAttribute4967 = new BitSet(new long[]{0x0000000000000020L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAttribute4988 = new BitSet(new long[]{0x0000000000010000L,0x000000000E000000L});
    public static final BitSet FOLLOW_89_in_ruleAttribute5003 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute5020 = new BitSet(new long[]{0x0000000000010000L,0x000000000C000000L});
    public static final BitSet FOLLOW_90_in_ruleAttribute5045 = new BitSet(new long[]{0x0000000000010000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleAttribute5077 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttribute5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity5139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleMultiplicity5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleMultiplicity5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleMultiplicity5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleMultiplicity5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiplicity5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey5351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryKey5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rulePrimaryKey5398 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_rulePrimaryKey5410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_rulePrimaryKey5431 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_rulePrimaryKey5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_entryRuleForeignKey5479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignKey5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleForeignKey5526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeignKey5546 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleForeignKey5558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_ruleForeignKey5579 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleForeignKey5591 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleForeignKey5603 = new BitSet(new long[]{0x0000000000000020L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleForeignKey5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute5660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefAttribute5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute5715 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefAttribute5728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute5748 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck5786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleCheck5833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheck5850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheck5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor5913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleActor5960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5977 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor5994 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13_in_ruleActor6007 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor6024 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleActor6044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor6061 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor6080 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_101_in_ruleActor6100 = new BitSet(new long[]{0x0000000020010000L,0x0000010000000000L});
    public static final BitSet FOLLOW_102_in_ruleActor6129 = new BitSet(new long[]{0x0000000020010000L,0x0000010000000000L});
    public static final BitSet FOLLOW_103_in_ruleActor6158 = new BitSet(new long[]{0x0000000020010000L,0x0000010000000000L});
    public static final BitSet FOLLOW_29_in_ruleActor6187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor6207 = new BitSet(new long[]{0x0000000000010000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleActor6222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor6242 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActor6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase6292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleUseCase6339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase6356 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase6373 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13_in_ruleUseCase6386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase6403 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleUseCase6423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase6440 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUseCase6459 = new BitSet(new long[]{0x0000000000000000L,0x0001FC0000000000L});
    public static final BitSet FOLLOW_106_in_ruleUseCase6479 = new BitSet(new long[]{0x0800000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_107_in_ruleUseCase6508 = new BitSet(new long[]{0x0800000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_108_in_ruleUseCase6537 = new BitSet(new long[]{0x0800000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_109_in_ruleUseCase6566 = new BitSet(new long[]{0x0800000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_110_in_ruleUseCase6595 = new BitSet(new long[]{0x0800000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_111_in_ruleUseCase6624 = new BitSet(new long[]{0x0800000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_112_in_ruleUseCase6653 = new BitSet(new long[]{0x0800000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleUseCase6682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefEntity_in_ruleUseCase6703 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleUseCase6717 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleUseCase6738 = new BitSet(new long[]{0x0000000000000000L,0x801C000000000000L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_ruleUseCase6759 = new BitSet(new long[]{0x0000000000000000L,0x801C000000000000L});
    public static final BitSet FOLLOW_114_in_ruleUseCase6773 = new BitSet(new long[]{0x0000000000000010L,0x0018000000000000L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleUseCase6794 = new BitSet(new long[]{0x0000000000000010L,0x0018000000000000L});
    public static final BitSet FOLLOW_115_in_ruleUseCase6810 = new BitSet(new long[]{0x0000000000000010L,0x0010000000000000L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleUseCase6831 = new BitSet(new long[]{0x0000000000000010L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleUseCase6846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase6866 = new BitSet(new long[]{0x0000000000010000L,0x03E0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_117_in_ruleUseCase6879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefActor_in_ruleUseCase6900 = new BitSet(new long[]{0x0000000000010000L,0x03C0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_118_in_ruleUseCase6915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase6932 = new BitSet(new long[]{0x0000000000010000L,0x0380000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_119_in_ruleUseCase6952 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase6969 = new BitSet(new long[]{0x0000000000010000L,0x0300000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_120_in_ruleUseCase6989 = new BitSet(new long[]{0x0000000000010010L,0x0200000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleRefUC_in_ruleUseCase7010 = new BitSet(new long[]{0x0000000000010010L,0x0200000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_121_in_ruleUseCase7026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase7046 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleUseCase7058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase7078 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleUseCase7101 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleUseCase7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefEntity_in_entryRuleRefEntity7150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefEntity7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEntity7205 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleRefEntity7217 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleRefEntity7238 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefEntity7251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEntity7271 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleRefEntity7283 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleRefEntity7304 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType7342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleEntityType7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleEntityType7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleEntityType7454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefFR_in_entryRuleRefFR7505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefFR7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR7560 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefFR7573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR7593 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRefActor_in_entryRuleRefActor7631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefActor7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefActor7686 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefActor7699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefActor7719 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRefUC_in_entryRuleRefUC7757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefUC7767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC7812 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefUC7825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC7845 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint7883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionPoint7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleExtensionPoint7930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionPoint7947 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleExtensionPoint7965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExtensionPoint7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario8025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleScenario8072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScenario8089 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleScenario8106 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13_in_ruleScenario8119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario8136 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleScenario8156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario8173 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleScenario8192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_129_in_ruleScenario8212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_130_in_ruleScenario8241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_131_in_ruleScenario8270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_ruleScenario8298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_133_in_ruleScenario8318 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_134_in_ruleScenario8347 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenario8384 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_16_in_ruleScenario8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep8433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleStep8480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep8497 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStep8514 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13_in_ruleStep8527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep8544 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleStep8564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep8581 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStep8600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001F00L});
    public static final BitSet FOLLOW_136_in_ruleStep8620 = new BitSet(new long[]{0x0000000100010000L,0x00C0000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_137_in_ruleStep8649 = new BitSet(new long[]{0x0000000100010000L,0x00C0000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_138_in_ruleStep8678 = new BitSet(new long[]{0x0000000100010000L,0x00C0000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_139_in_ruleStep8707 = new BitSet(new long[]{0x0000000100010000L,0x00C0000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_140_in_ruleStep8736 = new BitSet(new long[]{0x0000000100010000L,0x00C0000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_32_in_ruleStep8765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep8785 = new BitSet(new long[]{0x0000000000010000L,0x00C0000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_118_in_ruleStep8800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep8817 = new BitSet(new long[]{0x0000000000010000L,0x0080000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_119_in_ruleStep8837 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStep8854 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_ruleStep8874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep8894 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStep8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFR_in_entryRuleFR8944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFR8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleFR8991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR9008 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFR9025 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleFR9038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR9055 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFR9074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR9091 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFR9108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_143_in_ruleFR9128 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_144_in_ruleFR9157 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_145_in_ruleFR9186 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFR9215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR9235 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleFR9249 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleFR9270 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000009L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleDependsOnFR_in_ruleFR9291 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000009L,0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFR9305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR9325 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFR9339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnFR_in_entryRuleDependsOnFR9375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnFR9385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDependsOnFR9430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_146_in_ruleDependsOnFR9459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_67_in_ruleDependsOnFR9488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleDependsOnFR9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQR_in_entryRuleQR9561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQR9571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleQR9608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR9625 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQR9642 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleQR9655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQR9672 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQR9691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQR9708 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQR9725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000FF00000L});
    public static final BitSet FOLLOW_148_in_ruleQR9745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_149_in_ruleQR9774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_150_in_ruleQR9803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_151_in_ruleQR9832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_152_in_ruleQR9861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_153_in_ruleQR9890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_154_in_ruleQR9919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_155_in_ruleQR9948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_156_in_ruleQR9977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000003E0000000L});
    public static final BitSet FOLLOW_157_in_ruleQR9997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_158_in_ruleQR10026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_159_in_ruleQR10055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_160_in_ruleQR10084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_161_in_ruleQR10113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_162_in_ruleQR10143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000F800001000L});
    public static final BitSet FOLLOW_163_in_ruleQR10163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_164_in_ruleQR10192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_165_in_ruleQR10221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_166_in_ruleQR10250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_167_in_ruleQR10279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_140_in_ruleQR10308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_ruleQR10336 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQR10353 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_29_in_ruleQR10371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR10391 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleQR10405 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleQR10426 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000009L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleDependsOnQR_in_ruleQR10447 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000009L,0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQR10461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQR10481 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQR10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnQR_in_entryRuleDependsOnQR10531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnQR10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDependsOnQR10586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_146_in_ruleDependsOnQR10615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_67_in_ruleDependsOnQR10644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefQR_in_ruleDependsOnQR10681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefQR_in_entryRuleRefQR10717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefQR10727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefQR10772 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefQR10785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefQR10805 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint10843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint10853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleConstraint10890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint10907 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstraint10924 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13_in_ruleConstraint10937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint10954 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleConstraint10974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint10991 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstraint11010 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x00001C000C001000L});
    public static final BitSet FOLLOW_154_in_ruleConstraint11030 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_155_in_ruleConstraint11059 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_170_in_ruleConstraint11088 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_171_in_ruleConstraint11117 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_11_in_ruleConstraint11146 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_172_in_ruleConstraint11175 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_140_in_ruleConstraint11204 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConstraint11233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint11253 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleConstraint11267 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleConstraint11288 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000009L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleDependsOnConstraint_in_ruleConstraint11309 = new BitSet(new long[]{0x0000000000050000L,0x0000000000000009L,0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint11323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint11343 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConstraint11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnConstraint_in_entryRuleDependsOnConstraint11393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnConstraint11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDependsOnConstraint11448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_146_in_ruleDependsOnConstraint11477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_67_in_ruleDependsOnConstraint11506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefConstraint_in_ruleDependsOnConstraint11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefConstraint_in_entryRuleRefConstraint11579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefConstraint11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefConstraint11634 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefConstraint11647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefConstraint11667 = new BitSet(new long[]{0x0000000000080002L});

}