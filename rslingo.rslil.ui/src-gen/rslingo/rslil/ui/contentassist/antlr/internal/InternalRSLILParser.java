package rslingo.rslil.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import rslingo.rslil.services.RSLILGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRSLILParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'Id'", "'Name'", "'Description'", "'}'", "'DecomposedBy'", "'PartOf'", "','", "'Glossary'", "'Type'", "'Acronym'", "'POS'", "'Synset'", "'TermRelationType'", "'TermRelation'", "'Stakeholder'", "'Category'", "'DependsOnType'", "'DependsOn'", "'Goal'", "'Priority'", "'ComposedByType'", "'ComposedBy'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalRSLILParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRSLILParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRSLILParser.tokenNames; }
    public String getGrammarFileName() { return "../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g"; }


     
     	private RSLILGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RSLILGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:61:1: ( ruleModel EOF )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:76:1: ( rule__Model__Group__0 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSystem"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:88:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:89:1: ( ruleSystem EOF )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:90:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem121);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:97:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:101:2: ( ( ( rule__System__Group__0 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:102:1: ( ( rule__System__Group__0 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:102:1: ( ( rule__System__Group__0 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:103:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:104:1: ( rule__System__Group__0 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:104:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem154);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleRefSystem"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:116:1: entryRuleRefSystem : ruleRefSystem EOF ;
    public final void entryRuleRefSystem() throws RecognitionException {
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:117:1: ( ruleRefSystem EOF )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:118:1: ruleRefSystem EOF
            {
             before(grammarAccess.getRefSystemRule()); 
            pushFollow(FOLLOW_ruleRefSystem_in_entryRuleRefSystem181);
            ruleRefSystem();

            state._fsp--;

             after(grammarAccess.getRefSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefSystem188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefSystem"


    // $ANTLR start "ruleRefSystem"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:125:1: ruleRefSystem : ( ( rule__RefSystem__Group__0 ) ) ;
    public final void ruleRefSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:129:2: ( ( ( rule__RefSystem__Group__0 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:130:1: ( ( rule__RefSystem__Group__0 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:130:1: ( ( rule__RefSystem__Group__0 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:131:1: ( rule__RefSystem__Group__0 )
            {
             before(grammarAccess.getRefSystemAccess().getGroup()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:132:1: ( rule__RefSystem__Group__0 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:132:2: rule__RefSystem__Group__0
            {
            pushFollow(FOLLOW_rule__RefSystem__Group__0_in_ruleRefSystem214);
            rule__RefSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefSystem"


    // $ANTLR start "entryRuleGlossary"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:144:1: entryRuleGlossary : ruleGlossary EOF ;
    public final void entryRuleGlossary() throws RecognitionException {
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:145:1: ( ruleGlossary EOF )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:146:1: ruleGlossary EOF
            {
             before(grammarAccess.getGlossaryRule()); 
            pushFollow(FOLLOW_ruleGlossary_in_entryRuleGlossary241);
            ruleGlossary();

            state._fsp--;

             after(grammarAccess.getGlossaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossary248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlossary"


    // $ANTLR start "ruleGlossary"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:153:1: ruleGlossary : ( ( rule__Glossary__Group__0 ) ) ;
    public final void ruleGlossary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:157:2: ( ( ( rule__Glossary__Group__0 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:158:1: ( ( rule__Glossary__Group__0 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:158:1: ( ( rule__Glossary__Group__0 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:159:1: ( rule__Glossary__Group__0 )
            {
             before(grammarAccess.getGlossaryAccess().getGroup()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:160:1: ( rule__Glossary__Group__0 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:160:2: rule__Glossary__Group__0
            {
            pushFollow(FOLLOW_rule__Glossary__Group__0_in_ruleGlossary274);
            rule__Glossary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlossary"


    // $ANTLR start "entryRuleStakeholder"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:172:1: entryRuleStakeholder : ruleStakeholder EOF ;
    public final void entryRuleStakeholder() throws RecognitionException {
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:173:1: ( ruleStakeholder EOF )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:174:1: ruleStakeholder EOF
            {
             before(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder301);
            ruleStakeholder();

            state._fsp--;

             after(grammarAccess.getStakeholderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStakeholder"


    // $ANTLR start "ruleStakeholder"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:181:1: ruleStakeholder : ( ( rule__Stakeholder__Group__0 ) ) ;
    public final void ruleStakeholder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:185:2: ( ( ( rule__Stakeholder__Group__0 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:186:1: ( ( rule__Stakeholder__Group__0 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:186:1: ( ( rule__Stakeholder__Group__0 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:187:1: ( rule__Stakeholder__Group__0 )
            {
             before(grammarAccess.getStakeholderAccess().getGroup()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:188:1: ( rule__Stakeholder__Group__0 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:188:2: rule__Stakeholder__Group__0
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder334);
            rule__Stakeholder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStakeholder"


    // $ANTLR start "entryRuleGoal"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:200:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:201:1: ( ruleGoal EOF )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:202:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal361);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:209:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:213:2: ( ( ( rule__Goal__Group__0 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:214:1: ( ( rule__Goal__Group__0 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:214:1: ( ( rule__Goal__Group__0 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:215:1: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:216:1: ( rule__Goal__Group__0 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:216:2: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_rule__Goal__Group__0_in_ruleGoal394);
            rule__Goal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "rule__Model__Group__0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:230:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:234:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:235:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0428);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0431);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:242:1: rule__Model__Group__0__Impl : ( ( rule__Model__SystemsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:246:1: ( ( ( rule__Model__SystemsAssignment_0 )* ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:247:1: ( ( rule__Model__SystemsAssignment_0 )* )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:247:1: ( ( rule__Model__SystemsAssignment_0 )* )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:248:1: ( rule__Model__SystemsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getSystemsAssignment_0()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:249:1: ( rule__Model__SystemsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:249:2: rule__Model__SystemsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__SystemsAssignment_0_in_rule__Model__Group__0__Impl458);
            	    rule__Model__SystemsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSystemsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:259:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:263:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:264:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1489);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1492);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:271:1: rule__Model__Group__1__Impl : ( ( rule__Model__GlossariesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:275:1: ( ( ( rule__Model__GlossariesAssignment_1 )* ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:276:1: ( ( rule__Model__GlossariesAssignment_1 )* )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:276:1: ( ( rule__Model__GlossariesAssignment_1 )* )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:277:1: ( rule__Model__GlossariesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getGlossariesAssignment_1()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:278:1: ( rule__Model__GlossariesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:278:2: rule__Model__GlossariesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__GlossariesAssignment_1_in_rule__Model__Group__1__Impl519);
            	    rule__Model__GlossariesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGlossariesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:288:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:292:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:293:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2550);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2553);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:300:1: rule__Model__Group__2__Impl : ( ( rule__Model__StakeholdersAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:304:1: ( ( ( rule__Model__StakeholdersAssignment_2 )* ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:305:1: ( ( rule__Model__StakeholdersAssignment_2 )* )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:305:1: ( ( rule__Model__StakeholdersAssignment_2 )* )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:306:1: ( rule__Model__StakeholdersAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getStakeholdersAssignment_2()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:307:1: ( rule__Model__StakeholdersAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:307:2: rule__Model__StakeholdersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__StakeholdersAssignment_2_in_rule__Model__Group__2__Impl580);
            	    rule__Model__StakeholdersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStakeholdersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:317:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:321:1: ( rule__Model__Group__3__Impl )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:322:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3611);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:328:1: rule__Model__Group__3__Impl : ( ( rule__Model__GoalsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:332:1: ( ( ( rule__Model__GoalsAssignment_3 )* ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:333:1: ( ( rule__Model__GoalsAssignment_3 )* )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:333:1: ( ( rule__Model__GoalsAssignment_3 )* )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:334:1: ( rule__Model__GoalsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getGoalsAssignment_3()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:335:1: ( rule__Model__GoalsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:335:2: rule__Model__GoalsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__GoalsAssignment_3_in_rule__Model__Group__3__Impl638);
            	    rule__Model__GoalsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGoalsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__System__Group__0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:353:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:357:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:358:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0677);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__0680);
            rule__System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:365:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:369:1: ( ( 'System' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:370:1: ( 'System' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:370:1: ( 'System' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:371:1: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__System__Group__0__Impl708); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:384:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:388:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:389:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1739);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__1742);
            rule__System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:396:1: rule__System__Group__1__Impl : ( ( rule__System__IdAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:400:1: ( ( ( rule__System__IdAssignment_1 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:401:1: ( ( rule__System__IdAssignment_1 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:401:1: ( ( rule__System__IdAssignment_1 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:402:1: ( rule__System__IdAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getIdAssignment_1()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:403:1: ( rule__System__IdAssignment_1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:403:2: rule__System__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__System__IdAssignment_1_in_rule__System__Group__1__Impl769);
            rule__System__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:413:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:417:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:418:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2799);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__2802);
            rule__System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:425:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:429:1: ( ( '{' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:430:1: ( '{' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:430:1: ( '{' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:431:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__System__Group__2__Impl830); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:444:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:448:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:449:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3861);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__3864);
            rule__System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:456:1: rule__System__Group__3__Impl : ( 'Id' ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:460:1: ( ( 'Id' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:461:1: ( 'Id' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:461:1: ( 'Id' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:462:1: 'Id'
            {
             before(grammarAccess.getSystemAccess().getIdKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__System__Group__3__Impl892); 
             after(grammarAccess.getSystemAccess().getIdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:475:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:479:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:480:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4923);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__5_in_rule__System__Group__4926);
            rule__System__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:487:1: rule__System__Group__4__Impl : ( ( rule__System__SystemIdAssignment_4 ) ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:491:1: ( ( ( rule__System__SystemIdAssignment_4 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:492:1: ( ( rule__System__SystemIdAssignment_4 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:492:1: ( ( rule__System__SystemIdAssignment_4 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:493:1: ( rule__System__SystemIdAssignment_4 )
            {
             before(grammarAccess.getSystemAccess().getSystemIdAssignment_4()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:494:1: ( rule__System__SystemIdAssignment_4 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:494:2: rule__System__SystemIdAssignment_4
            {
            pushFollow(FOLLOW_rule__System__SystemIdAssignment_4_in_rule__System__Group__4__Impl953);
            rule__System__SystemIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSystemIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:504:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:508:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:509:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__5983);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__6_in_rule__System__Group__5986);
            rule__System__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:516:1: rule__System__Group__5__Impl : ( 'Name' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:520:1: ( ( 'Name' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:521:1: ( 'Name' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:521:1: ( 'Name' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:522:1: 'Name'
            {
             before(grammarAccess.getSystemAccess().getNameKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__System__Group__5__Impl1014); 
             after(grammarAccess.getSystemAccess().getNameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:535:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:539:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:540:2: rule__System__Group__6__Impl rule__System__Group__7
            {
            pushFollow(FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__61045);
            rule__System__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__7_in_rule__System__Group__61048);
            rule__System__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:547:1: rule__System__Group__6__Impl : ( ( rule__System__NameAssignment_6 ) ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:551:1: ( ( ( rule__System__NameAssignment_6 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:552:1: ( ( rule__System__NameAssignment_6 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:552:1: ( ( rule__System__NameAssignment_6 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:553:1: ( rule__System__NameAssignment_6 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_6()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:554:1: ( rule__System__NameAssignment_6 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:554:2: rule__System__NameAssignment_6
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_6_in_rule__System__Group__6__Impl1075);
            rule__System__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group__7"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:564:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:568:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:569:2: rule__System__Group__7__Impl rule__System__Group__8
            {
            pushFollow(FOLLOW_rule__System__Group__7__Impl_in_rule__System__Group__71105);
            rule__System__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__8_in_rule__System__Group__71108);
            rule__System__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7"


    // $ANTLR start "rule__System__Group__7__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:576:1: rule__System__Group__7__Impl : ( 'Description' ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:580:1: ( ( 'Description' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:581:1: ( 'Description' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:581:1: ( 'Description' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:582:1: 'Description'
            {
             before(grammarAccess.getSystemAccess().getDescriptionKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__System__Group__7__Impl1136); 
             after(grammarAccess.getSystemAccess().getDescriptionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7__Impl"


    // $ANTLR start "rule__System__Group__8"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:595:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:599:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:600:2: rule__System__Group__8__Impl rule__System__Group__9
            {
            pushFollow(FOLLOW_rule__System__Group__8__Impl_in_rule__System__Group__81167);
            rule__System__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__9_in_rule__System__Group__81170);
            rule__System__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8"


    // $ANTLR start "rule__System__Group__8__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:607:1: rule__System__Group__8__Impl : ( ( rule__System__DescriptionAssignment_8 ) ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:611:1: ( ( ( rule__System__DescriptionAssignment_8 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:612:1: ( ( rule__System__DescriptionAssignment_8 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:612:1: ( ( rule__System__DescriptionAssignment_8 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:613:1: ( rule__System__DescriptionAssignment_8 )
            {
             before(grammarAccess.getSystemAccess().getDescriptionAssignment_8()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:614:1: ( rule__System__DescriptionAssignment_8 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:614:2: rule__System__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_rule__System__DescriptionAssignment_8_in_rule__System__Group__8__Impl1197);
            rule__System__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDescriptionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8__Impl"


    // $ANTLR start "rule__System__Group__9"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:624:1: rule__System__Group__9 : rule__System__Group__9__Impl rule__System__Group__10 ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:628:1: ( rule__System__Group__9__Impl rule__System__Group__10 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:629:2: rule__System__Group__9__Impl rule__System__Group__10
            {
            pushFollow(FOLLOW_rule__System__Group__9__Impl_in_rule__System__Group__91227);
            rule__System__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__10_in_rule__System__Group__91230);
            rule__System__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9"


    // $ANTLR start "rule__System__Group__9__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:636:1: rule__System__Group__9__Impl : ( ( rule__System__Group_9__0 )? ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:640:1: ( ( ( rule__System__Group_9__0 )? ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:641:1: ( ( rule__System__Group_9__0 )? )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:641:1: ( ( rule__System__Group_9__0 )? )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:642:1: ( rule__System__Group_9__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_9()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:643:1: ( rule__System__Group_9__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:643:2: rule__System__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__System__Group_9__0_in_rule__System__Group__9__Impl1257);
                    rule__System__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9__Impl"


    // $ANTLR start "rule__System__Group__10"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:653:1: rule__System__Group__10 : rule__System__Group__10__Impl rule__System__Group__11 ;
    public final void rule__System__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:657:1: ( rule__System__Group__10__Impl rule__System__Group__11 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:658:2: rule__System__Group__10__Impl rule__System__Group__11
            {
            pushFollow(FOLLOW_rule__System__Group__10__Impl_in_rule__System__Group__101288);
            rule__System__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__11_in_rule__System__Group__101291);
            rule__System__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10"


    // $ANTLR start "rule__System__Group__10__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:665:1: rule__System__Group__10__Impl : ( ( rule__System__Group_10__0 )? ) ;
    public final void rule__System__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:669:1: ( ( ( rule__System__Group_10__0 )? ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:670:1: ( ( rule__System__Group_10__0 )? )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:670:1: ( ( rule__System__Group_10__0 )? )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:671:1: ( rule__System__Group_10__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_10()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:672:1: ( rule__System__Group_10__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:672:2: rule__System__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__System__Group_10__0_in_rule__System__Group__10__Impl1318);
                    rule__System__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10__Impl"


    // $ANTLR start "rule__System__Group__11"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:682:1: rule__System__Group__11 : rule__System__Group__11__Impl ;
    public final void rule__System__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:686:1: ( rule__System__Group__11__Impl )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:687:2: rule__System__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__11__Impl_in_rule__System__Group__111349);
            rule__System__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__11"


    // $ANTLR start "rule__System__Group__11__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:693:1: rule__System__Group__11__Impl : ( '}' ) ;
    public final void rule__System__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:697:1: ( ( '}' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:698:1: ( '}' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:698:1: ( '}' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:699:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_16_in_rule__System__Group__11__Impl1377); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__11__Impl"


    // $ANTLR start "rule__System__Group_9__0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:736:1: rule__System__Group_9__0 : rule__System__Group_9__0__Impl rule__System__Group_9__1 ;
    public final void rule__System__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:740:1: ( rule__System__Group_9__0__Impl rule__System__Group_9__1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:741:2: rule__System__Group_9__0__Impl rule__System__Group_9__1
            {
            pushFollow(FOLLOW_rule__System__Group_9__0__Impl_in_rule__System__Group_9__01432);
            rule__System__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_9__1_in_rule__System__Group_9__01435);
            rule__System__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__0"


    // $ANTLR start "rule__System__Group_9__0__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:748:1: rule__System__Group_9__0__Impl : ( 'DecomposedBy' ) ;
    public final void rule__System__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:752:1: ( ( 'DecomposedBy' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:753:1: ( 'DecomposedBy' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:753:1: ( 'DecomposedBy' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:754:1: 'DecomposedBy'
            {
             before(grammarAccess.getSystemAccess().getDecomposedByKeyword_9_0()); 
            match(input,17,FOLLOW_17_in_rule__System__Group_9__0__Impl1463); 
             after(grammarAccess.getSystemAccess().getDecomposedByKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__0__Impl"


    // $ANTLR start "rule__System__Group_9__1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:767:1: rule__System__Group_9__1 : rule__System__Group_9__1__Impl ;
    public final void rule__System__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:771:1: ( rule__System__Group_9__1__Impl )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:772:2: rule__System__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_9__1__Impl_in_rule__System__Group_9__11494);
            rule__System__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__1"


    // $ANTLR start "rule__System__Group_9__1__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:778:1: rule__System__Group_9__1__Impl : ( ( rule__System__RefSystemAssignment_9_1 ) ) ;
    public final void rule__System__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:782:1: ( ( ( rule__System__RefSystemAssignment_9_1 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:783:1: ( ( rule__System__RefSystemAssignment_9_1 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:783:1: ( ( rule__System__RefSystemAssignment_9_1 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:784:1: ( rule__System__RefSystemAssignment_9_1 )
            {
             before(grammarAccess.getSystemAccess().getRefSystemAssignment_9_1()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:785:1: ( rule__System__RefSystemAssignment_9_1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:785:2: rule__System__RefSystemAssignment_9_1
            {
            pushFollow(FOLLOW_rule__System__RefSystemAssignment_9_1_in_rule__System__Group_9__1__Impl1521);
            rule__System__RefSystemAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getRefSystemAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__1__Impl"


    // $ANTLR start "rule__System__Group_10__0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:799:1: rule__System__Group_10__0 : rule__System__Group_10__0__Impl rule__System__Group_10__1 ;
    public final void rule__System__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:803:1: ( rule__System__Group_10__0__Impl rule__System__Group_10__1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:804:2: rule__System__Group_10__0__Impl rule__System__Group_10__1
            {
            pushFollow(FOLLOW_rule__System__Group_10__0__Impl_in_rule__System__Group_10__01555);
            rule__System__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_10__1_in_rule__System__Group_10__01558);
            rule__System__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_10__0"


    // $ANTLR start "rule__System__Group_10__0__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:811:1: rule__System__Group_10__0__Impl : ( 'PartOf' ) ;
    public final void rule__System__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:815:1: ( ( 'PartOf' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:816:1: ( 'PartOf' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:816:1: ( 'PartOf' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:817:1: 'PartOf'
            {
             before(grammarAccess.getSystemAccess().getPartOfKeyword_10_0()); 
            match(input,18,FOLLOW_18_in_rule__System__Group_10__0__Impl1586); 
             after(grammarAccess.getSystemAccess().getPartOfKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_10__0__Impl"


    // $ANTLR start "rule__System__Group_10__1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:830:1: rule__System__Group_10__1 : rule__System__Group_10__1__Impl ;
    public final void rule__System__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:834:1: ( rule__System__Group_10__1__Impl )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:835:2: rule__System__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_10__1__Impl_in_rule__System__Group_10__11617);
            rule__System__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_10__1"


    // $ANTLR start "rule__System__Group_10__1__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:841:1: rule__System__Group_10__1__Impl : ( ( rule__System__PartOfAssignment_10_1 ) ) ;
    public final void rule__System__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:845:1: ( ( ( rule__System__PartOfAssignment_10_1 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:846:1: ( ( rule__System__PartOfAssignment_10_1 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:846:1: ( ( rule__System__PartOfAssignment_10_1 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:847:1: ( rule__System__PartOfAssignment_10_1 )
            {
             before(grammarAccess.getSystemAccess().getPartOfAssignment_10_1()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:848:1: ( rule__System__PartOfAssignment_10_1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:848:2: rule__System__PartOfAssignment_10_1
            {
            pushFollow(FOLLOW_rule__System__PartOfAssignment_10_1_in_rule__System__Group_10__1__Impl1644);
            rule__System__PartOfAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getPartOfAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_10__1__Impl"


    // $ANTLR start "rule__RefSystem__Group__0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:862:1: rule__RefSystem__Group__0 : rule__RefSystem__Group__0__Impl rule__RefSystem__Group__1 ;
    public final void rule__RefSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:866:1: ( rule__RefSystem__Group__0__Impl rule__RefSystem__Group__1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:867:2: rule__RefSystem__Group__0__Impl rule__RefSystem__Group__1
            {
            pushFollow(FOLLOW_rule__RefSystem__Group__0__Impl_in_rule__RefSystem__Group__01678);
            rule__RefSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefSystem__Group__1_in_rule__RefSystem__Group__01681);
            rule__RefSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__Group__0"


    // $ANTLR start "rule__RefSystem__Group__0__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:874:1: rule__RefSystem__Group__0__Impl : ( ( rule__RefSystem__RefSystemAssignment_0 ) ) ;
    public final void rule__RefSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:878:1: ( ( ( rule__RefSystem__RefSystemAssignment_0 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:879:1: ( ( rule__RefSystem__RefSystemAssignment_0 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:879:1: ( ( rule__RefSystem__RefSystemAssignment_0 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:880:1: ( rule__RefSystem__RefSystemAssignment_0 )
            {
             before(grammarAccess.getRefSystemAccess().getRefSystemAssignment_0()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:881:1: ( rule__RefSystem__RefSystemAssignment_0 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:881:2: rule__RefSystem__RefSystemAssignment_0
            {
            pushFollow(FOLLOW_rule__RefSystem__RefSystemAssignment_0_in_rule__RefSystem__Group__0__Impl1708);
            rule__RefSystem__RefSystemAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRefSystemAccess().getRefSystemAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__Group__0__Impl"


    // $ANTLR start "rule__RefSystem__Group__1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:891:1: rule__RefSystem__Group__1 : rule__RefSystem__Group__1__Impl ;
    public final void rule__RefSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:895:1: ( rule__RefSystem__Group__1__Impl )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:896:2: rule__RefSystem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RefSystem__Group__1__Impl_in_rule__RefSystem__Group__11738);
            rule__RefSystem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__Group__1"


    // $ANTLR start "rule__RefSystem__Group__1__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:902:1: rule__RefSystem__Group__1__Impl : ( ( rule__RefSystem__Group_1__0 )* ) ;
    public final void rule__RefSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:906:1: ( ( ( rule__RefSystem__Group_1__0 )* ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:907:1: ( ( rule__RefSystem__Group_1__0 )* )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:907:1: ( ( rule__RefSystem__Group_1__0 )* )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:908:1: ( rule__RefSystem__Group_1__0 )*
            {
             before(grammarAccess.getRefSystemAccess().getGroup_1()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:909:1: ( rule__RefSystem__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:909:2: rule__RefSystem__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RefSystem__Group_1__0_in_rule__RefSystem__Group__1__Impl1765);
            	    rule__RefSystem__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRefSystemAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__Group__1__Impl"


    // $ANTLR start "rule__RefSystem__Group_1__0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:923:1: rule__RefSystem__Group_1__0 : rule__RefSystem__Group_1__0__Impl rule__RefSystem__Group_1__1 ;
    public final void rule__RefSystem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:927:1: ( rule__RefSystem__Group_1__0__Impl rule__RefSystem__Group_1__1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:928:2: rule__RefSystem__Group_1__0__Impl rule__RefSystem__Group_1__1
            {
            pushFollow(FOLLOW_rule__RefSystem__Group_1__0__Impl_in_rule__RefSystem__Group_1__01800);
            rule__RefSystem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefSystem__Group_1__1_in_rule__RefSystem__Group_1__01803);
            rule__RefSystem__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__Group_1__0"


    // $ANTLR start "rule__RefSystem__Group_1__0__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:935:1: rule__RefSystem__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RefSystem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:939:1: ( ( ',' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:940:1: ( ',' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:940:1: ( ',' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:941:1: ','
            {
             before(grammarAccess.getRefSystemAccess().getCommaKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__RefSystem__Group_1__0__Impl1831); 
             after(grammarAccess.getRefSystemAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__Group_1__0__Impl"


    // $ANTLR start "rule__RefSystem__Group_1__1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:954:1: rule__RefSystem__Group_1__1 : rule__RefSystem__Group_1__1__Impl ;
    public final void rule__RefSystem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:958:1: ( rule__RefSystem__Group_1__1__Impl )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:959:2: rule__RefSystem__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RefSystem__Group_1__1__Impl_in_rule__RefSystem__Group_1__11862);
            rule__RefSystem__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__Group_1__1"


    // $ANTLR start "rule__RefSystem__Group_1__1__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:965:1: rule__RefSystem__Group_1__1__Impl : ( ( rule__RefSystem__RefsAssignment_1_1 ) ) ;
    public final void rule__RefSystem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:969:1: ( ( ( rule__RefSystem__RefsAssignment_1_1 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:970:1: ( ( rule__RefSystem__RefsAssignment_1_1 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:970:1: ( ( rule__RefSystem__RefsAssignment_1_1 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:971:1: ( rule__RefSystem__RefsAssignment_1_1 )
            {
             before(grammarAccess.getRefSystemAccess().getRefsAssignment_1_1()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:972:1: ( rule__RefSystem__RefsAssignment_1_1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:972:2: rule__RefSystem__RefsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RefSystem__RefsAssignment_1_1_in_rule__RefSystem__Group_1__1__Impl1889);
            rule__RefSystem__RefsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRefSystemAccess().getRefsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__Group_1__1__Impl"


    // $ANTLR start "rule__Glossary__Group__0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:986:1: rule__Glossary__Group__0 : rule__Glossary__Group__0__Impl rule__Glossary__Group__1 ;
    public final void rule__Glossary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:990:1: ( rule__Glossary__Group__0__Impl rule__Glossary__Group__1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:991:2: rule__Glossary__Group__0__Impl rule__Glossary__Group__1
            {
            pushFollow(FOLLOW_rule__Glossary__Group__0__Impl_in_rule__Glossary__Group__01923);
            rule__Glossary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__1_in_rule__Glossary__Group__01926);
            rule__Glossary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__0"


    // $ANTLR start "rule__Glossary__Group__0__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:998:1: rule__Glossary__Group__0__Impl : ( 'Glossary' ) ;
    public final void rule__Glossary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1002:1: ( ( 'Glossary' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1003:1: ( 'Glossary' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1003:1: ( 'Glossary' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1004:1: 'Glossary'
            {
             before(grammarAccess.getGlossaryAccess().getGlossaryKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Glossary__Group__0__Impl1954); 
             after(grammarAccess.getGlossaryAccess().getGlossaryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__0__Impl"


    // $ANTLR start "rule__Glossary__Group__1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1017:1: rule__Glossary__Group__1 : rule__Glossary__Group__1__Impl rule__Glossary__Group__2 ;
    public final void rule__Glossary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1021:1: ( rule__Glossary__Group__1__Impl rule__Glossary__Group__2 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1022:2: rule__Glossary__Group__1__Impl rule__Glossary__Group__2
            {
            pushFollow(FOLLOW_rule__Glossary__Group__1__Impl_in_rule__Glossary__Group__11985);
            rule__Glossary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__2_in_rule__Glossary__Group__11988);
            rule__Glossary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__1"


    // $ANTLR start "rule__Glossary__Group__1__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1029:1: rule__Glossary__Group__1__Impl : ( ( rule__Glossary__IdAssignment_1 ) ) ;
    public final void rule__Glossary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1033:1: ( ( ( rule__Glossary__IdAssignment_1 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1034:1: ( ( rule__Glossary__IdAssignment_1 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1034:1: ( ( rule__Glossary__IdAssignment_1 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1035:1: ( rule__Glossary__IdAssignment_1 )
            {
             before(grammarAccess.getGlossaryAccess().getIdAssignment_1()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1036:1: ( rule__Glossary__IdAssignment_1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1036:2: rule__Glossary__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Glossary__IdAssignment_1_in_rule__Glossary__Group__1__Impl2015);
            rule__Glossary__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__1__Impl"


    // $ANTLR start "rule__Glossary__Group__2"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1046:1: rule__Glossary__Group__2 : rule__Glossary__Group__2__Impl rule__Glossary__Group__3 ;
    public final void rule__Glossary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1050:1: ( rule__Glossary__Group__2__Impl rule__Glossary__Group__3 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1051:2: rule__Glossary__Group__2__Impl rule__Glossary__Group__3
            {
            pushFollow(FOLLOW_rule__Glossary__Group__2__Impl_in_rule__Glossary__Group__22045);
            rule__Glossary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__3_in_rule__Glossary__Group__22048);
            rule__Glossary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__2"


    // $ANTLR start "rule__Glossary__Group__2__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1058:1: rule__Glossary__Group__2__Impl : ( '{' ) ;
    public final void rule__Glossary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1062:1: ( ( '{' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1063:1: ( '{' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1063:1: ( '{' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1064:1: '{'
            {
             before(grammarAccess.getGlossaryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Glossary__Group__2__Impl2076); 
             after(grammarAccess.getGlossaryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__2__Impl"


    // $ANTLR start "rule__Glossary__Group__3"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1077:1: rule__Glossary__Group__3 : rule__Glossary__Group__3__Impl rule__Glossary__Group__4 ;
    public final void rule__Glossary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1081:1: ( rule__Glossary__Group__3__Impl rule__Glossary__Group__4 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1082:2: rule__Glossary__Group__3__Impl rule__Glossary__Group__4
            {
            pushFollow(FOLLOW_rule__Glossary__Group__3__Impl_in_rule__Glossary__Group__32107);
            rule__Glossary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__4_in_rule__Glossary__Group__32110);
            rule__Glossary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__3"


    // $ANTLR start "rule__Glossary__Group__3__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1089:1: rule__Glossary__Group__3__Impl : ( 'Name' ) ;
    public final void rule__Glossary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1093:1: ( ( 'Name' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1094:1: ( 'Name' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1094:1: ( 'Name' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1095:1: 'Name'
            {
             before(grammarAccess.getGlossaryAccess().getNameKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Glossary__Group__3__Impl2138); 
             after(grammarAccess.getGlossaryAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__3__Impl"


    // $ANTLR start "rule__Glossary__Group__4"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1108:1: rule__Glossary__Group__4 : rule__Glossary__Group__4__Impl rule__Glossary__Group__5 ;
    public final void rule__Glossary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1112:1: ( rule__Glossary__Group__4__Impl rule__Glossary__Group__5 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1113:2: rule__Glossary__Group__4__Impl rule__Glossary__Group__5
            {
            pushFollow(FOLLOW_rule__Glossary__Group__4__Impl_in_rule__Glossary__Group__42169);
            rule__Glossary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__5_in_rule__Glossary__Group__42172);
            rule__Glossary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__4"


    // $ANTLR start "rule__Glossary__Group__4__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1120:1: rule__Glossary__Group__4__Impl : ( ( rule__Glossary__NameAssignment_4 ) ) ;
    public final void rule__Glossary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1124:1: ( ( ( rule__Glossary__NameAssignment_4 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1125:1: ( ( rule__Glossary__NameAssignment_4 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1125:1: ( ( rule__Glossary__NameAssignment_4 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1126:1: ( rule__Glossary__NameAssignment_4 )
            {
             before(grammarAccess.getGlossaryAccess().getNameAssignment_4()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1127:1: ( rule__Glossary__NameAssignment_4 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1127:2: rule__Glossary__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Glossary__NameAssignment_4_in_rule__Glossary__Group__4__Impl2199);
            rule__Glossary__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__4__Impl"


    // $ANTLR start "rule__Glossary__Group__5"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1137:1: rule__Glossary__Group__5 : rule__Glossary__Group__5__Impl rule__Glossary__Group__6 ;
    public final void rule__Glossary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1141:1: ( rule__Glossary__Group__5__Impl rule__Glossary__Group__6 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1142:2: rule__Glossary__Group__5__Impl rule__Glossary__Group__6
            {
            pushFollow(FOLLOW_rule__Glossary__Group__5__Impl_in_rule__Glossary__Group__52229);
            rule__Glossary__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__6_in_rule__Glossary__Group__52232);
            rule__Glossary__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__5"


    // $ANTLR start "rule__Glossary__Group__5__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1149:1: rule__Glossary__Group__5__Impl : ( 'Type' ) ;
    public final void rule__Glossary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1153:1: ( ( 'Type' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1154:1: ( 'Type' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1154:1: ( 'Type' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1155:1: 'Type'
            {
             before(grammarAccess.getGlossaryAccess().getTypeKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Glossary__Group__5__Impl2260); 
             after(grammarAccess.getGlossaryAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__5__Impl"


    // $ANTLR start "rule__Glossary__Group__6"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1168:1: rule__Glossary__Group__6 : rule__Glossary__Group__6__Impl rule__Glossary__Group__7 ;
    public final void rule__Glossary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1172:1: ( rule__Glossary__Group__6__Impl rule__Glossary__Group__7 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1173:2: rule__Glossary__Group__6__Impl rule__Glossary__Group__7
            {
            pushFollow(FOLLOW_rule__Glossary__Group__6__Impl_in_rule__Glossary__Group__62291);
            rule__Glossary__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__7_in_rule__Glossary__Group__62294);
            rule__Glossary__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__6"


    // $ANTLR start "rule__Glossary__Group__6__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1180:1: rule__Glossary__Group__6__Impl : ( ( rule__Glossary__TypeAssignment_6 ) ) ;
    public final void rule__Glossary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1184:1: ( ( ( rule__Glossary__TypeAssignment_6 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1185:1: ( ( rule__Glossary__TypeAssignment_6 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1185:1: ( ( rule__Glossary__TypeAssignment_6 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1186:1: ( rule__Glossary__TypeAssignment_6 )
            {
             before(grammarAccess.getGlossaryAccess().getTypeAssignment_6()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1187:1: ( rule__Glossary__TypeAssignment_6 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1187:2: rule__Glossary__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Glossary__TypeAssignment_6_in_rule__Glossary__Group__6__Impl2321);
            rule__Glossary__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__6__Impl"


    // $ANTLR start "rule__Glossary__Group__7"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1197:1: rule__Glossary__Group__7 : rule__Glossary__Group__7__Impl rule__Glossary__Group__8 ;
    public final void rule__Glossary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1201:1: ( rule__Glossary__Group__7__Impl rule__Glossary__Group__8 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1202:2: rule__Glossary__Group__7__Impl rule__Glossary__Group__8
            {
            pushFollow(FOLLOW_rule__Glossary__Group__7__Impl_in_rule__Glossary__Group__72351);
            rule__Glossary__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__8_in_rule__Glossary__Group__72354);
            rule__Glossary__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__7"


    // $ANTLR start "rule__Glossary__Group__7__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1209:1: rule__Glossary__Group__7__Impl : ( 'Acronym' ) ;
    public final void rule__Glossary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1213:1: ( ( 'Acronym' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1214:1: ( 'Acronym' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1214:1: ( 'Acronym' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1215:1: 'Acronym'
            {
             before(grammarAccess.getGlossaryAccess().getAcronymKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Glossary__Group__7__Impl2382); 
             after(grammarAccess.getGlossaryAccess().getAcronymKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__7__Impl"


    // $ANTLR start "rule__Glossary__Group__8"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1228:1: rule__Glossary__Group__8 : rule__Glossary__Group__8__Impl rule__Glossary__Group__9 ;
    public final void rule__Glossary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1232:1: ( rule__Glossary__Group__8__Impl rule__Glossary__Group__9 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1233:2: rule__Glossary__Group__8__Impl rule__Glossary__Group__9
            {
            pushFollow(FOLLOW_rule__Glossary__Group__8__Impl_in_rule__Glossary__Group__82413);
            rule__Glossary__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__9_in_rule__Glossary__Group__82416);
            rule__Glossary__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__8"


    // $ANTLR start "rule__Glossary__Group__8__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1240:1: rule__Glossary__Group__8__Impl : ( ( rule__Glossary__AcronymAssignment_8 ) ) ;
    public final void rule__Glossary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1244:1: ( ( ( rule__Glossary__AcronymAssignment_8 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1245:1: ( ( rule__Glossary__AcronymAssignment_8 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1245:1: ( ( rule__Glossary__AcronymAssignment_8 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1246:1: ( rule__Glossary__AcronymAssignment_8 )
            {
             before(grammarAccess.getGlossaryAccess().getAcronymAssignment_8()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1247:1: ( rule__Glossary__AcronymAssignment_8 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1247:2: rule__Glossary__AcronymAssignment_8
            {
            pushFollow(FOLLOW_rule__Glossary__AcronymAssignment_8_in_rule__Glossary__Group__8__Impl2443);
            rule__Glossary__AcronymAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getAcronymAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__8__Impl"


    // $ANTLR start "rule__Glossary__Group__9"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1257:1: rule__Glossary__Group__9 : rule__Glossary__Group__9__Impl rule__Glossary__Group__10 ;
    public final void rule__Glossary__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1261:1: ( rule__Glossary__Group__9__Impl rule__Glossary__Group__10 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1262:2: rule__Glossary__Group__9__Impl rule__Glossary__Group__10
            {
            pushFollow(FOLLOW_rule__Glossary__Group__9__Impl_in_rule__Glossary__Group__92473);
            rule__Glossary__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__10_in_rule__Glossary__Group__92476);
            rule__Glossary__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__9"


    // $ANTLR start "rule__Glossary__Group__9__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1269:1: rule__Glossary__Group__9__Impl : ( 'Description' ) ;
    public final void rule__Glossary__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1273:1: ( ( 'Description' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1274:1: ( 'Description' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1274:1: ( 'Description' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1275:1: 'Description'
            {
             before(grammarAccess.getGlossaryAccess().getDescriptionKeyword_9()); 
            match(input,15,FOLLOW_15_in_rule__Glossary__Group__9__Impl2504); 
             after(grammarAccess.getGlossaryAccess().getDescriptionKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__9__Impl"


    // $ANTLR start "rule__Glossary__Group__10"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1288:1: rule__Glossary__Group__10 : rule__Glossary__Group__10__Impl rule__Glossary__Group__11 ;
    public final void rule__Glossary__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1292:1: ( rule__Glossary__Group__10__Impl rule__Glossary__Group__11 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1293:2: rule__Glossary__Group__10__Impl rule__Glossary__Group__11
            {
            pushFollow(FOLLOW_rule__Glossary__Group__10__Impl_in_rule__Glossary__Group__102535);
            rule__Glossary__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__11_in_rule__Glossary__Group__102538);
            rule__Glossary__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__10"


    // $ANTLR start "rule__Glossary__Group__10__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1300:1: rule__Glossary__Group__10__Impl : ( ( rule__Glossary__DescriptionAssignment_10 ) ) ;
    public final void rule__Glossary__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1304:1: ( ( ( rule__Glossary__DescriptionAssignment_10 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1305:1: ( ( rule__Glossary__DescriptionAssignment_10 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1305:1: ( ( rule__Glossary__DescriptionAssignment_10 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1306:1: ( rule__Glossary__DescriptionAssignment_10 )
            {
             before(grammarAccess.getGlossaryAccess().getDescriptionAssignment_10()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1307:1: ( rule__Glossary__DescriptionAssignment_10 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1307:2: rule__Glossary__DescriptionAssignment_10
            {
            pushFollow(FOLLOW_rule__Glossary__DescriptionAssignment_10_in_rule__Glossary__Group__10__Impl2565);
            rule__Glossary__DescriptionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getDescriptionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__10__Impl"


    // $ANTLR start "rule__Glossary__Group__11"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1317:1: rule__Glossary__Group__11 : rule__Glossary__Group__11__Impl rule__Glossary__Group__12 ;
    public final void rule__Glossary__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1321:1: ( rule__Glossary__Group__11__Impl rule__Glossary__Group__12 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1322:2: rule__Glossary__Group__11__Impl rule__Glossary__Group__12
            {
            pushFollow(FOLLOW_rule__Glossary__Group__11__Impl_in_rule__Glossary__Group__112595);
            rule__Glossary__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__12_in_rule__Glossary__Group__112598);
            rule__Glossary__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__11"


    // $ANTLR start "rule__Glossary__Group__11__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1329:1: rule__Glossary__Group__11__Impl : ( 'POS' ) ;
    public final void rule__Glossary__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1333:1: ( ( 'POS' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1334:1: ( 'POS' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1334:1: ( 'POS' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1335:1: 'POS'
            {
             before(grammarAccess.getGlossaryAccess().getPOSKeyword_11()); 
            match(input,23,FOLLOW_23_in_rule__Glossary__Group__11__Impl2626); 
             after(grammarAccess.getGlossaryAccess().getPOSKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__11__Impl"


    // $ANTLR start "rule__Glossary__Group__12"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1348:1: rule__Glossary__Group__12 : rule__Glossary__Group__12__Impl rule__Glossary__Group__13 ;
    public final void rule__Glossary__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1352:1: ( rule__Glossary__Group__12__Impl rule__Glossary__Group__13 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1353:2: rule__Glossary__Group__12__Impl rule__Glossary__Group__13
            {
            pushFollow(FOLLOW_rule__Glossary__Group__12__Impl_in_rule__Glossary__Group__122657);
            rule__Glossary__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__13_in_rule__Glossary__Group__122660);
            rule__Glossary__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__12"


    // $ANTLR start "rule__Glossary__Group__12__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1360:1: rule__Glossary__Group__12__Impl : ( ( rule__Glossary__PosAssignment_12 ) ) ;
    public final void rule__Glossary__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1364:1: ( ( ( rule__Glossary__PosAssignment_12 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1365:1: ( ( rule__Glossary__PosAssignment_12 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1365:1: ( ( rule__Glossary__PosAssignment_12 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1366:1: ( rule__Glossary__PosAssignment_12 )
            {
             before(grammarAccess.getGlossaryAccess().getPosAssignment_12()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1367:1: ( rule__Glossary__PosAssignment_12 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1367:2: rule__Glossary__PosAssignment_12
            {
            pushFollow(FOLLOW_rule__Glossary__PosAssignment_12_in_rule__Glossary__Group__12__Impl2687);
            rule__Glossary__PosAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getPosAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__12__Impl"


    // $ANTLR start "rule__Glossary__Group__13"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1377:1: rule__Glossary__Group__13 : rule__Glossary__Group__13__Impl rule__Glossary__Group__14 ;
    public final void rule__Glossary__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1381:1: ( rule__Glossary__Group__13__Impl rule__Glossary__Group__14 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1382:2: rule__Glossary__Group__13__Impl rule__Glossary__Group__14
            {
            pushFollow(FOLLOW_rule__Glossary__Group__13__Impl_in_rule__Glossary__Group__132717);
            rule__Glossary__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__14_in_rule__Glossary__Group__132720);
            rule__Glossary__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__13"


    // $ANTLR start "rule__Glossary__Group__13__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1389:1: rule__Glossary__Group__13__Impl : ( 'Synset' ) ;
    public final void rule__Glossary__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1393:1: ( ( 'Synset' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1394:1: ( 'Synset' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1394:1: ( 'Synset' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1395:1: 'Synset'
            {
             before(grammarAccess.getGlossaryAccess().getSynsetKeyword_13()); 
            match(input,24,FOLLOW_24_in_rule__Glossary__Group__13__Impl2748); 
             after(grammarAccess.getGlossaryAccess().getSynsetKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__13__Impl"


    // $ANTLR start "rule__Glossary__Group__14"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1408:1: rule__Glossary__Group__14 : rule__Glossary__Group__14__Impl rule__Glossary__Group__15 ;
    public final void rule__Glossary__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1412:1: ( rule__Glossary__Group__14__Impl rule__Glossary__Group__15 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1413:2: rule__Glossary__Group__14__Impl rule__Glossary__Group__15
            {
            pushFollow(FOLLOW_rule__Glossary__Group__14__Impl_in_rule__Glossary__Group__142779);
            rule__Glossary__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__15_in_rule__Glossary__Group__142782);
            rule__Glossary__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__14"


    // $ANTLR start "rule__Glossary__Group__14__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1420:1: rule__Glossary__Group__14__Impl : ( ( rule__Glossary__SynsetAssignment_14 ) ) ;
    public final void rule__Glossary__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1424:1: ( ( ( rule__Glossary__SynsetAssignment_14 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1425:1: ( ( rule__Glossary__SynsetAssignment_14 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1425:1: ( ( rule__Glossary__SynsetAssignment_14 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1426:1: ( rule__Glossary__SynsetAssignment_14 )
            {
             before(grammarAccess.getGlossaryAccess().getSynsetAssignment_14()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1427:1: ( rule__Glossary__SynsetAssignment_14 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1427:2: rule__Glossary__SynsetAssignment_14
            {
            pushFollow(FOLLOW_rule__Glossary__SynsetAssignment_14_in_rule__Glossary__Group__14__Impl2809);
            rule__Glossary__SynsetAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getSynsetAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__14__Impl"


    // $ANTLR start "rule__Glossary__Group__15"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1437:1: rule__Glossary__Group__15 : rule__Glossary__Group__15__Impl rule__Glossary__Group__16 ;
    public final void rule__Glossary__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1441:1: ( rule__Glossary__Group__15__Impl rule__Glossary__Group__16 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1442:2: rule__Glossary__Group__15__Impl rule__Glossary__Group__16
            {
            pushFollow(FOLLOW_rule__Glossary__Group__15__Impl_in_rule__Glossary__Group__152839);
            rule__Glossary__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__16_in_rule__Glossary__Group__152842);
            rule__Glossary__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__15"


    // $ANTLR start "rule__Glossary__Group__15__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1449:1: rule__Glossary__Group__15__Impl : ( 'TermRelationType' ) ;
    public final void rule__Glossary__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1453:1: ( ( 'TermRelationType' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1454:1: ( 'TermRelationType' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1454:1: ( 'TermRelationType' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1455:1: 'TermRelationType'
            {
             before(grammarAccess.getGlossaryAccess().getTermRelationTypeKeyword_15()); 
            match(input,25,FOLLOW_25_in_rule__Glossary__Group__15__Impl2870); 
             after(grammarAccess.getGlossaryAccess().getTermRelationTypeKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__15__Impl"


    // $ANTLR start "rule__Glossary__Group__16"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1468:1: rule__Glossary__Group__16 : rule__Glossary__Group__16__Impl rule__Glossary__Group__17 ;
    public final void rule__Glossary__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1472:1: ( rule__Glossary__Group__16__Impl rule__Glossary__Group__17 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1473:2: rule__Glossary__Group__16__Impl rule__Glossary__Group__17
            {
            pushFollow(FOLLOW_rule__Glossary__Group__16__Impl_in_rule__Glossary__Group__162901);
            rule__Glossary__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__17_in_rule__Glossary__Group__162904);
            rule__Glossary__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__16"


    // $ANTLR start "rule__Glossary__Group__16__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1480:1: rule__Glossary__Group__16__Impl : ( ( rule__Glossary__TermRelationTypeAssignment_16 ) ) ;
    public final void rule__Glossary__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1484:1: ( ( ( rule__Glossary__TermRelationTypeAssignment_16 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1485:1: ( ( rule__Glossary__TermRelationTypeAssignment_16 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1485:1: ( ( rule__Glossary__TermRelationTypeAssignment_16 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1486:1: ( rule__Glossary__TermRelationTypeAssignment_16 )
            {
             before(grammarAccess.getGlossaryAccess().getTermRelationTypeAssignment_16()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1487:1: ( rule__Glossary__TermRelationTypeAssignment_16 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1487:2: rule__Glossary__TermRelationTypeAssignment_16
            {
            pushFollow(FOLLOW_rule__Glossary__TermRelationTypeAssignment_16_in_rule__Glossary__Group__16__Impl2931);
            rule__Glossary__TermRelationTypeAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getTermRelationTypeAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__16__Impl"


    // $ANTLR start "rule__Glossary__Group__17"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1497:1: rule__Glossary__Group__17 : rule__Glossary__Group__17__Impl rule__Glossary__Group__18 ;
    public final void rule__Glossary__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1501:1: ( rule__Glossary__Group__17__Impl rule__Glossary__Group__18 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1502:2: rule__Glossary__Group__17__Impl rule__Glossary__Group__18
            {
            pushFollow(FOLLOW_rule__Glossary__Group__17__Impl_in_rule__Glossary__Group__172961);
            rule__Glossary__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__18_in_rule__Glossary__Group__172964);
            rule__Glossary__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__17"


    // $ANTLR start "rule__Glossary__Group__17__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1509:1: rule__Glossary__Group__17__Impl : ( 'TermRelation' ) ;
    public final void rule__Glossary__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1513:1: ( ( 'TermRelation' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1514:1: ( 'TermRelation' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1514:1: ( 'TermRelation' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1515:1: 'TermRelation'
            {
             before(grammarAccess.getGlossaryAccess().getTermRelationKeyword_17()); 
            match(input,26,FOLLOW_26_in_rule__Glossary__Group__17__Impl2992); 
             after(grammarAccess.getGlossaryAccess().getTermRelationKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__17__Impl"


    // $ANTLR start "rule__Glossary__Group__18"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1528:1: rule__Glossary__Group__18 : rule__Glossary__Group__18__Impl rule__Glossary__Group__19 ;
    public final void rule__Glossary__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1532:1: ( rule__Glossary__Group__18__Impl rule__Glossary__Group__19 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1533:2: rule__Glossary__Group__18__Impl rule__Glossary__Group__19
            {
            pushFollow(FOLLOW_rule__Glossary__Group__18__Impl_in_rule__Glossary__Group__183023);
            rule__Glossary__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Glossary__Group__19_in_rule__Glossary__Group__183026);
            rule__Glossary__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__18"


    // $ANTLR start "rule__Glossary__Group__18__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1540:1: rule__Glossary__Group__18__Impl : ( ( rule__Glossary__TermRelationAssignment_18 ) ) ;
    public final void rule__Glossary__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1544:1: ( ( ( rule__Glossary__TermRelationAssignment_18 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1545:1: ( ( rule__Glossary__TermRelationAssignment_18 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1545:1: ( ( rule__Glossary__TermRelationAssignment_18 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1546:1: ( rule__Glossary__TermRelationAssignment_18 )
            {
             before(grammarAccess.getGlossaryAccess().getTermRelationAssignment_18()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1547:1: ( rule__Glossary__TermRelationAssignment_18 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1547:2: rule__Glossary__TermRelationAssignment_18
            {
            pushFollow(FOLLOW_rule__Glossary__TermRelationAssignment_18_in_rule__Glossary__Group__18__Impl3053);
            rule__Glossary__TermRelationAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getTermRelationAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__18__Impl"


    // $ANTLR start "rule__Glossary__Group__19"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1557:1: rule__Glossary__Group__19 : rule__Glossary__Group__19__Impl ;
    public final void rule__Glossary__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1561:1: ( rule__Glossary__Group__19__Impl )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1562:2: rule__Glossary__Group__19__Impl
            {
            pushFollow(FOLLOW_rule__Glossary__Group__19__Impl_in_rule__Glossary__Group__193083);
            rule__Glossary__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__19"


    // $ANTLR start "rule__Glossary__Group__19__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1568:1: rule__Glossary__Group__19__Impl : ( '}' ) ;
    public final void rule__Glossary__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1572:1: ( ( '}' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1573:1: ( '}' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1573:1: ( '}' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1574:1: '}'
            {
             before(grammarAccess.getGlossaryAccess().getRightCurlyBracketKeyword_19()); 
            match(input,16,FOLLOW_16_in_rule__Glossary__Group__19__Impl3111); 
             after(grammarAccess.getGlossaryAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__19__Impl"


    // $ANTLR start "rule__Stakeholder__Group__0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1627:1: rule__Stakeholder__Group__0 : rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 ;
    public final void rule__Stakeholder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1631:1: ( rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1632:2: rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__03182);
            rule__Stakeholder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__03185);
            rule__Stakeholder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__0"


    // $ANTLR start "rule__Stakeholder__Group__0__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1639:1: rule__Stakeholder__Group__0__Impl : ( 'Stakeholder' ) ;
    public final void rule__Stakeholder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1643:1: ( ( 'Stakeholder' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1644:1: ( 'Stakeholder' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1644:1: ( 'Stakeholder' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1645:1: 'Stakeholder'
            {
             before(grammarAccess.getStakeholderAccess().getStakeholderKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Stakeholder__Group__0__Impl3213); 
             after(grammarAccess.getStakeholderAccess().getStakeholderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__0__Impl"


    // $ANTLR start "rule__Stakeholder__Group__1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1658:1: rule__Stakeholder__Group__1 : rule__Stakeholder__Group__1__Impl rule__Stakeholder__Group__2 ;
    public final void rule__Stakeholder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1662:1: ( rule__Stakeholder__Group__1__Impl rule__Stakeholder__Group__2 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1663:2: rule__Stakeholder__Group__1__Impl rule__Stakeholder__Group__2
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__13244);
            rule__Stakeholder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__2_in_rule__Stakeholder__Group__13247);
            rule__Stakeholder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__1"


    // $ANTLR start "rule__Stakeholder__Group__1__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1670:1: rule__Stakeholder__Group__1__Impl : ( ( rule__Stakeholder__IdAssignment_1 ) ) ;
    public final void rule__Stakeholder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1674:1: ( ( ( rule__Stakeholder__IdAssignment_1 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1675:1: ( ( rule__Stakeholder__IdAssignment_1 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1675:1: ( ( rule__Stakeholder__IdAssignment_1 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1676:1: ( rule__Stakeholder__IdAssignment_1 )
            {
             before(grammarAccess.getStakeholderAccess().getIdAssignment_1()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1677:1: ( rule__Stakeholder__IdAssignment_1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1677:2: rule__Stakeholder__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Stakeholder__IdAssignment_1_in_rule__Stakeholder__Group__1__Impl3274);
            rule__Stakeholder__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__1__Impl"


    // $ANTLR start "rule__Stakeholder__Group__2"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1687:1: rule__Stakeholder__Group__2 : rule__Stakeholder__Group__2__Impl rule__Stakeholder__Group__3 ;
    public final void rule__Stakeholder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1691:1: ( rule__Stakeholder__Group__2__Impl rule__Stakeholder__Group__3 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1692:2: rule__Stakeholder__Group__2__Impl rule__Stakeholder__Group__3
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__2__Impl_in_rule__Stakeholder__Group__23304);
            rule__Stakeholder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__3_in_rule__Stakeholder__Group__23307);
            rule__Stakeholder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__2"


    // $ANTLR start "rule__Stakeholder__Group__2__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1699:1: rule__Stakeholder__Group__2__Impl : ( '{' ) ;
    public final void rule__Stakeholder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1703:1: ( ( '{' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1704:1: ( '{' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1704:1: ( '{' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1705:1: '{'
            {
             before(grammarAccess.getStakeholderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Stakeholder__Group__2__Impl3335); 
             after(grammarAccess.getStakeholderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__2__Impl"


    // $ANTLR start "rule__Stakeholder__Group__3"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1718:1: rule__Stakeholder__Group__3 : rule__Stakeholder__Group__3__Impl rule__Stakeholder__Group__4 ;
    public final void rule__Stakeholder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1722:1: ( rule__Stakeholder__Group__3__Impl rule__Stakeholder__Group__4 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1723:2: rule__Stakeholder__Group__3__Impl rule__Stakeholder__Group__4
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__3__Impl_in_rule__Stakeholder__Group__33366);
            rule__Stakeholder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__4_in_rule__Stakeholder__Group__33369);
            rule__Stakeholder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__3"


    // $ANTLR start "rule__Stakeholder__Group__3__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1730:1: rule__Stakeholder__Group__3__Impl : ( 'Name' ) ;
    public final void rule__Stakeholder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1734:1: ( ( 'Name' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1735:1: ( 'Name' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1735:1: ( 'Name' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1736:1: 'Name'
            {
             before(grammarAccess.getStakeholderAccess().getNameKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Stakeholder__Group__3__Impl3397); 
             after(grammarAccess.getStakeholderAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__3__Impl"


    // $ANTLR start "rule__Stakeholder__Group__4"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1749:1: rule__Stakeholder__Group__4 : rule__Stakeholder__Group__4__Impl rule__Stakeholder__Group__5 ;
    public final void rule__Stakeholder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1753:1: ( rule__Stakeholder__Group__4__Impl rule__Stakeholder__Group__5 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1754:2: rule__Stakeholder__Group__4__Impl rule__Stakeholder__Group__5
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__4__Impl_in_rule__Stakeholder__Group__43428);
            rule__Stakeholder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__5_in_rule__Stakeholder__Group__43431);
            rule__Stakeholder__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__4"


    // $ANTLR start "rule__Stakeholder__Group__4__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1761:1: rule__Stakeholder__Group__4__Impl : ( ( rule__Stakeholder__NameAssignment_4 ) ) ;
    public final void rule__Stakeholder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1765:1: ( ( ( rule__Stakeholder__NameAssignment_4 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1766:1: ( ( rule__Stakeholder__NameAssignment_4 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1766:1: ( ( rule__Stakeholder__NameAssignment_4 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1767:1: ( rule__Stakeholder__NameAssignment_4 )
            {
             before(grammarAccess.getStakeholderAccess().getNameAssignment_4()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1768:1: ( rule__Stakeholder__NameAssignment_4 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1768:2: rule__Stakeholder__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Stakeholder__NameAssignment_4_in_rule__Stakeholder__Group__4__Impl3458);
            rule__Stakeholder__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__4__Impl"


    // $ANTLR start "rule__Stakeholder__Group__5"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1778:1: rule__Stakeholder__Group__5 : rule__Stakeholder__Group__5__Impl rule__Stakeholder__Group__6 ;
    public final void rule__Stakeholder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1782:1: ( rule__Stakeholder__Group__5__Impl rule__Stakeholder__Group__6 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1783:2: rule__Stakeholder__Group__5__Impl rule__Stakeholder__Group__6
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__5__Impl_in_rule__Stakeholder__Group__53488);
            rule__Stakeholder__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__6_in_rule__Stakeholder__Group__53491);
            rule__Stakeholder__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__5"


    // $ANTLR start "rule__Stakeholder__Group__5__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1790:1: rule__Stakeholder__Group__5__Impl : ( 'Type' ) ;
    public final void rule__Stakeholder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1794:1: ( ( 'Type' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1795:1: ( 'Type' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1795:1: ( 'Type' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1796:1: 'Type'
            {
             before(grammarAccess.getStakeholderAccess().getTypeKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Stakeholder__Group__5__Impl3519); 
             after(grammarAccess.getStakeholderAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__5__Impl"


    // $ANTLR start "rule__Stakeholder__Group__6"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1809:1: rule__Stakeholder__Group__6 : rule__Stakeholder__Group__6__Impl rule__Stakeholder__Group__7 ;
    public final void rule__Stakeholder__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1813:1: ( rule__Stakeholder__Group__6__Impl rule__Stakeholder__Group__7 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1814:2: rule__Stakeholder__Group__6__Impl rule__Stakeholder__Group__7
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__6__Impl_in_rule__Stakeholder__Group__63550);
            rule__Stakeholder__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__7_in_rule__Stakeholder__Group__63553);
            rule__Stakeholder__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__6"


    // $ANTLR start "rule__Stakeholder__Group__6__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1821:1: rule__Stakeholder__Group__6__Impl : ( ( rule__Stakeholder__TypeAssignment_6 ) ) ;
    public final void rule__Stakeholder__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1825:1: ( ( ( rule__Stakeholder__TypeAssignment_6 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1826:1: ( ( rule__Stakeholder__TypeAssignment_6 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1826:1: ( ( rule__Stakeholder__TypeAssignment_6 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1827:1: ( rule__Stakeholder__TypeAssignment_6 )
            {
             before(grammarAccess.getStakeholderAccess().getTypeAssignment_6()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1828:1: ( rule__Stakeholder__TypeAssignment_6 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1828:2: rule__Stakeholder__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Stakeholder__TypeAssignment_6_in_rule__Stakeholder__Group__6__Impl3580);
            rule__Stakeholder__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__6__Impl"


    // $ANTLR start "rule__Stakeholder__Group__7"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1838:1: rule__Stakeholder__Group__7 : rule__Stakeholder__Group__7__Impl rule__Stakeholder__Group__8 ;
    public final void rule__Stakeholder__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1842:1: ( rule__Stakeholder__Group__7__Impl rule__Stakeholder__Group__8 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1843:2: rule__Stakeholder__Group__7__Impl rule__Stakeholder__Group__8
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__7__Impl_in_rule__Stakeholder__Group__73610);
            rule__Stakeholder__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__8_in_rule__Stakeholder__Group__73613);
            rule__Stakeholder__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__7"


    // $ANTLR start "rule__Stakeholder__Group__7__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1850:1: rule__Stakeholder__Group__7__Impl : ( 'Category' ) ;
    public final void rule__Stakeholder__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1854:1: ( ( 'Category' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1855:1: ( 'Category' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1855:1: ( 'Category' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1856:1: 'Category'
            {
             before(grammarAccess.getStakeholderAccess().getCategoryKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__Stakeholder__Group__7__Impl3641); 
             after(grammarAccess.getStakeholderAccess().getCategoryKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__7__Impl"


    // $ANTLR start "rule__Stakeholder__Group__8"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1869:1: rule__Stakeholder__Group__8 : rule__Stakeholder__Group__8__Impl rule__Stakeholder__Group__9 ;
    public final void rule__Stakeholder__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1873:1: ( rule__Stakeholder__Group__8__Impl rule__Stakeholder__Group__9 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1874:2: rule__Stakeholder__Group__8__Impl rule__Stakeholder__Group__9
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__8__Impl_in_rule__Stakeholder__Group__83672);
            rule__Stakeholder__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__9_in_rule__Stakeholder__Group__83675);
            rule__Stakeholder__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__8"


    // $ANTLR start "rule__Stakeholder__Group__8__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1881:1: rule__Stakeholder__Group__8__Impl : ( ( rule__Stakeholder__CategoryAssignment_8 ) ) ;
    public final void rule__Stakeholder__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1885:1: ( ( ( rule__Stakeholder__CategoryAssignment_8 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1886:1: ( ( rule__Stakeholder__CategoryAssignment_8 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1886:1: ( ( rule__Stakeholder__CategoryAssignment_8 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1887:1: ( rule__Stakeholder__CategoryAssignment_8 )
            {
             before(grammarAccess.getStakeholderAccess().getCategoryAssignment_8()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1888:1: ( rule__Stakeholder__CategoryAssignment_8 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1888:2: rule__Stakeholder__CategoryAssignment_8
            {
            pushFollow(FOLLOW_rule__Stakeholder__CategoryAssignment_8_in_rule__Stakeholder__Group__8__Impl3702);
            rule__Stakeholder__CategoryAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getCategoryAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__8__Impl"


    // $ANTLR start "rule__Stakeholder__Group__9"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1898:1: rule__Stakeholder__Group__9 : rule__Stakeholder__Group__9__Impl rule__Stakeholder__Group__10 ;
    public final void rule__Stakeholder__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1902:1: ( rule__Stakeholder__Group__9__Impl rule__Stakeholder__Group__10 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1903:2: rule__Stakeholder__Group__9__Impl rule__Stakeholder__Group__10
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__9__Impl_in_rule__Stakeholder__Group__93732);
            rule__Stakeholder__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__10_in_rule__Stakeholder__Group__93735);
            rule__Stakeholder__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__9"


    // $ANTLR start "rule__Stakeholder__Group__9__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1910:1: rule__Stakeholder__Group__9__Impl : ( 'Description' ) ;
    public final void rule__Stakeholder__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1914:1: ( ( 'Description' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1915:1: ( 'Description' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1915:1: ( 'Description' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1916:1: 'Description'
            {
             before(grammarAccess.getStakeholderAccess().getDescriptionKeyword_9()); 
            match(input,15,FOLLOW_15_in_rule__Stakeholder__Group__9__Impl3763); 
             after(grammarAccess.getStakeholderAccess().getDescriptionKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__9__Impl"


    // $ANTLR start "rule__Stakeholder__Group__10"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1929:1: rule__Stakeholder__Group__10 : rule__Stakeholder__Group__10__Impl rule__Stakeholder__Group__11 ;
    public final void rule__Stakeholder__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1933:1: ( rule__Stakeholder__Group__10__Impl rule__Stakeholder__Group__11 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1934:2: rule__Stakeholder__Group__10__Impl rule__Stakeholder__Group__11
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__10__Impl_in_rule__Stakeholder__Group__103794);
            rule__Stakeholder__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__11_in_rule__Stakeholder__Group__103797);
            rule__Stakeholder__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__10"


    // $ANTLR start "rule__Stakeholder__Group__10__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1941:1: rule__Stakeholder__Group__10__Impl : ( ( rule__Stakeholder__DescriptionAssignment_10 ) ) ;
    public final void rule__Stakeholder__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1945:1: ( ( ( rule__Stakeholder__DescriptionAssignment_10 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1946:1: ( ( rule__Stakeholder__DescriptionAssignment_10 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1946:1: ( ( rule__Stakeholder__DescriptionAssignment_10 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1947:1: ( rule__Stakeholder__DescriptionAssignment_10 )
            {
             before(grammarAccess.getStakeholderAccess().getDescriptionAssignment_10()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1948:1: ( rule__Stakeholder__DescriptionAssignment_10 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1948:2: rule__Stakeholder__DescriptionAssignment_10
            {
            pushFollow(FOLLOW_rule__Stakeholder__DescriptionAssignment_10_in_rule__Stakeholder__Group__10__Impl3824);
            rule__Stakeholder__DescriptionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getDescriptionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__10__Impl"


    // $ANTLR start "rule__Stakeholder__Group__11"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1958:1: rule__Stakeholder__Group__11 : rule__Stakeholder__Group__11__Impl rule__Stakeholder__Group__12 ;
    public final void rule__Stakeholder__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1962:1: ( rule__Stakeholder__Group__11__Impl rule__Stakeholder__Group__12 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1963:2: rule__Stakeholder__Group__11__Impl rule__Stakeholder__Group__12
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__11__Impl_in_rule__Stakeholder__Group__113854);
            rule__Stakeholder__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__12_in_rule__Stakeholder__Group__113857);
            rule__Stakeholder__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__11"


    // $ANTLR start "rule__Stakeholder__Group__11__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1970:1: rule__Stakeholder__Group__11__Impl : ( 'DependsOnType' ) ;
    public final void rule__Stakeholder__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1974:1: ( ( 'DependsOnType' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1975:1: ( 'DependsOnType' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1975:1: ( 'DependsOnType' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1976:1: 'DependsOnType'
            {
             before(grammarAccess.getStakeholderAccess().getDependsOnTypeKeyword_11()); 
            match(input,29,FOLLOW_29_in_rule__Stakeholder__Group__11__Impl3885); 
             after(grammarAccess.getStakeholderAccess().getDependsOnTypeKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__11__Impl"


    // $ANTLR start "rule__Stakeholder__Group__12"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1989:1: rule__Stakeholder__Group__12 : rule__Stakeholder__Group__12__Impl rule__Stakeholder__Group__13 ;
    public final void rule__Stakeholder__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1993:1: ( rule__Stakeholder__Group__12__Impl rule__Stakeholder__Group__13 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:1994:2: rule__Stakeholder__Group__12__Impl rule__Stakeholder__Group__13
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__12__Impl_in_rule__Stakeholder__Group__123916);
            rule__Stakeholder__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__13_in_rule__Stakeholder__Group__123919);
            rule__Stakeholder__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__12"


    // $ANTLR start "rule__Stakeholder__Group__12__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2001:1: rule__Stakeholder__Group__12__Impl : ( ( rule__Stakeholder__DependsOnTypeAssignment_12 ) ) ;
    public final void rule__Stakeholder__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2005:1: ( ( ( rule__Stakeholder__DependsOnTypeAssignment_12 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2006:1: ( ( rule__Stakeholder__DependsOnTypeAssignment_12 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2006:1: ( ( rule__Stakeholder__DependsOnTypeAssignment_12 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2007:1: ( rule__Stakeholder__DependsOnTypeAssignment_12 )
            {
             before(grammarAccess.getStakeholderAccess().getDependsOnTypeAssignment_12()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2008:1: ( rule__Stakeholder__DependsOnTypeAssignment_12 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2008:2: rule__Stakeholder__DependsOnTypeAssignment_12
            {
            pushFollow(FOLLOW_rule__Stakeholder__DependsOnTypeAssignment_12_in_rule__Stakeholder__Group__12__Impl3946);
            rule__Stakeholder__DependsOnTypeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getDependsOnTypeAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__12__Impl"


    // $ANTLR start "rule__Stakeholder__Group__13"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2018:1: rule__Stakeholder__Group__13 : rule__Stakeholder__Group__13__Impl rule__Stakeholder__Group__14 ;
    public final void rule__Stakeholder__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2022:1: ( rule__Stakeholder__Group__13__Impl rule__Stakeholder__Group__14 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2023:2: rule__Stakeholder__Group__13__Impl rule__Stakeholder__Group__14
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__13__Impl_in_rule__Stakeholder__Group__133976);
            rule__Stakeholder__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__14_in_rule__Stakeholder__Group__133979);
            rule__Stakeholder__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__13"


    // $ANTLR start "rule__Stakeholder__Group__13__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2030:1: rule__Stakeholder__Group__13__Impl : ( 'DependsOn' ) ;
    public final void rule__Stakeholder__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2034:1: ( ( 'DependsOn' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2035:1: ( 'DependsOn' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2035:1: ( 'DependsOn' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2036:1: 'DependsOn'
            {
             before(grammarAccess.getStakeholderAccess().getDependsOnKeyword_13()); 
            match(input,30,FOLLOW_30_in_rule__Stakeholder__Group__13__Impl4007); 
             after(grammarAccess.getStakeholderAccess().getDependsOnKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__13__Impl"


    // $ANTLR start "rule__Stakeholder__Group__14"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2049:1: rule__Stakeholder__Group__14 : rule__Stakeholder__Group__14__Impl rule__Stakeholder__Group__15 ;
    public final void rule__Stakeholder__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2053:1: ( rule__Stakeholder__Group__14__Impl rule__Stakeholder__Group__15 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2054:2: rule__Stakeholder__Group__14__Impl rule__Stakeholder__Group__15
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__14__Impl_in_rule__Stakeholder__Group__144038);
            rule__Stakeholder__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__15_in_rule__Stakeholder__Group__144041);
            rule__Stakeholder__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__14"


    // $ANTLR start "rule__Stakeholder__Group__14__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2061:1: rule__Stakeholder__Group__14__Impl : ( ( rule__Stakeholder__DependsOnAssignment_14 ) ) ;
    public final void rule__Stakeholder__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2065:1: ( ( ( rule__Stakeholder__DependsOnAssignment_14 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2066:1: ( ( rule__Stakeholder__DependsOnAssignment_14 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2066:1: ( ( rule__Stakeholder__DependsOnAssignment_14 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2067:1: ( rule__Stakeholder__DependsOnAssignment_14 )
            {
             before(grammarAccess.getStakeholderAccess().getDependsOnAssignment_14()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2068:1: ( rule__Stakeholder__DependsOnAssignment_14 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2068:2: rule__Stakeholder__DependsOnAssignment_14
            {
            pushFollow(FOLLOW_rule__Stakeholder__DependsOnAssignment_14_in_rule__Stakeholder__Group__14__Impl4068);
            rule__Stakeholder__DependsOnAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getDependsOnAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__14__Impl"


    // $ANTLR start "rule__Stakeholder__Group__15"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2078:1: rule__Stakeholder__Group__15 : rule__Stakeholder__Group__15__Impl ;
    public final void rule__Stakeholder__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2082:1: ( rule__Stakeholder__Group__15__Impl )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2083:2: rule__Stakeholder__Group__15__Impl
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__15__Impl_in_rule__Stakeholder__Group__154098);
            rule__Stakeholder__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__15"


    // $ANTLR start "rule__Stakeholder__Group__15__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2089:1: rule__Stakeholder__Group__15__Impl : ( '}' ) ;
    public final void rule__Stakeholder__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2093:1: ( ( '}' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2094:1: ( '}' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2094:1: ( '}' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2095:1: '}'
            {
             before(grammarAccess.getStakeholderAccess().getRightCurlyBracketKeyword_15()); 
            match(input,16,FOLLOW_16_in_rule__Stakeholder__Group__15__Impl4126); 
             after(grammarAccess.getStakeholderAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__Group__15__Impl"


    // $ANTLR start "rule__Goal__Group__0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2140:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2144:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2145:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__04189);
            rule__Goal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__04192);
            rule__Goal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__0"


    // $ANTLR start "rule__Goal__Group__0__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2152:1: rule__Goal__Group__0__Impl : ( 'Goal' ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2156:1: ( ( 'Goal' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2157:1: ( 'Goal' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2157:1: ( 'Goal' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2158:1: 'Goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Goal__Group__0__Impl4220); 
             after(grammarAccess.getGoalAccess().getGoalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__0__Impl"


    // $ANTLR start "rule__Goal__Group__1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2171:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2175:1: ( rule__Goal__Group__1__Impl rule__Goal__Group__2 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2176:2: rule__Goal__Group__1__Impl rule__Goal__Group__2
            {
            pushFollow(FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__14251);
            rule__Goal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__14254);
            rule__Goal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__1"


    // $ANTLR start "rule__Goal__Group__1__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2183:1: rule__Goal__Group__1__Impl : ( ( rule__Goal__IdAssignment_1 ) ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2187:1: ( ( ( rule__Goal__IdAssignment_1 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2188:1: ( ( rule__Goal__IdAssignment_1 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2188:1: ( ( rule__Goal__IdAssignment_1 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2189:1: ( rule__Goal__IdAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getIdAssignment_1()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2190:1: ( rule__Goal__IdAssignment_1 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2190:2: rule__Goal__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Goal__IdAssignment_1_in_rule__Goal__Group__1__Impl4281);
            rule__Goal__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__1__Impl"


    // $ANTLR start "rule__Goal__Group__2"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2200:1: rule__Goal__Group__2 : rule__Goal__Group__2__Impl rule__Goal__Group__3 ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2204:1: ( rule__Goal__Group__2__Impl rule__Goal__Group__3 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2205:2: rule__Goal__Group__2__Impl rule__Goal__Group__3
            {
            pushFollow(FOLLOW_rule__Goal__Group__2__Impl_in_rule__Goal__Group__24311);
            rule__Goal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__3_in_rule__Goal__Group__24314);
            rule__Goal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__2"


    // $ANTLR start "rule__Goal__Group__2__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2212:1: rule__Goal__Group__2__Impl : ( '{' ) ;
    public final void rule__Goal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2216:1: ( ( '{' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2217:1: ( '{' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2217:1: ( '{' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2218:1: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Goal__Group__2__Impl4342); 
             after(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__2__Impl"


    // $ANTLR start "rule__Goal__Group__3"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2231:1: rule__Goal__Group__3 : rule__Goal__Group__3__Impl rule__Goal__Group__4 ;
    public final void rule__Goal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2235:1: ( rule__Goal__Group__3__Impl rule__Goal__Group__4 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2236:2: rule__Goal__Group__3__Impl rule__Goal__Group__4
            {
            pushFollow(FOLLOW_rule__Goal__Group__3__Impl_in_rule__Goal__Group__34373);
            rule__Goal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__4_in_rule__Goal__Group__34376);
            rule__Goal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__3"


    // $ANTLR start "rule__Goal__Group__3__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2243:1: rule__Goal__Group__3__Impl : ( 'Description' ) ;
    public final void rule__Goal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2247:1: ( ( 'Description' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2248:1: ( 'Description' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2248:1: ( 'Description' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2249:1: 'Description'
            {
             before(grammarAccess.getGoalAccess().getDescriptionKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Goal__Group__3__Impl4404); 
             after(grammarAccess.getGoalAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__3__Impl"


    // $ANTLR start "rule__Goal__Group__4"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2262:1: rule__Goal__Group__4 : rule__Goal__Group__4__Impl rule__Goal__Group__5 ;
    public final void rule__Goal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2266:1: ( rule__Goal__Group__4__Impl rule__Goal__Group__5 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2267:2: rule__Goal__Group__4__Impl rule__Goal__Group__5
            {
            pushFollow(FOLLOW_rule__Goal__Group__4__Impl_in_rule__Goal__Group__44435);
            rule__Goal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__5_in_rule__Goal__Group__44438);
            rule__Goal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__4"


    // $ANTLR start "rule__Goal__Group__4__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2274:1: rule__Goal__Group__4__Impl : ( ( rule__Goal__DescriptionAssignment_4 ) ) ;
    public final void rule__Goal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2278:1: ( ( ( rule__Goal__DescriptionAssignment_4 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2279:1: ( ( rule__Goal__DescriptionAssignment_4 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2279:1: ( ( rule__Goal__DescriptionAssignment_4 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2280:1: ( rule__Goal__DescriptionAssignment_4 )
            {
             before(grammarAccess.getGoalAccess().getDescriptionAssignment_4()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2281:1: ( rule__Goal__DescriptionAssignment_4 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2281:2: rule__Goal__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__Goal__DescriptionAssignment_4_in_rule__Goal__Group__4__Impl4465);
            rule__Goal__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__4__Impl"


    // $ANTLR start "rule__Goal__Group__5"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2291:1: rule__Goal__Group__5 : rule__Goal__Group__5__Impl rule__Goal__Group__6 ;
    public final void rule__Goal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2295:1: ( rule__Goal__Group__5__Impl rule__Goal__Group__6 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2296:2: rule__Goal__Group__5__Impl rule__Goal__Group__6
            {
            pushFollow(FOLLOW_rule__Goal__Group__5__Impl_in_rule__Goal__Group__54495);
            rule__Goal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__6_in_rule__Goal__Group__54498);
            rule__Goal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__5"


    // $ANTLR start "rule__Goal__Group__5__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2303:1: rule__Goal__Group__5__Impl : ( 'Stakeholder' ) ;
    public final void rule__Goal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2307:1: ( ( 'Stakeholder' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2308:1: ( 'Stakeholder' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2308:1: ( 'Stakeholder' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2309:1: 'Stakeholder'
            {
             before(grammarAccess.getGoalAccess().getStakeholderKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Goal__Group__5__Impl4526); 
             after(grammarAccess.getGoalAccess().getStakeholderKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__5__Impl"


    // $ANTLR start "rule__Goal__Group__6"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2322:1: rule__Goal__Group__6 : rule__Goal__Group__6__Impl rule__Goal__Group__7 ;
    public final void rule__Goal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2326:1: ( rule__Goal__Group__6__Impl rule__Goal__Group__7 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2327:2: rule__Goal__Group__6__Impl rule__Goal__Group__7
            {
            pushFollow(FOLLOW_rule__Goal__Group__6__Impl_in_rule__Goal__Group__64557);
            rule__Goal__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__7_in_rule__Goal__Group__64560);
            rule__Goal__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__6"


    // $ANTLR start "rule__Goal__Group__6__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2334:1: rule__Goal__Group__6__Impl : ( ( rule__Goal__StakeholderAssignment_6 ) ) ;
    public final void rule__Goal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2338:1: ( ( ( rule__Goal__StakeholderAssignment_6 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2339:1: ( ( rule__Goal__StakeholderAssignment_6 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2339:1: ( ( rule__Goal__StakeholderAssignment_6 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2340:1: ( rule__Goal__StakeholderAssignment_6 )
            {
             before(grammarAccess.getGoalAccess().getStakeholderAssignment_6()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2341:1: ( rule__Goal__StakeholderAssignment_6 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2341:2: rule__Goal__StakeholderAssignment_6
            {
            pushFollow(FOLLOW_rule__Goal__StakeholderAssignment_6_in_rule__Goal__Group__6__Impl4587);
            rule__Goal__StakeholderAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getStakeholderAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__6__Impl"


    // $ANTLR start "rule__Goal__Group__7"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2351:1: rule__Goal__Group__7 : rule__Goal__Group__7__Impl rule__Goal__Group__8 ;
    public final void rule__Goal__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2355:1: ( rule__Goal__Group__7__Impl rule__Goal__Group__8 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2356:2: rule__Goal__Group__7__Impl rule__Goal__Group__8
            {
            pushFollow(FOLLOW_rule__Goal__Group__7__Impl_in_rule__Goal__Group__74617);
            rule__Goal__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__8_in_rule__Goal__Group__74620);
            rule__Goal__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__7"


    // $ANTLR start "rule__Goal__Group__7__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2363:1: rule__Goal__Group__7__Impl : ( 'Priority' ) ;
    public final void rule__Goal__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2367:1: ( ( 'Priority' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2368:1: ( 'Priority' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2368:1: ( 'Priority' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2369:1: 'Priority'
            {
             before(grammarAccess.getGoalAccess().getPriorityKeyword_7()); 
            match(input,32,FOLLOW_32_in_rule__Goal__Group__7__Impl4648); 
             after(grammarAccess.getGoalAccess().getPriorityKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__7__Impl"


    // $ANTLR start "rule__Goal__Group__8"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2382:1: rule__Goal__Group__8 : rule__Goal__Group__8__Impl rule__Goal__Group__9 ;
    public final void rule__Goal__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2386:1: ( rule__Goal__Group__8__Impl rule__Goal__Group__9 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2387:2: rule__Goal__Group__8__Impl rule__Goal__Group__9
            {
            pushFollow(FOLLOW_rule__Goal__Group__8__Impl_in_rule__Goal__Group__84679);
            rule__Goal__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__9_in_rule__Goal__Group__84682);
            rule__Goal__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__8"


    // $ANTLR start "rule__Goal__Group__8__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2394:1: rule__Goal__Group__8__Impl : ( ( rule__Goal__PriorityAssignment_8 ) ) ;
    public final void rule__Goal__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2398:1: ( ( ( rule__Goal__PriorityAssignment_8 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2399:1: ( ( rule__Goal__PriorityAssignment_8 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2399:1: ( ( rule__Goal__PriorityAssignment_8 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2400:1: ( rule__Goal__PriorityAssignment_8 )
            {
             before(grammarAccess.getGoalAccess().getPriorityAssignment_8()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2401:1: ( rule__Goal__PriorityAssignment_8 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2401:2: rule__Goal__PriorityAssignment_8
            {
            pushFollow(FOLLOW_rule__Goal__PriorityAssignment_8_in_rule__Goal__Group__8__Impl4709);
            rule__Goal__PriorityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getPriorityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__8__Impl"


    // $ANTLR start "rule__Goal__Group__9"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2411:1: rule__Goal__Group__9 : rule__Goal__Group__9__Impl rule__Goal__Group__10 ;
    public final void rule__Goal__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2415:1: ( rule__Goal__Group__9__Impl rule__Goal__Group__10 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2416:2: rule__Goal__Group__9__Impl rule__Goal__Group__10
            {
            pushFollow(FOLLOW_rule__Goal__Group__9__Impl_in_rule__Goal__Group__94739);
            rule__Goal__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__10_in_rule__Goal__Group__94742);
            rule__Goal__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__9"


    // $ANTLR start "rule__Goal__Group__9__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2423:1: rule__Goal__Group__9__Impl : ( 'DependsOnType' ) ;
    public final void rule__Goal__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2427:1: ( ( 'DependsOnType' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2428:1: ( 'DependsOnType' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2428:1: ( 'DependsOnType' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2429:1: 'DependsOnType'
            {
             before(grammarAccess.getGoalAccess().getDependsOnTypeKeyword_9()); 
            match(input,29,FOLLOW_29_in_rule__Goal__Group__9__Impl4770); 
             after(grammarAccess.getGoalAccess().getDependsOnTypeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__9__Impl"


    // $ANTLR start "rule__Goal__Group__10"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2442:1: rule__Goal__Group__10 : rule__Goal__Group__10__Impl rule__Goal__Group__11 ;
    public final void rule__Goal__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2446:1: ( rule__Goal__Group__10__Impl rule__Goal__Group__11 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2447:2: rule__Goal__Group__10__Impl rule__Goal__Group__11
            {
            pushFollow(FOLLOW_rule__Goal__Group__10__Impl_in_rule__Goal__Group__104801);
            rule__Goal__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__11_in_rule__Goal__Group__104804);
            rule__Goal__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__10"


    // $ANTLR start "rule__Goal__Group__10__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2454:1: rule__Goal__Group__10__Impl : ( ( rule__Goal__DependsOnTypeAssignment_10 ) ) ;
    public final void rule__Goal__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2458:1: ( ( ( rule__Goal__DependsOnTypeAssignment_10 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2459:1: ( ( rule__Goal__DependsOnTypeAssignment_10 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2459:1: ( ( rule__Goal__DependsOnTypeAssignment_10 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2460:1: ( rule__Goal__DependsOnTypeAssignment_10 )
            {
             before(grammarAccess.getGoalAccess().getDependsOnTypeAssignment_10()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2461:1: ( rule__Goal__DependsOnTypeAssignment_10 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2461:2: rule__Goal__DependsOnTypeAssignment_10
            {
            pushFollow(FOLLOW_rule__Goal__DependsOnTypeAssignment_10_in_rule__Goal__Group__10__Impl4831);
            rule__Goal__DependsOnTypeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getDependsOnTypeAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__10__Impl"


    // $ANTLR start "rule__Goal__Group__11"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2471:1: rule__Goal__Group__11 : rule__Goal__Group__11__Impl rule__Goal__Group__12 ;
    public final void rule__Goal__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2475:1: ( rule__Goal__Group__11__Impl rule__Goal__Group__12 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2476:2: rule__Goal__Group__11__Impl rule__Goal__Group__12
            {
            pushFollow(FOLLOW_rule__Goal__Group__11__Impl_in_rule__Goal__Group__114861);
            rule__Goal__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__12_in_rule__Goal__Group__114864);
            rule__Goal__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__11"


    // $ANTLR start "rule__Goal__Group__11__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2483:1: rule__Goal__Group__11__Impl : ( 'DependsOn' ) ;
    public final void rule__Goal__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2487:1: ( ( 'DependsOn' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2488:1: ( 'DependsOn' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2488:1: ( 'DependsOn' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2489:1: 'DependsOn'
            {
             before(grammarAccess.getGoalAccess().getDependsOnKeyword_11()); 
            match(input,30,FOLLOW_30_in_rule__Goal__Group__11__Impl4892); 
             after(grammarAccess.getGoalAccess().getDependsOnKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__11__Impl"


    // $ANTLR start "rule__Goal__Group__12"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2502:1: rule__Goal__Group__12 : rule__Goal__Group__12__Impl rule__Goal__Group__13 ;
    public final void rule__Goal__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2506:1: ( rule__Goal__Group__12__Impl rule__Goal__Group__13 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2507:2: rule__Goal__Group__12__Impl rule__Goal__Group__13
            {
            pushFollow(FOLLOW_rule__Goal__Group__12__Impl_in_rule__Goal__Group__124923);
            rule__Goal__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__13_in_rule__Goal__Group__124926);
            rule__Goal__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__12"


    // $ANTLR start "rule__Goal__Group__12__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2514:1: rule__Goal__Group__12__Impl : ( ( rule__Goal__DependsOnAssignment_12 ) ) ;
    public final void rule__Goal__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2518:1: ( ( ( rule__Goal__DependsOnAssignment_12 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2519:1: ( ( rule__Goal__DependsOnAssignment_12 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2519:1: ( ( rule__Goal__DependsOnAssignment_12 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2520:1: ( rule__Goal__DependsOnAssignment_12 )
            {
             before(grammarAccess.getGoalAccess().getDependsOnAssignment_12()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2521:1: ( rule__Goal__DependsOnAssignment_12 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2521:2: rule__Goal__DependsOnAssignment_12
            {
            pushFollow(FOLLOW_rule__Goal__DependsOnAssignment_12_in_rule__Goal__Group__12__Impl4953);
            rule__Goal__DependsOnAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getDependsOnAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__12__Impl"


    // $ANTLR start "rule__Goal__Group__13"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2531:1: rule__Goal__Group__13 : rule__Goal__Group__13__Impl rule__Goal__Group__14 ;
    public final void rule__Goal__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2535:1: ( rule__Goal__Group__13__Impl rule__Goal__Group__14 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2536:2: rule__Goal__Group__13__Impl rule__Goal__Group__14
            {
            pushFollow(FOLLOW_rule__Goal__Group__13__Impl_in_rule__Goal__Group__134983);
            rule__Goal__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__14_in_rule__Goal__Group__134986);
            rule__Goal__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__13"


    // $ANTLR start "rule__Goal__Group__13__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2543:1: rule__Goal__Group__13__Impl : ( 'ComposedByType' ) ;
    public final void rule__Goal__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2547:1: ( ( 'ComposedByType' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2548:1: ( 'ComposedByType' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2548:1: ( 'ComposedByType' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2549:1: 'ComposedByType'
            {
             before(grammarAccess.getGoalAccess().getComposedByTypeKeyword_13()); 
            match(input,33,FOLLOW_33_in_rule__Goal__Group__13__Impl5014); 
             after(grammarAccess.getGoalAccess().getComposedByTypeKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__13__Impl"


    // $ANTLR start "rule__Goal__Group__14"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2562:1: rule__Goal__Group__14 : rule__Goal__Group__14__Impl rule__Goal__Group__15 ;
    public final void rule__Goal__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2566:1: ( rule__Goal__Group__14__Impl rule__Goal__Group__15 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2567:2: rule__Goal__Group__14__Impl rule__Goal__Group__15
            {
            pushFollow(FOLLOW_rule__Goal__Group__14__Impl_in_rule__Goal__Group__145045);
            rule__Goal__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__15_in_rule__Goal__Group__145048);
            rule__Goal__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__14"


    // $ANTLR start "rule__Goal__Group__14__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2574:1: rule__Goal__Group__14__Impl : ( ( rule__Goal__ComposedByTypeAssignment_14 ) ) ;
    public final void rule__Goal__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2578:1: ( ( ( rule__Goal__ComposedByTypeAssignment_14 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2579:1: ( ( rule__Goal__ComposedByTypeAssignment_14 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2579:1: ( ( rule__Goal__ComposedByTypeAssignment_14 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2580:1: ( rule__Goal__ComposedByTypeAssignment_14 )
            {
             before(grammarAccess.getGoalAccess().getComposedByTypeAssignment_14()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2581:1: ( rule__Goal__ComposedByTypeAssignment_14 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2581:2: rule__Goal__ComposedByTypeAssignment_14
            {
            pushFollow(FOLLOW_rule__Goal__ComposedByTypeAssignment_14_in_rule__Goal__Group__14__Impl5075);
            rule__Goal__ComposedByTypeAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getComposedByTypeAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__14__Impl"


    // $ANTLR start "rule__Goal__Group__15"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2591:1: rule__Goal__Group__15 : rule__Goal__Group__15__Impl rule__Goal__Group__16 ;
    public final void rule__Goal__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2595:1: ( rule__Goal__Group__15__Impl rule__Goal__Group__16 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2596:2: rule__Goal__Group__15__Impl rule__Goal__Group__16
            {
            pushFollow(FOLLOW_rule__Goal__Group__15__Impl_in_rule__Goal__Group__155105);
            rule__Goal__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__16_in_rule__Goal__Group__155108);
            rule__Goal__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__15"


    // $ANTLR start "rule__Goal__Group__15__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2603:1: rule__Goal__Group__15__Impl : ( 'ComposedBy' ) ;
    public final void rule__Goal__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2607:1: ( ( 'ComposedBy' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2608:1: ( 'ComposedBy' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2608:1: ( 'ComposedBy' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2609:1: 'ComposedBy'
            {
             before(grammarAccess.getGoalAccess().getComposedByKeyword_15()); 
            match(input,34,FOLLOW_34_in_rule__Goal__Group__15__Impl5136); 
             after(grammarAccess.getGoalAccess().getComposedByKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__15__Impl"


    // $ANTLR start "rule__Goal__Group__16"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2622:1: rule__Goal__Group__16 : rule__Goal__Group__16__Impl rule__Goal__Group__17 ;
    public final void rule__Goal__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2626:1: ( rule__Goal__Group__16__Impl rule__Goal__Group__17 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2627:2: rule__Goal__Group__16__Impl rule__Goal__Group__17
            {
            pushFollow(FOLLOW_rule__Goal__Group__16__Impl_in_rule__Goal__Group__165167);
            rule__Goal__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__17_in_rule__Goal__Group__165170);
            rule__Goal__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__16"


    // $ANTLR start "rule__Goal__Group__16__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2634:1: rule__Goal__Group__16__Impl : ( ( rule__Goal__ComposedByAssignment_16 ) ) ;
    public final void rule__Goal__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2638:1: ( ( ( rule__Goal__ComposedByAssignment_16 ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2639:1: ( ( rule__Goal__ComposedByAssignment_16 ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2639:1: ( ( rule__Goal__ComposedByAssignment_16 ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2640:1: ( rule__Goal__ComposedByAssignment_16 )
            {
             before(grammarAccess.getGoalAccess().getComposedByAssignment_16()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2641:1: ( rule__Goal__ComposedByAssignment_16 )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2641:2: rule__Goal__ComposedByAssignment_16
            {
            pushFollow(FOLLOW_rule__Goal__ComposedByAssignment_16_in_rule__Goal__Group__16__Impl5197);
            rule__Goal__ComposedByAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getComposedByAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__16__Impl"


    // $ANTLR start "rule__Goal__Group__17"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2651:1: rule__Goal__Group__17 : rule__Goal__Group__17__Impl ;
    public final void rule__Goal__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2655:1: ( rule__Goal__Group__17__Impl )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2656:2: rule__Goal__Group__17__Impl
            {
            pushFollow(FOLLOW_rule__Goal__Group__17__Impl_in_rule__Goal__Group__175227);
            rule__Goal__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__17"


    // $ANTLR start "rule__Goal__Group__17__Impl"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2662:1: rule__Goal__Group__17__Impl : ( '}' ) ;
    public final void rule__Goal__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2666:1: ( ( '}' ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2667:1: ( '}' )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2667:1: ( '}' )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2668:1: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_17()); 
            match(input,16,FOLLOW_16_in_rule__Goal__Group__17__Impl5255); 
             after(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__17__Impl"


    // $ANTLR start "rule__Model__SystemsAssignment_0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2718:1: rule__Model__SystemsAssignment_0 : ( ruleSystem ) ;
    public final void rule__Model__SystemsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2722:1: ( ( ruleSystem ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2723:1: ( ruleSystem )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2723:1: ( ruleSystem )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2724:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__SystemsAssignment_05327);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SystemsAssignment_0"


    // $ANTLR start "rule__Model__GlossariesAssignment_1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2733:1: rule__Model__GlossariesAssignment_1 : ( ruleGlossary ) ;
    public final void rule__Model__GlossariesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2737:1: ( ( ruleGlossary ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2738:1: ( ruleGlossary )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2738:1: ( ruleGlossary )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2739:1: ruleGlossary
            {
             before(grammarAccess.getModelAccess().getGlossariesGlossaryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGlossary_in_rule__Model__GlossariesAssignment_15358);
            ruleGlossary();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGlossariesGlossaryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GlossariesAssignment_1"


    // $ANTLR start "rule__Model__StakeholdersAssignment_2"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2748:1: rule__Model__StakeholdersAssignment_2 : ( ruleStakeholder ) ;
    public final void rule__Model__StakeholdersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2752:1: ( ( ruleStakeholder ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2753:1: ( ruleStakeholder )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2753:1: ( ruleStakeholder )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2754:1: ruleStakeholder
            {
             before(grammarAccess.getModelAccess().getStakeholdersStakeholderParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStakeholder_in_rule__Model__StakeholdersAssignment_25389);
            ruleStakeholder();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStakeholdersStakeholderParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StakeholdersAssignment_2"


    // $ANTLR start "rule__Model__GoalsAssignment_3"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2763:1: rule__Model__GoalsAssignment_3 : ( ruleGoal ) ;
    public final void rule__Model__GoalsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2767:1: ( ( ruleGoal ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2768:1: ( ruleGoal )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2768:1: ( ruleGoal )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2769:1: ruleGoal
            {
             before(grammarAccess.getModelAccess().getGoalsGoalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGoal_in_rule__Model__GoalsAssignment_35420);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGoalsGoalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GoalsAssignment_3"


    // $ANTLR start "rule__System__IdAssignment_1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2778:1: rule__System__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2782:1: ( ( RULE_ID ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2783:1: ( RULE_ID )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2783:1: ( RULE_ID )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2784:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__IdAssignment_15451); 
             after(grammarAccess.getSystemAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__IdAssignment_1"


    // $ANTLR start "rule__System__SystemIdAssignment_4"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2793:1: rule__System__SystemIdAssignment_4 : ( RULE_STRING ) ;
    public final void rule__System__SystemIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2797:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2798:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2798:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2799:1: RULE_STRING
            {
             before(grammarAccess.getSystemAccess().getSystemIdSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__System__SystemIdAssignment_45482); 
             after(grammarAccess.getSystemAccess().getSystemIdSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SystemIdAssignment_4"


    // $ANTLR start "rule__System__NameAssignment_6"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2808:1: rule__System__NameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__System__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2812:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2813:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2813:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2814:1: RULE_STRING
            {
             before(grammarAccess.getSystemAccess().getNameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__System__NameAssignment_65513); 
             after(grammarAccess.getSystemAccess().getNameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_6"


    // $ANTLR start "rule__System__DescriptionAssignment_8"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2823:1: rule__System__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__System__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2827:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2828:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2828:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2829:1: RULE_STRING
            {
             before(grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__System__DescriptionAssignment_85544); 
             after(grammarAccess.getSystemAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__DescriptionAssignment_8"


    // $ANTLR start "rule__System__RefSystemAssignment_9_1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2838:1: rule__System__RefSystemAssignment_9_1 : ( ruleRefSystem ) ;
    public final void rule__System__RefSystemAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2842:1: ( ( ruleRefSystem ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2843:1: ( ruleRefSystem )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2843:1: ( ruleRefSystem )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2844:1: ruleRefSystem
            {
             before(grammarAccess.getSystemAccess().getRefSystemRefSystemParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleRefSystem_in_rule__System__RefSystemAssignment_9_15575);
            ruleRefSystem();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRefSystemRefSystemParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__RefSystemAssignment_9_1"


    // $ANTLR start "rule__System__PartOfAssignment_10_1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2853:1: rule__System__PartOfAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__System__PartOfAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2857:1: ( ( ( RULE_ID ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2858:1: ( ( RULE_ID ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2858:1: ( ( RULE_ID ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2859:1: ( RULE_ID )
            {
             before(grammarAccess.getSystemAccess().getPartOfSystemCrossReference_10_1_0()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2860:1: ( RULE_ID )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2861:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getPartOfSystemIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__PartOfAssignment_10_15610); 
             after(grammarAccess.getSystemAccess().getPartOfSystemIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getPartOfSystemCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__PartOfAssignment_10_1"


    // $ANTLR start "rule__RefSystem__RefSystemAssignment_0"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2872:1: rule__RefSystem__RefSystemAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RefSystem__RefSystemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2876:1: ( ( ( RULE_ID ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2877:1: ( ( RULE_ID ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2877:1: ( ( RULE_ID ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2878:1: ( RULE_ID )
            {
             before(grammarAccess.getRefSystemAccess().getRefSystemSystemCrossReference_0_0()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2879:1: ( RULE_ID )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2880:1: RULE_ID
            {
             before(grammarAccess.getRefSystemAccess().getRefSystemSystemIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RefSystem__RefSystemAssignment_05649); 
             after(grammarAccess.getRefSystemAccess().getRefSystemSystemIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRefSystemAccess().getRefSystemSystemCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__RefSystemAssignment_0"


    // $ANTLR start "rule__RefSystem__RefsAssignment_1_1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2891:1: rule__RefSystem__RefsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__RefSystem__RefsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2895:1: ( ( ( RULE_ID ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2896:1: ( ( RULE_ID ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2896:1: ( ( RULE_ID ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2897:1: ( RULE_ID )
            {
             before(grammarAccess.getRefSystemAccess().getRefsSystemCrossReference_1_1_0()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2898:1: ( RULE_ID )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2899:1: RULE_ID
            {
             before(grammarAccess.getRefSystemAccess().getRefsSystemIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RefSystem__RefsAssignment_1_15688); 
             after(grammarAccess.getRefSystemAccess().getRefsSystemIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getRefSystemAccess().getRefsSystemCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSystem__RefsAssignment_1_1"


    // $ANTLR start "rule__Glossary__IdAssignment_1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2910:1: rule__Glossary__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Glossary__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2914:1: ( ( RULE_ID ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2915:1: ( RULE_ID )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2915:1: ( RULE_ID )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2916:1: RULE_ID
            {
             before(grammarAccess.getGlossaryAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Glossary__IdAssignment_15723); 
             after(grammarAccess.getGlossaryAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__IdAssignment_1"


    // $ANTLR start "rule__Glossary__NameAssignment_4"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2925:1: rule__Glossary__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Glossary__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2929:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2930:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2930:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2931:1: RULE_STRING
            {
             before(grammarAccess.getGlossaryAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Glossary__NameAssignment_45754); 
             after(grammarAccess.getGlossaryAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__NameAssignment_4"


    // $ANTLR start "rule__Glossary__TypeAssignment_6"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2940:1: rule__Glossary__TypeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Glossary__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2944:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2945:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2945:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2946:1: RULE_STRING
            {
             before(grammarAccess.getGlossaryAccess().getTypeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Glossary__TypeAssignment_65785); 
             after(grammarAccess.getGlossaryAccess().getTypeSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__TypeAssignment_6"


    // $ANTLR start "rule__Glossary__AcronymAssignment_8"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2955:1: rule__Glossary__AcronymAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Glossary__AcronymAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2959:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2960:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2960:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2961:1: RULE_STRING
            {
             before(grammarAccess.getGlossaryAccess().getAcronymSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Glossary__AcronymAssignment_85816); 
             after(grammarAccess.getGlossaryAccess().getAcronymSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__AcronymAssignment_8"


    // $ANTLR start "rule__Glossary__DescriptionAssignment_10"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2970:1: rule__Glossary__DescriptionAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Glossary__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2974:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2975:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2975:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2976:1: RULE_STRING
            {
             before(grammarAccess.getGlossaryAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Glossary__DescriptionAssignment_105847); 
             after(grammarAccess.getGlossaryAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__DescriptionAssignment_10"


    // $ANTLR start "rule__Glossary__PosAssignment_12"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2985:1: rule__Glossary__PosAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Glossary__PosAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2989:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2990:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2990:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:2991:1: RULE_STRING
            {
             before(grammarAccess.getGlossaryAccess().getPosSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Glossary__PosAssignment_125878); 
             after(grammarAccess.getGlossaryAccess().getPosSTRINGTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__PosAssignment_12"


    // $ANTLR start "rule__Glossary__SynsetAssignment_14"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3000:1: rule__Glossary__SynsetAssignment_14 : ( RULE_STRING ) ;
    public final void rule__Glossary__SynsetAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3004:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3005:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3005:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3006:1: RULE_STRING
            {
             before(grammarAccess.getGlossaryAccess().getSynsetSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Glossary__SynsetAssignment_145909); 
             after(grammarAccess.getGlossaryAccess().getSynsetSTRINGTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__SynsetAssignment_14"


    // $ANTLR start "rule__Glossary__TermRelationTypeAssignment_16"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3015:1: rule__Glossary__TermRelationTypeAssignment_16 : ( RULE_STRING ) ;
    public final void rule__Glossary__TermRelationTypeAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3019:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3020:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3020:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3021:1: RULE_STRING
            {
             before(grammarAccess.getGlossaryAccess().getTermRelationTypeSTRINGTerminalRuleCall_16_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Glossary__TermRelationTypeAssignment_165940); 
             after(grammarAccess.getGlossaryAccess().getTermRelationTypeSTRINGTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__TermRelationTypeAssignment_16"


    // $ANTLR start "rule__Glossary__TermRelationAssignment_18"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3030:1: rule__Glossary__TermRelationAssignment_18 : ( RULE_STRING ) ;
    public final void rule__Glossary__TermRelationAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3034:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3035:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3035:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3036:1: RULE_STRING
            {
             before(grammarAccess.getGlossaryAccess().getTermRelationSTRINGTerminalRuleCall_18_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Glossary__TermRelationAssignment_185971); 
             after(grammarAccess.getGlossaryAccess().getTermRelationSTRINGTerminalRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__TermRelationAssignment_18"


    // $ANTLR start "rule__Stakeholder__IdAssignment_1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3045:1: rule__Stakeholder__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Stakeholder__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3049:1: ( ( RULE_ID ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3050:1: ( RULE_ID )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3050:1: ( RULE_ID )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3051:1: RULE_ID
            {
             before(grammarAccess.getStakeholderAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Stakeholder__IdAssignment_16002); 
             after(grammarAccess.getStakeholderAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__IdAssignment_1"


    // $ANTLR start "rule__Stakeholder__NameAssignment_4"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3060:1: rule__Stakeholder__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Stakeholder__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3064:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3065:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3065:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3066:1: RULE_STRING
            {
             before(grammarAccess.getStakeholderAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Stakeholder__NameAssignment_46033); 
             after(grammarAccess.getStakeholderAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__NameAssignment_4"


    // $ANTLR start "rule__Stakeholder__TypeAssignment_6"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3075:1: rule__Stakeholder__TypeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Stakeholder__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3079:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3080:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3080:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3081:1: RULE_STRING
            {
             before(grammarAccess.getStakeholderAccess().getTypeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Stakeholder__TypeAssignment_66064); 
             after(grammarAccess.getStakeholderAccess().getTypeSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__TypeAssignment_6"


    // $ANTLR start "rule__Stakeholder__CategoryAssignment_8"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3090:1: rule__Stakeholder__CategoryAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Stakeholder__CategoryAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3094:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3095:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3095:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3096:1: RULE_STRING
            {
             before(grammarAccess.getStakeholderAccess().getCategorySTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Stakeholder__CategoryAssignment_86095); 
             after(grammarAccess.getStakeholderAccess().getCategorySTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__CategoryAssignment_8"


    // $ANTLR start "rule__Stakeholder__DescriptionAssignment_10"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3105:1: rule__Stakeholder__DescriptionAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Stakeholder__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3109:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3110:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3110:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3111:1: RULE_STRING
            {
             before(grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Stakeholder__DescriptionAssignment_106126); 
             after(grammarAccess.getStakeholderAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__DescriptionAssignment_10"


    // $ANTLR start "rule__Stakeholder__DependsOnTypeAssignment_12"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3120:1: rule__Stakeholder__DependsOnTypeAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Stakeholder__DependsOnTypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3124:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3125:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3125:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3126:1: RULE_STRING
            {
             before(grammarAccess.getStakeholderAccess().getDependsOnTypeSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Stakeholder__DependsOnTypeAssignment_126157); 
             after(grammarAccess.getStakeholderAccess().getDependsOnTypeSTRINGTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__DependsOnTypeAssignment_12"


    // $ANTLR start "rule__Stakeholder__DependsOnAssignment_14"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3135:1: rule__Stakeholder__DependsOnAssignment_14 : ( RULE_STRING ) ;
    public final void rule__Stakeholder__DependsOnAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3139:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3140:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3140:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3141:1: RULE_STRING
            {
             before(grammarAccess.getStakeholderAccess().getDependsOnSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Stakeholder__DependsOnAssignment_146188); 
             after(grammarAccess.getStakeholderAccess().getDependsOnSTRINGTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stakeholder__DependsOnAssignment_14"


    // $ANTLR start "rule__Goal__IdAssignment_1"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3150:1: rule__Goal__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goal__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3154:1: ( ( RULE_ID ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3155:1: ( RULE_ID )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3155:1: ( RULE_ID )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3156:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__IdAssignment_16219); 
             after(grammarAccess.getGoalAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__IdAssignment_1"


    // $ANTLR start "rule__Goal__DescriptionAssignment_4"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3165:1: rule__Goal__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Goal__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3169:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3170:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3170:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3171:1: RULE_STRING
            {
             before(grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Goal__DescriptionAssignment_46250); 
             after(grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__DescriptionAssignment_4"


    // $ANTLR start "rule__Goal__StakeholderAssignment_6"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3180:1: rule__Goal__StakeholderAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Goal__StakeholderAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3184:1: ( ( ( RULE_ID ) ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3185:1: ( ( RULE_ID ) )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3185:1: ( ( RULE_ID ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3186:1: ( RULE_ID )
            {
             before(grammarAccess.getGoalAccess().getStakeholderStakeholderCrossReference_6_0()); 
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3187:1: ( RULE_ID )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3188:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getStakeholderStakeholderIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__StakeholderAssignment_66285); 
             after(grammarAccess.getGoalAccess().getStakeholderStakeholderIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getGoalAccess().getStakeholderStakeholderCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__StakeholderAssignment_6"


    // $ANTLR start "rule__Goal__PriorityAssignment_8"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3199:1: rule__Goal__PriorityAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Goal__PriorityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3203:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3204:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3204:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3205:1: RULE_STRING
            {
             before(grammarAccess.getGoalAccess().getPrioritySTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Goal__PriorityAssignment_86320); 
             after(grammarAccess.getGoalAccess().getPrioritySTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__PriorityAssignment_8"


    // $ANTLR start "rule__Goal__DependsOnTypeAssignment_10"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3214:1: rule__Goal__DependsOnTypeAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Goal__DependsOnTypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3218:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3219:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3219:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3220:1: RULE_STRING
            {
             before(grammarAccess.getGoalAccess().getDependsOnTypeSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Goal__DependsOnTypeAssignment_106351); 
             after(grammarAccess.getGoalAccess().getDependsOnTypeSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__DependsOnTypeAssignment_10"


    // $ANTLR start "rule__Goal__DependsOnAssignment_12"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3229:1: rule__Goal__DependsOnAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Goal__DependsOnAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3233:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3234:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3234:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3235:1: RULE_STRING
            {
             before(grammarAccess.getGoalAccess().getDependsOnSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Goal__DependsOnAssignment_126382); 
             after(grammarAccess.getGoalAccess().getDependsOnSTRINGTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__DependsOnAssignment_12"


    // $ANTLR start "rule__Goal__ComposedByTypeAssignment_14"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3244:1: rule__Goal__ComposedByTypeAssignment_14 : ( RULE_STRING ) ;
    public final void rule__Goal__ComposedByTypeAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3248:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3249:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3249:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3250:1: RULE_STRING
            {
             before(grammarAccess.getGoalAccess().getComposedByTypeSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Goal__ComposedByTypeAssignment_146413); 
             after(grammarAccess.getGoalAccess().getComposedByTypeSTRINGTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__ComposedByTypeAssignment_14"


    // $ANTLR start "rule__Goal__ComposedByAssignment_16"
    // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3259:1: rule__Goal__ComposedByAssignment_16 : ( RULE_STRING ) ;
    public final void rule__Goal__ComposedByAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3263:1: ( ( RULE_STRING ) )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3264:1: ( RULE_STRING )
            {
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3264:1: ( RULE_STRING )
            // ../rslingo.rslil.ui/src-gen/rslingo/rslil/ui/contentassist/antlr/internal/InternalRSLIL.g:3265:1: RULE_STRING
            {
             before(grammarAccess.getGoalAccess().getComposedBySTRINGTerminalRuleCall_16_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Goal__ComposedByAssignment_166444); 
             after(grammarAccess.getGoalAccess().getComposedBySTRINGTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__ComposedByAssignment_16"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefSystem_in_entryRuleRefSystem181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefSystem188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefSystem__Group__0_in_ruleRefSystem214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlossary_in_entryRuleGlossary241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossary248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__0_in_ruleGlossary274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__0_in_ruleGoal394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0428 = new BitSet(new long[]{0x0000000088100000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SystemsAssignment_0_in_rule__Model__Group__0__Impl458 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1489 = new BitSet(new long[]{0x0000000088100000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GlossariesAssignment_1_in_rule__Model__Group__1__Impl519 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2550 = new BitSet(new long[]{0x0000000088100000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StakeholdersAssignment_2_in_rule__Model__Group__2__Impl580 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GoalsAssignment_3_in_rule__Model__Group__3__Impl638 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__System__Group__0__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1739 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__IdAssignment_1_in_rule__System__Group__1__Impl769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2799 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__System__Group__2__Impl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__System__Group__3__Impl892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4923 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__System__Group__5_in_rule__System__Group__4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__SystemIdAssignment_4_in_rule__System__Group__4__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__5983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__System__Group__6_in_rule__System__Group__5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__System__Group__5__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__61045 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__System__Group__7_in_rule__System__Group__61048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_6_in_rule__System__Group__6__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__7__Impl_in_rule__System__Group__71105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__System__Group__8_in_rule__System__Group__71108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__System__Group__7__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__8__Impl_in_rule__System__Group__81167 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__System__Group__9_in_rule__System__Group__81170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__DescriptionAssignment_8_in_rule__System__Group__8__Impl1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__9__Impl_in_rule__System__Group__91227 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__System__Group__10_in_rule__System__Group__91230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_9__0_in_rule__System__Group__9__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__10__Impl_in_rule__System__Group__101288 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__System__Group__11_in_rule__System__Group__101291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_10__0_in_rule__System__Group__10__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__11__Impl_in_rule__System__Group__111349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__System__Group__11__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_9__0__Impl_in_rule__System__Group_9__01432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group_9__1_in_rule__System__Group_9__01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__System__Group_9__0__Impl1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_9__1__Impl_in_rule__System__Group_9__11494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__RefSystemAssignment_9_1_in_rule__System__Group_9__1__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_10__0__Impl_in_rule__System__Group_10__01555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group_10__1_in_rule__System__Group_10__01558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__System__Group_10__0__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_10__1__Impl_in_rule__System__Group_10__11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__PartOfAssignment_10_1_in_rule__System__Group_10__1__Impl1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefSystem__Group__0__Impl_in_rule__RefSystem__Group__01678 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RefSystem__Group__1_in_rule__RefSystem__Group__01681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefSystem__RefSystemAssignment_0_in_rule__RefSystem__Group__0__Impl1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefSystem__Group__1__Impl_in_rule__RefSystem__Group__11738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefSystem__Group_1__0_in_rule__RefSystem__Group__1__Impl1765 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__RefSystem__Group_1__0__Impl_in_rule__RefSystem__Group_1__01800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RefSystem__Group_1__1_in_rule__RefSystem__Group_1__01803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RefSystem__Group_1__0__Impl1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefSystem__Group_1__1__Impl_in_rule__RefSystem__Group_1__11862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefSystem__RefsAssignment_1_1_in_rule__RefSystem__Group_1__1__Impl1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__0__Impl_in_rule__Glossary__Group__01923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Glossary__Group__1_in_rule__Glossary__Group__01926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Glossary__Group__0__Impl1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__1__Impl_in_rule__Glossary__Group__11985 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__2_in_rule__Glossary__Group__11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__IdAssignment_1_in_rule__Glossary__Group__1__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__2__Impl_in_rule__Glossary__Group__22045 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__3_in_rule__Glossary__Group__22048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Glossary__Group__2__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__3__Impl_in_rule__Glossary__Group__32107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Glossary__Group__4_in_rule__Glossary__Group__32110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Glossary__Group__3__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__4__Impl_in_rule__Glossary__Group__42169 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__5_in_rule__Glossary__Group__42172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__NameAssignment_4_in_rule__Glossary__Group__4__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__5__Impl_in_rule__Glossary__Group__52229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Glossary__Group__6_in_rule__Glossary__Group__52232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Glossary__Group__5__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__6__Impl_in_rule__Glossary__Group__62291 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__7_in_rule__Glossary__Group__62294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__TypeAssignment_6_in_rule__Glossary__Group__6__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__7__Impl_in_rule__Glossary__Group__72351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Glossary__Group__8_in_rule__Glossary__Group__72354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Glossary__Group__7__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__8__Impl_in_rule__Glossary__Group__82413 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__9_in_rule__Glossary__Group__82416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__AcronymAssignment_8_in_rule__Glossary__Group__8__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__9__Impl_in_rule__Glossary__Group__92473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Glossary__Group__10_in_rule__Glossary__Group__92476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Glossary__Group__9__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__10__Impl_in_rule__Glossary__Group__102535 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__11_in_rule__Glossary__Group__102538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__DescriptionAssignment_10_in_rule__Glossary__Group__10__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__11__Impl_in_rule__Glossary__Group__112595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Glossary__Group__12_in_rule__Glossary__Group__112598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Glossary__Group__11__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__12__Impl_in_rule__Glossary__Group__122657 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__13_in_rule__Glossary__Group__122660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__PosAssignment_12_in_rule__Glossary__Group__12__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__13__Impl_in_rule__Glossary__Group__132717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Glossary__Group__14_in_rule__Glossary__Group__132720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Glossary__Group__13__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__14__Impl_in_rule__Glossary__Group__142779 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__15_in_rule__Glossary__Group__142782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__SynsetAssignment_14_in_rule__Glossary__Group__14__Impl2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__15__Impl_in_rule__Glossary__Group__152839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Glossary__Group__16_in_rule__Glossary__Group__152842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Glossary__Group__15__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__16__Impl_in_rule__Glossary__Group__162901 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__17_in_rule__Glossary__Group__162904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__TermRelationTypeAssignment_16_in_rule__Glossary__Group__16__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__17__Impl_in_rule__Glossary__Group__172961 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Glossary__Group__18_in_rule__Glossary__Group__172964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Glossary__Group__17__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__18__Impl_in_rule__Glossary__Group__183023 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Glossary__Group__19_in_rule__Glossary__Group__183026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__TermRelationAssignment_18_in_rule__Glossary__Group__18__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Glossary__Group__19__Impl_in_rule__Glossary__Group__193083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Glossary__Group__19__Impl3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__03182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__03185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Stakeholder__Group__0__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__13244 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__2_in_rule__Stakeholder__Group__13247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__IdAssignment_1_in_rule__Stakeholder__Group__1__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__2__Impl_in_rule__Stakeholder__Group__23304 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__3_in_rule__Stakeholder__Group__23307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Stakeholder__Group__2__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__3__Impl_in_rule__Stakeholder__Group__33366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__4_in_rule__Stakeholder__Group__33369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Stakeholder__Group__3__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__4__Impl_in_rule__Stakeholder__Group__43428 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__5_in_rule__Stakeholder__Group__43431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__NameAssignment_4_in_rule__Stakeholder__Group__4__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__5__Impl_in_rule__Stakeholder__Group__53488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__6_in_rule__Stakeholder__Group__53491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Stakeholder__Group__5__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__6__Impl_in_rule__Stakeholder__Group__63550 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__7_in_rule__Stakeholder__Group__63553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__TypeAssignment_6_in_rule__Stakeholder__Group__6__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__7__Impl_in_rule__Stakeholder__Group__73610 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__8_in_rule__Stakeholder__Group__73613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Stakeholder__Group__7__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__8__Impl_in_rule__Stakeholder__Group__83672 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__9_in_rule__Stakeholder__Group__83675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__CategoryAssignment_8_in_rule__Stakeholder__Group__8__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__9__Impl_in_rule__Stakeholder__Group__93732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__10_in_rule__Stakeholder__Group__93735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Stakeholder__Group__9__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__10__Impl_in_rule__Stakeholder__Group__103794 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__11_in_rule__Stakeholder__Group__103797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__DescriptionAssignment_10_in_rule__Stakeholder__Group__10__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__11__Impl_in_rule__Stakeholder__Group__113854 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__12_in_rule__Stakeholder__Group__113857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Stakeholder__Group__11__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__12__Impl_in_rule__Stakeholder__Group__123916 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__13_in_rule__Stakeholder__Group__123919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__DependsOnTypeAssignment_12_in_rule__Stakeholder__Group__12__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__13__Impl_in_rule__Stakeholder__Group__133976 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__14_in_rule__Stakeholder__Group__133979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Stakeholder__Group__13__Impl4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__14__Impl_in_rule__Stakeholder__Group__144038 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__15_in_rule__Stakeholder__Group__144041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__DependsOnAssignment_14_in_rule__Stakeholder__Group__14__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__15__Impl_in_rule__Stakeholder__Group__154098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Stakeholder__Group__15__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__04189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__04192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Goal__Group__0__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__14251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__14254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__IdAssignment_1_in_rule__Goal__Group__1__Impl4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__2__Impl_in_rule__Goal__Group__24311 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Goal__Group__3_in_rule__Goal__Group__24314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Goal__Group__2__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__3__Impl_in_rule__Goal__Group__34373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__4_in_rule__Goal__Group__34376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Goal__Group__3__Impl4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__4__Impl_in_rule__Goal__Group__44435 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Goal__Group__5_in_rule__Goal__Group__44438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__DescriptionAssignment_4_in_rule__Goal__Group__4__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__5__Impl_in_rule__Goal__Group__54495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goal__Group__6_in_rule__Goal__Group__54498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Goal__Group__5__Impl4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__6__Impl_in_rule__Goal__Group__64557 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Goal__Group__7_in_rule__Goal__Group__64560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__StakeholderAssignment_6_in_rule__Goal__Group__6__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__7__Impl_in_rule__Goal__Group__74617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__8_in_rule__Goal__Group__74620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Goal__Group__7__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__8__Impl_in_rule__Goal__Group__84679 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Goal__Group__9_in_rule__Goal__Group__84682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__PriorityAssignment_8_in_rule__Goal__Group__8__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__9__Impl_in_rule__Goal__Group__94739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__10_in_rule__Goal__Group__94742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Goal__Group__9__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__10__Impl_in_rule__Goal__Group__104801 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Goal__Group__11_in_rule__Goal__Group__104804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__DependsOnTypeAssignment_10_in_rule__Goal__Group__10__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__11__Impl_in_rule__Goal__Group__114861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__12_in_rule__Goal__Group__114864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Goal__Group__11__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__12__Impl_in_rule__Goal__Group__124923 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Goal__Group__13_in_rule__Goal__Group__124926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__DependsOnAssignment_12_in_rule__Goal__Group__12__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__13__Impl_in_rule__Goal__Group__134983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__14_in_rule__Goal__Group__134986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Goal__Group__13__Impl5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__14__Impl_in_rule__Goal__Group__145045 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Goal__Group__15_in_rule__Goal__Group__145048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__ComposedByTypeAssignment_14_in_rule__Goal__Group__14__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__15__Impl_in_rule__Goal__Group__155105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__16_in_rule__Goal__Group__155108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Goal__Group__15__Impl5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__16__Impl_in_rule__Goal__Group__165167 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Goal__Group__17_in_rule__Goal__Group__165170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__ComposedByAssignment_16_in_rule__Goal__Group__16__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__17__Impl_in_rule__Goal__Group__175227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Goal__Group__17__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__SystemsAssignment_05327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlossary_in_rule__Model__GlossariesAssignment_15358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_rule__Model__StakeholdersAssignment_25389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__Model__GoalsAssignment_35420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__IdAssignment_15451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__System__SystemIdAssignment_45482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__System__NameAssignment_65513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__System__DescriptionAssignment_85544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefSystem_in_rule__System__RefSystemAssignment_9_15575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__PartOfAssignment_10_15610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RefSystem__RefSystemAssignment_05649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RefSystem__RefsAssignment_1_15688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Glossary__IdAssignment_15723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Glossary__NameAssignment_45754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Glossary__TypeAssignment_65785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Glossary__AcronymAssignment_85816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Glossary__DescriptionAssignment_105847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Glossary__PosAssignment_125878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Glossary__SynsetAssignment_145909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Glossary__TermRelationTypeAssignment_165940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Glossary__TermRelationAssignment_185971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Stakeholder__IdAssignment_16002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Stakeholder__NameAssignment_46033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Stakeholder__TypeAssignment_66064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Stakeholder__CategoryAssignment_86095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Stakeholder__DescriptionAssignment_106126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Stakeholder__DependsOnTypeAssignment_126157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Stakeholder__DependsOnAssignment_146188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__IdAssignment_16219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Goal__DescriptionAssignment_46250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__StakeholderAssignment_66285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Goal__PriorityAssignment_86320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Goal__DependsOnTypeAssignment_106351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Goal__DependsOnAssignment_126382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Goal__ComposedByTypeAssignment_146413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Goal__ComposedByAssignment_166444 = new BitSet(new long[]{0x0000000000000002L});

}