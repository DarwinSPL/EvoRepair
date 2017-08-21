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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DATE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parentOf'", "'siblingOf'", "'childOf'", "'operation'", "'{'", "'variables'", "';'", "'}'", "'date'", "':'", "'feature'", "'group'", "'value'", "'='", "'set'", "'('", "')'", "','", "'mapping'", "'configuration'"
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


    // $ANTLR start "entryRuleEvoGroupVariable"
    // InternalEvoOperationDsl.g:178:1: entryRuleEvoGroupVariable : ruleEvoGroupVariable EOF ;
    public final void entryRuleEvoGroupVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:179:1: ( ruleEvoGroupVariable EOF )
            // InternalEvoOperationDsl.g:180:1: ruleEvoGroupVariable EOF
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
    // InternalEvoOperationDsl.g:187:1: ruleEvoGroupVariable : ( ( rule__EvoGroupVariable__Group__0 ) ) ;
    public final void ruleEvoGroupVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:191:2: ( ( ( rule__EvoGroupVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:192:2: ( ( rule__EvoGroupVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:192:2: ( ( rule__EvoGroupVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:193:3: ( rule__EvoGroupVariable__Group__0 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:194:3: ( rule__EvoGroupVariable__Group__0 )
            // InternalEvoOperationDsl.g:194:4: rule__EvoGroupVariable__Group__0
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
    // InternalEvoOperationDsl.g:203:1: entryRuleEvoSetVariable : ruleEvoSetVariable EOF ;
    public final void entryRuleEvoSetVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:204:1: ( ruleEvoSetVariable EOF )
            // InternalEvoOperationDsl.g:205:1: ruleEvoSetVariable EOF
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
    // InternalEvoOperationDsl.g:212:1: ruleEvoSetVariable : ( ( rule__EvoSetVariable__Group__0 ) ) ;
    public final void ruleEvoSetVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:216:2: ( ( ( rule__EvoSetVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:217:2: ( ( rule__EvoSetVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:217:2: ( ( rule__EvoSetVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:218:3: ( rule__EvoSetVariable__Group__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:219:3: ( rule__EvoSetVariable__Group__0 )
            // InternalEvoOperationDsl.g:219:4: rule__EvoSetVariable__Group__0
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
    // InternalEvoOperationDsl.g:228:1: entryRuleEvoMappingVariable : ruleEvoMappingVariable EOF ;
    public final void entryRuleEvoMappingVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:229:1: ( ruleEvoMappingVariable EOF )
            // InternalEvoOperationDsl.g:230:1: ruleEvoMappingVariable EOF
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
    // InternalEvoOperationDsl.g:237:1: ruleEvoMappingVariable : ( ( rule__EvoMappingVariable__Group__0 ) ) ;
    public final void ruleEvoMappingVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:241:2: ( ( ( rule__EvoMappingVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:242:2: ( ( rule__EvoMappingVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:242:2: ( ( rule__EvoMappingVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:243:3: ( rule__EvoMappingVariable__Group__0 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:244:3: ( rule__EvoMappingVariable__Group__0 )
            // InternalEvoOperationDsl.g:244:4: rule__EvoMappingVariable__Group__0
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
    // InternalEvoOperationDsl.g:253:1: entryRuleEvoConfigurationVariable : ruleEvoConfigurationVariable EOF ;
    public final void entryRuleEvoConfigurationVariable() throws RecognitionException {
        try {
            // InternalEvoOperationDsl.g:254:1: ( ruleEvoConfigurationVariable EOF )
            // InternalEvoOperationDsl.g:255:1: ruleEvoConfigurationVariable EOF
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
    // InternalEvoOperationDsl.g:262:1: ruleEvoConfigurationVariable : ( ( rule__EvoConfigurationVariable__Group__0 ) ) ;
    public final void ruleEvoConfigurationVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:266:2: ( ( ( rule__EvoConfigurationVariable__Group__0 ) ) )
            // InternalEvoOperationDsl.g:267:2: ( ( rule__EvoConfigurationVariable__Group__0 ) )
            {
            // InternalEvoOperationDsl.g:267:2: ( ( rule__EvoConfigurationVariable__Group__0 ) )
            // InternalEvoOperationDsl.g:268:3: ( rule__EvoConfigurationVariable__Group__0 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getGroup()); 
            // InternalEvoOperationDsl.g:269:3: ( rule__EvoConfigurationVariable__Group__0 )
            // InternalEvoOperationDsl.g:269:4: rule__EvoConfigurationVariable__Group__0
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
    // InternalEvoOperationDsl.g:278:1: ruleEvoFeatureVariableType : ( ( rule__EvoFeatureVariableType__Alternatives ) ) ;
    public final void ruleEvoFeatureVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:282:1: ( ( ( rule__EvoFeatureVariableType__Alternatives ) ) )
            // InternalEvoOperationDsl.g:283:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            {
            // InternalEvoOperationDsl.g:283:2: ( ( rule__EvoFeatureVariableType__Alternatives ) )
            // InternalEvoOperationDsl.g:284:3: ( rule__EvoFeatureVariableType__Alternatives )
            {
             before(grammarAccess.getEvoFeatureVariableTypeAccess().getAlternatives()); 
            // InternalEvoOperationDsl.g:285:3: ( rule__EvoFeatureVariableType__Alternatives )
            // InternalEvoOperationDsl.g:285:4: rule__EvoFeatureVariableType__Alternatives
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
    // InternalEvoOperationDsl.g:293:1: rule__EvoVariable__Alternatives : ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) );
    public final void rule__EvoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:297:1: ( ( ruleEvoConfigurationVariable ) | ( ruleEvoFeatureVariable ) | ( ruleEvoGroupVariable ) | ( ruleEvoSetVariable ) | ( ruleEvoMappingVariable ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 30:
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
                    // InternalEvoOperationDsl.g:298:2: ( ruleEvoConfigurationVariable )
                    {
                    // InternalEvoOperationDsl.g:298:2: ( ruleEvoConfigurationVariable )
                    // InternalEvoOperationDsl.g:299:3: ruleEvoConfigurationVariable
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
                    // InternalEvoOperationDsl.g:304:2: ( ruleEvoFeatureVariable )
                    {
                    // InternalEvoOperationDsl.g:304:2: ( ruleEvoFeatureVariable )
                    // InternalEvoOperationDsl.g:305:3: ruleEvoFeatureVariable
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
                    // InternalEvoOperationDsl.g:310:2: ( ruleEvoGroupVariable )
                    {
                    // InternalEvoOperationDsl.g:310:2: ( ruleEvoGroupVariable )
                    // InternalEvoOperationDsl.g:311:3: ruleEvoGroupVariable
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
                    // InternalEvoOperationDsl.g:316:2: ( ruleEvoSetVariable )
                    {
                    // InternalEvoOperationDsl.g:316:2: ( ruleEvoSetVariable )
                    // InternalEvoOperationDsl.g:317:3: ruleEvoSetVariable
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
                    // InternalEvoOperationDsl.g:322:2: ( ruleEvoMappingVariable )
                    {
                    // InternalEvoOperationDsl.g:322:2: ( ruleEvoMappingVariable )
                    // InternalEvoOperationDsl.g:323:3: ruleEvoMappingVariable
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
    // InternalEvoOperationDsl.g:332:1: rule__EvoFeatureVariableType__Alternatives : ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) );
    public final void rule__EvoFeatureVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:336:1: ( ( ( 'parentOf' ) ) | ( ( 'siblingOf' ) ) | ( ( 'childOf' ) ) )
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
                    // InternalEvoOperationDsl.g:337:2: ( ( 'parentOf' ) )
                    {
                    // InternalEvoOperationDsl.g:337:2: ( ( 'parentOf' ) )
                    // InternalEvoOperationDsl.g:338:3: ( 'parentOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 
                    // InternalEvoOperationDsl.g:339:3: ( 'parentOf' )
                    // InternalEvoOperationDsl.g:339:4: 'parentOf'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoParentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvoOperationDsl.g:343:2: ( ( 'siblingOf' ) )
                    {
                    // InternalEvoOperationDsl.g:343:2: ( ( 'siblingOf' ) )
                    // InternalEvoOperationDsl.g:344:3: ( 'siblingOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 
                    // InternalEvoOperationDsl.g:345:3: ( 'siblingOf' )
                    // InternalEvoOperationDsl.g:345:4: 'siblingOf'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoSiblingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEvoOperationDsl.g:349:2: ( ( 'childOf' ) )
                    {
                    // InternalEvoOperationDsl.g:349:2: ( ( 'childOf' ) )
                    // InternalEvoOperationDsl.g:350:3: ( 'childOf' )
                    {
                     before(grammarAccess.getEvoFeatureVariableTypeAccess().getEvoChildEnumLiteralDeclaration_2()); 
                    // InternalEvoOperationDsl.g:351:3: ( 'childOf' )
                    // InternalEvoOperationDsl.g:351:4: 'childOf'
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
    // InternalEvoOperationDsl.g:359:1: rule__EvoOperationContainer__Group__0 : rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1 ;
    public final void rule__EvoOperationContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:363:1: ( rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1 )
            // InternalEvoOperationDsl.g:364:2: rule__EvoOperationContainer__Group__0__Impl rule__EvoOperationContainer__Group__1
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
    // InternalEvoOperationDsl.g:371:1: rule__EvoOperationContainer__Group__0__Impl : ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) ) ;
    public final void rule__EvoOperationContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:375:1: ( ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) ) )
            // InternalEvoOperationDsl.g:376:1: ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) )
            {
            // InternalEvoOperationDsl.g:376:1: ( ( rule__EvoOperationContainer__OperationsAssignment_0 ) )
            // InternalEvoOperationDsl.g:377:2: ( rule__EvoOperationContainer__OperationsAssignment_0 )
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_0()); 
            // InternalEvoOperationDsl.g:378:2: ( rule__EvoOperationContainer__OperationsAssignment_0 )
            // InternalEvoOperationDsl.g:378:3: rule__EvoOperationContainer__OperationsAssignment_0
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
    // InternalEvoOperationDsl.g:386:1: rule__EvoOperationContainer__Group__1 : rule__EvoOperationContainer__Group__1__Impl ;
    public final void rule__EvoOperationContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:390:1: ( rule__EvoOperationContainer__Group__1__Impl )
            // InternalEvoOperationDsl.g:391:2: rule__EvoOperationContainer__Group__1__Impl
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
    // InternalEvoOperationDsl.g:397:1: rule__EvoOperationContainer__Group__1__Impl : ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* ) ;
    public final void rule__EvoOperationContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:401:1: ( ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* ) )
            // InternalEvoOperationDsl.g:402:1: ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* )
            {
            // InternalEvoOperationDsl.g:402:1: ( ( rule__EvoOperationContainer__OperationsAssignment_1 )* )
            // InternalEvoOperationDsl.g:403:2: ( rule__EvoOperationContainer__OperationsAssignment_1 )*
            {
             before(grammarAccess.getEvoOperationContainerAccess().getOperationsAssignment_1()); 
            // InternalEvoOperationDsl.g:404:2: ( rule__EvoOperationContainer__OperationsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:404:3: rule__EvoOperationContainer__OperationsAssignment_1
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
    // InternalEvoOperationDsl.g:413:1: rule__EvoOperation__Group__0 : rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1 ;
    public final void rule__EvoOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:417:1: ( rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1 )
            // InternalEvoOperationDsl.g:418:2: rule__EvoOperation__Group__0__Impl rule__EvoOperation__Group__1
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
    // InternalEvoOperationDsl.g:425:1: rule__EvoOperation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__EvoOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:429:1: ( ( 'operation' ) )
            // InternalEvoOperationDsl.g:430:1: ( 'operation' )
            {
            // InternalEvoOperationDsl.g:430:1: ( 'operation' )
            // InternalEvoOperationDsl.g:431:2: 'operation'
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
    // InternalEvoOperationDsl.g:440:1: rule__EvoOperation__Group__1 : rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2 ;
    public final void rule__EvoOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:444:1: ( rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2 )
            // InternalEvoOperationDsl.g:445:2: rule__EvoOperation__Group__1__Impl rule__EvoOperation__Group__2
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
    // InternalEvoOperationDsl.g:452:1: rule__EvoOperation__Group__1__Impl : ( ( rule__EvoOperation__NameAssignment_1 ) ) ;
    public final void rule__EvoOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:456:1: ( ( ( rule__EvoOperation__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:457:1: ( ( rule__EvoOperation__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:457:1: ( ( rule__EvoOperation__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:458:2: ( rule__EvoOperation__NameAssignment_1 )
            {
             before(grammarAccess.getEvoOperationAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:459:2: ( rule__EvoOperation__NameAssignment_1 )
            // InternalEvoOperationDsl.g:459:3: rule__EvoOperation__NameAssignment_1
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
    // InternalEvoOperationDsl.g:467:1: rule__EvoOperation__Group__2 : rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3 ;
    public final void rule__EvoOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:471:1: ( rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3 )
            // InternalEvoOperationDsl.g:472:2: rule__EvoOperation__Group__2__Impl rule__EvoOperation__Group__3
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
    // InternalEvoOperationDsl.g:479:1: rule__EvoOperation__Group__2__Impl : ( '{' ) ;
    public final void rule__EvoOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:483:1: ( ( '{' ) )
            // InternalEvoOperationDsl.g:484:1: ( '{' )
            {
            // InternalEvoOperationDsl.g:484:1: ( '{' )
            // InternalEvoOperationDsl.g:485:2: '{'
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
    // InternalEvoOperationDsl.g:494:1: rule__EvoOperation__Group__3 : rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4 ;
    public final void rule__EvoOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:498:1: ( rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4 )
            // InternalEvoOperationDsl.g:499:2: rule__EvoOperation__Group__3__Impl rule__EvoOperation__Group__4
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
    // InternalEvoOperationDsl.g:506:1: rule__EvoOperation__Group__3__Impl : ( 'variables' ) ;
    public final void rule__EvoOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:510:1: ( ( 'variables' ) )
            // InternalEvoOperationDsl.g:511:1: ( 'variables' )
            {
            // InternalEvoOperationDsl.g:511:1: ( 'variables' )
            // InternalEvoOperationDsl.g:512:2: 'variables'
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
    // InternalEvoOperationDsl.g:521:1: rule__EvoOperation__Group__4 : rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5 ;
    public final void rule__EvoOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:525:1: ( rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5 )
            // InternalEvoOperationDsl.g:526:2: rule__EvoOperation__Group__4__Impl rule__EvoOperation__Group__5
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
    // InternalEvoOperationDsl.g:533:1: rule__EvoOperation__Group__4__Impl : ( '{' ) ;
    public final void rule__EvoOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:537:1: ( ( '{' ) )
            // InternalEvoOperationDsl.g:538:1: ( '{' )
            {
            // InternalEvoOperationDsl.g:538:1: ( '{' )
            // InternalEvoOperationDsl.g:539:2: '{'
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
    // InternalEvoOperationDsl.g:548:1: rule__EvoOperation__Group__5 : rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6 ;
    public final void rule__EvoOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:552:1: ( rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6 )
            // InternalEvoOperationDsl.g:553:2: rule__EvoOperation__Group__5__Impl rule__EvoOperation__Group__6
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
    // InternalEvoOperationDsl.g:560:1: rule__EvoOperation__Group__5__Impl : ( ( rule__EvoOperation__VariablesAssignment_5 ) ) ;
    public final void rule__EvoOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:564:1: ( ( ( rule__EvoOperation__VariablesAssignment_5 ) ) )
            // InternalEvoOperationDsl.g:565:1: ( ( rule__EvoOperation__VariablesAssignment_5 ) )
            {
            // InternalEvoOperationDsl.g:565:1: ( ( rule__EvoOperation__VariablesAssignment_5 ) )
            // InternalEvoOperationDsl.g:566:2: ( rule__EvoOperation__VariablesAssignment_5 )
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesAssignment_5()); 
            // InternalEvoOperationDsl.g:567:2: ( rule__EvoOperation__VariablesAssignment_5 )
            // InternalEvoOperationDsl.g:567:3: rule__EvoOperation__VariablesAssignment_5
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
    // InternalEvoOperationDsl.g:575:1: rule__EvoOperation__Group__6 : rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7 ;
    public final void rule__EvoOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:579:1: ( rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7 )
            // InternalEvoOperationDsl.g:580:2: rule__EvoOperation__Group__6__Impl rule__EvoOperation__Group__7
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
    // InternalEvoOperationDsl.g:587:1: rule__EvoOperation__Group__6__Impl : ( ( rule__EvoOperation__Group_6__0 )* ) ;
    public final void rule__EvoOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:591:1: ( ( ( rule__EvoOperation__Group_6__0 )* ) )
            // InternalEvoOperationDsl.g:592:1: ( ( rule__EvoOperation__Group_6__0 )* )
            {
            // InternalEvoOperationDsl.g:592:1: ( ( rule__EvoOperation__Group_6__0 )* )
            // InternalEvoOperationDsl.g:593:2: ( rule__EvoOperation__Group_6__0 )*
            {
             before(grammarAccess.getEvoOperationAccess().getGroup_6()); 
            // InternalEvoOperationDsl.g:594:2: ( rule__EvoOperation__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>=22 && LA4_1<=23)||LA4_1==26||(LA4_1>=30 && LA4_1<=31)) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalEvoOperationDsl.g:594:3: rule__EvoOperation__Group_6__0
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
    // InternalEvoOperationDsl.g:602:1: rule__EvoOperation__Group__7 : rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8 ;
    public final void rule__EvoOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:606:1: ( rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8 )
            // InternalEvoOperationDsl.g:607:2: rule__EvoOperation__Group__7__Impl rule__EvoOperation__Group__8
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
    // InternalEvoOperationDsl.g:614:1: rule__EvoOperation__Group__7__Impl : ( ';' ) ;
    public final void rule__EvoOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:618:1: ( ( ';' ) )
            // InternalEvoOperationDsl.g:619:1: ( ';' )
            {
            // InternalEvoOperationDsl.g:619:1: ( ';' )
            // InternalEvoOperationDsl.g:620:2: ';'
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
    // InternalEvoOperationDsl.g:629:1: rule__EvoOperation__Group__8 : rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9 ;
    public final void rule__EvoOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:633:1: ( rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9 )
            // InternalEvoOperationDsl.g:634:2: rule__EvoOperation__Group__8__Impl rule__EvoOperation__Group__9
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
    // InternalEvoOperationDsl.g:641:1: rule__EvoOperation__Group__8__Impl : ( '}' ) ;
    public final void rule__EvoOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:645:1: ( ( '}' ) )
            // InternalEvoOperationDsl.g:646:1: ( '}' )
            {
            // InternalEvoOperationDsl.g:646:1: ( '}' )
            // InternalEvoOperationDsl.g:647:2: '}'
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
    // InternalEvoOperationDsl.g:656:1: rule__EvoOperation__Group__9 : rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10 ;
    public final void rule__EvoOperation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:660:1: ( rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10 )
            // InternalEvoOperationDsl.g:661:2: rule__EvoOperation__Group__9__Impl rule__EvoOperation__Group__10
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
    // InternalEvoOperationDsl.g:668:1: rule__EvoOperation__Group__9__Impl : ( ( rule__EvoOperation__Group_9__0 )? ) ;
    public final void rule__EvoOperation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:672:1: ( ( ( rule__EvoOperation__Group_9__0 )? ) )
            // InternalEvoOperationDsl.g:673:1: ( ( rule__EvoOperation__Group_9__0 )? )
            {
            // InternalEvoOperationDsl.g:673:1: ( ( rule__EvoOperation__Group_9__0 )? )
            // InternalEvoOperationDsl.g:674:2: ( rule__EvoOperation__Group_9__0 )?
            {
             before(grammarAccess.getEvoOperationAccess().getGroup_9()); 
            // InternalEvoOperationDsl.g:675:2: ( rule__EvoOperation__Group_9__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvoOperationDsl.g:675:3: rule__EvoOperation__Group_9__0
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
    // InternalEvoOperationDsl.g:683:1: rule__EvoOperation__Group__10 : rule__EvoOperation__Group__10__Impl ;
    public final void rule__EvoOperation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:687:1: ( rule__EvoOperation__Group__10__Impl )
            // InternalEvoOperationDsl.g:688:2: rule__EvoOperation__Group__10__Impl
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
    // InternalEvoOperationDsl.g:694:1: rule__EvoOperation__Group__10__Impl : ( '}' ) ;
    public final void rule__EvoOperation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:698:1: ( ( '}' ) )
            // InternalEvoOperationDsl.g:699:1: ( '}' )
            {
            // InternalEvoOperationDsl.g:699:1: ( '}' )
            // InternalEvoOperationDsl.g:700:2: '}'
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
    // InternalEvoOperationDsl.g:710:1: rule__EvoOperation__Group_6__0 : rule__EvoOperation__Group_6__0__Impl rule__EvoOperation__Group_6__1 ;
    public final void rule__EvoOperation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:714:1: ( rule__EvoOperation__Group_6__0__Impl rule__EvoOperation__Group_6__1 )
            // InternalEvoOperationDsl.g:715:2: rule__EvoOperation__Group_6__0__Impl rule__EvoOperation__Group_6__1
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
    // InternalEvoOperationDsl.g:722:1: rule__EvoOperation__Group_6__0__Impl : ( ';' ) ;
    public final void rule__EvoOperation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:726:1: ( ( ';' ) )
            // InternalEvoOperationDsl.g:727:1: ( ';' )
            {
            // InternalEvoOperationDsl.g:727:1: ( ';' )
            // InternalEvoOperationDsl.g:728:2: ';'
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
    // InternalEvoOperationDsl.g:737:1: rule__EvoOperation__Group_6__1 : rule__EvoOperation__Group_6__1__Impl ;
    public final void rule__EvoOperation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:741:1: ( rule__EvoOperation__Group_6__1__Impl )
            // InternalEvoOperationDsl.g:742:2: rule__EvoOperation__Group_6__1__Impl
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
    // InternalEvoOperationDsl.g:748:1: rule__EvoOperation__Group_6__1__Impl : ( ( rule__EvoOperation__VariablesAssignment_6_1 ) ) ;
    public final void rule__EvoOperation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:752:1: ( ( ( rule__EvoOperation__VariablesAssignment_6_1 ) ) )
            // InternalEvoOperationDsl.g:753:1: ( ( rule__EvoOperation__VariablesAssignment_6_1 ) )
            {
            // InternalEvoOperationDsl.g:753:1: ( ( rule__EvoOperation__VariablesAssignment_6_1 ) )
            // InternalEvoOperationDsl.g:754:2: ( rule__EvoOperation__VariablesAssignment_6_1 )
            {
             before(grammarAccess.getEvoOperationAccess().getVariablesAssignment_6_1()); 
            // InternalEvoOperationDsl.g:755:2: ( rule__EvoOperation__VariablesAssignment_6_1 )
            // InternalEvoOperationDsl.g:755:3: rule__EvoOperation__VariablesAssignment_6_1
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
    // InternalEvoOperationDsl.g:764:1: rule__EvoOperation__Group_9__0 : rule__EvoOperation__Group_9__0__Impl rule__EvoOperation__Group_9__1 ;
    public final void rule__EvoOperation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:768:1: ( rule__EvoOperation__Group_9__0__Impl rule__EvoOperation__Group_9__1 )
            // InternalEvoOperationDsl.g:769:2: rule__EvoOperation__Group_9__0__Impl rule__EvoOperation__Group_9__1
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
    // InternalEvoOperationDsl.g:776:1: rule__EvoOperation__Group_9__0__Impl : ( 'date' ) ;
    public final void rule__EvoOperation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:780:1: ( ( 'date' ) )
            // InternalEvoOperationDsl.g:781:1: ( 'date' )
            {
            // InternalEvoOperationDsl.g:781:1: ( 'date' )
            // InternalEvoOperationDsl.g:782:2: 'date'
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
    // InternalEvoOperationDsl.g:791:1: rule__EvoOperation__Group_9__1 : rule__EvoOperation__Group_9__1__Impl rule__EvoOperation__Group_9__2 ;
    public final void rule__EvoOperation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:795:1: ( rule__EvoOperation__Group_9__1__Impl rule__EvoOperation__Group_9__2 )
            // InternalEvoOperationDsl.g:796:2: rule__EvoOperation__Group_9__1__Impl rule__EvoOperation__Group_9__2
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
    // InternalEvoOperationDsl.g:803:1: rule__EvoOperation__Group_9__1__Impl : ( ':' ) ;
    public final void rule__EvoOperation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:807:1: ( ( ':' ) )
            // InternalEvoOperationDsl.g:808:1: ( ':' )
            {
            // InternalEvoOperationDsl.g:808:1: ( ':' )
            // InternalEvoOperationDsl.g:809:2: ':'
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
    // InternalEvoOperationDsl.g:818:1: rule__EvoOperation__Group_9__2 : rule__EvoOperation__Group_9__2__Impl ;
    public final void rule__EvoOperation__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:822:1: ( rule__EvoOperation__Group_9__2__Impl )
            // InternalEvoOperationDsl.g:823:2: rule__EvoOperation__Group_9__2__Impl
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
    // InternalEvoOperationDsl.g:829:1: rule__EvoOperation__Group_9__2__Impl : ( ( rule__EvoOperation__DateAssignment_9_2 ) ) ;
    public final void rule__EvoOperation__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:833:1: ( ( ( rule__EvoOperation__DateAssignment_9_2 ) ) )
            // InternalEvoOperationDsl.g:834:1: ( ( rule__EvoOperation__DateAssignment_9_2 ) )
            {
            // InternalEvoOperationDsl.g:834:1: ( ( rule__EvoOperation__DateAssignment_9_2 ) )
            // InternalEvoOperationDsl.g:835:2: ( rule__EvoOperation__DateAssignment_9_2 )
            {
             before(grammarAccess.getEvoOperationAccess().getDateAssignment_9_2()); 
            // InternalEvoOperationDsl.g:836:2: ( rule__EvoOperation__DateAssignment_9_2 )
            // InternalEvoOperationDsl.g:836:3: rule__EvoOperation__DateAssignment_9_2
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
    // InternalEvoOperationDsl.g:845:1: rule__EvoFeatureVariable__Group__0 : rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 ;
    public final void rule__EvoFeatureVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:849:1: ( rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1 )
            // InternalEvoOperationDsl.g:850:2: rule__EvoFeatureVariable__Group__0__Impl rule__EvoFeatureVariable__Group__1
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
    // InternalEvoOperationDsl.g:857:1: rule__EvoFeatureVariable__Group__0__Impl : ( 'feature' ) ;
    public final void rule__EvoFeatureVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:861:1: ( ( 'feature' ) )
            // InternalEvoOperationDsl.g:862:1: ( 'feature' )
            {
            // InternalEvoOperationDsl.g:862:1: ( 'feature' )
            // InternalEvoOperationDsl.g:863:2: 'feature'
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
    // InternalEvoOperationDsl.g:872:1: rule__EvoFeatureVariable__Group__1 : rule__EvoFeatureVariable__Group__1__Impl ;
    public final void rule__EvoFeatureVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:876:1: ( rule__EvoFeatureVariable__Group__1__Impl )
            // InternalEvoOperationDsl.g:877:2: rule__EvoFeatureVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvoFeatureVariable__Group__1__Impl();

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
    // InternalEvoOperationDsl.g:883:1: rule__EvoFeatureVariable__Group__1__Impl : ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoFeatureVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:887:1: ( ( ( rule__EvoFeatureVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:888:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:888:1: ( ( rule__EvoFeatureVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:889:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoFeatureVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:890:2: ( rule__EvoFeatureVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:890:3: rule__EvoFeatureVariable__NameAssignment_1
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


    // $ANTLR start "rule__EvoGroupVariable__Group__0"
    // InternalEvoOperationDsl.g:899:1: rule__EvoGroupVariable__Group__0 : rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 ;
    public final void rule__EvoGroupVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:903:1: ( rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1 )
            // InternalEvoOperationDsl.g:904:2: rule__EvoGroupVariable__Group__0__Impl rule__EvoGroupVariable__Group__1
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
    // InternalEvoOperationDsl.g:911:1: rule__EvoGroupVariable__Group__0__Impl : ( 'group' ) ;
    public final void rule__EvoGroupVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:915:1: ( ( 'group' ) )
            // InternalEvoOperationDsl.g:916:1: ( 'group' )
            {
            // InternalEvoOperationDsl.g:916:1: ( 'group' )
            // InternalEvoOperationDsl.g:917:2: 'group'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:926:1: rule__EvoGroupVariable__Group__1 : rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2 ;
    public final void rule__EvoGroupVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:930:1: ( rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2 )
            // InternalEvoOperationDsl.g:931:2: rule__EvoGroupVariable__Group__1__Impl rule__EvoGroupVariable__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalEvoOperationDsl.g:938:1: rule__EvoGroupVariable__Group__1__Impl : ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoGroupVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:942:1: ( ( ( rule__EvoGroupVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:943:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:943:1: ( ( rule__EvoGroupVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:944:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:945:2: ( rule__EvoGroupVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:945:3: rule__EvoGroupVariable__NameAssignment_1
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
    // InternalEvoOperationDsl.g:953:1: rule__EvoGroupVariable__Group__2 : rule__EvoGroupVariable__Group__2__Impl ;
    public final void rule__EvoGroupVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:957:1: ( rule__EvoGroupVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:958:2: rule__EvoGroupVariable__Group__2__Impl
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
    // InternalEvoOperationDsl.g:964:1: rule__EvoGroupVariable__Group__2__Impl : ( ( rule__EvoGroupVariable__Group_2__0 )? ) ;
    public final void rule__EvoGroupVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:968:1: ( ( ( rule__EvoGroupVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:969:1: ( ( rule__EvoGroupVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:969:1: ( ( rule__EvoGroupVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:970:2: ( rule__EvoGroupVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:971:2: ( rule__EvoGroupVariable__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvoOperationDsl.g:971:3: rule__EvoGroupVariable__Group_2__0
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
    // InternalEvoOperationDsl.g:980:1: rule__EvoGroupVariable__Group_2__0 : rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1 ;
    public final void rule__EvoGroupVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:984:1: ( rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:985:2: rule__EvoGroupVariable__Group_2__0__Impl rule__EvoGroupVariable__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalEvoOperationDsl.g:992:1: rule__EvoGroupVariable__Group_2__0__Impl : ( 'value' ) ;
    public final void rule__EvoGroupVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:996:1: ( ( 'value' ) )
            // InternalEvoOperationDsl.g:997:1: ( 'value' )
            {
            // InternalEvoOperationDsl.g:997:1: ( 'value' )
            // InternalEvoOperationDsl.g:998:2: 'value'
            {
             before(grammarAccess.getEvoGroupVariableAccess().getValueKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1007:1: rule__EvoGroupVariable__Group_2__1 : rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2 ;
    public final void rule__EvoGroupVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1011:1: ( rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2 )
            // InternalEvoOperationDsl.g:1012:2: rule__EvoGroupVariable__Group_2__1__Impl rule__EvoGroupVariable__Group_2__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalEvoOperationDsl.g:1019:1: rule__EvoGroupVariable__Group_2__1__Impl : ( '=' ) ;
    public final void rule__EvoGroupVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1023:1: ( ( '=' ) )
            // InternalEvoOperationDsl.g:1024:1: ( '=' )
            {
            // InternalEvoOperationDsl.g:1024:1: ( '=' )
            // InternalEvoOperationDsl.g:1025:2: '='
            {
             before(grammarAccess.getEvoGroupVariableAccess().getEqualsSignKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1034:1: rule__EvoGroupVariable__Group_2__2 : rule__EvoGroupVariable__Group_2__2__Impl ;
    public final void rule__EvoGroupVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1038:1: ( rule__EvoGroupVariable__Group_2__2__Impl )
            // InternalEvoOperationDsl.g:1039:2: rule__EvoGroupVariable__Group_2__2__Impl
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
    // InternalEvoOperationDsl.g:1045:1: rule__EvoGroupVariable__Group_2__2__Impl : ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) ) ;
    public final void rule__EvoGroupVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1049:1: ( ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) ) )
            // InternalEvoOperationDsl.g:1050:1: ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) )
            {
            // InternalEvoOperationDsl.g:1050:1: ( ( rule__EvoGroupVariable__GroupAssignment_2_2 ) )
            // InternalEvoOperationDsl.g:1051:2: ( rule__EvoGroupVariable__GroupAssignment_2_2 )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupAssignment_2_2()); 
            // InternalEvoOperationDsl.g:1052:2: ( rule__EvoGroupVariable__GroupAssignment_2_2 )
            // InternalEvoOperationDsl.g:1052:3: rule__EvoGroupVariable__GroupAssignment_2_2
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
    // InternalEvoOperationDsl.g:1061:1: rule__EvoSetVariable__Group__0 : rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 ;
    public final void rule__EvoSetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1065:1: ( rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1 )
            // InternalEvoOperationDsl.g:1066:2: rule__EvoSetVariable__Group__0__Impl rule__EvoSetVariable__Group__1
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
    // InternalEvoOperationDsl.g:1073:1: rule__EvoSetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__EvoSetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1077:1: ( ( 'set' ) )
            // InternalEvoOperationDsl.g:1078:1: ( 'set' )
            {
            // InternalEvoOperationDsl.g:1078:1: ( 'set' )
            // InternalEvoOperationDsl.g:1079:2: 'set'
            {
             before(grammarAccess.getEvoSetVariableAccess().getSetKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1088:1: rule__EvoSetVariable__Group__1 : rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 ;
    public final void rule__EvoSetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1092:1: ( rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2 )
            // InternalEvoOperationDsl.g:1093:2: rule__EvoSetVariable__Group__1__Impl rule__EvoSetVariable__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalEvoOperationDsl.g:1100:1: rule__EvoSetVariable__Group__1__Impl : ( ( rule__EvoSetVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoSetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1104:1: ( ( ( rule__EvoSetVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1105:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1105:1: ( ( rule__EvoSetVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1106:2: ( rule__EvoSetVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1107:2: ( rule__EvoSetVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1107:3: rule__EvoSetVariable__NameAssignment_1
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
    // InternalEvoOperationDsl.g:1115:1: rule__EvoSetVariable__Group__2 : rule__EvoSetVariable__Group__2__Impl ;
    public final void rule__EvoSetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1119:1: ( rule__EvoSetVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:1120:2: rule__EvoSetVariable__Group__2__Impl
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
    // InternalEvoOperationDsl.g:1126:1: rule__EvoSetVariable__Group__2__Impl : ( ( rule__EvoSetVariable__Group_2__0 )? ) ;
    public final void rule__EvoSetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1130:1: ( ( ( rule__EvoSetVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:1131:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:1131:1: ( ( rule__EvoSetVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:1132:2: ( rule__EvoSetVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:1133:2: ( rule__EvoSetVariable__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvoOperationDsl.g:1133:3: rule__EvoSetVariable__Group_2__0
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
    // InternalEvoOperationDsl.g:1142:1: rule__EvoSetVariable__Group_2__0 : rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 ;
    public final void rule__EvoSetVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1146:1: ( rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:1147:2: rule__EvoSetVariable__Group_2__0__Impl rule__EvoSetVariable__Group_2__1
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
    // InternalEvoOperationDsl.g:1154:1: rule__EvoSetVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoSetVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1158:1: ( ( '(' ) )
            // InternalEvoOperationDsl.g:1159:1: ( '(' )
            {
            // InternalEvoOperationDsl.g:1159:1: ( '(' )
            // InternalEvoOperationDsl.g:1160:2: '('
            {
             before(grammarAccess.getEvoSetVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1169:1: rule__EvoSetVariable__Group_2__1 : rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 ;
    public final void rule__EvoSetVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1173:1: ( rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2 )
            // InternalEvoOperationDsl.g:1174:2: rule__EvoSetVariable__Group_2__1__Impl rule__EvoSetVariable__Group_2__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalEvoOperationDsl.g:1181:1: rule__EvoSetVariable__Group_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1185:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) ) )
            // InternalEvoOperationDsl.g:1186:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1186:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_1 ) )
            // InternalEvoOperationDsl.g:1187:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_1()); 
            // InternalEvoOperationDsl.g:1188:2: ( rule__EvoSetVariable__ElementsAssignment_2_1 )
            // InternalEvoOperationDsl.g:1188:3: rule__EvoSetVariable__ElementsAssignment_2_1
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
    // InternalEvoOperationDsl.g:1196:1: rule__EvoSetVariable__Group_2__2 : rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 ;
    public final void rule__EvoSetVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1200:1: ( rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3 )
            // InternalEvoOperationDsl.g:1201:2: rule__EvoSetVariable__Group_2__2__Impl rule__EvoSetVariable__Group_2__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalEvoOperationDsl.g:1208:1: rule__EvoSetVariable__Group_2__2__Impl : ( ( rule__EvoSetVariable__Group_2_2__0 ) ) ;
    public final void rule__EvoSetVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1212:1: ( ( ( rule__EvoSetVariable__Group_2_2__0 ) ) )
            // InternalEvoOperationDsl.g:1213:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            {
            // InternalEvoOperationDsl.g:1213:1: ( ( rule__EvoSetVariable__Group_2_2__0 ) )
            // InternalEvoOperationDsl.g:1214:2: ( rule__EvoSetVariable__Group_2_2__0 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getGroup_2_2()); 
            // InternalEvoOperationDsl.g:1215:2: ( rule__EvoSetVariable__Group_2_2__0 )
            // InternalEvoOperationDsl.g:1215:3: rule__EvoSetVariable__Group_2_2__0
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
    // InternalEvoOperationDsl.g:1223:1: rule__EvoSetVariable__Group_2__3 : rule__EvoSetVariable__Group_2__3__Impl ;
    public final void rule__EvoSetVariable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1227:1: ( rule__EvoSetVariable__Group_2__3__Impl )
            // InternalEvoOperationDsl.g:1228:2: rule__EvoSetVariable__Group_2__3__Impl
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
    // InternalEvoOperationDsl.g:1234:1: rule__EvoSetVariable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__EvoSetVariable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1238:1: ( ( ')' ) )
            // InternalEvoOperationDsl.g:1239:1: ( ')' )
            {
            // InternalEvoOperationDsl.g:1239:1: ( ')' )
            // InternalEvoOperationDsl.g:1240:2: ')'
            {
             before(grammarAccess.getEvoSetVariableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1250:1: rule__EvoSetVariable__Group_2_2__0 : rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 ;
    public final void rule__EvoSetVariable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1254:1: ( rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1 )
            // InternalEvoOperationDsl.g:1255:2: rule__EvoSetVariable__Group_2_2__0__Impl rule__EvoSetVariable__Group_2_2__1
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
    // InternalEvoOperationDsl.g:1262:1: rule__EvoSetVariable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__EvoSetVariable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1266:1: ( ( ',' ) )
            // InternalEvoOperationDsl.g:1267:1: ( ',' )
            {
            // InternalEvoOperationDsl.g:1267:1: ( ',' )
            // InternalEvoOperationDsl.g:1268:2: ','
            {
             before(grammarAccess.getEvoSetVariableAccess().getCommaKeyword_2_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1277:1: rule__EvoSetVariable__Group_2_2__1 : rule__EvoSetVariable__Group_2_2__1__Impl ;
    public final void rule__EvoSetVariable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1281:1: ( rule__EvoSetVariable__Group_2_2__1__Impl )
            // InternalEvoOperationDsl.g:1282:2: rule__EvoSetVariable__Group_2_2__1__Impl
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
    // InternalEvoOperationDsl.g:1288:1: rule__EvoSetVariable__Group_2_2__1__Impl : ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__EvoSetVariable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1292:1: ( ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) ) )
            // InternalEvoOperationDsl.g:1293:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1293:1: ( ( rule__EvoSetVariable__ElementsAssignment_2_2_1 ) )
            // InternalEvoOperationDsl.g:1294:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsAssignment_2_2_1()); 
            // InternalEvoOperationDsl.g:1295:2: ( rule__EvoSetVariable__ElementsAssignment_2_2_1 )
            // InternalEvoOperationDsl.g:1295:3: rule__EvoSetVariable__ElementsAssignment_2_2_1
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
    // InternalEvoOperationDsl.g:1304:1: rule__EvoMappingVariable__Group__0 : rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 ;
    public final void rule__EvoMappingVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1308:1: ( rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1 )
            // InternalEvoOperationDsl.g:1309:2: rule__EvoMappingVariable__Group__0__Impl rule__EvoMappingVariable__Group__1
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
    // InternalEvoOperationDsl.g:1316:1: rule__EvoMappingVariable__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__EvoMappingVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1320:1: ( ( 'mapping' ) )
            // InternalEvoOperationDsl.g:1321:1: ( 'mapping' )
            {
            // InternalEvoOperationDsl.g:1321:1: ( 'mapping' )
            // InternalEvoOperationDsl.g:1322:2: 'mapping'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1331:1: rule__EvoMappingVariable__Group__1 : rule__EvoMappingVariable__Group__1__Impl rule__EvoMappingVariable__Group__2 ;
    public final void rule__EvoMappingVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1335:1: ( rule__EvoMappingVariable__Group__1__Impl rule__EvoMappingVariable__Group__2 )
            // InternalEvoOperationDsl.g:1336:2: rule__EvoMappingVariable__Group__1__Impl rule__EvoMappingVariable__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalEvoOperationDsl.g:1343:1: rule__EvoMappingVariable__Group__1__Impl : ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoMappingVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1347:1: ( ( ( rule__EvoMappingVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1348:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1348:1: ( ( rule__EvoMappingVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1349:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1350:2: ( rule__EvoMappingVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1350:3: rule__EvoMappingVariable__NameAssignment_1
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
    // InternalEvoOperationDsl.g:1358:1: rule__EvoMappingVariable__Group__2 : rule__EvoMappingVariable__Group__2__Impl ;
    public final void rule__EvoMappingVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1362:1: ( rule__EvoMappingVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:1363:2: rule__EvoMappingVariable__Group__2__Impl
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
    // InternalEvoOperationDsl.g:1369:1: rule__EvoMappingVariable__Group__2__Impl : ( ( rule__EvoMappingVariable__Group_2__0 )? ) ;
    public final void rule__EvoMappingVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1373:1: ( ( ( rule__EvoMappingVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:1374:1: ( ( rule__EvoMappingVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:1374:1: ( ( rule__EvoMappingVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:1375:2: ( rule__EvoMappingVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoMappingVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:1376:2: ( rule__EvoMappingVariable__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEvoOperationDsl.g:1376:3: rule__EvoMappingVariable__Group_2__0
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
    // InternalEvoOperationDsl.g:1385:1: rule__EvoMappingVariable__Group_2__0 : rule__EvoMappingVariable__Group_2__0__Impl rule__EvoMappingVariable__Group_2__1 ;
    public final void rule__EvoMappingVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1389:1: ( rule__EvoMappingVariable__Group_2__0__Impl rule__EvoMappingVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:1390:2: rule__EvoMappingVariable__Group_2__0__Impl rule__EvoMappingVariable__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalEvoOperationDsl.g:1397:1: rule__EvoMappingVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoMappingVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1401:1: ( ( '(' ) )
            // InternalEvoOperationDsl.g:1402:1: ( '(' )
            {
            // InternalEvoOperationDsl.g:1402:1: ( '(' )
            // InternalEvoOperationDsl.g:1403:2: '('
            {
             before(grammarAccess.getEvoMappingVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1412:1: rule__EvoMappingVariable__Group_2__1 : rule__EvoMappingVariable__Group_2__1__Impl rule__EvoMappingVariable__Group_2__2 ;
    public final void rule__EvoMappingVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1416:1: ( rule__EvoMappingVariable__Group_2__1__Impl rule__EvoMappingVariable__Group_2__2 )
            // InternalEvoOperationDsl.g:1417:2: rule__EvoMappingVariable__Group_2__1__Impl rule__EvoMappingVariable__Group_2__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalEvoOperationDsl.g:1424:1: rule__EvoMappingVariable__Group_2__1__Impl : ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) ) ;
    public final void rule__EvoMappingVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1428:1: ( ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) ) )
            // InternalEvoOperationDsl.g:1429:1: ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1429:1: ( ( rule__EvoMappingVariable__MappingAssignment_2_1 ) )
            // InternalEvoOperationDsl.g:1430:2: ( rule__EvoMappingVariable__MappingAssignment_2_1 )
            {
             before(grammarAccess.getEvoMappingVariableAccess().getMappingAssignment_2_1()); 
            // InternalEvoOperationDsl.g:1431:2: ( rule__EvoMappingVariable__MappingAssignment_2_1 )
            // InternalEvoOperationDsl.g:1431:3: rule__EvoMappingVariable__MappingAssignment_2_1
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
    // InternalEvoOperationDsl.g:1439:1: rule__EvoMappingVariable__Group_2__2 : rule__EvoMappingVariable__Group_2__2__Impl ;
    public final void rule__EvoMappingVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1443:1: ( rule__EvoMappingVariable__Group_2__2__Impl )
            // InternalEvoOperationDsl.g:1444:2: rule__EvoMappingVariable__Group_2__2__Impl
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
    // InternalEvoOperationDsl.g:1450:1: rule__EvoMappingVariable__Group_2__2__Impl : ( ')' ) ;
    public final void rule__EvoMappingVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1454:1: ( ( ')' ) )
            // InternalEvoOperationDsl.g:1455:1: ( ')' )
            {
            // InternalEvoOperationDsl.g:1455:1: ( ')' )
            // InternalEvoOperationDsl.g:1456:2: ')'
            {
             before(grammarAccess.getEvoMappingVariableAccess().getRightParenthesisKeyword_2_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1466:1: rule__EvoConfigurationVariable__Group__0 : rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 ;
    public final void rule__EvoConfigurationVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1470:1: ( rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1 )
            // InternalEvoOperationDsl.g:1471:2: rule__EvoConfigurationVariable__Group__0__Impl rule__EvoConfigurationVariable__Group__1
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
    // InternalEvoOperationDsl.g:1478:1: rule__EvoConfigurationVariable__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__EvoConfigurationVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1482:1: ( ( 'configuration' ) )
            // InternalEvoOperationDsl.g:1483:1: ( 'configuration' )
            {
            // InternalEvoOperationDsl.g:1483:1: ( 'configuration' )
            // InternalEvoOperationDsl.g:1484:2: 'configuration'
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1493:1: rule__EvoConfigurationVariable__Group__1 : rule__EvoConfigurationVariable__Group__1__Impl rule__EvoConfigurationVariable__Group__2 ;
    public final void rule__EvoConfigurationVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1497:1: ( rule__EvoConfigurationVariable__Group__1__Impl rule__EvoConfigurationVariable__Group__2 )
            // InternalEvoOperationDsl.g:1498:2: rule__EvoConfigurationVariable__Group__1__Impl rule__EvoConfigurationVariable__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalEvoOperationDsl.g:1505:1: rule__EvoConfigurationVariable__Group__1__Impl : ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) ;
    public final void rule__EvoConfigurationVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1509:1: ( ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) ) )
            // InternalEvoOperationDsl.g:1510:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            {
            // InternalEvoOperationDsl.g:1510:1: ( ( rule__EvoConfigurationVariable__NameAssignment_1 ) )
            // InternalEvoOperationDsl.g:1511:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getNameAssignment_1()); 
            // InternalEvoOperationDsl.g:1512:2: ( rule__EvoConfigurationVariable__NameAssignment_1 )
            // InternalEvoOperationDsl.g:1512:3: rule__EvoConfigurationVariable__NameAssignment_1
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
    // InternalEvoOperationDsl.g:1520:1: rule__EvoConfigurationVariable__Group__2 : rule__EvoConfigurationVariable__Group__2__Impl ;
    public final void rule__EvoConfigurationVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1524:1: ( rule__EvoConfigurationVariable__Group__2__Impl )
            // InternalEvoOperationDsl.g:1525:2: rule__EvoConfigurationVariable__Group__2__Impl
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
    // InternalEvoOperationDsl.g:1531:1: rule__EvoConfigurationVariable__Group__2__Impl : ( ( rule__EvoConfigurationVariable__Group_2__0 )? ) ;
    public final void rule__EvoConfigurationVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1535:1: ( ( ( rule__EvoConfigurationVariable__Group_2__0 )? ) )
            // InternalEvoOperationDsl.g:1536:1: ( ( rule__EvoConfigurationVariable__Group_2__0 )? )
            {
            // InternalEvoOperationDsl.g:1536:1: ( ( rule__EvoConfigurationVariable__Group_2__0 )? )
            // InternalEvoOperationDsl.g:1537:2: ( rule__EvoConfigurationVariable__Group_2__0 )?
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getGroup_2()); 
            // InternalEvoOperationDsl.g:1538:2: ( rule__EvoConfigurationVariable__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEvoOperationDsl.g:1538:3: rule__EvoConfigurationVariable__Group_2__0
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
    // InternalEvoOperationDsl.g:1547:1: rule__EvoConfigurationVariable__Group_2__0 : rule__EvoConfigurationVariable__Group_2__0__Impl rule__EvoConfigurationVariable__Group_2__1 ;
    public final void rule__EvoConfigurationVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1551:1: ( rule__EvoConfigurationVariable__Group_2__0__Impl rule__EvoConfigurationVariable__Group_2__1 )
            // InternalEvoOperationDsl.g:1552:2: rule__EvoConfigurationVariable__Group_2__0__Impl rule__EvoConfigurationVariable__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalEvoOperationDsl.g:1559:1: rule__EvoConfigurationVariable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EvoConfigurationVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1563:1: ( ( '(' ) )
            // InternalEvoOperationDsl.g:1564:1: ( '(' )
            {
            // InternalEvoOperationDsl.g:1564:1: ( '(' )
            // InternalEvoOperationDsl.g:1565:2: '('
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1574:1: rule__EvoConfigurationVariable__Group_2__1 : rule__EvoConfigurationVariable__Group_2__1__Impl rule__EvoConfigurationVariable__Group_2__2 ;
    public final void rule__EvoConfigurationVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1578:1: ( rule__EvoConfigurationVariable__Group_2__1__Impl rule__EvoConfigurationVariable__Group_2__2 )
            // InternalEvoOperationDsl.g:1579:2: rule__EvoConfigurationVariable__Group_2__1__Impl rule__EvoConfigurationVariable__Group_2__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalEvoOperationDsl.g:1586:1: rule__EvoConfigurationVariable__Group_2__1__Impl : ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) ) ;
    public final void rule__EvoConfigurationVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1590:1: ( ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) ) )
            // InternalEvoOperationDsl.g:1591:1: ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) )
            {
            // InternalEvoOperationDsl.g:1591:1: ( ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 ) )
            // InternalEvoOperationDsl.g:1592:2: ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 )
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getConfigurationAssignment_2_1()); 
            // InternalEvoOperationDsl.g:1593:2: ( rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 )
            // InternalEvoOperationDsl.g:1593:3: rule__EvoConfigurationVariable__ConfigurationAssignment_2_1
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
    // InternalEvoOperationDsl.g:1601:1: rule__EvoConfigurationVariable__Group_2__2 : rule__EvoConfigurationVariable__Group_2__2__Impl ;
    public final void rule__EvoConfigurationVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1605:1: ( rule__EvoConfigurationVariable__Group_2__2__Impl )
            // InternalEvoOperationDsl.g:1606:2: rule__EvoConfigurationVariable__Group_2__2__Impl
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
    // InternalEvoOperationDsl.g:1612:1: rule__EvoConfigurationVariable__Group_2__2__Impl : ( ')' ) ;
    public final void rule__EvoConfigurationVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1616:1: ( ( ')' ) )
            // InternalEvoOperationDsl.g:1617:1: ( ')' )
            {
            // InternalEvoOperationDsl.g:1617:1: ( ')' )
            // InternalEvoOperationDsl.g:1618:2: ')'
            {
             before(grammarAccess.getEvoConfigurationVariableAccess().getRightParenthesisKeyword_2_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEvoOperationDsl.g:1628:1: rule__GrammarEntry__ContainerAssignment : ( ruleEvoOperationContainer ) ;
    public final void rule__GrammarEntry__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1632:1: ( ( ruleEvoOperationContainer ) )
            // InternalEvoOperationDsl.g:1633:2: ( ruleEvoOperationContainer )
            {
            // InternalEvoOperationDsl.g:1633:2: ( ruleEvoOperationContainer )
            // InternalEvoOperationDsl.g:1634:3: ruleEvoOperationContainer
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
    // InternalEvoOperationDsl.g:1643:1: rule__EvoOperationContainer__OperationsAssignment_0 : ( ruleEvoOperation ) ;
    public final void rule__EvoOperationContainer__OperationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1647:1: ( ( ruleEvoOperation ) )
            // InternalEvoOperationDsl.g:1648:2: ( ruleEvoOperation )
            {
            // InternalEvoOperationDsl.g:1648:2: ( ruleEvoOperation )
            // InternalEvoOperationDsl.g:1649:3: ruleEvoOperation
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
    // InternalEvoOperationDsl.g:1658:1: rule__EvoOperationContainer__OperationsAssignment_1 : ( ruleEvoOperation ) ;
    public final void rule__EvoOperationContainer__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1662:1: ( ( ruleEvoOperation ) )
            // InternalEvoOperationDsl.g:1663:2: ( ruleEvoOperation )
            {
            // InternalEvoOperationDsl.g:1663:2: ( ruleEvoOperation )
            // InternalEvoOperationDsl.g:1664:3: ruleEvoOperation
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
    // InternalEvoOperationDsl.g:1673:1: rule__EvoOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1677:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1678:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1678:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1679:3: RULE_ID
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
    // InternalEvoOperationDsl.g:1688:1: rule__EvoOperation__VariablesAssignment_5 : ( ruleEvoVariable ) ;
    public final void rule__EvoOperation__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1692:1: ( ( ruleEvoVariable ) )
            // InternalEvoOperationDsl.g:1693:2: ( ruleEvoVariable )
            {
            // InternalEvoOperationDsl.g:1693:2: ( ruleEvoVariable )
            // InternalEvoOperationDsl.g:1694:3: ruleEvoVariable
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
    // InternalEvoOperationDsl.g:1703:1: rule__EvoOperation__VariablesAssignment_6_1 : ( ruleEvoVariable ) ;
    public final void rule__EvoOperation__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1707:1: ( ( ruleEvoVariable ) )
            // InternalEvoOperationDsl.g:1708:2: ( ruleEvoVariable )
            {
            // InternalEvoOperationDsl.g:1708:2: ( ruleEvoVariable )
            // InternalEvoOperationDsl.g:1709:3: ruleEvoVariable
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
    // InternalEvoOperationDsl.g:1718:1: rule__EvoOperation__DateAssignment_9_2 : ( RULE_DATE ) ;
    public final void rule__EvoOperation__DateAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1722:1: ( ( RULE_DATE ) )
            // InternalEvoOperationDsl.g:1723:2: ( RULE_DATE )
            {
            // InternalEvoOperationDsl.g:1723:2: ( RULE_DATE )
            // InternalEvoOperationDsl.g:1724:3: RULE_DATE
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
    // InternalEvoOperationDsl.g:1733:1: rule__EvoFeatureVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoFeatureVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1737:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1738:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1738:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1739:3: RULE_ID
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


    // $ANTLR start "rule__EvoGroupVariable__NameAssignment_1"
    // InternalEvoOperationDsl.g:1748:1: rule__EvoGroupVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoGroupVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1752:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1753:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1753:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1754:3: RULE_ID
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
    // InternalEvoOperationDsl.g:1763:1: rule__EvoGroupVariable__GroupAssignment_2_2 : ( ( RULE_STRING ) ) ;
    public final void rule__EvoGroupVariable__GroupAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1767:1: ( ( ( RULE_STRING ) ) )
            // InternalEvoOperationDsl.g:1768:2: ( ( RULE_STRING ) )
            {
            // InternalEvoOperationDsl.g:1768:2: ( ( RULE_STRING ) )
            // InternalEvoOperationDsl.g:1769:3: ( RULE_STRING )
            {
             before(grammarAccess.getEvoGroupVariableAccess().getGroupHyGroupCrossReference_2_2_0()); 
            // InternalEvoOperationDsl.g:1770:3: ( RULE_STRING )
            // InternalEvoOperationDsl.g:1771:4: RULE_STRING
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
    // InternalEvoOperationDsl.g:1782:1: rule__EvoSetVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoSetVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1786:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1787:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1787:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1788:3: RULE_ID
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
    // InternalEvoOperationDsl.g:1797:1: rule__EvoSetVariable__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1801:1: ( ( ( RULE_ID ) ) )
            // InternalEvoOperationDsl.g:1802:2: ( ( RULE_ID ) )
            {
            // InternalEvoOperationDsl.g:1802:2: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1803:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_1_0()); 
            // InternalEvoOperationDsl.g:1804:3: ( RULE_ID )
            // InternalEvoOperationDsl.g:1805:4: RULE_ID
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
    // InternalEvoOperationDsl.g:1816:1: rule__EvoSetVariable__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__EvoSetVariable__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1820:1: ( ( ( RULE_ID ) ) )
            // InternalEvoOperationDsl.g:1821:2: ( ( RULE_ID ) )
            {
            // InternalEvoOperationDsl.g:1821:2: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1822:3: ( RULE_ID )
            {
             before(grammarAccess.getEvoSetVariableAccess().getElementsEvoVariableCrossReference_2_2_1_0()); 
            // InternalEvoOperationDsl.g:1823:3: ( RULE_ID )
            // InternalEvoOperationDsl.g:1824:4: RULE_ID
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
    // InternalEvoOperationDsl.g:1835:1: rule__EvoMappingVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoMappingVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1839:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1840:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1840:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1841:3: RULE_ID
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
    // InternalEvoOperationDsl.g:1850:1: rule__EvoMappingVariable__MappingAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EvoMappingVariable__MappingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1854:1: ( ( RULE_STRING ) )
            // InternalEvoOperationDsl.g:1855:2: ( RULE_STRING )
            {
            // InternalEvoOperationDsl.g:1855:2: ( RULE_STRING )
            // InternalEvoOperationDsl.g:1856:3: RULE_STRING
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
    // InternalEvoOperationDsl.g:1865:1: rule__EvoConfigurationVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvoConfigurationVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1869:1: ( ( RULE_ID ) )
            // InternalEvoOperationDsl.g:1870:2: ( RULE_ID )
            {
            // InternalEvoOperationDsl.g:1870:2: ( RULE_ID )
            // InternalEvoOperationDsl.g:1871:3: RULE_ID
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
    // InternalEvoOperationDsl.g:1880:1: rule__EvoConfigurationVariable__ConfigurationAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EvoConfigurationVariable__ConfigurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvoOperationDsl.g:1884:1: ( ( RULE_STRING ) )
            // InternalEvoOperationDsl.g:1885:2: ( RULE_STRING )
            {
            // InternalEvoOperationDsl.g:1885:2: ( RULE_STRING )
            // InternalEvoOperationDsl.g:1886:3: RULE_STRING
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C4C00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});

}