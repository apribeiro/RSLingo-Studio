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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "'{'", "'Name'", "'Description'", "'DecomposedBy'", "'}'", "'System'", "'PartOf'", "','", "'Glossary'", "'Type'", "'Acronym'", "'POS'", "'Adjective'", "'Adverb'", "'Noun'", "'Verb'", "'Synset'", "'Stakeholder'", "'Entity'", "'Architectural'", "'Actor'", "'TermRelation'", "'Antonym'", "'Hypernym'", "'Synonym'", "'Group.Organization'", "'Group.BusinessUnit'", "'Group.Team'", "'Individual.Person'", "'Individual.ExternalSystem'", "'Category'", "'Business.User.Direct'", "'System.Engine'", "'Goal'", "'Priority'", "'VeryLow'", "'Low'", "'Medium'", "'High'", "'VeryHigh'", "'Requires'", "'Supports'", "'Obstructs'", "'Conflicts'", "'Identical'", "'ComposedBy'", "'And'", "'Or'", "'Attribute'", "'Boolean'", "'Integer'", "'Decimal'", "'Currency'", "'Date'", "'Time'", "'Datetime'", "'Enumeration'", "'Text'", "'Regex'", "'Ref'", "'Image'", "'Field'", "'Size'", "'Multiplicity'", "'0'", "'1'", "'0..1'", "'*'", "'DefaultValue'", "'Reference'", "'User'", "'ExternalSystem'", "'Timer'", "'SpecializedFrom'", "'UseCase'", "'Goals'", "'FunctionalRequirements'", "'ActorInitiates'", "'ActorParticipates'", "'Pre-Conditions'", "'Post-Conditions'", "'Include'", "'FunctionalRequirement'", "'ModalityType'", "'ActionType'", "'Non-FunctionalRequirement'", "'Sub-Type'", "'Metric'", "'Value'", "'Source (Stakeholder)'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaries_2_0= ruleGlossary ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_project_0_0 = null;

        EObject lv_systems_1_0 = null;

        EObject lv_glossaries_2_0 = null;

        EObject lv_stakeholders_3_0 = null;

        EObject lv_goals_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_actors_6_0 = null;

        EObject lv_useCases_7_0 = null;

        EObject lv_frs_8_0 = null;

        EObject lv_nfrs_9_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:79:28: ( ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaries_2_0= ruleGlossary ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaries_2_0= ruleGlossary ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: ( ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaries_2_0= ruleGlossary ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:2: ( (lv_project_0_0= ruleProject ) ) ( (lv_systems_1_0= ruleSystem ) )* ( (lv_glossaries_2_0= ruleGlossary ) )* ( (lv_stakeholders_3_0= ruleStakeholder ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_actors_6_0= ruleActor ) )* ( (lv_useCases_7_0= ruleUseCase ) )* ( (lv_frs_8_0= ruleFR ) )* ( (lv_nfrs_9_0= ruleNFR ) )*
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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:116:3: ( (lv_glossaries_2_0= ruleGlossary ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:117:1: (lv_glossaries_2_0= ruleGlossary )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:117:1: (lv_glossaries_2_0= ruleGlossary )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:118:3: lv_glossaries_2_0= ruleGlossary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGlossariesGlossaryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlossary_in_ruleModel174);
            	    lv_glossaries_2_0=ruleGlossary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"glossaries",
            	            		lv_glossaries_2_0, 
            	            		"Glossary");
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

                if ( (LA4_0==45) ) {
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

                if ( (LA7_0==86) ) {
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

                if ( (LA8_0==94) ) {
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

                if ( (LA9_0==97) ) {
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:277:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'DecomposedBy' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_refSystem_8_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:280:28: ( (otherlv_0= 'Project' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'DecomposedBy' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:281:1: (otherlv_0= 'Project' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'DecomposedBy' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:281:1: (otherlv_0= 'Project' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'DecomposedBy' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:281:3: otherlv_0= 'Project' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'DecomposedBy' ( (lv_refSystem_8_0= ruleRefSystem ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProject412); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:285:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:286:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:286:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:287:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject429); 

            			newLeafNode(lv_id_1_0, grammarAccess.getProjectAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProject446); 

                	newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProject458); 

                	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:311:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:312:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:312:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:313:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject475); 

            			newLeafNode(lv_name_4_0, grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleProject492); 

                	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:333:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:334:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:334:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:335:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject509); 

            			newLeafNode(lv_description_6_0, grammarAccess.getProjectAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:351:2: (otherlv_7= 'DecomposedBy' ( (lv_refSystem_8_0= ruleRefSystem ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:351:4: otherlv_7= 'DecomposedBy' ( (lv_refSystem_8_0= ruleRefSystem ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleProject527); 

                        	newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getDecomposedByKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:355:1: ( (lv_refSystem_8_0= ruleRefSystem ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:356:1: (lv_refSystem_8_0= ruleRefSystem )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:356:1: (lv_refSystem_8_0= ruleRefSystem )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:357:3: lv_refSystem_8_0= ruleRefSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getRefSystemRefSystemParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefSystem_in_ruleProject548);
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

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleProject562); 

                	newLeafNode(otherlv_9, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_8());
                

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
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem598);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem608); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:394:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:397:28: ( (otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:398:1: (otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:398:1: (otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:398:3: otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSystem645); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:402:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:403:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:403:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:404:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem662); 

            			newLeafNode(lv_id_1_0, grammarAccess.getSystemAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem679); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSystem691); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:428:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:429:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:429:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:430:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem708); 

            			newLeafNode(lv_name_4_0, grammarAccess.getSystemAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSystem725); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:450:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:451:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:451:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:452:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem742); 

            			newLeafNode(lv_description_6_0, grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

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
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:468:4: otherlv_7= 'PartOf' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSystem760); 

                        	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getPartOfKeyword_7_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:472:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:473:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:473:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:474:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem780); 

                    		newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getPartOfSystemCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSystem794); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_8());
                

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
            pushFollow(FOLLOW_ruleRefSystem_in_entryRuleRefSystem830);
            iv_ruleRefSystem=ruleRefSystem();

            state._fsp--;

             current =iv_ruleRefSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefSystem840); 

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
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefSystem885); 

            		newLeafNode(otherlv_0, grammarAccess.getRefSystemAccess().getRefSystemSystemCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:523:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:523:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefSystem898); 

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
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefSystem918); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefSystemAccess().getRefsSystemCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "entryRuleGlossary"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:548:1: entryRuleGlossary returns [EObject current=null] : iv_ruleGlossary= ruleGlossary EOF ;
    public final EObject entryRuleGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossary = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:549:2: (iv_ruleGlossary= ruleGlossary EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:550:2: iv_ruleGlossary= ruleGlossary EOF
            {
             newCompositeNode(grammarAccess.getGlossaryRule()); 
            pushFollow(FOLLOW_ruleGlossary_in_entryRuleGlossary956);
            iv_ruleGlossary=ruleGlossary();

            state._fsp--;

             current =iv_ruleGlossary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossary966); 

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
    // $ANTLR end "entryRuleGlossary"


    // $ANTLR start "ruleGlossary"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:557:1: ruleGlossary returns [EObject current=null] : (otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleRefGlossaryType ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' ) ;
    public final EObject ruleGlossary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:560:28: ( (otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleRefGlossaryType ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:561:1: (otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleRefGlossaryType ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:561:1: (otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleRefGlossaryType ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:561:3: otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= ruleRefGlossaryType ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )? (otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) )? ( (lv_termRelation_15_0= ruleTermRelation ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleGlossary1003); 

                	newLeafNode(otherlv_0, grammarAccess.getGlossaryAccess().getGlossaryKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:565:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:566:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:566:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:567:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlossary1020); 

            			newLeafNode(lv_id_1_0, grammarAccess.getGlossaryAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGlossary1037); 

                	newLeafNode(otherlv_2, grammarAccess.getGlossaryAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleGlossary1049); 

                	newLeafNode(otherlv_3, grammarAccess.getGlossaryAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:591:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:592:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:592:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:593:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary1066); 

            			newLeafNode(lv_name_4_0, grammarAccess.getGlossaryAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleGlossary1083); 

                	newLeafNode(otherlv_5, grammarAccess.getGlossaryAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:613:1: ( (lv_type_6_0= ruleRefGlossaryType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:614:1: (lv_type_6_0= ruleRefGlossaryType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:614:1: (lv_type_6_0= ruleRefGlossaryType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:615:3: lv_type_6_0= ruleRefGlossaryType
            {
             
            	        newCompositeNode(grammarAccess.getGlossaryAccess().getTypeRefGlossaryTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleRefGlossaryType_in_ruleGlossary1104);
            lv_type_6_0=ruleRefGlossaryType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlossaryRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"RefGlossaryType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleGlossary1116); 

                	newLeafNode(otherlv_7, grammarAccess.getGlossaryAccess().getAcronymKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:635:1: ( (lv_acronym_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:636:1: (lv_acronym_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:636:1: (lv_acronym_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:637:3: lv_acronym_8_0= RULE_STRING
            {
            lv_acronym_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary1133); 

            			newLeafNode(lv_acronym_8_0, grammarAccess.getGlossaryAccess().getAcronymSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"acronym",
                    		lv_acronym_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleGlossary1150); 

                	newLeafNode(otherlv_9, grammarAccess.getGlossaryAccess().getDescriptionKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:657:1: ( (lv_description_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:658:1: (lv_description_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:658:1: (lv_description_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:659:3: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary1167); 

            			newLeafNode(lv_description_10_0, grammarAccess.getGlossaryAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_10_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:675:2: (otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:675:4: otherlv_11= 'POS' ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleGlossary1185); 

                        	newLeafNode(otherlv_11, grammarAccess.getGlossaryAccess().getPOSKeyword_11_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:679:1: ( ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:680:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:680:1: ( (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:681:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:681:1: (lv_pos_12_1= 'Adjective' | lv_pos_12_2= 'Adverb' | lv_pos_12_3= 'Noun' | lv_pos_12_4= 'Verb' )
                    int alt13=4;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt13=1;
                        }
                        break;
                    case 25:
                        {
                        alt13=2;
                        }
                        break;
                    case 26:
                        {
                        alt13=3;
                        }
                        break;
                    case 27:
                        {
                        alt13=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:682:3: lv_pos_12_1= 'Adjective'
                            {
                            lv_pos_12_1=(Token)match(input,24,FOLLOW_24_in_ruleGlossary1205); 

                                    newLeafNode(lv_pos_12_1, grammarAccess.getGlossaryAccess().getPosAdjectiveKeyword_11_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:694:8: lv_pos_12_2= 'Adverb'
                            {
                            lv_pos_12_2=(Token)match(input,25,FOLLOW_25_in_ruleGlossary1234); 

                                    newLeafNode(lv_pos_12_2, grammarAccess.getGlossaryAccess().getPosAdverbKeyword_11_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:706:8: lv_pos_12_3= 'Noun'
                            {
                            lv_pos_12_3=(Token)match(input,26,FOLLOW_26_in_ruleGlossary1263); 

                                    newLeafNode(lv_pos_12_3, grammarAccess.getGlossaryAccess().getPosNounKeyword_11_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryRule());
                            	        }
                                   		setWithLastConsumed(current, "pos", lv_pos_12_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:718:8: lv_pos_12_4= 'Verb'
                            {
                            lv_pos_12_4=(Token)match(input,27,FOLLOW_27_in_ruleGlossary1292); 

                                    newLeafNode(lv_pos_12_4, grammarAccess.getGlossaryAccess().getPosVerbKeyword_11_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getGlossaryRule());
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
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:733:6: otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleGlossary1323); 

                        	newLeafNode(otherlv_13, grammarAccess.getGlossaryAccess().getSynsetKeyword_12_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:737:1: ( (lv_synset_14_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:738:1: (lv_synset_14_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:738:1: (lv_synset_14_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:739:3: lv_synset_14_0= RULE_STRING
                    {
                    lv_synset_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary1340); 

                    			newLeafNode(lv_synset_14_0, grammarAccess.getGlossaryAccess().getSynsetSTRINGTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryRule());
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
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:756:1: (lv_termRelation_15_0= ruleTermRelation )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:756:1: (lv_termRelation_15_0= ruleTermRelation )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:757:3: lv_termRelation_15_0= ruleTermRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlossaryAccess().getTermRelationTermRelationParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTermRelation_in_ruleGlossary1368);
            	    lv_termRelation_15_0=ruleTermRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlossaryRule());
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
            	    break loop16;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleGlossary1381); 

                	newLeafNode(otherlv_16, grammarAccess.getGlossaryAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleGlossary"


    // $ANTLR start "entryRuleRefGlossaryType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:785:1: entryRuleRefGlossaryType returns [EObject current=null] : iv_ruleRefGlossaryType= ruleRefGlossaryType EOF ;
    public final EObject entryRuleRefGlossaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefGlossaryType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:786:2: (iv_ruleRefGlossaryType= ruleRefGlossaryType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:787:2: iv_ruleRefGlossaryType= ruleRefGlossaryType EOF
            {
             newCompositeNode(grammarAccess.getRefGlossaryTypeRule()); 
            pushFollow(FOLLOW_ruleRefGlossaryType_in_entryRuleRefGlossaryType1417);
            iv_ruleRefGlossaryType=ruleRefGlossaryType();

            state._fsp--;

             current =iv_ruleRefGlossaryType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGlossaryType1427); 

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
    // $ANTLR end "entryRuleRefGlossaryType"


    // $ANTLR start "ruleRefGlossaryType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:794:1: ruleRefGlossaryType returns [EObject current=null] : ( ( (lv_refType_0_0= ruleGlossaryType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleGlossaryType ) ) )* ) ;
    public final EObject ruleRefGlossaryType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_refType_0_0 = null;

        EObject lv_refs_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:797:28: ( ( ( (lv_refType_0_0= ruleGlossaryType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleGlossaryType ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:1: ( ( (lv_refType_0_0= ruleGlossaryType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleGlossaryType ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:1: ( ( (lv_refType_0_0= ruleGlossaryType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleGlossaryType ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:2: ( (lv_refType_0_0= ruleGlossaryType ) ) (otherlv_1= ',' ( (lv_refs_2_0= ruleGlossaryType ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:798:2: ( (lv_refType_0_0= ruleGlossaryType ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:799:1: (lv_refType_0_0= ruleGlossaryType )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:799:1: (lv_refType_0_0= ruleGlossaryType )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:800:3: lv_refType_0_0= ruleGlossaryType
            {
             
            	        newCompositeNode(grammarAccess.getRefGlossaryTypeAccess().getRefTypeGlossaryTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleGlossaryType_in_ruleRefGlossaryType1473);
            lv_refType_0_0=ruleGlossaryType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRefGlossaryTypeRule());
            	        }
                   		set(
                   			current, 
                   			"refType",
                    		lv_refType_0_0, 
                    		"GlossaryType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:2: (otherlv_1= ',' ( (lv_refs_2_0= ruleGlossaryType ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:4: otherlv_1= ',' ( (lv_refs_2_0= ruleGlossaryType ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefGlossaryType1486); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefGlossaryTypeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:820:1: ( (lv_refs_2_0= ruleGlossaryType ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:821:1: (lv_refs_2_0= ruleGlossaryType )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:821:1: (lv_refs_2_0= ruleGlossaryType )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:822:3: lv_refs_2_0= ruleGlossaryType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefGlossaryTypeAccess().getRefsGlossaryTypeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlossaryType_in_ruleRefGlossaryType1507);
            	    lv_refs_2_0=ruleGlossaryType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefGlossaryTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"refs",
            	            		lv_refs_2_0, 
            	            		"GlossaryType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


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
    // $ANTLR end "ruleRefGlossaryType"


    // $ANTLR start "entryRuleGlossaryType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:846:1: entryRuleGlossaryType returns [EObject current=null] : iv_ruleGlossaryType= ruleGlossaryType EOF ;
    public final EObject entryRuleGlossaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossaryType = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:847:2: (iv_ruleGlossaryType= ruleGlossaryType EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:848:2: iv_ruleGlossaryType= ruleGlossaryType EOF
            {
             newCompositeNode(grammarAccess.getGlossaryTypeRule()); 
            pushFollow(FOLLOW_ruleGlossaryType_in_entryRuleGlossaryType1545);
            iv_ruleGlossaryType=ruleGlossaryType();

            state._fsp--;

             current =iv_ruleGlossaryType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossaryType1555); 

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
    // $ANTLR end "entryRuleGlossaryType"


    // $ANTLR start "ruleGlossaryType"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:855:1: ruleGlossaryType returns [EObject current=null] : ( ( (lv_type_0_1= 'Stakeholder' | lv_type_0_2= 'Entity' | lv_type_0_3= 'Architectural' | lv_type_0_4= 'Actor' ) ) ) ;
    public final EObject ruleGlossaryType() throws RecognitionException {
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
            int alt18=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:862:3: lv_type_0_1= 'Stakeholder'
                    {
                    lv_type_0_1=(Token)match(input,29,FOLLOW_29_in_ruleGlossaryType1599); 

                            newLeafNode(lv_type_0_1, grammarAccess.getGlossaryTypeAccess().getTypeStakeholderKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:874:8: lv_type_0_2= 'Entity'
                    {
                    lv_type_0_2=(Token)match(input,30,FOLLOW_30_in_ruleGlossaryType1628); 

                            newLeafNode(lv_type_0_2, grammarAccess.getGlossaryTypeAccess().getTypeEntityKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:886:8: lv_type_0_3= 'Architectural'
                    {
                    lv_type_0_3=(Token)match(input,31,FOLLOW_31_in_ruleGlossaryType1657); 

                            newLeafNode(lv_type_0_3, grammarAccess.getGlossaryTypeAccess().getTypeArchitecturalKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:898:8: lv_type_0_4= 'Actor'
                    {
                    lv_type_0_4=(Token)match(input,32,FOLLOW_32_in_ruleGlossaryType1686); 

                            newLeafNode(lv_type_0_4, grammarAccess.getGlossaryTypeAccess().getTypeActorKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlossaryTypeRule());
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
    // $ANTLR end "ruleGlossaryType"


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
            pushFollow(FOLLOW_ruleTermRelation_in_entryRuleTermRelation1737);
            iv_ruleTermRelation=ruleTermRelation();

            state._fsp--;

             current =iv_ruleTermRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermRelation1747); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:930:1: ruleTermRelation returns [EObject current=null] : (otherlv_0= 'TermRelation' ( ( (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' ) ) ) ( (lv_term_2_0= ruleTerm ) ) ) ;
    public final EObject ruleTermRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        EObject lv_term_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:933:28: ( (otherlv_0= 'TermRelation' ( ( (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' ) ) ) ( (lv_term_2_0= ruleTerm ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:934:1: (otherlv_0= 'TermRelation' ( ( (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' ) ) ) ( (lv_term_2_0= ruleTerm ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:934:1: (otherlv_0= 'TermRelation' ( ( (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' ) ) ) ( (lv_term_2_0= ruleTerm ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:934:3: otherlv_0= 'TermRelation' ( ( (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' ) ) ) ( (lv_term_2_0= ruleTerm ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleTermRelation1784); 

                	newLeafNode(otherlv_0, grammarAccess.getTermRelationAccess().getTermRelationKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:938:1: ( ( (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:939:1: ( (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:939:1: ( (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:940:1: (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:940:1: (lv_type_1_1= 'Antonym' | lv_type_1_2= 'Hypernym' | lv_type_1_3= 'Synonym' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case 36:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:941:3: lv_type_1_1= 'Antonym'
                    {
                    lv_type_1_1=(Token)match(input,34,FOLLOW_34_in_ruleTermRelation1804); 

                            newLeafNode(lv_type_1_1, grammarAccess.getTermRelationAccess().getTypeAntonymKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:953:8: lv_type_1_2= 'Hypernym'
                    {
                    lv_type_1_2=(Token)match(input,35,FOLLOW_35_in_ruleTermRelation1833); 

                            newLeafNode(lv_type_1_2, grammarAccess.getTermRelationAccess().getTypeHypernymKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:965:8: lv_type_1_3= 'Synonym'
                    {
                    lv_type_1_3=(Token)match(input,36,FOLLOW_36_in_ruleTermRelation1862); 

                            newLeafNode(lv_type_1_3, grammarAccess.getTermRelationAccess().getTypeSynonymKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRelationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:980:2: ( (lv_term_2_0= ruleTerm ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:981:1: (lv_term_2_0= ruleTerm )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:981:1: (lv_term_2_0= ruleTerm )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:982:3: lv_term_2_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getTermRelationAccess().getTermTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleTermRelation1899);
            lv_term_2_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermRelationRule());
            	        }
                   		set(
                   			current, 
                   			"term",
                    		lv_term_2_0, 
                    		"Term");
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


    // $ANTLR start "entryRuleTerm"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1006:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1007:2: (iv_ruleTerm= ruleTerm EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1008:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1935);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1945); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1015:1: ruleTerm returns [EObject current=null] : ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_refTerm_0_0=null;
        Token otherlv_1=null;
        Token lv_refs_2_0=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1018:28: ( ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1019:1: ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1019:1: ( ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1019:2: ( (lv_refTerm_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1019:2: ( (lv_refTerm_0_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1020:1: (lv_refTerm_0_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1020:1: (lv_refTerm_0_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1021:3: lv_refTerm_0_0= RULE_STRING
            {
            lv_refTerm_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerm1987); 

            			newLeafNode(lv_refTerm_0_0, grammarAccess.getTermAccess().getRefTermSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTermRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"refTerm",
                    		lv_refTerm_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1037:2: (otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1037:4: otherlv_1= ',' ( (lv_refs_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTerm2005); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTermAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1041:1: ( (lv_refs_2_0= RULE_STRING ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1042:1: (lv_refs_2_0= RULE_STRING )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1042:1: (lv_refs_2_0= RULE_STRING )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1043:3: lv_refs_2_0= RULE_STRING
            	    {
            	    lv_refs_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerm2022); 

            	    			newLeafNode(lv_refs_2_0, grammarAccess.getTermAccess().getRefsSTRINGTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTermRule());
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
            	    break loop20;
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleStakeholder"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1067:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1068:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1069:2: iv_ruleStakeholder= ruleStakeholder EOF
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1076:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_type_6_1=null;
        Token lv_type_6_2=null;
        Token lv_type_6_3=null;
        Token lv_type_6_4=null;
        Token lv_type_6_5=null;
        Token otherlv_7=null;
        Token lv_category_8_1=null;
        Token lv_category_8_2=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1079:28: ( (otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1080:1: (otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1080:1: (otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1080:3: otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) ) otherlv_7= 'Category' ( ( (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' ) ) ) (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStakeholder2112); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1084:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1085:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1085:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1086:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder2129); 

            			newLeafNode(lv_id_1_0, grammarAccess.getStakeholderAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStakeholderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStakeholder2146); 

                	newLeafNode(otherlv_2, grammarAccess.getStakeholderAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStakeholder2158); 

                	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1110:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1111:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1111:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1112:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder2175); 

            			newLeafNode(lv_name_4_0, grammarAccess.getStakeholderAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStakeholderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleStakeholder2192); 

                	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1132:1: ( ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1133:1: ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1133:1: ( (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1134:1: (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1134:1: (lv_type_6_1= 'Group.Organization' | lv_type_6_2= 'Group.BusinessUnit' | lv_type_6_3= 'Group.Team' | lv_type_6_4= 'Individual.Person' | lv_type_6_5= 'Individual.ExternalSystem' )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt21=1;
                }
                break;
            case 38:
                {
                alt21=2;
                }
                break;
            case 39:
                {
                alt21=3;
                }
                break;
            case 40:
                {
                alt21=4;
                }
                break;
            case 41:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1135:3: lv_type_6_1= 'Group.Organization'
                    {
                    lv_type_6_1=(Token)match(input,37,FOLLOW_37_in_ruleStakeholder2212); 

                            newLeafNode(lv_type_6_1, grammarAccess.getStakeholderAccess().getTypeGroupOrganizationKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1147:8: lv_type_6_2= 'Group.BusinessUnit'
                    {
                    lv_type_6_2=(Token)match(input,38,FOLLOW_38_in_ruleStakeholder2241); 

                            newLeafNode(lv_type_6_2, grammarAccess.getStakeholderAccess().getTypeGroupBusinessUnitKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1159:8: lv_type_6_3= 'Group.Team'
                    {
                    lv_type_6_3=(Token)match(input,39,FOLLOW_39_in_ruleStakeholder2270); 

                            newLeafNode(lv_type_6_3, grammarAccess.getStakeholderAccess().getTypeGroupTeamKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1171:8: lv_type_6_4= 'Individual.Person'
                    {
                    lv_type_6_4=(Token)match(input,40,FOLLOW_40_in_ruleStakeholder2299); 

                            newLeafNode(lv_type_6_4, grammarAccess.getStakeholderAccess().getTypeIndividualPersonKeyword_6_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1183:8: lv_type_6_5= 'Individual.ExternalSystem'
                    {
                    lv_type_6_5=(Token)match(input,41,FOLLOW_41_in_ruleStakeholder2328); 

                            newLeafNode(lv_type_6_5, grammarAccess.getStakeholderAccess().getTypeIndividualExternalSystemKeyword_6_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleStakeholder2356); 

                	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getCategoryKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1202:1: ( ( (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1203:1: ( (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1203:1: ( (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1204:1: (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1204:1: (lv_category_8_1= 'Business.User.Direct' | lv_category_8_2= 'System.Engine' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            else if ( (LA22_0==44) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1205:3: lv_category_8_1= 'Business.User.Direct'
                    {
                    lv_category_8_1=(Token)match(input,43,FOLLOW_43_in_ruleStakeholder2376); 

                            newLeafNode(lv_category_8_1, grammarAccess.getStakeholderAccess().getCategoryBusinessUserDirectKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1217:8: lv_category_8_2= 'System.Engine'
                    {
                    lv_category_8_2=(Token)match(input,44,FOLLOW_44_in_ruleStakeholder2405); 

                            newLeafNode(lv_category_8_2, grammarAccess.getStakeholderAccess().getCategorySystemEngineKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                           		setWithLastConsumed(current, "category", lv_category_8_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1232:2: (otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1232:4: otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleStakeholder2434); 

                        	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getDescriptionKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1236:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1237:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1237:1: (lv_description_10_0= RULE_STRING )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1238:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder2451); 

                    			newLeafNode(lv_description_10_0, grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_9_1_0()); 
                    		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1254:4: (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1254:6: otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleStakeholder2471); 

                        	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getPartOfKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1258:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1259:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1259:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1260:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStakeholderRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder2491); 

                    		newLeafNode(otherlv_12, grammarAccess.getStakeholderAccess().getPartOfStakeholderCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleStakeholder2505); 

                	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1283:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1284:2: (iv_ruleGoal= ruleGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1285:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2541);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2551); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1292:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( ( (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_9_0= ruleDependsOnGoal ) )* ( (lv_composedBy_10_0= ruleComposedBy ) )* otherlv_11= '}' ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_priority_8_1=null;
        Token lv_priority_8_2=null;
        Token lv_priority_8_3=null;
        Token lv_priority_8_4=null;
        Token lv_priority_8_5=null;
        Token otherlv_11=null;
        EObject lv_dependsOn_9_0 = null;

        EObject lv_composedBy_10_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1295:28: ( (otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( ( (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_9_0= ruleDependsOnGoal ) )* ( (lv_composedBy_10_0= ruleComposedBy ) )* otherlv_11= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1296:1: (otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( ( (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_9_0= ruleDependsOnGoal ) )* ( (lv_composedBy_10_0= ruleComposedBy ) )* otherlv_11= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1296:1: (otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( ( (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_9_0= ruleDependsOnGoal ) )* ( (lv_composedBy_10_0= ruleComposedBy ) )* otherlv_11= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1296:3: otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( ( (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' ) ) ) ( (lv_dependsOn_9_0= ruleDependsOnGoal ) )* ( (lv_composedBy_10_0= ruleComposedBy ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleGoal2588); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1300:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1301:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1301:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1302:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal2605); 

            			newLeafNode(lv_id_1_0, grammarAccess.getGoalAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoal2622); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGoal2634); 

                	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1326:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1327:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1327:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1328:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal2651); 

            			newLeafNode(lv_description_4_0, grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleGoal2668); 

                	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getStakeholderKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1348:1: ( (otherlv_6= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1349:1: (otherlv_6= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1349:1: (otherlv_6= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1350:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal2688); 

            		newLeafNode(otherlv_6, grammarAccess.getGoalAccess().getStakeholderStakeholderCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleGoal2700); 

                	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getPriorityKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1365:1: ( ( (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1366:1: ( (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1366:1: ( (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1367:1: (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1367:1: (lv_priority_8_1= 'VeryLow' | lv_priority_8_2= 'Low' | lv_priority_8_3= 'Medium' | lv_priority_8_4= 'High' | lv_priority_8_5= 'VeryHigh' )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt25=1;
                }
                break;
            case 48:
                {
                alt25=2;
                }
                break;
            case 49:
                {
                alt25=3;
                }
                break;
            case 50:
                {
                alt25=4;
                }
                break;
            case 51:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1368:3: lv_priority_8_1= 'VeryLow'
                    {
                    lv_priority_8_1=(Token)match(input,47,FOLLOW_47_in_ruleGoal2720); 

                            newLeafNode(lv_priority_8_1, grammarAccess.getGoalAccess().getPriorityVeryLowKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1380:8: lv_priority_8_2= 'Low'
                    {
                    lv_priority_8_2=(Token)match(input,48,FOLLOW_48_in_ruleGoal2749); 

                            newLeafNode(lv_priority_8_2, grammarAccess.getGoalAccess().getPriorityLowKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1392:8: lv_priority_8_3= 'Medium'
                    {
                    lv_priority_8_3=(Token)match(input,49,FOLLOW_49_in_ruleGoal2778); 

                            newLeafNode(lv_priority_8_3, grammarAccess.getGoalAccess().getPriorityMediumKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1404:8: lv_priority_8_4= 'High'
                    {
                    lv_priority_8_4=(Token)match(input,50,FOLLOW_50_in_ruleGoal2807); 

                            newLeafNode(lv_priority_8_4, grammarAccess.getGoalAccess().getPriorityHighKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1416:8: lv_priority_8_5= 'VeryHigh'
                    {
                    lv_priority_8_5=(Token)match(input,51,FOLLOW_51_in_ruleGoal2836); 

                            newLeafNode(lv_priority_8_5, grammarAccess.getGoalAccess().getPriorityVeryHighKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoalRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_8_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1431:2: ( (lv_dependsOn_9_0= ruleDependsOnGoal ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=52 && LA26_0<=56)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1432:1: (lv_dependsOn_9_0= ruleDependsOnGoal )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1432:1: (lv_dependsOn_9_0= ruleDependsOnGoal )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1433:3: lv_dependsOn_9_0= ruleDependsOnGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDependsOnDependsOnGoalParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependsOnGoal_in_ruleGoal2873);
            	    lv_dependsOn_9_0=ruleDependsOnGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dependsOn",
            	            		lv_dependsOn_9_0, 
            	            		"DependsOnGoal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1449:3: ( (lv_composedBy_10_0= ruleComposedBy ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==57) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1450:1: (lv_composedBy_10_0= ruleComposedBy )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1450:1: (lv_composedBy_10_0= ruleComposedBy )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1451:3: lv_composedBy_10_0= ruleComposedBy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getComposedByComposedByParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComposedBy_in_ruleGoal2895);
            	    lv_composedBy_10_0=ruleComposedBy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"composedBy",
            	            		lv_composedBy_10_0, 
            	            		"ComposedBy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleGoal2908); 

                	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1479:1: entryRuleDependsOnGoal returns [EObject current=null] : iv_ruleDependsOnGoal= ruleDependsOnGoal EOF ;
    public final EObject entryRuleDependsOnGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1480:2: (iv_ruleDependsOnGoal= ruleDependsOnGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1481:2: iv_ruleDependsOnGoal= ruleDependsOnGoal EOF
            {
             newCompositeNode(grammarAccess.getDependsOnGoalRule()); 
            pushFollow(FOLLOW_ruleDependsOnGoal_in_entryRuleDependsOnGoal2944);
            iv_ruleDependsOnGoal=ruleDependsOnGoal();

            state._fsp--;

             current =iv_ruleDependsOnGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnGoal2954); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1488:1: ruleDependsOnGoal returns [EObject current=null] : ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDependsOnGoal() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1491:28: ( ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1492:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1492:1: ( ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1492:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) ) ( (otherlv_1= RULE_ID ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1492:2: ( ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1493:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1493:1: ( (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1494:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1494:1: (lv_type_0_1= 'Requires' | lv_type_0_2= 'Supports' | lv_type_0_3= 'Obstructs' | lv_type_0_4= 'Conflicts' | lv_type_0_5= 'Identical' )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt28=1;
                }
                break;
            case 53:
                {
                alt28=2;
                }
                break;
            case 54:
                {
                alt28=3;
                }
                break;
            case 55:
                {
                alt28=4;
                }
                break;
            case 56:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1495:3: lv_type_0_1= 'Requires'
                    {
                    lv_type_0_1=(Token)match(input,52,FOLLOW_52_in_ruleDependsOnGoal2999); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnGoalAccess().getTypeRequiresKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1507:8: lv_type_0_2= 'Supports'
                    {
                    lv_type_0_2=(Token)match(input,53,FOLLOW_53_in_ruleDependsOnGoal3028); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnGoalAccess().getTypeSupportsKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1519:8: lv_type_0_3= 'Obstructs'
                    {
                    lv_type_0_3=(Token)match(input,54,FOLLOW_54_in_ruleDependsOnGoal3057); 

                            newLeafNode(lv_type_0_3, grammarAccess.getDependsOnGoalAccess().getTypeObstructsKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1531:8: lv_type_0_4= 'Conflicts'
                    {
                    lv_type_0_4=(Token)match(input,55,FOLLOW_55_in_ruleDependsOnGoal3086); 

                            newLeafNode(lv_type_0_4, grammarAccess.getDependsOnGoalAccess().getTypeConflictsKeyword_0_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1543:8: lv_type_0_5= 'Identical'
                    {
                    lv_type_0_5=(Token)match(input,56,FOLLOW_56_in_ruleDependsOnGoal3115); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1558:2: ( (otherlv_1= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1559:1: (otherlv_1= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1559:1: (otherlv_1= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1560:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependsOnGoalRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependsOnGoal3151); 

            		newLeafNode(otherlv_1, grammarAccess.getDependsOnGoalAccess().getRefGoalGoalCrossReference_1_0()); 
            	

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1579:1: entryRuleComposedBy returns [EObject current=null] : iv_ruleComposedBy= ruleComposedBy EOF ;
    public final EObject entryRuleComposedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposedBy = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1580:2: (iv_ruleComposedBy= ruleComposedBy EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1581:2: iv_ruleComposedBy= ruleComposedBy EOF
            {
             newCompositeNode(grammarAccess.getComposedByRule()); 
            pushFollow(FOLLOW_ruleComposedBy_in_entryRuleComposedBy3187);
            iv_ruleComposedBy=ruleComposedBy();

            state._fsp--;

             current =iv_ruleComposedBy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComposedBy3197); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1588:1: ruleComposedBy returns [EObject current=null] : (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'And' | lv_type_1_2= 'Or' ) ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleComposedBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1591:28: ( (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'And' | lv_type_1_2= 'Or' ) ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1592:1: (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'And' | lv_type_1_2= 'Or' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1592:1: (otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'And' | lv_type_1_2= 'Or' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1592:3: otherlv_0= 'ComposedBy' ( ( (lv_type_1_1= 'And' | lv_type_1_2= 'Or' ) ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleComposedBy3234); 

                	newLeafNode(otherlv_0, grammarAccess.getComposedByAccess().getComposedByKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1596:1: ( ( (lv_type_1_1= 'And' | lv_type_1_2= 'Or' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1597:1: ( (lv_type_1_1= 'And' | lv_type_1_2= 'Or' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1597:1: ( (lv_type_1_1= 'And' | lv_type_1_2= 'Or' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1598:1: (lv_type_1_1= 'And' | lv_type_1_2= 'Or' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1598:1: (lv_type_1_1= 'And' | lv_type_1_2= 'Or' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            else if ( (LA29_0==59) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1599:3: lv_type_1_1= 'And'
                    {
                    lv_type_1_1=(Token)match(input,58,FOLLOW_58_in_ruleComposedBy3254); 

                            newLeafNode(lv_type_1_1, grammarAccess.getComposedByAccess().getTypeAndKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComposedByRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1611:8: lv_type_1_2= 'Or'
                    {
                    lv_type_1_2=(Token)match(input,59,FOLLOW_59_in_ruleComposedBy3283); 

                            newLeafNode(lv_type_1_2, grammarAccess.getComposedByAccess().getTypeOrKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComposedByRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1626:2: ( (otherlv_2= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1627:1: (otherlv_2= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1627:1: (otherlv_2= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1628:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComposedByRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComposedBy3319); 

            		newLeafNode(otherlv_2, grammarAccess.getComposedByAccess().getRefGoalGoalCrossReference_2_0()); 
            	

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


    // $ANTLR start "entryRuleEntity"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1647:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1648:2: (iv_ruleEntity= ruleEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1649:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity3355);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity3365); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1656:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_8=null;
        EObject lv_attributes_7_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1659:28: ( (otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1660:1: (otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1660:1: (otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1660:3: otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleEntity3402); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1664:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1665:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1665:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1666:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3419); 

            			newLeafNode(lv_id_1_0, grammarAccess.getEntityAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity3436); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEntity3448); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1690:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1691:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1691:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1692:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity3465); 

            			newLeafNode(lv_name_4_0, grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntity3482); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1712:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1713:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1713:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1714:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity3499); 

            			newLeafNode(lv_description_6_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1730:2: ( (lv_attributes_7_0= ruleAttribute ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==60) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1731:1: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1731:1: (lv_attributes_7_0= ruleAttribute )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1732:3: lv_attributes_7_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity3525);
            	    lv_attributes_7_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_7_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleEntity3538); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1760:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1761:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1762:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute3574);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute3584); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1769:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( ( (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' ) ) ) ( (lv_field_8_0= ruleField ) ) ( (lv_reference_9_0= ruleReference ) )? otherlv_10= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_descrition_5_0=null;
        Token otherlv_6=null;
        Token lv_type_7_1=null;
        Token lv_type_7_2=null;
        Token lv_type_7_3=null;
        Token lv_type_7_4=null;
        Token lv_type_7_5=null;
        Token lv_type_7_6=null;
        Token lv_type_7_7=null;
        Token lv_type_7_8=null;
        Token lv_type_7_9=null;
        Token lv_type_7_10=null;
        Token lv_type_7_11=null;
        Token lv_type_7_12=null;
        Token otherlv_10=null;
        EObject lv_field_8_0 = null;

        EObject lv_reference_9_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1772:28: ( (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( ( (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' ) ) ) ( (lv_field_8_0= ruleField ) ) ( (lv_reference_9_0= ruleReference ) )? otherlv_10= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1773:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( ( (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' ) ) ) ( (lv_field_8_0= ruleField ) ) ( (lv_reference_9_0= ruleReference ) )? otherlv_10= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1773:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( ( (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' ) ) ) ( (lv_field_8_0= ruleField ) ) ( (lv_reference_9_0= ruleReference ) )? otherlv_10= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1773:3: otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( ( (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' ) ) ) ( (lv_field_8_0= ruleField ) ) ( (lv_reference_9_0= ruleReference ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleAttribute3621); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAttribute3633); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAttribute3645); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getNameKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1785:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1786:1: (lv_name_3_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1786:1: (lv_name_3_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1787:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3662); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleAttribute3679); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1807:1: ( (lv_descrition_5_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1808:1: (lv_descrition_5_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1808:1: (lv_descrition_5_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1809:3: lv_descrition_5_0= RULE_STRING
            {
            lv_descrition_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3696); 

            			newLeafNode(lv_descrition_5_0, grammarAccess.getAttributeAccess().getDescritionSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"descrition",
                    		lv_descrition_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleAttribute3713); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1829:1: ( ( (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1830:1: ( (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1830:1: ( (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1831:1: (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1831:1: (lv_type_7_1= 'Boolean' | lv_type_7_2= 'Integer' | lv_type_7_3= 'Decimal' | lv_type_7_4= 'Currency' | lv_type_7_5= 'Date' | lv_type_7_6= 'Time' | lv_type_7_7= 'Datetime' | lv_type_7_8= 'Enumeration' | lv_type_7_9= 'Text' | lv_type_7_10= 'Regex' | lv_type_7_11= 'Ref' | lv_type_7_12= 'Image' )
            int alt31=12;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt31=1;
                }
                break;
            case 62:
                {
                alt31=2;
                }
                break;
            case 63:
                {
                alt31=3;
                }
                break;
            case 64:
                {
                alt31=4;
                }
                break;
            case 65:
                {
                alt31=5;
                }
                break;
            case 66:
                {
                alt31=6;
                }
                break;
            case 67:
                {
                alt31=7;
                }
                break;
            case 68:
                {
                alt31=8;
                }
                break;
            case 69:
                {
                alt31=9;
                }
                break;
            case 70:
                {
                alt31=10;
                }
                break;
            case 71:
                {
                alt31=11;
                }
                break;
            case 72:
                {
                alt31=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1832:3: lv_type_7_1= 'Boolean'
                    {
                    lv_type_7_1=(Token)match(input,61,FOLLOW_61_in_ruleAttribute3733); 

                            newLeafNode(lv_type_7_1, grammarAccess.getAttributeAccess().getTypeBooleanKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1844:8: lv_type_7_2= 'Integer'
                    {
                    lv_type_7_2=(Token)match(input,62,FOLLOW_62_in_ruleAttribute3762); 

                            newLeafNode(lv_type_7_2, grammarAccess.getAttributeAccess().getTypeIntegerKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1856:8: lv_type_7_3= 'Decimal'
                    {
                    lv_type_7_3=(Token)match(input,63,FOLLOW_63_in_ruleAttribute3791); 

                            newLeafNode(lv_type_7_3, grammarAccess.getAttributeAccess().getTypeDecimalKeyword_7_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1868:8: lv_type_7_4= 'Currency'
                    {
                    lv_type_7_4=(Token)match(input,64,FOLLOW_64_in_ruleAttribute3820); 

                            newLeafNode(lv_type_7_4, grammarAccess.getAttributeAccess().getTypeCurrencyKeyword_7_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1880:8: lv_type_7_5= 'Date'
                    {
                    lv_type_7_5=(Token)match(input,65,FOLLOW_65_in_ruleAttribute3849); 

                            newLeafNode(lv_type_7_5, grammarAccess.getAttributeAccess().getTypeDateKeyword_7_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1892:8: lv_type_7_6= 'Time'
                    {
                    lv_type_7_6=(Token)match(input,66,FOLLOW_66_in_ruleAttribute3878); 

                            newLeafNode(lv_type_7_6, grammarAccess.getAttributeAccess().getTypeTimeKeyword_7_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1904:8: lv_type_7_7= 'Datetime'
                    {
                    lv_type_7_7=(Token)match(input,67,FOLLOW_67_in_ruleAttribute3907); 

                            newLeafNode(lv_type_7_7, grammarAccess.getAttributeAccess().getTypeDatetimeKeyword_7_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1916:8: lv_type_7_8= 'Enumeration'
                    {
                    lv_type_7_8=(Token)match(input,68,FOLLOW_68_in_ruleAttribute3936); 

                            newLeafNode(lv_type_7_8, grammarAccess.getAttributeAccess().getTypeEnumerationKeyword_7_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1928:8: lv_type_7_9= 'Text'
                    {
                    lv_type_7_9=(Token)match(input,69,FOLLOW_69_in_ruleAttribute3965); 

                            newLeafNode(lv_type_7_9, grammarAccess.getAttributeAccess().getTypeTextKeyword_7_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1940:8: lv_type_7_10= 'Regex'
                    {
                    lv_type_7_10=(Token)match(input,70,FOLLOW_70_in_ruleAttribute3994); 

                            newLeafNode(lv_type_7_10, grammarAccess.getAttributeAccess().getTypeRegexKeyword_7_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1952:8: lv_type_7_11= 'Ref'
                    {
                    lv_type_7_11=(Token)match(input,71,FOLLOW_71_in_ruleAttribute4023); 

                            newLeafNode(lv_type_7_11, grammarAccess.getAttributeAccess().getTypeRefKeyword_7_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1964:8: lv_type_7_12= 'Image'
                    {
                    lv_type_7_12=(Token)match(input,72,FOLLOW_72_in_ruleAttribute4052); 

                            newLeafNode(lv_type_7_12, grammarAccess.getAttributeAccess().getTypeImageKeyword_7_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_12, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1979:2: ( (lv_field_8_0= ruleField ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1980:1: (lv_field_8_0= ruleField )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1980:1: (lv_field_8_0= ruleField )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1981:3: lv_field_8_0= ruleField
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getFieldFieldParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleField_in_ruleAttribute4089);
            lv_field_8_0=ruleField();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"field",
                    		lv_field_8_0, 
                    		"Field");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1997:2: ( (lv_reference_9_0= ruleReference ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==81) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1998:1: (lv_reference_9_0= ruleReference )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1998:1: (lv_reference_9_0= ruleReference )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1999:3: lv_reference_9_0= ruleReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getReferenceReferenceParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReference_in_ruleAttribute4110);
                    lv_reference_9_0=ruleReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"reference",
                            		lv_reference_9_0, 
                            		"Reference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleAttribute4123); 

                	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2027:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2028:2: (iv_ruleField= ruleField EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2029:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField4159);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField4169); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2036:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( ( (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING ) ) ) otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;
        Token lv_multiplicity_5_1=null;
        Token lv_multiplicity_5_2=null;
        Token lv_multiplicity_5_3=null;
        Token lv_multiplicity_5_4=null;
        Token lv_multiplicity_5_5=null;
        Token otherlv_6=null;
        Token lv_defaultValue_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2039:28: ( (otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( ( (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING ) ) ) otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2040:1: (otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( ( (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING ) ) ) otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2040:1: (otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( ( (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING ) ) ) otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2040:3: otherlv_0= 'Field' otherlv_1= '{' otherlv_2= 'Size' ( (lv_size_3_0= RULE_INT ) ) otherlv_4= 'Multiplicity' ( ( (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING ) ) ) otherlv_6= 'DefaultValue' ( (lv_defaultValue_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleField4206); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleField4218); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleField4230); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getSizeKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2052:1: ( (lv_size_3_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2053:1: (lv_size_3_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2053:1: (lv_size_3_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2054:3: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField4247); 

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

            otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleField4264); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getMultiplicityKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2074:1: ( ( (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2075:1: ( (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2075:1: ( (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2076:1: (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2076:1: (lv_multiplicity_5_1= '0' | lv_multiplicity_5_2= '1' | lv_multiplicity_5_3= '0..1' | lv_multiplicity_5_4= '*' | lv_multiplicity_5_5= RULE_STRING )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt33=1;
                }
                break;
            case 77:
                {
                alt33=2;
                }
                break;
            case 78:
                {
                alt33=3;
                }
                break;
            case 79:
                {
                alt33=4;
                }
                break;
            case RULE_STRING:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2077:3: lv_multiplicity_5_1= '0'
                    {
                    lv_multiplicity_5_1=(Token)match(input,76,FOLLOW_76_in_ruleField4284); 

                            newLeafNode(lv_multiplicity_5_1, grammarAccess.getFieldAccess().getMultiplicity0Keyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_5_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2089:8: lv_multiplicity_5_2= '1'
                    {
                    lv_multiplicity_5_2=(Token)match(input,77,FOLLOW_77_in_ruleField4313); 

                            newLeafNode(lv_multiplicity_5_2, grammarAccess.getFieldAccess().getMultiplicity1Keyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_5_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2101:8: lv_multiplicity_5_3= '0..1'
                    {
                    lv_multiplicity_5_3=(Token)match(input,78,FOLLOW_78_in_ruleField4342); 

                            newLeafNode(lv_multiplicity_5_3, grammarAccess.getFieldAccess().getMultiplicity01Keyword_5_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_5_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2113:8: lv_multiplicity_5_4= '*'
                    {
                    lv_multiplicity_5_4=(Token)match(input,79,FOLLOW_79_in_ruleField4371); 

                            newLeafNode(lv_multiplicity_5_4, grammarAccess.getFieldAccess().getMultiplicityAsteriskKeyword_5_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_5_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2125:8: lv_multiplicity_5_5= RULE_STRING
                    {
                    lv_multiplicity_5_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField4399); 

                    			newLeafNode(lv_multiplicity_5_5, grammarAccess.getFieldAccess().getMultiplicitySTRINGTerminalRuleCall_5_0_4()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"multiplicity",
                            		lv_multiplicity_5_5, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleField4419); 

                	newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getDefaultValueKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2147:1: ( (lv_defaultValue_7_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2148:1: (lv_defaultValue_7_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2148:1: (lv_defaultValue_7_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2149:3: lv_defaultValue_7_0= RULE_STRING
            {
            lv_defaultValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField4436); 

            			newLeafNode(lv_defaultValue_7_0, grammarAccess.getFieldAccess().getDefaultValueSTRINGTerminalRuleCall_7_0()); 
            		

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

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleField4453); 

                	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleReference"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2177:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2178:2: (iv_ruleReference= ruleReference EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2179:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference4489);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference4499); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2186:1: ruleReference returns [EObject current=null] : (otherlv_0= 'Reference' ( (lv_refTo_1_0= ruleRefAttribute ) ) otherlv_2= 'Multiplicity' ( ( (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING ) ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_multiplicity_3_1=null;
        Token lv_multiplicity_3_2=null;
        Token lv_multiplicity_3_3=null;
        Token lv_multiplicity_3_4=null;
        Token lv_multiplicity_3_5=null;
        EObject lv_refTo_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2189:28: ( (otherlv_0= 'Reference' ( (lv_refTo_1_0= ruleRefAttribute ) ) otherlv_2= 'Multiplicity' ( ( (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING ) ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2190:1: (otherlv_0= 'Reference' ( (lv_refTo_1_0= ruleRefAttribute ) ) otherlv_2= 'Multiplicity' ( ( (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING ) ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2190:1: (otherlv_0= 'Reference' ( (lv_refTo_1_0= ruleRefAttribute ) ) otherlv_2= 'Multiplicity' ( ( (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2190:3: otherlv_0= 'Reference' ( (lv_refTo_1_0= ruleRefAttribute ) ) otherlv_2= 'Multiplicity' ( ( (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleReference4536); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getReferenceKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2194:1: ( (lv_refTo_1_0= ruleRefAttribute ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2195:1: (lv_refTo_1_0= ruleRefAttribute )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2195:1: (lv_refTo_1_0= ruleRefAttribute )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2196:3: lv_refTo_1_0= ruleRefAttribute
            {
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getRefToRefAttributeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRefAttribute_in_ruleReference4557);
            lv_refTo_1_0=ruleRefAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"refTo",
                    		lv_refTo_1_0, 
                    		"RefAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,75,FOLLOW_75_in_ruleReference4569); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getMultiplicityKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2216:1: ( ( (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2217:1: ( (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2217:1: ( (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2218:1: (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2218:1: (lv_multiplicity_3_1= '0' | lv_multiplicity_3_2= '1' | lv_multiplicity_3_3= '0..1' | lv_multiplicity_3_4= '*' | lv_multiplicity_3_5= RULE_STRING )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt34=1;
                }
                break;
            case 77:
                {
                alt34=2;
                }
                break;
            case 78:
                {
                alt34=3;
                }
                break;
            case 79:
                {
                alt34=4;
                }
                break;
            case RULE_STRING:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2219:3: lv_multiplicity_3_1= '0'
                    {
                    lv_multiplicity_3_1=(Token)match(input,76,FOLLOW_76_in_ruleReference4589); 

                            newLeafNode(lv_multiplicity_3_1, grammarAccess.getReferenceAccess().getMultiplicity0Keyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2231:8: lv_multiplicity_3_2= '1'
                    {
                    lv_multiplicity_3_2=(Token)match(input,77,FOLLOW_77_in_ruleReference4618); 

                            newLeafNode(lv_multiplicity_3_2, grammarAccess.getReferenceAccess().getMultiplicity1Keyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2243:8: lv_multiplicity_3_3= '0..1'
                    {
                    lv_multiplicity_3_3=(Token)match(input,78,FOLLOW_78_in_ruleReference4647); 

                            newLeafNode(lv_multiplicity_3_3, grammarAccess.getReferenceAccess().getMultiplicity01Keyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2255:8: lv_multiplicity_3_4= '*'
                    {
                    lv_multiplicity_3_4=(Token)match(input,79,FOLLOW_79_in_ruleReference4676); 

                            newLeafNode(lv_multiplicity_3_4, grammarAccess.getReferenceAccess().getMultiplicityAsteriskKeyword_3_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2267:8: lv_multiplicity_3_5= RULE_STRING
                    {
                    lv_multiplicity_3_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReference4704); 

                    			newLeafNode(lv_multiplicity_3_5, grammarAccess.getReferenceAccess().getMultiplicitySTRINGTerminalRuleCall_3_0_4()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"multiplicity",
                            		lv_multiplicity_3_5, 
                            		"STRING");
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleRefAttribute"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2293:1: entryRuleRefAttribute returns [EObject current=null] : iv_ruleRefAttribute= ruleRefAttribute EOF ;
    public final EObject entryRuleRefAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2294:2: (iv_ruleRefAttribute= ruleRefAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2295:2: iv_ruleRefAttribute= ruleRefAttribute EOF
            {
             newCompositeNode(grammarAccess.getRefAttributeRule()); 
            pushFollow(FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute4748);
            iv_ruleRefAttribute=ruleRefAttribute();

            state._fsp--;

             current =iv_ruleRefAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefAttribute4758); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2302:1: ruleRefAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2305:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2306:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2306:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2306:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2306:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2307:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2307:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2308:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute4803); 

            		newLeafNode(otherlv_0, grammarAccess.getRefAttributeAccess().getRefAttrAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2319:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==19) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2319:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefAttribute4816); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefAttributeAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2323:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2324:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2324:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2325:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefAttributeRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefAttribute4836); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefAttributeAccess().getRefsAttributeCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleRefAttribute"


    // $ANTLR start "entryRuleActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2344:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2345:2: (iv_ruleActor= ruleActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2346:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor4874);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor4884); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2353:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? ( (lv_dependsOn_11_0= ruleDependsOnActor ) )? otherlv_12= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_type_6_1=null;
        Token lv_type_6_2=null;
        Token lv_type_6_3=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_dependsOn_11_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2356:28: ( (otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? ( (lv_dependsOn_11_0= ruleDependsOnActor ) )? otherlv_12= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2357:1: (otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? ( (lv_dependsOn_11_0= ruleDependsOnActor ) )? otherlv_12= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2357:1: (otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? ( (lv_dependsOn_11_0= ruleDependsOnActor ) )? otherlv_12= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2357:3: otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )? ( (lv_dependsOn_11_0= ruleDependsOnActor ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleActor4921); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2361:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2362:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2362:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2363:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor4938); 

            			newLeafNode(lv_id_1_0, grammarAccess.getActorAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActor4955); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleActor4967); 

                	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2387:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2388:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2388:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2389:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor4984); 

            			newLeafNode(lv_name_4_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleActor5001); 

                	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2409:1: ( ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2410:1: ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2410:1: ( (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2411:1: (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2411:1: (lv_type_6_1= 'User' | lv_type_6_2= 'ExternalSystem' | lv_type_6_3= 'Timer' )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt36=1;
                }
                break;
            case 83:
                {
                alt36=2;
                }
                break;
            case 84:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2412:3: lv_type_6_1= 'User'
                    {
                    lv_type_6_1=(Token)match(input,82,FOLLOW_82_in_ruleActor5021); 

                            newLeafNode(lv_type_6_1, grammarAccess.getActorAccess().getTypeUserKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2424:8: lv_type_6_2= 'ExternalSystem'
                    {
                    lv_type_6_2=(Token)match(input,83,FOLLOW_83_in_ruleActor5050); 

                            newLeafNode(lv_type_6_2, grammarAccess.getActorAccess().getTypeExternalSystemKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2436:8: lv_type_6_3= 'Timer'
                    {
                    lv_type_6_3=(Token)match(input,84,FOLLOW_84_in_ruleActor5079); 

                            newLeafNode(lv_type_6_3, grammarAccess.getActorAccess().getTypeTimerKeyword_6_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleActor5107); 

                	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getDescriptionKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2455:1: ( (lv_description_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2456:1: (lv_description_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2456:1: (lv_description_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2457:3: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor5124); 

            			newLeafNode(lv_description_8_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            		

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2473:2: (otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2473:4: otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleActor5142); 

                        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getStakeholderKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2477:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2478:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2478:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2479:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5162); 

                    		newLeafNode(otherlv_10, grammarAccess.getActorAccess().getStakeholderStakeholderCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2490:4: ( (lv_dependsOn_11_0= ruleDependsOnActor ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==18||LA38_0==85) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2491:1: (lv_dependsOn_11_0= ruleDependsOnActor )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2491:1: (lv_dependsOn_11_0= ruleDependsOnActor )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2492:3: lv_dependsOn_11_0= ruleDependsOnActor
                    {
                     
                    	        newCompositeNode(grammarAccess.getActorAccess().getDependsOnDependsOnActorParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDependsOnActor_in_ruleActor5185);
                    lv_dependsOn_11_0=ruleDependsOnActor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	        }
                           		set(
                           			current, 
                           			"dependsOn",
                            		lv_dependsOn_11_0, 
                            		"DependsOnActor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleActor5198); 

                	newLeafNode(otherlv_12, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_11());
                

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


    // $ANTLR start "entryRuleDependsOnActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2520:1: entryRuleDependsOnActor returns [EObject current=null] : iv_ruleDependsOnActor= ruleDependsOnActor EOF ;
    public final EObject entryRuleDependsOnActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependsOnActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2521:2: (iv_ruleDependsOnActor= ruleDependsOnActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2522:2: iv_ruleDependsOnActor= ruleDependsOnActor EOF
            {
             newCompositeNode(grammarAccess.getDependsOnActorRule()); 
            pushFollow(FOLLOW_ruleDependsOnActor_in_entryRuleDependsOnActor5234);
            iv_ruleDependsOnActor=ruleDependsOnActor();

            state._fsp--;

             current =iv_ruleDependsOnActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependsOnActor5244); 

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
    // $ANTLR end "entryRuleDependsOnActor"


    // $ANTLR start "ruleDependsOnActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2529:1: ruleDependsOnActor returns [EObject current=null] : ( ( ( (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' ) ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDependsOnActor() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2532:28: ( ( ( ( (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' ) ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2533:1: ( ( ( (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2533:1: ( ( ( (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2533:2: ( ( (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' ) ) ) ( (otherlv_1= RULE_ID ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2533:2: ( ( (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' ) ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2534:1: ( (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' ) )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2534:1: ( (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2535:1: (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2535:1: (lv_type_0_1= 'PartOf' | lv_type_0_2= 'SpecializedFrom' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==18) ) {
                alt39=1;
            }
            else if ( (LA39_0==85) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2536:3: lv_type_0_1= 'PartOf'
                    {
                    lv_type_0_1=(Token)match(input,18,FOLLOW_18_in_ruleDependsOnActor5289); 

                            newLeafNode(lv_type_0_1, grammarAccess.getDependsOnActorAccess().getTypePartOfKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2548:8: lv_type_0_2= 'SpecializedFrom'
                    {
                    lv_type_0_2=(Token)match(input,85,FOLLOW_85_in_ruleDependsOnActor5318); 

                            newLeafNode(lv_type_0_2, grammarAccess.getDependsOnActorAccess().getTypeSpecializedFromKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependsOnActorRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2563:2: ( (otherlv_1= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2564:1: (otherlv_1= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2564:1: (otherlv_1= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2565:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependsOnActorRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependsOnActor5354); 

            		newLeafNode(otherlv_1, grammarAccess.getDependsOnActorAccess().getStakeholderStakeholderCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleDependsOnActor"


    // $ANTLR start "entryRuleUseCase"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2584:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2585:2: (iv_ruleUseCase= ruleUseCase EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2586:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase5390);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase5400); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2593:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'Goals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}' ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token lv_priotity_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_preConditions_20_0=null;
        Token otherlv_21=null;
        Token lv_postConditions_22_0=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_goals_12_0 = null;

        EObject lv_frs_14_0 = null;

        EObject lv_includes_24_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2596:28: ( (otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'Goals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2597:1: (otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'Goals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2597:1: (otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'Goals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2597:3: otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'Goals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_86_in_ruleUseCase5437); 

                	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2601:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2602:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2602:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2603:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase5454); 

            			newLeafNode(lv_id_1_0, grammarAccess.getUseCaseAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUseCase5471); 

                	newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleUseCase5483); 

                	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2627:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2628:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2628:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2629:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase5500); 

            			newLeafNode(lv_name_4_0, grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleUseCase5517); 

                	newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2649:1: ( (lv_type_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2650:1: (lv_type_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2650:1: (lv_type_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2651:3: lv_type_6_0= RULE_STRING
            {
            lv_type_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase5534); 

            			newLeafNode(lv_type_6_0, grammarAccess.getUseCaseAccess().getTypeSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleUseCase5551); 

                	newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getDescriptionKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2671:1: ( (lv_description_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2672:1: (lv_description_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2672:1: (lv_description_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2673:3: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase5568); 

            			newLeafNode(lv_description_8_0, grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            		

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

            otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleUseCase5585); 

                	newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getPriorityKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2693:1: ( (lv_priotity_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2694:1: (lv_priotity_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2694:1: (lv_priotity_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2695:3: lv_priotity_10_0= RULE_STRING
            {
            lv_priotity_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase5602); 

            			newLeafNode(lv_priotity_10_0, grammarAccess.getUseCaseAccess().getPriotitySTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"priotity",
                    		lv_priotity_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,87,FOLLOW_87_in_ruleUseCase5619); 

                	newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getGoalsKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2715:1: ( (lv_goals_12_0= ruleRefGoal ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2716:1: (lv_goals_12_0= ruleRefGoal )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2716:1: (lv_goals_12_0= ruleRefGoal )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2717:3: lv_goals_12_0= ruleRefGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getGoalsRefGoalParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefGoal_in_ruleUseCase5640);
            	    lv_goals_12_0=ruleRefGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goals",
            	            		lv_goals_12_0, 
            	            		"RefGoal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_13=(Token)match(input,88,FOLLOW_88_in_ruleUseCase5653); 

                	newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getFunctionalRequirementsKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2737:1: ( (lv_frs_14_0= ruleRefFR ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2738:1: (lv_frs_14_0= ruleRefFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2738:1: (lv_frs_14_0= ruleRefFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2739:3: lv_frs_14_0= ruleRefFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getFrsRefFRParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefFR_in_ruleUseCase5674);
            	    lv_frs_14_0=ruleRefFR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"frs",
            	            		lv_frs_14_0, 
            	            		"RefFR");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_15=(Token)match(input,89,FOLLOW_89_in_ruleUseCase5687); 

                	newLeafNode(otherlv_15, grammarAccess.getUseCaseAccess().getActorInitiatesKeyword_15());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2759:1: ( (otherlv_16= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2760:1: (otherlv_16= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2760:1: (otherlv_16= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2761:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase5707); 

            		newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getActorInitiatesActorCrossReference_16_0()); 
            	

            }


            }

            otherlv_17=(Token)match(input,90,FOLLOW_90_in_ruleUseCase5719); 

                	newLeafNode(otherlv_17, grammarAccess.getUseCaseAccess().getActorParticipatesKeyword_17());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2776:1: ( (otherlv_18= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2777:1: (otherlv_18= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2777:1: (otherlv_18= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2778:3: otherlv_18= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase5739); 

            		newLeafNode(otherlv_18, grammarAccess.getUseCaseAccess().getActorParticipatesActorCrossReference_18_0()); 
            	

            }


            }

            otherlv_19=(Token)match(input,91,FOLLOW_91_in_ruleUseCase5751); 

                	newLeafNode(otherlv_19, grammarAccess.getUseCaseAccess().getPreConditionsKeyword_19());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2793:1: ( (lv_preConditions_20_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2794:1: (lv_preConditions_20_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2794:1: (lv_preConditions_20_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2795:3: lv_preConditions_20_0= RULE_STRING
            {
            lv_preConditions_20_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase5768); 

            			newLeafNode(lv_preConditions_20_0, grammarAccess.getUseCaseAccess().getPreConditionsSTRINGTerminalRuleCall_20_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"preConditions",
                    		lv_preConditions_20_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_21=(Token)match(input,92,FOLLOW_92_in_ruleUseCase5785); 

                	newLeafNode(otherlv_21, grammarAccess.getUseCaseAccess().getPostConditionsKeyword_21());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2815:1: ( (lv_postConditions_22_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2816:1: (lv_postConditions_22_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2816:1: (lv_postConditions_22_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2817:3: lv_postConditions_22_0= RULE_STRING
            {
            lv_postConditions_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase5802); 

            			newLeafNode(lv_postConditions_22_0, grammarAccess.getUseCaseAccess().getPostConditionsSTRINGTerminalRuleCall_22_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"postConditions",
                    		lv_postConditions_22_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_23=(Token)match(input,93,FOLLOW_93_in_ruleUseCase5819); 

                	newLeafNode(otherlv_23, grammarAccess.getUseCaseAccess().getIncludeKeyword_23());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2837:1: ( (lv_includes_24_0= ruleRefUC ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2838:1: (lv_includes_24_0= ruleRefUC )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2838:1: (lv_includes_24_0= ruleRefUC )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2839:3: lv_includes_24_0= ruleRefUC
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getIncludesRefUCParserRuleCall_24_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefUC_in_ruleUseCase5840);
            	    lv_includes_24_0=ruleRefUC();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"includes",
            	            		lv_includes_24_0, 
            	            		"RefUC");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_25=(Token)match(input,16,FOLLOW_16_in_ruleUseCase5853); 

                	newLeafNode(otherlv_25, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_25());
                

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


    // $ANTLR start "entryRuleFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2867:1: entryRuleFR returns [EObject current=null] : iv_ruleFR= ruleFR EOF ;
    public final EObject entryRuleFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2868:2: (iv_ruleFR= ruleFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2869:2: iv_ruleFR= ruleFR EOF
            {
             newCompositeNode(grammarAccess.getFRRule()); 
            pushFollow(FOLLOW_ruleFR_in_entryRuleFR5889);
            iv_ruleFR=ruleFR();

            state._fsp--;

             current =iv_ruleFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFR5899); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2876:1: ruleFR returns [EObject current=null] : (otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}' ) ;
    public final EObject ruleFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_modalityType_8_0=null;
        Token otherlv_9=null;
        Token lv_actionType_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_priority_14_0=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2879:28: ( (otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2880:1: (otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2880:1: (otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2880:3: otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Stakeholder' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleFR5936); 

                	newLeafNode(otherlv_0, grammarAccess.getFRAccess().getFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2884:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2885:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2885:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2886:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR5953); 

            			newLeafNode(lv_id_1_0, grammarAccess.getFRAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFR5970); 

                	newLeafNode(otherlv_2, grammarAccess.getFRAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFR5982); 

                	newLeafNode(otherlv_3, grammarAccess.getFRAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2910:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2911:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2911:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2912:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR5999); 

            			newLeafNode(lv_name_4_0, grammarAccess.getFRAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFR6016); 

                	newLeafNode(otherlv_5, grammarAccess.getFRAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2932:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2933:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2933:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2934:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR6033); 

            			newLeafNode(lv_description_6_0, grammarAccess.getFRAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

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

            otherlv_7=(Token)match(input,95,FOLLOW_95_in_ruleFR6050); 

                	newLeafNode(otherlv_7, grammarAccess.getFRAccess().getModalityTypeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2954:1: ( (lv_modalityType_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2955:1: (lv_modalityType_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2955:1: (lv_modalityType_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2956:3: lv_modalityType_8_0= RULE_STRING
            {
            lv_modalityType_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR6067); 

            			newLeafNode(lv_modalityType_8_0, grammarAccess.getFRAccess().getModalityTypeSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"modalityType",
                    		lv_modalityType_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,96,FOLLOW_96_in_ruleFR6084); 

                	newLeafNode(otherlv_9, grammarAccess.getFRAccess().getActionTypeKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2976:1: ( (lv_actionType_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2977:1: (lv_actionType_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2977:1: (lv_actionType_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2978:3: lv_actionType_10_0= RULE_STRING
            {
            lv_actionType_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR6101); 

            			newLeafNode(lv_actionType_10_0, grammarAccess.getFRAccess().getActionTypeSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"actionType",
                    		lv_actionType_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleFR6118); 

                	newLeafNode(otherlv_11, grammarAccess.getFRAccess().getStakeholderKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2998:1: ( (otherlv_12= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2999:1: (otherlv_12= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2999:1: (otherlv_12= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3000:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFRRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR6138); 

            		newLeafNode(otherlv_12, grammarAccess.getFRAccess().getSourceStakeholderCrossReference_12_0()); 
            	

            }


            }

            otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleFR6150); 

                	newLeafNode(otherlv_13, grammarAccess.getFRAccess().getPriorityKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3015:1: ( (lv_priority_14_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3016:1: (lv_priority_14_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3016:1: (lv_priority_14_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3017:3: lv_priority_14_0= RULE_STRING
            {
            lv_priority_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR6167); 

            			newLeafNode(lv_priority_14_0, grammarAccess.getFRAccess().getPrioritySTRINGTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"priority",
                    		lv_priority_14_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleFR6184); 

                	newLeafNode(otherlv_15, grammarAccess.getFRAccess().getRightCurlyBracketKeyword_15());
                

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


    // $ANTLR start "entryRuleNFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3045:1: entryRuleNFR returns [EObject current=null] : iv_ruleNFR= ruleNFR EOF ;
    public final EObject entryRuleNFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3046:2: (iv_ruleNFR= ruleNFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3047:2: iv_ruleNFR= ruleNFR EOF
            {
             newCompositeNode(grammarAccess.getNFRRule()); 
            pushFollow(FOLLOW_ruleNFR_in_entryRuleNFR6220);
            iv_ruleNFR=ruleNFR();

            state._fsp--;

             current =iv_ruleNFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFR6230); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3054:1: ruleNFR returns [EObject current=null] : (otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}' ) ;
    public final EObject ruleNFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_0=null;
        Token otherlv_9=null;
        Token lv_subType_10_0=null;
        Token otherlv_11=null;
        Token lv_metric_12_0=null;
        Token otherlv_13=null;
        Token lv_value_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_priority_18_0=null;
        Token otherlv_19=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3057:28: ( (otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3058:1: (otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3058:1: (otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3058:3: otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleNFR6267); 

                	newLeafNode(otherlv_0, grammarAccess.getNFRAccess().getNonFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3062:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3063:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3063:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3064:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNFR6284); 

            			newLeafNode(lv_id_1_0, grammarAccess.getNFRAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNFR6301); 

                	newLeafNode(otherlv_2, grammarAccess.getNFRAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleNFR6313); 

                	newLeafNode(otherlv_3, grammarAccess.getNFRAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3088:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3089:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3089:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3090:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR6330); 

            			newLeafNode(lv_name_4_0, grammarAccess.getNFRAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleNFR6347); 

                	newLeafNode(otherlv_5, grammarAccess.getNFRAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3110:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3111:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3111:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3112:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR6364); 

            			newLeafNode(lv_description_6_0, grammarAccess.getNFRAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleNFR6381); 

                	newLeafNode(otherlv_7, grammarAccess.getNFRAccess().getTypeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3132:1: ( (lv_type_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3133:1: (lv_type_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3133:1: (lv_type_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3134:3: lv_type_8_0= RULE_STRING
            {
            lv_type_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR6398); 

            			newLeafNode(lv_type_8_0, grammarAccess.getNFRAccess().getTypeSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,98,FOLLOW_98_in_ruleNFR6415); 

                	newLeafNode(otherlv_9, grammarAccess.getNFRAccess().getSubTypeKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3154:1: ( (lv_subType_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3155:1: (lv_subType_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3155:1: (lv_subType_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3156:3: lv_subType_10_0= RULE_STRING
            {
            lv_subType_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR6432); 

            			newLeafNode(lv_subType_10_0, grammarAccess.getNFRAccess().getSubTypeSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"subType",
                    		lv_subType_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,99,FOLLOW_99_in_ruleNFR6449); 

                	newLeafNode(otherlv_11, grammarAccess.getNFRAccess().getMetricKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3176:1: ( (lv_metric_12_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3177:1: (lv_metric_12_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3177:1: (lv_metric_12_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3178:3: lv_metric_12_0= RULE_STRING
            {
            lv_metric_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR6466); 

            			newLeafNode(lv_metric_12_0, grammarAccess.getNFRAccess().getMetricSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"metric",
                    		lv_metric_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,100,FOLLOW_100_in_ruleNFR6483); 

                	newLeafNode(otherlv_13, grammarAccess.getNFRAccess().getValueKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3198:1: ( (lv_value_14_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3199:1: (lv_value_14_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3199:1: (lv_value_14_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3200:3: lv_value_14_0= RULE_STRING
            {
            lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR6500); 

            			newLeafNode(lv_value_14_0, grammarAccess.getNFRAccess().getValueSTRINGTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_14_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_15=(Token)match(input,101,FOLLOW_101_in_ruleNFR6517); 

                	newLeafNode(otherlv_15, grammarAccess.getNFRAccess().getSourceStakeholderKeyword_15());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3220:1: ( (otherlv_16= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3221:1: (otherlv_16= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3221:1: (otherlv_16= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3222:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNFR6537); 

            		newLeafNode(otherlv_16, grammarAccess.getNFRAccess().getSourceStakeholderCrossReference_16_0()); 
            	

            }


            }

            otherlv_17=(Token)match(input,46,FOLLOW_46_in_ruleNFR6549); 

                	newLeafNode(otherlv_17, grammarAccess.getNFRAccess().getPriorityKeyword_17());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3237:1: ( (lv_priority_18_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3238:1: (lv_priority_18_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3238:1: (lv_priority_18_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3239:3: lv_priority_18_0= RULE_STRING
            {
            lv_priority_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR6566); 

            			newLeafNode(lv_priority_18_0, grammarAccess.getNFRAccess().getPrioritySTRINGTerminalRuleCall_18_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"priority",
                    		lv_priority_18_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleNFR6583); 

                	newLeafNode(otherlv_19, grammarAccess.getNFRAccess().getRightCurlyBracketKeyword_19());
                

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


    // $ANTLR start "entryRuleRefGoal"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3267:1: entryRuleRefGoal returns [EObject current=null] : iv_ruleRefGoal= ruleRefGoal EOF ;
    public final EObject entryRuleRefGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3268:2: (iv_ruleRefGoal= ruleRefGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3269:2: iv_ruleRefGoal= ruleRefGoal EOF
            {
             newCompositeNode(grammarAccess.getRefGoalRule()); 
            pushFollow(FOLLOW_ruleRefGoal_in_entryRuleRefGoal6619);
            iv_ruleRefGoal=ruleRefGoal();

            state._fsp--;

             current =iv_ruleRefGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGoal6629); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3276:1: ruleRefGoal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3279:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3280:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3280:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3280:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3280:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3281:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3281:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3282:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefGoalRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal6674); 

            		newLeafNode(otherlv_0, grammarAccess.getRefGoalAccess().getRefGoalGoalCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3293:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==19) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3293:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefGoal6687); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefGoalAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3297:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3298:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3298:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3299:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefGoalRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal6707); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefGoalAccess().getRefsGoalCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleRefGoal"


    // $ANTLR start "entryRuleRefFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3318:1: entryRuleRefFR returns [EObject current=null] : iv_ruleRefFR= ruleRefFR EOF ;
    public final EObject entryRuleRefFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3319:2: (iv_ruleRefFR= ruleRefFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3320:2: iv_ruleRefFR= ruleRefFR EOF
            {
             newCompositeNode(grammarAccess.getRefFRRule()); 
            pushFollow(FOLLOW_ruleRefFR_in_entryRuleRefFR6745);
            iv_ruleRefFR=ruleRefFR();

            state._fsp--;

             current =iv_ruleRefFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefFR6755); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3327:1: ruleRefFR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3330:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3331:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3331:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3331:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3331:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3332:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3332:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3333:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefFRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR6800); 

            		newLeafNode(otherlv_0, grammarAccess.getRefFRAccess().getRefFRFRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3344:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==19) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3344:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefFR6813); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefFRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3348:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3349:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3349:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3350:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefFRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR6833); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefFRAccess().getRefsFRCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleRefFR"


    // $ANTLR start "entryRuleRefUC"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3369:1: entryRuleRefUC returns [EObject current=null] : iv_ruleRefUC= ruleRefUC EOF ;
    public final EObject entryRuleRefUC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefUC = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3370:2: (iv_ruleRefUC= ruleRefUC EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3371:2: iv_ruleRefUC= ruleRefUC EOF
            {
             newCompositeNode(grammarAccess.getRefUCRule()); 
            pushFollow(FOLLOW_ruleRefUC_in_entryRuleRefUC6871);
            iv_ruleRefUC=ruleRefUC();

            state._fsp--;

             current =iv_ruleRefUC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefUC6881); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3378:1: ruleRefUC returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefUC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3381:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3382:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3382:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3382:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3382:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3383:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3383:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3384:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefUCRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC6926); 

            		newLeafNode(otherlv_0, grammarAccess.getRefUCAccess().getRefUCUseCaseCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3395:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==19) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3395:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefUC6939); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefUCAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3399:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3400:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3400:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:3401:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefUCRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC6959); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefUCAccess().getRefsUseCaseCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleModel131 = new BitSet(new long[]{0x0000200160120002L,0x0000000240400000L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel152 = new BitSet(new long[]{0x0000200160120002L,0x0000000240400000L});
    public static final BitSet FOLLOW_ruleGlossary_in_ruleModel174 = new BitSet(new long[]{0x0000200160100002L,0x0000000240400000L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleModel196 = new BitSet(new long[]{0x0000200160000002L,0x0000000240400000L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleModel218 = new BitSet(new long[]{0x0000200140000002L,0x0000000240400000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel240 = new BitSet(new long[]{0x0000000140000002L,0x0000000240400000L});
    public static final BitSet FOLLOW_ruleActor_in_ruleModel262 = new BitSet(new long[]{0x0000000100000002L,0x0000000240400000L});
    public static final BitSet FOLLOW_ruleUseCase_in_ruleModel284 = new BitSet(new long[]{0x0000000000000002L,0x0000000240400000L});
    public static final BitSet FOLLOW_ruleFR_in_ruleModel306 = new BitSet(new long[]{0x0000000000000002L,0x0000000240000000L});
    public static final BitSet FOLLOW_ruleNFR_in_ruleModel328 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProject412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject429 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject446 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProject458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject475 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject509 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleProject527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefSystem_in_ruleProject548 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProject562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSystem645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem662 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem679 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem708 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSystem725 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem742 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleSystem760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem780 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSystem794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefSystem_in_entryRuleRefSystem830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefSystem840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefSystem885 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefSystem898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefSystem918 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleGlossary_in_entryRuleGlossary956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossary966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleGlossary1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlossary1020 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGlossary1037 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGlossary1049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary1066 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGlossary1083 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleRefGlossaryType_in_ruleGlossary1104 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGlossary1116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary1133 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGlossary1150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary1167 = new BitSet(new long[]{0x0000000210810000L});
    public static final BitSet FOLLOW_23_in_ruleGlossary1185 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_24_in_ruleGlossary1205 = new BitSet(new long[]{0x0000000210010000L});
    public static final BitSet FOLLOW_25_in_ruleGlossary1234 = new BitSet(new long[]{0x0000000210010000L});
    public static final BitSet FOLLOW_26_in_ruleGlossary1263 = new BitSet(new long[]{0x0000000210010000L});
    public static final BitSet FOLLOW_27_in_ruleGlossary1292 = new BitSet(new long[]{0x0000000210010000L});
    public static final BitSet FOLLOW_28_in_ruleGlossary1323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary1340 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_ruleTermRelation_in_ruleGlossary1368 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_16_in_ruleGlossary1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGlossaryType_in_entryRuleRefGlossaryType1417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGlossaryType1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlossaryType_in_ruleRefGlossaryType1473 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefGlossaryType1486 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleGlossaryType_in_ruleRefGlossaryType1507 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleGlossaryType_in_entryRuleGlossaryType1545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossaryType1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleGlossaryType1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGlossaryType1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleGlossaryType1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGlossaryType1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermRelation_in_entryRuleTermRelation1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermRelation1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTermRelation1784 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_34_in_ruleTermRelation1804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35_in_ruleTermRelation1833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36_in_ruleTermRelation1862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTermRelation1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerm1987 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleTerm2005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerm2022 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder2065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStakeholder2112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder2129 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStakeholder2146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStakeholder2158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder2175 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStakeholder2192 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_37_in_ruleStakeholder2212 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38_in_ruleStakeholder2241 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39_in_ruleStakeholder2270 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40_in_ruleStakeholder2299 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41_in_ruleStakeholder2328 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleStakeholder2356 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_ruleStakeholder2376 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_44_in_ruleStakeholder2405 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_14_in_ruleStakeholder2434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder2451 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleStakeholder2471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder2491 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStakeholder2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGoal2588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal2605 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoal2622 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGoal2634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal2651 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGoal2668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal2688 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleGoal2700 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_47_in_ruleGoal2720 = new BitSet(new long[]{0x03F0000000010000L});
    public static final BitSet FOLLOW_48_in_ruleGoal2749 = new BitSet(new long[]{0x03F0000000010000L});
    public static final BitSet FOLLOW_49_in_ruleGoal2778 = new BitSet(new long[]{0x03F0000000010000L});
    public static final BitSet FOLLOW_50_in_ruleGoal2807 = new BitSet(new long[]{0x03F0000000010000L});
    public static final BitSet FOLLOW_51_in_ruleGoal2836 = new BitSet(new long[]{0x03F0000000010000L});
    public static final BitSet FOLLOW_ruleDependsOnGoal_in_ruleGoal2873 = new BitSet(new long[]{0x03F0000000010000L});
    public static final BitSet FOLLOW_ruleComposedBy_in_ruleGoal2895 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGoal2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnGoal_in_entryRuleDependsOnGoal2944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnGoal2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDependsOnGoal2999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_53_in_ruleDependsOnGoal3028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_54_in_ruleDependsOnGoal3057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_55_in_ruleDependsOnGoal3086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_56_in_ruleDependsOnGoal3115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependsOnGoal3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComposedBy_in_entryRuleComposedBy3187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComposedBy3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleComposedBy3234 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_ruleComposedBy3254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_59_in_ruleComposedBy3283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComposedBy3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity3355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEntity3402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3419 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity3436 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity3448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity3465 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity3482 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity3499 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity3525 = new BitSet(new long[]{0x1000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEntity3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleAttribute3621 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute3633 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute3645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3662 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttribute3679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3696 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAttribute3713 = new BitSet(new long[]{0xE000000000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_61_in_ruleAttribute3733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_62_in_ruleAttribute3762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_63_in_ruleAttribute3791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_64_in_ruleAttribute3820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_65_in_ruleAttribute3849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_66_in_ruleAttribute3878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_67_in_ruleAttribute3907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_68_in_ruleAttribute3936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_69_in_ruleAttribute3965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_70_in_ruleAttribute3994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_71_in_ruleAttribute4023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_72_in_ruleAttribute4052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleField_in_ruleAttribute4089 = new BitSet(new long[]{0x0000000000010000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttribute4110 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttribute4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField4159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleField4206 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField4218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleField4230 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField4247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleField4264 = new BitSet(new long[]{0x0000000000000020L,0x000000000000F000L});
    public static final BitSet FOLLOW_76_in_ruleField4284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_77_in_ruleField4313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_78_in_ruleField4342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_79_in_ruleField4371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField4399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleField4419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField4436 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleField4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference4489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleReference4536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_ruleReference4557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleReference4569 = new BitSet(new long[]{0x0000000000000020L,0x000000000000F000L});
    public static final BitSet FOLLOW_76_in_ruleReference4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleReference4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleReference4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleReference4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReference4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefAttribute_in_entryRuleRefAttribute4748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefAttribute4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute4803 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefAttribute4816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefAttribute4836 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor4874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleActor4921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor4938 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor4955 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActor4967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor4984 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor5001 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_82_in_ruleActor5021 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_83_in_ruleActor5050 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_84_in_ruleActor5079 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActor5107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor5124 = new BitSet(new long[]{0x0000000020050000L,0x0000000000200000L});
    public static final BitSet FOLLOW_29_in_ruleActor5142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5162 = new BitSet(new long[]{0x0000000000050000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleDependsOnActor_in_ruleActor5185 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActor5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependsOnActor_in_entryRuleDependsOnActor5234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependsOnActor5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDependsOnActor5289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_85_in_ruleDependsOnActor5318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependsOnActor5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase5390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleUseCase5437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase5454 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase5471 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUseCase5483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase5500 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUseCase5517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase5534 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUseCase5551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase5568 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleUseCase5585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase5602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleUseCase5619 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleUseCase5640 = new BitSet(new long[]{0x0000000000000010L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleUseCase5653 = new BitSet(new long[]{0x0000000000000010L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleUseCase5674 = new BitSet(new long[]{0x0000000000000010L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleUseCase5687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase5707 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleUseCase5719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase5739 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleUseCase5751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase5768 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleUseCase5785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase5802 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleUseCase5819 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleRefUC_in_ruleUseCase5840 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleUseCase5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFR_in_entryRuleFR5889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFR5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleFR5936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR5953 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFR5970 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFR5982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR5999 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFR6016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR6033 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleFR6050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR6067 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleFR6084 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR6101 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFR6118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR6138 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFR6150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR6167 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFR6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFR_in_entryRuleNFR6220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFR6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleNFR6267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNFR6284 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNFR6301 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNFR6313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR6330 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNFR6347 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR6364 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNFR6381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR6398 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleNFR6415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR6432 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleNFR6449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR6466 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleNFR6483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR6500 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleNFR6517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNFR6537 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleNFR6549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR6566 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNFR6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGoal_in_entryRuleRefGoal6619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGoal6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal6674 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefGoal6687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal6707 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRefFR_in_entryRuleRefFR6745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefFR6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR6800 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefFR6813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR6833 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRefUC_in_entryRuleRefUC6871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefUC6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC6926 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefUC6939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC6959 = new BitSet(new long[]{0x0000000000080002L});

}