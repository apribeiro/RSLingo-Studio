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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'Id'", "'Name'", "'Description'", "'DecomposedBy'", "'PartOf'", "'}'", "','", "'Glossary'", "'Type'", "'Acronym'", "'POS'", "'Synset'", "'TermRelationType'", "'TermRelation'", "'Stakeholder'", "'Category'", "'DependsOnType'", "'DependsOn'", "'Goal'", "'Priority'", "'ComposedByType'", "'ComposedBy'", "'Entity'", "'Attribute'", "'FieldSize'", "'FieldMultiplicity'", "'DefaultValue'", "'ReferencesTo'", "'Multiplicity'", "'Actor'", "'UseCase'", "'AccomplishedGoals'", "'FunctionalRequirements'", "'ActorInitiates'", "'ActorParticipates'", "'Pre-Conditions'", "'Post-Conditions'", "'Include'", "'FunctionalRequirement'", "'ModalityType'", "'ActionType'", "'Source (Stakeholder)'", "'Non-FunctionalRequirement'", "'Sub-Type'", "'Metric'", "'Value'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_systems_0_0= ruleSystem ) )* ( (lv_glossaries_1_0= ruleGlossary ) )* ( (lv_stakeholders_2_0= ruleStakeholder ) )* ( (lv_goals_3_0= ruleGoal ) )* ( (lv_entities_4_0= ruleEntity ) )* ( (lv_actors_5_0= ruleActor ) )* ( (lv_useCases_6_0= ruleUseCase ) )* ( (lv_frs_7_0= ruleFR ) )* ( (lv_nfrs_8_0= ruleNFR ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_systems_0_0 = null;

        EObject lv_glossaries_1_0 = null;

        EObject lv_stakeholders_2_0 = null;

        EObject lv_goals_3_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_actors_5_0 = null;

        EObject lv_useCases_6_0 = null;

        EObject lv_frs_7_0 = null;

        EObject lv_nfrs_8_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:79:28: ( ( ( (lv_systems_0_0= ruleSystem ) )* ( (lv_glossaries_1_0= ruleGlossary ) )* ( (lv_stakeholders_2_0= ruleStakeholder ) )* ( (lv_goals_3_0= ruleGoal ) )* ( (lv_entities_4_0= ruleEntity ) )* ( (lv_actors_5_0= ruleActor ) )* ( (lv_useCases_6_0= ruleUseCase ) )* ( (lv_frs_7_0= ruleFR ) )* ( (lv_nfrs_8_0= ruleNFR ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: ( ( (lv_systems_0_0= ruleSystem ) )* ( (lv_glossaries_1_0= ruleGlossary ) )* ( (lv_stakeholders_2_0= ruleStakeholder ) )* ( (lv_goals_3_0= ruleGoal ) )* ( (lv_entities_4_0= ruleEntity ) )* ( (lv_actors_5_0= ruleActor ) )* ( (lv_useCases_6_0= ruleUseCase ) )* ( (lv_frs_7_0= ruleFR ) )* ( (lv_nfrs_8_0= ruleNFR ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:1: ( ( (lv_systems_0_0= ruleSystem ) )* ( (lv_glossaries_1_0= ruleGlossary ) )* ( (lv_stakeholders_2_0= ruleStakeholder ) )* ( (lv_goals_3_0= ruleGoal ) )* ( (lv_entities_4_0= ruleEntity ) )* ( (lv_actors_5_0= ruleActor ) )* ( (lv_useCases_6_0= ruleUseCase ) )* ( (lv_frs_7_0= ruleFR ) )* ( (lv_nfrs_8_0= ruleNFR ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:2: ( (lv_systems_0_0= ruleSystem ) )* ( (lv_glossaries_1_0= ruleGlossary ) )* ( (lv_stakeholders_2_0= ruleStakeholder ) )* ( (lv_goals_3_0= ruleGoal ) )* ( (lv_entities_4_0= ruleEntity ) )* ( (lv_actors_5_0= ruleActor ) )* ( (lv_useCases_6_0= ruleUseCase ) )* ( (lv_frs_7_0= ruleFR ) )* ( (lv_nfrs_8_0= ruleNFR ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:80:2: ( (lv_systems_0_0= ruleSystem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:81:1: (lv_systems_0_0= ruleSystem )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:81:1: (lv_systems_0_0= ruleSystem )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:82:3: lv_systems_0_0= ruleSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystem_in_ruleModel131);
            	    lv_systems_0_0=ruleSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systems",
            	            		lv_systems_0_0, 
            	            		"System");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:98:3: ( (lv_glossaries_1_0= ruleGlossary ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:99:1: (lv_glossaries_1_0= ruleGlossary )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:99:1: (lv_glossaries_1_0= ruleGlossary )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:100:3: lv_glossaries_1_0= ruleGlossary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGlossariesGlossaryParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlossary_in_ruleModel153);
            	    lv_glossaries_1_0=ruleGlossary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"glossaries",
            	            		lv_glossaries_1_0, 
            	            		"Glossary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:116:3: ( (lv_stakeholders_2_0= ruleStakeholder ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:117:1: (lv_stakeholders_2_0= ruleStakeholder )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:117:1: (lv_stakeholders_2_0= ruleStakeholder )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:118:3: lv_stakeholders_2_0= ruleStakeholder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStakeholdersStakeholderParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStakeholder_in_ruleModel175);
            	    lv_stakeholders_2_0=ruleStakeholder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stakeholders",
            	            		lv_stakeholders_2_0, 
            	            		"Stakeholder");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:134:3: ( (lv_goals_3_0= ruleGoal ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:135:1: (lv_goals_3_0= ruleGoal )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:135:1: (lv_goals_3_0= ruleGoal )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:136:3: lv_goals_3_0= ruleGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGoalsGoalParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_ruleModel197);
            	    lv_goals_3_0=ruleGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goals",
            	            		lv_goals_3_0, 
            	            		"Goal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:152:3: ( (lv_entities_4_0= ruleEntity ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:153:1: (lv_entities_4_0= ruleEntity )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:153:1: (lv_entities_4_0= ruleEntity )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:154:3: lv_entities_4_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModel219);
            	    lv_entities_4_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_4_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:170:3: ( (lv_actors_5_0= ruleActor ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==42) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:171:1: (lv_actors_5_0= ruleActor )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:171:1: (lv_actors_5_0= ruleActor )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:172:3: lv_actors_5_0= ruleActor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getActorsActorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActor_in_ruleModel241);
            	    lv_actors_5_0=ruleActor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actors",
            	            		lv_actors_5_0, 
            	            		"Actor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:188:3: ( (lv_useCases_6_0= ruleUseCase ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==43) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:189:1: (lv_useCases_6_0= ruleUseCase )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:189:1: (lv_useCases_6_0= ruleUseCase )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:190:3: lv_useCases_6_0= ruleUseCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUseCase_in_ruleModel263);
            	    lv_useCases_6_0=ruleUseCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"useCases",
            	            		lv_useCases_6_0, 
            	            		"UseCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:206:3: ( (lv_frs_7_0= ruleFR ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==51) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:207:1: (lv_frs_7_0= ruleFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:207:1: (lv_frs_7_0= ruleFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:208:3: lv_frs_7_0= ruleFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFrsFRParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFR_in_ruleModel285);
            	    lv_frs_7_0=ruleFR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"frs",
            	            		lv_frs_7_0, 
            	            		"FR");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:224:3: ( (lv_nfrs_8_0= ruleNFR ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==55) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:225:1: (lv_nfrs_8_0= ruleNFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:225:1: (lv_nfrs_8_0= ruleNFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:226:3: lv_nfrs_8_0= ruleNFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getNfrsNFRParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNFR_in_ruleModel307);
            	    lv_nfrs_8_0=ruleNFR();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nfrs",
            	            		lv_nfrs_8_0, 
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


    // $ANTLR start "entryRuleSystem"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:250:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:251:2: (iv_ruleSystem= ruleSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:252:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem344);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem354); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:259:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Id' ( (lv_systemId_4_0= RULE_STRING ) ) otherlv_5= 'Name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'DecomposedBy' ( (lv_refSystem_10_0= ruleRefSystem ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_systemId_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_refSystem_10_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:262:28: ( (otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Id' ( (lv_systemId_4_0= RULE_STRING ) ) otherlv_5= 'Name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'DecomposedBy' ( (lv_refSystem_10_0= ruleRefSystem ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:263:1: (otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Id' ( (lv_systemId_4_0= RULE_STRING ) ) otherlv_5= 'Name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'DecomposedBy' ( (lv_refSystem_10_0= ruleRefSystem ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:263:1: (otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Id' ( (lv_systemId_4_0= RULE_STRING ) ) otherlv_5= 'Name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'DecomposedBy' ( (lv_refSystem_10_0= ruleRefSystem ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:263:3: otherlv_0= 'System' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Id' ( (lv_systemId_4_0= RULE_STRING ) ) otherlv_5= 'Name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) (otherlv_9= 'DecomposedBy' ( (lv_refSystem_10_0= ruleRefSystem ) ) )? (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSystem391); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:267:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:268:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:268:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:269:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem408); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem425); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSystem437); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getIdKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:293:1: ( (lv_systemId_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:294:1: (lv_systemId_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:294:1: (lv_systemId_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:295:3: lv_systemId_4_0= RULE_STRING
            {
            lv_systemId_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem454); 

            			newLeafNode(lv_systemId_4_0, grammarAccess.getSystemAccess().getSystemIdSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"systemId",
                    		lv_systemId_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSystem471); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getNameKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:315:1: ( (lv_name_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:316:1: (lv_name_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:316:1: (lv_name_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:317:3: lv_name_6_0= RULE_STRING
            {
            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem488); 

            			newLeafNode(lv_name_6_0, grammarAccess.getSystemAccess().getNameSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleSystem505); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getDescriptionKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:337:1: ( (lv_description_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:338:1: (lv_description_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:338:1: (lv_description_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:339:3: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystem522); 

            			newLeafNode(lv_description_8_0, grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_8_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:355:2: (otherlv_9= 'DecomposedBy' ( (lv_refSystem_10_0= ruleRefSystem ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:355:4: otherlv_9= 'DecomposedBy' ( (lv_refSystem_10_0= ruleRefSystem ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSystem540); 

                        	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getDecomposedByKeyword_9_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:359:1: ( (lv_refSystem_10_0= ruleRefSystem ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:360:1: (lv_refSystem_10_0= ruleRefSystem )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:360:1: (lv_refSystem_10_0= ruleRefSystem )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:361:3: lv_refSystem_10_0= ruleRefSystem
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemAccess().getRefSystemRefSystemParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRefSystem_in_ruleSystem561);
                    lv_refSystem_10_0=ruleRefSystem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSystemRule());
                    	        }
                           		set(
                           			current, 
                           			"refSystem",
                            		lv_refSystem_10_0, 
                            		"RefSystem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:377:4: (otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:377:6: otherlv_11= 'PartOf' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleSystem576); 

                        	newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getPartOfKeyword_10_0());
                        
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:381:1: ( (otherlv_12= RULE_ID ) )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:382:1: (otherlv_12= RULE_ID )
                    {
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:382:1: (otherlv_12= RULE_ID )
                    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:383:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem596); 

                    		newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getPartOfSystemCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleSystem610); 

                	newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:406:1: entryRuleRefSystem returns [EObject current=null] : iv_ruleRefSystem= ruleRefSystem EOF ;
    public final EObject entryRuleRefSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSystem = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:407:2: (iv_ruleRefSystem= ruleRefSystem EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:408:2: iv_ruleRefSystem= ruleRefSystem EOF
            {
             newCompositeNode(grammarAccess.getRefSystemRule()); 
            pushFollow(FOLLOW_ruleRefSystem_in_entryRuleRefSystem646);
            iv_ruleRefSystem=ruleRefSystem();

            state._fsp--;

             current =iv_ruleRefSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefSystem656); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:415:1: ruleRefSystem returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:418:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:419:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:419:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:419:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:419:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:420:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:420:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:421:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefSystemRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefSystem701); 

            		newLeafNode(otherlv_0, grammarAccess.getRefSystemAccess().getRefSystemSystemCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:432:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:432:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefSystem714); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefSystemAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:436:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:437:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:437:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:438:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefSystemRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefSystem734); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:457:1: entryRuleGlossary returns [EObject current=null] : iv_ruleGlossary= ruleGlossary EOF ;
    public final EObject entryRuleGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossary = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:458:2: (iv_ruleGlossary= ruleGlossary EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:459:2: iv_ruleGlossary= ruleGlossary EOF
            {
             newCompositeNode(grammarAccess.getGlossaryRule()); 
            pushFollow(FOLLOW_ruleGlossary_in_entryRuleGlossary772);
            iv_ruleGlossary=ruleGlossary();

            state._fsp--;

             current =iv_ruleGlossary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossary782); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:466:1: ruleGlossary returns [EObject current=null] : (otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'POS' ( (lv_pos_12_0= RULE_STRING ) ) otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) otherlv_15= 'TermRelationType' ( (lv_termRelationType_16_0= RULE_STRING ) ) otherlv_17= 'TermRelation' ( (lv_termRelation_18_0= RULE_STRING ) ) otherlv_19= '}' ) ;
    public final EObject ruleGlossary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token lv_acronym_8_0=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token lv_pos_12_0=null;
        Token otherlv_13=null;
        Token lv_synset_14_0=null;
        Token otherlv_15=null;
        Token lv_termRelationType_16_0=null;
        Token otherlv_17=null;
        Token lv_termRelation_18_0=null;
        Token otherlv_19=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:469:28: ( (otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'POS' ( (lv_pos_12_0= RULE_STRING ) ) otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) otherlv_15= 'TermRelationType' ( (lv_termRelationType_16_0= RULE_STRING ) ) otherlv_17= 'TermRelation' ( (lv_termRelation_18_0= RULE_STRING ) ) otherlv_19= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:470:1: (otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'POS' ( (lv_pos_12_0= RULE_STRING ) ) otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) otherlv_15= 'TermRelationType' ( (lv_termRelationType_16_0= RULE_STRING ) ) otherlv_17= 'TermRelation' ( (lv_termRelation_18_0= RULE_STRING ) ) otherlv_19= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:470:1: (otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'POS' ( (lv_pos_12_0= RULE_STRING ) ) otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) otherlv_15= 'TermRelationType' ( (lv_termRelationType_16_0= RULE_STRING ) ) otherlv_17= 'TermRelation' ( (lv_termRelation_18_0= RULE_STRING ) ) otherlv_19= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:470:3: otherlv_0= 'Glossary' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Acronym' ( (lv_acronym_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'POS' ( (lv_pos_12_0= RULE_STRING ) ) otherlv_13= 'Synset' ( (lv_synset_14_0= RULE_STRING ) ) otherlv_15= 'TermRelationType' ( (lv_termRelationType_16_0= RULE_STRING ) ) otherlv_17= 'TermRelation' ( (lv_termRelation_18_0= RULE_STRING ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleGlossary819); 

                	newLeafNode(otherlv_0, grammarAccess.getGlossaryAccess().getGlossaryKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:474:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:475:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:475:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:476:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlossary836); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGlossary853); 

                	newLeafNode(otherlv_2, grammarAccess.getGlossaryAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGlossary865); 

                	newLeafNode(otherlv_3, grammarAccess.getGlossaryAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:500:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:501:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:501:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:502:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary882); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleGlossary899); 

                	newLeafNode(otherlv_5, grammarAccess.getGlossaryAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:522:1: ( (lv_type_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:523:1: (lv_type_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:523:1: (lv_type_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:524:3: lv_type_6_0= RULE_STRING
            {
            lv_type_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary916); 

            			newLeafNode(lv_type_6_0, grammarAccess.getGlossaryAccess().getTypeSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleGlossary933); 

                	newLeafNode(otherlv_7, grammarAccess.getGlossaryAccess().getAcronymKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:544:1: ( (lv_acronym_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:545:1: (lv_acronym_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:545:1: (lv_acronym_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:546:3: lv_acronym_8_0= RULE_STRING
            {
            lv_acronym_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary950); 

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

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleGlossary967); 

                	newLeafNode(otherlv_9, grammarAccess.getGlossaryAccess().getDescriptionKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:566:1: ( (lv_description_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:567:1: (lv_description_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:567:1: (lv_description_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:568:3: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary984); 

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

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleGlossary1001); 

                	newLeafNode(otherlv_11, grammarAccess.getGlossaryAccess().getPOSKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:588:1: ( (lv_pos_12_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:589:1: (lv_pos_12_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:589:1: (lv_pos_12_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:590:3: lv_pos_12_0= RULE_STRING
            {
            lv_pos_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary1018); 

            			newLeafNode(lv_pos_12_0, grammarAccess.getGlossaryAccess().getPosSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pos",
                    		lv_pos_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleGlossary1035); 

                	newLeafNode(otherlv_13, grammarAccess.getGlossaryAccess().getSynsetKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:610:1: ( (lv_synset_14_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:611:1: (lv_synset_14_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:611:1: (lv_synset_14_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:612:3: lv_synset_14_0= RULE_STRING
            {
            lv_synset_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary1052); 

            			newLeafNode(lv_synset_14_0, grammarAccess.getGlossaryAccess().getSynsetSTRINGTerminalRuleCall_14_0()); 
            		

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

            otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleGlossary1069); 

                	newLeafNode(otherlv_15, grammarAccess.getGlossaryAccess().getTermRelationTypeKeyword_15());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:632:1: ( (lv_termRelationType_16_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:633:1: (lv_termRelationType_16_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:633:1: (lv_termRelationType_16_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:634:3: lv_termRelationType_16_0= RULE_STRING
            {
            lv_termRelationType_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary1086); 

            			newLeafNode(lv_termRelationType_16_0, grammarAccess.getGlossaryAccess().getTermRelationTypeSTRINGTerminalRuleCall_16_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"termRelationType",
                    		lv_termRelationType_16_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleGlossary1103); 

                	newLeafNode(otherlv_17, grammarAccess.getGlossaryAccess().getTermRelationKeyword_17());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:654:1: ( (lv_termRelation_18_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:655:1: (lv_termRelation_18_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:655:1: (lv_termRelation_18_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:656:3: lv_termRelation_18_0= RULE_STRING
            {
            lv_termRelation_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGlossary1120); 

            			newLeafNode(lv_termRelation_18_0, grammarAccess.getGlossaryAccess().getTermRelationSTRINGTerminalRuleCall_18_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlossaryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"termRelation",
                    		lv_termRelation_18_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleGlossary1137); 

                	newLeafNode(otherlv_19, grammarAccess.getGlossaryAccess().getRightCurlyBracketKeyword_19());
                

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


    // $ANTLR start "entryRuleStakeholder"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:684:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:685:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:686:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder1173);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder1183); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:693:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Category' ( (lv_category_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}' ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token lv_category_8_0=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token lv_dependsOnType_12_0=null;
        Token otherlv_13=null;
        Token lv_dependsOn_14_0=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:696:28: ( (otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Category' ( (lv_category_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:697:1: (otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Category' ( (lv_category_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:697:1: (otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Category' ( (lv_category_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:697:3: otherlv_0= 'Stakeholder' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Category' ( (lv_category_8_0= RULE_STRING ) ) otherlv_9= 'Description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleStakeholder1220); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:701:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:702:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:702:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:703:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder1237); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStakeholder1254); 

                	newLeafNode(otherlv_2, grammarAccess.getStakeholderAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleStakeholder1266); 

                	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:727:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:728:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:728:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:729:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder1283); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleStakeholder1300); 

                	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:749:1: ( (lv_type_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:750:1: (lv_type_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:750:1: (lv_type_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:751:3: lv_type_6_0= RULE_STRING
            {
            lv_type_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder1317); 

            			newLeafNode(lv_type_6_0, grammarAccess.getStakeholderAccess().getTypeSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStakeholderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleStakeholder1334); 

                	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getCategoryKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:771:1: ( (lv_category_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:772:1: (lv_category_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:772:1: (lv_category_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:773:3: lv_category_8_0= RULE_STRING
            {
            lv_category_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder1351); 

            			newLeafNode(lv_category_8_0, grammarAccess.getStakeholderAccess().getCategorySTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStakeholderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"category",
                    		lv_category_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleStakeholder1368); 

                	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getDescriptionKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:793:1: ( (lv_description_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:794:1: (lv_description_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:794:1: (lv_description_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:795:3: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder1385); 

            			newLeafNode(lv_description_10_0, grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
            		

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

            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleStakeholder1402); 

                	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getDependsOnTypeKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:815:1: ( (lv_dependsOnType_12_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:1: (lv_dependsOnType_12_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:816:1: (lv_dependsOnType_12_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:817:3: lv_dependsOnType_12_0= RULE_STRING
            {
            lv_dependsOnType_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder1419); 

            			newLeafNode(lv_dependsOnType_12_0, grammarAccess.getStakeholderAccess().getDependsOnTypeSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStakeholderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dependsOnType",
                    		lv_dependsOnType_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleStakeholder1436); 

                	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getDependsOnKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:837:1: ( (lv_dependsOn_14_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:838:1: (lv_dependsOn_14_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:838:1: (lv_dependsOn_14_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:839:3: lv_dependsOn_14_0= RULE_STRING
            {
            lv_dependsOn_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStakeholder1453); 

            			newLeafNode(lv_dependsOn_14_0, grammarAccess.getStakeholderAccess().getDependsOnSTRINGTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStakeholderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dependsOn",
                    		lv_dependsOn_14_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleStakeholder1470); 

                	newLeafNode(otherlv_15, grammarAccess.getStakeholderAccess().getRightCurlyBracketKeyword_15());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:867:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:868:2: (iv_ruleGoal= ruleGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:869:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1506);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1516); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:876:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( (lv_priority_8_0= RULE_STRING ) ) otherlv_9= 'DependsOnType' ( (lv_dependsOnType_10_0= RULE_STRING ) ) otherlv_11= 'DependsOn' ( (lv_dependsOn_12_0= RULE_STRING ) ) otherlv_13= 'ComposedByType' ( (lv_composedByType_14_0= RULE_STRING ) ) otherlv_15= 'ComposedBy' ( (lv_composedBy_16_0= RULE_STRING ) ) otherlv_17= '}' ) ;
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
        Token lv_priority_8_0=null;
        Token otherlv_9=null;
        Token lv_dependsOnType_10_0=null;
        Token otherlv_11=null;
        Token lv_dependsOn_12_0=null;
        Token otherlv_13=null;
        Token lv_composedByType_14_0=null;
        Token otherlv_15=null;
        Token lv_composedBy_16_0=null;
        Token otherlv_17=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:879:28: ( (otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( (lv_priority_8_0= RULE_STRING ) ) otherlv_9= 'DependsOnType' ( (lv_dependsOnType_10_0= RULE_STRING ) ) otherlv_11= 'DependsOn' ( (lv_dependsOn_12_0= RULE_STRING ) ) otherlv_13= 'ComposedByType' ( (lv_composedByType_14_0= RULE_STRING ) ) otherlv_15= 'ComposedBy' ( (lv_composedBy_16_0= RULE_STRING ) ) otherlv_17= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:880:1: (otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( (lv_priority_8_0= RULE_STRING ) ) otherlv_9= 'DependsOnType' ( (lv_dependsOnType_10_0= RULE_STRING ) ) otherlv_11= 'DependsOn' ( (lv_dependsOn_12_0= RULE_STRING ) ) otherlv_13= 'ComposedByType' ( (lv_composedByType_14_0= RULE_STRING ) ) otherlv_15= 'ComposedBy' ( (lv_composedBy_16_0= RULE_STRING ) ) otherlv_17= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:880:1: (otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( (lv_priority_8_0= RULE_STRING ) ) otherlv_9= 'DependsOnType' ( (lv_dependsOnType_10_0= RULE_STRING ) ) otherlv_11= 'DependsOn' ( (lv_dependsOn_12_0= RULE_STRING ) ) otherlv_13= 'ComposedByType' ( (lv_composedByType_14_0= RULE_STRING ) ) otherlv_15= 'ComposedBy' ( (lv_composedBy_16_0= RULE_STRING ) ) otherlv_17= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:880:3: otherlv_0= 'Goal' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Stakeholder' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Priority' ( (lv_priority_8_0= RULE_STRING ) ) otherlv_9= 'DependsOnType' ( (lv_dependsOnType_10_0= RULE_STRING ) ) otherlv_11= 'DependsOn' ( (lv_dependsOn_12_0= RULE_STRING ) ) otherlv_13= 'ComposedByType' ( (lv_composedByType_14_0= RULE_STRING ) ) otherlv_15= 'ComposedBy' ( (lv_composedBy_16_0= RULE_STRING ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleGoal1553); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:884:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:885:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:885:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:886:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal1570); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoal1587); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleGoal1599); 

                	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:910:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:911:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:911:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:912:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal1616); 

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

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleGoal1633); 

                	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getStakeholderKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:932:1: ( (otherlv_6= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:933:1: (otherlv_6= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:933:1: (otherlv_6= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:934:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal1653); 

            		newLeafNode(otherlv_6, grammarAccess.getGoalAccess().getStakeholderStakeholderCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleGoal1665); 

                	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getPriorityKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:949:1: ( (lv_priority_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:950:1: (lv_priority_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:950:1: (lv_priority_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:951:3: lv_priority_8_0= RULE_STRING
            {
            lv_priority_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal1682); 

            			newLeafNode(lv_priority_8_0, grammarAccess.getGoalAccess().getPrioritySTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"priority",
                    		lv_priority_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleGoal1699); 

                	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getDependsOnTypeKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:971:1: ( (lv_dependsOnType_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:972:1: (lv_dependsOnType_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:972:1: (lv_dependsOnType_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:973:3: lv_dependsOnType_10_0= RULE_STRING
            {
            lv_dependsOnType_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal1716); 

            			newLeafNode(lv_dependsOnType_10_0, grammarAccess.getGoalAccess().getDependsOnTypeSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dependsOnType",
                    		lv_dependsOnType_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleGoal1733); 

                	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getDependsOnKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:993:1: ( (lv_dependsOn_12_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:994:1: (lv_dependsOn_12_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:994:1: (lv_dependsOn_12_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:995:3: lv_dependsOn_12_0= RULE_STRING
            {
            lv_dependsOn_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal1750); 

            			newLeafNode(lv_dependsOn_12_0, grammarAccess.getGoalAccess().getDependsOnSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dependsOn",
                    		lv_dependsOn_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,33,FOLLOW_33_in_ruleGoal1767); 

                	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getComposedByTypeKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1015:1: ( (lv_composedByType_14_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1016:1: (lv_composedByType_14_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1016:1: (lv_composedByType_14_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1017:3: lv_composedByType_14_0= RULE_STRING
            {
            lv_composedByType_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal1784); 

            			newLeafNode(lv_composedByType_14_0, grammarAccess.getGoalAccess().getComposedByTypeSTRINGTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"composedByType",
                    		lv_composedByType_14_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleGoal1801); 

                	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getComposedByKeyword_15());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1037:1: ( (lv_composedBy_16_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1038:1: (lv_composedBy_16_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1038:1: (lv_composedBy_16_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1039:3: lv_composedBy_16_0= RULE_STRING
            {
            lv_composedBy_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal1818); 

            			newLeafNode(lv_composedBy_16_0, grammarAccess.getGoalAccess().getComposedBySTRINGTerminalRuleCall_16_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"composedBy",
                    		lv_composedBy_16_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleGoal1835); 

                	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_17());
                

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


    // $ANTLR start "entryRuleEntity"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1067:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1068:2: (iv_ruleEntity= ruleEntity EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1069:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1871);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1881); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1076:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1079:28: ( (otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1080:1: (otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1080:1: (otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1080:3: otherlv_0= 'Entity' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleEntity1918); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1084:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1085:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1085:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1086:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1935); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity1952); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEntity1964); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1110:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1111:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1111:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1112:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity1981); 

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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleEntity1998); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1132:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1133:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1133:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1134:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity2015); 

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

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1150:2: ( (lv_attributes_7_0= ruleAttribute ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1151:1: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1151:1: (lv_attributes_7_0= ruleAttribute )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1152:3: lv_attributes_7_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity2041);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEntity2054); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1180:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1181:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1182:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2090);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2100); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1189:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'FieldSize' ( (lv_fieldSize_9_0= RULE_INT ) ) otherlv_10= 'FieldMultiplicity' ( (lv_fieldMultiplicity_11_0= RULE_STRING ) ) otherlv_12= 'DefaultValue' ( (lv_defaultValue_13_0= RULE_STRING ) ) otherlv_14= 'ReferencesTo' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Multiplicity' ( (lv_multiplicity_17_0= RULE_STRING ) ) otherlv_18= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_descrition_5_0=null;
        Token otherlv_6=null;
        Token lv_type_7_0=null;
        Token otherlv_8=null;
        Token lv_fieldSize_9_0=null;
        Token otherlv_10=null;
        Token lv_fieldMultiplicity_11_0=null;
        Token otherlv_12=null;
        Token lv_defaultValue_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_multiplicity_17_0=null;
        Token otherlv_18=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1192:28: ( (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'FieldSize' ( (lv_fieldSize_9_0= RULE_INT ) ) otherlv_10= 'FieldMultiplicity' ( (lv_fieldMultiplicity_11_0= RULE_STRING ) ) otherlv_12= 'DefaultValue' ( (lv_defaultValue_13_0= RULE_STRING ) ) otherlv_14= 'ReferencesTo' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Multiplicity' ( (lv_multiplicity_17_0= RULE_STRING ) ) otherlv_18= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1193:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'FieldSize' ( (lv_fieldSize_9_0= RULE_INT ) ) otherlv_10= 'FieldMultiplicity' ( (lv_fieldMultiplicity_11_0= RULE_STRING ) ) otherlv_12= 'DefaultValue' ( (lv_defaultValue_13_0= RULE_STRING ) ) otherlv_14= 'ReferencesTo' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Multiplicity' ( (lv_multiplicity_17_0= RULE_STRING ) ) otherlv_18= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1193:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'FieldSize' ( (lv_fieldSize_9_0= RULE_INT ) ) otherlv_10= 'FieldMultiplicity' ( (lv_fieldMultiplicity_11_0= RULE_STRING ) ) otherlv_12= 'DefaultValue' ( (lv_defaultValue_13_0= RULE_STRING ) ) otherlv_14= 'ReferencesTo' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Multiplicity' ( (lv_multiplicity_17_0= RULE_STRING ) ) otherlv_18= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1193:3: otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Description' ( (lv_descrition_5_0= RULE_STRING ) ) otherlv_6= 'Type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'FieldSize' ( (lv_fieldSize_9_0= RULE_INT ) ) otherlv_10= 'FieldMultiplicity' ( (lv_fieldMultiplicity_11_0= RULE_STRING ) ) otherlv_12= 'DefaultValue' ( (lv_defaultValue_13_0= RULE_STRING ) ) otherlv_14= 'ReferencesTo' ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Multiplicity' ( (lv_multiplicity_17_0= RULE_STRING ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleAttribute2137); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAttribute2149); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAttribute2161); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getNameKeyword_2());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1205:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1206:1: (lv_name_3_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1206:1: (lv_name_3_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1207:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2178); 

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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAttribute2195); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1227:1: ( (lv_descrition_5_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1228:1: (lv_descrition_5_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1228:1: (lv_descrition_5_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1229:3: lv_descrition_5_0= RULE_STRING
            {
            lv_descrition_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2212); 

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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleAttribute2229); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1249:1: ( (lv_type_7_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1250:1: (lv_type_7_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1250:1: (lv_type_7_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1251:3: lv_type_7_0= RULE_STRING
            {
            lv_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2246); 

            			newLeafNode(lv_type_7_0, grammarAccess.getAttributeAccess().getTypeSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleAttribute2263); 

                	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getFieldSizeKeyword_8());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1271:1: ( (lv_fieldSize_9_0= RULE_INT ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1272:1: (lv_fieldSize_9_0= RULE_INT )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1272:1: (lv_fieldSize_9_0= RULE_INT )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1273:3: lv_fieldSize_9_0= RULE_INT
            {
            lv_fieldSize_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttribute2280); 

            			newLeafNode(lv_fieldSize_9_0, grammarAccess.getAttributeAccess().getFieldSizeINTTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fieldSize",
                    		lv_fieldSize_9_0, 
                    		"INT");
            	    

            }


            }

            otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleAttribute2297); 

                	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getFieldMultiplicityKeyword_10());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1293:1: ( (lv_fieldMultiplicity_11_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1294:1: (lv_fieldMultiplicity_11_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1294:1: (lv_fieldMultiplicity_11_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1295:3: lv_fieldMultiplicity_11_0= RULE_STRING
            {
            lv_fieldMultiplicity_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2314); 

            			newLeafNode(lv_fieldMultiplicity_11_0, grammarAccess.getAttributeAccess().getFieldMultiplicitySTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fieldMultiplicity",
                    		lv_fieldMultiplicity_11_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleAttribute2331); 

                	newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getDefaultValueKeyword_12());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1315:1: ( (lv_defaultValue_13_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1316:1: (lv_defaultValue_13_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1316:1: (lv_defaultValue_13_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1317:3: lv_defaultValue_13_0= RULE_STRING
            {
            lv_defaultValue_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2348); 

            			newLeafNode(lv_defaultValue_13_0, grammarAccess.getAttributeAccess().getDefaultValueSTRINGTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"defaultValue",
                    		lv_defaultValue_13_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_14=(Token)match(input,40,FOLLOW_40_in_ruleAttribute2365); 

                	newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getReferencesToKeyword_14());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1337:1: ( (otherlv_15= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1338:1: (otherlv_15= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1338:1: (otherlv_15= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1339:3: otherlv_15= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2385); 

            		newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getRefToEntityCrossReference_15_0()); 
            	

            }


            }

            otherlv_16=(Token)match(input,41,FOLLOW_41_in_ruleAttribute2397); 

                	newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getMultiplicityKeyword_16());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1354:1: ( (lv_multiplicity_17_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1355:1: (lv_multiplicity_17_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1355:1: (lv_multiplicity_17_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1356:3: lv_multiplicity_17_0= RULE_STRING
            {
            lv_multiplicity_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2414); 

            			newLeafNode(lv_multiplicity_17_0, grammarAccess.getAttributeAccess().getMultiplicitySTRINGTerminalRuleCall_17_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"multiplicity",
                    		lv_multiplicity_17_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleAttribute2431); 

                	newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_18());
                

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


    // $ANTLR start "entryRuleActor"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1384:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1385:2: (iv_ruleActor= ruleActor EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1386:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor2467);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor2477); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1393:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_dependsOnType_12_0=null;
        Token otherlv_13=null;
        Token lv_dependsOn_14_0=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1396:28: ( (otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1397:1: (otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1397:1: (otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1397:3: otherlv_0= 'Actor' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Stakeholder' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'DependsOnType' ( (lv_dependsOnType_12_0= RULE_STRING ) ) otherlv_13= 'DependsOn' ( (lv_dependsOn_14_0= RULE_STRING ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleActor2514); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1401:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1402:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1402:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1403:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor2531); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActor2548); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleActor2560); 

                	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1427:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1428:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1428:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1429:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor2577); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleActor2594); 

                	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1449:1: ( (lv_type_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1450:1: (lv_type_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1450:1: (lv_type_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1451:3: lv_type_6_0= RULE_STRING
            {
            lv_type_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor2611); 

            			newLeafNode(lv_type_6_0, grammarAccess.getActorAccess().getTypeSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleActor2628); 

                	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getDescriptionKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1471:1: ( (lv_description_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1472:1: (lv_description_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1472:1: (lv_description_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1473:3: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor2645); 

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

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleActor2662); 

                	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getStakeholderKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1493:1: ( (otherlv_10= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1494:1: (otherlv_10= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1494:1: (otherlv_10= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1495:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor2682); 

            		newLeafNode(otherlv_10, grammarAccess.getActorAccess().getStakeholderStakeholderCrossReference_10_0()); 
            	

            }


            }

            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleActor2694); 

                	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getDependsOnTypeKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1510:1: ( (lv_dependsOnType_12_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1511:1: (lv_dependsOnType_12_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1511:1: (lv_dependsOnType_12_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1512:3: lv_dependsOnType_12_0= RULE_STRING
            {
            lv_dependsOnType_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor2711); 

            			newLeafNode(lv_dependsOnType_12_0, grammarAccess.getActorAccess().getDependsOnTypeSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dependsOnType",
                    		lv_dependsOnType_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleActor2728); 

                	newLeafNode(otherlv_13, grammarAccess.getActorAccess().getDependsOnKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1532:1: ( (lv_dependsOn_14_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1533:1: (lv_dependsOn_14_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1533:1: (lv_dependsOn_14_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1534:3: lv_dependsOn_14_0= RULE_STRING
            {
            lv_dependsOn_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor2745); 

            			newLeafNode(lv_dependsOn_14_0, grammarAccess.getActorAccess().getDependsOnSTRINGTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dependsOn",
                    		lv_dependsOn_14_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleActor2762); 

                	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_15());
                

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1562:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1563:2: (iv_ruleUseCase= ruleUseCase EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1564:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase2798);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase2808); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1571:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'AccomplishedGoals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1574:28: ( (otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'AccomplishedGoals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1575:1: (otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'AccomplishedGoals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1575:1: (otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'AccomplishedGoals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1575:3: otherlv_0= 'UseCase' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( (lv_type_6_0= RULE_STRING ) ) otherlv_7= 'Description' ( (lv_description_8_0= RULE_STRING ) ) otherlv_9= 'Priority' ( (lv_priotity_10_0= RULE_STRING ) ) otherlv_11= 'AccomplishedGoals' ( (lv_goals_12_0= ruleRefGoal ) )* otherlv_13= 'FunctionalRequirements' ( (lv_frs_14_0= ruleRefFR ) )* otherlv_15= 'ActorInitiates' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ActorParticipates' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'Pre-Conditions' ( (lv_preConditions_20_0= RULE_STRING ) ) otherlv_21= 'Post-Conditions' ( (lv_postConditions_22_0= RULE_STRING ) ) otherlv_23= 'Include' ( (lv_includes_24_0= ruleRefUC ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleUseCase2845); 

                	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1579:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1580:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1580:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1581:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase2862); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUseCase2879); 

                	newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleUseCase2891); 

                	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1605:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1606:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1606:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1607:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase2908); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleUseCase2925); 

                	newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1627:1: ( (lv_type_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1628:1: (lv_type_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1628:1: (lv_type_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1629:3: lv_type_6_0= RULE_STRING
            {
            lv_type_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase2942); 

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

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleUseCase2959); 

                	newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getDescriptionKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1649:1: ( (lv_description_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1650:1: (lv_description_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1650:1: (lv_description_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1651:3: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase2976); 

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

            otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleUseCase2993); 

                	newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getPriorityKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1671:1: ( (lv_priotity_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1672:1: (lv_priotity_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1672:1: (lv_priotity_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1673:3: lv_priotity_10_0= RULE_STRING
            {
            lv_priotity_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase3010); 

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

            otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleUseCase3027); 

                	newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getAccomplishedGoalsKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1693:1: ( (lv_goals_12_0= ruleRefGoal ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1694:1: (lv_goals_12_0= ruleRefGoal )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1694:1: (lv_goals_12_0= ruleRefGoal )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1695:3: lv_goals_12_0= ruleRefGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getGoalsRefGoalParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefGoal_in_ruleUseCase3048);
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
            	    break loop14;
                }
            } while (true);

            otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleUseCase3061); 

                	newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getFunctionalRequirementsKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1715:1: ( (lv_frs_14_0= ruleRefFR ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1716:1: (lv_frs_14_0= ruleRefFR )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1716:1: (lv_frs_14_0= ruleRefFR )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1717:3: lv_frs_14_0= ruleRefFR
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getFrsRefFRParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefFR_in_ruleUseCase3082);
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
            	    break loop15;
                }
            } while (true);

            otherlv_15=(Token)match(input,46,FOLLOW_46_in_ruleUseCase3095); 

                	newLeafNode(otherlv_15, grammarAccess.getUseCaseAccess().getActorInitiatesKeyword_15());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1737:1: ( (otherlv_16= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1738:1: (otherlv_16= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1738:1: (otherlv_16= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1739:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase3115); 

            		newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getActorInitiatesActorCrossReference_16_0()); 
            	

            }


            }

            otherlv_17=(Token)match(input,47,FOLLOW_47_in_ruleUseCase3127); 

                	newLeafNode(otherlv_17, grammarAccess.getUseCaseAccess().getActorParticipatesKeyword_17());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1754:1: ( (otherlv_18= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1755:1: (otherlv_18= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1755:1: (otherlv_18= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1756:3: otherlv_18= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseCaseRule());
            	        }
                    
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase3147); 

            		newLeafNode(otherlv_18, grammarAccess.getUseCaseAccess().getActorParticipatesActorCrossReference_18_0()); 
            	

            }


            }

            otherlv_19=(Token)match(input,48,FOLLOW_48_in_ruleUseCase3159); 

                	newLeafNode(otherlv_19, grammarAccess.getUseCaseAccess().getPreConditionsKeyword_19());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1771:1: ( (lv_preConditions_20_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1772:1: (lv_preConditions_20_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1772:1: (lv_preConditions_20_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1773:3: lv_preConditions_20_0= RULE_STRING
            {
            lv_preConditions_20_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase3176); 

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

            otherlv_21=(Token)match(input,49,FOLLOW_49_in_ruleUseCase3193); 

                	newLeafNode(otherlv_21, grammarAccess.getUseCaseAccess().getPostConditionsKeyword_21());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1793:1: ( (lv_postConditions_22_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1794:1: (lv_postConditions_22_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1794:1: (lv_postConditions_22_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1795:3: lv_postConditions_22_0= RULE_STRING
            {
            lv_postConditions_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase3210); 

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

            otherlv_23=(Token)match(input,50,FOLLOW_50_in_ruleUseCase3227); 

                	newLeafNode(otherlv_23, grammarAccess.getUseCaseAccess().getIncludeKeyword_23());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1815:1: ( (lv_includes_24_0= ruleRefUC ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1816:1: (lv_includes_24_0= ruleRefUC )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1816:1: (lv_includes_24_0= ruleRefUC )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1817:3: lv_includes_24_0= ruleRefUC
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getIncludesRefUCParserRuleCall_24_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRefUC_in_ruleUseCase3248);
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
            	    break loop16;
                }
            } while (true);

            otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleUseCase3261); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1845:1: entryRuleFR returns [EObject current=null] : iv_ruleFR= ruleFR EOF ;
    public final EObject entryRuleFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1846:2: (iv_ruleFR= ruleFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1847:2: iv_ruleFR= ruleFR EOF
            {
             newCompositeNode(grammarAccess.getFRRule()); 
            pushFollow(FOLLOW_ruleFR_in_entryRuleFR3297);
            iv_ruleFR=ruleFR();

            state._fsp--;

             current =iv_ruleFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFR3307); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1854:1: ruleFR returns [EObject current=null] : (otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Source (Stakeholder)' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1857:28: ( (otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Source (Stakeholder)' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1858:1: (otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Source (Stakeholder)' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1858:1: (otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Source (Stakeholder)' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1858:3: otherlv_0= 'FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'ModalityType' ( (lv_modalityType_8_0= RULE_STRING ) ) otherlv_9= 'ActionType' ( (lv_actionType_10_0= RULE_STRING ) ) otherlv_11= 'Source (Stakeholder)' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Priority' ( (lv_priority_14_0= RULE_STRING ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleFR3344); 

                	newLeafNode(otherlv_0, grammarAccess.getFRAccess().getFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1862:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1863:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1863:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1864:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR3361); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFR3378); 

                	newLeafNode(otherlv_2, grammarAccess.getFRAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleFR3390); 

                	newLeafNode(otherlv_3, grammarAccess.getFRAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1888:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1889:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1889:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1890:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR3407); 

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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleFR3424); 

                	newLeafNode(otherlv_5, grammarAccess.getFRAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1910:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1911:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1911:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1912:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR3441); 

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

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleFR3458); 

                	newLeafNode(otherlv_7, grammarAccess.getFRAccess().getModalityTypeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1932:1: ( (lv_modalityType_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1933:1: (lv_modalityType_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1933:1: (lv_modalityType_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1934:3: lv_modalityType_8_0= RULE_STRING
            {
            lv_modalityType_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR3475); 

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

            otherlv_9=(Token)match(input,53,FOLLOW_53_in_ruleFR3492); 

                	newLeafNode(otherlv_9, grammarAccess.getFRAccess().getActionTypeKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1954:1: ( (lv_actionType_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1955:1: (lv_actionType_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1955:1: (lv_actionType_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1956:3: lv_actionType_10_0= RULE_STRING
            {
            lv_actionType_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR3509); 

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

            otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleFR3526); 

                	newLeafNode(otherlv_11, grammarAccess.getFRAccess().getSourceStakeholderKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1976:1: ( (otherlv_12= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1977:1: (otherlv_12= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1977:1: (otherlv_12= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1978:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFRRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFR3546); 

            		newLeafNode(otherlv_12, grammarAccess.getFRAccess().getSourceStakeholderCrossReference_12_0()); 
            	

            }


            }

            otherlv_13=(Token)match(input,32,FOLLOW_32_in_ruleFR3558); 

                	newLeafNode(otherlv_13, grammarAccess.getFRAccess().getPriorityKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1993:1: ( (lv_priority_14_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1994:1: (lv_priority_14_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1994:1: (lv_priority_14_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:1995:3: lv_priority_14_0= RULE_STRING
            {
            lv_priority_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFR3575); 

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

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleFR3592); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2023:1: entryRuleNFR returns [EObject current=null] : iv_ruleNFR= ruleNFR EOF ;
    public final EObject entryRuleNFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2024:2: (iv_ruleNFR= ruleNFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2025:2: iv_ruleNFR= ruleNFR EOF
            {
             newCompositeNode(grammarAccess.getNFRRule()); 
            pushFollow(FOLLOW_ruleNFR_in_entryRuleNFR3628);
            iv_ruleNFR=ruleNFR();

            state._fsp--;

             current =iv_ruleNFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNFR3638); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2032:1: ruleNFR returns [EObject current=null] : (otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}' ) ;
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
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2035:28: ( (otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}' ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2036:1: (otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}' )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2036:1: (otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}' )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2036:3: otherlv_0= 'Non-FunctionalRequirement' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= 'Sub-Type' ( (lv_subType_10_0= RULE_STRING ) ) otherlv_11= 'Metric' ( (lv_metric_12_0= RULE_STRING ) ) otherlv_13= 'Value' ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= 'Source (Stakeholder)' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'Priority' ( (lv_priority_18_0= RULE_STRING ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleNFR3675); 

                	newLeafNode(otherlv_0, grammarAccess.getNFRAccess().getNonFunctionalRequirementKeyword_0());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2040:1: ( (lv_id_1_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2041:1: (lv_id_1_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2041:1: (lv_id_1_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2042:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNFR3692); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNFR3709); 

                	newLeafNode(otherlv_2, grammarAccess.getNFRAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleNFR3721); 

                	newLeafNode(otherlv_3, grammarAccess.getNFRAccess().getNameKeyword_3());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2066:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2067:1: (lv_name_4_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2067:1: (lv_name_4_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2068:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR3738); 

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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleNFR3755); 

                	newLeafNode(otherlv_5, grammarAccess.getNFRAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2088:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2089:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2089:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2090:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR3772); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleNFR3789); 

                	newLeafNode(otherlv_7, grammarAccess.getNFRAccess().getTypeKeyword_7());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2110:1: ( (lv_type_8_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2111:1: (lv_type_8_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2111:1: (lv_type_8_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2112:3: lv_type_8_0= RULE_STRING
            {
            lv_type_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR3806); 

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

            otherlv_9=(Token)match(input,56,FOLLOW_56_in_ruleNFR3823); 

                	newLeafNode(otherlv_9, grammarAccess.getNFRAccess().getSubTypeKeyword_9());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2132:1: ( (lv_subType_10_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2133:1: (lv_subType_10_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2133:1: (lv_subType_10_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2134:3: lv_subType_10_0= RULE_STRING
            {
            lv_subType_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR3840); 

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

            otherlv_11=(Token)match(input,57,FOLLOW_57_in_ruleNFR3857); 

                	newLeafNode(otherlv_11, grammarAccess.getNFRAccess().getMetricKeyword_11());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2154:1: ( (lv_metric_12_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2155:1: (lv_metric_12_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2155:1: (lv_metric_12_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2156:3: lv_metric_12_0= RULE_STRING
            {
            lv_metric_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR3874); 

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

            otherlv_13=(Token)match(input,58,FOLLOW_58_in_ruleNFR3891); 

                	newLeafNode(otherlv_13, grammarAccess.getNFRAccess().getValueKeyword_13());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2176:1: ( (lv_value_14_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2177:1: (lv_value_14_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2177:1: (lv_value_14_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2178:3: lv_value_14_0= RULE_STRING
            {
            lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR3908); 

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

            otherlv_15=(Token)match(input,54,FOLLOW_54_in_ruleNFR3925); 

                	newLeafNode(otherlv_15, grammarAccess.getNFRAccess().getSourceStakeholderKeyword_15());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2198:1: ( (otherlv_16= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2199:1: (otherlv_16= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2199:1: (otherlv_16= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2200:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNFRRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNFR3945); 

            		newLeafNode(otherlv_16, grammarAccess.getNFRAccess().getSourceStakeholderCrossReference_16_0()); 
            	

            }


            }

            otherlv_17=(Token)match(input,32,FOLLOW_32_in_ruleNFR3957); 

                	newLeafNode(otherlv_17, grammarAccess.getNFRAccess().getPriorityKeyword_17());
                
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2215:1: ( (lv_priority_18_0= RULE_STRING ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2216:1: (lv_priority_18_0= RULE_STRING )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2216:1: (lv_priority_18_0= RULE_STRING )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2217:3: lv_priority_18_0= RULE_STRING
            {
            lv_priority_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNFR3974); 

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

            otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleNFR3991); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2245:1: entryRuleRefGoal returns [EObject current=null] : iv_ruleRefGoal= ruleRefGoal EOF ;
    public final EObject entryRuleRefGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefGoal = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2246:2: (iv_ruleRefGoal= ruleRefGoal EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2247:2: iv_ruleRefGoal= ruleRefGoal EOF
            {
             newCompositeNode(grammarAccess.getRefGoalRule()); 
            pushFollow(FOLLOW_ruleRefGoal_in_entryRuleRefGoal4027);
            iv_ruleRefGoal=ruleRefGoal();

            state._fsp--;

             current =iv_ruleRefGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGoal4037); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2254:1: ruleRefGoal returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2257:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2258:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2258:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2258:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2258:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2259:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2259:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2260:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefGoalRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal4082); 

            		newLeafNode(otherlv_0, grammarAccess.getRefGoalAccess().getRefGoalGoalCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2271:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2271:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefGoal4095); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefGoalAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2275:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2276:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2276:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2277:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefGoalRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGoal4115); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefGoalAccess().getRefsGoalCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleRefGoal"


    // $ANTLR start "entryRuleRefFR"
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2296:1: entryRuleRefFR returns [EObject current=null] : iv_ruleRefFR= ruleRefFR EOF ;
    public final EObject entryRuleRefFR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefFR = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2297:2: (iv_ruleRefFR= ruleRefFR EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2298:2: iv_ruleRefFR= ruleRefFR EOF
            {
             newCompositeNode(grammarAccess.getRefFRRule()); 
            pushFollow(FOLLOW_ruleRefFR_in_entryRuleRefFR4153);
            iv_ruleRefFR=ruleRefFR();

            state._fsp--;

             current =iv_ruleRefFR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefFR4163); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2305:1: ruleRefFR returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefFR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2308:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2309:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2309:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2309:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2309:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2310:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2310:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2311:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefFRRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR4208); 

            		newLeafNode(otherlv_0, grammarAccess.getRefFRAccess().getRefFRFRCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2322:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2322:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefFR4221); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefFRAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2326:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2327:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2327:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2328:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefFRRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefFR4241); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefFRAccess().getRefsFRCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2347:1: entryRuleRefUC returns [EObject current=null] : iv_ruleRefUC= ruleRefUC EOF ;
    public final EObject entryRuleRefUC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefUC = null;


        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2348:2: (iv_ruleRefUC= ruleRefUC EOF )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2349:2: iv_ruleRefUC= ruleRefUC EOF
            {
             newCompositeNode(grammarAccess.getRefUCRule()); 
            pushFollow(FOLLOW_ruleRefUC_in_entryRuleRefUC4279);
            iv_ruleRefUC=ruleRefUC();

            state._fsp--;

             current =iv_ruleRefUC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefUC4289); 

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
    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2356:1: ruleRefUC returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefUC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2359:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2360:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2360:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2360:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2360:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2361:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2361:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2362:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefUCRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC4334); 

            		newLeafNode(otherlv_0, grammarAccess.getRefUCAccess().getRefUCUseCaseCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2373:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2373:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRefUC4347); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefUCAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2377:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2378:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2378:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil/src-gen/rslingo/rslil/parser/antlr/internal/InternalRSLIL.g:2379:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefUCRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefUC4367); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefUCAccess().getRefsUseCaseCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel131 = new BitSet(new long[]{0x00880C0888100802L});
    public static final BitSet FOLLOW_ruleGlossary_in_ruleModel153 = new BitSet(new long[]{0x00880C0888100002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleModel175 = new BitSet(new long[]{0x00880C0888000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleModel197 = new BitSet(new long[]{0x00880C0880000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel219 = new BitSet(new long[]{0x00880C0800000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleModel241 = new BitSet(new long[]{0x00880C0000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_ruleModel263 = new BitSet(new long[]{0x0088080000000002L});
    public static final BitSet FOLLOW_ruleFR_in_ruleModel285 = new BitSet(new long[]{0x0088000000000002L});
    public static final BitSet FOLLOW_ruleNFR_in_ruleModel307 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSystem391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem408 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem425 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem454 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSystem471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem488 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSystem505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystem522 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_16_in_ruleSystem540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefSystem_in_ruleSystem561 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleSystem576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem596 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSystem610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefSystem_in_entryRuleRefSystem646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefSystem656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefSystem701 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefSystem714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefSystem734 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleGlossary_in_entryRuleGlossary772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossary782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleGlossary819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlossary836 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGlossary853 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGlossary865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary882 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGlossary899 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary916 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGlossary933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary950 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGlossary967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary984 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleGlossary1001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary1018 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleGlossary1035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary1052 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGlossary1069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary1086 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleGlossary1103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGlossary1120 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGlossary1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleStakeholder1220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder1237 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStakeholder1254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStakeholder1266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder1283 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStakeholder1300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder1317 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleStakeholder1334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder1351 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStakeholder1368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder1385 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleStakeholder1402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder1419 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleStakeholder1436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStakeholder1453 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStakeholder1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleGoal1553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal1570 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoal1587 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGoal1599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal1616 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleGoal1633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal1653 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleGoal1665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal1682 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGoal1699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal1716 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleGoal1733 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal1750 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleGoal1767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal1784 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleGoal1801 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal1818 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEntity1918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1935 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity1952 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity1964 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity1981 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity2015 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity2041 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntity2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttribute2137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute2149 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttribute2161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2178 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAttribute2195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2212 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAttribute2229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2246 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAttribute2263 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttribute2280 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleAttribute2297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2314 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAttribute2331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2348 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAttribute2365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2385 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleAttribute2397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2414 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttribute2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor2467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleActor2514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor2531 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor2548 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActor2560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor2577 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor2594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor2611 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActor2628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor2645 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleActor2662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor2682 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleActor2694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor2711 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleActor2728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor2745 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase2798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleUseCase2845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase2862 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUseCase2879 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUseCase2891 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase2908 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUseCase2925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase2942 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUseCase2959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase2976 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleUseCase2993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase3010 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleUseCase3027 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_ruleRefGoal_in_ruleUseCase3048 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_45_in_ruleUseCase3061 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_ruleRefFR_in_ruleUseCase3082 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleUseCase3095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase3115 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleUseCase3127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase3147 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleUseCase3159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase3176 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleUseCase3193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase3210 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleUseCase3227 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleRefUC_in_ruleUseCase3248 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleUseCase3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFR_in_entryRuleFR3297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFR3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFR3344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR3361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFR3378 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFR3390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR3407 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFR3424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR3441 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleFR3458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR3475 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleFR3492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR3509 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleFR3526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFR3546 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFR3558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFR3575 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFR3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNFR_in_entryRuleNFR3628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNFR3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNFR3675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNFR3692 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNFR3709 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNFR3721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR3738 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNFR3755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR3772 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNFR3789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR3806 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleNFR3823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR3840 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleNFR3857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR3874 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleNFR3891 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR3908 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleNFR3925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNFR3945 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNFR3957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNFR3974 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNFR3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGoal_in_entryRuleRefGoal4027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGoal4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal4082 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefGoal4095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGoal4115 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRefFR_in_entryRuleRefFR4153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefFR4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR4208 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefFR4221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefFR4241 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRefUC_in_entryRuleRefUC4279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefUC4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC4334 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleRefUC4347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefUC4367 = new BitSet(new long[]{0x0000000000080002L});

}