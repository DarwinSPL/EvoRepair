package de.evorepair.evolution.operation.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.evorepair.evolution.operation.services.EvoOperationDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEvoOperationDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DATE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parentOf'", "'siblingOf'", "'childOf'", "'operation'", "'{'", "'variables'", "';'", "'}'", "'date'", "':'", "'feature'", "'reference'", "'('", "')'", "','", "'group'", "'value'", "'='", "'set'", "'mapping'", "'configuration'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DATE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEvoOperationDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEvoOperationDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEvoOperationDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvoOperationDsl.g"; }


    	private EvoOperationDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(EvoOperationDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGrammarEntry"
    // InternalEvoOperationDsl.g:53:1: entryRuleGrammarEntry : ruleGrammarEntry EOF ;
    public final void entryRuleGrammarEntry() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:54:1: ( ruleGrammarEntry EOF )
            // InternalEvoOperationDsl.g:55:1: ruleGrammarEntry EOF
            {
             before(grammarAccess.getGrammarEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleGrammarEntry();

            state._fsp--;

             after(grammarAccess.getGrammarEntryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrammarEntry"


    // $ANTLR start "ruleGrammarEntry"
    // InternalEvoOperationDsl.g:62:1: ruleGrammarEntry : ( ( rule__GrammarEntry__ContainerAssignment ) ) ;
    public final void ruleGrammarEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:66:2: ( ( ( rule__GrammarEntry__ContainerAssignment ) ) )
            // InternalEvoOperationDsl.g:67:2: ( ( rule__GrammarEntry__ContainerAssignment ) )
            {
            // InternalEvoOperationDsl.g:67:2: ( ( rule__GrammarEntry__ContainerAssignment ) )
            // InternalEvoOperationDsl.g:68:3: ( rule__GrammarEntry__ContainerAssignment )
            {
             before(grammarAccess.getGrammarEntryAccess().getContainerAssignment()); 
            // InternalEvoOperationDsl.g:69:3: ( rule__GrammarEntry__ContainerAssignment )
            // InternalEvoOperationDsl.g:69:4: rule__GrammarEntry__ContainerAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GrammarEntry__ContainerAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGrammarEntryAccess().getContainerAssignment()); 

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
    // $ANTLR end "ruleGrammarEntry"


    // $ANTLR start "entryRuleEvoOperationContainer"
    // InternalEvoOperationDsl.g:78:1: entryRuleEvoOperationContainer : ruleEvoOperationContainer EOF ;
    public final void entryRuleEvoOperationContainer() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:79:1: ( ruleEvoOperationContainer EOF )
            // InternalEvoOperationDsl.g:80:1: ruleEvoOperationContainer EOF
            {
             before(grammarAccess.getEvoOperationContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoOperationContainer();

            state._fsp--;

             after(grammarAccess.getEvoOperationContainerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvoOperationContainer"


    // $ANTLR start "ruleEvoOperationContainer"
    // InternalEvoOperationDsl.g:87:1: ruleEvoOperationContainer : ( ( rule__EvoOperationContainer__Group__0 ) ) ;
    public final void ruleEvoOperationContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:91:2: ( ( ( rule__EvoOperationContainer__Group__0 ) ) )
            // InternalEvoOperationDsl.g:92:2: ( ( rule__EvoOperationContainer__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:92:2: ( ( rule__EvoOperationContainer__Group__0 ) )
            // InternalEvoOperationDsl.g:93:3: ( rule__EvoOperationContainer__Group__0 )
            {
             before(grammarAccess.getEvoOperationContainerAccess().getGroup()); 
            // InternalEvoOperationDsl.g:94:3: ( rule__EvoOperationContainer__Group__0 )
            // InternalEvoOperationDsl.g:94:4: rule__EvoOperationContainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperationContainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoOperationContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleEvoOperationContainer"


    // $ANTLR start "entryRuleEvoOperation"
    // InternalEvoOperationDsl.g:103:1: entryRuleEvoOperation : ruleEvoOperation EOF ;
    public final void entryRuleEvoOperation() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:104:1: ( ruleEvoOperation EOF )
            // InternalEvoOperationDsl.g:105:1: ruleEvoOperation EOF
            {
             before(grammarAccess.getEvoOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoOperation();

            state._fsp--;

             after(grammarAccess.getEvoOperationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvoOperation"


    // $ANTLR start "ruleEvoOperation"
    // InternalEvoOperationDsl.g:112:1: ruleEvoOperation : ( ( rule__EvoOperation__Group__0 ) ) ;
    public final void ruleEvoOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:116:2: ( ( ( rule__EvoOperation__Group__0 ) ) )
            // InternalEvoOperationDsl.g:117:2: ( ( rule__EvoOperation__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:117:2: ( ( rule__EvoOperation__Group__0 ) )
            // InternalEvoOperationDsl.g:118:3: ( rule__EvoOperation__Group__0 )
            {
             before(grammarAccess.getEvoOperationAccess().getGroup()); 
            // InternalEvoOperationDsl.g:119:3: ( rule__EvoOperation__Group__0 )
            // InternalEvoOperationDsl.g:119:4: rule__EvoOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleEvoOperation"


    // $ANTLR start "entryRuleEvoVariable"
    // InternalEvoOperationDsl.g:128:1: entryRuleEvoVariable : ruleEvoVariable EOF ;
    public final void entryRuleEvoVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:129:1: ( ruleEvoVariable EOF )
            // InternalEvoOperationDsl.g:130:1: ruleEvoVariable EOF
            {
             before(grammarAccess.getEvoVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getEvoVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvoVariable"


    // $ANTLR start "ruleEvoVariable"
    // InternalEvoOperationDsl.g:137:1: ruleEvoVariable : ( ( rule__EvoVariable__Alternatives ) ) ;
    public final void ruleEvoVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:141:2: ( ( ( rule__EvoVariable__Alternatives ) ) )
            // InternalEvoOperationDsl.g:142:2: ( ( rule__EvoVariable__Alternatives ) )
            {
            // InternalEvoOperationDsl.g:142:2: ( ( rule__EvoVariable__Alternatives ) )
            // InternalEvoOperationDsl.g:143:3: ( rule__EvoVariable__Alternatives )
            {
             before(grammarAccess.getEvoVariableAccess().getAlternatives()); 
            // InternalEvoOperationDsl.g:144:3: ( rule__EvoVariable__Alternatives )
            // InternalEvoOperationDsl.g:144:4: rule__EvoVariable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoVariable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoVariableAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEvoVariable"


    // $ANTLR start "entryRuleEvoFeatureVariable"
    // InternalEvoOperationDsl.g:153:1: entryRuleEvoFeatureVariable : ruleEvoFeatureVariable EOF ;
    public final void entryRuleEvoFeatureVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:154:1: ( ruleEvoFeatureVariable EOF )
            // InternalEvoOperationDsl.g:155:1: ruleEvoFeatureVariable EOF
            {
             before(grammarAccess.getEvoFeatureVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoFeatureVariable();

            state._fsp--;

             after(grammarAccess.getEvoFeatureVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvoFeatureVariable"


    // $ANTLR start "ruleEvoFeatureVariable"
    // InternalEvoOperationDsl.g:162:1: ruleEvoFeatureVariable : ( ( rule__EvoFeatureVariable__Group__0 ) ) ;
    public final void ruleEvoFeatureVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:166:2: ( ( ( rule__EvoFeatureVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:167:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:167:2: ( ( rule__EvoFeatureVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:168:3: ( rule__EvoFeatureVariable__Group__0 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:169:3: ( rule__EvoFeatureVariable__Group__0 )
            // InternalEvoOperationDsl.g:169:4: rule__EvoFeatureVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleEvoFeatureVariable"


    // $ANTLR start "entryRuleEvoFeatureRelation"
    // InternalEvoOperationDsl.g:178:1: entryRuleEvoFeatureRelation : ruleEvoFeatureRelation EOF ;
    public final void entryRuleEvoFeatureRelation() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:179:1: ( ruleEvoFeatureRelation EOF )
            // InternalEvoOperationDsl.g:180:1: ruleEvoFeatureRelation EOF
            {
             before(grammarAccess.getEvoFeatureRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoFeatureRelation();

            state._fsp--;

             after(grammarAccess.getEvoFeatureRelationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvoFeatureRelation"


    // $ANTLR start "ruleEvoFeatureRelation"
    // InternalEvoOperationDsl.g:187:1: ruleEvoFeatureRelation : ( ( rule__EvoFeatureRelation__Group__0 ) ) ;
    public final void ruleEvoFeatureRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:191:2: ( ( ( rule__EvoFeatureRelation__Group__0 ) ) )
            // InternalEvoOperationDsl.g:192:2: ( ( rule__EvoFeatureRelation__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:192:2: ( ( rule__EvoFeatureRelation__Group__0 ) )
            // InternalEvoOperationDsl.g:193:3: ( rule__EvoFeatureRelation__Group__0 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getGroup()); 
            // InternalEvoOperationDsl.g:194:3: ( rule__EvoFeatureRelation__Group__0 )
            // InternalEvoOperationDsl.g:194:4: rule__EvoFeatureRelation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureRelationAccess().getGroup()); 

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
    // $ANTLR end "ruleEvoFeatureRelation"


    // $ANTLR start "entryRuleEvoGroupVariable"
    // InternalEvoOperationDsl.g:203:1: entryRuleEvoGroupVariable : ruleEvoGroupVariable EOF ;
    public final void entryRuleEvoGroupVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:204:1: ( ruleEvoGroupVariable EOF )
            // InternalEvoOperationDsl.g:205:1: ruleEvoGroupVariable EOF
            {
             before(grammarAccess.getEvoGroupVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoGroupVariable();

            state._fsp--;

             after(grammarAccess.getEvoGroupVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvoGroupVariable"


    // $ANTLR start "ruleEvoGroupVariable"
    // InternalEvoOperationDsl.g:212:1: ruleEvoGroupVariable : ( ( rule__EvoGroupVariable__Group__0 ) ) ;
    public final void ruleEvoGroupVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:216:2: ( ( ( rule__EvoGroupVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:217:2: ( ( rule__EvoGroupVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:217:2: ( ( rule__EvoGroupVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:218:3: ( rule__EvoGroupVariable__Group__0 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:219:3: ( rule__EvoGroupVariable__Group__0 )
            // InternalEvoOperationDsl.g:219:4: rule__EvoGroupVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoGroupVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleEvoGroupVariable"


    // $ANTLR start "entryRuleEvoSetVariable"
    // InternalEvoOperationDsl.g:228:1: entryRuleEvoSetVariable : ruleEvoSetVariable EOF ;
    public final void entryRuleEvoSetVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:229:1: ( ruleEvoSetVariable EOF )
            // InternalEvoOperationDsl.g:230:1: ruleEvoSetVariable EOF
            {
             before(grammarAccess.getEvoSetVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoSetVariable();

            state._fsp--;

             after(grammarAccess.getEvoSetVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvoSetVariable"


    // $ANTLR start "ruleEvoSetVariable"
    // InternalEvoOperationDsl.g:237:1: ruleEvoSetVariable : ( ( rule__EvoSetVariable__Group__0 ) ) ;
    public final void ruleEvoSetVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:241:2: ( ( ( rule__EvoSetVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:242:2: ( ( rule__EvoSetVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:242:2: ( ( rule__EvoSetVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:243:3: ( rule__EvoSetVariable__Group__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:244:3: ( rule__EvoSetVariable__Group__0 )
            // InternalEvoOperationDsl.g:244:4: rule__EvoSetVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleEvoSetVariable"


    // $ANTLR start "entryRuleEvoMappingVariable"
    // InternalEvoOperationDsl.g:253:1: entryRuleEvoMappingVariable : ruleEvoMappingVariable EOF ;
    public final void entryRuleEvoMappingVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:254:1: ( ruleEvoMappingVariable EOF )
            // InternalEvoOperationDsl.g:255:1: ruleEvoMappingVariable EOF
            {
             before(grammarAccess.getEvoMappingVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoMappingVariable();

            state._fsp--;

             after(grammarAccess.getEvoMappingVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvoMappingVariable"


    // $ANTLR start "ruleEvoMappingVariable"
    // InternalEvoOperationDsl.g:262:1: ruleEvoMappingVariable : ( ( rule__EvoMappingVariable__Group__0 ) ) ;
    public final void ruleEvoMappingVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:266:2: ( ( ( rule__EvoMappingVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:267:2: ( ( rule__EvoMappingVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:267:2: ( ( rule__EvoMappingVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:268:3: ( rule__EvoMappingVariable__Group__0 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:269:3: ( rule__EvoMappingVariable__Group__0 )
            // InternalEvoOperationDsl.g:269:4: rule__EvoMappingVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoMappingVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleEvoMappingVariable"


    // $ANTLR start "entryRuleEvoConfigurationVariable"
    // InternalEvoOperationDsl.g:278:1: entryRuleEvoConfigurationVariable : ruleEvoConfigurationVariable EOF ;
    public final void entryRuleEvoConfigurationVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:279:1: ( ruleEvoConfigurationVariable EOF )
            // InternalEvoOperationDsl.g:280:1: ruleEvoConfigurationVariable EOF
            {
             before(grammarAccess.getEvoConfigurationVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleEvoConfigurationVariable();

            state._fsp--;

             after(grammarAccess.getEvoConfigurationVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvoConfigurationVariable"


    // $ANTLR start "ruleEvoConfigurationVariable"
    // InternalEvoOperationDsl.g:287:1: ruleEvoConfigurationVariable : ( ( rule__EvoConfigurationVariable__Group__0 ) ) ;
    public final void ruleEvoConfigurationVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:291:2: ( ( ( rule__EvoConfigurationVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:292:2: ( ( rule__EvoConfigurationVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:292:2: ( ( rule__EvoConfigurationVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:293:3: ( rule__EvoConfigurationVariable__Group__0 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:294:3: ( rule__EvoConfigurationVariable__Group__0 )
            // InternalEvoOperationDsl.g:294:4: rule__EvoConfigurationVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoConfigurationVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleEvoConfigurationVariable"


    // $ANTLR start "ruleEvoFeatureVariableType"
    // InternalEvoOperationDsl.g:303:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:307:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoOperationDsl.g:308:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoOperationDsl.g:308:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoOperationDsl.g:309:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoOperationDsl.g:310:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoOperationDsl.g:310:4: rule__EvoFeatureVariableType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariableType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEvoFeatureVariableType"


    // $ANTLR start "rule__EvoVariable__Alternatives"
    // InternalEvoOperationDsl.g:318:1: rule__EvoVariable__Alternatives : ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) );
    public final void rule__EvoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:322:1: ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 31:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEvoOperationDsl.g:323:2: ( ruleEvoConfigurationVariable )
                    {
                    // InternalEvoOperationDsl.g:323:2: ( ruleEvoConfigurationVariable )
                    // InternalEvoOperationDsl.g:324:3: ruleEvoConfigurationVariable
                    {
                     before(grammarAccess.getEvoVariableAccess().getEvoConfigurationVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoConfigurationVariable();

                    state._fsp--;

                     after(grammarAccess.getEvoVariableAccess().getEvoConfigurationVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:329:2: ( ruleEvoFeatureVariable )
                    {
                    // InternalEvoOperationDsl.g:329:2: ( ruleEvoFeatureVariable )
                    // InternalEvoOperationDsl.g:330:3: ruleEvoFeatureVariable
                    {
                     before(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoFeatureVariable();

                    state._fsp--;

                     after(grammarAccess.getEvoVariableAccess().getEvoFeatureVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:335:2: ( ruleEvoGroupVariable )
                    {
                    // InternalEvoOperationDsl.g:335:2: ( ruleEvoGroupVariable )
                    // InternalEvoOperationDsl.g:336:3: ruleEvoGroupVariable
                    {
                     before(grammarAccess.getEvoVariableAccess().getEvoGroupVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoGroupVariable();

                    state._fsp--;

                     after(grammarAccess.getEvoVariableAccess().getEvoGroupVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEvoOperationDsl.g:341:2: ( ruleEvoSetVariable )
                    {
                    // InternalEvoOperationDsl.g:341:2: ( ruleEvoSetVariable )
                    // InternalEvoOperationDsl.g:342:3: ruleEvoSetVariable
                    {
                     before(grammarAccess.getEvoVariableAccess().getEvoSetVariableParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoSetVariable();

                    state._fsp--;

                     after(grammarAccess.getEvoVariableAccess().getEvoSetVariableParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEvoOperationDsl.g:347:2: ( ruleEvoMappingVariable )
                    {
                    // InternalEvoOperationDsl.g:347:2: ( ruleEvoMappingVariable )
                    // InternalEvoOperationDsl.g:348:3: ruleEvoMappingVariable
                    {
                     before(grammarAccess.getEvoVariableAccess().getEvoMappingVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEvoMappingVariable();

                    state._fsp--;

                     after(grammarAccess.getEvoVariableAccess().getEvoMappingVariableParserRuleCall_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EvoVariable__Alternatives"


    // $ANTLR start "rule__EvoFeatureVariableType__Alternatives"
    // InternalEvoOperationDsl.g:357:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:361:1: ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEvoOperationDsl.g:362:2: ( ( 'parentOf' ) )
                    {
                    // InternalEvoOperationDsl.g:362:2: ( ( 'parentOf' ) )
                    // InternalEvoOperationDsl.g:363:3: ( 'parentOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoOperationDsl.g:364:3: ( 'parentOf' )
                    // InternalEvoOperationDsl.g:364:4: 'parentOf'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:368:2: ( ( 'siblingOf' ) )
                    {
                    // InternalEvoOperationDsl.g:368:2: ( ( 'siblingOf' ) )
                    // InternalEvoOperationDsl.g:369:3: ( 'siblingOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoOperationDsl.g:370:3: ( 'siblingOf' )
                    // InternalEvoOperationDsl.g:370:4: 'siblingOf'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:374:2: ( ( 'childOf' ) )
                    {
                    // InternalEvoOperationDsl.g:374:2: ( ( 'childOf' ) )
                    // InternalEvoOperationDsl.g:375:3: ( 'childOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoOperationDsl.g:376:3: ( 'childOf' )
                    // InternalEvoOperationDsl.g:376:4: 'childOf'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EvoFeatureVariableType__Alternatives"


    // $ANTLR start "rule__EvoOperationContainer__Group__0"
    // InternalEvoOperationDsl.g:384:1: rule__EvoOperationContainer__Group__0 : rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1 ;
    public final void rule__EvoOperationContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:388:1: ( rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1 )
            // InternalEvoOperationDsl.g:389:2: rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EvoOperationContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperationContainer__Group__1();

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
    // $ANTLR end "rule__EvoOperationContainer__Group__0"


    // $ANTLR start "rule__EvoOperationContainer__Group__0__Impl"
    // InternalEvoOperationDsl.g:396:1: rule__EvoOperationContainer__Group__0__Impl : ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) ) ;
    public final void rule__EvoOperationContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:400:1: ( ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) ) )
            // InternalEvoOperationDsl.g:401:1: ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) )
            {
            // InternalEvoOperationDsl.g:401:1: ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) )
            // InternalEvoOperationDsl.g:402:2: ( rule__EvoOperationContainer__OperationsAssignment_0 )
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_0()); 
            // InternalEvoOperationDsl.g:403:2: ( rule__EvoOperationContainer__OperationsAssignment_0 )
            // InternalEvoOperationDsl.g:403:3: rule__EvoOperationContainer__OperationsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperationContainer__OperationsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_0()); 

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
    // $ANTLR end "rule__EvoOperationContainer__Group__0__Impl"


    // $ANTLR start "rule__EvoOperationContainer__Group__1"
    // InternalEvoOperationDsl.g:411:1: rule__EvoOperationContainer__Group__1 : rule__EvoOperationContainer__Group__1__Impl ;
    public final void rule__EvoOperationContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:415:1: ( rule__EvoOperationContainer__Group__1__Impl )
            // InternalEvoOperationDsl.g:416:2: rule__EvoOperationContainer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperationContainer__Group__1__Impl();

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
    // $ANTLR end "rule__EvoOperationContainer__Group__1"


    // $ANTLR start "rule__EvoOperationContainer__Group__1__Impl"
    // InternalEvoOperationDsl.g:422:1: rule__EvoOperationContainer__Group__1__Impl : ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* ) ;
    public final void rule__EvoOperationContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:426:1: ( ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* ) )
            // InternalEvoOperationDsl.g:427:1: ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* )
            {
            // InternalEvoOperationDsl.g:427:1: ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* )
            // InternalEvoOperationDsl.g:428:2: ( rule__EvoOperationContainer__OperationsAssignment_1 )*
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_1()); 
            // InternalEvoOperationDsl.g:429:2: ( rule__EvoOperationContainer__OperationsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:429:3: rule__EvoOperationContainer__OperationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EvoOperationContainer__OperationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_1()); 

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
    // $ANTLR end "rule__EvoOperationContainer__Group__1__Impl"


    // $ANTLR start "rule__EvoOperation__Group__0"
    // InternalEvoOperationDsl.g:438:1: rule__EvoOperation__Group__0 : rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1 ;
    public final void rule__EvoOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:442:1: ( rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1 )
            // InternalEvoOperationDsl.g:443:2: rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__1();

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
    // $ANTLR end "rule__EvoOperation__Group__0"


    // $ANTLR start "rule__EvoOperation__Group__0__Impl"
    // InternalEvoOperationDsl.g:450:1: rule__EvoOperation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__EvoOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:454:1: ( ( 'operation' ) )
            // InternalEvoOperationDsl.g:455:1: ( 'operation' )
            {
            // InternalEvoOperationDsl.g:455:1: ( 'operation' )
            // InternalEvoOperationDsl.g:456:2: 'operation'
            {
             before(grammarAccess.getEvoOperationAccess().getOperationKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getOperationKeyword_0()); 

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
    // $ANTLR end "rule__EvoOperation__Group__0__Impl"


    // $ANTLR start "rule__EvoOperation__Group__1"
    // InternalEvoOperationDsl.g:465:1: rule__EvoOperation__Group__1 : rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2 ;
    public final void rule__EvoOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:469:1: ( rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2 )
            // InternalEvoOperationDsl.g:470:2: rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EvoOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__2();

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
    // $ANTLR end "rule__EvoOperation__Group__1"


    // $ANTLR start "rule__EvoOperation__Group__1__Impl"
    // InternalEvoOperationDsl.g:477:1: rule__EvoOperation__Group__1__Impl : ( ( rule__EvoOperation__NameAssignment_1 ) ) ;
    public final void rule__EvoOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:481:1: ( ( ( rule__EvoOperation__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:482:1: ( ( rule__EvoOperation__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:482:1: ( ( rule__EvoOperation__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:483:2: ( rule__EvoOperation__NameAssignment_1 )
            {
             before(grammarAccess.getEvoOperationAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:484:2: ( rule__EvoOperation__NameAssignment_1 )
            // InternalEvoOperationDsl.g:484:3: rule__EvoOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoOperationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EvoOperation__Group__1__Impl"


    // $ANTLR start "rule__EvoOperation__Group__2"
    // InternalEvoOperationDsl.g:492:1: rule__EvoOperation__Group__2 : rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3 ;
    public final void rule__EvoOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:496:1: ( rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3 )
            // InternalEvoOperationDsl.g:497:2: rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__EvoOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__3();

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
    // $ANTLR end "rule__EvoOperation__Group__2"


    // $ANTLR start "rule__EvoOperation__Group__2__Impl"
    // InternalEvoOperationDsl.g:504:1: rule__EvoOperation__Group__2__Impl : ( '{' ) ;
    public final void rule__EvoOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:508:1: ( ( '{' ) )
            // InternalEvoOperationDsl.g:509:1: ( '{' )
            {
            // InternalEvoOperationDsl.g:509:1: ( '{' )
            // InternalEvoOperationDsl.g:510:2: '{'
            {
             before(grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__EvoOperation__Group__2__Impl"


    // $ANTLR start "rule__EvoOperation__Group__3"
    // InternalEvoOperationDsl.g:519:1: rule__EvoOperation__Group__3 : rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4 ;
    public final void rule__EvoOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:523:1: ( rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4 )
            // InternalEvoOperationDsl.g:524:2: rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__EvoOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__4();

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
    // $ANTLR end "rule__EvoOperation__Group__3"


    // $ANTLR start "rule__EvoOperation__Group__3__Impl"
    // InternalEvoOperationDsl.g:531:1: rule__EvoOperation__Group__3__Impl : ( 'variables' ) ;
    public final void rule__EvoOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:535:1: ( ( 'variables' ) )
            // InternalEvoOperationDsl.g:536:1: ( 'variables' )
            {
            // InternalEvoOperationDsl.g:536:1: ( 'variables' )
            // InternalEvoOperationDsl.g:537:2: 'variables'
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getVariablesKeyword_3()); 

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
    // $ANTLR end "rule__EvoOperation__Group__3__Impl"


    // $ANTLR start "rule__EvoOperation__Group__4"
    // InternalEvoOperationDsl.g:546:1: rule__EvoOperation__Group__4 : rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5 ;
    public final void rule__EvoOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:550:1: ( rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5 )
            // InternalEvoOperationDsl.g:551:2: rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__EvoOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__5();

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
    // $ANTLR end "rule__EvoOperation__Group__4"


    // $ANTLR start "rule__EvoOperation__Group__4__Impl"
    // InternalEvoOperationDsl.g:558:1: rule__EvoOperation__Group__4__Impl : ( '{' ) ;
    public final void rule__EvoOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:562:1: ( ( '{' ) )
            // InternalEvoOperationDsl.g:563:1: ( '{' )
            {
            // InternalEvoOperationDsl.g:563:1: ( '{' )
            // InternalEvoOperationDsl.g:564:2: '{'
            {
             before(grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__EvoOperation__Group__4__Impl"


    // $ANTLR start "rule__EvoOperation__Group__5"
    // InternalEvoOperationDsl.g:573:1: rule__EvoOperation__Group__5 : rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6 ;
    public final void rule__EvoOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:577:1: ( rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6 )
            // InternalEvoOperationDsl.g:578:2: rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__EvoOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__6();

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
    // $ANTLR end "rule__EvoOperation__Group__5"


    // $ANTLR start "rule__EvoOperation__Group__5__Impl"
    // InternalEvoOperationDsl.g:585:1: rule__EvoOperation__Group__5__Impl : ( ( rule__EvoOperation__VariablesAssignment_5 ) ) ;
    public final void rule__EvoOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:589:1: ( ( ( rule__EvoOperation__VariablesAssignment_5 ) ) )
            // InternalEvoOperationDsl.g:590:1: ( ( rule__EvoOperation__VariablesAssignment_5 ) )
            {
            // InternalEvoOperationDsl.g:590:1: ( ( rule__EvoOperation__VariablesAssignment_5 ) )
            // InternalEvoOperationDsl.g:591:2: ( rule__EvoOperation__VariablesAssignment_5 )
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesAssignment_5()); 
            // InternalEvoOperationDsl.g:592:2: ( rule__EvoOperation__VariablesAssignment_5 )
            // InternalEvoOperationDsl.g:592:3: rule__EvoOperation__VariablesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__VariablesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEvoOperationAccess().getVariablesAssignment_5()); 

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
    // $ANTLR end "rule__EvoOperation__Group__5__Impl"


    // $ANTLR start "rule__EvoOperation__Group__6"
    // InternalEvoOperationDsl.g:600:1: rule__EvoOperation__Group__6 : rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7 ;
    public final void rule__EvoOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:604:1: ( rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7 )
            // InternalEvoOperationDsl.g:605:2: rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__EvoOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__7();

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
    // $ANTLR end "rule__EvoOperation__Group__6"


    // $ANTLR start "rule__EvoOperation__Group__6__Impl"
    // InternalEvoOperationDsl.g:612:1: rule__EvoOperation__Group__6__Impl : ( ( rule__EvoOperation__Group_6__0 )* ) ;
    public final void rule__EvoOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:616:1: ( ( ( rule__EvoOperation__Group_6__0 )* ) )
            // InternalEvoOperationDsl.g:617:1: ( ( rule__EvoOperation__Group_6__0 )* )
            {
            // InternalEvoOperationDsl.g:617:1: ( ( rule__EvoOperation__Group_6__0 )* )
            // InternalEvoOperationDsl.g:618:2: ( rule__EvoOperation__Group_6__0 )*
            {
             before(grammarAccess.getEvoOperationAccess().getGroup_6()); 
            // InternalEvoOperationDsl.g:619:2: ( rule__EvoOperation__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==22||LA4_1==27||(LA4_1>=30 && LA4_1<=32)) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:619:3: rule__EvoOperation__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EvoOperation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEvoOperationAccess().getGroup_6()); 

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
    // $ANTLR end "rule__EvoOperation__Group__6__Impl"


    // $ANTLR start "rule__EvoOperation__Group__7"
    // InternalEvoOperationDsl.g:627:1: rule__EvoOperation__Group__7 : rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8 ;
    public final void rule__EvoOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:631:1: ( rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8 )
            // InternalEvoOperationDsl.g:632:2: rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__EvoOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__8();

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
    // $ANTLR end "rule__EvoOperation__Group__7"


    // $ANTLR start "rule__EvoOperation__Group__7__Impl"
    // InternalEvoOperationDsl.g:639:1: rule__EvoOperation__Group__7__Impl : ( ';' ) ;
    public final void rule__EvoOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:643:1: ( ( ';' ) )
            // InternalEvoOperationDsl.g:644:1: ( ';' )
            {
            // InternalEvoOperationDsl.g:644:1: ( ';' )
            // InternalEvoOperationDsl.g:645:2: ';'
            {
             before(grammarAccess.getEvoOperationAccess().getSemicolonKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__EvoOperation__Group__7__Impl"


    // $ANTLR start "rule__EvoOperation__Group__8"
    // InternalEvoOperationDsl.g:654:1: rule__EvoOperation__Group__8 : rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9 ;
    public final void rule__EvoOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:658:1: ( rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9 )
            // InternalEvoOperationDsl.g:659:2: rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__EvoOperation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__9();

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
    // $ANTLR end "rule__EvoOperation__Group__8"


    // $ANTLR start "rule__EvoOperation__Group__8__Impl"
    // InternalEvoOperationDsl.g:666:1: rule__EvoOperation__Group__8__Impl : ( '}' ) ;
    public final void rule__EvoOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:670:1: ( ( '}' ) )
            // InternalEvoOperationDsl.g:671:1: ( '}' )
            {
            // InternalEvoOperationDsl.g:671:1: ( '}' )
            // InternalEvoOperationDsl.g:672:2: '}'
            {
             before(grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__EvoOperation__Group__8__Impl"


    // $ANTLR start "rule__EvoOperation__Group__9"
    // InternalEvoOperationDsl.g:681:1: rule__EvoOperation__Group__9 : rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10 ;
    public final void rule__EvoOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:685:1: ( rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10 )
            // InternalEvoOperationDsl.g:686:2: rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__EvoOperation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__10();

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
    // $ANTLR end "rule__EvoOperation__Group__9"


    // $ANTLR start "rule__EvoOperation__Group__9__Impl"
    // InternalEvoOperationDsl.g:693:1: rule__EvoOperation__Group__9__Impl : ( ( rule__EvoOperation__Group_9__0 )? ) ;
    public final void rule__EvoOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:697:1: ( ( ( rule__EvoOperation__Group_9__0 )? ) )
            // InternalEvoOperationDsl.g:698:1: ( ( rule__EvoOperation__Group_9__0 )? )
            {
            // InternalEvoOperationDsl.g:698:1: ( ( rule__EvoOperation__Group_9__0 )? )
            // InternalEvoOperationDsl.g:699:2: ( rule__EvoOperation__Group_9__0 )?
            {
             before(grammarAccess.getEvoOperationAccess().getGroup_9()); 
            // InternalEvoOperationDsl.g:700:2: ( rule__EvoOperation__Group_9__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoOperationDsl.g:700:3: rule__EvoOperation__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoOperation__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoOperationAccess().getGroup_9()); 

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
    // $ANTLR end "rule__EvoOperation__Group__9__Impl"


    // $ANTLR start "rule__EvoOperation__Group__10"
    // InternalEvoOperationDsl.g:708:1: rule__EvoOperation__Group__10 : rule__EvoOperation__Group__10__Impl ;
    public final void rule__EvoOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:712:1: ( rule__EvoOperation__Group__10__Impl )
            // InternalEvoOperationDsl.g:713:2: rule__EvoOperation__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group__10__Impl();

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
    // $ANTLR end "rule__EvoOperation__Group__10"


    // $ANTLR start "rule__EvoOperation__Group__10__Impl"
    // InternalEvoOperationDsl.g:719:1: rule__EvoOperation__Group__10__Impl : ( '}' ) ;
    public final void rule__EvoOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:723:1: ( ( '}' ) )
            // InternalEvoOperationDsl.g:724:1: ( '}' )
            {
            // InternalEvoOperationDsl.g:724:1: ( '}' )
            // InternalEvoOperationDsl.g:725:2: '}'
            {
             before(grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__EvoOperation__Group__10__Impl"


    // $ANTLR start "rule__EvoOperation__Group_6__0"
    // InternalEvoOperationDsl.g:735:1: rule__EvoOperation__Group_6__0 : rule__EvoOperation__Group_6__0__Impl rule__EvoOperation__Group_6__1 ;
    public final void rule__EvoOperation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:739:1: ( rule__EvoOperation__Group_6__0__Impl rule__EvoOperation__Group_6__1 )
            // InternalEvoOperationDsl.g:740:2: rule__EvoOperation__Group_6__0__Impl rule__EvoOperation__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__EvoOperation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group_6__1();

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
    // $ANTLR end "rule__EvoOperation__Group_6__0"


    // $ANTLR start "rule__EvoOperation__Group_6__0__Impl"
    // InternalEvoOperationDsl.g:747:1: rule__EvoOperation__Group_6__0__Impl : ( ';' ) ;
    public final void rule__EvoOperation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:751:1: ( ( ';' ) )
            // InternalEvoOperationDsl.g:752:1: ( ';' )
            {
            // InternalEvoOperationDsl.g:752:1: ( ';' )
            // InternalEvoOperationDsl.g:753:2: ';'
            {
             before(grammarAccess.getEvoOperationAccess().getSemicolonKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getSemicolonKeyword_6_0()); 

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
    // $ANTLR end "rule__EvoOperation__Group_6__0__Impl"


    // $ANTLR start "rule__EvoOperation__Group_6__1"
    // InternalEvoOperationDsl.g:762:1: rule__EvoOperation__Group_6__1 : rule__EvoOperation__Group_6__1__Impl ;
    public final void rule__EvoOperation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:766:1: ( rule__EvoOperation__Group_6__1__Impl )
            // InternalEvoOperationDsl.g:767:2: rule__EvoOperation__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group_6__1__Impl();

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
    // $ANTLR end "rule__EvoOperation__Group_6__1"


    // $ANTLR start "rule__EvoOperation__Group_6__1__Impl"
    // InternalEvoOperationDsl.g:773:1: rule__EvoOperation__Group_6__1__Impl : ( ( rule__EvoOperation__VariablesAssignment_6_1 ) ) ;
    public final void rule__EvoOperation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:777:1: ( ( ( rule__EvoOperation__VariablesAssignment_6_1 ) ) )
            // InternalEvoOperationDsl.g:778:1: ( ( rule__EvoOperation__VariablesAssignment_6_1 ) )
            {
            // InternalEvoOperationDsl.g:778:1: ( ( rule__EvoOperation__VariablesAssignment_6_1 ) )
            // InternalEvoOperationDsl.g:779:2: ( rule__EvoOperation__VariablesAssignment_6_1 )
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesAssignment_6_1()); 
            // InternalEvoOperationDsl.g:780:2: ( rule__EvoOperation__VariablesAssignment_6_1 )
            // InternalEvoOperationDsl.g:780:3: rule__EvoOperation__VariablesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__VariablesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoOperationAccess().getVariablesAssignment_6_1()); 

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
    // $ANTLR end "rule__EvoOperation__Group_6__1__Impl"


    // $ANTLR start "rule__EvoOperation__Group_9__0"
    // InternalEvoOperationDsl.g:789:1: rule__EvoOperation__Group_9__0 : rule__EvoOperation__Group_9__0__Impl rule__EvoOperation__Group_9__1 ;
    public final void rule__EvoOperation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:793:1: ( rule__EvoOperation__Group_9__0__Impl rule__EvoOperation__Group_9__1 )
            // InternalEvoOperationDsl.g:794:2: rule__EvoOperation__Group_9__0__Impl rule__EvoOperation__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__EvoOperation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group_9__1();

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
    // $ANTLR end "rule__EvoOperation__Group_9__0"


    // $ANTLR start "rule__EvoOperation__Group_9__0__Impl"
    // InternalEvoOperationDsl.g:801:1: rule__EvoOperation__Group_9__0__Impl : ( 'date' ) ;
    public final void rule__EvoOperation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:805:1: ( ( 'date' ) )
            // InternalEvoOperationDsl.g:806:1: ( 'date' )
            {
            // InternalEvoOperationDsl.g:806:1: ( 'date' )
            // InternalEvoOperationDsl.g:807:2: 'date'
            {
             before(grammarAccess.getEvoOperationAccess().getDateKeyword_9_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getDateKeyword_9_0()); 

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
    // $ANTLR end "rule__EvoOperation__Group_9__0__Impl"


    // $ANTLR start "rule__EvoOperation__Group_9__1"
    // InternalEvoOperationDsl.g:816:1: rule__EvoOperation__Group_9__1 : rule__EvoOperation__Group_9__1__Impl rule__EvoOperation__Group_9__2 ;
    public final void rule__EvoOperation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:820:1: ( rule__EvoOperation__Group_9__1__Impl rule__EvoOperation__Group_9__2 )
            // InternalEvoOperationDsl.g:821:2: rule__EvoOperation__Group_9__1__Impl rule__EvoOperation__Group_9__2
            {
            pushFollow(FOLLOW_14);
            rule__EvoOperation__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group_9__2();

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
    // $ANTLR end "rule__EvoOperation__Group_9__1"


    // $ANTLR start "rule__EvoOperation__Group_9__1__Impl"
    // InternalEvoOperationDsl.g:828:1: rule__EvoOperation__Group_9__1__Impl : ( ':' ) ;
    public final void rule__EvoOperation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:832:1: ( ( ':' ) )
            // InternalEvoOperationDsl.g:833:1: ( ':' )
            {
            // InternalEvoOperationDsl.g:833:1: ( ':' )
            // InternalEvoOperationDsl.g:834:2: ':'
            {
             before(grammarAccess.getEvoOperationAccess().getColonKeyword_9_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getColonKeyword_9_1()); 

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
    // $ANTLR end "rule__EvoOperation__Group_9__1__Impl"


    // $ANTLR start "rule__EvoOperation__Group_9__2"
    // InternalEvoOperationDsl.g:843:1: rule__EvoOperation__Group_9__2 : rule__EvoOperation__Group_9__2__Impl ;
    public final void rule__EvoOperation__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:847:1: ( rule__EvoOperation__Group_9__2__Impl )
            // InternalEvoOperationDsl.g:848:2: rule__EvoOperation__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__Group_9__2__Impl();

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
    // $ANTLR end "rule__EvoOperation__Group_9__2"


    // $ANTLR start "rule__EvoOperation__Group_9__2__Impl"
    // InternalEvoOperationDsl.g:854:1: rule__EvoOperation__Group_9__2__Impl : ( ( rule__EvoOperation__DateAssignment_9_2 ) ) ;
    public final void rule__EvoOperation__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:858:1: ( ( ( rule__EvoOperation__DateAssignment_9_2 ) ) )
            // InternalEvoOperationDsl.g:859:1: ( ( rule__EvoOperation__DateAssignment_9_2 ) )
            {
            // InternalEvoOperationDsl.g:859:1: ( ( rule__EvoOperation__DateAssignment_9_2 ) )
            // InternalEvoOperationDsl.g:860:2: ( rule__EvoOperation__DateAssignment_9_2 )
            {
             before(grammarAccess.getEvoOperationAccess().getDateAssignment_9_2()); 
            // InternalEvoOperationDsl.g:861:2: ( rule__EvoOperation__DateAssignment_9_2 )
            // InternalEvoOperationDsl.g:861:3: rule__EvoOperation__DateAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoOperation__DateAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoOperationAccess().getDateAssignment_9_2()); 

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
    // $ANTLR end "rule__EvoOperation__Group_9__2__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group__0"
    // InternalEvoOperationDsl.g:870:1: rule__EvoFeatureVariable__Group__0 : rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 ;
    public final void rule__EvoFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:874:1: ( rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 )
            // InternalEvoOperationDsl.g:875:2: rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoFeatureVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group__1();

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
    // $ANTLR end "rule__EvoFeatureVariable__Group__0"


    // $ANTLR start "rule__EvoFeatureVariable__Group__0__Impl"
    // InternalEvoOperationDsl.g:882:1: rule__EvoFeatureVariable__Group__0__Impl : ( 'feature' ) ;
    public final void rule__EvoFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:886:1: ( ( 'feature' ) )
            // InternalEvoOperationDsl.g:887:1: ( 'feature' )
            {
            // InternalEvoOperationDsl.g:887:1: ( 'feature' )
            // InternalEvoOperationDsl.g:888:2: 'feature'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureVariableAccess().getFeatureKeyword_0()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__Group__0__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group__1"
    // InternalEvoOperationDsl.g:897:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:901:1: ( rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2 )
            // InternalEvoOperationDsl.g:902:2: rule__EvoFeatureVariable__Group__1__Impl rule__EvoFeatureVariable__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EvoFeatureVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group__2();

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
    // $ANTLR end "rule__EvoFeatureVariable__Group__1"


    // $ANTLR start "rule__EvoFeatureVariable__Group__1__Impl"
    // InternalEvoOperationDsl.g:909:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:913:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:914:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:914:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:915:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:916:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:916:3: rule__EvoFeatureVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__Group__1__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group__2"
    // InternalEvoOperationDsl.g:924:1: rule__EvoFeatureVariable__Group__2 : rule__EvoFeatureVariable__Group__2__Impl rule__EvoFeatureVariable__Group__3 ;
    public final void rule__EvoFeatureVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:928:1: ( rule__EvoFeatureVariable__Group__2__Impl rule__EvoFeatureVariable__Group__3 )
            // InternalEvoOperationDsl.g:929:2: rule__EvoFeatureVariable__Group__2__Impl rule__EvoFeatureVariable__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__EvoFeatureVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group__3();

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
    // $ANTLR end "rule__EvoFeatureVariable__Group__2"


    // $ANTLR start "rule__EvoFeatureVariable__Group__2__Impl"
    // InternalEvoOperationDsl.g:936:1: rule__EvoFeatureVariable__Group__2__Impl : ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? ) ;
    public final void rule__EvoFeatureVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:940:1: ( ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? ) )
            // InternalEvoOperationDsl.g:941:1: ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? )
            {
            // InternalEvoOperationDsl.g:941:1: ( ( rule__EvoFeatureVariable__RelationAssignment_2 )? )
            // InternalEvoOperationDsl.g:942:2: ( rule__EvoFeatureVariable__RelationAssignment_2 )?
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getRelationAssignment_2()); 
            // InternalEvoOperationDsl.g:943:2: ( rule__EvoFeatureVariable__RelationAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=12 && LA6_0<=14)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvoOperationDsl.g:943:3: rule__EvoFeatureVariable__RelationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoFeatureVariable__RelationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoFeatureVariableAccess().getRelationAssignment_2()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__Group__2__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group__3"
    // InternalEvoOperationDsl.g:951:1: rule__EvoFeatureVariable__Group__3 : rule__EvoFeatureVariable__Group__3__Impl ;
    public final void rule__EvoFeatureVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:955:1: ( rule__EvoFeatureVariable__Group__3__Impl )
            // InternalEvoOperationDsl.g:956:2: rule__EvoFeatureVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group__3__Impl();

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
    // $ANTLR end "rule__EvoFeatureVariable__Group__3"


    // $ANTLR start "rule__EvoFeatureVariable__Group__3__Impl"
    // InternalEvoOperationDsl.g:962:1: rule__EvoFeatureVariable__Group__3__Impl : ( ( rule__EvoFeatureVariable__Group_3__0 )? ) ;
    public final void rule__EvoFeatureVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:966:1: ( ( ( rule__EvoFeatureVariable__Group_3__0 )? ) )
            // InternalEvoOperationDsl.g:967:1: ( ( rule__EvoFeatureVariable__Group_3__0 )? )
            {
            // InternalEvoOperationDsl.g:967:1: ( ( rule__EvoFeatureVariable__Group_3__0 )? )
            // InternalEvoOperationDsl.g:968:2: ( rule__EvoFeatureVariable__Group_3__0 )?
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getGroup_3()); 
            // InternalEvoOperationDsl.g:969:2: ( rule__EvoFeatureVariable__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvoOperationDsl.g:969:3: rule__EvoFeatureVariable__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoFeatureVariable__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoFeatureVariableAccess().getGroup_3()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__Group__3__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__0"
    // InternalEvoOperationDsl.g:978:1: rule__EvoFeatureVariable__Group_3__0 : rule__EvoFeatureVariable__Group_3__0__Impl rule__EvoFeatureVariable__Group_3__1 ;
    public final void rule__EvoFeatureVariable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:982:1: ( rule__EvoFeatureVariable__Group_3__0__Impl rule__EvoFeatureVariable__Group_3__1 )
            // InternalEvoOperationDsl.g:983:2: rule__EvoFeatureVariable__Group_3__0__Impl rule__EvoFeatureVariable__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__EvoFeatureVariable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group_3__1();

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
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__0"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__0__Impl"
    // InternalEvoOperationDsl.g:990:1: rule__EvoFeatureVariable__Group_3__0__Impl : ( 'reference' ) ;
    public final void rule__EvoFeatureVariable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:994:1: ( ( 'reference' ) )
            // InternalEvoOperationDsl.g:995:1: ( 'reference' )
            {
            // InternalEvoOperationDsl.g:995:1: ( 'reference' )
            // InternalEvoOperationDsl.g:996:2: 'reference'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getReferenceKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureVariableAccess().getReferenceKeyword_3_0()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__0__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__1"
    // InternalEvoOperationDsl.g:1005:1: rule__EvoFeatureVariable__Group_3__1 : rule__EvoFeatureVariable__Group_3__1__Impl rule__EvoFeatureVariable__Group_3__2 ;
    public final void rule__EvoFeatureVariable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1009:1: ( rule__EvoFeatureVariable__Group_3__1__Impl rule__EvoFeatureVariable__Group_3__2 )
            // InternalEvoOperationDsl.g:1010:2: rule__EvoFeatureVariable__Group_3__1__Impl rule__EvoFeatureVariable__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__EvoFeatureVariable__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group_3__2();

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
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__1"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__1__Impl"
    // InternalEvoOperationDsl.g:1017:1: rule__EvoFeatureVariable__Group_3__1__Impl : ( ':' ) ;
    public final void rule__EvoFeatureVariable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1021:1: ( ( ':' ) )
            // InternalEvoOperationDsl.g:1022:1: ( ':' )
            {
            // InternalEvoOperationDsl.g:1022:1: ( ':' )
            // InternalEvoOperationDsl.g:1023:2: ':'
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getColonKeyword_3_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureVariableAccess().getColonKeyword_3_1()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__1__Impl"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__2"
    // InternalEvoOperationDsl.g:1032:1: rule__EvoFeatureVariable__Group_3__2 : rule__EvoFeatureVariable__Group_3__2__Impl ;
    public final void rule__EvoFeatureVariable__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1036:1: ( rule__EvoFeatureVariable__Group_3__2__Impl )
            // InternalEvoOperationDsl.g:1037:2: rule__EvoFeatureVariable__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group_3__2__Impl();

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
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__2"


    // $ANTLR start "rule__EvoFeatureVariable__Group_3__2__Impl"
    // InternalEvoOperationDsl.g:1043:1: rule__EvoFeatureVariable__Group_3__2__Impl : ( ( rule__EvoFeatureVariable__FeatureAssignment_3_2 ) ) ;
    public final void rule__EvoFeatureVariable__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1047:1: ( ( ( rule__EvoFeatureVariable__FeatureAssignment_3_2 ) ) )
            // InternalEvoOperationDsl.g:1048:1: ( ( rule__EvoFeatureVariable__FeatureAssignment_3_2 ) )
            {
            // InternalEvoOperationDsl.g:1048:1: ( ( rule__EvoFeatureVariable__FeatureAssignment_3_2 ) )
            // InternalEvoOperationDsl.g:1049:2: ( rule__EvoFeatureVariable__FeatureAssignment_3_2 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureAssignment_3_2()); 
            // InternalEvoOperationDsl.g:1050:2: ( rule__EvoFeatureVariable__FeatureAssignment_3_2 )
            // InternalEvoOperationDsl.g:1050:3: rule__EvoFeatureVariable__FeatureAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__FeatureAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureVariableAccess().getFeatureAssignment_3_2()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__Group_3__2__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__0"
    // InternalEvoOperationDsl.g:1059:1: rule__EvoFeatureRelation__Group__0 : rule__EvoFeatureRelation__Group__0__Impl rule__EvoFeatureRelation__Group__1 ;
    public final void rule__EvoFeatureRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1063:1: ( rule__EvoFeatureRelation__Group__0__Impl rule__EvoFeatureRelation__Group__1 )
            // InternalEvoOperationDsl.g:1064:2: rule__EvoFeatureRelation__Group__0__Impl rule__EvoFeatureRelation__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EvoFeatureRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__1();

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__0"


    // $ANTLR start "rule__EvoFeatureRelation__Group__0__Impl"
    // InternalEvoOperationDsl.g:1071:1: rule__EvoFeatureRelation__Group__0__Impl : ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) ) ;
    public final void rule__EvoFeatureRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1075:1: ( ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) ) )
            // InternalEvoOperationDsl.g:1076:1: ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) )
            {
            // InternalEvoOperationDsl.g:1076:1: ( ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 ) )
            // InternalEvoOperationDsl.g:1077:2: ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeAssignment_0()); 
            // InternalEvoOperationDsl.g:1078:2: ( rule__EvoFeatureRelation__FeatureTypeAssignment_0 )
            // InternalEvoOperationDsl.g:1078:3: rule__EvoFeatureRelation__FeatureTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__FeatureTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeAssignment_0()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__0__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__1"
    // InternalEvoOperationDsl.g:1086:1: rule__EvoFeatureRelation__Group__1 : rule__EvoFeatureRelation__Group__1__Impl rule__EvoFeatureRelation__Group__2 ;
    public final void rule__EvoFeatureRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1090:1: ( rule__EvoFeatureRelation__Group__1__Impl rule__EvoFeatureRelation__Group__2 )
            // InternalEvoOperationDsl.g:1091:2: rule__EvoFeatureRelation__Group__1__Impl rule__EvoFeatureRelation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EvoFeatureRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__2();

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__1"


    // $ANTLR start "rule__EvoFeatureRelation__Group__1__Impl"
    // InternalEvoOperationDsl.g:1098:1: rule__EvoFeatureRelation__Group__1__Impl : ( '(' ) ;
    public final void rule__EvoFeatureRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1102:1: ( ( '(' ) )
            // InternalEvoOperationDsl.g:1103:1: ( '(' )
            {
            // InternalEvoOperationDsl.g:1103:1: ( '(' )
            // InternalEvoOperationDsl.g:1104:2: '('
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__1__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__2"
    // InternalEvoOperationDsl.g:1113:1: rule__EvoFeatureRelation__Group__2 : rule__EvoFeatureRelation__Group__2__Impl rule__EvoFeatureRelation__Group__3 ;
    public final void rule__EvoFeatureRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1117:1: ( rule__EvoFeatureRelation__Group__2__Impl rule__EvoFeatureRelation__Group__3 )
            // InternalEvoOperationDsl.g:1118:2: rule__EvoFeatureRelation__Group__2__Impl rule__EvoFeatureRelation__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__EvoFeatureRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__3();

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__2"


    // $ANTLR start "rule__EvoFeatureRelation__Group__2__Impl"
    // InternalEvoOperationDsl.g:1125:1: rule__EvoFeatureRelation__Group__2__Impl : ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) ) ;
    public final void rule__EvoFeatureRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1129:1: ( ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) ) )
            // InternalEvoOperationDsl.g:1130:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) )
            {
            // InternalEvoOperationDsl.g:1130:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 ) )
            // InternalEvoOperationDsl.g:1131:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_2()); 
            // InternalEvoOperationDsl.g:1132:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 )
            // InternalEvoOperationDsl.g:1132:3: rule__EvoFeatureRelation__RelatedFeaturesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__RelatedFeaturesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_2()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__2__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__3"
    // InternalEvoOperationDsl.g:1140:1: rule__EvoFeatureRelation__Group__3 : rule__EvoFeatureRelation__Group__3__Impl rule__EvoFeatureRelation__Group__4 ;
    public final void rule__EvoFeatureRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1144:1: ( rule__EvoFeatureRelation__Group__3__Impl rule__EvoFeatureRelation__Group__4 )
            // InternalEvoOperationDsl.g:1145:2: rule__EvoFeatureRelation__Group__3__Impl rule__EvoFeatureRelation__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__EvoFeatureRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__4();

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__3"


    // $ANTLR start "rule__EvoFeatureRelation__Group__3__Impl"
    // InternalEvoOperationDsl.g:1152:1: rule__EvoFeatureRelation__Group__3__Impl : ( ( rule__EvoFeatureRelation__Group_3__0 )? ) ;
    public final void rule__EvoFeatureRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1156:1: ( ( ( rule__EvoFeatureRelation__Group_3__0 )? ) )
            // InternalEvoOperationDsl.g:1157:1: ( ( rule__EvoFeatureRelation__Group_3__0 )? )
            {
            // InternalEvoOperationDsl.g:1157:1: ( ( rule__EvoFeatureRelation__Group_3__0 )? )
            // InternalEvoOperationDsl.g:1158:2: ( rule__EvoFeatureRelation__Group_3__0 )?
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getGroup_3()); 
            // InternalEvoOperationDsl.g:1159:2: ( rule__EvoFeatureRelation__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEvoOperationDsl.g:1159:3: rule__EvoFeatureRelation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoFeatureRelation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoFeatureRelationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__3__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group__4"
    // InternalEvoOperationDsl.g:1167:1: rule__EvoFeatureRelation__Group__4 : rule__EvoFeatureRelation__Group__4__Impl ;
    public final void rule__EvoFeatureRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1171:1: ( rule__EvoFeatureRelation__Group__4__Impl )
            // InternalEvoOperationDsl.g:1172:2: rule__EvoFeatureRelation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group__4__Impl();

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__4"


    // $ANTLR start "rule__EvoFeatureRelation__Group__4__Impl"
    // InternalEvoOperationDsl.g:1178:1: rule__EvoFeatureRelation__Group__4__Impl : ( ')' ) ;
    public final void rule__EvoFeatureRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1182:1: ( ( ')' ) )
            // InternalEvoOperationDsl.g:1183:1: ( ')' )
            {
            // InternalEvoOperationDsl.g:1183:1: ( ')' )
            // InternalEvoOperationDsl.g:1184:2: ')'
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__Group__4__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group_3__0"
    // InternalEvoOperationDsl.g:1194:1: rule__EvoFeatureRelation__Group_3__0 : rule__EvoFeatureRelation__Group_3__0__Impl rule__EvoFeatureRelation__Group_3__1 ;
    public final void rule__EvoFeatureRelation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1198:1: ( rule__EvoFeatureRelation__Group_3__0__Impl rule__EvoFeatureRelation__Group_3__1 )
            // InternalEvoOperationDsl.g:1199:2: rule__EvoFeatureRelation__Group_3__0__Impl rule__EvoFeatureRelation__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoFeatureRelation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group_3__1();

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
    // $ANTLR end "rule__EvoFeatureRelation__Group_3__0"


    // $ANTLR start "rule__EvoFeatureRelation__Group_3__0__Impl"
    // InternalEvoOperationDsl.g:1206:1: rule__EvoFeatureRelation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__EvoFeatureRelation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1210:1: ( ( ',' ) )
            // InternalEvoOperationDsl.g:1211:1: ( ',' )
            {
            // InternalEvoOperationDsl.g:1211:1: ( ',' )
            // InternalEvoOperationDsl.g:1212:2: ','
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__Group_3__0__Impl"


    // $ANTLR start "rule__EvoFeatureRelation__Group_3__1"
    // InternalEvoOperationDsl.g:1221:1: rule__EvoFeatureRelation__Group_3__1 : rule__EvoFeatureRelation__Group_3__1__Impl ;
    public final void rule__EvoFeatureRelation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1225:1: ( rule__EvoFeatureRelation__Group_3__1__Impl )
            // InternalEvoOperationDsl.g:1226:2: rule__EvoFeatureRelation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__Group_3__1__Impl();

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
    // $ANTLR end "rule__EvoFeatureRelation__Group_3__1"


    // $ANTLR start "rule__EvoFeatureRelation__Group_3__1__Impl"
    // InternalEvoOperationDsl.g:1232:1: rule__EvoFeatureRelation__Group_3__1__Impl : ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) ) ;
    public final void rule__EvoFeatureRelation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1236:1: ( ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) ) )
            // InternalEvoOperationDsl.g:1237:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) )
            {
            // InternalEvoOperationDsl.g:1237:1: ( ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 ) )
            // InternalEvoOperationDsl.g:1238:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_3_1()); 
            // InternalEvoOperationDsl.g:1239:2: ( rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 )
            // InternalEvoOperationDsl.g:1239:3: rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesAssignment_3_1()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__Group_3__1__Impl"


    // $ANTLR start "rule__EvoGroupVariable__Group__0"
    // InternalEvoOperationDsl.g:1248:1: rule__EvoGroupVariable__Group__0 : rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 ;
    public final void rule__EvoGroupVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1252:1: ( rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 )
            // InternalEvoOperationDsl.g:1253:2: rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoGroupVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__Group__1();

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
    // $ANTLR end "rule__EvoGroupVariable__Group__0"


    // $ANTLR start "rule__EvoGroupVariable__Group__0__Impl"
    // InternalEvoOperationDsl.g:1260:1: rule__EvoGroupVariable__Group__0__Impl : ( 'group' ) ;
    public final void rule__EvoGroupVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1264:1: ( ( 'group' ) )
            // InternalEvoOperationDsl.g:1265:1: ( 'group' )
            {
            // InternalEvoOperationDsl.g:1265:1: ( 'group' )
            // InternalEvoOperationDsl.g:1266:2: 'group'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); 

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
    // $ANTLR end "rule__EvoGroupVariable__Group__0__Impl"


    // $ANTLR start "rule__EvoGroupVariable__Group__1"
    // InternalEvoOperationDsl.g:1275:1: rule__EvoGroupVariable__Group__1 : rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2 ;
    public final void rule__EvoGroupVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1279:1: ( rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2 )
            // InternalEvoOperationDsl.g:1280:2: rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__EvoGroupVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__Group__2();

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
    // $ANTLR end "rule__EvoGroupVariable__Group__1"


    // $ANTLR start "rule__EvoGroupVariable__Group__1__Impl"
    // InternalEvoOperationDsl.g:1287:1: rule__EvoGroupVariable__Group__1__Impl : ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGroupVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1291:1: ( ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1292:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1292:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1293:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1294:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1294:3: rule__EvoGroupVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EvoGroupVariable__Group__1__Impl"


    // $ANTLR start "rule__EvoGroupVariable__Group__2"
    // InternalEvoOperationDsl.g:1302:1: rule__EvoGroupVariable__Group__2 : rule__EvoGroupVariable__Group__2__Impl ;
    public final void rule__EvoGroupVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1306:1: ( rule__EvoGroupVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:1307:2: rule__EvoGroupVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__Group__2__Impl();

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
    // $ANTLR end "rule__EvoGroupVariable__Group__2"


    // $ANTLR start "rule__EvoGroupVariable__Group__2__Impl"
    // InternalEvoOperationDsl.g:1313:1: rule__EvoGroupVariable__Group__2__Impl : ( ( rule__EvoGroupVariable__Group_2__0 )? ) ;
    public final void rule__EvoGroupVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1317:1: ( ( ( rule__EvoGroupVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:1318:1: ( ( rule__EvoGroupVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:1318:1: ( ( rule__EvoGroupVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:1319:2: ( rule__EvoGroupVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:1320:2: ( rule__EvoGroupVariable__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEvoOperationDsl.g:1320:3: rule__EvoGroupVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoGroupVariable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoGroupVariableAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EvoGroupVariable__Group__2__Impl"


    // $ANTLR start "rule__EvoGroupVariable__Group_2__0"
    // InternalEvoOperationDsl.g:1329:1: rule__EvoGroupVariable__Group_2__0 : rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1 ;
    public final void rule__EvoGroupVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1333:1: ( rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:1334:2: rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__EvoGroupVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__Group_2__1();

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
    // $ANTLR end "rule__EvoGroupVariable__Group_2__0"


    // $ANTLR start "rule__EvoGroupVariable__Group_2__0__Impl"
    // InternalEvoOperationDsl.g:1341:1: rule__EvoGroupVariable__Group_2__0__Impl : ( 'value' ) ;
    public final void rule__EvoGroupVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1345:1: ( ( 'value' ) )
            // InternalEvoOperationDsl.g:1346:1: ( 'value' )
            {
            // InternalEvoOperationDsl.g:1346:1: ( 'value' )
            // InternalEvoOperationDsl.g:1347:2: 'value'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getValueKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEvoGroupVariableAccess().getValueKeyword_2_0()); 

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
    // $ANTLR end "rule__EvoGroupVariable__Group_2__0__Impl"


    // $ANTLR start "rule__EvoGroupVariable__Group_2__1"
    // InternalEvoOperationDsl.g:1356:1: rule__EvoGroupVariable__Group_2__1 : rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2 ;
    public final void rule__EvoGroupVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1360:1: ( rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2 )
            // InternalEvoOperationDsl.g:1361:2: rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__EvoGroupVariable__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__Group_2__2();

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
    // $ANTLR end "rule__EvoGroupVariable__Group_2__1"


    // $ANTLR start "rule__EvoGroupVariable__Group_2__1__Impl"
    // InternalEvoOperationDsl.g:1368:1: rule__EvoGroupVariable__Group_2__1__Impl : ( '=' ) ;
    public final void rule__EvoGroupVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1372:1: ( ( '=' ) )
            // InternalEvoOperationDsl.g:1373:1: ( '=' )
            {
            // InternalEvoOperationDsl.g:1373:1: ( '=' )
            // InternalEvoOperationDsl.g:1374:2: '='
            {
             before(grammarAccess.getEvoGroupVariableAccess().getEqualsSignKeyword_2_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEvoGroupVariableAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__EvoGroupVariable__Group_2__1__Impl"


    // $ANTLR start "rule__EvoGroupVariable__Group_2__2"
    // InternalEvoOperationDsl.g:1383:1: rule__EvoGroupVariable__Group_2__2 : rule__EvoGroupVariable__Group_2__2__Impl ;
    public final void rule__EvoGroupVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1387:1: ( rule__EvoGroupVariable__Group_2__2__Impl )
            // InternalEvoOperationDsl.g:1388:2: rule__EvoGroupVariable__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__Group_2__2__Impl();

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
    // $ANTLR end "rule__EvoGroupVariable__Group_2__2"


    // $ANTLR start "rule__EvoGroupVariable__Group_2__2__Impl"
    // InternalEvoOperationDsl.g:1394:1: rule__EvoGroupVariable__Group_2__2__Impl : ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) ) ;
    public final void rule__EvoGroupVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1398:1: ( ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) ) )
            // InternalEvoOperationDsl.g:1399:1: ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) )
            {
            // InternalEvoOperationDsl.g:1399:1: ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) )
            // InternalEvoOperationDsl.g:1400:2: ( rule__EvoGroupVariable__GroupAssignment_2_2 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupAssignment_2_2()); 
            // InternalEvoOperationDsl.g:1401:2: ( rule__EvoGroupVariable__GroupAssignment_2_2 )
            // InternalEvoOperationDsl.g:1401:3: rule__EvoGroupVariable__GroupAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__EvoGroupVariable__GroupAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEvoGroupVariableAccess().getGroupAssignment_2_2()); 

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
    // $ANTLR end "rule__EvoGroupVariable__Group_2__2__Impl"


    // $ANTLR start "rule__EvoSetVariable__Group__0"
    // InternalEvoOperationDsl.g:1410:1: rule__EvoSetVariable__Group__0 : rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 ;
    public final void rule__EvoSetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1414:1: ( rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 )
            // InternalEvoOperationDsl.g:1415:2: rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoSetVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group__1();

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
    // $ANTLR end "rule__EvoSetVariable__Group__0"


    // $ANTLR start "rule__EvoSetVariable__Group__0__Impl"
    // InternalEvoOperationDsl.g:1422:1: rule__EvoSetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__EvoSetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1426:1: ( ( 'set' ) )
            // InternalEvoOperationDsl.g:1427:1: ( 'set' )
            {
            // InternalEvoOperationDsl.g:1427:1: ( 'set' )
            // InternalEvoOperationDsl.g:1428:2: 'set'
            {
             before(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); 

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
    // $ANTLR end "rule__EvoSetVariable__Group__0__Impl"


    // $ANTLR start "rule__EvoSetVariable__Group__1"
    // InternalEvoOperationDsl.g:1437:1: rule__EvoSetVariable__Group__1 : rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 ;
    public final void rule__EvoSetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1441:1: ( rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 )
            // InternalEvoOperationDsl.g:1442:2: rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EvoSetVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group__2();

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
    // $ANTLR end "rule__EvoSetVariable__Group__1"


    // $ANTLR start "rule__EvoSetVariable__Group__1__Impl"
    // InternalEvoOperationDsl.g:1449:1: rule__EvoSetVariable__Group__1__Impl : ( ( rule__EvoSetVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoSetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1453:1: ( ( ( rule__EvoSetVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1454:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1454:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1455:2: ( rule__EvoSetVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1456:2: ( rule__EvoSetVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1456:3: rule__EvoSetVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EvoSetVariable__Group__1__Impl"


    // $ANTLR start "rule__EvoSetVariable__Group__2"
    // InternalEvoOperationDsl.g:1464:1: rule__EvoSetVariable__Group__2 : rule__EvoSetVariable__Group__2__Impl ;
    public final void rule__EvoSetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1468:1: ( rule__EvoSetVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:1469:2: rule__EvoSetVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group__2__Impl();

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
    // $ANTLR end "rule__EvoSetVariable__Group__2"


    // $ANTLR start "rule__EvoSetVariable__Group__2__Impl"
    // InternalEvoOperationDsl.g:1475:1: rule__EvoSetVariable__Group__2__Impl : ( ( rule__EvoSetVariable__Group_2__0 )? ) ;
    public final void rule__EvoSetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1479:1: ( ( ( rule__EvoSetVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:1480:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:1480:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:1481:2: ( rule__EvoSetVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:1482:2: ( rule__EvoSetVariable__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEvoOperationDsl.g:1482:3: rule__EvoSetVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoSetVariable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoSetVariableAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EvoSetVariable__Group__2__Impl"


    // $ANTLR start "rule__EvoSetVariable__Group_2__0"
    // InternalEvoOperationDsl.g:1491:1: rule__EvoSetVariable__Group_2__0 : rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 ;
    public final void rule__EvoSetVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1495:1: ( rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:1496:2: rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoSetVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group_2__1();

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
    // $ANTLR end "rule__EvoSetVariable__Group_2__0"


    // $ANTLR start "rule__EvoSetVariable__Group_2__0__Impl"
    // InternalEvoOperationDsl.g:1503:1: rule__EvoSetVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoSetVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1507:1: ( ( '(' ) )
            // InternalEvoOperationDsl.g:1508:1: ( '(' )
            {
            // InternalEvoOperationDsl.g:1508:1: ( '(' )
            // InternalEvoOperationDsl.g:1509:2: '('
            {
             before(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__EvoSetVariable__Group_2__0__Impl"


    // $ANTLR start "rule__EvoSetVariable__Group_2__1"
    // InternalEvoOperationDsl.g:1518:1: rule__EvoSetVariable__Group_2__1 : rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 ;
    public final void rule__EvoSetVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1522:1: ( rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 )
            // InternalEvoOperationDsl.g:1523:2: rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__EvoSetVariable__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group_2__2();

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
    // $ANTLR end "rule__EvoSetVariable__Group_2__1"


    // $ANTLR start "rule__EvoSetVariable__Group_2__1__Impl"
    // InternalEvoOperationDsl.g:1530:1: rule__EvoSetVariable__Group_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1534:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) )
            // InternalEvoOperationDsl.g:1535:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1535:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            // InternalEvoOperationDsl.g:1536:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); 
            // InternalEvoOperationDsl.g:1537:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            // InternalEvoOperationDsl.g:1537:3: rule__EvoSetVariable__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); 

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
    // $ANTLR end "rule__EvoSetVariable__Group_2__1__Impl"


    // $ANTLR start "rule__EvoSetVariable__Group_2__2"
    // InternalEvoOperationDsl.g:1545:1: rule__EvoSetVariable__Group_2__2 : rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 ;
    public final void rule__EvoSetVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1549:1: ( rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 )
            // InternalEvoOperationDsl.g:1550:2: rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3
            {
            pushFollow(FOLLOW_22);
            rule__EvoSetVariable__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group_2__3();

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
    // $ANTLR end "rule__EvoSetVariable__Group_2__2"


    // $ANTLR start "rule__EvoSetVariable__Group_2__2__Impl"
    // InternalEvoOperationDsl.g:1557:1: rule__EvoSetVariable__Group_2__2__Impl : ( ( rule__EvoSetVariable__Group_2_2__0 ) ) ;
    public final void rule__EvoSetVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1561:1: ( ( ( rule__EvoSetVariable__Group_2_2__0 ) ) )
            // InternalEvoOperationDsl.g:1562:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            {
            // InternalEvoOperationDsl.g:1562:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            // InternalEvoOperationDsl.g:1563:2: ( rule__EvoSetVariable__Group_2_2__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); 
            // InternalEvoOperationDsl.g:1564:2: ( rule__EvoSetVariable__Group_2_2__0 )
            // InternalEvoOperationDsl.g:1564:3: rule__EvoSetVariable__Group_2_2__0
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group_2_2__0();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__EvoSetVariable__Group_2__2__Impl"


    // $ANTLR start "rule__EvoSetVariable__Group_2__3"
    // InternalEvoOperationDsl.g:1572:1: rule__EvoSetVariable__Group_2__3 : rule__EvoSetVariable__Group_2__3__Impl ;
    public final void rule__EvoSetVariable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1576:1: ( rule__EvoSetVariable__Group_2__3__Impl )
            // InternalEvoOperationDsl.g:1577:2: rule__EvoSetVariable__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group_2__3__Impl();

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
    // $ANTLR end "rule__EvoSetVariable__Group_2__3"


    // $ANTLR start "rule__EvoSetVariable__Group_2__3__Impl"
    // InternalEvoOperationDsl.g:1583:1: rule__EvoSetVariable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EvoSetVariable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1587:1: ( ( ')' ) )
            // InternalEvoOperationDsl.g:1588:1: ( ')' )
            {
            // InternalEvoOperationDsl.g:1588:1: ( ')' )
            // InternalEvoOperationDsl.g:1589:2: ')'
            {
             before(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__EvoSetVariable__Group_2__3__Impl"


    // $ANTLR start "rule__EvoSetVariable__Group_2_2__0"
    // InternalEvoOperationDsl.g:1599:1: rule__EvoSetVariable__Group_2_2__0 : rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 ;
    public final void rule__EvoSetVariable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1603:1: ( rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 )
            // InternalEvoOperationDsl.g:1604:2: rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoSetVariable__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group_2_2__1();

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
    // $ANTLR end "rule__EvoSetVariable__Group_2_2__0"


    // $ANTLR start "rule__EvoSetVariable__Group_2_2__0__Impl"
    // InternalEvoOperationDsl.g:1611:1: rule__EvoSetVariable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EvoSetVariable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1615:1: ( ( ',' ) )
            // InternalEvoOperationDsl.g:1616:1: ( ',' )
            {
            // InternalEvoOperationDsl.g:1616:1: ( ',' )
            // InternalEvoOperationDsl.g:1617:2: ','
            {
             before(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__EvoSetVariable__Group_2_2__0__Impl"


    // $ANTLR start "rule__EvoSetVariable__Group_2_2__1"
    // InternalEvoOperationDsl.g:1626:1: rule__EvoSetVariable__Group_2_2__1 : rule__EvoSetVariable__Group_2_2__1__Impl ;
    public final void rule__EvoSetVariable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1630:1: ( rule__EvoSetVariable__Group_2_2__1__Impl )
            // InternalEvoOperationDsl.g:1631:2: rule__EvoSetVariable__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__EvoSetVariable__Group_2_2__1"


    // $ANTLR start "rule__EvoSetVariable__Group_2_2__1__Impl"
    // InternalEvoOperationDsl.g:1637:1: rule__EvoSetVariable__Group_2_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1641:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) )
            // InternalEvoOperationDsl.g:1642:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1642:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            // InternalEvoOperationDsl.g:1643:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); 
            // InternalEvoOperationDsl.g:1644:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            // InternalEvoOperationDsl.g:1644:3: rule__EvoSetVariable__ElementsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoSetVariable__ElementsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__EvoSetVariable__Group_2_2__1__Impl"


    // $ANTLR start "rule__EvoMappingVariable__Group__0"
    // InternalEvoOperationDsl.g:1653:1: rule__EvoMappingVariable__Group__0 : rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 ;
    public final void rule__EvoMappingVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1657:1: ( rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 )
            // InternalEvoOperationDsl.g:1658:2: rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoMappingVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__Group__1();

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
    // $ANTLR end "rule__EvoMappingVariable__Group__0"


    // $ANTLR start "rule__EvoMappingVariable__Group__0__Impl"
    // InternalEvoOperationDsl.g:1665:1: rule__EvoMappingVariable__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__EvoMappingVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1669:1: ( ( 'mapping' ) )
            // InternalEvoOperationDsl.g:1670:1: ( 'mapping' )
            {
            // InternalEvoOperationDsl.g:1670:1: ( 'mapping' )
            // InternalEvoOperationDsl.g:1671:2: 'mapping'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); 

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
    // $ANTLR end "rule__EvoMappingVariable__Group__0__Impl"


    // $ANTLR start "rule__EvoMappingVariable__Group__1"
    // InternalEvoOperationDsl.g:1680:1: rule__EvoMappingVariable__Group__1 : rule__EvoMappingVariable__Group__1__Impl rule__EvoMappingVariable__Group__2 ;
    public final void rule__EvoMappingVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1684:1: ( rule__EvoMappingVariable__Group__1__Impl rule__EvoMappingVariable__Group__2 )
            // InternalEvoOperationDsl.g:1685:2: rule__EvoMappingVariable__Group__1__Impl rule__EvoMappingVariable__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EvoMappingVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__Group__2();

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
    // $ANTLR end "rule__EvoMappingVariable__Group__1"


    // $ANTLR start "rule__EvoMappingVariable__Group__1__Impl"
    // InternalEvoOperationDsl.g:1692:1: rule__EvoMappingVariable__Group__1__Impl : ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoMappingVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1696:1: ( ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1697:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1697:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1698:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1699:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1699:3: rule__EvoMappingVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EvoMappingVariable__Group__1__Impl"


    // $ANTLR start "rule__EvoMappingVariable__Group__2"
    // InternalEvoOperationDsl.g:1707:1: rule__EvoMappingVariable__Group__2 : rule__EvoMappingVariable__Group__2__Impl ;
    public final void rule__EvoMappingVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1711:1: ( rule__EvoMappingVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:1712:2: rule__EvoMappingVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__Group__2__Impl();

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
    // $ANTLR end "rule__EvoMappingVariable__Group__2"


    // $ANTLR start "rule__EvoMappingVariable__Group__2__Impl"
    // InternalEvoOperationDsl.g:1718:1: rule__EvoMappingVariable__Group__2__Impl : ( ( rule__EvoMappingVariable__Group_2__0 )? ) ;
    public final void rule__EvoMappingVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1722:1: ( ( ( rule__EvoMappingVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:1723:1: ( ( rule__EvoMappingVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:1723:1: ( ( rule__EvoMappingVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:1724:2: ( rule__EvoMappingVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoMappingVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:1725:2: ( rule__EvoMappingVariable__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEvoOperationDsl.g:1725:3: rule__EvoMappingVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoMappingVariable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoMappingVariableAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EvoMappingVariable__Group__2__Impl"


    // $ANTLR start "rule__EvoMappingVariable__Group_2__0"
    // InternalEvoOperationDsl.g:1734:1: rule__EvoMappingVariable__Group_2__0 : rule__EvoMappingVariable__Group_2__0__Impl rule__EvoMappingVariable__Group_2__1 ;
    public final void rule__EvoMappingVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1738:1: ( rule__EvoMappingVariable__Group_2__0__Impl rule__EvoMappingVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:1739:2: rule__EvoMappingVariable__Group_2__0__Impl rule__EvoMappingVariable__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__EvoMappingVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__Group_2__1();

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
    // $ANTLR end "rule__EvoMappingVariable__Group_2__0"


    // $ANTLR start "rule__EvoMappingVariable__Group_2__0__Impl"
    // InternalEvoOperationDsl.g:1746:1: rule__EvoMappingVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoMappingVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1750:1: ( ( '(' ) )
            // InternalEvoOperationDsl.g:1751:1: ( '(' )
            {
            // InternalEvoOperationDsl.g:1751:1: ( '(' )
            // InternalEvoOperationDsl.g:1752:2: '('
            {
             before(grammarAccess.getEvoMappingVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvoMappingVariableAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__EvoMappingVariable__Group_2__0__Impl"


    // $ANTLR start "rule__EvoMappingVariable__Group_2__1"
    // InternalEvoOperationDsl.g:1761:1: rule__EvoMappingVariable__Group_2__1 : rule__EvoMappingVariable__Group_2__1__Impl rule__EvoMappingVariable__Group_2__2 ;
    public final void rule__EvoMappingVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1765:1: ( rule__EvoMappingVariable__Group_2__1__Impl rule__EvoMappingVariable__Group_2__2 )
            // InternalEvoOperationDsl.g:1766:2: rule__EvoMappingVariable__Group_2__1__Impl rule__EvoMappingVariable__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__EvoMappingVariable__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__Group_2__2();

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
    // $ANTLR end "rule__EvoMappingVariable__Group_2__1"


    // $ANTLR start "rule__EvoMappingVariable__Group_2__1__Impl"
    // InternalEvoOperationDsl.g:1773:1: rule__EvoMappingVariable__Group_2__1__Impl : ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) ) ;
    public final void rule__EvoMappingVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1777:1: ( ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) ) )
            // InternalEvoOperationDsl.g:1778:1: ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1778:1: ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) )
            // InternalEvoOperationDsl.g:1779:2: ( rule__EvoMappingVariable__MappingAssignment_2_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingAssignment_2_1()); 
            // InternalEvoOperationDsl.g:1780:2: ( rule__EvoMappingVariable__MappingAssignment_2_1 )
            // InternalEvoOperationDsl.g:1780:3: rule__EvoMappingVariable__MappingAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__MappingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoMappingVariableAccess().getMappingAssignment_2_1()); 

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
    // $ANTLR end "rule__EvoMappingVariable__Group_2__1__Impl"


    // $ANTLR start "rule__EvoMappingVariable__Group_2__2"
    // InternalEvoOperationDsl.g:1788:1: rule__EvoMappingVariable__Group_2__2 : rule__EvoMappingVariable__Group_2__2__Impl ;
    public final void rule__EvoMappingVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1792:1: ( rule__EvoMappingVariable__Group_2__2__Impl )
            // InternalEvoOperationDsl.g:1793:2: rule__EvoMappingVariable__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoMappingVariable__Group_2__2__Impl();

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
    // $ANTLR end "rule__EvoMappingVariable__Group_2__2"


    // $ANTLR start "rule__EvoMappingVariable__Group_2__2__Impl"
    // InternalEvoOperationDsl.g:1799:1: rule__EvoMappingVariable__Group_2__2__Impl : ( ')' ) ;
    public final void rule__EvoMappingVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1803:1: ( ( ')' ) )
            // InternalEvoOperationDsl.g:1804:1: ( ')' )
            {
            // InternalEvoOperationDsl.g:1804:1: ( ')' )
            // InternalEvoOperationDsl.g:1805:2: ')'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getRightParenthesisKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvoMappingVariableAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__EvoMappingVariable__Group_2__2__Impl"


    // $ANTLR start "rule__EvoConfigurationVariable__Group__0"
    // InternalEvoOperationDsl.g:1815:1: rule__EvoConfigurationVariable__Group__0 : rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 ;
    public final void rule__EvoConfigurationVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1819:1: ( rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 )
            // InternalEvoOperationDsl.g:1820:2: rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EvoConfigurationVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__Group__1();

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group__0"


    // $ANTLR start "rule__EvoConfigurationVariable__Group__0__Impl"
    // InternalEvoOperationDsl.g:1827:1: rule__EvoConfigurationVariable__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__EvoConfigurationVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1831:1: ( ( 'configuration' ) )
            // InternalEvoOperationDsl.g:1832:1: ( 'configuration' )
            {
            // InternalEvoOperationDsl.g:1832:1: ( 'configuration' )
            // InternalEvoOperationDsl.g:1833:2: 'configuration'
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0()); 

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group__0__Impl"


    // $ANTLR start "rule__EvoConfigurationVariable__Group__1"
    // InternalEvoOperationDsl.g:1842:1: rule__EvoConfigurationVariable__Group__1 : rule__EvoConfigurationVariable__Group__1__Impl rule__EvoConfigurationVariable__Group__2 ;
    public final void rule__EvoConfigurationVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1846:1: ( rule__EvoConfigurationVariable__Group__1__Impl rule__EvoConfigurationVariable__Group__2 )
            // InternalEvoOperationDsl.g:1847:2: rule__EvoConfigurationVariable__Group__1__Impl rule__EvoConfigurationVariable__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EvoConfigurationVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__Group__2();

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group__1"


    // $ANTLR start "rule__EvoConfigurationVariable__Group__1__Impl"
    // InternalEvoOperationDsl.g:1854:1: rule__EvoConfigurationVariable__Group__1__Impl : ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoConfigurationVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1858:1: ( ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1859:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1859:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1860:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1861:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1861:3: rule__EvoConfigurationVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoConfigurationVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group__1__Impl"


    // $ANTLR start "rule__EvoConfigurationVariable__Group__2"
    // InternalEvoOperationDsl.g:1869:1: rule__EvoConfigurationVariable__Group__2 : rule__EvoConfigurationVariable__Group__2__Impl ;
    public final void rule__EvoConfigurationVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1873:1: ( rule__EvoConfigurationVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:1874:2: rule__EvoConfigurationVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__Group__2__Impl();

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group__2"


    // $ANTLR start "rule__EvoConfigurationVariable__Group__2__Impl"
    // InternalEvoOperationDsl.g:1880:1: rule__EvoConfigurationVariable__Group__2__Impl : ( ( rule__EvoConfigurationVariable__Group_2__0 )? ) ;
    public final void rule__EvoConfigurationVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1884:1: ( ( ( rule__EvoConfigurationVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:1885:1: ( ( rule__EvoConfigurationVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:1885:1: ( ( rule__EvoConfigurationVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:1886:2: ( rule__EvoConfigurationVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:1887:2: ( rule__EvoConfigurationVariable__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEvoOperationDsl.g:1887:3: rule__EvoConfigurationVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvoConfigurationVariable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvoConfigurationVariableAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group__2__Impl"


    // $ANTLR start "rule__EvoConfigurationVariable__Group_2__0"
    // InternalEvoOperationDsl.g:1896:1: rule__EvoConfigurationVariable__Group_2__0 : rule__EvoConfigurationVariable__Group_2__0__Impl rule__EvoConfigurationVariable__Group_2__1 ;
    public final void rule__EvoConfigurationVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1900:1: ( rule__EvoConfigurationVariable__Group_2__0__Impl rule__EvoConfigurationVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:1901:2: rule__EvoConfigurationVariable__Group_2__0__Impl rule__EvoConfigurationVariable__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__EvoConfigurationVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__Group_2__1();

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group_2__0"


    // $ANTLR start "rule__EvoConfigurationVariable__Group_2__0__Impl"
    // InternalEvoOperationDsl.g:1908:1: rule__EvoConfigurationVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoConfigurationVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1912:1: ( ( '(' ) )
            // InternalEvoOperationDsl.g:1913:1: ( '(' )
            {
            // InternalEvoOperationDsl.g:1913:1: ( '(' )
            // InternalEvoOperationDsl.g:1914:2: '('
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvoConfigurationVariableAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group_2__0__Impl"


    // $ANTLR start "rule__EvoConfigurationVariable__Group_2__1"
    // InternalEvoOperationDsl.g:1923:1: rule__EvoConfigurationVariable__Group_2__1 : rule__EvoConfigurationVariable__Group_2__1__Impl rule__EvoConfigurationVariable__Group_2__2 ;
    public final void rule__EvoConfigurationVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1927:1: ( rule__EvoConfigurationVariable__Group_2__1__Impl rule__EvoConfigurationVariable__Group_2__2 )
            // InternalEvoOperationDsl.g:1928:2: rule__EvoConfigurationVariable__Group_2__1__Impl rule__EvoConfigurationVariable__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__EvoConfigurationVariable__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__Group_2__2();

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group_2__1"


    // $ANTLR start "rule__EvoConfigurationVariable__Group_2__1__Impl"
    // InternalEvoOperationDsl.g:1935:1: rule__EvoConfigurationVariable__Group_2__1__Impl : ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) ) ;
    public final void rule__EvoConfigurationVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1939:1: ( ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) ) )
            // InternalEvoOperationDsl.g:1940:1: ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1940:1: ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) )
            // InternalEvoOperationDsl.g:1941:2: ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationAssignment_2_1()); 
            // InternalEvoOperationDsl.g:1942:2: ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 )
            // InternalEvoOperationDsl.g:1942:3: rule__EvoConfigurationVariable__ConfigurationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__ConfigurationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationAssignment_2_1()); 

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group_2__1__Impl"


    // $ANTLR start "rule__EvoConfigurationVariable__Group_2__2"
    // InternalEvoOperationDsl.g:1950:1: rule__EvoConfigurationVariable__Group_2__2 : rule__EvoConfigurationVariable__Group_2__2__Impl ;
    public final void rule__EvoConfigurationVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1954:1: ( rule__EvoConfigurationVariable__Group_2__2__Impl )
            // InternalEvoOperationDsl.g:1955:2: rule__EvoConfigurationVariable__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoConfigurationVariable__Group_2__2__Impl();

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group_2__2"


    // $ANTLR start "rule__EvoConfigurationVariable__Group_2__2__Impl"
    // InternalEvoOperationDsl.g:1961:1: rule__EvoConfigurationVariable__Group_2__2__Impl : ( ')' ) ;
    public final void rule__EvoConfigurationVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1965:1: ( ( ')' ) )
            // InternalEvoOperationDsl.g:1966:1: ( ')' )
            {
            // InternalEvoOperationDsl.g:1966:1: ( ')' )
            // InternalEvoOperationDsl.g:1967:2: ')'
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getRightParenthesisKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvoConfigurationVariableAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__EvoConfigurationVariable__Group_2__2__Impl"


    // $ANTLR start "rule__GrammarEntry__ContainerAssignment"
    // InternalEvoOperationDsl.g:1977:1: rule__GrammarEntry__ContainerAssignment : ( ruleEvoOperationContainer ) ;
    public final void rule__GrammarEntry__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1981:1: ( ( ruleEvoOperationContainer ) )
            // InternalEvoOperationDsl.g:1982:2: ( ruleEvoOperationContainer )
            {
            // InternalEvoOperationDsl.g:1982:2: ( ruleEvoOperationContainer )
            // InternalEvoOperationDsl.g:1983:3: ruleEvoOperationContainer
            {
             before(grammarAccess.getGrammarEntryAccess().getContainerEvoOperationContainerParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoOperationContainer();

            state._fsp--;

             after(grammarAccess.getGrammarEntryAccess().getContainerEvoOperationContainerParserRuleCall_0()); 

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
    // $ANTLR end "rule__GrammarEntry__ContainerAssignment"


    // $ANTLR start "rule__EvoOperationContainer__OperationsAssignment_0"
    // InternalEvoOperationDsl.g:1992:1: rule__EvoOperationContainer__OperationsAssignment_0 : ( ruleEvoOperation ) ;
    public final void rule__EvoOperationContainer__OperationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1996:1: ( ( ruleEvoOperation ) )
            // InternalEvoOperationDsl.g:1997:2: ( ruleEvoOperation )
            {
            // InternalEvoOperationDsl.g:1997:2: ( ruleEvoOperation )
            // InternalEvoOperationDsl.g:1998:3: ruleEvoOperation
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsEvoOperationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoOperation();

            state._fsp--;

             after(grammarAccess.getEvoOperationContainerAccess().getOperationsEvoOperationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EvoOperationContainer__OperationsAssignment_0"


    // $ANTLR start "rule__EvoOperationContainer__OperationsAssignment_1"
    // InternalEvoOperationDsl.g:2007:1: rule__EvoOperationContainer__OperationsAssignment_1 : ( ruleEvoOperation ) ;
    public final void rule__EvoOperationContainer__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2011:1: ( ( ruleEvoOperation ) )
            // InternalEvoOperationDsl.g:2012:2: ( ruleEvoOperation )
            {
            // InternalEvoOperationDsl.g:2012:2: ( ruleEvoOperation )
            // InternalEvoOperationDsl.g:2013:3: ruleEvoOperation
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsEvoOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoOperation();

            state._fsp--;

             after(grammarAccess.getEvoOperationContainerAccess().getOperationsEvoOperationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EvoOperationContainer__OperationsAssignment_1"


    // $ANTLR start "rule__EvoOperation__NameAssignment_1"
    // InternalEvoOperationDsl.g:2022:1: rule__EvoOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2026:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2027:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:2027:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:2028:3: RULE_ID
            {
             before(grammarAccess.getEvoOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EvoOperation__NameAssignment_1"


    // $ANTLR start "rule__EvoOperation__VariablesAssignment_5"
    // InternalEvoOperationDsl.g:2037:1: rule__EvoOperation__VariablesAssignment_5 : ( ruleEvoVariable ) ;
    public final void rule__EvoOperation__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2041:1: ( ( ruleEvoVariable ) )
            // InternalEvoOperationDsl.g:2042:2: ( ruleEvoVariable )
            {
            // InternalEvoOperationDsl.g:2042:2: ( ruleEvoVariable )
            // InternalEvoOperationDsl.g:2043:3: ruleEvoVariable
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__EvoOperation__VariablesAssignment_5"


    // $ANTLR start "rule__EvoOperation__VariablesAssignment_6_1"
    // InternalEvoOperationDsl.g:2052:1: rule__EvoOperation__VariablesAssignment_6_1 : ( ruleEvoVariable ) ;
    public final void rule__EvoOperation__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2056:1: ( ( ruleEvoVariable ) )
            // InternalEvoOperationDsl.g:2057:2: ( ruleEvoVariable )
            {
            // InternalEvoOperationDsl.g:2057:2: ( ruleEvoVariable )
            // InternalEvoOperationDsl.g:2058:3: ruleEvoVariable
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoVariable();

            state._fsp--;

             after(grammarAccess.getEvoOperationAccess().getVariablesEvoVariableParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__EvoOperation__VariablesAssignment_6_1"


    // $ANTLR start "rule__EvoOperation__DateAssignment_9_2"
    // InternalEvoOperationDsl.g:2067:1: rule__EvoOperation__DateAssignment_9_2 : ( RULE_DATE ) ;
    public final void rule__EvoOperation__DateAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2071:1: ( ( RULE_DATE ) )
            // InternalEvoOperationDsl.g:2072:2: ( RULE_DATE )
            {
            // InternalEvoOperationDsl.g:2072:2: ( RULE_DATE )
            // InternalEvoOperationDsl.g:2073:3: RULE_DATE
            {
             before(grammarAccess.getEvoOperationAccess().getDateDATETerminalRuleCall_9_2_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getEvoOperationAccess().getDateDATETerminalRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__EvoOperation__DateAssignment_9_2"


    // $ANTLR start "rule__EvoFeatureVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:2082:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2086:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2087:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:2087:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:2088:3: RULE_ID
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__NameAssignment_1"


    // $ANTLR start "rule__EvoFeatureVariable__RelationAssignment_2"
    // InternalEvoOperationDsl.g:2097:1: rule__EvoFeatureVariable__RelationAssignment_2 : ( ruleEvoFeatureRelation ) ;
    public final void rule__EvoFeatureVariable__RelationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2101:1: ( ( ruleEvoFeatureRelation ) )
            // InternalEvoOperationDsl.g:2102:2: ( ruleEvoFeatureRelation )
            {
            // InternalEvoOperationDsl.g:2102:2: ( ruleEvoFeatureRelation )
            // InternalEvoOperationDsl.g:2103:3: ruleEvoFeatureRelation
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getRelationEvoFeatureRelationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoFeatureRelation();

            state._fsp--;

             after(grammarAccess.getEvoFeatureVariableAccess().getRelationEvoFeatureRelationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__RelationAssignment_2"


    // $ANTLR start "rule__EvoFeatureVariable__FeatureAssignment_3_2"
    // InternalEvoOperationDsl.g:2112:1: rule__EvoFeatureVariable__FeatureAssignment_3_2 : ( ( RULE_STRING ) ) ;
    public final void rule__EvoFeatureVariable__FeatureAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2116:1: ( ( ( RULE_STRING ) ) )
            // InternalEvoOperationDsl.g:2117:2: ( ( RULE_STRING ) )
            {
            // InternalEvoOperationDsl.g:2117:2: ( ( RULE_STRING ) )
            // InternalEvoOperationDsl.g:2118:3: ( RULE_STRING )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureCrossReference_3_2_0()); 
            // InternalEvoOperationDsl.g:2119:3: ( RULE_STRING )
            // InternalEvoOperationDsl.g:2120:4: RULE_STRING
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureSTRINGTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureSTRINGTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getEvoFeatureVariableAccess().getFeatureHyFeatureCrossReference_3_2_0()); 

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
    // $ANTLR end "rule__EvoFeatureVariable__FeatureAssignment_3_2"


    // $ANTLR start "rule__EvoFeatureRelation__FeatureTypeAssignment_0"
    // InternalEvoOperationDsl.g:2131:1: rule__EvoFeatureRelation__FeatureTypeAssignment_0 : ( ruleEvoFeatureVariableType ) ;
    public final void rule__EvoFeatureRelation__FeatureTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2135:1: ( ( ruleEvoFeatureVariableType ) )
            // InternalEvoOperationDsl.g:2136:2: ( ruleEvoFeatureVariableType )
            {
            // InternalEvoOperationDsl.g:2136:2: ( ruleEvoFeatureVariableType )
            // InternalEvoOperationDsl.g:2137:3: ruleEvoFeatureVariableType
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvoFeatureVariableType();

            state._fsp--;

             after(grammarAccess.getEvoFeatureRelationAccess().getFeatureTypeEvoFeatureVariableTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__FeatureTypeAssignment_0"


    // $ANTLR start "rule__EvoFeatureRelation__RelatedFeaturesAssignment_2"
    // InternalEvoOperationDsl.g:2146:1: rule__EvoFeatureRelation__RelatedFeaturesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EvoFeatureRelation__RelatedFeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2150:1: ( ( ( RULE_ID ) ) )
            // InternalEvoOperationDsl.g:2151:2: ( ( RULE_ID ) )
            {
            // InternalEvoOperationDsl.g:2151:2: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2152:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_2_0()); 
            // InternalEvoOperationDsl.g:2153:3: ( RULE_ID )
            // InternalEvoOperationDsl.g:2154:4: RULE_ID
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_2_0()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__RelatedFeaturesAssignment_2"


    // $ANTLR start "rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1"
    // InternalEvoOperationDsl.g:2165:1: rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2169:1: ( ( ( RULE_ID ) ) )
            // InternalEvoOperationDsl.g:2170:2: ( ( RULE_ID ) )
            {
            // InternalEvoOperationDsl.g:2170:2: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2171:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_3_1_0()); 
            // InternalEvoOperationDsl.g:2172:3: ( RULE_ID )
            // InternalEvoOperationDsl.g:2173:4: RULE_ID
            {
             before(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEvoFeatureRelationAccess().getRelatedFeaturesEvoFeatureVariableCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__EvoFeatureRelation__RelatedFeaturesAssignment_3_1"


    // $ANTLR start "rule__EvoGroupVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:2184:1: rule__EvoGroupVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGroupVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2188:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2189:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:2189:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:2190:3: RULE_ID
            {
             before(grammarAccess.getEvoGroupVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoGroupVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EvoGroupVariable__NameAssignment_1"


    // $ANTLR start "rule__EvoGroupVariable__GroupAssignment_2_2"
    // InternalEvoOperationDsl.g:2199:1: rule__EvoGroupVariable__GroupAssignment_2_2 : ( ( RULE_STRING ) ) ;
    public final void rule__EvoGroupVariable__GroupAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2203:1: ( ( ( RULE_STRING ) ) )
            // InternalEvoOperationDsl.g:2204:2: ( ( RULE_STRING ) )
            {
            // InternalEvoOperationDsl.g:2204:2: ( ( RULE_STRING ) )
            // InternalEvoOperationDsl.g:2205:3: ( RULE_STRING )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupCrossReference_2_2_0()); 
            // InternalEvoOperationDsl.g:2206:3: ( RULE_STRING )
            // InternalEvoOperationDsl.g:2207:4: RULE_STRING
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupSTRINGTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupSTRINGTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupCrossReference_2_2_0()); 

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
    // $ANTLR end "rule__EvoGroupVariable__GroupAssignment_2_2"


    // $ANTLR start "rule__EvoSetVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:2218:1: rule__EvoSetVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoSetVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2222:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2223:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:2223:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:2224:3: RULE_ID
            {
             before(grammarAccess.getEvoSetVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoSetVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EvoSetVariable__NameAssignment_1"


    // $ANTLR start "rule__EvoSetVariable__ElementsAssignment_2_1"
    // InternalEvoOperationDsl.g:2233:1: rule__EvoSetVariable__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2237:1: ( ( ( RULE_ID ) ) )
            // InternalEvoOperationDsl.g:2238:2: ( ( RULE_ID ) )
            {
            // InternalEvoOperationDsl.g:2238:2: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2239:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); 
            // InternalEvoOperationDsl.g:2240:3: ( RULE_ID )
            // InternalEvoOperationDsl.g:2241:4: RULE_ID
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__EvoSetVariable__ElementsAssignment_2_1"


    // $ANTLR start "rule__EvoSetVariable__ElementsAssignment_2_2_1"
    // InternalEvoOperationDsl.g:2252:1: rule__EvoSetVariable__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2256:1: ( ( ( RULE_ID ) ) )
            // InternalEvoOperationDsl.g:2257:2: ( ( RULE_ID ) )
            {
            // InternalEvoOperationDsl.g:2257:2: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2258:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); 
            // InternalEvoOperationDsl.g:2259:3: ( RULE_ID )
            // InternalEvoOperationDsl.g:2260:4: RULE_ID
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__EvoSetVariable__ElementsAssignment_2_2_1"


    // $ANTLR start "rule__EvoMappingVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:2271:1: rule__EvoMappingVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoMappingVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2275:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2276:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:2276:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:2277:3: RULE_ID
            {
             before(grammarAccess.getEvoMappingVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoMappingVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EvoMappingVariable__NameAssignment_1"


    // $ANTLR start "rule__EvoMappingVariable__MappingAssignment_2_1"
    // InternalEvoOperationDsl.g:2286:1: rule__EvoMappingVariable__MappingAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EvoMappingVariable__MappingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2290:1: ( ( RULE_STRING ) )
            // InternalEvoOperationDsl.g:2291:2: ( RULE_STRING )
            {
            // InternalEvoOperationDsl.g:2291:2: ( RULE_STRING )
            // InternalEvoOperationDsl.g:2292:3: RULE_STRING
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvoMappingVariableAccess().getMappingSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__EvoMappingVariable__MappingAssignment_2_1"


    // $ANTLR start "rule__EvoConfigurationVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:2301:1: rule__EvoConfigurationVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoConfigurationVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2305:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:2306:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:2306:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:2307:3: RULE_ID
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvoConfigurationVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EvoConfigurationVariable__NameAssignment_1"


    // $ANTLR start "rule__EvoConfigurationVariable__ConfigurationAssignment_2_1"
    // InternalEvoOperationDsl.g:2316:1: rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EvoConfigurationVariable__ConfigurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:2320:1: ( ( RULE_STRING ) )
            // InternalEvoOperationDsl.g:2321:2: ( RULE_STRING )
            {
            // InternalEvoOperationDsl.g:2321:2: ( RULE_STRING )
            // InternalEvoOperationDsl.g:2322:3: RULE_STRING
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__EvoConfigurationVariable__ConfigurationAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000807000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});

}